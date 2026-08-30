package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi5  reason: default package */
/* loaded from: classes.dex */
public final class gi5 implements cj2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ int B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ Map X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ mi2 Z;
    public final /* synthetic */ mi2 c0;
    public final /* synthetic */ Map d0;
    public final /* synthetic */ int e0;
    public final /* synthetic */ mi2 f0;
    public final /* synthetic */ int g0;

    public gi5(ArrayList arrayList, int i, mi2 mi2Var, Map map, Map map2, Set set, mi2 mi2Var2, mi2 mi2Var3, Map map3, int i2, mi2 mi2Var4, int i3) {
        this.A = arrayList;
        this.B = i;
        this.L = mi2Var;
        this.R = map;
        this.X = map2;
        this.Y = set;
        this.Z = mi2Var2;
        this.c0 = mi2Var3;
        this.d0 = map3;
        this.e0 = i2;
        this.f0 = mi2Var4;
        this.g0 = i3;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        boolean z2;
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
        boolean z3 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(i & 1, z)) {
            kh5 kh5Var = (kh5) this.A.get(intValue);
            sk2Var.X(359116132);
            int i4 = this.B + intValue;
            rg5 rg5Var = kh5Var.a;
            Uri uri = rg5Var.d;
            mi2 mi2Var = this.L;
            boolean f = sk2Var.f(mi2Var) | sk2Var.h(kh5Var);
            Object L = sk2Var.L();
            Object obj5 = su0.a;
            if (f || L == obj5) {
                L = new ei5(mi2Var, kh5Var, null, 0);
                sk2Var.h0(L);
            }
            l.g(sk2Var, (aj2) L, uri);
            rg5 rg5Var2 = kh5Var.a;
            String str2 = (String) this.R.get(rg5Var2.i);
            String uri2 = uri.toString();
            Map map = this.X;
            String str3 = (String) map.get(uri2);
            if (str3 != null && str3.length() > 0) {
                str = str3;
            } else {
                str = null;
            }
            if (map.get(uri.toString()) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean contains = this.Y.contains(rg5Var.i);
            mi2 mi2Var2 = this.Z;
            boolean f2 = sk2Var.f(mi2Var2) | sk2Var.h(kh5Var);
            Object L2 = sk2Var.L();
            if (f2 || L2 == obj5) {
                L2 = new fi5(mi2Var2, kh5Var, 0);
                sk2Var.h0(L2);
            }
            ki2 ki2Var = (ki2) L2;
            boolean h = sk2Var.h(kh5Var);
            mi2 mi2Var3 = this.c0;
            boolean f3 = h | sk2Var.f(mi2Var3);
            Object L3 = sk2Var.L();
            if (f3 || L3 == obj5) {
                L3 = new fi5(kh5Var, mi2Var3, 1);
                sk2Var.h0(L3);
            }
            ki2 ki2Var2 = (ki2) L3;
            zy3 l0 = dt3.l0(i4, wh1.i(uri, "rom:"), this.d0, this.e0, this.f0, sk2Var, 0);
            if (i4 < this.g0) {
                z3 = false;
            }
            ve2.e(rg5Var2, str2, str, z2, contains, ki2Var, ki2Var2, dt3.O(l0, z3), sk2Var, 0);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
