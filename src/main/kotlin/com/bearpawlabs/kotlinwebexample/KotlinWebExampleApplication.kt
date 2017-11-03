package com.bearpawlabs.kotlinwebexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinWebExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinWebExampleApplication::class.java, *args)
}
