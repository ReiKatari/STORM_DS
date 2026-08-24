package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y45  reason: default package */
/* loaded from: classes.dex */
public final class y45 {
    public static final y45 c = new y45();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final os0 a = new os0(1);

    public final j66 a(Class cls) {
        boolean z;
        u45 u45Var;
        j66 y;
        u45 u45Var2;
        Class cls2;
        aa3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        j66 j66Var = (j66) concurrentHashMap.get(cls);
        if (j66Var == null) {
            os0 os0Var = this.a;
            os0Var.getClass();
            Class cls3 = m66.a;
            if (!pr2.class.isAssignableFrom(cls) && (cls2 = m66.a) != null && !cls2.isAssignableFrom(cls)) {
                i.h("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            wd5 a = ((l04) os0Var.B).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (pr2.class.isAssignableFrom(cls)) {
                    y = new j54(m66.d, j82.a, a.a);
                } else {
                    ng7 ng7Var = m66.b;
                    i82 i82Var = j82.b;
                    if (i82Var != null) {
                        y = new j54(ng7Var, i82Var, a.a);
                    } else {
                        i.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (pr2.class.isAssignableFrom(cls)) {
                if ((a.d & 1) == 1) {
                    u45Var2 = u45.PROTO2;
                } else {
                    u45Var2 = u45.PROTO3;
                }
                if (u45Var2 == u45.PROTO2) {
                    y = i54.y(a, nf4.b, ow3.b, m66.d, j82.a, z04.b);
                } else {
                    y = i54.y(a, nf4.b, ow3.b, m66.d, null, z04.b);
                }
            } else {
                if ((a.d & 1) == 1) {
                    u45Var = u45.PROTO2;
                } else {
                    u45Var = u45.PROTO3;
                }
                if (u45Var == u45.PROTO2) {
                    mf4 mf4Var = nf4.a;
                    mw3 mw3Var = ow3.a;
                    ng7 ng7Var2 = m66.b;
                    i82 i82Var2 = j82.b;
                    if (i82Var2 != null) {
                        y = i54.y(a, mf4Var, mw3Var, ng7Var2, i82Var2, z04.a);
                    } else {
                        i.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    y = i54.y(a, nf4.a, ow3.a, m66.c, null, z04.a);
                }
            }
            j66 j66Var2 = (j66) concurrentHashMap.putIfAbsent(cls, y);
            if (j66Var2 != null) {
                return j66Var2;
            }
            return y;
        }
        return j66Var;
    }
}
