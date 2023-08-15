package com.hzbank.creditcard.service.impl;

import com.hzbank.creditcard.entity.CreditCard;
import com.hzbank.creditcard.mapper.CreditCardMapper;
import com.hzbank.creditcard.service.CreditCardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信用卡信息表 服务实现类
 * </p>
 *
 * @author md
 * @since 2023-08-14
 */
@Service
public class CreditCardServiceImpl extends ServiceImpl<CreditCardMapper, CreditCard> implements CreditCardService {

    @Override
    public String applyCard(String openName, String certNo) {
        return null;
    }

    @Override
    public String activateCard(String creditCardNo) {
        return null;
    }
}
