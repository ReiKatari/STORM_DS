package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj  reason: default package */
/* loaded from: classes.dex */
public final class zj extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ c05 L;
    public final /* synthetic */ qa4 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj(c05 c05Var, qa4 qa4Var, int i) {
        super(2);
        this.B = i;
        this.L = c05Var;
        this.R = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.R;
        c05 c05Var = this.L;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (P == vs0Var) {
                        P = ne.f0;
                        xq2Var.l0(P);
                    }
                    a74 a = ua6.a(x64.a, false, (qn2) P);
                    boolean h = xq2Var.h(c05Var);
                    Object P2 = xq2Var.P();
                    if (h || P2 == vs0Var) {
                        P2 = new wj(c05Var, 1);
                        xq2Var.l0(P2);
                    }
                    a74 E = lb4.E(a, (qn2) P2);
                    if (c05Var.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = RecyclerView.B1;
                    }
                    a74 j = jw2.j(E, f);
                    py0 py0Var = ak.a;
                    eo2 eo2Var = (eo2) qa4Var.getValue();
                    Object P3 = xq2Var.P();
                    if (P3 == vs0Var) {
                        P3 = fc.d;
                        xq2Var.l0(P3);
                    }
                    e34 e34Var = (e34) P3;
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E2 = l.E(xq2Var, j);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, e34Var);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E2);
                    eo2Var.o(xq2Var, 0);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    hv.d(ak.b.a(Boolean.TRUE), n16.I(1022273628, new zj(c05Var, qa4Var, 0), xq2Var2), xq2Var2, 56);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
