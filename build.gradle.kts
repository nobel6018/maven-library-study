plugins {
    kotlin("jvm") version "1.8.21"
    id("maven-publish")
    application
}

group = "me.leedo"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "MyRepo"
            url = uri("file://${buildDir}/repos")
        }
    }
}