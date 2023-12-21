package com.yupoop.order.service;

import com.yupoop.bean.OrderInfo;
import com.yupoop.bean.User;
import com.yupoop.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(readOnly = true)
    public List<OrderInfo> getUserInfo(Integer uid) {
       return orderMapper.getOrderList(uid);
    }
}
