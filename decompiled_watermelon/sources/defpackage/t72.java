package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t72  reason: default package */
/* loaded from: classes.dex */
public final class t72 extends yy3 implements mf3 {
    public sf1 j0;
    public float k0;

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (lz0.d(j) && this.j0 != sf1.Vertical) {
            int round = Math.round(lz0.h(j) * this.k0);
            int j3 = lz0.j(j);
            j2 = lz0.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        } else {
            j2 = lz0.j(j);
            h = lz0.h(j);
        }
        if (lz0.c(j) && this.j0 != sf1.Horizontal) {
            int round2 = Math.round(lz0.g(j) * this.k0);
            int i3 = lz0.i(j);
            i = lz0.g(j);
            if (round2 < i3) {
                round2 = i3;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        } else {
            int i4 = lz0.i(j);
            int g = lz0.g(j);
            i = i4;
            i2 = g;
        }
        yn4 c = mv3Var.c(nz0.a(j2, h, i, i2));
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 3));
    }
}
