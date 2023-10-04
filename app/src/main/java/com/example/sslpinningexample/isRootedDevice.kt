package com.example.sslpinningexample

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

fun isRootedDevice(): Boolean {
    return checkRootMethod1() || checkRootMethod2()
}

// Method 1: Check for common root binaries
private fun checkRootMethod1(): Boolean {
    val buildTags = android.os.Build.TAGS
    return buildTags != null && buildTags.contains("test-keys")
}

// Method 2: Check for known root file existence
private fun checkRootMethod2(): Boolean {
    val paths = arrayOf(
        "/system/app/Superuser.apk",
        "/sbin/su",
        "/system/bin/su",
        "/system/xbin/su",
        "/data/local/xbin/su",
        "/data/local/bin/su",
        "/system/sd/xbin/su",
        "/system/bin/failsafe/su",
        "/data/local/su"
    )

    for (path in paths) {
        if (File(path).exists()) {
            return true
        }
    }

    return false
}
