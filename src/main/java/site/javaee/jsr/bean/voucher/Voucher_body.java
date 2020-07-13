package site.javaee.jsr.bean.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 凭证体
 * @author Tao
 * @Date 2020/7/13
 * @Time 10:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Voucher_body {
    //凭证细表
    private List<Entry> entry;


}
