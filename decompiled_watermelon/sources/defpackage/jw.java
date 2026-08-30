package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public final class jw {
    public final g11 a;
    public final bq0 b;
    public final Object c;
    public final LinkedHashMap d;
    public final CopyOnWriteArrayList e;

    public jw(ct6 ct6Var, qe0 qe0Var, c63 c63Var) {
        ct6Var.getClass();
        qe0Var.getClass();
        c63Var.getClass();
        this.a = iq2.c(se.O(new e63(c63Var), se.O(ct6Var.h, new j31("CXCP-AudioRestrictionControllerImpl"))));
        this.b = new bq0(29);
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new CopyOnWriteArrayList();
        qe0Var.a(ne0.SCOPE, new m0(6, this));
    }

    public final kw a() {
        LinkedHashMap linkedHashMap = this.d;
        if (!linkedHashMap.containsValue(new kw(3))) {
            synchronized (this.c) {
            }
            if (!linkedHashMap.containsValue(new kw(1))) {
                synchronized (this.c) {
                }
                if (!linkedHashMap.containsValue(new kw(0))) {
                    synchronized (this.c) {
                    }
                    return null;
                }
                return new kw(0);
            }
            return new kw(1);
        }
        return new kw(3);
    }
}
