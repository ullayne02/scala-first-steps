package model;

import factories.HBaseFactory;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.Delete;
import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class ShoppingLogRepo {
    private final String productColumn = "product";
    private final String userColumn = "user";
    private final String familyColumn = "description";
    private final String tableName = "shopping";

    public void insert(ShoppingLog log) throws IOException {
        Table table = HBaseFactory.getConnection().getTable(TableName.valueOf(this.tableName));
        try {
            Put p = new Put(Bytes.toBytes(log.getRowKey()));

            p.addColumn(getBytes(this.productColumn), getBytes(this.familyColumn),
                    Bytes.toBytes(log.getProductInfo()));

            p.addColumn(getBytes(this.userColumn), getBytes(this.familyColumn),
                    getBytes(log.getUserInfo()));

            table.put(p);
        } finally {
            if (table != null) table.close();
        }
    }

    public String get(String key) throws IOException {
        Table table = HBaseFactory.getConnection().getTable(TableName.valueOf(this.tableName));
        try {
            Get g = new Get(getBytes(key));
            Result r = table.get(g);
            byte [] value = r.getValue(getBytes(this.productColumn),
                    getBytes(this.familyColumn));
            return Bytes.toString(value);
        } finally {
            if (table != null) table.close();
        }
    }

    public void delete(String key) throws IOException {
        Table table = HBaseFactory.getConnection().getTable(TableName.valueOf(this.tableName));
        try {
            table.delete(new Delete(getBytes(key)).addColumn(getBytes(this.productColumn), getBytes((this.familyColumn))));
        } finally {
            if (table != null) table.close();
        }
    }

    public byte[] getBytes(String attribute){
        return Bytes.toBytes(attribute);
    }
}
