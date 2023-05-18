package com.homeofthewizard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

@Configuration
@PropertySource(value = { "vault-config.properties" })
@Import(value = EnvironmentVaultConfiguration.class)
public class SpringConfig {

    @Bean
    public MySpringBean mySpringBean(){
        return new MySpringBean();
    }
}
