package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f76  reason: default package */
/* loaded from: classes.dex */
public abstract class f76 {
    public static final sc6 a = ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [sc6] */
    public static final ae6 a(long j, xy6 xy6Var, tu0 tu0Var, int i, int i2) {
        String str;
        xy6 xy6Var2 = xy6Var;
        if ((i2 & 2) != 0) {
            xy6Var2 = a;
        }
        xy6 xy6Var3 = xy6Var2;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        } else {
            str = "switch_track";
        }
        String str2 = str;
        sk2 sk2Var = (sk2) tu0Var;
        boolean f = sk2Var.f(xq0.f(j));
        Object L = sk2Var.L();
        if (f || L == su0.a) {
            bz6 bz6Var = new bz6(yd.l0, new yb(9, xq0.f(j)));
            sk2Var.h0(bz6Var);
            L = bz6Var;
        }
        return wm.c(new xq0(j), (bz6) L, xy6Var3, null, str2, sk2Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
