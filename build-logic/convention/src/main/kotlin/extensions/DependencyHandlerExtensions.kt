package extensions

import org.gradle.api.artifacts.dsl.DependencyHandler

// Util functions for easier adding different type of dependencies

sealed class Dependency {
    abstract val configurationName: Any
    abstract val dependencyNotation: Any

    data class Implementation(override val dependencyNotation: Any) : Dependency() {
        override val configurationName: Any
            get() = IMPLEMENTATION
    }

    data class ApiImplementation(override val dependencyNotation: Any) : Dependency() {
        override val configurationName: Any
            get() = API_IMPLEMENTATION
    }

    data class DebugImplementation(override val dependencyNotation: String) : Dependency() {
        override val configurationName: String
            get() = DEBUG_IMPLEMENTATION
    }

    companion object {
        private const val IMPLEMENTATION = "implementation"
        private const val API_IMPLEMENTATION = "api"
        private const val DEBUG_IMPLEMENTATION = "implementation"
    }
}

fun DependencyHandler.implementDependency(dependency: Dependency) {
    add(dependency.configurationName.toString(), dependency.dependencyNotation)
}

fun DependencyHandler.implementDependencyGroup(list: List<Dependency>) {
    list.forEach { dependency ->
        add(dependency.configurationName.toString(), dependency.dependencyNotation)
    }
}