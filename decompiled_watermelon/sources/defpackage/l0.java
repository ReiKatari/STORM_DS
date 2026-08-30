package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l0  reason: default package */
/* loaded from: classes.dex */
public abstract class l0 implements m93 {
    @Override // defpackage.m93
    public Object b(b91 b91Var) {
        return j(b91Var, null);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(b91 b91Var, Object obj) {
        Object f;
        if (obj != null) {
            f = l(obj);
        } else {
            f = f();
        }
        int g = g(f);
        yu0 c = b91Var.c(e());
        c.getClass();
        while (true) {
            int v = c.v(e());
            if (v != -1) {
                k(c, v + g, f);
            } else {
                c.a(e());
                return m(f);
            }
        }
    }

    public abstract void k(yu0 yu0Var, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
