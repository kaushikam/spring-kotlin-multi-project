// import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version ("1.3.61") apply false
}

allprojects {
    group = "com.kaushikam.example"
    version = "0.0.1"

    repositories {
        jcenter()
    }
}

subprojects {
    apply(plugin="org.jetbrains.kotlin.jvm")

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    dependencies {
        val testImplementation by configurations
        testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")
    }

    /*project.the<SourceSetContainer>()["main"].withConvention(KotlinSourceSet::class) {
        kotlin.srcDir("src/main/myKotlin")
    }*/
}
