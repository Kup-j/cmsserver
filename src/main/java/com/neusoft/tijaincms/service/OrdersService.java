package com.neusoft.tijaincms.service;

import com.neusoft.tijaincms.dto.OrdersPageRequestDto;
import com.neusoft.tijaincms.dto.OrdersPageResponseDto;

public interface OrdersService {
    public  OrdersPageResponseDto listOrders(OrdersPageRequestDto request);

}
