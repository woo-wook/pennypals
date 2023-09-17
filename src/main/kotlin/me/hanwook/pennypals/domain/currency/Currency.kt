package me.hanwook.pennypals.domain.currency

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
class Currency(
    @Id
    val currencyCode: CurrencyCode,
    var exchangeRate: Double? = null
)