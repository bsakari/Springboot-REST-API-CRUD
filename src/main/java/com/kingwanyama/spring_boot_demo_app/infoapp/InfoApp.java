package com.kingwanyama.spring_boot_demo_app.infoapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "info.app")
public class InfoApp {
    String name;
    String description;
    String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "InfoApp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}