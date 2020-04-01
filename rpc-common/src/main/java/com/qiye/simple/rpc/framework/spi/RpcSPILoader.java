package com.qiye.simple.rpc.framework.spi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Copyright (C), 2018-2020， see: http://www.gxb.io
 * Author:   shayne
 * Date:     2020/4/1 9:47 下午
 */
public class RpcSPILoader {
    //所有SPI服务缓存容器
    private final static Map<String, Object> serviceMap = new HashMap<>();

    //加载该类型所有SPI服务
    public static synchronized <S> List<S> loadAll(Class<S> sClass) {
        List<S> services = (List<S>) serviceMap.get(sClass.getCanonicalName());
        if (null == services) {
            services = StreamSupport.stream(ServiceLoader.load(sClass).spliterator(), false).filter(p->p.getClass().isAnnotationPresent(RpcSPI.class)).collect(Collectors.toList());
            serviceMap.put(sClass.getCanonicalName(), services);
        }
        return services;
    }
}
