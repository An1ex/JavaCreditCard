package com.hzbank.util;

import cn.hutool.core.util.IdUtil;

public class UniqueID {
    public static String generateUniqueID() {
        return IdUtil.getSnowflake(1,1).nextIdStr();
    }
}
