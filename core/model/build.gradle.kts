
plugins {
    alias(libs.plugins.appdevcon.android.library)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.model"
}

dependencies {
    api(libs.kotlinx.datetime)
    api(libs.gson)
}