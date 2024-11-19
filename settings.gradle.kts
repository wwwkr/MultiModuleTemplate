pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MultiModuleTemplate"
include(":app")

// core
include(
    ":core:designsystem",
    ":core:data",
    ":core:data-api",
    ":core:domain",
    ":core:navigation",
    ":core:model",
//    ":core:ui",
//    ":core:ui-test-hilt-manifest",
//    ":core:testing",
//    ":core:datastore",
)

// Feature
include(
    ":feature:main"
)