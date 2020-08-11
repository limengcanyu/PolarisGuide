package com.nepxion.polaris.guide.service.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;

public class AbstractRestImpl {
    @Autowired
    private PluginAdapter pluginAdapter;

    public String doRest(String value) {
        return pluginAdapter.getPluginInfo(value);
    }
}