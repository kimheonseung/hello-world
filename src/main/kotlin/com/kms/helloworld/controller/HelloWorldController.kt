package com.kms.helloworld.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/hello-world")
class HelloWorldController(
    @Value("\${cm.custom.message}")
    val customMessage: String,
    @Value("\${sec.custom.message}")
    val customSecMessage: String,
) {



    @GetMapping
    fun getHelloWorld() = "hello! ${LocalDateTime.now()}. cmCustomMessage: $customMessage, customSecMessage: $customSecMessage"
}