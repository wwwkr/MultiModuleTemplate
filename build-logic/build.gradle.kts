plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.verify.detektPlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "wwwkr.android.hilt"
            implementationClass = "com.wwwkr.app.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "wwwkr.kotlin.hilt"
            implementationClass = "com.wwwkr.app.HiltKotlinPlugin"
        }
    }
}
