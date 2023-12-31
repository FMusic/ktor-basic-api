val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val koinVersion: String by project

plugins {
    kotlin("jvm") version "1.9.10"
    id("io.ktor.plugin") version "2.3.3"
}

group = "demo.example"
version = "0.0.1"

application {
    mainClass.set("demo.example.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-host-common-jvm")
    implementation("io.ktor:ktor-server-status-pages-jvm")
    implementation("io.ktor:ktor-server-cors-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-gson-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logback_version")


    implementation("io.ktor:ktor-server-swagger:$ktor_version")

    implementation("io.insert-koin:koin-ktor:$koinVersion")

    implementation("io.swagger.core.v3:swagger-annotations:2.1.7")
    implementation("io.swagger.core.v3:swagger-jaxrs2:2.1.7")

    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
