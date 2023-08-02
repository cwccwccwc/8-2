package com.yc.spring.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Configuration
@ComponentScan
@PropertySource("classpath:/db.properties")
public class Config {
}
