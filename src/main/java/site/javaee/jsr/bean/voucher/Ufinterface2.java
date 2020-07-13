package site.javaee.jsr.bean.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

/**
 * 凭证生成XML类
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ufinterface")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ufinterface2 {


    //指定导入NC系统的账套
    @XmlAttribute(name = "account")
    private String account;
    //指定xml文件的单据类型
    @XmlAttribute(name = "billtype")
    private String billtype = "gl";
    @XmlAttribute(name = "codeexchanged")
    private String codeexchanged = "y";
    @XmlAttribute(name = "isexchange")
    private String isexchange = "Y";
    @XmlAttribute(name = "operation")
    private String operation = "demo1";
    //对xml内容要做的操作（add新增 ，update更新，delete删除 ，query查询）
    @XmlAttribute(name = "proc")
    private String proc = "add";
    //定制数据的接收方
    @XmlAttribute(name = "receiver")
    private String receiver;
    @XmlAttribute(name = "replace")
    private String replace = "Y";
    @XmlAttribute(name = "roottag")
    private String roottag = "voucher";
    //设置外系统编码
    @XmlAttribute(name = "sender")
    private String sender = "BDS_U8c";




}
