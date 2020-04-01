package com.qiye.simple.rpc.framework.registry;

import java.util.List;

/**
 * Copyright (C), 2018-2020， see: http://www.gxb.io
 * Author:   shayne
 * Date:     2020/4/1 9:54 下午
 */
public interface ServiceRegistry {

    void register(URL url);

    void unregister(URL url);

    List<URL> lookup(URL url);
}
