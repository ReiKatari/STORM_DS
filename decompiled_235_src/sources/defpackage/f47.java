package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f47  reason: default package */
/* loaded from: classes.dex */
public final class f47 {
    public final vs4 a = np2.Y(null);
    public fp b;
    public final mm6 c;

    public f47(fp fpVar) {
        h37 h37Var = new h37(2);
        fpVar.getClass();
        dp dpVar = new dp(fpVar);
        ArrayList arrayList = dpVar.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) h37Var.g(((cp) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ep epVar = (ep) list.get(i2);
                arrayList3.add(new cp(epVar.a, epVar.b, epVar.c, epVar.d));
            }
            gt0.A0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = dpVar.f();
        this.c = new mm6();
    }

    public static ep c(ep epVar, a47 a47Var) {
        v84 v84Var = a47Var.b;
        int c = v84Var.c(v84Var.f - 1, false);
        if (epVar.b >= c) {
            return null;
        }
        return ep.a(epVar, null, Math.min(epVar.c, c), 11);
    }

    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        nn6 nn6Var;
        nn6 nn6Var2;
        nn6 nn6Var3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1154651354);
        char c2 = 2;
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z7 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            vm vmVar = (vm) xq2Var.j(ky0.s);
            fp fpVar = this.b;
            List a = fpVar.a(fpVar.B.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                ep epVar = (ep) a.get(i4);
                int i5 = epVar.b;
                Object obj = epVar.a;
                if (i5 != epVar.c) {
                    xq2Var.b0(725478935);
                    Object P = xq2Var.P();
                    Object obj2 = ox0.a;
                    if (P == obj2) {
                        P = i61.f(xq2Var);
                    }
                    r94 r94Var = (r94) P;
                    c = c2;
                    a74 G = hv.G(x64.a, new qk4(25, this, epVar));
                    Object P2 = xq2Var.P();
                    if (P2 == obj2) {
                        z3 = true;
                        P2 = new h37(3);
                        xq2Var.l0(P2);
                    } else {
                        z3 = true;
                    }
                    a74 S = nc1.S(ua6.a(G, z7, (qn2) P2).d(new l47(new pk0(9, this, epVar))), r94Var);
                    ty4.a.getClass();
                    a74 S2 = kj2.S(S, jw2.z);
                    boolean h = xq2Var.h(this) | xq2Var.f(epVar) | xq2Var.h(vmVar);
                    Object P3 = xq2Var.P();
                    if (h || P3 == obj2) {
                        P3 = new yu6(this, epVar, vmVar);
                        xq2Var.l0(P3);
                    }
                    h70.a(mb3.v(S2, r94Var, false, null, (on2) P3, 508), xq2Var, 0);
                    pv3 pv3Var = (pv3) obj;
                    g47 a2 = pv3Var.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        z2 = false;
                        xq2Var.b0(728331710);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(726303039);
                        Object P4 = xq2Var.P();
                        if (P4 == obj2) {
                            P4 = new vv3(r94Var);
                            xq2Var.l0(P4);
                        }
                        vv3 vv3Var = (vv3) P4;
                        Object P5 = xq2Var.P();
                        nn6 nn6Var4 = null;
                        if (P5 == obj2) {
                            P5 = new ns3(vv3Var, null, 14);
                            xq2Var.l0(P5);
                        }
                        mb3.i(xq2Var, (eo2) P5, jg7.a);
                        ss4 ss4Var = vv3Var.b;
                        ss4 ss4Var2 = vv3Var.b;
                        if ((ss4Var.h() & 2) != 0) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z4);
                        if ((ss4Var2.h() & 1) != 0) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        if ((ss4Var2.h() & 4) != 0) {
                            z6 = z3;
                        } else {
                            z6 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        g47 a3 = pv3Var.a();
                        if (a3 != null) {
                            nn6Var = a3.a;
                        } else {
                            nn6Var = null;
                        }
                        g47 a4 = pv3Var.a();
                        if (a4 != null) {
                            nn6Var2 = a4.b;
                        } else {
                            nn6Var2 = null;
                        }
                        g47 a5 = pv3Var.a();
                        if (a5 != null) {
                            nn6Var3 = a5.c;
                        } else {
                            nn6Var3 = null;
                        }
                        g47 a6 = pv3Var.a();
                        if (a6 != null) {
                            nn6Var4 = a6.d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, nn6Var, nn6Var2, nn6Var3, nn6Var4};
                        boolean h2 = xq2Var.h(this) | xq2Var.f(epVar);
                        Object P6 = xq2Var.P();
                        if (h2 || P6 == obj2) {
                            P6 = new qk4(this, epVar, vv3Var);
                            xq2Var.l0(P6);
                        }
                        b(objArr, (qn2) P6, xq2Var, (i3 << 6) & 896);
                        z2 = false;
                        xq2Var.p(false);
                    }
                    xq2Var.p(z2);
                } else {
                    c = c2;
                    z2 = z7;
                    xq2Var.b0(728345598);
                    xq2Var.p(z2);
                }
                i4++;
                z7 = z2;
                c2 = c;
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new y36(this, i, 11);
        }
    }

    public final void b(Object[] objArr, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2083052099);
        if ((i & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(this)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        xq2Var.Z(-358306546, Integer.valueOf(objArr.length));
        boolean z2 = false;
        if (xq2Var.d(objArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i7 = i2 | i3;
        for (Object obj : objArr) {
            if (xq2Var.h(obj)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i7 |= i4;
        }
        xq2Var.p(false);
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            ww2 ww2Var = new ww2(2);
            ww2Var.a(qn2Var);
            ww2Var.d(objArr);
            ArrayList arrayList = ww2Var.b;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h = xq2Var.h(this);
            if ((i7 & 112) == 32) {
                z2 = true;
            }
            boolean z3 = h | z2;
            Object P = xq2Var.P();
            if (z3 || P == ox0.a) {
                P = new o30(this, qn2Var, 1);
                xq2Var.l0(P);
            }
            mb3.f(array, (qn2) P, xq2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(this, objArr, qn2Var, i, 27);
        }
    }
}
