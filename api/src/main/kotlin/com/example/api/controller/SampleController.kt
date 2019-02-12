package com.example.api.controller

import com.example.api.service.SampleService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.reactor.mono
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * Sample controller
 * @author tree
 */
@RestController
@RequestMapping("/sample")
@Api(tags = ["サンプルAPI"], description = "APIの実装サンプルです。")
class SampleController(
  private val sampleService: SampleService
) {
  @GetMapping("/send-text-mail/")
  @ApiOperation(value = "テキストメール送信API", notes = "テキストメールを送信するサンプルAPIです。")
  fun sendTextMail(): Mono<String> = GlobalScope.mono {
    sampleService.sendTextMail()
    "Text mail transmitted."
  }

  @GetMapping("/send-html-mail/")
  @ApiOperation(value = "HTMLメール送信API", notes = "HTMLメールを送信するサンプルAPIです。")
  fun sendHtmlMail(): Mono<String> = GlobalScope.mono {
    sampleService.sendHtmlMail()
    "Html mail transmitted."
  }

  @GetMapping("/send-multipart-mail/")
  @ApiOperation(value = "マルチパートメール送信API", notes = "テキスト＋HTMLのマルチパートメールを送信するサンプルAPIです。")
  fun sendMultipartMail(): Mono<String> = GlobalScope.mono {
    sampleService.sendMultipartMail()
    "Multipart mail transmitted."
  }
}
