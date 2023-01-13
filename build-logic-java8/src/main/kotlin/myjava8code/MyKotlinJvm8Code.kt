package myjava8code

inline fun <reified T : Any> myJvm8InlineFunction() {
    println("myJvm8InlineFunction<${T::class.qualifiedName}>()")
}