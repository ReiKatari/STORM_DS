package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lz  reason: default package */
/* loaded from: classes.dex */
public final class lz implements cj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ List B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ mi2 R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    public lz(List list, mi2 mi2Var, Map map, Map map2, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4) {
        this.B = list;
        this.L = mi2Var;
        this.Y = map;
        this.Z = map2;
        this.R = mi2Var2;
        this.X = mi2Var3;
        this.c0 = mi2Var4;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        jz jzVar;
        int i2;
        int i3;
        int i4;
        boolean z3;
        String str;
        boolean z4;
        int i5;
        int i6;
        int i7 = this.A;
        o27 o27Var = o27.a;
        Object obj5 = this.c0;
        Object obj6 = this.Y;
        List list = this.B;
        sn1 sn1Var = su0.a;
        mi2 mi2Var = this.L;
        Object obj7 = this.Z;
        mi2 mi2Var2 = this.R;
        mi2 mi2Var3 = this.X;
        boolean z5 = true;
        switch (i7) {
            case 0:
                th3 th3Var = (th3) obj;
                int intValue = ((Number) obj2).intValue();
                tu0 tu0Var = (tu0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                UUID uuid = (UUID) obj6;
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var).f(th3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
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
                    vy vyVar = (vy) list.get(intValue);
                    sk2Var.X(673656973);
                    if (vyVar == null) {
                        sk2Var.X(673656817);
                        if (uuid != null) {
                            z5 = false;
                        }
                        boolean f = sk2Var.f(mi2Var);
                        Object L = sk2Var.L();
                        if (!f && L != sn1Var) {
                            z2 = false;
                            jzVar = L;
                        } else {
                            z2 = false;
                            jz jzVar2 = new jz(0, mi2Var);
                            sk2Var.h0(jzVar2);
                            jzVar = jzVar2;
                        }
                        ct3.A(z5, (ki2) jzVar, sk2Var, z2 ? 1 : 0);
                        sk2Var.p(z2);
                    } else {
                        sk2Var.X(673861665);
                        boolean x = b53.x(uuid, vyVar.a);
                        g56 g56Var = (g56) obj7;
                        gn gnVar = (gn) obj5;
                        boolean f2 = sk2Var.f(mi2Var) | sk2Var.h(vyVar);
                        Object L2 = sk2Var.L();
                        kz kzVar = L2;
                        if (f2 || L2 == sn1Var) {
                            kz kzVar2 = new kz(mi2Var, vyVar, 0);
                            sk2Var.h0(kzVar2);
                            kzVar = kzVar2;
                        }
                        ki2 ki2Var = (ki2) kzVar;
                        boolean f3 = sk2Var.f(mi2Var2) | sk2Var.h(vyVar);
                        Object L3 = sk2Var.L();
                        kz kzVar3 = L3;
                        if (f3 || L3 == sn1Var) {
                            kz kzVar4 = new kz(mi2Var2, vyVar, 1);
                            sk2Var.h0(kzVar4);
                            kzVar3 = kzVar4;
                        }
                        ki2 ki2Var2 = (ki2) kzVar3;
                        boolean f4 = sk2Var.f(mi2Var3) | sk2Var.h(vyVar);
                        Object L4 = sk2Var.L();
                        kz kzVar5 = L4;
                        if (f4 || L4 == sn1Var) {
                            kz kzVar6 = new kz(mi2Var3, vyVar, 2);
                            sk2Var.h0(kzVar6);
                            kzVar5 = kzVar6;
                        }
                        ct3.p(vyVar, x, g56Var, gnVar, ki2Var, ki2Var2, (ki2) kzVar5, sk2Var, 0);
                        z2 = false;
                        sk2Var.p(false);
                    }
                    sk2Var.p(z2);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ni3 ni3Var = (ni3) obj;
                int intValue3 = ((Number) obj2).intValue();
                tu0 tu0Var2 = (tu0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Map map = (Map) obj7;
                if ((intValue4 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ni3Var)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((sk2) tu0Var2).d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(i4 & 1, z3)) {
                    rg5 rg5Var = (rg5) list.get(intValue3);
                    sk2Var2.X(-424800199);
                    Uri uri = rg5Var.d;
                    boolean f5 = sk2Var2.f(mi2Var) | sk2Var2.h(rg5Var);
                    Object L5 = sk2Var2.L();
                    n5 n5Var = L5;
                    if (f5 || L5 == sn1Var) {
                        n5 n5Var2 = new n5(mi2Var, rg5Var, (j11) null, 22);
                        sk2Var2.h0(n5Var2);
                        n5Var = n5Var2;
                    }
                    l.g(sk2Var2, (aj2) n5Var, uri);
                    String str2 = (String) ((Map) obj6).get(rg5Var.i);
                    String str3 = (String) map.get(uri.toString());
                    if (str3 != null && str3.length() > 0) {
                        str = str3;
                    } else {
                        str = null;
                    }
                    if (map.get(uri.toString()) == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f6 = sk2Var2.f(mi2Var2) | sk2Var2.h(rg5Var);
                    Object L6 = sk2Var2.L();
                    f71 f71Var = L6;
                    if (f6 || L6 == sn1Var) {
                        f71 f71Var2 = new f71(mi2Var2, rg5Var, 1);
                        sk2Var2.h0(f71Var2);
                        f71Var = f71Var2;
                    }
                    ki2 ki2Var3 = (ki2) f71Var;
                    boolean f7 = sk2Var2.f(mi2Var3) | sk2Var2.h(rg5Var);
                    Object L7 = sk2Var2.L();
                    f71 f71Var3 = L7;
                    if (f7 || L7 == sn1Var) {
                        f71 f71Var4 = new f71(mi2Var3, rg5Var, 2);
                        sk2Var2.h0(f71Var4);
                        f71Var3 = f71Var4;
                    }
                    nk2.c(rg5Var, str2, str, z4, ki2Var3, (ki2) f71Var3, (mi2) obj5, sk2Var2, 0);
                    sk2Var2.p(false);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }

    public lz(List list, UUID uuid, mi2 mi2Var, g56 g56Var, gn gnVar, mi2 mi2Var2, mi2 mi2Var3) {
        this.B = list;
        this.Y = uuid;
        this.L = mi2Var;
        this.Z = g56Var;
        this.c0 = gnVar;
        this.R = mi2Var2;
        this.X = mi2Var3;
    }
}
