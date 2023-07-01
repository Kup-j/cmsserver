package com.neusoft.tijaincms.dto;

import com.neusoft.tijaincms.po.Orders;

import java.util.List;

public class OrdersPageResponseDto {
    private Integer totalRow;//总行数
    private Integer totalPageNum;//总页数
    private Integer preNum;//上一页
    private Integer nextNum;//下一页
    private Integer pageNum;//当前页码
    private Integer maxPageNum;//每页最大行数
    private Integer beginNum;//开始查询记录数

    private List<Orders> List; //当前页的数据

    public Integer getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(Integer totalRow) {
        this.totalRow = totalRow;
    }

    public Integer getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public Integer getPreNum() {
        return preNum;
    }

    public void setPreNum(Integer preNum) {
        this.preNum = preNum;
    }

    public Integer getNextNum() {
        return nextNum;
    }

    public void setNextNum(Integer nextNum) {
        this.nextNum = nextNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getMaxPageNum() {
        return maxPageNum;
    }

    public void setMaxPageNum(Integer maxPageNum) {
        this.maxPageNum = maxPageNum;
    }

    public Integer getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(Integer beginNum) {
        this.beginNum = beginNum;
    }

    public java.util.List<Orders> getList() {
        return List;
    }

    public void setList(java.util.List<Orders> list) {
        List = list;
    }
}
