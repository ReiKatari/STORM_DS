package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db3  reason: default package */
/* loaded from: classes.dex */
public final class db3 extends hb3 {
    public gb3 l0;
    public boolean m0;

    @Override // defpackage.hb3
    public final long R0(x24 x24Var, long j) {
        int c;
        if (this.l0 == gb3.Min) {
            c = x24Var.V(q21.h(j));
        } else {
            c = x24Var.c(q21.h(j));
        }
        if (c < 0) {
            c = 0;
        }
        if (c < 0) {
            r53.a("height must be >= 0");
        }
        return s21.h(0, Integer.MAX_VALUE, c, c);
    }

    @Override // defpackage.hb3
    public final boolean S0() {
        return this.m0;
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0 == gb3.Min) {
            return x24Var.V(i);
        }
        return x24Var.c(i);
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0 == gb3.Min) {
            return x24Var.V(i);
        }
        return x24Var.c(i);
    }
}
