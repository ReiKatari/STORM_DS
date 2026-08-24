package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs5  reason: default package */
/* loaded from: classes.dex */
public final class gs5 implements go2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ int B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ Map X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ qn2 d0;
    public final /* synthetic */ qn2 e0;
    public final /* synthetic */ Map f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ qn2 h0;
    public final /* synthetic */ int i0;

    public gs5(ArrayList arrayList, int i, qn2 qn2Var, Map map, Map map2, boolean z, Set set, qn2 qn2Var2, qn2 qn2Var3, Map map3, int i2, qn2 qn2Var4, int i3) {
        this.A = arrayList;
        this.B = i;
        this.L = qn2Var;
        this.R = map;
        this.X = map2;
        this.Y = z;
        this.Z = set;
        this.d0 = qn2Var2;
        this.e0 = qn2Var3;
        this.f0 = map3;
        this.g0 = i2;
        this.h0 = qn2Var4;
        this.i0 = i3;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ro3 ro3Var = (ro3) obj;
        int intValue = ((Number) obj2).intValue();
        px0 px0Var = (px0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((xq2) px0Var).f(ro3Var)) {
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
        boolean z4 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            mr5 mr5Var = (mr5) this.A.get(intValue);
            xq2Var.b0(-791923249);
            int i4 = this.B + intValue;
            pq5 pq5Var = mr5Var.a;
            Uri uri = pq5Var.d;
            qn2 qn2Var = this.L;
            boolean f = xq2Var.f(qn2Var) | xq2Var.h(mr5Var);
            Object P = xq2Var.P();
            Object obj5 = ox0.a;
            if (f || P == obj5) {
                P = new ds5(qn2Var, mr5Var, null, 0);
                xq2Var.l0(P);
            }
            mb3.i(xq2Var, (eo2) P, uri);
            pq5 pq5Var2 = mr5Var.a;
            String str2 = (String) this.R.get(pq5Var2.i);
            String str3 = pq5Var.i;
            String uri2 = uri.toString();
            Map map = this.X;
            String str4 = (String) map.get(uri2);
            if (str4 != null && str4.length() > 0) {
                str = str4;
            } else {
                str = null;
            }
            if (map.get(uri.toString()) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.Y && (this.Z.contains(str3) || (!qs6.v0(str3) && !pq5Var.c()))) {
                z3 = true;
            } else {
                z3 = false;
            }
            qn2 qn2Var2 = this.d0;
            boolean f2 = xq2Var.f(qn2Var2) | xq2Var.h(mr5Var);
            Object P2 = xq2Var.P();
            if (f2 || P2 == obj5) {
                P2 = new es5(qn2Var2, mr5Var, 0);
                xq2Var.l0(P2);
            }
            on2 on2Var = (on2) P2;
            qn2 qn2Var3 = this.e0;
            boolean f3 = xq2Var.f(qn2Var3) | xq2Var.h(mr5Var);
            Object P3 = xq2Var.P();
            if (f3 || P3 == obj5) {
                P3 = new es5(qn2Var3, mr5Var, 1);
                xq2Var.l0(P3);
            }
            on2 on2Var2 = (on2) P3;
            a74 o0 = nw7.o0(i4, xg6.n(uri, "rom:"), this.f0, this.g0, this.h0, xq2Var, 0);
            if (i4 < this.i0) {
                z4 = false;
            }
            ii2.l(pq5Var2, str2, str, z2, z3, on2Var, on2Var2, nw7.N(o0, z4), xq2Var, 0);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
