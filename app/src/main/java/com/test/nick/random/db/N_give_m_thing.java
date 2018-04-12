package com.test.nick.random.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NICK on 2018/4/12.
 */

public class N_give_m_thing extends DataSupport {
    private int id;
    private String ngmName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgmName() {
        return ngmName;
    }

    public void setNgmName(String ngmName) {
        this.ngmName = ngmName;
    }
}
