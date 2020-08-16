package spark.Factory

import org.apache.spark.{SparkConf, SparkContext}

object SparkFactory {
  val appName = "ReadTable"
  val host = "local"
  def getConfiguration() = {
    val sparkConfig = new SparkConf().setAppName(this.appName).setMaster(this.host)
  }

  def getContext() = {
    new SparkContext(getConfiguration())
  }
}
