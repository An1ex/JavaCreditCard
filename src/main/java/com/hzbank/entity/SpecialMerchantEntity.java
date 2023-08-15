package com.hzbank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 特约商户表
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Getter
@Setter
@TableName("special_merchant")
@ApiModel(value = "SpecialMerchantEntity对象", description = "特约商户表")
public class SpecialMerchantEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("商户编号")
    @TableField("merchant_no")
    private String merchantNo;

    @ApiModelProperty("商户名称")
    @TableField("merchant_name")
    private String merchantName;

    @ApiModelProperty("免息还款期（天）")
    @TableField("interest_free_period")
    private Integer interestFreePeriod;


}
