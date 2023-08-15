package com.hzbank.creditcard.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 还款流水表
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RepayFlow implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 唯一ID
     */
      private String id;

    /**
     * 信用卡卡号
     */
    private String creditCardNo;

    /**
     * 还款金额
     */
    private BigDecimal repayAmount;

    /**
     * 还款方式
     */
    private String repayType;

    /**
     * 还款时间
     */
    private LocalDateTime repayTime;


}
