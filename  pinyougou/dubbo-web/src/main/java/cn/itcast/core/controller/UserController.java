package cn.itcast.core.controller;

import cn.itcast.core.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 //这个注解包含了@Target(ElementType.TYPE)、@Retention(RetentionPolicy.RUNTIME)、@Documented、@Controller、@ResponseBody
@RestController     //主要就是同时包含了@Controller、@ResponseBody这两个注解
@RequestMapping("/user")
public class UserController {

    //注入service   把service单独提出来，新建一个service，保证路径一致
    @Reference
    private UserService userService;

    @RequestMapping("/showname.do")
    public String showName(){
        return userService.showName();
    }



}
