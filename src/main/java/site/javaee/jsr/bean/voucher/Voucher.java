package site.javaee.jsr.bean.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

/**
 * 凭证类
 * @author Tao
 * @Date 2020/7/11
 * @Time 17:35
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"id","voucher_head","voucher_body"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voucher {

    //唯一标记
    @XmlAttribute(name = "id")
    private String id ;
    //凭证头
    private Voucher_head voucher_head;
    //凭证体
    private Voucher_body voucher_body;


}

