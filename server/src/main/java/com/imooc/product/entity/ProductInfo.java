package com.imooc.product.entity;

public class ProductInfo {
    private Integer pId;

    private String pName;

    private Integer pState;

    private Double pPrice;

    private Integer pCount;

    private Double pTotal;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    public Double getpTotal() {
        return pTotal;
    }

    public void setpTotal(Double pTotal) {
        this.pTotal = pTotal;
    }
}