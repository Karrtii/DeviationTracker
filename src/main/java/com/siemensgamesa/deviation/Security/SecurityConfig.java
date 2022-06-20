package com.siemensgamesa.deviation.Security;

import com.siemensgamesa.deviation.Security.Filter.CustomAuthenticationFilter;
import com.siemensgamesa.deviation.Security.Filter.CustomAuthorizationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static String secretKey = "catchThemAll";

    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authenticationManagerBean());
        customAuthenticationFilter.setFilterProcessesUrl("/api/auth/login"); //setting login path

        http.cors();
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        /* ALL ROLES */
        http.authorizeRequests().antMatchers("/api/auth/login/**", "/api/auth/register/**").permitAll();

        /* USER ROLES */
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/user/getUser")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/project")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/turbine")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/turbine/**")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/visit")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/visit/**")
                .hasAuthority("role_user");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/recent")
                .hasAuthority("role_user");
//        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/user/favorites", "/api/review")
//                .hasAuthority("role_user");
//        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/user/favorites")
//                .hasAuthority("role_user");

        http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(customAuthenticationFilter);
        http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}