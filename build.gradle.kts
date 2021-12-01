plugins {
    java
    id("io.quarkus")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:2.5.1.Final"))

    implementation("io.quarkus:quarkus-resteasy")

    testImplementation("io.quarkus:quarkus-junit5-mockito")
    testImplementation("org.mockito:mockito-core:4.0.0")
    testImplementation("io.rest-assured:rest-assured:4.4.0")
}

group = "com.mrhaki"
version = "0.1.0-SNAPSHOT"
description = "ccnl-christmas-challenge"
java.sourceCompatibility = JavaVersion.VERSION_17

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
