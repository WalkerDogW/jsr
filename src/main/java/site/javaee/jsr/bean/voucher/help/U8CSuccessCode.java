package site.javaee.jsr.bean.voucher.help;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 凭证对接成功实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class U8CSuccessCode {

    //凭证单据编号
    private String evidence_number;
    //凭证号
    private String voucder_id;
    //期间日期
    private Date date;

}
