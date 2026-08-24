package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g53  reason: default package */
/* loaded from: classes.dex */
public final class g53 {
    public final ua4 a = new ua4(new e53[16]);
    public final vs4 b = np2.Y(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final vs4 d = np2.Y(Boolean.TRUE);

    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-318043801);
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(null);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            if (!((Boolean) this.d.getValue()).booleanValue() && !((Boolean) this.b.getValue()).booleanValue()) {
                xq2Var.b0(-143455237);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-144841960);
                boolean h = xq2Var.h(this);
                Object P2 = xq2Var.P();
                if (h || P2 == vs0Var) {
                    P2 = new l5(qa4Var, this, (r41) null);
                    xq2Var.l0(P2);
                }
                mb3.i(xq2Var, (eo2) P2, this);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(this, i, 13);
        }
    }
}
