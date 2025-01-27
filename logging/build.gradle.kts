plugins {
    `java-library`
    java
}

dependencies {
    // SLF4J API
    implementation("org.slf4j:slf4j-api:2.0.7")
    // Logback implementation
    implementation("ch.qos.logback:logback-classic:1.4.11")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


