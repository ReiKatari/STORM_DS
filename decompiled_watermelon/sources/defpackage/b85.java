package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b85  reason: default package */
/* loaded from: classes.dex */
public abstract class b85 extends dz6 {
    public final d85 a;

    public b85(d85 d85Var) {
        this.a = d85Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        Object d = d();
        Map map = this.a.a;
        try {
            o83Var.i();
            while (o83Var.J()) {
                a85 a85Var = (a85) map.get(o83Var.Z());
                if (a85Var == null) {
                    o83Var.u0();
                } else {
                    f(d, o83Var, a85Var);
                }
            }
            o83Var.B();
            return e(d);
        } catch (IllegalAccessException e) {
            hi2 hi2Var = y75.a;
            c44.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        if (obj == null) {
            b93Var.F();
            return;
        }
        b93Var.p();
        try {
            for (a85 a85Var : this.a.b) {
                a85Var.a(b93Var, obj);
            }
            b93Var.B();
        } catch (IllegalAccessException e) {
            hi2 hi2Var = y75.a;
            c44.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, o83 o83Var, a85 a85Var);
}
