package factories;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

public class HBaseFactory {
    public static Connection getConnection() {
        try {
            Configuration config = HBaseConfiguration.create();
            return ConnectionFactory.createConnection(config);
        } catch (IOException e){
            System.out.println(e.toString());
        }
        return null;
    }
}
