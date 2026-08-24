package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k5  reason: default package */
/* loaded from: classes.dex */
public final class k5 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ fo2 L;
    public final /* synthetic */ int R;
    public final /* synthetic */ es7 X;
    public final /* synthetic */ qn2 Y;

    public k5(List list, Object obj, fo2 fo2Var, int i, es7 es7Var, qn2 qn2Var) {
        this.A = list;
        this.B = obj;
        this.L = fo2Var;
        this.R = i;
        this.X = es7Var;
        this.Y = qn2Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        String str;
        long j2;
        boolean z2;
        int i2;
        int i3;
        lp3 lp3Var = (lp3) obj;
        int intValue = ((Number) obj2).intValue();
        px0 px0Var = (px0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((xq2) px0Var).f(lp3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((xq2) px0Var).d(intValue)) {
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
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            Object obj5 = this.A.get(intValue);
            xq2Var.b0(2121140575);
            boolean k = nb3.k(obj5, this.B);
            String str2 = (String) this.L.e(obj5, xq2Var, Integer.valueOf((this.R >> 3) & 8));
            es7 es7Var = this.X;
            if (k) {
                j = kt0.d;
            } else {
                j = es7Var.i;
            }
            long j3 = j;
            sr2 sr2Var = qs7.c;
            long D = hi2.D(8.5d);
            oj2 oj2Var = oj2.d0;
            long D2 = hi2.D(0.4d);
            a74 g = u24.g(x64.a, z16.b(13.0f));
            if (k) {
                str = str2;
                j2 = es7Var.j;
            } else {
                str = str2;
                j2 = es7Var.d;
            }
            a74 L = vy7.L(g, j2, u24.m);
            qn2 qn2Var = this.Y;
            boolean f = xq2Var.f(qn2Var) | xq2Var.h(obj5);
            Object P = xq2Var.P();
            if (!f && P != ox0.a) {
                z2 = false;
            } else {
                z2 = false;
                P = new i5(0, qn2Var, obj5);
                xq2Var.l0(P);
            }
            x37.b(str, ge7.P(mb3.u(L, z2, null, (on2) P, 15), 10.0f, 4.0f), j3, D, oj2Var, sr2Var, D2, null, 0L, 0, false, 1, 0, null, null, xq2Var, 14355456, 3072, 122640);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
