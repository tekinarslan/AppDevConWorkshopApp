import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
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
                implementationClass = "plugins.AndroidLibComposeConventionPlugin"
            }
            register("androidLib") {
                id = "appdevcon.android.library"
                implementationClass = "plugins.AndroidLibConventionPlugin"
            }
            register("androidHilt") {
                id = "appdevcon.hilt"
                implementationClass = "plugins.AndroidHiltConventionPlugin"
            }
        }
    }
}