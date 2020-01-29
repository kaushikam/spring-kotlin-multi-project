plugins {
    kotlin("jvm")
    application
}

application {
    mainClassName = "com.kaushikam.example.HelloApp"
}

dependencies {
    compile(project(":kotlin-lib"))
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}