package com.qf.utils;


import com.qf.exception.RedisException;
import org.springframework.util.StringUtils;

public class RedisUtil {
    /**
     * 用于判断指定内容是不是为空
     * @param source
     */
    public static void checkNull(String source) {
        if (StringUtils.isEmpty(source)) {
            //等参数为10001是  参数为空
            throw new RedisException("参数为空", "10001");
        }
    }
}