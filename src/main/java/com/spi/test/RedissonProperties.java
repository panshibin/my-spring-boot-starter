package com.spi.test;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zby
 * @version 1.0
 * @description: TODO
 * @date 2021/3/30 上午11:40
 */
@ConfigurationProperties(prefix = "my.redis")
public class RedissonProperties {
    private String host = "localhost";
    private int port = 6379;
    private int timeOut;
    private String password;
    private boolean ssl;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
