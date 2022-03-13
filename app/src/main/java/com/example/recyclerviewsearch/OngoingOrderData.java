package com.example.recyclerviewsearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OngoingOrderData {
    @SerializedName("tablename")
    @Expose
    private String tablename;
    @SerializedName("orderid")
    @Expose
    private String orderid;
    @SerializedName("waiter")
    @Expose
    private String waiter;
    @SerializedName("CustomerName")
    @Expose
    private String customerName;
    @SerializedName("before_time")
    @Expose
    private String beforeTime;
    @SerializedName("grandtotal")
    @Expose
    private Integer grandtotal;
    @SerializedName("split")
    @Expose
    private Integer split;

    public OngoingOrderData(String tablename, String orderid, String waiter, String customerName, String beforeTime, Integer grandtotal, Integer split) {
        this.tablename = tablename;
        this.orderid = orderid;
        this.waiter = waiter;
        this.customerName = customerName;
        this.beforeTime = beforeTime;
        this.grandtotal = grandtotal;
        this.split = split;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBeforeTime() {
        return beforeTime;
    }

    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }

    public Integer getGrandtotal() {
        return grandtotal;
    }

    public void setGrandtotal(Integer grandtotal) {
        this.grandtotal = grandtotal;
    }

    public Integer getSplit() {
        return split;
    }

    public void setSplit(Integer split) {
        this.split = split;
    }
}
