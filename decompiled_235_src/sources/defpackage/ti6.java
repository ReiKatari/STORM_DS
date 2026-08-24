package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ti6  reason: default package */
/* loaded from: classes.dex */
public abstract class ti6 {
    public static final io6 a = ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [io6] */
    public static final pp6 a(long j, sc7 sc7Var, px0 px0Var, int i, int i2) {
        String str;
        sc7 sc7Var2 = sc7Var;
        if ((i2 & 2) != 0) {
            sc7Var2 = a;
        }
        sc7 sc7Var3 = sc7Var2;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        } else {
            str = "switch_track";
        }
        String str2 = str;
        xq2 xq2Var = (xq2) px0Var;
        boolean f = xq2Var.f(kt0.g(j));
        Object P = xq2Var.P();
        if (f || P == ox0.a) {
            wc7 wc7Var = new wc7(ne.n0, new mc(kt0.g(j), 8));
            xq2Var.l0(wc7Var);
            P = wc7Var;
        }
        return in.c(new kt0(j), (wc7) P, sc7Var3, null, str2, xq2Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
