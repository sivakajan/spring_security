package secur.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityconfig  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/sample/hi")
                .hasAnyRole("admin").and().formLogin().and()
        .authorizeRequests().antMatchers("/sample/every")
                .hasAnyRole("user").and().formLogin();
    }

    @Autowired
    protected void configureGloable(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("kajan").password(passwordEncoder().encode("user1Pass")).roles("admin");
        auth.inMemoryAuthentication().withUser("gajan").password(passwordEncoder().encode("user1Pass")).roles("user");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
