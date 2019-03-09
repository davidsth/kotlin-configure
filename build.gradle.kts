plugins {
    kotlin("jvm") version ("1.3.11")
}

apply {
    plugin("kotlin")
    plugin("kotlin-kapt")
}

group = "dev.davidsth"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    compileOnly(project(":annotation"))
    kapt(project(":processor"))
}

