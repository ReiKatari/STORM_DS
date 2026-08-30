package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p2  reason: default package */
/* loaded from: classes.dex */
public abstract class p2 {
    public static zw a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new yw(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new ax(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return zw.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static PackageInfo b(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList d(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object e(Intent intent) {
        return intent.getParcelableExtra("key_rom_info", xm5.class);
    }

    public static sm1 f(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((ia0) ce0Var).c(key);
        if (l != null) {
            return (sm1) tm1.a.get(l);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void i(yq4 yq4Var, jp jpVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (jpVar != null && (findOnBackInvokedDispatcher = yq4Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, jpVar);
        }
    }

    public static final void j(yq4 yq4Var, jp jpVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (jpVar != null && (findOnBackInvokedDispatcher = yq4Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(jpVar);
        }
    }

    public static Parcelable k(Parcel parcel, ClassLoader classLoader, Class cls) {
        return (Parcelable) parcel.readParcelable(classLoader, cls);
    }

    public static void l(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
