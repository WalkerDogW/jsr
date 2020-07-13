package site.javaee.jsr.bean.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author Tao
 * @create 2020/7/11 10:53
 */
@XmlRootElement(name = "Student")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private char sex;
    private String address;
    private Integer age;
}
