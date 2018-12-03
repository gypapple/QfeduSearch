package com.feri.qfedusearch.config;

import com.feri.qfedusearch.filter.CROSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
/**
 *@Author feri
 *@Date Created in 2018/12/3 17:28
 * 实现SpringBoot的过滤器的配置
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean addFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("encodingFilter");
        registrationBean.setFilter(new CharacterEncodingFilter("UTF-8"));
        return  registrationBean;
    }
    @Bean
    public FilterRegistrationBean addCrosFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("crosFilter");
        registrationBean.setFilter(new CROSFilter());
        return  registrationBean;
    }
}