package spark.Factory

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.mapreduce.TableInputFormat

object HBaseFactory {
  private val master = "hbase.master"
  private val host = "localhost:16030"

  def getConfiguration(inputTable: String) = {
    val config = HBaseConfiguration.create()
    config.set(this.master, this.host)
    config.set(TableInputFormat.INPUT_TABLE, inputTable)
    config.set(TableInputFormat.SCAN, "")
    config
  }
}
