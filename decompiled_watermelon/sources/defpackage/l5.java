package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l5  reason: default package */
/* loaded from: classes.dex */
public final class l5 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ bj2 L;
    public final /* synthetic */ int R;
    public final /* synthetic */ jd7 X;
    public final /* synthetic */ mi2 Y;

    public l5(List list, Object obj, bj2 bj2Var, int i, jd7 jd7Var, mi2 mi2Var) {
        this.A = list;
        this.B = obj;
        this.L = bj2Var;
        this.R = i;
        this.X = jd7Var;
        this.Y = mi2Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        String str;
        long j2;
        boolean z2;
        int i2;
        int i3;
        ni3 ni3Var = (ni3) obj;
        int intValue = ((Number) obj2).intValue();
        tu0 tu0Var = (tu0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((sk2) tu0Var).f(ni3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((sk2) tu0Var).d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(i & 1, z)) {
            Object obj5 = this.A.get(intValue);
            sk2Var.X(2121140575);
            boolean x = b53.x(obj5, this.B);
            String str2 = (String) this.L.i(obj5, sk2Var, Integer.valueOf((this.R >> 3) & 8));
            jd7 jd7Var = this.X;
            if (x) {
                j = xq0.d;
            } else {
                j = jd7Var.i;
            }
            long j3 = j;
            ml2 ml2Var = td7.c;
            long A = hi2.A(8.5d);
            pe2 pe2Var = pe2.c0;
            long A2 = hi2.A(0.4d);
            zy3 t = a53.t(wy3.a, gr5.b(13.0f));
            if (x) {
                str = str2;
                j2 = jd7Var.j;
            } else {
                str = str2;
                j2 = jd7Var.d;
            }
            zy3 i4 = dk7.i(t, j2, iq2.g);
            mi2 mi2Var = this.Y;
            boolean f = sk2Var.f(mi2Var) | sk2Var.h(obj5);
            Object L = sk2Var.L();
            if (!f && L != su0.a) {
                z2 = false;
            } else {
                z2 = false;
                L = new j5(0, mi2Var, obj5);
                sk2Var.h0(L);
            }
            ir6.b(str, b53.Y(a53.s(i4, z2, null, (ki2) L, 15), 10.0f, 4.0f), j3, A, pe2Var, ml2Var, A2, null, 0L, 0, false, 1, 0, null, null, sk2Var, 14355456, 3072, 122640);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
