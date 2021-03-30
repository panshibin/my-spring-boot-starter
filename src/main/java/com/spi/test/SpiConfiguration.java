package com.spi.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 */
@Configuration
public class SpiConfiguration {

    @Bean
    public MyBean myBean() {
        System.out.println("SPI demo，实例化MyBean类");
        return new MyBean();
    }

}
