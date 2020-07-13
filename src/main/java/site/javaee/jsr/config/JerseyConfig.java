package site.javaee.jsr.config;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * @author Tao
 * @create 2020/7/11 9:51
 */
@Component
@ApplicationPath("/rest/")   // 指定所有Endpoint的基础路径
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // 注册类的方式
        // egister(Demo.class);
        // 注册包的方式
        packages("site.javaee.jsr.service.impl");
        // 注册JSON转换器
        register(JacksonJsonProvider.class);

    }
}