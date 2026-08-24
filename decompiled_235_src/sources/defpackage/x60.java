package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x60  reason: default package */
/* loaded from: classes.dex */
public final class x60 {
    public final sg6 a;
    public final ga7 b;
    public final on2 c;
    public final vs4 d;
    public final vs4 e;
    public rc2 f;
    public final vs4 g;

    public x60(sg6 sg6Var, ga7 ga7Var, w97 w97Var, on2 on2Var) {
        af6 af6Var = lb4.m;
        this.a = sg6Var;
        this.b = ga7Var;
        this.c = on2Var;
        this.d = np2.Y(w97Var);
        this.e = np2.Y(af6Var);
        this.f = y60.a;
        this.g = np2.Y(null);
    }

    public final void a(of5 of5Var, of5 of5Var2, af6 af6Var) {
        io6 U;
        if (this.a.a()) {
            vs4 vs4Var = this.g;
            if (((pp6) vs4Var.getValue()) == null) {
                if (af6Var == null) {
                    af6Var = (af6) this.e.getValue();
                }
                switch (af6Var.a) {
                    case 0:
                        U = ge7.U(RecyclerView.B1, RecyclerView.B1, vq7.a, 3);
                        break;
                    default:
                        U = vg6.a;
                        break;
                }
                this.f = U;
            }
            vs4Var.setValue(((w97) this.d.getValue()).a(new mc(this, 7), new ln(this, of5Var2, of5Var, 1)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final of5 c() {
        pp6 pp6Var;
        of5 of5Var;
        if (this.a.a() && (pp6Var = (pp6) this.g.getValue()) != null && (of5Var = (of5) pp6Var.getValue()) != null) {
            long j = ((jk4) this.c.c()).a;
            if (!jk4.c(j, 0L)) {
                return of5Var.i(j);
            }
            return of5Var;
        }
        return null;
    }
}
