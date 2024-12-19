package com.czdxwx.museumbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czdxwx.museumbackend.model.Orders;
import com.czdxwx.museumbackend.service.OrdersService;
import com.czdxwx.museumbackend.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author 12265
* @description 针对表【orders】的数据库操作Service实现
* @createDate 2024-12-19 22:28:11
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




