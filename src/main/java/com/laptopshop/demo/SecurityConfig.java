package com.laptopshop.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // Cho phép tất cả request
                .csrf(csrf -> csrf.disable()) // Tắt CSRF
                .formLogin(form -> form.disable()) // Tắt form login
                .httpBasic(basic -> basic.disable()); // Tắt Basic Auth
        return http.build();
    }
}