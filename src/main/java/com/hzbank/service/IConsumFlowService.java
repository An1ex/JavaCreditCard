package com.hzbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzbank.entity.ConsumFlowEntity;

/**
 * <p>
 * 消费流水表 服务类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
public interface IConsumFlowService extends IService<ConsumFlowEntity> {
    public void Add(ConsumFlowEntity consumFlow);

    public void UpdateById(ConsumFlowEntity consumFlow);

    public ConsumFlowEntity FindById(String id);
}
