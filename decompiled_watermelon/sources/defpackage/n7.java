package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n7  reason: default package */
/* loaded from: classes.dex */
public final class n7 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ long B;
    public final /* synthetic */ mi2 L;

    public n7(List list, long j, mi2 mi2Var) {
        this.A = list;
        this.B = j;
        this.L = mi2Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
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
            c6 c6Var = (c6) this.A.get(intValue);
            sk2Var.X(-1392517167);
            if (c6Var.a == this.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj5 = this.L;
            boolean f = sk2Var.f(obj5) | sk2Var.h(c6Var);
            Object L = sk2Var.L();
            if (f || L == su0.a) {
                L = new j5(2, obj5, c6Var);
                sk2Var.h0(L);
            }
            b53.p(null, c6Var, z2, (ki2) L, sk2Var, 0);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
