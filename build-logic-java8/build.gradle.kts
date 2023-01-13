plugins {
    `kotlin-dsl`
}

//java {
//    toolchain {
//        languageVersion.set(JavaLanguageVersion.of(8))
//    }
//}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlinDslPluginOptions {
    jvmTarget.set("1.8")
}

repositories {
    mavenCentral()
}
