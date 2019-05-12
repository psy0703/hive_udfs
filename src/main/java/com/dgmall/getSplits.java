package com.dgmall;

import org.apache.hadoop.hive.ql.exec.UDF;

public class getSplits extends UDF {

    public String evaluate(String str,int num) {

        String[] splits = str.split(",");
        String result = splits[num];
        return  result;
    }
}
