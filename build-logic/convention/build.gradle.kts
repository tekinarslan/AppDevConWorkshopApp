
plugins {
    `kotlin-dsl`
}

group = "com.holidaypirates.appdevconworkshopapp.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        plugins {
            register("androidApp") {
                id = "appdevcon.application"
                implementationClass = "plugins.AndroidAppConventionPlugin"
            }
            register("androidAppCompose") {
                id = "appdevcon.compose"
                implementationClass = "plugins.AndroidAppComposeConventionPlugin"
            }
            register("androidLibCompose") {
                id = "appdevcon.lib.compose"
                implementationClass = "plugins.AndroidLibraryComposeConventionPlugin"
            }
            register("androidFeature") {
                id = "appdevcon.android.feature"
                implementationClass = "plugins.AndroidFeatureConventionPlugin"
            }
            register("androidLib") {
                id = "appdevcon.android.library"
                implementationClass = "plugins.AndroidLibraryConventionPlugin"
            }
            register("androidHilt") {
                id = "appdevcon.hilt"
                implementationClass = "plugins.AndroidHiltConventionPlugin"
            }
        }
    }
}