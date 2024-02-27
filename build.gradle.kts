plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.h2database:h2:2.2.224")
    implementation ("com.google.code.gson:gson:2.10.1")

}

tasks.test {
    useJUnitPlatform()
}