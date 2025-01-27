plugins {
    kotlin("jvm") version "1.8.10"
    id("org.springframework.boot") version "2.5.4"
    `java-library`
    application
}

application{
    mainClass.set("com.employee.app.Main");
}

dependencies{
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":app"))
}

group = "com.employee" // Set your group ID here
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}
