package com.github.danielprz1393.general_001_configuration_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class General001ConfigurationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(General001ConfigurationServerApplication.class, args);
    }
}
