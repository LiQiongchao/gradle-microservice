package com.yupoop.user.service;

import com.yupoop.bean.User;
import com.yupoop.user.feign.OrderFeignClient;
import com.yupoop.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Transactional(readOnly = true)
    public Map<String,Object> getUserInfo(Integer id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user", userMapper.getUserInfo(id));
        map.put("orderList", orderFeignClient.getOrderList(id));
       return map;
    }
}
