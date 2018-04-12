package com.test.nick.random.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NICK on 2018/4/2.
 */

public class Random_object extends DataSupport {
    private int id;
    private String objectName;
    private int np1Id;
    private int npmId;
    private int rsId;
    private int ngmId;

    public int getNp1Id() {
        return np1Id;
    }

    public void setNp1Id(int np1Id) {
        this.np1Id = np1Id;
    }

    public int getNpmId() {
        return npmId;
    }

    public void setNpmId(int npmId) {
        this.npmId = npmId;
    }

    public int getRsId() {
        return rsId;
    }

    public void setRsId(int rsId) {
        this.rsId = rsId;
    }

    public int getNgmId() {
        return ngmId;
    }

    public void setNgmId(int ngmId) {
        this.ngmId = ngmId;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
