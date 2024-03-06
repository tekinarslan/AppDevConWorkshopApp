import extensions.addCoreDataModuleAsApi
import extensions.addCoreModelModuleAsApi

plugins {
    alias(libs.plugins.appdevcon.android.library)
}

android {
    namespace = "com.holidaypirates.appdevconworkshopap.core.domain"
}

dependencies {
    addCoreDataModuleAsApi()
    addCoreModelModuleAsApi()

    implementation(libs.javax.inject)
}