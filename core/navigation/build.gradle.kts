import com.wwwkr.app.setNamespace

plugins {
    id("wwwkr.android.library")
    id("wwwkr.android.compose")
    alias(libs.plugins.kotlin.serialization)
}

android {
    setNamespace("core.navigation")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}
