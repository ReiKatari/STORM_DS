package a5;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z {
    public static Object a(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList b(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object c(Intent intent) {
        return intent.getParcelableExtra("key_rom_info", eg.h.class);
    }

    public static d0.a0 d(x.j jVar) {
        Long l10 = (Long) jVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l10 != null) {
            return (d0.a0) y.a.f14631a.get(l10);
        }
        return null;
    }

    public static String e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void g(m0 m0Var, y yVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (yVar != null && (findOnBackInvokedDispatcher = m0Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, yVar);
        }
    }

    public static final void h(m0 m0Var, y yVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (yVar != null && (findOnBackInvokedDispatcher = m0Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(yVar);
        }
    }

    public static Parcelable i(Parcel parcel, ClassLoader classLoader, Class cls) {
        return (Parcelable) parcel.readParcelable(classLoader, cls);
    }

    public static void j(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
