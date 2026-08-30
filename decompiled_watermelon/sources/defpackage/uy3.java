package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uy3  reason: default package */
/* loaded from: classes.dex */
public final class uy3 extends yy3 implements jv0, mf3 {
    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        boolean z;
        if (this.i0 && ((Boolean) mh7.t(this, m33.a)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        long j2 = m33.b;
        yn4 c = mv3Var.c(j);
        int i = c.A;
        if (z) {
            i = Math.max(i, vv3Var.Y(ni1.b(j2)));
        }
        int i2 = c.B;
        if (z) {
            i2 = Math.max(i2, vv3Var.Y(ni1.a(j2)));
        }
        return vv3Var.s0(i, i2, qp1.A, new f23(i, c, i2));
    }
}
