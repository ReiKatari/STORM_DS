package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn  reason: default package */
/* loaded from: classes.dex */
public final class xn extends hb3 {
    public w97 l0;
    public qa4 m0;
    public yn n0;
    public long o0;

    @Override // defpackage.z64
    public final void L0() {
        this.o0 = -9223372034707292160L;
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        long j2;
        dx4 y = x24Var.y(j);
        if (g34Var.a0()) {
            j2 = (y.A << 32) | (y.B & 4294967295L);
        } else {
            w97 w97Var = this.l0;
            int i = y.A;
            if (w97Var == null) {
                j2 = (i << 32) | (y.B & 4294967295L);
                this.o0 = j2;
            } else {
                long j3 = (y.B & 4294967295L) | (i << 32);
                v97 a = w97Var.a(new wn(this, j3, 0), new wn(this, j3, 1));
                this.n0.getClass();
                j2 = ((q93) a.getValue()).a;
                this.o0 = ((q93) a.getValue()).a;
            }
        }
        return g34Var.K((int) (j2 >> 32), (int) (4294967295L & j2), zt1.A, new vn(this, y, j2));
    }
}
