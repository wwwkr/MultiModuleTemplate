package com.wwwkr.app

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "com.wwwkr.app.$name"
    }
}