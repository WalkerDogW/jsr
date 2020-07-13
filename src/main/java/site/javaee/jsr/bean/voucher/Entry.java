package site.javaee.jsr.bean.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Tao
 * @Date 2020/7/13
 * @Time 11:13
 */
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder = {"entry_id", "account_code", "abstract1", "currency", "exchange_rate1", "exchange_rate2", "primary_debit_amount"
        , "natural_debit_currency", "primary_credit_amount", "natural_credit_currency", "unit_price", "bill_type", "bill_id", "bill_date",
        "settlement", "document_id", "document_date", "item"})
public class Entry {

    //分录号
    @NotNull
    private int entry_id;

    //科目
    @NotNull
    private String account_code;

    //摘要
    @NotNull
    @XmlElement(name = "abstract")
    private String abstract1;

    //币种
    @NotNull
    private String currency;

    //汇率1
    @NotNull
    private String exchange_rate1;

    //汇率2
    @NotNull
    private String exchange_rate2;

    //原币借方发生额，不能为空
    @NotNull
    private String primary_debit_amount;

    //本币借方发生额，不能为空
    @NotNull
    private String natural_debit_currency;

    //原币贷方发生额，不能为空
    @NotNull
    private String primary_credit_amount;

    //本币贷方发生额，不能为空
    @NotNull
    private String natural_credit_currency;

    //单价
    @Null
    private String unit_price;

    //原始单据类型
    @Null
    private String bill_type;

    //原始单据编号
    @Null
    private String bill_id;

    //原始单据日期
    @Null
    private String bill_date;

    //结算方式
    @Null
    private String settlement;

    //票据号
    @Null
    private String document_id;

    //票据日期
    @Null
    private String document_date;
    @XmlTransient
    private int Fdc;
    @XmlTransient
    private String Fdwdm;

    @XmlTransient
    private String DeptId;

    //辅料核算
    //private Auxiliary_accounting auxiliary_accounting;

    @XmlElementWrapper(name = "auxiliary_accounting")
    private List<Item> item;

    public Entry(@NotNull int entry_id, @NotNull String account_code, @NotNull String abstract1, @NotNull String currency, @NotNull String exchange_rate1, @NotNull String exchange_rate2, @NotNull String primary_debit_amount, @NotNull String natural_debit_currency, @NotNull String primary_credit_amount, @NotNull String natural_credit_currency, @Null String unit_price, @Null String bill_type, @Null String bill_id, @Null String bill_date, @Null String settlement, @Null String document_id, @Null String document_date, int fdc, String fdwdm, String deptId, List<Item> item) {
        this.entry_id = entry_id;
        this.account_code = account_code;
        this.abstract1 = abstract1;
        this.currency = currency;
        this.exchange_rate1 = exchange_rate1;
        this.exchange_rate2 = exchange_rate2;
        this.primary_debit_amount = primary_debit_amount;
        this.natural_debit_currency = natural_debit_currency;
        this.primary_credit_amount = primary_credit_amount;
        this.natural_credit_currency = natural_credit_currency;
        this.unit_price = unit_price;
        this.bill_type = bill_type;
        this.bill_id = bill_id;
        this.bill_date = bill_date;
        this.settlement = settlement;
        this.document_id = document_id;
        this.document_date = document_date;
        Fdc = fdc;
        Fdwdm = fdwdm;
        DeptId = deptId;
        this.item = item;
    }


}
