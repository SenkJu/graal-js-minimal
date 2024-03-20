plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.graalvm.polyglot:polyglot:23.1.1")
    implementation("org.graalvm.polyglot:js-community:23.1.1")
}

tasks.test {
    useJUnitPlatform()
}