package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr5  reason: default package */
/* loaded from: classes.dex */
public final class hr5 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ Map X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ qn2 d0;

    public /* synthetic */ hr5(List list, qn2 qn2Var, Map map, Map map2, qn2 qn2Var2, qn2 qn2Var3, qn2 qn2Var4, int i) {
        this.A = i;
        this.B = list;
        this.L = qn2Var;
        this.R = map;
        this.X = map2;
        this.Y = qn2Var2;
        this.Z = qn2Var3;
        this.d0 = qn2Var4;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        String str2;
        boolean z4;
        int i5;
        int i6;
        int i7 = this.A;
        jg7 jg7Var = jg7.a;
        Map map = this.R;
        List list = this.B;
        Object obj5 = ox0.a;
        qn2 qn2Var = this.L;
        Map map2 = this.X;
        qn2 qn2Var2 = this.Y;
        qn2 qn2Var3 = this.Z;
        switch (i7) {
            case 0:
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
                    i = intValue2 | i3;
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
                    pq5 pq5Var = (pq5) list.get(intValue);
                    xq2Var.b0(1135582895);
                    Uri uri = pq5Var.d;
                    boolean f = xq2Var.f(qn2Var) | xq2Var.h(pq5Var);
                    Object P = xq2Var.P();
                    if (f || P == obj5) {
                        P = new gr5(qn2Var, pq5Var, null, 0);
                        xq2Var.l0(P);
                    }
                    mb3.i(xq2Var, (eo2) P, uri);
                    String str3 = (String) map.get(pq5Var.i);
                    String str4 = (String) map2.get(uri.toString());
                    if (str4 != null && str4.length() > 0) {
                        str = str4;
                    } else {
                        str = null;
                    }
                    if (map2.get(uri.toString()) == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f2 = xq2Var.f(qn2Var2) | xq2Var.h(pq5Var);
                    Object P2 = xq2Var.P();
                    if (f2 || P2 == obj5) {
                        P2 = new ua1(qn2Var2, pq5Var, 1);
                        xq2Var.l0(P2);
                    }
                    on2 on2Var = (on2) P2;
                    boolean f3 = xq2Var.f(qn2Var3) | xq2Var.h(pq5Var);
                    Object P3 = xq2Var.P();
                    if (f3 || P3 == obj5) {
                        P3 = new ua1(qn2Var3, pq5Var, 2);
                        xq2Var.l0(P3);
                    }
                    ak7.n(pq5Var, str3, str, z2, on2Var, (on2) P3, this.d0, xq2Var, 0);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var2 = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
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
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i4 & 1, z3)) {
                    pq5 pq5Var2 = (pq5) list.get(intValue3);
                    xq2Var2.b0(-424800199);
                    Uri uri2 = pq5Var2.d;
                    boolean f4 = xq2Var2.f(qn2Var) | xq2Var2.h(pq5Var2);
                    Object P4 = xq2Var2.P();
                    if (f4 || P4 == obj5) {
                        P4 = new gr5(qn2Var, pq5Var2, null, 1);
                        xq2Var2.l0(P4);
                    }
                    mb3.i(xq2Var2, (eo2) P4, uri2);
                    String str5 = (String) map.get(pq5Var2.i);
                    String str6 = (String) map2.get(uri2.toString());
                    if (str6 != null && str6.length() > 0) {
                        str2 = str6;
                    } else {
                        str2 = null;
                    }
                    if (map2.get(uri2.toString()) == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f5 = xq2Var2.f(qn2Var2) | xq2Var2.h(pq5Var2);
                    Object P5 = xq2Var2.P();
                    if (f5 || P5 == obj5) {
                        P5 = new ua1(qn2Var2, pq5Var2, 3);
                        xq2Var2.l0(P5);
                    }
                    on2 on2Var2 = (on2) P5;
                    boolean f6 = xq2Var2.f(qn2Var3) | xq2Var2.h(pq5Var2);
                    Object P6 = xq2Var2.P();
                    if (f6 || P6 == obj5) {
                        P6 = new ua1(qn2Var3, pq5Var2, 4);
                        xq2Var2.l0(P6);
                    }
                    ak7.m(pq5Var2, str5, str2, z4, on2Var2, (on2) P6, this.d0, xq2Var2, 0);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
