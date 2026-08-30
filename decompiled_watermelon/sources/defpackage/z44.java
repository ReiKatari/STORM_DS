package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z44  reason: default package */
/* loaded from: classes.dex */
public abstract class z44 {
    public static final s30 b = new s30(2, false);
    public static final r30 c = new r30(4, true);
    public static final r30 d = new r30(5, true);
    public static final s30 e = new s30(3, false);
    public static final r30 f = new r30(6, true);
    public static final r30 g = new r30(7, true);
    public static final s30 h = new s30(1, false);
    public static final r30 i = new r30(2, true);
    public static final r30 j = new r30(3, true);
    public static final s30 k = new s30(0, false);
    public static final r30 l = new r30(0, true);
    public static final r30 m = new r30(1, true);
    public static final s30 n = new s30(4, true);
    public static final r30 o = new r30(8, true);
    public static final r30 p = new r30(9, true);
    public final boolean a;

    public z44(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
