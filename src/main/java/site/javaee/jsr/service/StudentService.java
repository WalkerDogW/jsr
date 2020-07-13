package site.javaee.jsr.service;

import site.javaee.jsr.bean.demo.Student;

/**
 * Jax-rs 示例
 * @author Tao
 * @Date 2020/7/11
 * @Time 14:20
 */
public interface StudentService {
    public Student get(Integer id);
    public Student getXml(Integer id);
}
