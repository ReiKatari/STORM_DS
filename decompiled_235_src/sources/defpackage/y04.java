package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y04  reason: default package */
/* loaded from: classes.dex */
public final class y04 {
    public static void a(Object obj, Object obj2) {
        x04 x04Var = (x04) obj;
        if (obj2 == null) {
            if (!x04Var.isEmpty()) {
                Iterator it = x04Var.entrySet().iterator();
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
        u34.a();
    }

    public static x04 b(Object obj, Object obj2) {
        x04 x04Var = (x04) obj;
        x04 x04Var2 = (x04) obj2;
        if (!x04Var2.isEmpty()) {
            if (!x04Var.A) {
                x04Var = x04Var.c();
            }
            x04Var.b();
            if (!x04Var2.isEmpty()) {
                x04Var.putAll(x04Var2);
            }
        }
        return x04Var;
    }
}
