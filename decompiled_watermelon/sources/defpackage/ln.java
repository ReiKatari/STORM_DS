package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ln  reason: default package */
/* loaded from: classes.dex */
public final class ln extends v43 {
    public ax6 k0;
    public k24 l0;
    public mn m0;
    public long n0;

    @Override // defpackage.yy3
    public final void L0() {
        this.n0 = -9223372034707292160L;
    }

    @Override // defpackage.v43, defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        long j2;
        yn4 c = mv3Var.c(j);
        if (vv3Var.w()) {
            j2 = (c.A << 32) | (c.B & 4294967295L);
        } else {
            ax6 ax6Var = this.k0;
            int i = c.A;
            if (ax6Var == null) {
                j2 = (i << 32) | (c.B & 4294967295L);
                this.n0 = j2;
            } else {
                long j3 = (c.B & 4294967295L) | (i << 32);
                zw6 a = ax6Var.a(new kn(this, j3, 0), new kn(this, j3, 1));
                this.m0.getClass();
                j2 = ((i33) a.getValue()).a;
                this.n0 = ((i33) a.getValue()).a;
            }
        }
        return vv3Var.s0((int) (j2 >> 32), (int) (4294967295L & j2), qp1.A, new jn(this, c, j2));
    }
}
