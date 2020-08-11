package com.nepxion.polaris.guide.service.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nepxion.discovery.common.constant.DiscoveryConstant;

@RestController
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "polaris-service-a")
public class ARestImpl extends AbstractRestImpl {
    private static final Logger LOG = LoggerFactory.getLogger(ARestImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/rest/{value}", method = RequestMethod.GET)
    public String rest(@PathVariable(value = "value") String value) {
        value = doRest(value);
        value = restTemplate.getForEntity("http://polaris-service-b/rest/" + value, String.class).getBody();

        LOG.info("调用路径：{}", value);

        return value;
    }
}