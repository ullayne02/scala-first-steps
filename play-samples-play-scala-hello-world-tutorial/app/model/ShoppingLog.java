package model;

import factories.HBaseFactory;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class ShoppingLog {
    private String userInfo;
    private String productInfo;
    private String rowKey;


    public ShoppingLog(String userInfo, String productInfo, String rowKey) {
        this.userInfo = userInfo;
        this.productInfo = productInfo;
        this.rowKey = rowKey;
    }

    public String getRowKey(){
        return this.rowKey;
    }

    public String getProductInfo(){
        return this.productInfo;
    }

    public String getUserInfo(){
        return this.userInfo;
    }
}
