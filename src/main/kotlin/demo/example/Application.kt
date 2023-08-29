package demo.example

import io.ktor.server.application.Application
import demo.example.plugins.configureHTTP
import demo.example.plugins.configureKoin
import demo.example.plugins.configureRouting
import demo.example.plugins.configureSerialization

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureKoin()
    configureHTTP()
    configureSerialization()
    configureRouting()
}
