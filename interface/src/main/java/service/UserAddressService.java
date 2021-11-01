package service;

import bean.UserAddress;

import java.util.List;

/**
* 用户服务
* */
public interface UserAddressService {

    //按照用户id访问收货地址
    List<UserAddress> getUserAddressList(String userId);
}
