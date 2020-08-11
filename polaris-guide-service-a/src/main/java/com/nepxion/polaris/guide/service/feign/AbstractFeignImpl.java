package com.nepxion.polaris.guide.service.feign;

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;

public class AbstractFeignImpl {
    @Autowired
    private PluginAdapter pluginAdapter;

    public String doInvoke(String value) {
        return pluginAdapter.getPluginInfo(value);
    }
}