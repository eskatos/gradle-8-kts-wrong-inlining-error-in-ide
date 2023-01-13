plugins {
    `kotlin-dsl`
}

//java {
//    toolchain {
//        languageVersion.set(JavaLanguageVersion.of(11))
//    }
//}

kotlinDslPluginOptions {
    jvmTarget.set("11")
}

repositories {
    mavenCentral()
}
