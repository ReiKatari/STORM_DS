package defpackage;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y0  reason: default package */
/* loaded from: classes.dex */
public final class y0 extends z0 implements RandomAccess {
    public final z0 A;
    public final int B;
    public final int L;

    public y0(z0 z0Var, int i, int i2) {
        this.A = z0Var;
        this.B = i;
        hf.E(i, i2, z0Var.a());
        this.L = i2 - i;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return this.A.get(this.B + i);
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        hf.E(i, i2, this.L);
        int i3 = this.B;
        return new y0(this.A, i + i3, i3 + i2);
    }
}
