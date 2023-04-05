plugins {
    id("org.springframework.boot") version ("2.7.8")
    id("io.spring.dependency-management") version ("1.1.0")
    id("com.github.ben-manes.versions") version ("0.46.0")
    id("com.diffplug.spotless") version ("6.17.0")
    id("org.jetbrains.kotlin.jvm") version ("1.8.20")
    id("org.jetbrains.kotlin.plugin.spring") version ("1.8.20")
}

dependencies {
    implementation("software.amazon.awssdk:s3:2.20.39")
}
