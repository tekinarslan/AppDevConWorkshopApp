import extensions.addCoreCommonModuleAsApi
import extensions.addCoreNetworkModuleAsApi
import extensions.addCoreDomainModuleAsApi

plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.data"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    addCoreNetworkModuleAsApi()
    addCoreCommonModuleAsApi()
    addCoreDomainModuleAsApi()
}
