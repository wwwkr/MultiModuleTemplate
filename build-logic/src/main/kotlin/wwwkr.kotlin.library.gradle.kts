import com.wwwkr.app.configureKotest
import com.wwwkr.app.configureKotlin
import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
    id("wwwkr.verify.detekt")
}

configureKotlin()
configureKotest()
