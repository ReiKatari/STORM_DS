package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zb3  reason: default package */
/* loaded from: classes.dex */
public final class zb3 implements e90 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ih0 B;

    public /* synthetic */ zb3(ih0 ih0Var, int i) {
        this.A = i;
        this.B = ih0Var;
    }

    @Override // defpackage.e90
    public final void b(y80 y80Var, Throwable th) {
        int i = this.A;
        ih0 ih0Var = this.B;
        switch (i) {
            case 0:
                ih0Var.k(new kc5(th));
                return;
            case 1:
                ih0Var.k(new kc5(th));
                return;
            default:
                ih0Var.k(new kc5(th));
                return;
        }
    }

    @Override // defpackage.e90
    public final void f(y80 y80Var, dc5 dc5Var) {
        int i = this.A;
        ih0 ih0Var = this.B;
        switch (i) {
            case 0:
                if (dc5Var.a.l0) {
                    Object obj = dc5Var.b;
                    if (obj == null) {
                        ka i2 = y80Var.i();
                        i2.getClass();
                        qo0 a = q75.a(n53.class);
                        Class cls = a.a;
                        cls.getClass();
                        Object cast = cls.cast(((io2) i2.Y).x(a));
                        cast.getClass();
                        Method method = ((n53) cast).b;
                        ih0Var.k(new kc5(new NullPointerException("Response from " + tl2.class.getName() + '.' + method.getName() + " was null but response body type was declared as non-null")));
                        return;
                    }
                    ih0Var.k(obj);
                    return;
                }
                ih0Var.k(new kc5(new hg(dc5Var)));
                return;
            case 1:
                if (dc5Var.a.l0) {
                    ih0Var.k(dc5Var.b);
                    return;
                } else {
                    ih0Var.k(new kc5(new hg(dc5Var)));
                    return;
                }
            default:
                ih0Var.k(dc5Var);
                return;
        }
    }
}
