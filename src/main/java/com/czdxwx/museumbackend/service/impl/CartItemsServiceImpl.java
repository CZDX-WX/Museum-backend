package com.czdxwx.museumbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czdxwx.museumbackend.model.CartItems;
import com.czdxwx.museumbackend.service.CartItemsService;
import com.czdxwx.museumbackend.mapper.CartItemsMapper;
import org.springframework.stereotype.Service;

/**
* @author 12265
* @description 针对表【cart_items】的数据库操作Service实现
* @createDate 2024-12-19 22:28:02
*/
@Service
public class CartItemsServiceImpl extends ServiceImpl<CartItemsMapper, CartItems>
    implements CartItemsService{

}




