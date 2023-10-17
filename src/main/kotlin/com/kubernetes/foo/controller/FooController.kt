package com.kubernetes.foo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController {
    @ResponseBody
    @GetMapping("/foo")
    fun foo(): String {
        return "foo"
    }
}