package com.hzbank.creditcard.service;

import com.hzbank.creditcard.entity.CreditCard;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 信用卡信息表 服务类
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
public interface CreditCardService extends IService<CreditCard> {
    public String applyCard(String openName, String certNo);

    public String activateCard(String creditCardNo);
}
