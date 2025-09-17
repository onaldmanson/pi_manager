plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://storage.googleapis.com/download.flutter.io")
    }
}
