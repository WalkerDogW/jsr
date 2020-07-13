package site.javaee.jsr.config;


import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.javaee.jsr.service.UserService;

import javax.xml.ws.Endpoint;

/**
 * @author Tao
 * @create 2020/7/10 15:10
 */
@Configuration
public class CxfConfig {
    @Autowired
    private UserService userService;

    //* 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
    //     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/webservice/user?wsdl
    @Bean
    public ServletRegistrationBean<CXFServlet> myServlet(){
        ServletRegistrationBean<CXFServlet> registrationBean =new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/api/*");
        return registrationBean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean(name = "webServiceEndPoint")
    public Endpoint webServiceEndPoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService);
        endpoint.publish("/Userservice");
        return endpoint;
    }
    //如果有其余的服务，继续加


    @Bean("jsonProvider")
    public JacksonJsonProvider getJacksonJsonProvider(){
        return new JacksonJsonProvider();
    }
}
