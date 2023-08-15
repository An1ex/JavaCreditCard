package com.hzbank.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzbank.entity.CreditCardEntity;
import com.hzbank.mapper.CreditCardMapper;
import com.hzbank.service.ICreditCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 信用卡信息表 服务实现类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Service
public class CreditCardServiceImpl extends ServiceImpl<CreditCardMapper, CreditCardEntity> implements ICreditCardService {

    @Resource
    private CreditCardMapper creditCardMapper;

    @Override
    public void Add(CreditCardEntity creditCard) {
        creditCardMapper.insert(creditCard);
    }

    @Override
    public void UpdateById(CreditCardEntity creditCard) {
        creditCardMapper.updateById(creditCard);
    }


    @Override
    public CreditCardEntity FindById(String id) {
        return creditCardMapper.selectById(id);
    }

    @Override
    public CreditCardEntity FindByCardNo(String cardNo) {
        QueryWrapper<CreditCardEntity> creditCardQueryWrapper = new QueryWrapper<>();
        creditCardQueryWrapper.eq("credit_card_no", cardNo);
        return this.getOne(creditCardQueryWrapper);
    }
}
