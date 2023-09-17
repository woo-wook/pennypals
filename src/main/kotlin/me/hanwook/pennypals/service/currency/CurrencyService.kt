package me.hanwook.pennypals.service.currency

import me.hanwook.pennypals.domain.currency.Currency
import me.hanwook.pennypals.repository.currency.CurrencyRepository
import org.springframework.stereotype.Service

@Service
class CurrencyService(
    private val currencyRepository: CurrencyRepository
) {

    fun getCurrencies(): List<Currency> = currencyRepository.findAll()
}