package com.example.demo

import org.apache.catalina.connector.Connector
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ServerConfig {
    @Value("\${server.http.port}")
    private val httpPort = 0

    @Bean
    fun webServerFactory(): ConfigurableServletWebServerFactory {
        val factory = TomcatServletWebServerFactory()
        factory.addAdditionalTomcatConnectors(createStandardConnector())
        return factory
    }

    private fun createStandardConnector(): Connector {
        val connector = Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL)
        connector.port = httpPort
        return connector
    }
}
