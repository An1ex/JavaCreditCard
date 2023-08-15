package com.hzbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzbank.entity.RepayFlowEntity;

/**
 * <p>
 * 还款流水表 服务类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
public interface IRepayFlowService extends IService<RepayFlowEntity> {
    public void Add(RepayFlowEntity repayFlow);

    public void UpdateById(RepayFlowEntity repayFlow);

    public RepayFlowEntity FindById(String id);
}
