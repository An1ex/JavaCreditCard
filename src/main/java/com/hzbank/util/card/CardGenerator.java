package com.hzbank.util.card;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

/**
 * <pre>
 *  生成随机银行卡号：
 *
 *  参考：效验是否为银行卡，用于验证：
 *  现行 16 位银联卡现行卡号开头 6 位是 622126～622925 之间的，7 到 15 位是银行自定义的，
 *  可能是发卡分行，发卡网点，发卡序号，第 16 位是校验码。
 *  16 位卡号校验位采用 Luhm 校验方法计算：
 * 1，将未带校验位的 15 位卡号从右依次编号 1 到 15，位于奇数位号上的数字乘以 2
 * 2，将奇位乘积的个十位全部相加，再加上所有偶数位上的数字
 * 3，将加法和加上校验位能被 10 整除。
 * </pre>
 */
public class CardGenerator extends BaseGenerator {
    private static BaseGenerator instance = new CardGenerator();

    private CardGenerator() {
    }

    public static BaseGenerator getInstance() {
        return instance;
    }

    @Override
    public String generate() {
        Random random = getRandomInstance();
        Integer prev = 622126 + random.nextInt(925 + 1 - 126);
        return generateByPrefix(prev);
    }

    /**
     * <pre>
     * 根据给定前六位生成卡号
     * </pre>
     */
    public static String generateByPrefix(Integer prefix) {
        Random random = new Random(System.currentTimeMillis());
        String bardNo = prefix
                + StringUtils.leftPad(random.nextInt(999999999) + "", 9, "0");

        char[] chs = bardNo.trim().toCharArray();
        int luhnSum = LuhnUtils.getLuhnSum(chs);
        char checkCode = luhnSum % 10 == 0 ? '0' : (char) (10 - luhnSum % 10 + '0');
        return bardNo + checkCode;
    }
}