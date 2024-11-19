import com.wwwkr.app.configureCoroutineAndroid
import com.wwwkr.app.configureHiltAndroid
import com.wwwkr.app.configureKotest
import com.wwwkr.app.configureKotlinAndroid

plugins {
    id("com.android.library")
    id("wwwkr.verify.detekt")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
