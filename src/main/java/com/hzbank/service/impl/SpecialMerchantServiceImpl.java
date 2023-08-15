package com.hzbank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzbank.entity.SpecialMerchantEntity;
import com.hzbank.mapper.SpecialMerchantMapper;
import com.hzbank.service.ISpecialMerchantService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 特约商户表 服务实现类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Service
public class SpecialMerchantServiceImpl extends ServiceImpl<SpecialMerchantMapper, SpecialMerchantEntity> implements ISpecialMerchantService {

    @Override
    public void Add(SpecialMerchantEntity specialMerchant) {

    }

    @Override
    public void UpdateById(SpecialMerchantEntity specialMerchant) {

    }

    @Override
    public SpecialMerchantEntity FindById(String id) {
        return null;
    }

    @Override
    public SpecialMerchantEntity FindByMerchantNo(String merchantNo) {
        return null;
    }
}
