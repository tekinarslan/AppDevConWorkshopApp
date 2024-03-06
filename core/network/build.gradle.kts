import extensions.addCoreCommonModuleAsApi
import extensions.addCoreDataModuleAsApi
import extensions.addCoreModelModuleAsApi

/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    alias(libs.plugins.appdevcon.android.library)
    alias(libs.plugins.appdevcon.hilt)
}

android {
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.holidaypirates.appdevconworkshopap.core.network"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    addCoreCommonModuleAsApi()
    addCoreDataModuleAsApi()
    addCoreModelModuleAsApi()
    api(libs.kotlinx.datetime)
    api(libs.okhttp.logging)
    api(libs.retrofit.core)
    api(libs.retrofit.kotlin.serialization)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.coroutines.android)
    implementation(libs.coroutines.core)
    implementation(libs.javax.inject)

    testImplementation(libs.coroutines.test)
}
