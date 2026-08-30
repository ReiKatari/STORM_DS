package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vt3  reason: default package */
/* loaded from: classes.dex */
public final class vt3 {
    public static void a(Object obj, Object obj2) {
        ut3 ut3Var = (ut3) obj;
        if (obj2 == null) {
            if (!ut3Var.isEmpty()) {
                Iterator it = ut3Var.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        c44.b();
    }

    public static ut3 b(Object obj, Object obj2) {
        ut3 ut3Var = (ut3) obj;
        ut3 ut3Var2 = (ut3) obj2;
        if (!ut3Var2.isEmpty()) {
            if (!ut3Var.A) {
                ut3Var = ut3Var.c();
            }
            ut3Var.b();
            if (!ut3Var2.isEmpty()) {
                ut3Var.putAll(ut3Var2);
            }
        }
        return ut3Var;
    }
}
