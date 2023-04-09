package com.kingwanyama.spring_boot_demo_app.jsonplaceholder;

import lombok.Data;

public record Post(Integer userId,
        Integer id,
        String title,
        String body) {

}
