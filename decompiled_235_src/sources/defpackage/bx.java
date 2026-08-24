package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
public final class bx {
    public final o41 a;
    public final d51 b;
    public final Object c;
    public final LinkedHashMap d;
    public final CopyOnWriteArrayList e;

    public bx(t57 t57Var, zg0 zg0Var, rc3 rc3Var) {
        t57Var.getClass();
        zg0Var.getClass();
        rc3Var.getClass();
        this.a = g04.i(jw2.y(new tc3(rc3Var), jw2.y(t57Var.h, new r61("CXCP-AudioRestrictionControllerImpl"))));
        this.b = new d51(1);
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new CopyOnWriteArrayList();
        zg0Var.a(wg0.SCOPE, new n0(this, 6));
    }

    public final cx a() {
        LinkedHashMap linkedHashMap = this.d;
        if (!linkedHashMap.containsValue(new cx(3))) {
            synchronized (this.c) {
            }
            if (!linkedHashMap.containsValue(new cx(1))) {
                synchronized (this.c) {
                }
                if (!linkedHashMap.containsValue(new cx(0))) {
                    synchronized (this.c) {
                    }
                    return null;
                }
                return new cx(0);
            }
            return new cx(1);
        }
        return new cx(3);
    }
}
