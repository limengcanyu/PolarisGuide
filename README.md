# PolarisGuide

启动配置参数，适用于IDE里快速测试：
```xml
PolarisServiceA:
-Dmetadata.version=polaris-001 -Dmetadata.region=NEPXION -javaagent:C:/opt/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=polaris-service-a -Dpolaris.skywalking.agent.version=1.0.0 -Dnepxion.banner.shown.ansi.mode=true

PolarisServiceA（异步）:
-Dmetadata.version=polaris-001 -Dmetadata.region=NEPXION -Dmetadata.env=env1 -javaagent:C:/opt/polaris-agent/polaris-agent-6.0.7.jar -Dthread.scan.packages=com.nepxion.polaris.guide.service;org.springframework.aop.interceptor;com.netflix.hystrix -Dthread.request.decorator.enabled=true -javaagent:C:/opt/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=polaris-service-a -Dpolaris.skywalking.agent.version=1.0.0 -Dnepxion.banner.shown.ansi.mode=true

PolarisServiceB:
-Dmetadata.version=polaris-001 -Dmetadata.region=NEPXION -Dmetadata.env=env1 -javaagent:C:/opt/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=polaris-service-b -Dpolaris.skywalking.agent.version=1.0.0 -Dnepxion.banner.shown.ansi.mode=true

PolarisZuul:
-Dmetadata.version=polaris-001 -Dmetadata.region=NEPXION -Dmetadata.env=env1 -javaagent:C:/opt/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=polaris-zuul -Dpolaris.skywalking.agent.version=1.0.0 -Dnepxion.banner.shown.ansi.mode=true

PolarisGateway:
-Dmetadata.version=polaris-001 -Dmetadata.region=NEPXION -Dmetadata.env=env1 -javaagent:C:/opt/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=polaris-gateway -Dpolaris.skywalking.agent.version=1.0.0 -Dnepxion.banner.shown.ansi.mode=true
```

组件切换的地方
```xml
polaris-platform/polaris-component/polaris-component-gray/polaris-component-gray-common/pom.xml
polaris-platform/polaris-component/polaris-component-gray/polaris-component-gray-starter-console/pom.xml
polaris-platform/polaris-component/polaris-component-sentinel/polaris-component-sentinel-common/pom.xml
polaris-platform/polaris-framework/polaris-framework-starter-gateway/pom.xml
polaris-platform/polaris-framework/polaris-framework-starter-service/pom.xml
polaris-platform/polaris-framework/polaris-framework-starter-zuul/pom.xml
```