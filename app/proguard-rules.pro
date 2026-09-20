# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.kts.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keepclassmembers enum * { *; }

-keep class me.magnum.melonds.domain.model.RendererConfiguration { *; }
-keep class me.magnum.melonds.domain.model.FirmwareConfiguration { *; }
-keep class me.magnum.melonds.domain.model.EmulatorConfiguration { *; }
-keep class me.magnum.melonds.domain.model.DldiSdCardConfiguration { *; }
-keep class me.magnum.melonds.domain.model.Rect { *; }
-keep class me.magnum.melonds.domain.model.AudioBitrate { *; }
-keep class me.magnum.melonds.domain.model.AudioInterpolation { *; }
-keep class me.magnum.melonds.domain.model.AudioLatency { *; }
-keep class me.magnum.melonds.domain.model.ConsoleType { *; }
-keep class me.magnum.melonds.domain.model.MicSource { *; }
-keep class me.magnum.melonds.domain.model.Cheat { *; }
-keep class me.magnum.melonds.domain.model.DSiWareTitle { *; }
-keep class me.magnum.melonds.domain.model.VideoRenderer { *; }
-keep class me.magnum.melonds.domain.model.VideoFiltering { *; }
-keep class me.magnum.melonds.domain.model.VulkanPipelineProfile { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig { *; }
-keep class me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode { *; }
-keep class me.magnum.melonds.ui.emulator.render.FrameRenderCallback { *; }
-keep class me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig { *; }
-keep class me.magnum.melonds.domain.model.layout.BackgroundMode { *; }
-keep class me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState { *; }
-keep class me.magnum.melonds.ui.emulator.rewind.model.RewindWindow { *; }
-keep class me.magnum.melonds.ui.settings.fragments.**
-keep class me.magnum.melonds.common.UriFileHandler {
    public int open(java.lang.String, java.lang.String);
}
-keep interface me.magnum.melonds.common.camera.DSiCameraSource { *; }

# Migration fields. These rules are required for migrations to work properly
-keep,allowobfuscation class me.magnum.melonds.migrations.legacy.** { *; }

# Prevent DTOs and models from being obfuscated or removed
-keep class me.magnum.melonds.impl.dtos.** { *; }
-keep class me.magnum.rcheevosapi.dto.** { *; }
-keep class me.magnum.melonds.domain.model.rom.** { *; }
-keep class me.magnum.melonds.domain.model.Background { *; }
-keep class me.magnum.melonds.domain.model.BackgroundThumbnail { *; }

# Preserve Gson annotations and field names
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod
-keepclassmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
}
-keep,allowobfuscation,allowshrinking class com.google.gson.reflect.TypeToken
-keep,allowobfuscation,allowshrinking class * extends com.google.gson.reflect.TypeToken

# ROM Icon, Thumbnail, and Processor components
-keep class me.magnum.melonds.impl.RomIconProvider { *; }
-keep class me.magnum.melonds.impl.BackgroundThumbnailProvider { *; }
-keep class me.magnum.melonds.impl.image.** { *; }
-keep class me.magnum.melonds.utils.RomProcessor { *; }
-keep class me.magnum.melonds.common.romprocessors.** { *; }

# Coil image loading components
-keep class coil.** { *; }
-keep class * implements coil.fetch.Fetcher { *; }
-keep class * implements coil.fetch.Fetcher$Factory { *; }
-keepclassmembers class * implements coil.fetch.Fetcher$Factory { *; }

# Google ML Kit Text Recognition
-keep class com.google.mlkit.** { *; }
-keep interface com.google.mlkit.** { *; }
-dontwarn com.google.mlkit.**

# Google Play Services ML Kit & Vision
-keep class com.google.android.gms.vision.** { *; }
-keep class com.google.android.gms.internal.mlkit_** { *; }
-keep class com.google.android.gms.tasks.** { *; }
-keep class com.google.android.gms.common.** { *; }
-keep class com.google.android.gms.dynamite.** { *; }
-dontwarn com.google.android.gms.**
-keepclasseswithmembernames class * {
    native <methods>;
}

# Junrar, Apache Commons Compress & SLF4J
-dontwarn org.slf4j.**
-dontwarn com.github.junrar.**
-keep class com.github.junrar.** { *; }
-dontwarn org.apache.commons.compress.**
-keep class org.apache.commons.compress.** { *; }
