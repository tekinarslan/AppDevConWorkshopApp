package extensions

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

// modules
fun DependencyHandler.addCoreUIModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:ui")))
}

fun DependencyHandler.addCoreUIModule() {
    implementDependency(Dependency.Implementation(project(":core:ui")))
}

fun DependencyHandler.addCoreDesignSystemModule() {
    implementDependency(Dependency.Implementation(project(":core:designsystem")))
}

fun DependencyHandler.addCoreNetworkModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:network")))
}

fun DependencyHandler.addCoreNetworkModule() {
    implementDependency(Dependency.Implementation(project(":core:network")))
}

fun DependencyHandler.addCoreCommonModule() {
    implementDependency(Dependency.Implementation(project(":core:common")))
}

fun DependencyHandler.addCoreCommonModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:common")))
}

fun DependencyHandler.addCoreDataModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:data")))
}

fun DependencyHandler.addCoreDomainModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:domain")))
}

fun DependencyHandler.addCoreDomainModule() {
    implementDependency(Dependency.Implementation(project(":core:domain")))
}

fun DependencyHandler.addCoreModelModuleAsApi() {
    implementDependency(Dependency.ApiImplementation(project(":core:model")))
}