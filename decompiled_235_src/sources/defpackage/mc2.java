package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc2  reason: default package */
/* loaded from: classes.dex */
public final class mc2 extends z64 implements jm3 {
    public wj1 k0;
    public float l0;

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (q21.d(j) && this.k0 != wj1.Vertical) {
            int round = Math.round(q21.h(j) * this.l0);
            int j3 = q21.j(j);
            j2 = q21.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        } else {
            j2 = q21.j(j);
            h = q21.h(j);
        }
        if (q21.c(j) && this.k0 != wj1.Horizontal) {
            int round2 = Math.round(q21.g(j) * this.l0);
            int i3 = q21.i(j);
            i = q21.g(j);
            if (round2 < i3) {
                round2 = i3;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        } else {
            int i4 = q21.i(j);
            int g = q21.g(j);
            i = i4;
            i2 = g;
        }
        dx4 y = x24Var.y(s21.a(j2, h, i, i2));
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 3));
    }
}
