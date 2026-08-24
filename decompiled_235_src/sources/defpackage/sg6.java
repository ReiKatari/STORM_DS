package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg6  reason: default package */
/* loaded from: classes.dex */
public final class sg6 implements sz3 {
    public final /* synthetic */ sz3 A;
    public final w61 B;
    public jk3 X;
    public jk3 Y;
    public final vs4 L = np2.Y(Boolean.FALSE);
    public final pj R = new pj(this, 17);
    public final mm6 Z = new mm6();
    public final om6 d0 = new om6();

    public sg6(sz3 sz3Var, w61 w61Var) {
        this.A = sz3Var;
        this.B = w61Var;
    }

    public static rg6 d(String str, xq2 xq2Var) {
        xq2Var.b0(800730162);
        xq2Var.b0(-148945892);
        boolean f = xq2Var.f(str);
        Object P = xq2Var.P();
        if (f || P == ox0.a) {
            P = new rg6(str);
            xq2Var.l0(P);
        }
        rg6 rg6Var = (rg6) P;
        rg6Var.b.setValue(og6.a);
        xq2Var.p(false);
        xq2Var.p(false);
        return rg6Var;
    }

    public static a74 e(sg6 sg6Var, a74 a74Var, rg6 rg6Var, jo joVar) {
        qg6.a.getClass();
        tg6 tg6Var = vg6.b;
        sg6Var.getClass();
        return l.p(a74Var, new mn(rg6Var, joVar.a(), sg6Var, tg6Var, 1));
    }

    public final boolean a() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    @Override // defpackage.sz3
    public final jk3 b(jk3 jk3Var) {
        return this.A.b(jk3Var);
    }

    @Override // defpackage.sz3
    public final long c(jk3 jk3Var, jk3 jk3Var2) {
        return this.A.c(jk3Var, jk3Var2);
    }

    public final void f() {
        Collection<gf6> values = this.d0.d().c.values();
        boolean z = false;
        for (gf6 gf6Var : values) {
            if (!z && (!gf6Var.a() || !gf6Var.d())) {
                z = false;
            } else {
                z = true;
            }
            gf6Var.e();
        }
        if (z != a()) {
            this.L.setValue(Boolean.valueOf(z));
            if (!z) {
                for (gf6 gf6Var2 : values) {
                    if (gf6Var2.c().size() > 1) {
                        List c = gf6Var2.c();
                        int i = jf6.a;
                        int size = c.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((if6) c.get(i2)).d().b()) {
                                break;
                            }
                        }
                    }
                    mg5 mg5Var = gf6Var2.c;
                    mg5Var.getClass();
                    mg5Var.f = qp6.NoRequest;
                    mg5Var.a = ((ss4) mg5Var.e).h();
                    ((vs4) mg5Var.d).setValue(rf4.a);
                }
            }
        }
    }
}
