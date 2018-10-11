package com.imooc.product.client.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ProductVo implements Serializable {
    @JsonProperty("pId")
    private Integer pIdVo;
    @JsonProperty("pName")
    private String pNameVo;
    @JsonProperty("pState")
    private Integer pStateVo;
    @JsonProperty("pPrice")
    private Double pPriceVo;
    @JsonProperty("pCount")
    private Integer pCountVo;
    @JsonProperty("pTotal")
    private Double pTotalVo;

    @Override
    public String toString() {
        return "ProductVo{" +
                "pIdVo=" + pIdVo +
                ", pNameVo='" + pNameVo + '\'' +
                ", pStateVo=" + pStateVo +
                ", pPriceVo=" + pPriceVo +
                ", pCountVo=" + pCountVo +
                ", pTotalVo=" + pTotalVo +
                '}';
    }

    public Integer getpIdVo() {
        return pIdVo;
    }

    public void setpIdVo(Integer pIdVo) {
        this.pIdVo = pIdVo;
    }

    public String getpNameVo() {
        return pNameVo;
    }

    public void setpNameVo(String pNameVo) {
        this.pNameVo = pNameVo;
    }

    public Integer getpStateVo() {
        return pStateVo;
    }

    public void setpStateVo(Integer pStateVo) {
        this.pStateVo = pStateVo;
    }

    public Double getpPriceVo() {
        return pPriceVo;
    }

    public void setpPriceVo(Double pPriceVo) {
        this.pPriceVo = pPriceVo;
    }

    public Integer getpCountVo() {
        return pCountVo;
    }

    public void setpCountVo(Integer pCountVo) {
        this.pCountVo = pCountVo;
    }

    public Double getpTotalVo() {
        return pTotalVo;
    }

    public void setpTotalVo(Double pTotalVo) {
        this.pTotalVo = pTotalVo;
    }
}
