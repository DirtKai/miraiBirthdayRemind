plugins {
    val kotlinVersion = "1.4.30"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.8.3"
}

group = "dirtkai"
version = "0.1.0"


repositories {
    //mavenLocal()
    maven("https://maven.aliyun.com/repository/central")
    maven("https://maven.aliyun.com/repository/jcenter")
    maven("https://maven.aliyun.com/repository/public")
    maven("http://mirrors.cloud.tencent.com/nexus/repository/maven-public")
    maven("https://mirrors.huaweicloud.com/repository/maven/")
    //mavenCentral()
    // 阿里云国内代理仓库
    //jcenter()
}
val exposedVersion: String by project
dependencies {
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jodatime:$exposedVersion")

    // for H2
    implementation("com.h2database:h2:2.0.202")
    // for logging (StdOutSqlLogger), see
    // http://www.slf4j.org/codes.html#StaticLoggerBinder
    implementation("org.slf4j:slf4j-nop:1.7.32")
    implementation("mysql:mysql-connector-java:8.0.22")
}

