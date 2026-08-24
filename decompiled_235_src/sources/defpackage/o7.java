package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o7  reason: default package */
/* loaded from: classes.dex */
public final class o7 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ long B;
    public final /* synthetic */ qn2 L;

    public o7(List list, long j, qn2 qn2Var) {
        this.A = list;
        this.B = j;
        this.L = qn2Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
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
            c6 c6Var = (c6) this.A.get(intValue);
            xq2Var.b0(-1392517167);
            if (c6Var.a == this.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj5 = this.L;
            boolean f = xq2Var.f(obj5) | xq2Var.h(c6Var);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                P = new i5(2, obj5, c6Var);
                xq2Var.l0(P);
            }
            ge7.h(null, c6Var, z2, (on2) P, xq2Var, 0);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
