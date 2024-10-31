package com.example.spring_oauth2_resource_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    JwtDecoder jwtDecoder() {
        //인가서버 주소
        //자동으로 공개키를 찾아 디코더 진행
        return JwtDecoders.fromIssuerLocation("http://localhost:9000");
    }
}
