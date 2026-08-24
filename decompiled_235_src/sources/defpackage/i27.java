package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i27  reason: default package */
/* loaded from: classes.dex */
public final class i27 {
    public static final ap3 g = jx2.z(new z17(1), new r76(28));
    public final rs4 a;
    public final rs4 b = new rs4(RecyclerView.B1);
    public final ss4 c = new ss4(0);
    public of5 d = of5.e;
    public long e = k47.b;
    public final vs4 f;

    public i27(lo4 lo4Var, float f) {
        this.a = new rs4(f);
        this.f = new vs4(lo4Var, xd5.s0);
    }

    public final void a(lo4 lo4Var, of5 of5Var, int i, int i2) {
        boolean z;
        float f;
        int i3;
        float f2;
        float f3 = i2 - i;
        this.b.i(f3);
        float f4 = of5Var.a;
        float f5 = of5Var.b;
        of5 of5Var2 = this.d;
        int i4 = (f4 > of5Var2.a ? 1 : (f4 == of5Var2.a ? 0 : -1));
        rs4 rs4Var = this.a;
        if (i4 != 0 || f5 != of5Var2.b) {
            if (lo4Var == lo4.Vertical) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = f5;
            }
            if (z) {
                f = of5Var.d;
            } else {
                f = of5Var.c;
            }
            float h = rs4Var.h();
            float f6 = i;
            float f7 = h + f6;
            if (f > f7 || (f4 < h && f - f4 > f6)) {
                f2 = f - f7;
            } else if (i3 < 0 && f - f4 <= f6) {
                f2 = f4 - h;
            } else {
                f2 = 0.0f;
            }
            rs4Var.i(rs4Var.h() + f2);
            this.d = of5Var;
        }
        rs4Var.i(gi2.p(rs4Var.h(), RecyclerView.B1, f3));
        this.c.i(i);
    }
}
