plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tripdashboard"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tripdashboard"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Material Design
    implementation("com.google.android.material:material:1.1.0")

    // Rounded ImageView
    implementation("com.makeramen:roundedimageview:2.3.0")

    // Smooth Bottom Bar
    implementation("com.github.ibrahimsn98:SmoothBottomBar:1.7.3")

    //Scalabe Size Units(Support for different screen sizes)
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")
}