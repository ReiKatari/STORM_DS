package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o32  reason: default package */
/* loaded from: classes.dex */
public final class o32 {
    public static volatile o32 a;
    public static final o32 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o32] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static o32 a() {
        o32 o32Var;
        o32 o32Var2 = a;
        if (o32Var2 == null) {
            synchronized (o32.class) {
                try {
                    o32Var = a;
                    if (o32Var == null) {
                        Class cls = n32.a;
                        o32 o32Var3 = null;
                        if (cls != null) {
                            try {
                                o32Var3 = (o32) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (o32Var3 != null) {
                            o32Var = o32Var3;
                        } else {
                            o32Var = b;
                        }
                        a = o32Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return o32Var;
        }
        return o32Var2;
    }
}
