package com.nepxion.polaris.guide.service.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nepxion.discovery.common.constant.DiscoveryConstant;

@RestController
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "polaris-service-b")
public class BRestImpl extends AbstractRestImpl {
    private static final Logger LOG = LoggerFactory.getLogger(BRestImpl.class);

    @RequestMapping(path = "/rest/{value}", method = RequestMethod.GET)
    public String rest(@PathVariable(value = "value") String value) {
        value = doRest(value);

        LOG.info("调用路径：{}", value);

        return value;
    }
}