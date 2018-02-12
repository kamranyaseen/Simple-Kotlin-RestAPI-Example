package com.kamranyaseen.requestmapping

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
open class KotlinSpringMVCRequestMapping

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringMVCRequestMapping::class.java, *args)
}