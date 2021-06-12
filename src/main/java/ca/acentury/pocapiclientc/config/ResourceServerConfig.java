package ca.acentury.pocapiclientc.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and()
                .mvcMatcher("/service/**")
                .authorizeRequests()
                .mvcMatchers("/service/**").access("hasAuthority('SCOPE_service.c')")
                .and()
                .oauth2ResourceServer()
                .jwt();
    }
}
