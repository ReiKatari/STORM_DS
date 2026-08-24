package defpackage;

import java.util.List;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z91  reason: default package */
/* loaded from: classes.dex */
public final class z91 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ eo2 R;
    public final /* synthetic */ eo2 X;
    public final /* synthetic */ qn2 Y;

    public z91(List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, qn2 qn2Var3) {
        this.A = list;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.R = eo2Var;
        this.X = eo2Var2;
        this.Y = qn2Var3;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
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
            DSiWareTitle dSiWareTitle = (DSiWareTitle) this.A.get(intValue);
            xq2Var.b0(1655772304);
            a74 c = dj6.c(x64.a, 1.0f);
            qn2 qn2Var = this.B;
            boolean f = xq2Var.f(qn2Var) | xq2Var.h(dSiWareTitle);
            Object P = xq2Var.P();
            Object obj5 = ox0.a;
            if (f || P == obj5) {
                P = new x91(0, qn2Var, dSiWareTitle);
                xq2Var.l0(P);
            }
            on2 on2Var = (on2) P;
            qn2 qn2Var2 = this.L;
            boolean f2 = xq2Var.f(qn2Var2) | xq2Var.h(dSiWareTitle);
            Object P2 = xq2Var.P();
            if (f2 || P2 == obj5) {
                P2 = new x91(1, qn2Var2, dSiWareTitle);
                xq2Var.l0(P2);
            }
            on2 on2Var2 = (on2) P2;
            eo2 eo2Var = this.R;
            boolean f3 = xq2Var.f(eo2Var) | xq2Var.h(dSiWareTitle);
            Object P3 = xq2Var.P();
            if (f3 || P3 == obj5) {
                P3 = new y91(eo2Var, dSiWareTitle, 0);
                xq2Var.l0(P3);
            }
            qn2 qn2Var3 = (qn2) P3;
            eo2 eo2Var2 = this.X;
            boolean f4 = xq2Var.f(eo2Var2) | xq2Var.h(dSiWareTitle);
            Object P4 = xq2Var.P();
            if (f4 || P4 == obj5) {
                P4 = new y91(eo2Var2, dSiWareTitle, 1);
                xq2Var.l0(P4);
            }
            qn2 qn2Var4 = (qn2) P4;
            qn2 qn2Var5 = this.Y;
            boolean f5 = xq2Var.f(qn2Var5) | xq2Var.h(dSiWareTitle);
            Object P5 = xq2Var.P();
            if (f5 || P5 == obj5) {
                P5 = new x91(2, qn2Var5, dSiWareTitle);
                xq2Var.l0(P5);
            }
            ge7.e(c, dSiWareTitle, on2Var, on2Var2, qn2Var3, qn2Var4, (on2) P5, xq2Var, 6);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
