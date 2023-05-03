package com.example.retailtstore.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    //chi dinh kieu passwordEncodeer la Bcrypt
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()  // bao ve tan cong csrf , hien dang disable
                .authorizeRequests()
                .antMatchers("/v1/register").permitAll() // request khong can authen
                .antMatchers("/v1/greeting").authenticated() // request can authen
                .and().formLogin()
                .and().httpBasic();
        return httpSecurity.build();
    }


}
