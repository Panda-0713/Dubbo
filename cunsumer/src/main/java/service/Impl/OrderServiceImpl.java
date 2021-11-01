package service.Impl;


import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserAddressService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserAddressService userAddressService;
    @Override
    public void initOrder(String userId) {
        System.out.println(userId);
        //查询用户地址信息
        List<UserAddress> userAddressList = userAddressService.getUserAddressList(userId);
        for (UserAddress address : userAddressList) {
            System.out.println(address);
        }
    }
}
