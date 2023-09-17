package me.hanwook.pennypals.controller.currency

import me.hanwook.pennypals.domain.currency.Currency
import me.hanwook.pennypals.service.currency.CurrencyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/currencies")
class CurrencyController(
    private val currencyService: CurrencyService
) {

    @GetMapping
    fun getCurrencies(): List<Currency> = currencyService.getCurrencies()
}