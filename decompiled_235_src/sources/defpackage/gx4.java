package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx4  reason: default package */
/* loaded from: classes.dex */
public final class gx4 extends rq7 {
    @Override // defpackage.rq7
    public final void V(int i, int i2, int i3, int i4) {
        int i5 = this.z0 + this.A0;
        int i6 = this.v0 + this.w0;
        boolean z = false;
        if (this.u0 > 0) {
            i5 += this.t0[0].r();
            i6 += this.t0[0].l();
        }
        int max = Math.max(this.c0, i5);
        int max2 = Math.max(this.d0, i6);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        this.C0 = i2;
        this.D0 = i4;
        P(i2);
        M(i4);
        if (this.u0 > 0) {
            z = true;
        }
        this.B0 = z;
    }

    @Override // defpackage.l21
    public final void b(jv3 jv3Var, boolean z) {
        super.b(jv3Var, z);
        if (this.u0 > 0) {
            l21 l21Var = this.t0[0];
            l21Var.E();
            l21Var.f0 = 0.5f;
            l21Var.e0 = 0.5f;
            g11 g11Var = g11.LEFT;
            l21Var.e(g11Var, this, g11Var, 0);
            g11 g11Var2 = g11.RIGHT;
            l21Var.e(g11Var2, this, g11Var2, 0);
            g11 g11Var3 = g11.TOP;
            l21Var.e(g11Var3, this, g11Var3, 0);
            g11 g11Var4 = g11.BOTTOM;
            l21Var.e(g11Var4, this, g11Var4, 0);
        }
    }
}
