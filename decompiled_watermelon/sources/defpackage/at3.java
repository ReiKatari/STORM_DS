package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: at3  reason: default package */
/* loaded from: classes.dex */
public abstract class at3 {
    public static final qz5 a = new qz5("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
