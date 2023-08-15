package com.hzbank.creditcard.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 关联一卡通账户表
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AssociateCard implements Serializable {

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
     * 一卡通账号
     */
    private String cardNo;

    /**
     * 开户姓名
     */
    private String openName;

    /**
     * 身份证号
     */
    private Integer certNo;


}
