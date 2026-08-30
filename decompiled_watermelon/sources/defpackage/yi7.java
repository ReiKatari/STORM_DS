package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yi7  reason: default package */
/* loaded from: classes.dex */
public final class yi7 extends yy3 implements mf3 {
    public sf1 j0;
    public aj2 k0;

    @Override // defpackage.mf3
    public final uv3 e(final vv3 vv3Var, mv3 mv3Var, long j) {
        int j2;
        int i = 0;
        if (this.j0 != sf1.Vertical) {
            j2 = 0;
        } else {
            j2 = lz0.j(j);
        }
        if (this.j0 == sf1.Horizontal) {
            i = lz0.i(j);
        }
        final yn4 c = mv3Var.c(nz0.a(j2, lz0.h(j), i, lz0.g(j)));
        final int m = io2.m(c.A, lz0.j(j), lz0.h(j));
        final int m2 = io2.m(c.B, lz0.i(j), lz0.g(j));
        return vv3Var.s0(m, m2, qp1.A, new mi2() { // from class: xi7
            @Override // defpackage.mi2
            public final Object n(Object obj) {
                aj2 aj2Var = yi7.this.k0;
                yn4 yn4Var = c;
                xn4.l((xn4) obj, yn4Var, ((a33) aj2Var.j(new i33(((m - yn4Var.A) << 32) | ((m2 - yn4Var.B) & 4294967295L)), vv3Var.getLayoutDirection())).a);
                return o27.a;
            }
        });
    }
}
