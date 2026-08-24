package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo1  reason: default package */
/* loaded from: classes.dex */
public abstract class eo1 {
    public static final do1 a = new do1(3, null, 0);
    public static final do1 b = new do1(3, null, 1);

    public static a74 a(a74 a74Var, go1 go1Var, lo4 lo4Var, boolean z, r94 r94Var, boolean z2, fo2 fo2Var, boolean z3) {
        return a74Var.d(new co1(go1Var, lo4Var, z, r94Var, z2, a, fo2Var, z3));
    }

    public static final long b(long j) {
        float b2;
        boolean isNaN = Float.isNaN(ol7.b(j));
        float f = RecyclerView.B1;
        if (isNaN) {
            b2 = 0.0f;
        } else {
            b2 = ol7.b(j);
        }
        if (!Float.isNaN(ol7.c(j))) {
            f = ol7.c(j);
        }
        return qo2.k(b2, f);
    }
}
