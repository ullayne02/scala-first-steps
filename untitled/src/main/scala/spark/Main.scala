package spark

import org.apache.hadoop.hbase.client.Result
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.mapreduce.TableInputFormat
import org.apache.hadoop.hbase.util.Bytes
import org.apache.spark.{SparkConf, SparkContext}
import spark.Factory.HBaseFactory

object Main {
  val appName = "ReadTable"
  val tableName = "shopping"
  def main(args: Array[String]) {

    val sparkConfig = new SparkConf().setAppName(appName).setMaster("local")
    val sc = new SparkContext(sparkConfig)

    val hBaseConfig = HBaseFactory.getConfiguration(tableName)
    val hBaseRDD = sc.newAPIHadoopRDD(hBaseConfig, classOf[TableInputFormat], classOf[ImmutableBytesWritable], classOf[Result])
    val columns = hBaseRDD.map(_._2)
    val doc = columns.map(result =>  (Bytes.toString(result.getValue(Bytes.toBytes("user"), Bytes.toBytes("description"))), Bytes.toString(result.getValue(Bytes.toBytes("product"), Bytes.toBytes("price"))).toDouble))
    val a = doc.groupByKey.mapValues(_.toList)
    val b = a.mapValues(_.sum)

    b.collect().foreach(println)
  }
}
