plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.lib.compose)
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.holidaypirates.appdevconworkshopap.core.ui"
}

dependencies {
    implementation(projects.core.designsystem)

    implementation(libs.compose.lottie)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
}
