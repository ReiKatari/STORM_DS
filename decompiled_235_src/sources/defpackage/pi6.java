package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi6  reason: default package */
/* loaded from: classes.dex */
public final class pi6 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ int R;

    public pi6(List list, qn2 qn2Var, on2 on2Var, int i) {
        this.A = list;
        this.B = qn2Var;
        this.L = on2Var;
        this.R = i;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        x64 x64Var;
        boolean z3;
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
            String str = (String) this.A.get(intValue);
            xq2Var.b0(1374552944);
            x64 x64Var2 = x64.a;
            a74 c = dj6.c(x64Var2, 1.0f);
            qn2 qn2Var = this.B;
            boolean f = xq2Var.f(qn2Var);
            if ((((i & 112) ^ 48) > 32 && xq2Var.d(intValue)) || (i & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            on2 on2Var = this.L;
            boolean f2 = z2 | f | xq2Var.f(on2Var);
            Object P = xq2Var.P();
            if (f2 || P == ox0.a) {
                P = new oi6(qn2Var, intValue, on2Var);
                xq2Var.l0(P);
            }
            a74 S = ge7.S(dj6.f(mb3.u(c, false, null, (on2) P, 15), 48.0f, RecyclerView.B1, 2), 24.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
            l26 a = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, S);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            if (intValue == this.R) {
                x64Var = x64Var2;
                z3 = true;
            } else {
                x64Var = x64Var2;
                z3 = false;
            }
            kd5.a(z3, null, null, false, null, xq2Var, 48, 60);
            gi2.h(xq2Var, dj6.l(x64Var, 32.0f));
            x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
            xq2Var.p(true);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
