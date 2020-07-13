package site.javaee.jsr.service.Impl;

import org.springframework.stereotype.Component;
import site.javaee.jsr.bean.demo.User;
import site.javaee.jsr.service.UserService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.UUID;

/**
 * @author Tao
 * @create 2020/7/10 15:07
 */
@WebService(serviceName = "UserService",//对外发布的服务名
        targetNamespace = "http://service.jsr.javaee.sita",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface = "site.javaee.jsr.service.UserService")//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class UserServiceImpl implements UserService {

    @Override
    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    @WebResult(name = "userName", targetNamespace = "")
    public String getUserName(@WebParam(name = "userId") String userId) {
        return "userId为：" + userId;
    }

    @Override
    @WebMethod
    public User getUser(@WebParam(name = "userId") String userId) {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUserName("test1");
        user.setEmail("maplefix@163.xom");
        System.out.println(user);
        return user;
    }

    /*
    客户端调用
        UserService userService = new UserService_Service().getUserServiceImplPort();
        User user = userService.getUser("test1");
        String userName = userService.getUserName("1");
        System.out.println(user.getEmail()+"\t"+user.getUserId()+"\t"+user.getUserName());
        System.out.println(userName);
     */
}

