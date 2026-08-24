package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tf implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ tf(String str, long j) {
        this.A = 2;
        this.L = str;
        this.B = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        long j = this.B;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                a74 a74Var = (a74) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    if (j != 9205357640488583168L) {
                        xq2Var.b0(-1244013944);
                        a74 h = dj6.h(a74Var, sm1.b(j), sm1.a(j), RecyclerView.B1, RecyclerView.B1, 12);
                        e34 d = h70.d(d90.R, false);
                        int hashCode = Long.hashCode(xq2Var.T);
                        xv4 l = xq2Var.l();
                        a74 E = l.E(xq2Var, h);
                        jx0.i.getClass();
                        iy0 iy0Var = ix0.b;
                        xq2Var.f0();
                        if (xq2Var.S) {
                            xq2Var.k(iy0Var);
                        } else {
                            xq2Var.o0();
                        }
                        yh2.K(xq2Var, ix0.f, d);
                        yh2.K(xq2Var, ix0.e, l);
                        yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                        yh2.F(xq2Var, ix0.h);
                        yh2.K(xq2Var, ix0.d, E);
                        vf.b(null, xq2Var, 0, 1);
                        xq2Var.p(true);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-1243644858);
                        vf.b(a74Var, xq2Var, 0, 0);
                        xq2Var.p(false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                zv0 zv0Var = (zv0) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    hv.d(g31.a.a(Float.valueOf(kt0.e(j))), n16.I(-1072292694, new eq(zv0Var, 1), xq2Var2), xq2Var2, 56);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                String str = (String) obj3;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z2)) {
                    x37.b(str, ge7.P(x64.a, 8.0f, 3.0f), this.B, hi2.E(11), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 199728, 0, 131024);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ tf(Object obj, long j, int i) {
        this.A = i;
        this.B = j;
        this.L = obj;
    }
}
