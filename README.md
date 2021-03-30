# my-spring-boot-starter
手写Starter组件
# 原理
  SpringBootStarter组件独立的，需要某些组件时在pom配置相应的jar包以及在yml中配置相应的参数配置就能使用某插件，属于可插拔式插件。
  该原理基于Spring相应的注解，比如@ConfigurationProperties、@Bean、@Import、@ConfigurationProperties以及@EnableConfigurationProperties等核心注解。
  在启动扫描的时候通过SpringFactoriesLoader SPI机制扫描所有的spring.factories文件，并获取该文件下的所有组件配置类存放到IOC容器当中。

