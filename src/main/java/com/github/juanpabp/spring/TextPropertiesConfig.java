package com.github.juanpabp.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:texts.properties")
public class TextPropertiesConfig {
}
