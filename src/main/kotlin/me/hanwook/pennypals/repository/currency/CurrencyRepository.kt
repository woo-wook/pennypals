package me.hanwook.pennypals.repository.currency

import me.hanwook.pennypals.domain.currency.Currency
import me.hanwook.pennypals.domain.currency.CurrencyCode
import org.springframework.data.jpa.repository.JpaRepository

interface CurrencyRepository: JpaRepository<Currency, CurrencyCode>