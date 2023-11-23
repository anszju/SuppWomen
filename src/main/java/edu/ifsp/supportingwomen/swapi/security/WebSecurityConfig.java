package edu.ifsp.supportingwomen.swapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    // Dentro de WebSecurityConfig
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .requiresChannel(
                        channel -> channel.anyRequest().requiresSecure())
                .csrf().disable() // Necessário para permitir acesso ao POST
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(HttpMethod.GET, "/suppwomen/comentarios").permitAll()
                                .requestMatchers(HttpMethod.GET, "/suppwomen/posts/").permitAll()
                                .requestMatchers(HttpMethod.GET, "/suppwomen/posts/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST, "/suppwomen/cadastro").permitAll())
                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(HttpMethod.POST, "/suppwomen/pontos").authenticated()
                                .requestMatchers(HttpMethod.POST, "/suppwomen/criacomentario").authenticated()
                                .requestMatchers(HttpMethod.GET, "/suppwomen/pontos").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/suppwomen/deletaponto/{id}").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/suppwomen/deletapost/{id}").authenticated()
                                .requestMatchers(HttpMethod.POST, "/suppwomen/posts/").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/suppwomen/deletaConta/{id}").authenticated()
                                .requestMatchers(HttpMethod.GET, "/suppwomen/listacadastros").authenticated()
                                .requestMatchers(HttpMethod.GET, "/suppwomen/cadastro/{id}").authenticated());
        return http.build();
    }

    // Dentro de WebSecurityConfig
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("ifsp")
                .password("1234")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
