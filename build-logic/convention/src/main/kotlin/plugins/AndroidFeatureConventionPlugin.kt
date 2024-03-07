package plugins

import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("appdevcon.android.library")
                apply("appdevcon.hilt")
            }

            dependencies {
                add("implementation", project(":core:ui"))
                add("implementation", project(":core:designsystem"))

                add("implementation", versionCatalog().findLibrary("hilt.navigation.compose").get())
                add("implementation", versionCatalog().findLibrary("androidx.lifecycle.runtime.compose").get())
                add("implementation", versionCatalog().findLibrary("androidx.lifecycle.viewmodel.compose").get())
            }
        }
    }
}
