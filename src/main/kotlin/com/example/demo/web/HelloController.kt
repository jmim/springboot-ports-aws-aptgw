package com.example.demo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime


@RestController("/api")
class HelloController {
    @GetMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot! ${LocalDateTime.now()}"
    }

    @GetMapping("/my-url")
    fun myUrl(): String {
        return "/my-url ${LocalDateTime.now()}"
    }

    @GetMapping("/test/another-url")
    fun onether(): String {
        return "/test/another-url  ${LocalDateTime.now()}"
    }

    @GetMapping("/app/another-url")
    fun app(): String {
        return "Greetings from Spring Boot!  ${LocalDateTime.now()}"
    }
}
