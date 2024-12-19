package com.czdxwx.museumbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czdxwx.museumbackend.model.Users;
import com.czdxwx.museumbackend.service.UsersService;
import com.czdxwx.museumbackend.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 12265
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-12-19 22:28:15
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




