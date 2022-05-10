package juunini.kotlin.spring.boot2.aws.lambda.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
open class HelloController {
  @GetMapping
  fun hello(): String = "hello"

  @PostMapping("/world")
  fun helloWorld(): String = "Hello, World!"
}
