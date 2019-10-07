package mx.gob.ssedomex.redisSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	 
	 @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	          .inMemoryAuthentication()
	          .withUser("admin").password("{noop}admin").roles("ADMIN")
	          .and()
	          .withUser("usu").password("{noop}usu").roles("USUARIO");
	    }

	 @Override
		protected void configure(HttpSecurity http) throws Exception {			
			http.authorizeRequests()
			.antMatchers("/rol").access("hasRole('ADMIN') or hasRole('USUARIO')")
			.antMatchers("/persona").access("hasRole('ADMIN')")
			.antMatchers("/usuario").access("hasRole('USUARIO')");	
			
			http.authorizeRequests()
	          .antMatchers("/login").permitAll()
	          .anyRequest().authenticated()
	          .and().formLogin().permitAll()
	          .and().csrf().disable();
		}

}
