package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nx2  reason: default package */
/* loaded from: classes.dex */
public final class nx2 extends y0 {
    public final g1 A;
    public final int B;
    public final int L;

    public nx2(g1 g1Var, int i, int i2) {
        this.A = g1Var;
        this.B = i;
        sn2.r(i, i2, g1Var.b());
        this.L = i2 - i;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sn2.p(i, this.L);
        return this.A.get(this.B + i);
    }

    @Override // defpackage.y0, java.util.List
    public final List subList(int i, int i2) {
        sn2.r(i, i2, this.L);
        int i3 = this.B;
        return new nx2(this.A, i + i3, i3 + i2);
    }
}
