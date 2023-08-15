package com.hzbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzbank.entity.CreditCardEntity;

/**
 * <p>
 * 信用卡信息表 服务类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
public interface ICreditCardService extends IService<CreditCardEntity> {
    public void Add(CreditCardEntity creditCard);

    public void UpdateById(CreditCardEntity creditCard);

    public CreditCardEntity FindById(String id);

    public CreditCardEntity FindByCardNo(String cardNo);
}
