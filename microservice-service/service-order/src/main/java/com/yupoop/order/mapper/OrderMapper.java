package com.yupoop.order.mapper;

import com.yupoop.bean.OrderInfo;
import com.yupoop.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;

import java.util.List;


public interface OrderMapper {

    @Select("select oid,uid,product_name productName from orderinfo where uid = #{uid}")
    public List<OrderInfo> getOrderList(Integer uid);
}
