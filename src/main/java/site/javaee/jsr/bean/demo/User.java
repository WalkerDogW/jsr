package site.javaee.jsr.bean.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Tao
 * @create 2020/7/10 15:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -3628469724795296287L;

    private String userId;
    private String userName;
    private String email;
}