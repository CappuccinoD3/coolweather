package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @所属包名称 : com.coolweather.android.db
 * @描述 :
 * @作者 :	wuzy
 * @COPYRIGHT : copyright(c) 2017,Rights Reserved
 * @版本 :	v1.0
 * @创建日期 :	2017/7/10
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
