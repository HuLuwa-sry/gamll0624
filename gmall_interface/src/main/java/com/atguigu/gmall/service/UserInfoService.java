package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

/**
 * company: www.abc.com
 * Author: power
 * Create Data: 2019/12/4
 */
public interface UserInfoService {
    //查询全部
    List<UserInfo> selectAll();
    //根据用户id查询用户的收货地址列表
    List<UserAddress> findUserAddressByUserId(String userId);
}
