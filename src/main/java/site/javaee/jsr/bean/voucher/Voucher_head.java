package site.javaee.jsr.bean.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 凭证头
 *
 * @author Tao
 * @Date 2020/7/13
 * @Time 10:00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"company","voucher_type","fiscal_year","accounting_period","voucher_id",
        "attachment_number","date","enter","voucher_making_system","pk_sourcepk","evidence_number"})
@Data
@NoArgsConstructor
public class Voucher_head {
    //公司目录 不能为空
    @NotNull
    private String company ;
    //凭证类别 不能为空
    @NotNull
    private String voucher_type ;
    //会计期间应与下面的制单日期一致(年)  不能为空
    @NotNull
    private int fiscal_year ;
    //期间(月)  不能为空
    @NotNull
    private String accounting_period;
    //凭证号 不能为空
    @NotNull
    private String voucher_id;
    //附件数 不能为空
    @NotNull
    private int attachment_number = 0;
    //制单日期 不能为空
    @NotNull
    private String date ;
    //制单人 不能为空
    @NotNull
    private String enter ;
    //来源系统 不能为空
    @NotNull
    private String voucher_making_system ;
    //折算来源凭证 不能为空
    @NotNull
    private String pk_sourcepk ;

    //单据编号
    private String evidence_number;

    public Voucher_head(@NotNull String company, @NotNull String voucher_type, @NotNull int fiscal_year, @NotNull String accounting_period, @NotNull String voucher_id, @NotNull int attachment_number, @NotNull String date, @NotNull String enter, @NotNull String voucher_making_system, @NotNull String pk_sourcepk, String evidence_number) {
        this.company = company;
        this.voucher_type = voucher_type;
        this.fiscal_year = fiscal_year;
        this.accounting_period = accounting_period;
        this.voucher_id = voucher_id;
        this.attachment_number = attachment_number;
        this.date = date;
        this.enter = enter;
        this.voucher_making_system = voucher_making_system;
        this.pk_sourcepk = pk_sourcepk;
        this.evidence_number = evidence_number;
    }



    public Voucher_head(String company, String voucher_type, int fiscal_year, String accounting_period, String voucher_id, int attachment_number, String date, String enter, String voucher_making_system, String pk_sourcepk) {
        this.company = company;
        this.voucher_type = voucher_type;
        this.fiscal_year = fiscal_year;
        this.accounting_period = accounting_period;
        this.voucher_id = voucher_id;
        this.attachment_number = attachment_number;
        this.date = date;
        this.enter = enter;
        this.voucher_making_system = voucher_making_system;
        this.pk_sourcepk = pk_sourcepk;
    }


}
