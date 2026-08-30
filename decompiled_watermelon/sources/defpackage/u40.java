package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u40  reason: default package */
/* loaded from: classes.dex */
public final class u40 {
    public final g56 a;
    public final kx6 b;
    public final ki2 c;
    public final tj4 d;
    public final tj4 e;
    public y72 f;
    public final tj4 g;

    public u40(g56 g56Var, kx6 kx6Var, ax6 ax6Var, ki2 ki2Var) {
        o36 o36Var = iq2.h;
        this.a = g56Var;
        this.b = kx6Var;
        this.c = ki2Var;
        this.d = me2.G(ax6Var);
        this.e = me2.G(o36Var);
        this.f = v40.a;
        this.g = me2.G(null);
    }

    public final void a(y55 y55Var, y55 y55Var2, o36 o36Var) {
        sc6 P0;
        if (this.a.b()) {
            tj4 tj4Var = this.g;
            if (((ae6) tj4Var.getValue()) == null) {
                if (o36Var == null) {
                    o36Var = (o36) this.e.getValue();
                }
                switch (o36Var.a) {
                    case 0:
                        P0 = ct3.P0(RecyclerView.A1, RecyclerView.A1, tc7.a, 3);
                        break;
                    default:
                        P0 = j56.a;
                        break;
                }
                this.f = P0;
            }
            tj4Var.setValue(((ax6) this.d.getValue()).a(new yb(7, this), new zm(this, y55Var2, y55Var, 1)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final y55 c() {
        ae6 ae6Var;
        y55 y55Var;
        if (this.a.b() && (ae6Var = (ae6) this.g.getValue()) != null && (y55Var = (y55) ae6Var.getValue()) != null) {
            long j = ((mb4) this.c.c()).a;
            if (!mb4.b(j, 0L)) {
                return y55Var.i(j);
            }
            return y55Var;
        }
        return null;
    }
}
