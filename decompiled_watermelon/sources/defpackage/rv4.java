package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rv4  reason: default package */
/* loaded from: classes.dex */
public final class rv4 {
    public static final rv4 c = new rv4();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final bq0 a = new bq0(1);

    public final cv5 a(Class cls) {
        boolean z;
        nv4 nv4Var;
        cv5 y;
        nv4 nv4Var2;
        Class cls2;
        s33.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        cv5 cv5Var = (cv5) concurrentHashMap.get(cls);
        if (cv5Var == null) {
            bq0 bq0Var = this.a;
            bq0Var.getClass();
            Class cls3 = dv5.a;
            if (!jl2.class.isAssignableFrom(cls) && (cls2 = dv5.a) != null && !cls2.isAssignableFrom(cls)) {
                i.i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            j45 a = ((it3) bq0Var.B).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (jl2.class.isAssignableFrom(cls)) {
                    y = new sx3(dv5.d, r32.a, a.a);
                } else {
                    s27 s27Var = dv5.b;
                    q32 q32Var = r32.b;
                    if (q32Var != null) {
                        y = new sx3(s27Var, q32Var, a.a);
                    } else {
                        i.n("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (jl2.class.isAssignableFrom(cls)) {
                if ((a.d & 1) == 1) {
                    nv4Var2 = nv4.PROTO2;
                } else {
                    nv4Var2 = nv4.PROTO3;
                }
                if (nv4Var2 == nv4.PROTO2) {
                    y = rx3.y(a, y64.b, mp3.b, dv5.d, r32.a, wt3.b);
                } else {
                    y = rx3.y(a, y64.b, mp3.b, dv5.d, null, wt3.b);
                }
            } else {
                if ((a.d & 1) == 1) {
                    nv4Var = nv4.PROTO2;
                } else {
                    nv4Var = nv4.PROTO3;
                }
                if (nv4Var == nv4.PROTO2) {
                    x64 x64Var = y64.a;
                    kp3 kp3Var = mp3.a;
                    s27 s27Var2 = dv5.b;
                    q32 q32Var2 = r32.b;
                    if (q32Var2 != null) {
                        y = rx3.y(a, x64Var, kp3Var, s27Var2, q32Var2, wt3.a);
                    } else {
                        i.n("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    y = rx3.y(a, y64.a, mp3.a, dv5.c, null, wt3.a);
                }
            }
            cv5 cv5Var2 = (cv5) concurrentHashMap.putIfAbsent(cls, y);
            if (cv5Var2 != null) {
                return cv5Var2;
            }
            return y;
        }
        return cv5Var;
    }
}
