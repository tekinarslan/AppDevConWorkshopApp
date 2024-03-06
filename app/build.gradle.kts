import extensions.addCoreDesignSystemModule
import extensions.addCoreUIModule

plugins {
    alias(libs.plugins.appdevcon.application)
    alias(libs.plugins.appdevcon.compose)
    alias(libs.plugins.appdevcon.hilt)
}
dependencyGuard {
    configuration("prodReleaseRuntimeClasspath")
}
dependencies{
    addCoreUIModule()
    addCoreDesignSystemModule()
}