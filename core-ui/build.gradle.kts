plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

version = "1.0"

kotlin {
    android()
    ios()

    cocoapods {
        summary = "Some description for a Kotlin/Native module"
        homepage = "Link to a Kotlin/Native module homepage"
        ios.deploymentTarget = "12.0"
        frameworkName = "CoreUi"
        targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>{
            binaries.withType<org.jetbrains.kotlin.gradle.plugin.mpp.Framework>{
                isStatic = false
            }
        }
    }

    sourceSets {
        val commonMain by getting
        val androidMain by getting
        val iosMain by getting
    }

}

android {
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(29)
    }
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
}