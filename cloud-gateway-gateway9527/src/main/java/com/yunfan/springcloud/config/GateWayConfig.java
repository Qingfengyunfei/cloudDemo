package com.yunfan.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @description
 * @create 2021-04-20 14:36
 * @since 1.0.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("payment_route_custom", r-> r.path("/payment/discovery").uri("http://localhost:8001"))
                .build();
    }

}
