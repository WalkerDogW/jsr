package site.javaee.jsr.service;

import site.javaee.jsr.bean.demo.User;

import javax.jws.WebService;

/**
 * Jax-rs示例
 * @author Tao
 * @create 2020/7/10 15:07
 */
@WebService
public interface UserService {


    public User getUser(String userId);
    public String getUserName(String userId);

}

