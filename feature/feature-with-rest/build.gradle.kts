plugins {
    alias(libs.plugins.appdevcon.android.feature)
    alias(libs.plugins.appdevcon.lib.compose)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.feature.with.rest"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.ui)
    implementation(libs.compose.paging)

    testImplementation(projects.core.testing)

    androidTestImplementation(projects.core.testing)
}
