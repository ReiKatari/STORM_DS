package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd0  reason: default package */
/* loaded from: classes.dex */
public final class rd0 {
    public final Map a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final xb0 d;

    public rd0(String str, Map map, Context context, t57 t57Var, zg0 zg0Var) {
        this.a = map;
        zg0Var.a(wg0.CAMERA, new n0(this, 8));
        xb0 a = a(str);
        if (a != null) {
            this.d = a;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) qd0.a(str));
        i.k(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final xb0 a(String str) {
        xb0 xb0Var;
        str.getClass();
        synchronized (this.b) {
            try {
                xb0 xb0Var2 = (xb0) this.c.get(new qd0(str));
                if (xb0Var2 != null) {
                    return xb0Var2;
                }
                ah0 ah0Var = (ah0) this.a.get(new qd0(str));
                if (ah0Var != null) {
                    xb0Var = ah0Var.a;
                } else {
                    xb0Var = null;
                }
                if (xb0Var != null) {
                    if (str.equals("CXCP-Camera2")) {
                        this.c.put(new qd0(str), xb0Var);
                    } else {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) qd0.a(str)) + " but it was actually " + ((Object) qd0.a("CXCP-Camera2"))).toString());
                    }
                }
                return xb0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
