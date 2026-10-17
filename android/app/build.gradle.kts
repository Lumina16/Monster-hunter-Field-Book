plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.lumina.monsterhunterfieldbook"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.lumina.monsterhunterfieldbook"
        minSdk = 24
        targetSdk = 36
        versionCode = 2
        versionName = "0.2.0"
        testInstrumentationRunner = "android.test.InstrumentationTestRunner"
    }
    buildTypes {
        release { isMinifyEnabled = false }
    }
    signingConfigs.getByName("debug") {
        providers.gradleProperty("fieldBookSigningStore").orNull?.let {
            storeFile = file(it)
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
    sourceSets["main"].assets.srcDir(layout.buildDirectory.dir("generated/nativeAssets"))
    androidResources { noCompress += listOf("db", "mp3", "wav") }
    testOptions { unitTests.isIncludeAndroidResources = true }
}

val prepareNativeAssets by tasks.registering(Exec::class) {
    workingDir(rootProject.projectDir.parentFile)
    commandLine("python3", "android/tools/prepare_assets.py", "--output", layout.buildDirectory.dir("generated/nativeAssets").get().asFile.absolutePath)
    inputs.files(fileTree("${rootProject.projectDir.parent}/src"), fileTree("${rootProject.projectDir.parent}/data"), fileTree("${rootProject.projectDir.parent}/assets/embedded"), rootProject.file("tools/prepare_assets.py"))
    outputs.dir(layout.buildDirectory.dir("generated/nativeAssets"))
}
tasks.named("preBuild").configure { dependsOn(prepareNativeAssets) }
dependencies {
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.robolectric:robolectric:4.16")
}
