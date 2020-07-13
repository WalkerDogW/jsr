package site.javaee.jsr.service.Impl;

import org.springframework.stereotype.Component;
import site.javaee.jsr.bean.demo.Student;
import site.javaee.jsr.service.StudentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Tao
 * @Date 2020/7/11
 * @Time 14:21
 */
@Path("/student")
@Component
public class StudentServiceImpl implements StudentService {
    @GET
    @Path("/get/{id}")
    //@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON})
    @Override
    public Student get(@PathParam("id") Integer id) {
        return new Student(15, "jerry", '男', "广东省", 18);
    }


    @GET
    @Path("/getXml/{id}")
    @Produces({MediaType.APPLICATION_XML})
    @Override
    public Student getXml(@PathParam("id") Integer id) {
        return new Student(15, "jeny", '男', "广东省", 18);
    }

}
