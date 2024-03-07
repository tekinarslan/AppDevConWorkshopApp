plugins {
    alias(libs.plugins.appdevcon.application)
    alias(libs.plugins.appdevcon.compose)
    alias(libs.plugins.appdevcon.hilt)
}

dependencyGuard {
    configuration("prodReleaseRuntimeClasspath")
}
dependencies{
    implementation(projects.core.ui)
    implementation(projects.core.designsystem)
    implementation(projects.feature.featureOne)
}