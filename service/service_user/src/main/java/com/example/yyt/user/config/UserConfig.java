package com.example.yyt.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.yyt.user.mapper")
public class UserConfig {
}
