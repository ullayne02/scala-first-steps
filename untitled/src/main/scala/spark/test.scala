package spark

/*import org.apache.hadoop.hbase.CellUtil
import org.apache.hadoop.hbase.client.Scan
import org.apache.hadoop.hbase.util.Bytes
import spark.Main.{HbaseTable}

object test {
  val scan = new Scan()

  scan.addColumn(Bytes.toBytes("user"), Bytes.toBytes("description"))

  val scanner = HbaseTable.getScanner(scan)

  var resultValues: List[Map[String, String]] = List()

  scanner.asScala.foreach(result => {
    var resultMap: Map[String, String] = Map()
    val cells = result.rawCells()
    for(cell <- cells){
      val column_name = Bytes.toString(CellUtil.cloneQualifier(cell))
      //println("column name " ++ column_name)
      val columnValue =  Bytes.toString(CellUtil.cloneValue(cell))
      resultMap = resultMap ++ Map(column_name -> columnValue)
    }
    val resultList = List(resultMap)
    resultValues = resultValues ::: resultList
  })
}
*/