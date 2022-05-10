package juunini.kotlin.spring.boot2.aws.lambda.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/world")
open class WorldController {
  @GetMapping
  fun world(): String = "world"

  @PostMapping("/hello")
  fun worldHello(): String = "World, Hello!"
}
