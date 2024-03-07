plugins {
    alias(libs.plugins.appdevcon.android.feature)
    alias(libs.plugins.appdevcon.lib.compose)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.feature.one"
}

dependencies {
    api(projects.core.domain)
    implementation(projects.core.ui)
    implementation(libs.compose.paging)
}
