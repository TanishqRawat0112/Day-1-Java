plugins {
    kotlin("jvm") version "1.8.10" // Ensure this matches your Kotlin version
    id("org.springframework.boot") version "2.5.4" // Include Spring Boot plugin if using Spring
    `java-library`
    application
}

application{
    mainClass.set("com.employee.app.Main");
}

repositories {
    mavenCentral() // Use Maven Central for dependencies
}

dependencies {
    // Kotlin Standard Library
    implementation(kotlin("stdlib"))

    // SLF4J API
    implementation("org.slf4j:slf4j-api:2.0.7")

    // Logback Classic (SLF4J implementation)
    implementation("ch.qos.logback:logback-classic:1.4.11")

    // JUnit for testing
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // Subproject dependencies
    implementation(project(":core"))
    implementation(project(":data"))
    implementation(project(":logging"))
}

tasks.test {
    useJUnitPlatform() // Use JUnit Platform for tests
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Ensure JDK 17 compatibility
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
