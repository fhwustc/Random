package com.test.nick.random.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NICK on 2018/4/2.
 */

public class N_pick_1_thing extends DataSupport{
    private int id;
    private String np1Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNp1Name() {
        return np1Name;
    }

    public void setNp1Name(String np1Name) {
        this.np1Name = np1Name;
    }
}
