package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures.compose = true
        composeOptions.kotlinCompilerExtensionVersion =
            versionCatalog().findVersion("compose-compiler").get().toString()

        dependencies {
            val bom = versionCatalog().findLibrary("androidx-compose-bom").get()
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))
            add("implementation", versionCatalog().findLibrary("androidx-activity-compose").get())
            add("implementation", versionCatalog().findLibrary("androidx-compose-ui-tooling-preview").get())
            add("debugImplementation", versionCatalog().findLibrary("androidx-compose-ui-tooling").get())
        }
    }
}