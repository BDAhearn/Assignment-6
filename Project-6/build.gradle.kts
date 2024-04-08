// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

ext {
    val kotlin_version by extra ("1.4.21")
    val coroutines_version by extra ("1.4.2")
    val retrofit_version by extra ("2.9.0")
    val lifecycle_version by extra ("2.3.0")
}