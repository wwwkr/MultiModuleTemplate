import com.wwwkr.app.setNamespace

plugins {
    id("wwwkr.android.library")
}

android {
    setNamespace("core.domain")
}

dependencies {
    implementation(projects.core.dataApi)
    implementation(projects.core.model)

    implementation(libs.inject)
}
