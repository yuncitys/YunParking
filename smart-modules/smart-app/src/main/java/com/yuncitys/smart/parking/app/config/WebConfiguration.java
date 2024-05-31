package com.yuncitys.smart.parking.app.config;

import com.yuncitys.smart.parking.auth.client.interceptor.ServiceAuthRestInterceptor;
import com.yuncitys.smart.parking.auth.client.interceptor.UserAuthRestInterceptor;
import com.yuncitys.smart.parking.common.handler.GlobalExceptionHandler;
import com.yuncitys.smart.parking.common.xss.XssFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器和全局配置
 * @author smart
 * @version 2022/9/8
 */
@Configuration("parkingWebConfig")
@Primary
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*
            增加服务权限烂机器
         */
        registry.addInterceptor(getServiceAuthRestInterceptor()).addPathPatterns("/**");
        /*
            增加用户权限拦截器
         */
        registry.addInterceptor(getUserAuthRestInterceptor()).addPathPatterns("/**");
       super.addInterceptors(registry);
    }

    /**
     * 配置服务权限拦截
     * @return
     */
    @Bean
    ServiceAuthRestInterceptor getServiceAuthRestInterceptor() {
        return new ServiceAuthRestInterceptor();
    }

    /**
     * 配置用户用户token拦截
     * @return
     */
    @Bean
    UserAuthRestInterceptor getUserAuthRestInterceptor() {
        return new UserAuthRestInterceptor();
    }

    /**
     * xssFilter注册
     */
    @Bean
    public FilterRegistrationBean xssFilterRegistration() {
        XssFilter xssFilter = new XssFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean(xssFilter);
        registration.addUrlPatterns("/*");
        registration.setOrder(Integer.MIN_VALUE);
        return registration;
    }
}
