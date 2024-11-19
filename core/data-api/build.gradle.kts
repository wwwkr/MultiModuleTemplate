import com.wwwkr.app.setNamespace

plugins {
    id("wwwkr.android.library")
    id("kotlinx-serialization")
}

android {
    setNamespace("core.data.api")
}

dependencies {
    implementation(projects.core.model)
}
