package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh5  reason: default package */
/* loaded from: classes.dex */
public final class hh5 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ bm5 B;
    public final /* synthetic */ mi2 L;

    public hh5(List list, bm5 bm5Var, mi2 mi2Var) {
        this.A = list;
        this.B = bm5Var;
        this.L = mi2Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
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
            ti4 ti4Var = (ti4) this.A.get(intValue);
            sk2Var.X(1944892793);
            bm5 bm5Var = (bm5) ti4Var.A;
            int intValue3 = ((Number) ti4Var.B).intValue();
            if (bm5Var == bm5.FAVORITES) {
                str = "★ ";
            } else {
                str = "";
            }
            String upperCase = me2.X(sk2Var, intValue3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String concat = str.concat(upperCase);
            if (bm5Var == this.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            mi2 mi2Var = this.L;
            boolean f = sk2Var.f(mi2Var) | sk2Var.d(bm5Var.ordinal());
            Object L = sk2Var.L();
            if (f || L == su0.a) {
                L = new j5(9, mi2Var, bm5Var);
                sk2Var.h0(L);
            }
            nk2.j(concat, z2, (ki2) L, null, 0L, 0L, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, sk2Var, 0, 504);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
