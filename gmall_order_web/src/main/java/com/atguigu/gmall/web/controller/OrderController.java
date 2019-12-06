package com.atguigu.gmall.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * company: www.abc.com
 * Author: power
 * Create Data: 2019/12/4
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Reference
    private UserInfoService userInfoService;
    @GetMapping("trade")
    public List<UserAddress> trade(String userId){
        //得到用户的收货地址列表
        return userInfoService.findUserAddressByUserId(userId);

    }
}
