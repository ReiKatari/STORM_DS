package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh5  reason: default package */
/* loaded from: classes.dex */
public abstract class rh5 extends yc7 {
    public final th5 a;

    public rh5(th5 th5Var) {
        this.a = th5Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        Object d = d();
        Map map = this.a.a;
        try {
            hf3Var.h();
            while (hf3Var.F()) {
                qh5 qh5Var = (qh5) map.get(hf3Var.c0());
                if (qh5Var == null) {
                    hf3Var.u0();
                } else {
                    f(d, hf3Var, qh5Var);
                }
            }
            hf3Var.u();
            return e(d);
        } catch (IllegalAccessException e) {
            uj2 uj2Var = oh5.a;
            u34.p("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if (obj == null) {
            vf3Var.A();
            return;
        }
        vf3Var.k();
        try {
            for (qh5 qh5Var : this.a.b) {
                qh5Var.a(vf3Var, obj);
            }
            vf3Var.u();
        } catch (IllegalAccessException e) {
            uj2 uj2Var = oh5.a;
            u34.p("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, hf3 hf3Var, qh5 qh5Var);
}
