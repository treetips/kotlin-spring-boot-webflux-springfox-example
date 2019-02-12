package com.example.api.controller

import com.example.base.service.AddressService
import com.example.tables.pojos.Prefecture
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.reactor.mono
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

/**
 * Address controller
 * @author tree
 */
@RestController
@RequestMapping("/api")
@Api(tags = ["住所API"], description = "都道府県等の住所取得APIです。")
class ApiController(
  private val addressService: AddressService
) {
  @GetMapping("/prefectures/")
  @ApiOperation(value = "都道府県を全県取得する", notes = "API詳細を書く")
  fun prefectures(): Mono<List<Prefecture>> = GlobalScope.mono { addressService.getAllPrefectures() }

  @GetMapping("/prefecture/{prefectureCd:[0-4][0-9]}/")
  @ApiOperation(value = "指定した都道府県をパスパラメータで1件取得する", notes = "API詳細を書く")
  fun prefecture(
    @ApiParam(value = "都道府県2桁コード", required = true) @PathVariable("prefectureCd") prefectureCd: String
  ): Mono<Prefecture> = GlobalScope.mono {
    addressService.getPrefecture(prefectureCd)
      ?: throw RuntimeException("Prefecture [$prefectureCd] is not found.")
  }

  @GetMapping("/prefecture/")
  @ApiOperation(value = "指定した都道府県をQueryStringで複数件取得する", notes = "API詳細を書く")
  fun getPrefectureOfQueryString(
    @ApiParam(value = "都道府県2桁コード", required = true, allowMultiple = true) @RequestParam("prefectureCd") prefectureCd: List<String>
  ): Mono<List<Prefecture>> = GlobalScope.mono {
    addressService.getPrefectures(prefectureCd) ?: throw RuntimeException("Prefecture [$prefectureCd] is not found.")
  }
}
