package com.hzbank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzbank.entity.RepayFlowEntity;
import com.hzbank.mapper.RepayFlowMapper;
import com.hzbank.service.IRepayFlowService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 还款流水表 服务实现类
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@Service
public class RepayFlowServiceImpl extends ServiceImpl<RepayFlowMapper, RepayFlowEntity> implements IRepayFlowService {

    @Override
    public void Add(RepayFlowEntity repayFlow) {

    }

    @Override
    public void UpdateById(RepayFlowEntity repayFlow) {

    }

    @Override
    public RepayFlowEntity FindById(String id) {
        return null;
    }
}
