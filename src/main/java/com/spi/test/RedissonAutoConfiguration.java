package com.spi.test;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zby
 * @version 1.0
 * @description: TODO
 * @date 2021/3/30 上午11:36
 */
@ConditionalOnClass(Redisson.class)//条件装载
@EnableConfigurationProperties(RedissonProperties.class)
@Configuration
public class RedissonAutoConfiguration {

    @Bean
    RedissonClient redissonClient(RedissonProperties redissonProperties) {
        Config config = new Config();
        String prefix = "redis://";
        if (redissonProperties.isSsl()) {
            prefix = "rediss://";
        }
        config.useSingleServer()
                .setAddress(prefix + redissonProperties.getHost() + ":" + redissonProperties.getPort())
                .setTimeout(redissonProperties.getTimeOut())
                .setPassword(redissonProperties.getPassword());
        return Redisson.create(config);
    }
}
