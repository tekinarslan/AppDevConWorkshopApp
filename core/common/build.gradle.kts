plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.lib.compose)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.common"
}

dependencies {
    api(libs.compose.paging)
    api(libs.accompanist.swiperefresh)
    api(libs.androidx.navigation.compose)
}
