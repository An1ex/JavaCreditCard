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
 * 关联一卡通账户表
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Getter
@Setter
@TableName("associate_card")
@ApiModel(value = "AssociateCardEntity对象", description = "关联一卡通账户表")
public class AssociateCardEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("信用卡卡号")
    @TableField("credit_card_no")
    private String creditCardNo;

    @ApiModelProperty("一卡通账号")
    @TableField("card_no")
    private String cardNo;

    @ApiModelProperty("开户姓名")
    @TableField("open_name")
    private String openName;

    @ApiModelProperty("身份证号")
    @TableField("cert_no")
    private Integer certNo;


}
