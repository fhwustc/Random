package com.test.nick.random.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NICK on 2018/4/12.
 */

public class Random_sort_thing extends DataSupport {
    private int id;
    private String rsName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRsName() {
        return rsName;
    }

    public void setRsName(String rsName) {
        this.rsName = rsName;
    }
}
