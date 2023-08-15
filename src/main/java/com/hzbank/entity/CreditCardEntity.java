package com.hzbank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 信用卡信息表
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Getter
@Setter
@TableName("credit_card")
@ApiModel(value = "CreditCardEntity对象", description = "信用卡信息表")
public class CreditCardEntity extends Model<CreditCardEntity> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("信用卡卡号")
    @TableField("credit_card_no")
    private String creditCardNo;

    @ApiModelProperty("开户姓名")
    @TableField("opening_name")
    private String openingName;

    @ApiModelProperty("身份证号")
    @TableField("cert_no")
    private String certNo;

    @ApiModelProperty("信用额度")
    @TableField("`limit_credit`")
    private BigDecimal limitCredit;

    @ApiModelProperty("可用额度")
    @TableField("`avail_credit`")
    private BigDecimal availCredit;

    @ApiModelProperty("余额")
    @TableField("balance")
    private BigDecimal balance;

    @ApiModelProperty("消费密码")
    @TableField("consume_pwd")
    private String consumePwd;

    @ApiModelProperty("预借密码")
    @TableField("advance_pwd")
    private String advancePwd;

    @ApiModelProperty("消费次数")
    @TableField("consume_freq")
    private int consumeFreq;

    @ApiModelProperty("冻结标志")
    @TableField("is_frozen")
    private String isFrozen;

    @ApiModelProperty("销卡标志")
    @TableField("is_cancel")
    private String isCancel;

    @ApiModelProperty("冻结时间")
    @TableField("frozen_time")
    private Date frozenTime;

    @ApiModelProperty("注销时间")
    @TableField("cancel_time")
    private Date cancelTime;

    @ApiModelProperty("开卡时间")
    @TableField("open_time")
    private Date openTime;

}
