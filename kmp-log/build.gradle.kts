import org.jetbrains.dokka.versioning.VersioningConfiguration
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework
import java.net.URL

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("convention.publication")
    id("org.jetbrains.dokka")
}

android {
    namespace = "com.renfrowtech.kmp.log"
    compileSdk = 32
    defaultConfig {
        minSdk = 21
    }
}

group = "com.renfrowtech"
version = "0.1.2"

publishing {
    repositories {
        maven {

        }
    }
}
kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }

        publishLibraryVariants("release")
    }

    val xcf = XCFramework()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "kmp-log"
            xcf.add(this)
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("reflect"))
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.5.0")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.0-Beta")

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.0-Beta")
                implementation(kotlin("stdlib-jdk8"))
                implementation("com.google.code.gson:gson:2.10")
            }
        }
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

buildscript {
    dependencies {
        classpath("org.jetbrains.dokka:versioning-plugin:1.8.10")
    }
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaTask>().configureEach {
    pluginConfiguration<org.jetbrains.dokka.versioning.VersioningPlugin, VersioningConfiguration> {
        version = "$version"
        olderVersionsDir = rootDir.resolve("docs/archive")
    }

    dokkaSourceSets {
        named("commonMain") {

            outputDirectory.set(rootDir.resolve("docs"))

            moduleName.set("KMP-Log")

            sourceLink {
                localDirectory.set(file("src/commonMain/kotlin"))
                remoteUrl.set(
                    URL(
                        "https://github.com/renfrowtech/kmp-log/tree/main/kmp-log/src/commonMain/kotlin"
                    )
                )
                remoteLineSuffix.set("#L")
            }
        }
        named("androidMain") {
            outputDirectory.set(projectDir.resolve("docs"))

            moduleName.set("KMP-Log-Android")

            sourceLink {
                localDirectory.set(file("src/androidMain/kotlin"))
                remoteUrl.set(
                    URL(
                        "https://github.com/renfrowtech/kmp-log/tree/main/" +
                                "kmp-log/src/androidMain/kotlin"
                    )
                )
                remoteLineSuffix.set("#L")
            }
        }
    }
}

dependencies {
    dokkaGfmPlugin("org.jetbrains.dokka:versioning-plugin:1.8.10")
    dokkaGfmPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.8.10")
}
