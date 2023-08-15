package com.hzbank.controller;


import cn.hutool.core.date.DateTime;
import com.hzbank.constants.ResponseStatus;
import com.hzbank.entity.CreditCardEntity;
import com.hzbank.entity.SpecialMerchantEntity;
import com.hzbank.entity.response.ResponseResult;
import com.hzbank.service.impl.CreditCardServiceImpl;
import com.hzbank.service.impl.SpecialMerchantServiceImpl;
import com.hzbank.util.UniqueID;
import com.hzbank.util.card.CardGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 * 信用卡信息表 前端控制器
 * </p>
 *
 * @author anlex
 * @since 2023-08-15
 */
@RestController
@RequestMapping("/credit-card-entity")
public class CreditCardController {
    @Resource
    private CreditCardServiceImpl creditCardService;

    @Resource
    private SpecialMerchantServiceImpl specialMerchantService;


    /*
     * 申请*/
    @ApiOperation("Apply")
    @PostMapping("apply")
    public ResponseResult<CreditCardEntity> apply(String openName, String certNo) {
        CreditCardEntity creditCard = new CreditCardEntity();
        creditCard.setId(UniqueID.generateUniqueID());
        creditCard.setCreditCardNo(CardGenerator.getInstance().generate());
        creditCard.setCertNo(certNo);
        creditCard.setOpeningName(openName);
        creditCard.setOpenTime(DateTime.now());
        creditCardService.Add(creditCard);

        return ResponseResult.success(creditCardService.getById(creditCard.getId()));
    }

    /*
     * 开卡*/
    @ApiOperation("Open")
    @PostMapping("open")
    public ResponseResult<CreditCardEntity> Open(String cardNo) {
        CreditCardEntity creditCard = creditCardService.FindByCardNo(cardNo);
        creditCard.setOpenTime(DateTime.now());
        creditCardService.UpdateById(creditCard);

        return ResponseResult.success(creditCardService.getById(creditCard.getId()));
    }

    /*
     * 消费*/
    @ApiOperation("Consume")
    @PostMapping("consume")
    public ResponseResult<CreditCardEntity> Consume(CreditCardEntity creditCardRequest, BigDecimal amount, String merchantNo) {
        CreditCardEntity creditCard = creditCardService.FindById(creditCardRequest.getId());
        // 核验密码
        if (!creditCardRequest.getConsumePwd().equals(creditCard.getConsumePwd())) {
            return ResponseResult.fail(ResponseStatus.FAIL.getDescription());
        }
        // 使用信用额度消费
        creditCard.setAvailCredit(creditCard.getAvailCredit().subtract(amount));
        // 消费次数加一
        creditCard.setConsumeFreq(creditCard.getConsumeFreq() + 1);
        // 是否为特约商户
        SpecialMerchantEntity merchant = specialMerchantService.FindByMerchantNo(merchantNo);
        if (merchant != null) {
            // 免息还款期增加
        }
        creditCardService.save(creditCard);
        return ResponseResult.success(creditCardService.getById(creditCard.getId()));
    }


}

