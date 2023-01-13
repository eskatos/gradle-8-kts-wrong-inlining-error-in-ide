import myjava8code.*
import myjava11code.*

plugins {
    id("my-java8-plugin")
    id("my-java11-plugin")
}

myJvm8InlineFunction<MyKotlinJVM11Code>()
