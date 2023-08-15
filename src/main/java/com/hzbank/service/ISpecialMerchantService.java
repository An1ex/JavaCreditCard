package com.hzbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzbank.entity.SpecialMerchantEntity;

/**
 * <p>
 * 特约商户表 服务类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
public interface ISpecialMerchantService extends IService<SpecialMerchantEntity> {
    public void Add(SpecialMerchantEntity specialMerchant);

    public void UpdateById(SpecialMerchantEntity specialMerchant);

    public SpecialMerchantEntity FindById(String id);

    public SpecialMerchantEntity FindByMerchantNo(String merchantNo);
}
