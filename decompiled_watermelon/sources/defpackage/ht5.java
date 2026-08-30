package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ht5  reason: default package */
/* loaded from: classes.dex */
public final class ht5 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ List L;
    public final /* synthetic */ wc2 R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ mi2 Y;

    public ht5(List list, boolean z, List list2, wc2 wc2Var, mi2 mi2Var, mi2 mi2Var2) {
        this.A = list;
        this.B = z;
        this.L = list2;
        this.R = wc2Var;
        this.X = mi2Var;
        this.Y = mi2Var2;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        wc2 wc2Var;
        int i2;
        int i3;
        th3 th3Var = (th3) obj;
        int intValue = ((Number) obj2).intValue();
        tu0 tu0Var = (tu0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((sk2) tu0Var).f(th3Var)) {
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
            ft5 ft5Var = (ft5) this.A.get(intValue);
            sk2Var.X(-1685306036);
            ft5 ft5Var2 = (ft5) tq0.M0(this.L);
            if (ft5Var2 != null && ft5Var.a == ft5Var2.a) {
                wc2Var = this.R;
            } else {
                wc2Var = null;
            }
            wc2 wc2Var2 = wc2Var;
            mi2 mi2Var = this.X;
            boolean f = sk2Var.f(mi2Var) | sk2Var.h(ft5Var);
            Object L = sk2Var.L();
            Object obj5 = su0.a;
            if (f || L == obj5) {
                L = new gt5(mi2Var, ft5Var, 0);
                sk2Var.h0(L);
            }
            ki2 ki2Var = (ki2) L;
            mi2 mi2Var2 = this.Y;
            boolean f2 = sk2Var.f(mi2Var2) | sk2Var.h(ft5Var);
            Object L2 = sk2Var.L();
            if (f2 || L2 == obj5) {
                L2 = new gt5(mi2Var2, ft5Var, 1);
                sk2Var.h0(L2);
            }
            mh7.l(ft5Var, this.B, wc2Var2, ki2Var, (ki2) L2, sk2Var, 0);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
