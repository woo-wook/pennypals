package me.hanwook.pennypals

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PennypalsApplication

fun main(args: Array<String>) {
    runApplication<PennypalsApplication>(*args)
}
