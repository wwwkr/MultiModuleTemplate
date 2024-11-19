import com.wwwkr.app.configureHiltAndroid
import com.wwwkr.app.configureKotestAndroid
import com.wwwkr.app.configureKotlinAndroid
import com.wwwkr.app.configureRoborazzi

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()
configureRoborazzi()
