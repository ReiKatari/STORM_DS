package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo4  reason: default package */
/* loaded from: classes.dex */
public final class bo4 extends pc7 {
    @Override // defpackage.pc7
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

    @Override // defpackage.gz0
    public final void b(ho3 ho3Var, boolean z) {
        super.b(ho3Var, z);
        if (this.u0 > 0) {
            gz0 gz0Var = this.t0[0];
            gz0Var.E();
            gz0Var.f0 = 0.5f;
            gz0Var.e0 = 0.5f;
            by0 by0Var = by0.LEFT;
            gz0Var.e(by0Var, this, by0Var, 0);
            by0 by0Var2 = by0.RIGHT;
            gz0Var.e(by0Var2, this, by0Var2, 0);
            by0 by0Var3 = by0.TOP;
            gz0Var.e(by0Var3, this, by0Var3, 0);
            by0 by0Var4 = by0.BOTTOM;
            gz0Var.e(by0Var4, this, by0Var4, 0);
        }
    }
}
