pluginManagement {
    includeBuild("build-logic-java8")
    includeBuild("build-logic-java11")
}

if (JavaVersion.current() <= JavaVersion.VERSION_1_8) {
    throw IllegalStateException("This reproducer must be run with Java > 8")
}
