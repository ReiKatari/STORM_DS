package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j56  reason: default package */
/* loaded from: classes.dex */
public abstract class j56 {
    public static final sc6 a = ct3.P0(RecyclerView.A1, 400.0f, tc7.a, 1);
    public static final h56 b = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [h56, java.lang.Object] */
    static {
        new d24();
    }

    public static final void a(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(646379026);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            b(ct3.H0(1948801580, new rq4(et0Var), sk2Var), sk2Var, 6);
            zy3Var = wy3.a;
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ze(zy3Var, et0Var, i);
        }
    }

    public static final void b(et0 et0Var, tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1908320054);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            hi2.b(ct3.H0(2062852661, new i56(0, et0Var), sk2Var), sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ps3(et0Var, i, 1);
        }
    }
}
