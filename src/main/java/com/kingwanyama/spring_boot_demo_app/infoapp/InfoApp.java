package com.kingwanyama.spring_boot_demo_app.infoapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "info.app")
@Data
public class InfoApp {
    String name;
    String description;
    String version;

}
