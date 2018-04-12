package com.test.nick.random.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NICK on 2018/4/12.
 */

public class N_pick_m_thing extends DataSupport{
    private int id;
    private String npmName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNpmName() {
        return npmName;
    }

    public void setNpmName(String npmName) {
        this.npmName = npmName;
    }
}
