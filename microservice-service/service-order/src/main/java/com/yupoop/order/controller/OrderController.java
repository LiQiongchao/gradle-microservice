package com.yupoop.order.controller;

import com.yupoop.bean.OrderInfo;
import com.yupoop.bean.User;
import com.yupoop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/info/{id}")
    public List<OrderInfo> getOrderList(@PathVariable("id") Integer id){
        return orderService.getUserInfo(id);
    }
}
