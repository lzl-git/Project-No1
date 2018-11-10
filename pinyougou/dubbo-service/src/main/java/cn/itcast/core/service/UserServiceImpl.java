package cn.itcast.core.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service    //使用dubbo实现的注解
public class UserServiceImpl implements UserService {

    @Override
    public String showName() {
        return "hello dubbo";
    }
}
