package com.devhesh.jooqproject.configuration

import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JooqCustomConfiguration {
    @Bean
    fun defaultConfigurationCustomizer(): DefaultConfigurationCustomizer {
        return DefaultConfigurationCustomizer { config ->
            config.settings().withRenderSchema(false)
        }
    }
}
