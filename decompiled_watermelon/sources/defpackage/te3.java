package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: te3  reason: default package */
/* loaded from: classes.dex */
public final class te3 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ bf3 B;

    public /* synthetic */ te3(bf3 bf3Var, int i) {
        this.A = i;
        this.B = bf3Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        bf3 bf3Var = this.B;
        switch (i) {
            case 0:
                nd3 nd3Var = (nd3) obj;
                tf0 tf0Var = bf3Var.d;
                tf0Var.getClass();
                nd3Var.getClass();
                ee6 ee6Var = (ee6) tf0Var.Z;
                ee6Var.getClass();
                ee6Var.l(null, nd3Var);
                return o27Var;
            case 1:
                ti4 ti4Var = (ti4) obj;
                ee6 ee6Var2 = bf3Var.o;
                if (ti4Var == null) {
                    ee6Var2.k(null);
                } else {
                    o17 o17Var = (o17) ti4Var.A;
                    k17 k17Var = (k17) ti4Var.B;
                    nd3 nd3Var2 = (nd3) bf3Var.i.getValue();
                    if (nd3Var2 != null) {
                        bf3Var.h = o17Var;
                        m41 m41Var = new m41(k17Var, nd3Var2.d);
                        ee6Var2.getClass();
                        ee6Var2.l(null, m41Var);
                    }
                }
                return o27Var;
            case 2:
                m41 m41Var2 = (m41) obj;
                if (m41Var2 != null) {
                    mv5 mv5Var = m41Var2.a.a;
                    bf3.e(bf3Var, mv5Var.a, mv5Var.b);
                } else {
                    bf3.e(bf3Var, null, BackgroundMode.FIT_CENTER);
                }
                return o27Var;
            default:
                m41 m41Var3 = (m41) obj;
                if (m41Var3 != null) {
                    mv5 mv5Var2 = m41Var3.a.b;
                    bf3.f(bf3Var, mv5Var2.a, mv5Var2.b);
                } else {
                    bf3.f(bf3Var, null, BackgroundMode.FIT_CENTER);
                }
                return o27Var;
        }
    }
}
