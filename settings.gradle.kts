rootProject.name = "minecraft-fast-command"

include(":minecraft-fast-command-spigot")

pluginManagement {
    repositories {
        mavenLocal()
        maven {
            name = "aliyun-central"
            url = uri("https://maven.aliyun.com/repository/central/")
        }
        maven {
            name = "sonatype-public"
            url = uri("https://oss.sonatype.org/content/groups/public/")
        }
        gradlePluginPortal()
        mavenCentral()
    }
}

buildscript {
    repositories {
        mavenLocal()
        maven {
            name = "aliyun-central"
            url = uri("https://maven.aliyun.com/repository/central/")
        }
        maven {
            name = "sonatype-public"
            url = uri("https://oss.sonatype.org/content/groups/public/")
        }
        mavenCentral()
    }
    dependencies {
        classpath("org.apache.commons:commons-lang3:3.14.0")
    }
}
