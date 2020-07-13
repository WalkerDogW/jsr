package site.javaee.jsr.bean.voucher.help;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 凭证对接错误类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class U8CErrCode {

    private String id;
    private String voucher_code;
    private String result_code;
    private String resultdes;
    private Date current_date;


}
