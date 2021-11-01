package service.Impl;

import bean.UserAddress;
import service.UserAddressService;

import java.util.Arrays;
import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 *    1、导入dubbo依赖\操作zookeepr的客户端
 *    2、配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * */
public class UserAddressServiceImpl implements UserAddressService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress address = new UserAddress(1,"陕西省宝鸡市","1","张三","12345678912","Y");
        UserAddress address1 = new UserAddress(2,"陕西省西安市","2","李四","12378945626","N");

        return Arrays.asList(address,address1);
    }
}
