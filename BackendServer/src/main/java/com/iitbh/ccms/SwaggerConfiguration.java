package com.iitbh.ccms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SwaggerConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }

    @Bean
    public HttpMessageConverter<?> byteArrayHttpMessageConverter() {
        return new ByteArrayHttpMessageConverter();
    }

//    @Bean
//    public UrlBasedCorsConfigurationSource corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("*"); // Allow all origins for demo purposes, you can specify your frontend URL here
//        config.addAllowedMethod("*"); // Allow all HTTP methods
//        config.addAllowedHeader("*"); // Allow all headers
//        source.registerCorsConfiguration("/**", config);
//        return source;
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new ByteArrayHttpMessageConverter());
//        converters.add(new MappingJackson2HttpMessageConverter());
//    }

}
