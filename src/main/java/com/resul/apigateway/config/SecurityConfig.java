//package com.resul.apigateway.config;
//
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        http
//                .csrf().disable()
//                .authorizeExchange()
//                .pathMatchers("/api/v1/auth/**").permitAll() // Auth işlemleri token olmadan erişilebilir
//                .anyExchange().authenticated()  // Diğer tüm işlemler kimlik doğrulama gerektirir
//                .and()
//                .oauth2ResourceServer()
//                .jwt();  // JWT doğrulama
//        return http.build();
//    }
//}