package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m0  reason: default package */
/* loaded from: classes.dex */
public abstract class m0 implements gg3 {
    @Override // defpackage.gg3
    public Object c(sc1 sc1Var) {
        return j(sc1Var, null);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(sc1 sc1Var, Object obj) {
        Object f;
        if (obj != null) {
            f = l(obj);
        } else {
            f = f();
        }
        int g = g(f);
        ux0 c = sc1Var.c(e());
        c.getClass();
        while (true) {
            int q = c.q(e());
            if (q != -1) {
                k(c, q + g, f);
            } else {
                c.a(e());
                return m(f);
            }
        }
    }

    public abstract void k(ux0 ux0Var, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
