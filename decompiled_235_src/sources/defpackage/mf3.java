package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf3  reason: default package */
/* loaded from: classes.dex */
public final class mf3 extends kf3 {
    public final ye3 f0;
    public final List g0;
    public final int h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf3(id3 id3Var, ye3 ye3Var) {
        super(id3Var, ye3Var, (String) null, 12);
        id3Var.getClass();
        this.f0 = ye3Var;
        List k1 = gt0.k1(ye3Var.A.keySet());
        this.g0 = k1;
        this.h0 = k1.size() * 2;
        this.i0 = -1;
    }

    @Override // defpackage.kf3, defpackage.v0
    public final de3 E() {
        return this.f0;
    }

    @Override // defpackage.kf3
    public final ye3 R() {
        return this.f0;
    }

    @Override // defpackage.kf3, defpackage.v0, defpackage.ux0
    public final void a(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.kf3, defpackage.v0
    public final de3 d(String str) {
        str.getClass();
        if (this.i0 % 2 == 0) {
            return fe3.b(str);
        }
        return (de3) c14.j0(this.f0, str);
    }

    @Override // defpackage.kf3, defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        int i = this.i0;
        if (i < this.h0 - 1) {
            int i2 = i + 1;
            this.i0 = i2;
            return i2;
        }
        return -1;
    }

    @Override // defpackage.kf3, defpackage.v0
    public final String x(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return (String) this.g0.get(i / 2);
    }
}
