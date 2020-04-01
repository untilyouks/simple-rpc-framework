package com.qiye.simple.rpc.framework.spi;

import java.lang.annotation.*;

/**
 * Copyright (C), 2018-2020， see: http://www.gxb.io
 * Author:   shayne
 * Date:     2020/4/1 9:44 下午
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcSPI {

    String value() default "";
}
