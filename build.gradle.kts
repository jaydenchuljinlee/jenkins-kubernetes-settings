import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.cloud.tools.jib.api.buildplan.*
plugins {
	id("org.springframework.boot") version "2.7.17-SNAPSHOT"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("com.google.cloud.tools.jib") version "3.2.0"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.kubernetes"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

jib {
	from {
		// 미입력 시 adoptopenjdk:11-jre
	}
	to {
		image = "server-foo"
		tags = mutableSetOf("latest")
	}
	container {
		jvmFlags = mutableListOf("-Xms128m", "-Xmx128m")
		creationTime= "USE_CURRENT_TIMESTAMP"
		format= ImageFormat.OCI
		// volumes = mutableListOf("/var/tmp")
		// entrypoint=["java", "-Dspring.profiles.active=${USE_PROFILE}", "-Dnormal.prop=${NORM_PROP}", "", '-cp',  '/app/resources:/app/classes:/app/libs/*', 'com.browndwarf.dockerwebservice.DockerwebserviceApplication']
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
