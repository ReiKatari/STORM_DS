package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi5  reason: default package */
/* loaded from: classes.dex */
public final class hi5 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ Map L;
    public final /* synthetic */ int R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ ri5 Y;
    public final /* synthetic */ mi2 Z;
    public final /* synthetic */ Map c0;
    public final /* synthetic */ Map d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ Set f0;
    public final /* synthetic */ mi2 g0;
    public final /* synthetic */ mi2 h0;
    public final /* synthetic */ mi2 i0;

    public hi5(List list, mi2 mi2Var, Map map, int i, mi2 mi2Var2, ri5 ri5Var, mi2 mi2Var3, Map map2, Map map3, boolean z, Set set, mi2 mi2Var4, mi2 mi2Var5, mi2 mi2Var6) {
        this.A = list;
        this.B = mi2Var;
        this.L = map;
        this.R = i;
        this.X = mi2Var2;
        this.Y = ri5Var;
        this.Z = mi2Var3;
        this.c0 = map2;
        this.d0 = map3;
        this.e0 = z;
        this.f0 = set;
        this.g0 = mi2Var4;
        this.h0 = mi2Var5;
        this.i0 = mi2Var6;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
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
        boolean z6 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(i & 1, z)) {
            int i4 = i & 126;
            Object obj5 = (lh5) this.A.get(intValue);
            sk2Var.X(-1722484982);
            boolean z7 = obj5 instanceof jh5;
            ri5 ri5Var = this.Y;
            Object obj6 = su0.a;
            if (z7) {
                sk2Var.X(775720214);
                jh5 jh5Var = (jh5) obj5;
                String str3 = jh5Var.b;
                String str4 = jh5Var.c;
                Object obj7 = this.B;
                boolean f = sk2Var.f(obj5) | sk2Var.f(obj7);
                Object L = sk2Var.L();
                if (f || L == obj6) {
                    L = new j5(11, obj7, jh5Var);
                    sk2Var.h0(L);
                }
                ki2 ki2Var = (ki2) L;
                zy3 l0 = dt3.l0(intValue, b31.p("folder:", jh5Var.a), this.L, this.R, this.X, sk2Var, (i4 >> 3) & 14);
                if (intValue != ri5Var.a.size() - 1) {
                    z6 = false;
                }
                tq5.b(str3, str4, ki2Var, dt3.O(l0, z6), sk2Var, 0);
                sk2Var.p(false);
                z5 = false;
            } else if (obj5 instanceof kh5) {
                sk2Var.X(-1721730195);
                kh5 kh5Var = (kh5) obj5;
                rg5 rg5Var = kh5Var.a;
                String str5 = rg5Var.i;
                Uri uri = rg5Var.d;
                mi2 mi2Var = this.Z;
                boolean f2 = sk2Var.f(mi2Var) | sk2Var.f(obj5);
                Object L2 = sk2Var.L();
                if (f2 || L2 == obj6) {
                    L2 = new ei5(mi2Var, kh5Var, null, 1);
                    sk2Var.h0(L2);
                }
                l.g(sk2Var, (aj2) L2, uri);
                String str6 = (String) this.c0.get(str5);
                String uri2 = uri.toString();
                Map map = this.d0;
                String str7 = (String) map.get(uri2);
                if (str7 != null && str7.length() > 0) {
                    str = str7;
                } else {
                    str = null;
                }
                if (map.get(uri.toString()) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.e0 && !rg5Var.c()) {
                    str2 = str;
                    z3 = true;
                } else {
                    str2 = str;
                    z3 = false;
                }
                boolean contains = this.f0.contains(str5);
                mi2 mi2Var2 = this.g0;
                boolean f3 = sk2Var.f(mi2Var2) | sk2Var.f(obj5);
                Object L3 = sk2Var.L();
                if (f3 || L3 == obj6) {
                    L3 = new fi5(mi2Var2, kh5Var, 2);
                    sk2Var.h0(L3);
                }
                ki2 ki2Var2 = (ki2) L3;
                boolean f4 = sk2Var.f(obj5);
                mi2 mi2Var3 = this.h0;
                boolean f5 = f4 | sk2Var.f(mi2Var3);
                Object L4 = sk2Var.L();
                if (f5 || L4 == obj6) {
                    L4 = new fi5(kh5Var, mi2Var3, 3);
                    sk2Var.h0(L4);
                }
                ki2 ki2Var3 = (ki2) L4;
                mi2 mi2Var4 = this.i0;
                boolean f6 = sk2Var.f(obj5) | sk2Var.f(mi2Var4);
                Object L5 = sk2Var.L();
                if (f6 || L5 == obj6) {
                    L5 = new fi5(mi2Var4, kh5Var, 4);
                    sk2Var.h0(L5);
                }
                ki2 ki2Var4 = (ki2) L5;
                zy3 l02 = dt3.l0(intValue, dt3.h0(kh5Var), this.L, this.R, this.X, sk2Var, (i4 >> 3) & 14);
                if (intValue == ri5Var.a.size() - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tq5.c(rg5Var, str6, str2, z2, z3, contains, ki2Var2, ki2Var3, ki2Var4, dt3.O(l02, z4), sk2Var, 0);
                z5 = false;
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, 775719961, false);
            }
            sk2Var.p(z5);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
