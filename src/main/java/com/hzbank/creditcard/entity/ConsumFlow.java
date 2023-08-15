package com.hzbank.creditcard.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 消费流水表
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ConsumFlow implements Serializable {

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
     * 消费金额
     */
    private BigDecimal consumAmount;

    /**
     * 消费信息
     */
    private String consumInfo;

    /**
     * 消费时间
     */
    private LocalDateTime consumTime;


}
