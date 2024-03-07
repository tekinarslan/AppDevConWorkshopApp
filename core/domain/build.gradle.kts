plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.domain"
}

dependencies {
    api(projects.core.model)
    implementation(projects.core.data)
}