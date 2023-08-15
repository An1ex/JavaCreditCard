package com.hzbank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzbank.entity.ConsumFlowEntity;
import com.hzbank.mapper.ConsumFlowMapper;
import com.hzbank.service.IConsumFlowService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消费流水表 服务实现类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Service
public class ConsumFlowServiceImpl extends ServiceImpl<ConsumFlowMapper, ConsumFlowEntity> implements IConsumFlowService {

    @Override
    public void Add(ConsumFlowEntity consumFlow) {

    }

    @Override
    public void UpdateById(ConsumFlowEntity consumFlow) {

    }

    @Override
    public ConsumFlowEntity FindById(String id) {
        return null;
    }
}
