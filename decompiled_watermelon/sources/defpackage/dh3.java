package defpackage;

import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dh3  reason: default package */
/* loaded from: classes.dex */
public final class dh3 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ UUID B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ mi2 R;
    public final /* synthetic */ h24 X;
    public final /* synthetic */ mi2 Y;

    public dh3(List list, UUID uuid, mi2 mi2Var, mi2 mi2Var2, h24 h24Var, mi2 mi2Var3) {
        this.A = list;
        this.B = uuid;
        this.L = mi2Var;
        this.R = mi2Var2;
        this.X = h24Var;
        this.Y = mi2Var3;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
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
            nd3 nd3Var = (nd3) this.A.get(intValue);
            sk2Var.X(1119357328);
            boolean x = b53.x(nd3Var.a, this.B);
            mi2 mi2Var = this.L;
            boolean f = sk2Var.f(mi2Var) | sk2Var.h(nd3Var);
            Object L = sk2Var.L();
            Object obj5 = su0.a;
            if (f || L == obj5) {
                L = new ah3(mi2Var, nd3Var);
                sk2Var.h0(L);
            }
            ki2 ki2Var = (ki2) L;
            boolean h = sk2Var.h(nd3Var);
            mi2 mi2Var2 = this.R;
            boolean f2 = h | sk2Var.f(mi2Var2);
            Object L2 = sk2Var.L();
            if (f2 || L2 == obj5) {
                L2 = new ah3(nd3Var, mi2Var2);
                sk2Var.h0(L2);
            }
            ki2 ki2Var2 = (ki2) L2;
            h24 h24Var = this.X;
            mi2 mi2Var3 = this.Y;
            boolean h2 = sk2Var.h(h24Var) | sk2Var.h(nd3Var) | sk2Var.f(mi2Var3);
            Object L3 = sk2Var.L();
            if (h2 || L3 == obj5) {
                L3 = new bh3(h24Var, nd3Var, mi2Var3);
                sk2Var.h0(L3);
            }
            nl2.e(nd3Var, x, ki2Var, ki2Var2, (ki2) L3, sk2Var, 0);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
