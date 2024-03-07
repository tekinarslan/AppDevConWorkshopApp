plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.lib.compose)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.testing"
}

dependencies {
    api(kotlin("test"))
    api(libs.androidx.compose.ui.test)
    api(libs.androidx.compose.ui.test.junit4)

    implementation(libs.hilt.android.testing)
    implementation(libs.androidx.test.rules)
    implementation(libs.androidx.test.runner)
    implementation(libs.androidx.test.core)
    implementation(libs.androidx.espresso.core)
    implementation(libs.kotlinx.coroutines.test)
    implementation(libs.androidx.test.ext)
}
