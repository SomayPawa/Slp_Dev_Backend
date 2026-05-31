package com.slpdev.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Apply to all endpoints
                .allowedOrigins("https://slpdev.netlify.app", "http://localhost:5173") // Allowed frontend URLs
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Explicitly allow OPTIONS for preflight
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true);
    }
}
