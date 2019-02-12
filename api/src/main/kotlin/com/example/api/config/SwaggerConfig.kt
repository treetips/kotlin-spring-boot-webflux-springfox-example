package com.example.api.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMethod
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.ResponseMessageBuilder
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux
import java.time.LocalDate
import java.time.OffsetDateTime

/**
 * Swagger config
 * @author tree
 */
@Configuration
@EnableSwagger2WebFlux
class SwaggerConfig {

  @Bean
  fun api(): Docket {
    return Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(PathSelectors.regex("^\\/(api|sample)/.*"))
      .build()
      // ② directModelSubstituteを指定するとJava8の日付がちゃんと文字列で出る
      // 指定しないと保持するメンバ変数全部返す
      .directModelSubstitute(OffsetDateTime::class.java, java.util.Date::class.java)
      .directModelSubstitute(LocalDate::class.java, java.sql.Date::class.java)
      // ③ useDefaultResponseMessagesをtrueにすると200,201,400などのデフォルトのステータスコードを各APIのレスポンスに出力する
      .useDefaultResponseMessages(false)
      // ④ 利用可能なprotocolを指定できる
      .protocols(setOf("http"))
      // ⑤ ResponseEntity<> で指定している部分がある場合は下記を指定することでResponseEntityのメンバ変数を返却しなくてすむ
      .genericModelSubstitutes(ResponseEntity::class.java)
      // ⑥ 各リクエストメソッド毎にデフォルトのステータスコードと返却値の型、概要を出力できる
      .globalResponseMessage(RequestMethod.POST,
        listOf(
          ResponseMessageBuilder().code(200).message("OK").build(),
          ResponseMessageBuilder().code(400).message("Parameter is invalid").build(),
          ResponseMessageBuilder().code(401).message("認証エラー").build(),
          ResponseMessageBuilder().code(500).message("Internal server error").build()
        ))
      .globalResponseMessage(RequestMethod.GET,
        listOf(
          ResponseMessageBuilder().code(200).message("OK").build(),
          ResponseMessageBuilder().code(400).message("Parameter is invalid").build(),
          ResponseMessageBuilder().code(500).message("Internal server error").build()
        ));
  }
}
