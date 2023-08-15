package com.hzbank.creditcard.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 信用卡信息表
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreditCard implements Serializable {

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
     * 开户姓名
     */
    private String openingName;

    /**
     * 身份证号
     */
    private String certNo;

    /**
     * 信用额度
     */
    private BigDecimal limit;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 消费密码
     */
    private String consumPwd;

    /**
     * 预借密码
     */
    private String advancePwd;

    /**
     * 冻结标志
     */
    private String isFrozen;

    /**
     * 销卡标志
     */
    private String isCancel;


}
