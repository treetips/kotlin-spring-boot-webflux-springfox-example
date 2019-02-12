package com.example.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.ResourceHandlerRegistry
import org.springframework.web.reactive.config.WebFluxConfigurationSupport


/**
 * WebFlux config
 * @author tree
 */
@Configuration
class WebfluxConfig : WebFluxConfigurationSupport() {

  /**
   * {@inheritDoc}
   */
  override fun addResourceHandlers(resourceHandlerRegistry: ResourceHandlerRegistry) {
    resourceHandlerRegistry
      .addResourceHandler("/swagger-ui.html**")
      .addResourceLocations("classpath:/META-INF/resources/")
    resourceHandlerRegistry
      .addResourceHandler("/webjars/**")
      .addResourceLocations("classpath:/META-INF/resources/webjars/")
  }
}
