package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.dto.OrdersPageRequestDto;
import com.neusoft.tijaincms.po.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {
    //根据条件查询预约订单总行数
    public int getOrdersCount(OrdersPageRequestDto request);

    //根据条件查询预约订单列表
    public List<Orders> listOrders(OrdersPageRequestDto request);
}
