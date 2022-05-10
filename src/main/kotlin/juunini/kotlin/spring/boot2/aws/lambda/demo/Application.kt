package juunini.kotlin.spring.boot2.aws.lambda.demo

import juunini.kotlin.spring.boot2.aws.lambda.demo.controllers.HelloController
import juunini.kotlin.spring.boot2.aws.lambda.demo.controllers.WorldController

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.HandlerAdapter
import org.springframework.web.servlet.HandlerMapping
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping

@SpringBootApplication
@Import(
	HelloController::class,
	WorldController::class,
)
open class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

// silence console logging
@Value("#{logging.level.root:OFF}")
var message: String = "";

/*
 * Create required HandlerMapping, to avoid several default HandlerMapping instances being created
 */
@Bean
fun handlerMapping(): HandlerMapping = RequestMappingHandlerMapping()

/*
 * Create required HandlerAdapter, to avoid several default HandlerAdapter instances being created
 */
@Bean
fun handlerAdapter(): HandlerAdapter = RequestMappingHandlerAdapter()
