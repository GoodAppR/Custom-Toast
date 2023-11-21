pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
        maven {
            url = uri("https://jitpack.io")
            content { includeGroup("com.github.GoodAppR") }
        }
        maven {
            url = uri("https://github.com/GoodAppR/Custom-Toast")
            content { excludeGroupByRegex("com\\.github.GoodAppR.*") }
        }
    }
}

rootProject.name = "Toast"
include(":app")
include(":toast")
