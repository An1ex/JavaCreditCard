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
 * 消费流水表
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Getter
@Setter
@TableName("consum_flow")
@ApiModel(value = "ConsumFlowEntity对象", description = "消费流水表")
public class ConsumFlowEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("信用卡卡号")
    @TableField("credit_card_no")
    private String creditCardNo;

    @ApiModelProperty("消费金额")
    @TableField("consum_amount")
    private BigDecimal consumAmount;

    @ApiModelProperty("消费信息")
    @TableField("consum_info")
    private String consumInfo;

    @ApiModelProperty("消费时间")
    @TableField("consum_time")
    private Date consumTime;


}
