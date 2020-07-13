package site.javaee.jsr.bean.voucher;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * 档案类
 * @author Tao
 * @Date 2020/7/13
 * @Time 11:19
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Item {
    @XmlAttribute
    private String name;

    @XmlValue
    private String value;

}