package com.hzbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzbank.entity.AssociateCardEntity;

/**
 * <p>
 * 关联一卡通账户表 服务类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
public interface IAssociateCardService extends IService<AssociateCardEntity> {
    public void Add(AssociateCardEntity associateCard);

    public void UpdateById(AssociateCardEntity associateCard);

    public AssociateCardEntity FindById(String id);
}
