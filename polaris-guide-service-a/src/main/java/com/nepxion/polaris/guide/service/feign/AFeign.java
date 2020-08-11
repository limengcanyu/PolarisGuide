package com.nepxion.polaris.guide.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "polaris-service-a")
public interface AFeign {
    @GetMapping(path = "/invoke/{value}")
    String invoke(@PathVariable(value = "value") String value);
}