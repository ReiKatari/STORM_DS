package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ m4(j37 j37Var, qn2 qn2Var, qa4 qa4Var) {
        this.A = 11;
        this.B = j37Var;
        this.R = qn2Var;
        this.L = qa4Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        double d;
        float f;
        boolean z4;
        float f2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str;
        boolean z10;
        boolean z11;
        String str2;
        eo2 vy5Var;
        qa4 qa4Var;
        int i;
        int i2 = this.A;
        du duVar = ju.a;
        eu euVar = ju.c;
        x64 x64Var = x64.a;
        int i3 = 4;
        vs0 vs0Var = ox0.a;
        jg7 jg7Var = jg7.a;
        boolean z12 = false;
        Object obj4 = this.L;
        Object obj5 = this.R;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                List list = (List) obj6;
                qa4 qa4Var2 = (qa4) obj4;
                qa4 qa4Var3 = (qa4) obj5;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    d40 d40Var = d90.i0;
                    a74 S = ge7.S(dj6.c(x64Var, 1.0f), RecyclerView.B1, 8.0f, RecyclerView.B1, RecyclerView.B1, 13);
                    l26 a = k26.a(duVar, d40Var, xq2Var, 48);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, S);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, a);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    g6 g6Var = (g6) qa4Var2.getValue();
                    boolean f3 = xq2Var.f(qa4Var2);
                    Object P = xq2Var.P();
                    if (f3 || P == vs0Var) {
                        P = new j4(qa4Var2, 1);
                        xq2Var.l0(P);
                    }
                    nc1.d(list, g6Var, (qn2) P, new kw0(6), new vn3(1.0f, false), xq2Var, 0);
                    gi2.h(xq2Var, dj6.l(x64Var, 5.0f));
                    boolean booleanValue = ((Boolean) qa4Var3.getValue()).booleanValue();
                    boolean f4 = xq2Var.f(qa4Var3);
                    Object P2 = xq2Var.P();
                    if (!f4 && P2 != vs0Var) {
                        z2 = true;
                    } else {
                        z2 = true;
                        P2 = new f4(qa4Var3, 1);
                        xq2Var.l0(P2);
                    }
                    nc1.s(booleanValue, (on2) P2, xq2Var, 0);
                    xq2Var.p(z2);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                eo2 eo2Var = (eo2) obj6;
                zv0 zv0Var = (zv0) obj4;
                fo2 fo2Var = (fo2) obj5;
                m26 m26Var = (m26) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                d40 d40Var2 = d90.i0;
                if ((intValue2 & 6) == 0) {
                    if (!((xq2) px0Var2).f(m26Var)) {
                        i3 = 2;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z3)) {
                    if (eo2Var == null) {
                        xq2Var2.b0(-1394361313);
                        gi2.h(xq2Var2, gq.a);
                        xq2Var2.p(false);
                        d = 0.5d;
                        z4 = true;
                    } else {
                        xq2Var2.b0(-1394295686);
                        a74 a74Var = gq.b;
                        l26 a2 = k26.a(duVar, d40Var2, xq2Var2, 48);
                        int B = ge7.B(xq2Var2);
                        xv4 l2 = xq2Var2.l();
                        a74 E2 = l.E(xq2Var2, a74Var);
                        jx0.i.getClass();
                        d = 0.5d;
                        iy0 iy0Var2 = ix0.b;
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, ix0.f, a2);
                        yh2.K(xq2Var2, ix0.e, l2);
                        pn pnVar = ix0.g;
                        if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                            i61.v(B, xq2Var2, B, pnVar);
                        }
                        yh2.K(xq2Var2, ix0.d, E2);
                        py0 py0Var = g31.a;
                        long j = ((kt0) xq2Var2.j(j31.a)).a;
                        if (!((ut0) xq2Var2.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                            f = 1.0f;
                        } else {
                            f = 0.87f;
                        }
                        hv.d(py0Var.a(Float.valueOf(f)), eo2Var, xq2Var2, 8);
                        z4 = true;
                        xq2Var2.p(true);
                        xq2Var2.p(false);
                    }
                    a74 b = m26Var.b(dj6.b(x64Var, 1.0f), 1.0f, z4);
                    l26 a3 = k26.a(duVar, d40Var2, xq2Var2, 48);
                    int B2 = ge7.B(xq2Var2);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, b);
                    jx0.i.getClass();
                    iy0 iy0Var3 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a3);
                    yh2.K(xq2Var2, ix0.e, l3);
                    pn pnVar2 = ix0.g;
                    if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B2))) {
                        i61.v(B2, xq2Var2, B2, pnVar2);
                    }
                    yh2.K(xq2Var2, ix0.d, E3);
                    x37.a(((xe7) xq2Var2.j(ye7.b)).f, n16.I(1206983395, new eq(zv0Var, 0), xq2Var2), xq2Var2, 48);
                    xq2Var2.p(true);
                    py0 py0Var2 = g31.a;
                    long j2 = ((kt0) xq2Var2.j(j31.a)).a;
                    if (!((ut0) xq2Var2.j(vt0.a)).k() ? hv.N(j2) < d : hv.N(j2) > d) {
                        f2 = 0.74f;
                    } else {
                        f2 = 0.6f;
                    }
                    hv.d(py0Var2.a(Float.valueOf(f2)), n16.I(-1033635954, new fq(fo2Var, 0), xq2Var2), xq2Var2, 56);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                v80 v80Var = (v80) obj4;
                v96 v96Var = (v96) obj5;
                Throwable th = (Throwable) obj;
                l61 l61Var = (l61) obj3;
                if (obj6 != x80.l) {
                    oi2.k(v80Var.B, obj6, v96Var.A);
                }
                return jg7Var;
            case 3:
                on2 on2Var = (on2) obj6;
                qn2 qn2Var = (qn2) obj4;
                on2 on2Var2 = (on2) obj5;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z5)) {
                    mb3.c(yh2.O(xq2Var3, R.string.dsiware_manager_rename), false, false, on2Var, xq2Var3, 0, 6);
                    String O = yh2.O(xq2Var3, R.string.dsiware_manager_import_data);
                    boolean f5 = xq2Var3.f(qn2Var);
                    Object P3 = xq2Var3.P();
                    if (f5 || P3 == vs0Var) {
                        P3 = new j91(1, qn2Var);
                        xq2Var3.l0(P3);
                    }
                    mb3.c(O, false, false, (on2) P3, xq2Var3, 0, 6);
                    String O2 = yh2.O(xq2Var3, R.string.dsiware_manager_export_data);
                    boolean f6 = xq2Var3.f(qn2Var);
                    Object P4 = xq2Var3.P();
                    if (f6 || P4 == vs0Var) {
                        P4 = new j91(2, qn2Var);
                        xq2Var3.l0(P4);
                    }
                    mb3.c(O2, false, false, (on2) P4, xq2Var3, 0, 6);
                    mb3.c(yh2.O(xq2Var3, R.string.delete), false, true, on2Var2, xq2Var3, RendererDebugBridge.CAPTURE_HEIGHT, 2);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 4:
                j04 j04Var = (j04) obj6;
                qa4 qa4Var4 = (qa4) obj4;
                qa4 qa4Var5 = (qa4) obj5;
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z6)) {
                    String O3 = yh2.O(xq2Var4, R.string.dsiware_import_from_file);
                    boolean h = xq2Var4.h(j04Var);
                    Object P5 = xq2Var4.P();
                    if (h || P5 == vs0Var) {
                        P5 = new q6(20, j04Var, qa4Var5);
                        xq2Var4.l0(P5);
                    }
                    mb3.c(O3, false, false, (on2) P5, xq2Var4, 0, 6);
                    String O4 = yh2.O(xq2Var4, R.string.dsiware_import_from_rom_list);
                    boolean f7 = xq2Var4.f(qa4Var4);
                    Object P6 = xq2Var4.P();
                    if (f7 || P6 == vs0Var) {
                        P6 = new q6(21, qa4Var4, qa4Var5);
                        xq2Var4.l0(P6);
                    }
                    mb3.c(O4, false, false, (on2) P6, xq2Var4, 0, 6);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 5:
                qa4 qa4Var6 = (qa4) obj4;
                qa4 qa4Var7 = (qa4) obj5;
                String[] strArr = (String[]) obj6;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue5 & 6) == 0) {
                    if (!((xq2) px0Var5).f(lq4Var)) {
                        i3 = 2;
                    }
                    intValue5 |= i3;
                }
                if ((intValue5 & 19) != 18) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z7)) {
                    x64 x64Var2 = x64.a;
                    a74 N = ge7.N(x64Var2, lq4Var);
                    yt0 a4 = wt0.a(euVar, d90.k0, xq2Var5, 0);
                    int hashCode2 = Long.hashCode(xq2Var5.T);
                    xv4 l4 = xq2Var5.l();
                    a74 E4 = l.E(xq2Var5, N);
                    jx0.i.getClass();
                    iy0 iy0Var4 = ix0.b;
                    xq2Var5.f0();
                    if (xq2Var5.S) {
                        xq2Var5.k(iy0Var4);
                    } else {
                        xq2Var5.o0();
                    }
                    yh2.K(xq2Var5, ix0.f, a4);
                    yh2.K(xq2Var5, ix0.e, l4);
                    yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode2));
                    yh2.F(xq2Var5, ix0.h);
                    yh2.K(xq2Var5, ix0.d, E4);
                    xq2Var5.b0(-1173027909);
                    Iterator it = ck3.getEntries().iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            ck3 ck3Var = (ck3) next;
                            a74 c = dj6.c(x64Var2, 1.0f);
                            if (ck3Var == ((ck3) qa4Var6.getValue())) {
                                z8 = true;
                            } else {
                                z8 = z12;
                            }
                            mq5 mq5Var = new mq5(3);
                            boolean f8 = xq2Var5.f(qa4Var6) | xq2Var5.d(ck3Var.ordinal()) | xq2Var5.f(qa4Var7);
                            Iterator it2 = it;
                            Object P7 = xq2Var5.P();
                            if (f8 || P7 == vs0Var) {
                                P7 = new u6(ck3Var, qa4Var6, qa4Var7, 11);
                                xq2Var5.l0(P7);
                            }
                            a74 Q = ge7.Q(g04.P(c, z8, mq5Var, (on2) P7, 10), RecyclerView.B1, 12.0f, 1);
                            l26 a5 = k26.a(duVar, d90.i0, xq2Var5, 48);
                            qa4 qa4Var8 = qa4Var6;
                            int hashCode3 = Long.hashCode(xq2Var5.T);
                            xv4 l5 = xq2Var5.l();
                            a74 E5 = l.E(xq2Var5, Q);
                            jx0.i.getClass();
                            iy0 iy0Var5 = ix0.b;
                            xq2Var5.f0();
                            x64 x64Var3 = x64Var2;
                            if (xq2Var5.S) {
                                xq2Var5.k(iy0Var5);
                            } else {
                                xq2Var5.o0();
                            }
                            yh2.K(xq2Var5, ix0.f, a5);
                            yh2.K(xq2Var5, ix0.e, l5);
                            yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode3));
                            yh2.F(xq2Var5, ix0.h);
                            yh2.K(xq2Var5, ix0.d, E5);
                            if (ck3Var == ((ck3) qa4Var8.getValue())) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            xq2 xq2Var6 = xq2Var5;
                            kd5.a(z9, null, null, false, jx2.n(((ut0) xq2Var5.j(vt0.a)).i(), 0L, xq2Var6, 0, 6), xq2Var6, 48, 28);
                            xq2Var5 = xq2Var6;
                            if (i4 >= 0 && i4 < strArr.length) {
                                str = strArr[i4];
                            } else {
                                str = "";
                            }
                            x64Var2 = x64Var3;
                            x37.b(str, ge7.S(x64Var3, 16.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var5.j(ye7.b)).i, xq2Var5, 48, 0, 65532);
                            xq2Var5.p(true);
                            it = it2;
                            i4 = i5;
                            qa4Var6 = qa4Var8;
                            z12 = false;
                        } else {
                            hf.q0();
                            throw null;
                        }
                    }
                    xq2Var5.p(z12);
                    xq2Var5.p(true);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 6:
                zn5 zn5Var = (zn5) obj6;
                qa4 qa4Var9 = (qa4) obj4;
                qa4 qa4Var10 = (qa4) obj5;
                lq4 lq4Var2 = (lq4) obj;
                px0 px0Var6 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                lq4Var2.getClass();
                if ((intValue6 & 6) == 0) {
                    if (!((xq2) px0Var6).f(lq4Var2)) {
                        i3 = 2;
                    }
                    intValue6 |= i3;
                }
                if ((intValue6 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var6;
                if (xq2Var7.S(intValue6 & 1, z10)) {
                    a74 f9 = u24.f(ge7.N(x64Var, lq4Var2));
                    e34 d2 = h70.d(d90.L, false);
                    int hashCode4 = Long.hashCode(xq2Var7.T);
                    xv4 l6 = xq2Var7.l();
                    a74 E6 = l.E(xq2Var7, f9);
                    jx0.i.getClass();
                    iy0 iy0Var6 = ix0.b;
                    xq2Var7.f0();
                    if (xq2Var7.S) {
                        xq2Var7.k(iy0Var6);
                    } else {
                        xq2Var7.o0();
                    }
                    yh2.K(xq2Var7, ix0.f, d2);
                    yh2.K(xq2Var7, ix0.e, l6);
                    yh2.K(xq2Var7, ix0.g, Integer.valueOf(hashCode4));
                    yh2.F(xq2Var7, ix0.h);
                    yh2.K(xq2Var7, ix0.d, E6);
                    if (((Boolean) qa4Var9.getValue()).booleanValue()) {
                        xq2Var7.b0(590915709);
                        qo2.d(xq2Var7, 0);
                        xq2Var7.p(false);
                    } else {
                        xq2Var7.b0(590986823);
                        qo2.b(zn5Var, (zn5) qa4Var10.getValue(), xq2Var7, 0);
                        xq2Var7.p(false);
                    }
                    xq2Var7.p(true);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 7:
                es7 es7Var = (es7) obj6;
                pq5 pq5Var = (pq5) obj4;
                String str3 = (String) obj5;
                px0 px0Var7 = (px0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xq2 xq2Var8 = (xq2) px0Var7;
                if (xq2Var8.S(intValue7 & 1, z11)) {
                    a74 O5 = ge7.O(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(12.0f)), kt0.c(0.5f, es7Var.c), u24.m), 24.0f);
                    e34 d3 = h70.d(d90.Z, false);
                    int hashCode5 = Long.hashCode(xq2Var8.T);
                    xv4 l7 = xq2Var8.l();
                    a74 E7 = l.E(xq2Var8, O5);
                    jx0.i.getClass();
                    iy0 iy0Var7 = ix0.b;
                    xq2Var8.f0();
                    if (xq2Var8.S) {
                        xq2Var8.k(iy0Var7);
                    } else {
                        xq2Var8.o0();
                    }
                    pn pnVar3 = ix0.f;
                    yh2.K(xq2Var8, pnVar3, d3);
                    pn pnVar4 = ix0.e;
                    yh2.K(xq2Var8, pnVar4, l7);
                    Integer valueOf = Integer.valueOf(hashCode5);
                    pn pnVar5 = ix0.g;
                    yh2.K(xq2Var8, pnVar5, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var8, neVar);
                    pn pnVar6 = ix0.d;
                    yh2.K(xq2Var8, pnVar6, E7);
                    yt0 a6 = wt0.a(euVar, d90.l0, xq2Var8, 48);
                    int hashCode6 = Long.hashCode(xq2Var8.T);
                    xv4 l8 = xq2Var8.l();
                    a74 E8 = l.E(xq2Var8, x64Var);
                    xq2Var8.f0();
                    if (xq2Var8.S) {
                        xq2Var8.k(iy0Var7);
                    } else {
                        xq2Var8.o0();
                    }
                    yh2.K(xq2Var8, pnVar3, a6);
                    yh2.K(xq2Var8, pnVar4, l8);
                    i61.w(hashCode6, xq2Var8, pnVar5, xq2Var8, neVar);
                    yh2.K(xq2Var8, pnVar6, E8);
                    i13.a(ge7.z(), null, dj6.i(x64Var, 40.0f), hv.c(4284773515L), xq2Var8, 3504, 0);
                    gi2.h(xq2Var8, dj6.e(x64Var, 8.0f));
                    pi2 pi2Var = qs7.a;
                    x37.b("ЧИТ-КОДЫ ДЛЯ ДАННОЙ ИГРЫ НЕ НАЙДЕНЫ", null, hv.c(4287931320L), hi2.E(12), oj2.e0, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var8, 1772934, 0, 130962);
                    gi2.h(xq2Var8, dj6.e(x64Var, 4.0f));
                    String k0 = hf.k0(pq5Var);
                    if (!qs6.v0(str3)) {
                        str2 = lb1.A(" [", str3, "]");
                    } else {
                        str2 = "";
                    }
                    x37.b("В базе пока нет читов для " + k0 + str2 + ".\nНажмите «Импорт usrcheat.dat» или «Обновить базу читов», чтобы подключить Action Replay.", null, hv.c(4284773515L), hi2.D(9.5d), null, qs7.c, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var8, 1576320, 0, 130482);
                    xq2Var8.p(true);
                    xq2Var8.p(true);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 8:
                zt5 zt5Var = (zt5) obj6;
                j04 j04Var2 = (j04) obj4;
                j04 j04Var3 = (j04) obj5;
                px0 px0Var8 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                yt0 a7 = wt0.a(euVar, d90.k0, px0Var8, 0);
                xq2 xq2Var9 = (xq2) px0Var8;
                int hashCode7 = Long.hashCode(xq2Var9.T);
                xv4 l9 = xq2Var9.l();
                a74 E9 = l.E(px0Var8, x64Var);
                jx0.i.getClass();
                iy0 iy0Var8 = ix0.b;
                xq2 xq2Var10 = (xq2) px0Var8;
                xq2Var10.f0();
                if (xq2Var10.S) {
                    xq2Var10.k(iy0Var8);
                } else {
                    xq2Var10.o0();
                }
                yh2.K(px0Var8, ix0.f, a7);
                yh2.K(px0Var8, ix0.e, l9);
                yh2.K(px0Var8, ix0.g, Integer.valueOf(hashCode7));
                yh2.F(px0Var8, ix0.h);
                yh2.K(px0Var8, ix0.d, E9);
                String O6 = yh2.O(px0Var8, R.string.label_rom_config_gba_rom_path);
                String str4 = zt5Var.h.b;
                if (str4 == null) {
                    xq2Var10.b0(68978160);
                    str4 = yh2.O(px0Var8, R.string.not_set);
                } else {
                    xq2Var10.b0(68976982);
                }
                xq2Var10.p(false);
                String str5 = str4;
                boolean h2 = xq2Var10.h(j04Var2);
                Object P8 = xq2Var10.P();
                if (h2 || P8 == vs0Var) {
                    P8 = new x00(j04Var2, 3);
                    xq2Var10.l0(P8);
                }
                lt5.a(O6, str5, false, true, (on2) P8, px0Var8, 3072, 4);
                String O7 = yh2.O(px0Var8, R.string.label_rom_config_gba_save_path);
                String str6 = zt5Var.h.c;
                if (str6 == null) {
                    xq2Var10.b0(68990256);
                    str6 = yh2.O(px0Var8, R.string.not_set);
                } else {
                    xq2Var10.b0(68989047);
                }
                xq2Var10.p(false);
                String str7 = str6;
                boolean h3 = xq2Var10.h(j04Var3);
                Object P9 = xq2Var10.P();
                if (h3 || P9 == vs0Var) {
                    P9 = new x00(j04Var3, 4);
                    xq2Var10.l0(P9);
                }
                lt5.a(O7, str7, false, false, (on2) P9, px0Var8, 0, 12);
                xq2Var10.p(true);
                return jg7Var;
            case 9:
                j04 j04Var4 = (j04) obj6;
                Context context = (Context) obj4;
                pq5 pq5Var2 = (pq5) obj5;
                px0 px0Var9 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                String O8 = yh2.O(px0Var9, R.string.label_rom_config_custom_input_mapping);
                String O9 = yh2.O(px0Var9, R.string.edit);
                xq2 xq2Var11 = (xq2) px0Var9;
                boolean h4 = xq2Var11.h(j04Var4) | xq2Var11.h(context) | xq2Var11.h(pq5Var2);
                Object P10 = xq2Var11.P();
                if (h4 || P10 == vs0Var) {
                    P10 = new u6(j04Var4, context, pq5Var2, 19);
                    xq2Var11.l0(P10);
                }
                lt5.a(O8, O9, false, false, (on2) P10, xq2Var11, 0, 12);
                return jg7Var;
            case 10:
                u3 u3Var = (u3) obj6;
                qa4 qa4Var11 = (qa4) obj4;
                gn gnVar = (gn) obj5;
                m26 m26Var2 = (m26) obj;
                px0 px0Var10 = (px0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                m26Var2.getClass();
                if ((intValue8 & 6) == 0) {
                    if (!((xq2) px0Var10).f(m26Var2)) {
                        i3 = 2;
                    }
                    intValue8 |= i3;
                }
                if ((intValue8 & 19) != 18) {
                    z12 = true;
                }
                xq2 xq2Var12 = (xq2) px0Var10;
                if (xq2Var12.S(intValue8 & 1, z12)) {
                    nb3 nb3Var = u3Var.a;
                    Boolean valueOf2 = Boolean.valueOf(u3Var.b);
                    boolean f10 = xq2Var12.f(qa4Var11) | xq2Var12.h(u3Var) | xq2Var12.h(gnVar);
                    Object P11 = xq2Var12.P();
                    if (!f10 && P11 != vs0Var) {
                        vy5Var = P11;
                        qa4Var = qa4Var11;
                    } else {
                        qa4Var = qa4Var11;
                        vy5Var = new vy5(u3Var, gnVar, qa4Var, null, 6);
                        xq2Var12.l0(vy5Var);
                    }
                    mb3.j(nb3Var, valueOf2, vy5Var, xq2Var12);
                    g04.e(m26Var2, ((Boolean) qa4Var.getValue()).booleanValue(), null, null, null, null, n16.I(471749562, new ov4(u3Var, 14), xq2Var12), xq2Var12, (intValue8 & 14) | 1572864);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            default:
                j37 j37Var = (j37) obj6;
                qn2 qn2Var2 = (qn2) obj5;
                qa4 qa4Var12 = (qa4) obj4;
                lq4 lq4Var3 = (lq4) obj;
                px0 px0Var11 = (px0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                lq4Var3.getClass();
                if ((intValue9 & 6) == 0) {
                    if (((xq2) px0Var11).f(lq4Var3)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue9 |= i;
                }
                if ((intValue9 & 19) != 18) {
                    z12 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var11;
                if (xq2Var13.S(intValue9 & 1, z12)) {
                    py0 py0Var3 = n47.a;
                    hv.d(py0Var3.a(new m47(((ut0) xq2Var13.j(vt0.a)).i(), ((m47) xq2Var13.j(py0Var3)).b)), n16.I(-1145339137, new p4((Object) lq4Var3, (Object) j37Var, qn2Var2, (Object) qa4Var12, 12), xq2Var13), xq2Var13, 56);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ m4(qa4 qa4Var, qa4 qa4Var2, String[] strArr) {
        this.A = 5;
        this.L = qa4Var;
        this.R = qa4Var2;
        this.B = strArr;
    }

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
