plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

// sisanya (android { ... } / dependencies { ... }) biarkan seperti biasa


android {
    namespace = "com.example.app"          // ganti sesuai paketmu
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.app"  // ganti sesuai paketmu
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
        }
        getByName("release") {
            // shrink resources butuh minify
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
