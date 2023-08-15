package com.hzbank.creditcard.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 特约商户表
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpecialMerchant implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 唯一ID
     */
      private String id;

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 免息还款期（天）
     */
    private Integer interestFreePeriod;


}
