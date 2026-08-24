package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g82  reason: default package */
/* loaded from: classes.dex */
public final class g82 {
    public static volatile g82 a;
    public static final g82 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [g82, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static g82 a() {
        g82 g82Var;
        g82 g82Var2 = a;
        if (g82Var2 == null) {
            synchronized (g82.class) {
                try {
                    g82Var = a;
                    if (g82Var == null) {
                        Class cls = f82.a;
                        g82 g82Var3 = null;
                        if (cls != null) {
                            try {
                                g82Var3 = (g82) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (g82Var3 != null) {
                            g82Var = g82Var3;
                        } else {
                            g82Var = b;
                        }
                        a = g82Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g82Var;
        }
        return g82Var2;
    }
}
