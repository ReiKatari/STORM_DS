package defpackage;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x0  reason: default package */
/* loaded from: classes.dex */
public final class x0 extends y0 implements RandomAccess {
    public final y0 A;
    public final int B;
    public final int L;

    public x0(y0 y0Var, int i, int i2) {
        this.A = y0Var;
        this.B = i;
        f34.w(i, i2, y0Var.b());
        this.L = i2 - i;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return this.A.get(this.B + i);
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.y0, java.util.List
    public final List subList(int i, int i2) {
        f34.w(i, i2, this.L);
        int i3 = this.B;
        return new x0(this.A, i + i3, i3 + i2);
    }
}
