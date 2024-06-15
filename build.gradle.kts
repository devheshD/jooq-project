import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.meta.jaxb.ForcedType
import org.jooq.meta.jaxb.Logging

val jooqVersion: String by extra { "3.19.9" }

plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    // 이건 왜 추가가 필요한지 알아야겠다.
    id("nu.studer.jooq") version "9.0"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

group = "com.devhesh"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    // DefaultGeneratorStrategy를 가져올수 있음
//    implementation("org.jooq:jooq-codegen:$jooqVersion")
    runtimeOnly("com.mysql:mysql-connector-j")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    // spring-boot-starter jooq 버전이 최신이여서 필요 X
    // implementation("org.jooq:jooq:$jooqVersion")

    jooqGenerator("com.mysql:mysql-connector-j")
    jooqGenerator("org.jooq:jooq:$jooqVersion")
    jooqGenerator("org.jooq:jooq-meta:$jooqVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// https://github.com/etiennestuder/gradle-jooq-plugin
jooq {
    version.set(jooqVersion)
    edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)  // default (can be omitted)

    configurations {
        create("main") {  // name of the jOOQ configuration
            generateSchemaSourceOnCompilation.set(true)  // default (can be omitted)

            jooqConfiguration.apply {
                logging = Logging.WARN

                jdbc.apply {
                    driver = "com.mysql.cj.jdbc.Driver"
                    url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=Asia/Seoul&characterEncoding=UTF-8"
                    user = "root"
                    password = "root"
                }
                generator.apply {
                    name = "org.jooq.codegen.DefaultGenerator"
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"

                    database.apply {
                        inputSchema = "sakila"
                        isUnsignedTypes = true
                        forcedTypes.addAll(
                            arrayOf(
                                ForcedType()
                                    .withUserType("java.lang.Long")
                                    .withIncludeTypes("int unsigned"),
                                ForcedType()
                                    .withUserType("java.lang.Integer")
                                    .withIncludeTypes("tinyint unsigned"),
                                ForcedType()
                                    .withUserType("java.lang.Integer")
                                    .withIncludeTypes("smallest unsigned"),
                            )
                        )
                    }

                    generate.apply {
                        isDaos = true
                        isRecords = true
                        isFluentSetters = true
                        isJavaTimeTypes = true
                        isDeprecated = false

//                        isPojos = true
                    }
                    // target : 어느 곳에 DSL을 생성시킬것인가를 구성
                    target.apply {
                        packageName = "com.devhesh.jooqproject.generated"
                        directory = "src/generated/jooq"
                    }
                }
            }
        }
    }
}
