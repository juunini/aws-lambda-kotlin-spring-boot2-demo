package juunini.kotlin.spring.boot2.aws.lambda.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
