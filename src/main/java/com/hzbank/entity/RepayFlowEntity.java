package com.hzbank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 还款流水表
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Getter
@Setter
@TableName("repay_flow")
@ApiModel(value = "RepayFlowEntity对象", description = "还款流水表")
public class RepayFlowEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("信用卡卡号")
    @TableField("credit_card_no")
    private String creditCardNo;

    @ApiModelProperty("还款金额")
    @TableField("repay_amount")
    private BigDecimal repayAmount;

    @ApiModelProperty("还款方式")
    @TableField("repay_type")
    private String repayType;

    @ApiModelProperty("还款时间")
    @TableField("repay_time")
    private Date repayTime;

}
