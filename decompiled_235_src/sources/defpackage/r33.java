package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r33  reason: default package */
/* loaded from: classes.dex */
public final class r33 extends z0 {
    public final h1 A;
    public final int B;
    public final int L;

    public r33(h1 h1Var, int i, int i2) {
        this.A = h1Var;
        this.B = i;
        np2.z(i, i2, h1Var.a());
        this.L = i2 - i;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        np2.w(i, this.L);
        return this.A.get(this.B + i);
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        np2.z(i, i2, this.L);
        int i3 = this.B;
        return new r33(this.A, i + i3, i3 + i2);
    }
}
