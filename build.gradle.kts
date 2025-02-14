// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.hilt.plugin) apply false
//    alias(libs.plugins.google.services) apply false // Firebase services alias
//    alias(libs.plugins.firebase.crashlytics) apply false // Firebase Crashlytics alias
    alias(libs.plugins.navigation.safe.args.gradle.plugin) apply false
}