package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jb0  reason: default package */
/* loaded from: classes.dex */
public final class jb0 {
    public final Map a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final p90 d;

    public jb0(String str, Map map, Context context, ct6 ct6Var, qe0 qe0Var) {
        this.a = map;
        qe0Var.a(ne0.CAMERA, new m0(8, this));
        p90 a = a(str);
        if (a != null) {
            this.d = a;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) ib0.a(str));
        i.k(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final p90 a(String str) {
        p90 p90Var;
        str.getClass();
        synchronized (this.b) {
            try {
                p90 p90Var2 = (p90) this.c.get(new ib0(str));
                if (p90Var2 != null) {
                    return p90Var2;
                }
                re0 re0Var = (re0) this.a.get(new ib0(str));
                if (re0Var != null) {
                    p90Var = re0Var.a;
                } else {
                    p90Var = null;
                }
                if (p90Var != null) {
                    if (str.equals("CXCP-Camera2")) {
                        this.c.put(new ib0(str), p90Var);
                    } else {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) ib0.a(str)) + " but it was actually " + ((Object) ib0.a("CXCP-Camera2"))).toString());
                    }
                }
                return p90Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
