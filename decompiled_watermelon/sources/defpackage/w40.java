package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w40  reason: default package */
/* loaded from: classes.dex */
public final class w40 {
    public static final /* synthetic */ w40 a = new Object();
    public static final String b = x40.class.getSimpleName();

    public static x40 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return y40.A;
        }
        if (i >= 29) {
            return k45.L;
        }
        if (i >= 28) {
            return sn1.L;
        }
        return iq0.X;
    }
}
