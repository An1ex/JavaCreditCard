package com.hzbank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzbank.entity.AssociateCardEntity;
import com.hzbank.mapper.AssociateCardMapper;
import com.hzbank.service.IAssociateCardService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关联一卡通账户表 服务实现类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Service
public class AssociateCardServiceImpl extends ServiceImpl<AssociateCardMapper, AssociateCardEntity> implements IAssociateCardService {

    @Override
    public void Add(AssociateCardEntity associateCard) {

    }

    @Override
    public void UpdateById(AssociateCardEntity associateCard) {

    }

    @Override
    public AssociateCardEntity FindById(String id) {
        return null;
    }
}
