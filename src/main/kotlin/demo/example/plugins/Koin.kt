package demo.example.plugins

import demo.example.services.ApplicationService
import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin

fun Application.configureKoin() {
    install(Koin){
        modules(appModule)
    }
}

val appModule = module {
    single { ApplicationService() }
}