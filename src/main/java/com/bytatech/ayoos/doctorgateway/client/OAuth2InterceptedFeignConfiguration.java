package com.bytatech.ayoos.doctorgateway.client;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;

import com.bytatech.ayoos.doctorgateway.security.oauth2.AuthorizationHeaderUtil;

public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
