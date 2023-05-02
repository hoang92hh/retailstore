package com.example.retailtstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

//c1 gan truc tiep
//    @Bean
////    public UserDetailsService userDetailsService  (DataSource dataSource){
////        UserDetails user = User.builder()
////                .username("nvhoang3User")
////                .password("{bcrypt}$2a$10$0QQWwDAzbYaCtdHEVsrUYOq4fcWEPdL3QOL6y8s.TQB/Zj9HoeTf6")
////                .roles("USER")
////                .build();
////
////        UserDetails admin = User.builder()
////                .username("nvhoangAdmin")
//////                .password("{bcrypt}$2a$10$Guo9HAQma/R5crhuZDqgUONZ.g8XXXLo5J7sJ2OGv5iybsn3FTmY.")
////                .password("$2a$10$Guo9HAQma/R5crhuZDqgUONZ.g8XXXLo5J7sJ2OGv5iybsn3FTmY.")
////                .roles("USER", "ADMIN")
////                .build();
////        return new InMemoryUserDetailsManager(user, admin);
////    }

// gan len database

//    @Bean
//    public UserDetailsService userDetailsService  (DataSource dataSource){
//        UserDetails user = User.builder()
//                .username("user")
//                .password("$2a$10$LuZOPauQr8myH7sx5VqiT.W8698A4o6.WPRNbjZ4Ms7mozp0SE4H2")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("$2a$10$LF.zzWc0zQuqB1ryCF2Wiu5Jm5egowAmgrvpA9fICyT4I.mQFfdca")
//                .roles("USER", "ADMIN")
//                .build();
//
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.createUser(user);
//        users.createUser(admin);
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
