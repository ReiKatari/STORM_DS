package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd4  reason: default package */
/* loaded from: classes.dex */
public abstract class fd4 {
    public static final q50 b = new q50(false, 2);
    public static final p50 c = new p50(true, 4);
    public static final p50 d = new p50(true, 5);
    public static final q50 e = new q50(false, 3);
    public static final p50 f = new p50(true, 6);
    public static final p50 g = new p50(true, 7);
    public static final q50 h = new q50(false, 1);
    public static final p50 i = new p50(true, 2);
    public static final p50 j = new p50(true, 3);
    public static final q50 k = new q50(false, 0);
    public static final p50 l = new p50(true, 0);
    public static final p50 m = new p50(true, 1);
    public static final q50 n = new q50(true, 4);
    public static final p50 o = new p50(true, 8);
    public static final p50 p = new p50(true, 9);
    public final boolean a;

    public fd4(boolean z) {
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
