package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd7  reason: default package */
/* loaded from: classes.dex */
public abstract class nd7 {
    public static final long a = mh7.d(4281208588L);
    public static final List b;

    static {
        Float valueOf = Float.valueOf(3.7f);
        Float valueOf2 = Float.valueOf(5.8f);
        ti4 ti4Var = new ti4(valueOf, valueOf2);
        Float valueOf3 = Float.valueOf(7.0f);
        Float valueOf4 = Float.valueOf(7.2f);
        b = l07.c0(ti4Var, new ti4(valueOf3, valueOf4), new ti4(Float.valueOf(10.0f), valueOf4), new ti4(Float.valueOf(13.3f), valueOf2));
    }

    public static final void a(float f, int i, tu0 tu0Var, zy3 zy3Var) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1333734539);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            wy3 wy3Var = wy3.a;
            zy3 i3 = o76.i(wy3Var, (17.0f * f) / 24.0f, f);
            boolean f2 = sk2Var.f(C);
            Object L = sk2Var.L();
            if (f2 || L == su0.a) {
                L = new n95(28, C);
                sk2Var.h0(L);
            }
            dt3.j(i3, (mi2) L, sk2Var, 0);
            zy3Var = wy3Var;
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new yl1(zy3Var, f, i, 1);
        }
    }
}
