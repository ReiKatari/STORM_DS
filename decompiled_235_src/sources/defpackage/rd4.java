package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd4  reason: default package */
/* loaded from: classes.dex */
public final class rd4 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(qd4 qd4Var) {
        qd4Var.getClass();
        String o = xk2.o(qd4Var.getClass());
        if (o.length() > 0) {
            LinkedHashMap linkedHashMap = this.a;
            qd4 qd4Var2 = (qd4) linkedHashMap.get(o);
            if (nb3.k(qd4Var2, qd4Var)) {
                return;
            }
            if (qd4Var2 != null && qd4Var2.b) {
                u34.l("Navigator ", qd4Var, " is replacing an already attached ", qd4Var2);
                return;
            } else if (!qd4Var.b) {
                qd4 qd4Var3 = (qd4) linkedHashMap.put(o, qd4Var);
                return;
            } else {
                e41.g(qd4Var, " is already attached to another NavController", "Navigator ");
                return;
            }
        }
        i.h("navigator name cannot be an empty string");
    }

    public final qd4 b(String str) {
        str.getClass();
        if (str.length() > 0) {
            qd4 qd4Var = (qd4) this.a.get(str);
            if (qd4Var != null) {
                return qd4Var;
            }
            i.m(lb1.A("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
            return null;
        }
        i.h("navigator name cannot be an empty string");
        return null;
    }
}
