package com.open.sdk.studyoscommon.database;

import java.util.List;

public class DBTable {

    /**
     * 表所映射的对象名
     */
    private String tableObject;
    /**
     * 表在数据库中的名字
     */
    private String tableName;
    /**
     * 表所含的字段列表
     */
    private List<DBField> fieldList;

    public String getTableObject() {
        return tableObject;
    }

    public void setTableObject(String tableObject) {
        this.tableObject = tableObject;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<DBField> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<DBField> fieldList) {
        this.fieldList = fieldList;
    }
}
