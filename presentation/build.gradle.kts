plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // Add Hilt and KSP for ViewModel injection
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.nutapos.presentation"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
    }

    // Enable ViewBinding for your XML layouts
    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    // Internal Modules
    implementation(project(":domain"))
    implementation(project(":core"))

    // Hilt Presentation Dependencies
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // UI & Navigation (XML based)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
}