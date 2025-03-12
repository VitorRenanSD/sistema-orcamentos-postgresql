plugins {
    id("java")
}

group = "org.vitorrenansd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Conexao com PostgreSQL
    implementation("org.postgresql:postgresql:42.7.5")
    // Leitura de arquivo .env
    implementation("io.github.cdimascio:java-dotenv:5.2.2")
}

tasks.test {
    useJUnitPlatform()
}