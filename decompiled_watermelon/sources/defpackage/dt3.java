package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt3  reason: default package */
/* loaded from: classes.dex */
public abstract class dt3 implements mz1, zu0 {
    public static volatile np2 A;
    public static final et0 B = new et0(269254275, false, new ot0(14));
    public static final et0 L = new et0(1260131259, false, new ot0(15));
    public static final et0 R = new et0(-1862642174, false, new ot0(0));
    public static final et0 X = new et0(-1686313917, false, new ot0(1));
    public static final et0 Y = new et0(-1333657403, false, new ot0(2));
    public static final et0 Z = new et0(-127107155, false, new ot0(3));
    public static final hd2 c0 = new hd2(12);
    public static final pj d0 = new pj(5);
    public static final StackTraceElement[] e0 = new StackTraceElement[0];
    public static final xs6 f0 = new xs6(0, new long[0], new Object[0]);
    public static final bz6 g0 = new bz6(new s67(0), new s67(17));
    public static final bz6 h0 = new bz6(new s67(1), new s67(2));
    public static final bz6 i0 = new bz6(new s67(3), new s67(4));
    public static final bz6 j0 = new bz6(new s67(5), new s67(6));
    public static final bz6 k0 = new bz6(new s67(7), new s67(8));
    public static final bz6 l0 = new bz6(new s67(9), new s67(10));
    public static final bz6 m0 = new bz6(new s67(11), new s67(12));
    public static final bz6 n0 = new bz6(new s67(13), new s67(14));
    public static final bz6 o0 = new bz6(new s67(15), new s67(16));
    public static ax2 p0;

    public static final void B(final ri5 ri5Var, final ki3 ki3Var, final Map map, final Map map2, final Set set, final boolean z, final boolean z2, final boolean z3, final int i, final float f, final Map map3, final int i2, final int i3, final mi2 mi2Var, final mi2 mi2Var2, final mi2 mi2Var3, final mi2 mi2Var4, final mi2 mi2Var5, final mi2 mi2Var6, final mi2 mi2Var7, final ki2 ki2Var, final mi2 mi2Var8, tu0 tu0Var, final int i4) {
        sk2 sk2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(30563859);
        int i5 = i4 | (sk2Var2.h(ri5Var) ? 4 : 2) | (sk2Var2.f(ki3Var) ? 32 : 16) | (sk2Var2.h(map) ? 256 : 128) | (sk2Var2.h(map2) ? 2048 : 1024) | (sk2Var2.h(set) ? 16384 : 8192) | (sk2Var2.g(z) ? 131072 : 65536) | (sk2Var2.g(z2) ? 1048576 : 524288) | (sk2Var2.g(z3) ? 8388608 : 4194304) | (sk2Var2.d(i) ? 67108864 : 33554432) | (sk2Var2.c(f) ? 536870912 : 268435456);
        if (sk2Var2.O(i5 & 1, ((i5 & 306783379) == 306783378 && (((((((((3078 | (sk2Var2.d(i2) ? ' ' : (char) 16)) | (sk2Var2.d(i3) ? (char) 256 : (char) 128)) | (sk2Var2.h(mi2Var2) ? 16384 : 8192)) | (sk2Var2.h(mi2Var3) ? (char) 0 : (char) 0)) | (sk2Var2.h(mi2Var4) ? (char) 0 : (char) 0)) | (sk2Var2.h(mi2Var5) ? (char) 0 : (char) 0)) | (sk2Var2.h(mi2Var6) ? (char) 0 : (char) 0)) | (sk2Var2.h(mi2Var7) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && (((sk2Var2.h(ki2Var) ? (char) 4 : (char) 2) | (sk2Var2.h(mi2Var8) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            List h1 = tq0.h1(i, ri5Var.a);
            final ArrayList arrayList = new ArrayList();
            Iterator it = h1.iterator();
            while (it.hasNext()) {
                sk2 sk2Var3 = sk2Var2;
                Object next = it.next();
                Iterator it2 = it;
                if (next instanceof jh5) {
                    arrayList.add(next);
                }
                sk2Var2 = sk2Var3;
                it = it2;
            }
            sk2 sk2Var4 = sk2Var2;
            List G0 = tq0.G0(i, ri5Var.a);
            final ArrayList arrayList2 = new ArrayList();
            Iterator it3 = G0.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                Iterator it4 = it3;
                if (next2 instanceof kh5) {
                    arrayList2.add(next2);
                }
                it3 = it4;
            }
            sk2Var = sk2Var4;
            L(ct3.H0(1700580158, new aj2() { // from class: zh5
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    boolean z4;
                    float f2;
                    Integer num;
                    float f3;
                    tu0 tu0Var2 = (tu0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i6 = 0;
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var5 = (sk2) tu0Var2;
                    if (sk2Var5.O(intValue & 1, z4)) {
                        co2 co2Var = new co2(104.0f);
                        if (z) {
                            f2 = 28.0f;
                        } else {
                            f2 = 16.0f;
                        }
                        ki3 ki3Var2 = ki3Var;
                        Iterator it5 = ki3Var2.h().m.iterator();
                        if (!it5.hasNext()) {
                            num = null;
                        } else {
                            Integer valueOf = Integer.valueOf((int) (((zh3) it5.next()).n & 4294967295L));
                            while (it5.hasNext()) {
                                Integer valueOf2 = Integer.valueOf((int) (((zh3) it5.next()).n & 4294967295L));
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            num = valueOf;
                        }
                        if (num != null) {
                            i6 = num.intValue();
                        }
                        final ri5 ri5Var2 = ri5Var;
                        if (ri5Var2.g == bm5.FAVORITES) {
                            f3 = 96.0f;
                        } else {
                            f3 = 32.0f;
                        }
                        mh4 mh4Var = new mh4(16.0f, RecyclerView.A1, f2, dt3.m0(f, i6, f3, sk2Var5));
                        ot otVar = new ot(11.0f, true, new i(1));
                        ot otVar2 = new ot(11.0f, true, new i(1));
                        s72 s72Var = o76.c;
                        boolean h = sk2Var5.h(ri5Var2);
                        final mi2 mi2Var9 = mi2Var6;
                        final boolean z5 = z2;
                        boolean f4 = h | sk2Var5.f(mi2Var9) | sk2Var5.g(z5);
                        final Map map4 = map;
                        boolean h2 = f4 | sk2Var5.h(map4);
                        final Map map5 = map2;
                        boolean h3 = h2 | sk2Var5.h(map5);
                        final mi2 mi2Var10 = mi2Var4;
                        boolean f5 = h3 | sk2Var5.f(mi2Var10);
                        final mi2 mi2Var11 = mi2Var5;
                        final mi2 mi2Var12 = mi2Var2;
                        final mi2 mi2Var13 = mi2Var8;
                        final boolean z6 = z3;
                        final ArrayList arrayList3 = arrayList2;
                        final ki2 ki2Var2 = ki2Var;
                        final mi2 mi2Var14 = mi2Var7;
                        final ArrayList arrayList4 = arrayList;
                        final mi2 mi2Var15 = mi2Var3;
                        final Map map6 = map3;
                        final int i7 = i2;
                        final mi2 mi2Var16 = mi2Var;
                        final int i8 = i;
                        final Set set2 = set;
                        final int i9 = i3;
                        boolean f6 = f5 | sk2Var5.f(mi2Var11) | sk2Var5.f(mi2Var12) | sk2Var5.f(mi2Var13) | sk2Var5.g(z6) | sk2Var5.h(arrayList3) | sk2Var5.f(ki2Var2) | sk2Var5.f(mi2Var14) | sk2Var5.h(arrayList4) | sk2Var5.f(mi2Var15) | sk2Var5.h(map6) | sk2Var5.d(i7) | sk2Var5.f(mi2Var16) | sk2Var5.d(i8) | sk2Var5.h(set2) | sk2Var5.d(i9);
                        Object L2 = sk2Var5.L();
                        if (f6 || L2 == su0.a) {
                            mi2 mi2Var17 = new mi2() { // from class: mh5
                                @Override // defpackage.mi2
                                public final Object n(Object obj3) {
                                    Map map7;
                                    Map map8;
                                    mi2 mi2Var18;
                                    mi2 mi2Var19;
                                    mi2 mi2Var20;
                                    Map map9;
                                    int i10;
                                    mi2 mi2Var21;
                                    ph3 ph3Var = (ph3) obj3;
                                    ph3Var.getClass();
                                    nh5 nh5Var = new nh5(4);
                                    ri5 ri5Var3 = ri5Var2;
                                    ph3.a0(ph3Var, "filters", nh5Var, new et0(-1838250230, true, new ci5(ri5Var3, mi2Var9, 1)), 4);
                                    boolean z7 = z5;
                                    Map map10 = map4;
                                    Map map11 = map5;
                                    mi2 mi2Var22 = mi2Var10;
                                    mi2 mi2Var23 = mi2Var11;
                                    mi2 mi2Var24 = mi2Var13;
                                    if (z7) {
                                        map7 = map10;
                                        map8 = map11;
                                        mi2Var18 = mi2Var22;
                                        mi2Var19 = mi2Var23;
                                        mi2Var20 = mi2Var24;
                                        ph3.a0(ph3Var, "continue", new nh5(0), new et0(-405533169, true, new oh5(ri5Var3, map10, map11, mi2Var22, mi2Var23, mi2Var12, mi2Var24, 0)), 4);
                                    } else {
                                        map7 = map10;
                                        map8 = map11;
                                        mi2Var18 = mi2Var22;
                                        mi2Var19 = mi2Var23;
                                        mi2Var20 = mi2Var24;
                                    }
                                    boolean z8 = z6;
                                    ArrayList arrayList5 = arrayList3;
                                    if (z8) {
                                        ph3.a0(ph3Var, "section_header", new nh5(1), new et0(-1783172232, true, new g61(ri5Var3, arrayList5, ki2Var2, mi2Var14, 4)), 4);
                                    }
                                    ArrayList arrayList6 = arrayList4;
                                    boolean isEmpty = arrayList6.isEmpty();
                                    Map map12 = map6;
                                    int i11 = i7;
                                    mi2 mi2Var25 = mi2Var16;
                                    if (!isEmpty) {
                                        map9 = map12;
                                        i10 = i11;
                                        mi2Var21 = mi2Var25;
                                        ph3.a0(ph3Var, "folders", new nh5(2), new et0(768737623, true, new ph5(arrayList6, mi2Var15, map12, i11, mi2Var25, 0)), 4);
                                    } else {
                                        map9 = map12;
                                        i10 = i11;
                                        mi2Var21 = mi2Var25;
                                    }
                                    ph3Var.b0(arrayList5.size(), new s5(20, new qt0(25), arrayList5), new z50(3, arrayList5), new et0(-1942245546, true, new gi5(arrayList5, i8, mi2Var20, map7, map8, set2, mi2Var18, mi2Var19, map9, i10, mi2Var21, i9)));
                                    return o27.a;
                                }
                            };
                            sk2Var5.h0(mi2Var17);
                            L2 = mi2Var17;
                        }
                        oo2.g(co2Var, s72Var, ki3Var2, mh4Var, otVar, otVar2, null, false, null, (mi2) L2, sk2Var5, 1769520, 912);
                    } else {
                        sk2Var5.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, 6);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(ki3Var, map, map2, set, z, z2, z3, i, f, map3, i2, i3, mi2Var, mi2Var2, mi2Var3, mi2Var4, mi2Var5, mi2Var6, mi2Var7, ki2Var, mi2Var8, i4) { // from class: ai5
                public final /* synthetic */ ki3 B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ Map R;
                public final /* synthetic */ Set X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean c0;
                public final /* synthetic */ int d0;
                public final /* synthetic */ float e0;
                public final /* synthetic */ Map f0;
                public final /* synthetic */ int g0;
                public final /* synthetic */ int h0;
                public final /* synthetic */ mi2 i0;
                public final /* synthetic */ mi2 j0;
                public final /* synthetic */ mi2 k0;
                public final /* synthetic */ mi2 l0;
                public final /* synthetic */ mi2 m0;
                public final /* synthetic */ mi2 n0;
                public final /* synthetic */ mi2 o0;
                public final /* synthetic */ ki2 p0;
                public final /* synthetic */ mi2 q0;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    dt3.B(ri5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void D(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1661538873);
        if (sk2Var.f(ih4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (sk2Var.h(list)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if (list.isEmpty()) {
                sk2Var.X(593703914);
                zy3 W = b53.W(zy3Var, ih4Var);
                tv3 d = d50.d(y60.L, false);
                int hashCode = Long.hashCode(sk2Var.T);
                sm4 l = sk2Var.l();
                zy3 e02 = l07.e0(sk2Var, W);
                nu0.i.getClass();
                mv0 mv0Var = mu0.b;
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, mu0.f, d);
                oo2.S(sk2Var, mu0.e, l);
                oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                oo2.P(sk2Var, mu0.h);
                oo2.S(sk2Var, mu0.d, e02);
                ir6.b(me2.X(sk2Var, R.string.no_enabled_cheats_for_rom), y60.n0.i(b53.X(wy3.a, 24.0f), y60.Z), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130556);
                sk2Var = sk2Var;
                sk2Var.p(true);
                sk2Var.p(false);
            } else {
                boolean z2 = true;
                sk2Var.X(594043643);
                zy3 B2 = l07.B(zy3Var, ih4Var);
                ot otVar = new ot(8.0f, true, new i(1));
                ye6 ye6Var = ov0.n;
                mh4 mh4Var = new mh4(b53.B(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.d() + 12.0f, b53.A(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.c() + 16.0f);
                boolean h = sk2Var.h(list);
                if ((i7 & 7168) != 2048) {
                    z2 = false;
                }
                boolean z3 = h | z2;
                Object L2 = sk2Var.L();
                if (z3 || L2 == su0.a) {
                    L2 = new jz1(list, mi2Var, 0);
                    sk2Var.h0(L2);
                }
                io2.b(B2, null, mh4Var, otVar, null, null, false, null, (mi2) L2, sk2Var, 24576, 490);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new kz1(zy3Var, ih4Var, list, mi2Var, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019a, code lost:
        if (r8 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(defpackage.zy3 r40, defpackage.ih4 r41, java.util.List r42, defpackage.mi2 r43, defpackage.mi2 r44, defpackage.tu0 r45, int r46) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt3.G(zy3, ih4, java.util.List, mi2, mi2, tu0, int):void");
    }

    public static final void I(ri5 ri5Var, pk3 pk3Var, Map map, Map map2, boolean z, Set set, boolean z2, boolean z3, boolean z4, int i, float f, Map map3, int i2, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, mi2 mi2Var5, mi2 mi2Var6, mi2 mi2Var7, mi2 mi2Var8, ki2 ki2Var, mi2 mi2Var9, tu0 tu0Var, int i3) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(742258685);
        int i4 = i3 | (sk2Var.h(ri5Var) ? 4 : 2) | (sk2Var.f(pk3Var) ? 32 : 16) | (sk2Var.h(map) ? 256 : 128) | (sk2Var.h(map2) ? 2048 : 1024) | (sk2Var.g(z) ? 16384 : 8192) | (sk2Var.h(set) ? 131072 : 65536) | (sk2Var.g(z2) ? 1048576 : 524288) | (sk2Var.g(z3) ? 8388608 : 4194304) | (sk2Var.g(z4) ? 67108864 : 33554432) | (sk2Var.d(i) ? 536870912 : 268435456);
        if (sk2Var.O(i4 & 1, ((i4 & 306783379) == 306783378 && (((((((((3120 | (sk2Var.c(f) ? (char) 4 : (char) 2)) | (sk2Var.d(i2) ? 256 : 128)) | (sk2Var.h(mi2Var2) ? (char) 16384 : (char) 8192)) | (sk2Var.h(mi2Var3) ? (char) 0 : (char) 0)) | (sk2Var.h(mi2Var4) ? (char) 0 : (char) 0)) | (sk2Var.h(mi2Var5) ? (char) 0 : (char) 0)) | (sk2Var.h(mi2Var6) ? (char) 0 : (char) 0)) | (sk2Var.h(mi2Var7) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && ((((sk2Var.h(mi2Var8) ? (char) 4 : (char) 2) | (sk2Var.h(ki2Var) ? ' ' : (char) 16)) | (sk2Var.h(mi2Var9) ? 256 : 128)) & 147) == 146) ? false : true)) {
            L(ct3.H0(442531304, new bi5(z2, f, pk3Var, ri5Var, mi2Var7, z3, map, map2, mi2Var4, mi2Var5, mi2Var2, mi2Var9, z4, i, ki2Var, mi2Var8, mi2Var3, map3, i2, mi2Var, z, set, mi2Var6), sk2Var), sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new bi5(ri5Var, pk3Var, map, map2, z, set, z2, z3, z4, i, f, map3, i2, mi2Var, mi2Var2, mi2Var3, mi2Var4, mi2Var5, mi2Var6, mi2Var7, mi2Var8, ki2Var, mi2Var9, i3);
        }
    }

    public static final void J(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(351258571);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e02);
            yu4.a(y60.n0.i(wy3.a, y60.Z), mj2.C(sk2Var).j, RecyclerView.A1, 0L, 0, sk2Var, 0, 28);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ez(zy3Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [k75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r8v2, types: [k75, java.lang.Object] */
    public static final void K(final ri5 ri5Var, final Map map, final Map map2, final String str, final boolean z, final sp5 sp5Var, final Set set, final mi2 mi2Var, final mi2 mi2Var2, final mi2 mi2Var3, final mi2 mi2Var4, final mi2 mi2Var5, final mi2 mi2Var6, final ki2 ki2Var, final ki2 ki2Var2, final mi2 mi2Var7, final ki2 ki2Var3, final ki2 ki2Var4, final ki2 ki2Var5, final ki2 ki2Var6, final ki2 ki2Var7, final mi2 mi2Var8, final mi2 mi2Var9, final mi2 mi2Var10, tu0 tu0Var, final int i) {
        sk2 sk2Var;
        jd7 jd7Var;
        ex4 ex4Var;
        boolean z2;
        pk3 pk3Var;
        boolean z3;
        int i2;
        boolean z4;
        ki3 ki3Var;
        pk3 pk3Var2;
        sn1 sn1Var;
        boolean z5;
        ki3 ki3Var2;
        pk3 pk3Var3;
        ri5 ri5Var2 = ri5Var;
        ri5Var2.getClass();
        tp5 tp5Var = ri5Var2.f;
        bm5 bm5Var = ri5Var2.g;
        boolean z6 = ri5Var2.d;
        List list = ri5Var2.a;
        map.getClass();
        map2.getClass();
        str.getClass();
        sp5Var.getClass();
        set.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        mi2Var3.getClass();
        mi2Var4.getClass();
        mi2Var5.getClass();
        mi2Var6.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        mi2Var7.getClass();
        ki2Var3.getClass();
        ki2Var4.getClass();
        ki2Var5.getClass();
        ki2Var6.getClass();
        ki2Var7.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(84254708);
        int i3 = i | (sk2Var2.h(ri5Var2) ? 4 : 2) | (sk2Var2.h(map) ? 32 : 16) | (sk2Var2.h(map2) ? 256 : 128) | (sk2Var2.f(str) ? 2048 : 1024) | (sk2Var2.g(z) ? 16384 : 8192) | (sk2Var2.d(sp5Var.ordinal()) ? 131072 : 65536) | (sk2Var2.h(set) ? 1048576 : 524288) | (sk2Var2.h(mi2Var) ? 8388608 : 4194304) | (sk2Var2.h(mi2Var2) ? 67108864 : 33554432);
        int i4 = 6 | (sk2Var2.h(mi2Var5) ? ' ' : (char) 16) | (sk2Var2.h(mi2Var6) ? 256 : 128) | (sk2Var2.h(ki2Var) ? 2048 : 1024) | (sk2Var2.h(ki2Var2) ? (char) 16384 : (char) 8192) | (sk2Var2.h(mi2Var7) ? (char) 0 : (char) 0) | (sk2Var2.h(ki2Var3) ? (char) 0 : (char) 0) | (sk2Var2.h(ki2Var4) ? (char) 0 : (char) 0) | (sk2Var2.h(ki2Var5) ? (char) 0 : (char) 0) | (sk2Var2.h(ki2Var6) ? 536870912 : 268435456);
        boolean z7 = (sk2Var2.h(ki2Var7) ? (char) 4 : (char) 2) | (sk2Var2.h(mi2Var8) ? ' ' : (char) 16) | (sk2Var2.h(mi2Var9) ? (char) 256 : (char) 128) | (sk2Var2.h(mi2Var10) ? (char) 2048 : (char) 1024);
        if (sk2Var2.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (z7 & 1171) == 1170) ? false : true)) {
            jd7 C = mj2.C(sk2Var2);
            final boolean z8 = sp5Var == sp5.SCANNING;
            if (ji1.a(80.0f, RecyclerView.A1) > 0) {
                Object L2 = sk2Var2.L();
                sn1 sn1Var2 = su0.a;
                if (L2 == sn1Var2) {
                    L2 = l.A(sk2Var2);
                    sk2Var2.h0(L2);
                }
                o31 o31Var = (o31) L2;
                k24 L3 = me2.L(ki2Var2, sk2Var2);
                final ?? obj = new Object();
                final ?? obj2 = new Object();
                od1 od1Var = (od1) sk2Var2.j(ov0.h);
                obj.A = od1Var.C(80.0f);
                obj2.A = od1Var.C(56.0f);
                boolean f = sk2Var2.f(o31Var);
                Object L4 = sk2Var2.L();
                if (f || L4 == sn1Var2) {
                    jd7Var = C;
                    L4 = new ex4(o31Var, L3, obj2.A, obj.A);
                    sk2Var2.h0(L4);
                } else {
                    jd7Var = C;
                }
                final ex4 ex4Var2 = (ex4) L4;
                boolean h = sk2Var2.h(ex4Var2) | sk2Var2.g(z8) | sk2Var2.c(obj.A) | sk2Var2.c(obj2.A);
                Object L5 = sk2Var2.L();
                if (h || L5 == sn1Var2) {
                    L5 = new ki2() { // from class: fx4
                        @Override // defpackage.ki2
                        public final Object c() {
                            ex4 ex4Var3 = ex4.this;
                            boolean b = ex4Var3.b();
                            o31 o31Var2 = ex4Var3.a;
                            pj4 pj4Var = ex4Var3.h;
                            boolean z9 = z8;
                            if (b != z9) {
                                ex4Var3.d.setValue(Boolean.valueOf(z9));
                                pj4 pj4Var2 = ex4Var3.f;
                                float f2 = RecyclerView.A1;
                                pj4Var2.i(RecyclerView.A1);
                                if (z9) {
                                    f2 = pj4Var.h();
                                }
                                tq5.w(o31Var2, null, null, new cc(ex4Var3, f2, null, 2), 3);
                            }
                            ex4Var3.g.i(obj.A);
                            float f3 = obj2.A;
                            if (pj4Var.h() != f3) {
                                pj4Var.i(f3);
                                if (ex4Var3.b()) {
                                    tq5.w(o31Var2, null, null, new cc(ex4Var3, f3, null, 2), 3);
                                }
                            }
                            return o27.a;
                        }
                    };
                    sk2Var2.h0(L5);
                }
                l.j((ki2) L5, sk2Var2);
                Object L6 = sk2Var2.L();
                if (L6 == sn1Var2) {
                    L6 = l.A(sk2Var2);
                    sk2Var2.h0(L6);
                }
                final o31 o31Var2 = (o31) L6;
                ki3 a = mi3.a(sk2Var2);
                pk3 a2 = qk3.a(sk2Var2);
                Object L7 = sk2Var2.L();
                if (L7 == sn1Var2) {
                    L7 = new za6();
                    sk2Var2.h0(L7);
                }
                final za6 za6Var = (za6) L7;
                Object L8 = sk2Var2.L();
                if (L8 == sn1Var2) {
                    L8 = new qj4(-1);
                    sk2Var2.h0(L8);
                }
                final qj4 qj4Var = (qj4) L8;
                boolean f2 = sk2Var2.f(list);
                Object L9 = sk2Var2.L();
                if (f2 || L9 == sn1Var2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!(((lh5) obj3) instanceof jh5)) {
                            break;
                        }
                        arrayList.add(obj3);
                    }
                    L9 = Integer.valueOf(arrayList.size());
                    sk2Var2.h0(L9);
                }
                final int intValue = ((Number) L9).intValue();
                final ?? r19 = intValue > 0 ? 1 : 0;
                int size = list.size() - intValue;
                if (!(ri5Var2.k.isEmpty() && r19 == 0) && ri5Var2.h == qb6.ALPHABETICALLY) {
                    ex4Var = ex4Var2;
                    z2 = true;
                } else {
                    ex4Var = ex4Var2;
                    z2 = false;
                }
                int i5 = ((ri5Var2.e || !ri5Var2.c) && !z6 && bm5Var == bm5.ALL && !ri5Var2.j.isEmpty()) ? 1 : 0;
                final boolean z9 = !z6 ? 1 : 0;
                final int i6 = i5 + 1 + (z9 ? 1 : 0);
                final int i7 = i6 + r19;
                List list2 = ri5Var2.b;
                final ex4 ex4Var3 = ex4Var;
                Boolean valueOf = Boolean.valueOf(z6);
                boolean f3 = sk2Var2.f(a) | sk2Var2.f(a2);
                Object L10 = sk2Var2.L();
                if (f3 || L10 == sn1Var2) {
                    pk3Var = a2;
                    L10 = new wx1(a, pk3Var, qj4Var, (j11) null, 22);
                    sk2Var2.h0(L10);
                } else {
                    pk3Var = a2;
                }
                aj2 aj2Var = (aj2) L10;
                e31 e31Var = sk2Var2.R;
                boolean f4 = sk2Var2.f(bm5Var) | sk2Var2.f(list2) | sk2Var2.f(valueOf);
                Object L11 = sk2Var2.L();
                if (f4 || L11 == sn1Var2) {
                    L11 = new qc3(e31Var, aj2Var);
                    sk2Var2.h0(L11);
                }
                qc3 qc3Var = (qc3) L11;
                Integer valueOf2 = Integer.valueOf(qj4Var.h());
                boolean h2 = sk2Var2.h(ri5Var2) | ((z7 & 896) == 256);
                Object L12 = sk2Var2.L();
                if (h2 || L12 == sn1Var2) {
                    z3 = z7;
                    i2 = i5;
                    z4 = z2;
                    ki3Var = a;
                    pk3Var2 = pk3Var;
                    sn1Var = sn1Var2;
                    ug ugVar = new ug(ri5Var2, mi2Var9, qj4Var, null, 7);
                    sk2Var2.h0(ugVar);
                    L12 = ugVar;
                } else {
                    z3 = z7;
                    i2 = i5;
                    z4 = z2;
                    ki3Var = a;
                    pk3Var2 = pk3Var;
                    sn1Var = sn1Var2;
                }
                l.h(valueOf2, list, (aj2) L12, sk2Var2);
                Object L13 = sk2Var2.L();
                if (L13 == sn1Var) {
                    L13 = me2.q(new bz2(14, ki3Var));
                    sk2Var2.h0(L13);
                }
                ae6 ae6Var = (ae6) L13;
                boolean d = sk2Var2.d(((Number) ae6Var.getValue()).intValue()) | sk2Var2.d(size) | sk2Var2.d(intValue);
                Object L14 = sk2Var2.L();
                if (d || L14 == sn1Var) {
                    int i8 = Preference.DEFAULT_ORDER;
                    if (size <= 0) {
                        z5 = true;
                    } else {
                        int intValue2 = ((Number) ae6Var.getValue()).intValue();
                        int i9 = size - 1;
                        if (i9 < 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                            if (intValue2 < 1) {
                                intValue2 = 1;
                            }
                            i8 = i9 - (i9 % intValue2);
                        }
                        i8 += intValue;
                    }
                    L14 = Integer.valueOf(i8);
                    sk2Var2.h0(L14);
                } else {
                    z5 = true;
                }
                int intValue3 = ((Number) L14).intValue();
                Object[] objArr = {tp5Var, Integer.valueOf(qj4Var.h()), Integer.valueOf(intValue3), Integer.valueOf(list.size()), mi2Var10};
                boolean h3 = sk2Var2.h(ri5Var2) | (z3 & true ? z5 : false) | sk2Var2.d(intValue3);
                Object L15 = sk2Var2.L();
                if (h3 || L15 == sn1Var) {
                    ce1 ce1Var = new ce1(mi2Var10, ri5Var2, intValue3, qj4Var, 2);
                    ri5Var2 = ri5Var2;
                    intValue3 = intValue3;
                    sk2Var2.h0(ce1Var);
                    L15 = ce1Var;
                }
                l.f(objArr, (mi2) L15, sk2Var2);
                Integer valueOf3 = Integer.valueOf(intValue3);
                boolean h4 = sk2Var2.h(ri5Var2) | sk2Var2.d(intValue3) | sk2Var2.f(ki3Var) | sk2Var2.f(pk3Var2);
                Object L16 = sk2Var2.L();
                if (h4 || L16 == sn1Var) {
                    ki3 ki3Var3 = ki3Var;
                    pk3 pk3Var4 = pk3Var2;
                    nr1 nr1Var = new nr1(ri5Var2, intValue3, qj4Var, ki3Var3, pk3Var4, (j11) null);
                    ki3Var2 = ki3Var3;
                    pk3Var3 = pk3Var4;
                    sk2Var2.h0(nr1Var);
                    L16 = nr1Var;
                } else {
                    ki3Var2 = ki3Var;
                    pk3Var3 = pk3Var2;
                }
                l.h(tp5Var, valueOf3, (aj2) L16, sk2Var2);
                final jd7 jd7Var2 = jd7Var;
                final boolean z10 = i2;
                final int i10 = intValue3;
                final boolean z11 = z4;
                final ki3 ki3Var4 = ki3Var2;
                final pk3 pk3Var5 = pk3Var3;
                mj2.f(o76.c, null, jd7Var.b, 0L, RecyclerView.A1, ct3.H0(1006428216, new aj2() { // from class: rh5
                    @Override // defpackage.aj2
                    public final Object j(Object obj4, Object obj5) {
                        boolean z12;
                        mv0 mv0Var;
                        float f5;
                        sp5 sp5Var2;
                        jd7 jd7Var3;
                        wy3 wy3Var;
                        mv0 mv0Var2;
                        final za6 za6Var2;
                        y60 y60Var;
                        sp5 sp5Var3;
                        final ri5 ri5Var3;
                        int i11;
                        boolean z13;
                        int i12;
                        ri5 ri5Var4;
                        ki3 ki3Var5;
                        pk3 pk3Var6;
                        final int i13;
                        ae6 q;
                        tu0 tu0Var2 = (tu0) obj4;
                        int intValue4 = ((Integer) obj5).intValue();
                        if ((intValue4 & 3) != 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        sk2 sk2Var3 = (sk2) tu0Var2;
                        if (sk2Var3.O(intValue4 & 1, z12)) {
                            s72 s72Var = o76.c;
                            zy3 m02 = mh7.m0(s72Var, mh7.o);
                            h20 h20Var = y60.j0;
                            mt mtVar = rt.c;
                            lr0 a3 = jr0.a(mtVar, h20Var, sk2Var3, 0);
                            int hashCode = Long.hashCode(sk2Var3.T);
                            sm4 l = sk2Var3.l();
                            zy3 e02 = l07.e0(sk2Var3, m02);
                            nu0.i.getClass();
                            mv0 mv0Var3 = mu0.b;
                            sk2Var3.b0();
                            if (sk2Var3.S) {
                                sk2Var3.k(mv0Var3);
                            } else {
                                sk2Var3.k0();
                            }
                            dn dnVar = mu0.f;
                            oo2.S(sk2Var3, dnVar, a3);
                            dn dnVar2 = mu0.e;
                            oo2.S(sk2Var3, dnVar2, l);
                            Integer valueOf4 = Integer.valueOf(hashCode);
                            dn dnVar3 = mu0.g;
                            oo2.S(sk2Var3, dnVar3, valueOf4);
                            yd ydVar = mu0.h;
                            oo2.P(sk2Var3, ydVar);
                            dn dnVar4 = mu0.d;
                            oo2.S(sk2Var3, dnVar4, e02);
                            ri5 ri5Var5 = ri5.this;
                            boolean z14 = ri5Var5.d;
                            tp5 tp5Var2 = ri5Var5.f;
                            nk2.k(z14, str, tp5Var2, mi2Var7, ki2Var3, ki2Var4, ki2Var5, ki2Var6, ki2Var2, ki2Var7, null, sk2Var3, 0);
                            sk2 sk2Var4 = sk2Var3;
                            sp5 sp5Var4 = sp5.SCANNING;
                            sp5 sp5Var5 = sp5Var;
                            jd7 jd7Var4 = jd7Var2;
                            wy3 wy3Var2 = wy3.a;
                            if (sp5Var5 == sp5Var4) {
                                sk2Var4.X(-1232375695);
                                mv0Var = mv0Var3;
                                sp5Var2 = sp5Var5;
                                jd7Var3 = jd7Var4;
                                wy3Var = wy3Var2;
                                f5 = 1.0f;
                                yu4.b(o76.c(wy3Var2, 1.0f), jd7Var4.l, jd7Var4.d, sk2Var4, 6, 8);
                                sk2Var4 = sk2Var4;
                                sk2Var4.p(false);
                            } else {
                                mv0Var = mv0Var3;
                                f5 = 1.0f;
                                sp5Var2 = sp5Var5;
                                jd7Var3 = jd7Var4;
                                wy3Var = wy3Var2;
                                sk2Var4.X(-1232174412);
                                sk2Var4.p(false);
                            }
                            List list3 = ri5Var5.b;
                            boolean z15 = ri5Var5.c;
                            boolean z16 = ri5Var5.e;
                            boolean z17 = ri5Var5.d;
                            sk2 sk2Var5 = sk2Var4;
                            final ki2 ki2Var8 = ki2Var;
                            nk2.b(list3, z15, z16, z17, ki2Var8, null, sk2Var5, 0);
                            zy3 f6 = o76.c(wy3Var, f5).f(new xg3(f5, true));
                            ex4 ex4Var4 = ex4Var3;
                            zy3 K = se.K(f6, new ci3(16, new z(1, ex4Var4, ex4.class, "onPull", "onPull$material(F)F", 0, 0, 29), new dt0(2, ex4Var4, ex4.class, "onRelease", "onRelease$material(F)F", 4, 2)));
                            tv3 d2 = d50.d(y60.L, false);
                            int hashCode2 = Long.hashCode(sk2Var5.T);
                            sm4 l2 = sk2Var5.l();
                            zy3 e03 = l07.e0(sk2Var5, K);
                            sk2Var5.b0();
                            if (sk2Var5.S) {
                                mv0Var2 = mv0Var;
                                sk2Var5.k(mv0Var2);
                            } else {
                                mv0Var2 = mv0Var;
                                sk2Var5.k0();
                            }
                            oo2.S(sk2Var5, dnVar, d2);
                            oo2.S(sk2Var5, dnVar2, l2);
                            b31.x(hashCode2, sk2Var5, dnVar3, sk2Var5, ydVar);
                            oo2.S(sk2Var5, dnVar4, e03);
                            y60 y60Var2 = y60.n0;
                            boolean isEmpty = ri5Var5.a.isEmpty();
                            final boolean z18 = z10;
                            final boolean z19 = z11;
                            final int i14 = intValue;
                            final ki3 ki3Var6 = ki3Var4;
                            final pk3 pk3Var7 = pk3Var5;
                            final mi2 mi2Var11 = mi2Var5;
                            za6 za6Var3 = za6Var;
                            if (isEmpty && !z18) {
                                sk2Var5.X(-1331966669);
                                za6Var2 = za6Var3;
                                lr0 a4 = jr0.a(mtVar, h20Var, sk2Var5, 0);
                                int hashCode3 = Long.hashCode(sk2Var5.T);
                                sm4 l3 = sk2Var5.l();
                                y60Var = y60Var2;
                                zy3 e04 = l07.e0(sk2Var5, s72Var);
                                sk2Var5.b0();
                                if (sk2Var5.S) {
                                    sk2Var5.k(mv0Var2);
                                } else {
                                    sk2Var5.k0();
                                }
                                oo2.S(sk2Var5, dnVar, a4);
                                oo2.S(sk2Var5, dnVar2, l3);
                                b31.x(hashCode3, sk2Var5, dnVar3, sk2Var5, ydVar);
                                oo2.S(sk2Var5, dnVar4, e04);
                                nk2.f(ri5Var5.g, mi2Var11, null, sk2Var5, 0, 4);
                                dt3.u(ri5Var5.g, sk2Var5, 0);
                                sk2Var5.p(true);
                                sk2Var5.p(false);
                                ri5Var3 = ri5Var5;
                                sp5Var3 = sp5Var4;
                                i11 = i14;
                            } else {
                                za6Var2 = za6Var3;
                                y60Var = y60Var2;
                                sk2Var5.X(-1331512829);
                                final Map map3 = map;
                                final Map map4 = map2;
                                final Set set2 = set;
                                final boolean z20 = z9;
                                final int i15 = i10;
                                final mi2 mi2Var12 = mi2Var9;
                                final mi2 mi2Var13 = mi2Var;
                                final mi2 mi2Var14 = mi2Var2;
                                final mi2 mi2Var15 = mi2Var3;
                                final mi2 mi2Var16 = mi2Var6;
                                final mi2 mi2Var17 = mi2Var8;
                                final boolean z21 = z;
                                final mi2 mi2Var18 = mi2Var4;
                                final qj4 qj4Var2 = qj4Var;
                                sp5Var3 = sp5Var4;
                                ri5Var3 = ri5Var5;
                                bj2 bj2Var = new bj2() { // from class: uh5
                                    @Override // defpackage.bj2
                                    public final Object i(Object obj6, Object obj7, Object obj8) {
                                        boolean z22;
                                        int i16;
                                        final h50 h50Var = (h50) obj6;
                                        tu0 tu0Var3 = (tu0) obj7;
                                        int intValue5 = ((Integer) obj8).intValue();
                                        h50Var.getClass();
                                        if ((intValue5 & 6) == 0) {
                                            if (((sk2) tu0Var3).f(h50Var)) {
                                                i16 = 4;
                                            } else {
                                                i16 = 2;
                                            }
                                            intValue5 |= i16;
                                        }
                                        if ((intValue5 & 19) != 18) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        sk2 sk2Var6 = (sk2) tu0Var3;
                                        if (sk2Var6.O(intValue5 & 1, z22)) {
                                            final ri5 ri5Var6 = ri5.this;
                                            tp5 tp5Var3 = ri5Var6.f;
                                            final ki3 ki3Var7 = ki3Var6;
                                            final Map map5 = map3;
                                            final Map map6 = map4;
                                            final Set set3 = set2;
                                            final boolean z23 = z19;
                                            final boolean z24 = z18;
                                            final boolean z25 = z20;
                                            final int i17 = i14;
                                            final za6 za6Var4 = za6Var2;
                                            final int i18 = i15;
                                            final mi2 mi2Var19 = mi2Var12;
                                            final mi2 mi2Var20 = mi2Var13;
                                            final mi2 mi2Var21 = mi2Var14;
                                            final mi2 mi2Var22 = mi2Var15;
                                            final mi2 mi2Var23 = mi2Var11;
                                            final mi2 mi2Var24 = mi2Var16;
                                            final ki2 ki2Var9 = ki2Var8;
                                            final mi2 mi2Var25 = mi2Var17;
                                            final pk3 pk3Var8 = pk3Var7;
                                            final boolean z26 = z21;
                                            final mi2 mi2Var26 = mi2Var18;
                                            final qj4 qj4Var3 = qj4Var2;
                                            ct3.x(tp5Var3, null, null, "view_mode", ct3.H0(992585565, new bj2() { // from class: xh5
                                                @Override // defpackage.bj2
                                                public final Object i(Object obj9, Object obj10, Object obj11) {
                                                    boolean z27;
                                                    int i19;
                                                    tp5 tp5Var4 = (tp5) obj9;
                                                    tu0 tu0Var4 = (tu0) obj10;
                                                    int intValue6 = ((Integer) obj11).intValue();
                                                    tp5Var4.getClass();
                                                    if ((intValue6 & 6) == 0) {
                                                        if (((sk2) tu0Var4).d(tp5Var4.ordinal())) {
                                                            i19 = 4;
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        intValue6 |= i19;
                                                    }
                                                    if ((intValue6 & 19) != 18) {
                                                        z27 = true;
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    sk2 sk2Var7 = (sk2) tu0Var4;
                                                    if (sk2Var7.O(intValue6 & 1, z27)) {
                                                        int i20 = oi5.a[tp5Var4.ordinal()];
                                                        ri5 ri5Var7 = ri5.this;
                                                        Map map7 = map5;
                                                        Map map8 = map6;
                                                        Set set4 = set3;
                                                        boolean z28 = z23;
                                                        boolean z29 = z24;
                                                        boolean z30 = z25;
                                                        int i21 = i17;
                                                        h50 h50Var2 = h50Var;
                                                        za6 za6Var5 = za6Var4;
                                                        mi2 mi2Var27 = mi2Var19;
                                                        mi2 mi2Var28 = mi2Var20;
                                                        mi2 mi2Var29 = mi2Var21;
                                                        mi2 mi2Var30 = mi2Var22;
                                                        mi2 mi2Var31 = mi2Var23;
                                                        mi2 mi2Var32 = mi2Var24;
                                                        ki2 ki2Var10 = ki2Var9;
                                                        mi2 mi2Var33 = mi2Var25;
                                                        final qj4 qj4Var4 = qj4Var3;
                                                        sn1 sn1Var3 = su0.a;
                                                        if (i20 != 1) {
                                                            if (i20 == 2) {
                                                                sk2Var7.X(392046586);
                                                                float a5 = h50Var2.a();
                                                                int h5 = qj4Var4.h();
                                                                Object L17 = sk2Var7.L();
                                                                if (L17 == sn1Var3) {
                                                                    L17 = new mi2() { // from class: yh5
                                                                        @Override // defpackage.mi2
                                                                        public final Object n(Object obj12) {
                                                                            int i22 = r2;
                                                                            o27 o27Var = o27.a;
                                                                            qj4 qj4Var5 = qj4Var4;
                                                                            int intValue7 = ((Integer) obj12).intValue();
                                                                            switch (i22) {
                                                                                case 0:
                                                                                    qj4Var5.i(intValue7);
                                                                                    return o27Var;
                                                                                default:
                                                                                    qj4Var5.i(intValue7);
                                                                                    return o27Var;
                                                                            }
                                                                        }
                                                                    };
                                                                    sk2Var7.h0(L17);
                                                                }
                                                                dt3.I(ri5Var7, pk3Var8, map7, map8, z26, set4, z28, z29, z30, i21, a5, za6Var5, h5, (mi2) L17, mi2Var27, mi2Var28, mi2Var29, mi2Var30, mi2Var26, mi2Var31, mi2Var32, ki2Var10, mi2Var33, sk2Var7, 0);
                                                                sk2Var7.p(false);
                                                            } else {
                                                                throw ej6.d(sk2Var7, 391992893, false);
                                                            }
                                                        } else {
                                                            sk2Var7.X(391993195);
                                                            float a6 = h50Var2.a();
                                                            int h6 = qj4Var4.h();
                                                            Object L18 = sk2Var7.L();
                                                            if (L18 == sn1Var3) {
                                                                L18 = new mi2() { // from class: yh5
                                                                    @Override // defpackage.mi2
                                                                    public final Object n(Object obj12) {
                                                                        int i22 = r2;
                                                                        o27 o27Var = o27.a;
                                                                        qj4 qj4Var5 = qj4Var4;
                                                                        int intValue7 = ((Integer) obj12).intValue();
                                                                        switch (i22) {
                                                                            case 0:
                                                                                qj4Var5.i(intValue7);
                                                                                return o27Var;
                                                                            default:
                                                                                qj4Var5.i(intValue7);
                                                                                return o27Var;
                                                                        }
                                                                    }
                                                                };
                                                                sk2Var7.h0(L18);
                                                            }
                                                            dt3.B(ri5Var7, ki3Var7, map7, map8, set4, z28, z29, z30, i21, a6, za6Var5, h6, i18, (mi2) L18, mi2Var27, mi2Var28, mi2Var29, mi2Var30, mi2Var31, mi2Var32, ki2Var10, mi2Var33, sk2Var7, 0);
                                                            sk2Var7.p(false);
                                                        }
                                                    } else {
                                                        sk2Var7.R();
                                                    }
                                                    return o27.a;
                                                }
                                            }, sk2Var6), sk2Var6, 27648, 6);
                                        } else {
                                            sk2Var6.R();
                                        }
                                        return o27.a;
                                    }
                                };
                                i11 = i14;
                                ct3.r(s72Var, null, ct3.H0(-1426281682, bj2Var, sk2Var5), sk2Var5, 3078);
                                sk2Var5.p(false);
                            }
                            if (sp5Var2 == sp5Var3) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            jd7 jd7Var5 = jd7Var3;
                            bx4.b(z13, ex4Var4, y60Var.i(wy3Var, y60.R), jd7Var5.c, jd7Var5.l, sk2Var5, 64);
                            if (z19) {
                                sk2Var5.X(-1327470088);
                                int i16 = oi5.a[tp5Var2.ordinal()];
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        i12 = i6;
                                    } else {
                                        i.c();
                                        return null;
                                    }
                                } else {
                                    i12 = i7;
                                }
                                boolean d3 = sk2Var5.d(tp5Var2.ordinal()) | sk2Var5.d(i12) | sk2Var5.d(i11);
                                Object L17 = sk2Var5.L();
                                sn1 sn1Var3 = su0.a;
                                if (!d3 && L17 != sn1Var3) {
                                    i13 = i11;
                                    q = L17;
                                    ri5Var4 = ri5Var3;
                                    ki3Var5 = ki3Var6;
                                    pk3Var6 = pk3Var7;
                                } else {
                                    int i17 = i11;
                                    vh5 vh5Var = new vh5(ri5Var3, ki3Var6, pk3Var7, i12, i17);
                                    ri5Var4 = ri5Var3;
                                    ki3Var5 = ki3Var6;
                                    pk3Var6 = pk3Var7;
                                    i13 = i17;
                                    q = me2.q(vh5Var);
                                    sk2Var5.h0(q);
                                }
                                final ae6 ae6Var2 = q;
                                boolean f7 = sk2Var5.f(ri5Var4.k) | sk2Var5.d(tp5Var2.ordinal());
                                Object L18 = sk2Var5.L();
                                if (f7 || L18 == sn1Var3) {
                                    L18 = me2.q(new jd2(21, ri5Var4, ae6Var2));
                                    sk2Var5.h0(L18);
                                }
                                ae6 ae6Var3 = (ae6) L18;
                                boolean d4 = sk2Var5.d(i13) | sk2Var5.d(tp5Var2.ordinal());
                                Object L19 = sk2Var5.L();
                                final boolean z22 = r19;
                                if (d4 || L19 == sn1Var3) {
                                    L19 = me2.q(new ki2() { // from class: wh5
                                        @Override // defpackage.ki2
                                        public final Object c() {
                                            boolean z23;
                                            if (z22 && ((Number) ae6Var2.getValue()).intValue() < i13) {
                                                z23 = true;
                                            } else {
                                                z23 = false;
                                            }
                                            return Boolean.valueOf(z23);
                                        }
                                    });
                                    sk2Var5.h0(L19);
                                }
                                Map map5 = ri5Var4.k;
                                Character ch = (Character) ae6Var3.getValue();
                                boolean booleanValue = ((Boolean) ((ae6) L19).getValue()).booleanValue();
                                o31 o31Var3 = o31Var2;
                                boolean h5 = sk2Var5.h(o31Var3) | sk2Var5.h(ri5Var4) | sk2Var5.f(ki3Var5) | sk2Var5.f(pk3Var6);
                                Object L20 = sk2Var5.L();
                                if (h5 || L20 == sn1Var3) {
                                    mg3 mg3Var = new mg3(o31Var3, ri5Var4, ki3Var5, pk3Var6, za6Var2, 1);
                                    sk2Var5.h0(mg3Var);
                                    L20 = mg3Var;
                                }
                                ki2 ki2Var9 = (ki2) L20;
                                boolean h6 = sk2Var5.h(o31Var3) | sk2Var5.h(ri5Var4) | sk2Var5.d(i12) | sk2Var5.d(i13) | sk2Var5.f(ki3Var5) | sk2Var5.f(pk3Var6);
                                Object L21 = sk2Var5.L();
                                if (h6 || L21 == sn1Var3) {
                                    L21 = new v3(o31Var3, ri5Var4, i12, i13, ki3Var5, pk3Var6, za6Var2);
                                    sk2Var5.h0(L21);
                                }
                                nk2.a(map5, ch, z22, booleanValue, ki2Var9, (aj2) L21, s72Var, sk2Var5, 1572864);
                                sk2Var5.p(false);
                            } else {
                                sk2Var5.X(-1324004722);
                                sk2Var5.p(false);
                            }
                            sk2Var5.p(true);
                            sk2Var5.p(true);
                        } else {
                            sk2Var3.R();
                        }
                        return o27.a;
                    }
                }, sk2Var2), sk2Var2, 1572870, 58);
                sk2Var = sk2Var2;
            } else {
                i.i("The refresh trigger must be greater than zero!");
                return;
            }
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(map, map2, str, z, sp5Var, set, mi2Var, mi2Var2, mi2Var3, mi2Var4, mi2Var5, mi2Var6, ki2Var, ki2Var2, mi2Var7, ki2Var3, ki2Var4, ki2Var5, ki2Var6, ki2Var7, mi2Var8, mi2Var9, mi2Var10, i) { // from class: sh5
                public final /* synthetic */ Map B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ String R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ sp5 Y;
                public final /* synthetic */ Set Z;
                public final /* synthetic */ mi2 c0;
                public final /* synthetic */ mi2 d0;
                public final /* synthetic */ mi2 e0;
                public final /* synthetic */ mi2 f0;
                public final /* synthetic */ mi2 g0;
                public final /* synthetic */ mi2 h0;
                public final /* synthetic */ ki2 i0;
                public final /* synthetic */ ki2 j0;
                public final /* synthetic */ mi2 k0;
                public final /* synthetic */ ki2 l0;
                public final /* synthetic */ ki2 m0;
                public final /* synthetic */ ki2 n0;
                public final /* synthetic */ ki2 o0;
                public final /* synthetic */ ki2 p0;
                public final /* synthetic */ mi2 q0;
                public final /* synthetic */ mi2 r0;
                public final /* synthetic */ mi2 s0;

                @Override // defpackage.aj2
                public final Object j(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ep2.I(805306369);
                    dt3.K(ri5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, (tu0) obj4, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void L(et0 et0Var, tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(214570716);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            dk7.a(ug4.a.a(null), ct3.H0(282847772, new sp(et0Var, 8), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sp(et0Var, i, 9);
        }
    }

    public static final void M(zy3 zy3Var, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1090521195);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(aj2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = wf.b;
                sk2Var.h0(L2);
            }
            tv3 tv3Var = (tv3) L2;
            int i5 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT;
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            int i6 = ((i5 << 6) & 896) | 6;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, tv3Var);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e02);
            aj2Var.j(sk2Var, Integer.valueOf((i6 >> 6) & 14));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xf(zy3Var, aj2Var, i);
        }
    }

    public static final zy3 O(zy3 zy3Var, boolean z) {
        if (!z) {
            return zy3Var;
        }
        return a53.C(w81.B(zy3Var, wi3.X), new nh5(3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (defpackage.io2.F(r8).a(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:22:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(defpackage.ri5 r10, int r11, defpackage.ki3 r12, defpackage.pk3 r13, java.util.Map r14, defpackage.k11 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.qi5
            if (r0 == 0) goto L13
            r0 = r15
            qi5 r0 = (defpackage.qi5) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            qi5 r0 = new qi5
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.g0
            o27 r3 = defpackage.o27.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.me2.a0(r15)
            return r3
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r6
        L33:
            int r10 = r0.e0
            int r11 = r0.d0
            int r12 = r0.c0
            java.util.Map r13 = r0.Z
            pk3 r14 = r0.Y
            ki3 r2 = r0.X
            ri5 r7 = r0.R
            defpackage.me2.a0(r15)
            r15 = r13
            r13 = r2
            r2 = r11
            r11 = r7
            goto L7e
        L49:
            defpackage.me2.a0(r15)
            r15 = 0
            r2 = 4
            r9 = r11
            r11 = r10
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r9
        L55:
            if (r10 >= r2) goto La2
            gi3 r7 = new gi3
            r8 = 11
            r7.<init>(r8)
            r0.R = r11
            r0.X = r13
            r0.Y = r14
            r0.Z = r15
            r0.c0 = r12
            r0.d0 = r2
            r0.e0 = r10
            r0.g0 = r5
            e31 r8 = r0.B
            r8.getClass()
            im r8 = defpackage.io2.F(r8)
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L7e
            goto Lb4
        L7e:
            java.util.List r7 = r11.a
            java.lang.Object r7 = defpackage.tq0.N0(r12, r7)
            boolean r8 = r7 instanceof defpackage.kh5
            if (r8 == 0) goto L8b
            kh5 r7 = (defpackage.kh5) r7
            goto L8c
        L8b:
            r7 = r6
        L8c:
            if (r7 == 0) goto L99
            java.lang.String r7 = h0(r7)
            java.lang.Object r7 = r15.get(r7)
            wc2 r7 = (defpackage.wc2) r7
            goto L9a
        L99:
            r7 = r6
        L9a:
            if (r7 == 0) goto La0
            defpackage.wc2.a(r7)     // Catch: java.lang.Throwable -> L9f
        L9f:
            return r3
        La0:
            int r10 = r10 + r5
            goto L55
        La2:
            r0.R = r6
            r0.X = r6
            r0.Y = r6
            r0.Z = r6
            r0.c0 = r12
            r0.g0 = r4
            java.lang.Object r10 = n0(r11, r13, r14, r15, r0)
            if (r10 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt3.Q(ri5, int, ki3, pk3, java.util.Map, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
        if (r5 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int T(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt3.T(int, int, int, boolean):int");
    }

    public static zy3 U(zy3 zy3Var) {
        y55 y55Var = tc7.a;
        return a53.u(zy3Var).f(new j76(ct3.P0(RecyclerView.A1, 400.0f, new i33(4294967297L), 1)));
    }

    public static final Integer V(int i) {
        return new Integer(i);
    }

    public static final void W(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                pu.k(th, th2);
            }
        }
    }

    public static final boolean X(y55 y55Var, float f, float f2) {
        float f3 = y55Var.a;
        if (f <= y55Var.c && f3 <= f) {
            float f4 = y55Var.b;
            if (f2 <= y55Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static io Z(io ioVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ioVar.B.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((ko) ioVar.L).a;
        }
        return new io(ioVar.A, Float.valueOf(f), new ko(f2), ioVar.R, ioVar.X, ioVar.Y);
    }

    public static final uw a0(CaptureRequest.Key key) {
        key.getClass();
        return new uw("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final void e(final String str, final String str2, boolean z, final ki2 ki2Var, final float f, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        final boolean z3;
        boolean z4;
        str.getClass();
        str2.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1893850551);
        if (sk2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        if (sk2Var.h(ki2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (sk2Var.c(f)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i9 & 1, z2)) {
            sk2Var.X(-1075746068);
            float f2 = 1.0f;
            zy3 c = o76.c(wy3.a, 1.0f);
            sk2Var.X(-999499856);
            if ((i9 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L2 = sk2Var.L();
            if (z4 || L2 == su0.a) {
                L2 = new w7(0, ki2Var);
                sk2Var.h0(L2);
            }
            zy3 f02 = ct3.f0(a53.s(c, false, null, (ki2) L2, 15), false, null, 3);
            sk2Var.p(false);
            sk2Var.p(false);
            zy3 a0 = b53.a0(o76.e(64.0f, 2, f02), f, 8.0f, f, 8.0f);
            lr0 a = jr0.a(rt.d, y60.j0, sk2Var, 6);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e02);
            tv0 tv0Var = b01.a;
            sk2Var.X(-1337436731);
            long j = ((xq0) sk2Var.j(e01.a)).a;
            if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) >= 0.5d : mh7.V(j) <= 0.5d) {
                f2 = 0.87f;
            }
            sk2Var.p(false);
            dk7.a(tv0Var.a(Float.valueOf(f2)), ct3.H0(-1998714303, new x7(str, str2), sk2Var), sk2Var, 56);
            sk2Var.p(true);
            z3 = true;
        } else {
            sk2Var.R();
            z3 = z;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, str2, z3, ki2Var, f, i) { // from class: y7
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ ki2 R;
                public final /* synthetic */ float X;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    dt3.e(this.A, this.B, this.L, this.R, this.X, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static io f(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = RecyclerView.A1;
        }
        return new io(g0, Float.valueOf(f), new ko(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void h(final zy3 zy3Var, final ih4 ih4Var, final List list, final UUID uuid, final g56 g56Var, final gn gnVar, final mi2 mi2Var, final mi2 mi2Var2, final mi2 mi2Var3, tu0 tu0Var, final int i) {
        int i2;
        g56 g56Var2;
        mi2 mi2Var4;
        mi2 mi2Var5;
        mi2 mi2Var6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1872213612);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(ih4Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(list)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(uuid)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            g56Var2 = g56Var;
            if (sk2Var.f(g56Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        } else {
            g56Var2 = g56Var;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(gnVar)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            mi2Var4 = mi2Var;
            if (sk2Var.h(mi2Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        } else {
            mi2Var4 = mi2Var;
        }
        if ((12582912 & i) == 0) {
            mi2Var5 = mi2Var2;
            if (sk2Var.h(mi2Var5)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        } else {
            mi2Var5 = mi2Var2;
        }
        if ((100663296 & i) == 0) {
            mi2Var6 = mi2Var3;
            if (sk2Var.h(mi2Var6)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            mi2Var6 = mi2Var3;
        }
        boolean z5 = false;
        if ((i2 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            zy3 B2 = l07.B(zy3Var, ih4Var);
            co2 co2Var = new co2(140.0f);
            ye6 ye6Var = ov0.n;
            mh4 mh4Var = new mh4(b53.B(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.d() + 16.0f, b53.A(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.c() + 16.0f + 56.0f + 16.0f);
            ot otVar = new ot(16.0f, true, new i(1));
            ot otVar2 = new ot(16.0f, true, new i(1));
            boolean h = sk2Var.h(list) | sk2Var.h(uuid);
            if ((3670016 & i2) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h | z2;
            if ((57344 & i2) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z6 | z3 | sk2Var.h(gnVar);
            if ((29360128 & i2) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = h2 | z4;
            if ((i2 & 234881024) == 67108864) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object L2 = sk2Var.L();
            if (z8 || L2 == su0.a) {
                iz izVar = new iz(list, uuid, mi2Var4, g56Var2, gnVar, mi2Var5, mi2Var6);
                sk2Var.h0(izVar);
                L2 = izVar;
            }
            oo2.g(co2Var, B2, null, mh4Var, otVar2, otVar, null, false, null, (mi2) L2, sk2Var, 1769472, 916);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: dz
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dt3.h(zy3.this, ih4Var, list, uuid, g56Var, gnVar, mi2Var, mi2Var2, mi2Var3, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final String h0(kh5 kh5Var) {
        return wh1.i(kh5Var.a.d, "rom:");
    }

    public static final void i(final e00 e00Var, final g56 g56Var, gn gnVar, mi2 mi2Var, mi2 mi2Var2, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        gn gnVar2;
        final mi2 mi2Var3;
        final mi2 mi2Var4;
        boolean z;
        sk2 sk2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        g56Var.getClass();
        gnVar.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-602231173);
        if ((i & 6) == 0) {
            if (sk2Var2.h(e00Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var2.f(g56Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            gnVar2 = gnVar;
            if (sk2Var2.h(gnVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        } else {
            gnVar2 = gnVar;
        }
        if ((i & 3072) == 0) {
            mi2Var3 = mi2Var;
            if (sk2Var2.h(mi2Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            mi2Var3 = mi2Var;
        }
        if ((i & 24576) == 0) {
            mi2Var4 = mi2Var2;
            if (sk2Var2.h(mi2Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            mi2Var4 = mi2Var2;
        }
        if ((196608 & i) == 0) {
            if (sk2Var2.h(ki2Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        int i10 = i2;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i10 & 1, z)) {
            Context context = (Context) sk2Var2.j(ue.b);
            uq6 E = ep2.E(sk2Var2);
            final k24 x = l.x(e00Var.e, sk2Var2);
            final k24 x2 = l.x(e00Var.g, sk2Var2);
            vf1 vf1Var = new vf1(nm4.READ, 1);
            boolean h = sk2Var2.h(context) | sk2Var2.f(E) | sk2Var2.h(e00Var);
            Object L2 = sk2Var2.L();
            Object obj = su0.a;
            if (!h && L2 != obj) {
                i3 = 0;
            } else {
                i3 = 0;
                L2 = new cz(context, E, e00Var, 0);
                sk2Var2.h0(L2);
            }
            gt3 z2 = tq5.z(vf1Var, (mi2) L2, sk2Var2, i3);
            final String X2 = me2.X(sk2Var2, R.string.background_deleted);
            final String X3 = me2.X(sk2Var2, R.string.undo);
            final tu5 d = ru5.d(null, sk2Var2, 3);
            Object L3 = sk2Var2.L();
            if (L3 == obj) {
                L3 = l.A(sk2Var2);
                sk2Var2.h0(L3);
            }
            final o31 o31Var = (o31) L3;
            final gn gnVar3 = gnVar2;
            ep2.h(me2.X(sk2Var2, R.string.backgrounds), ki2Var, null, null, ct3.H0(-605213652, new z5(3, z2), sk2Var2), d, ct3.H0(-1843444025, new bj2() { // from class: fz
                @Override // defpackage.bj2
                public final Object i(Object obj2, Object obj3, Object obj4) {
                    boolean z3;
                    Object obj5;
                    int i11;
                    ih4 ih4Var = (ih4) obj2;
                    tu0 tu0Var2 = (tu0) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ih4Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((sk2) tu0Var2).f(ih4Var)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        intValue |= i11;
                    }
                    if ((intValue & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sk2 sk2Var3 = (sk2) tu0Var2;
                    if (sk2Var3.O(intValue & 1, z3)) {
                        ae6 ae6Var = x;
                        if (((List) ae6Var.getValue()) == null) {
                            sk2Var3.X(1705915244);
                            dt3.J(b53.W(mh7.m0(wy3.a, mh7.o), ih4Var).f(o76.c), sk2Var3, 0);
                            sk2Var3.p(false);
                        } else {
                            sk2Var3.X(1706098144);
                            s72 s72Var = o76.c;
                            List list = (List) ae6Var.getValue();
                            if (list == null) {
                                list = pp1.A;
                            }
                            UUID uuid = (UUID) x2.getValue();
                            Object obj6 = e00Var;
                            boolean h2 = sk2Var3.h(obj6);
                            Object obj7 = mi2Var3;
                            boolean f = h2 | sk2Var3.f(obj7);
                            Object L4 = sk2Var3.L();
                            Object obj8 = su0.a;
                            if (f || L4 == obj8) {
                                L4 = new x(6, obj6, obj7);
                                sk2Var3.h0(L4);
                            }
                            mi2 mi2Var5 = (mi2) L4;
                            mi2 mi2Var6 = mi2Var4;
                            boolean f2 = sk2Var3.f(mi2Var6);
                            Object L5 = sk2Var3.L();
                            if (f2 || L5 == obj8) {
                                L5 = new hz(0, mi2Var6);
                                sk2Var3.h0(L5);
                            }
                            mi2 mi2Var7 = (mi2) L5;
                            boolean h3 = sk2Var3.h(obj6);
                            Object obj9 = o31Var;
                            boolean h4 = h3 | sk2Var3.h(obj9);
                            Object obj10 = d;
                            Object obj11 = X2;
                            Object obj12 = X3;
                            boolean f3 = h4 | sk2Var3.f(obj10) | sk2Var3.f(obj11) | sk2Var3.f(obj12);
                            Object L6 = sk2Var3.L();
                            if (!f3 && L6 != obj8) {
                                obj5 = L6;
                            } else {
                                Object e5Var = new e5(obj6, obj9, obj10, obj11, obj12, 3);
                                sk2Var3.h0(e5Var);
                                obj5 = e5Var;
                            }
                            dt3.h(s72Var, ih4Var, list, uuid, g56.this, gnVar3, mi2Var5, mi2Var7, (mi2) obj5, sk2Var3, ((intValue << 3) & 112) | 6);
                            sk2Var3.p(false);
                        }
                    } else {
                        sk2Var3.R();
                    }
                    return o27.a;
                }
            }, sk2Var2), sk2Var2, ((i10 >> 12) & 112) | 1597440, 12);
            sk2Var = sk2Var2;
            ep2.f(me2.X(sk2Var, R.string.background_name), E, null, null, sk2Var, 0, 12);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new f5(e00Var, g56Var, gnVar, mi2Var, mi2Var2, ki2Var, i);
        }
    }

    public static t71 i0(ce0 ce0Var) {
        ce0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        t71 t71Var = null;
        if (i >= 33) {
            CameraCharacteristics.Key f = q41.f();
            f.getClass();
            DynamicRangeProfiles g = q41.g(((ia0) ce0Var).c(f));
            if (g != null) {
                if (i >= 33) {
                    t71Var = new t71(12, new wm1(g));
                } else {
                    c44.e(wh1.j("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                    return null;
                }
            }
        }
        if (t71Var == null) {
            return xm1.a;
        }
        return t71Var;
    }

    public static final void j(zy3 zy3Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-932836462);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(mi2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            cg2.k(sk2Var, l07.E(zy3Var, mi2Var));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, 1, zy3Var, mi2Var);
        }
    }

    public static final int j0(tu0 tu0Var) {
        tu0Var.getClass();
        return Long.hashCode(((sk2) tu0Var).T);
    }

    public static final qk2 k0(tu0 tu0Var) {
        wk2 wk2Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.U(206, xu0.e);
        if (sk2Var.S) {
            z86.z(sk2Var.I);
        }
        Object D = sk2Var.D();
        if (D instanceof wk2) {
            wk2Var = (wk2) D;
        } else {
            wk2Var = null;
        }
        if (wk2Var == null) {
            wk2Var = new wk2(new pk2(new qk2(sk2Var, sk2Var.T, sk2Var.q, sk2Var.C, sk2Var.h.o0)), -1);
            sk2Var.i0(wk2Var);
        }
        l95 l95Var = wk2Var.a;
        l95Var.getClass();
        qk2 qk2Var = ((pk2) l95Var).A;
        qk2Var.f.setValue(sk2Var.l());
        sk2Var.p(false);
        return qk2Var;
    }

    public static final zy3 l0(int i, String str, Map map, int i2, mi2 mi2Var, sk2 sk2Var, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = (i3 & 112) ^ 48;
        boolean z5 = false;
        if ((i4 > 32 && sk2Var.f(str)) || (i3 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        Object L2 = sk2Var.L();
        Object obj = su0.a;
        if (z || L2 == obj) {
            L2 = new wc2();
            sk2Var.h0(L2);
        }
        wc2 wc2Var = (wc2) L2;
        boolean h = sk2Var.h(map);
        if ((i4 > 32 && sk2Var.f(str)) || (i3 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean f = z2 | h | sk2Var.f(wc2Var);
        Object L3 = sk2Var.L();
        if (f || L3 == obj) {
            L3 = new cz(map, str, wc2Var, 19);
            sk2Var.h0(L3);
        }
        l.e(str, wc2Var, (mi2) L3, sk2Var);
        zy3 I = b53.I(wy3.a, wc2Var);
        if ((((57344 & i3) ^ 24576) > 16384 && sk2Var.f(mi2Var)) || (i3 & 24576) == 16384) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i3 & 14) ^ 6) > 4 && sk2Var.d(i)) || (i3 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = z3 | z4;
        if ((((i3 & 7168) ^ 3072) > 2048 && sk2Var.d(i2)) || (i3 & 3072) == 2048) {
            z5 = true;
        }
        boolean z7 = z6 | z5;
        Object L4 = sk2Var.L();
        if (z7 || L4 == obj) {
            L4 = new p04(mi2Var, i, i2, 2);
            sk2Var.h0(L4);
        }
        return iq2.y(I, (mi2) L4);
    }

    public static final float m0(float f, int i, float f2, sk2 sk2Var) {
        sk2Var.X(2117325265);
        od1 od1Var = (od1) sk2Var.j(ov0.h);
        if (i <= 0) {
            sk2Var.p(false);
            return f2;
        }
        ji1 ji1Var = new ji1(f - od1Var.A0(i));
        ji1 ji1Var2 = new ji1(RecyclerView.A1);
        if (ji1Var.compareTo(ji1Var2) < 0) {
            ji1Var = ji1Var2;
        }
        ji1 ji1Var3 = new ji1(f2);
        ji1 ji1Var4 = new ji1(ji1Var.A);
        if (ji1Var3.compareTo(ji1Var4) < 0) {
            ji1Var3 = ji1Var4;
        }
        sk2Var.p(false);
        return ji1Var3.A;
    }

    public static final void n(zy3 zy3Var, ul0 ul0Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sk2 sk2Var;
        ki2 ki2Var2;
        int i4;
        long j;
        String description;
        boolean z2;
        boolean z3;
        zy3Var.getClass();
        ul0Var.getClass();
        Cheat cheat = ul0Var.a;
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1315035595);
        if (sk2Var2.f(ul0Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (sk2Var2.h(ki2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i6 & 1, z)) {
            jd7 C = mj2.C(sk2Var2);
            Object L2 = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var2);
            }
            l14 l14Var = (l14) L2;
            k24 a = bh7.a(l14Var, sk2Var2, 6);
            fr5 b = gr5.b(13.0f);
            zy3 t = a53.t(zy3Var, b);
            if (((Boolean) a.getValue()).booleanValue()) {
                i4 = i6;
                j = C.e;
            } else {
                i4 = i6;
                j = C.d;
            }
            zy3 i7 = dk7.i(t, j, iq2.g);
            if (((Boolean) a.getValue()).booleanValue()) {
                i7 = b53.z(2.0f, C.j, i7, b);
            }
            zy3 a0 = b53.a0(a53.r(i7, l14Var, null, false, null, ki2Var, 28), 14.0f, 11.0f, 14.0f, 11.0f);
            i20 i20Var = y60.h0;
            sr5 a2 = rr5.a(rt.a, i20Var, sk2Var2, 48);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, a0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e02);
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(new ot(3.0f, true, new i(1)), y60.j0, sk2Var2, 6);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e03 = l07.e0(sk2Var2, xg3Var);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a3);
            oo2.S(sk2Var2, dnVar2, l2);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e03);
            sr5 a4 = rr5.a(new ot(6.0f, true, new i(1)), i20Var, sk2Var2, 54);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            wy3 wy3Var = wy3.a;
            zy3 e04 = l07.e0(sk2Var2, wy3Var);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a4);
            oo2.S(sk2Var2, dnVar2, l3);
            b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e04);
            ev2.a(fj7.b(), null, o76.h(wy3Var, 13.0f), C.i, sk2Var2, 432, 0);
            int i8 = i4;
            ir6.b(ul0Var.b, null, C.i, hi2.B(9), null, td7.c, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var2, 1575936, 3120, 120754);
            sk2Var2.p(true);
            ir6.b(cheat.getName(), null, C.g, hi2.A(13.5d), pe2.Z, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var2, 199680, 3120, 120786);
            sk2Var = sk2Var2;
            if (cheat.getDescription() != null && (!zg6.B0(description))) {
                sk2Var.X(1071540310);
                String description2 = cheat.getDescription();
                description2.getClass();
                ir6.b(description2, null, C.i, hi2.A(11.5d), null, null, 0L, null, hi2.B(15), 2, false, 2, 0, null, null, sk2Var, 3072, 3126, 119794);
                sk2Var = sk2Var;
                z2 = false;
                sk2Var.p(false);
            } else {
                z2 = false;
                sk2Var.X(1071837693);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var, 10.0f));
            boolean enabled = cheat.getEnabled();
            if ((i8 & 896) == 256) {
                z3 = true;
            } else {
                z3 = z2;
            }
            Object L3 = sk2Var.L();
            if (!z3 && L3 != sn1Var) {
                ki2Var2 = ki2Var;
            } else {
                ki2Var2 = ki2Var;
                L3 = new el0(1, ki2Var2);
                sk2Var.h0(L3);
            }
            oo2.o(enabled, (mi2) L3, null, false, sk2Var, 0, 12);
            sk2Var.p(true);
        } else {
            sk2Var = sk2Var2;
            ki2Var2 = ki2Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(zy3Var, ul0Var, ki2Var2, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:19:0x0072). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n0(defpackage.ri5 r11, defpackage.ki3 r12, defpackage.pk3 r13, java.util.Map r14, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt3.n0(ri5, ki3, pk3, java.util.Map, k11):java.lang.Object");
    }

    public static final void o0(ih0 ih0Var, j11 j11Var, boolean z) {
        Object f;
        j27 j27Var;
        Object w = ih0Var.w();
        Throwable e = ih0Var.e(w);
        if (e != null) {
            f = new kc5(e);
        } else {
            f = ih0Var.f(w);
        }
        if (z) {
            j11Var.getClass();
            jg1 jg1Var = (jg1) j11Var;
            k11 k11Var = jg1Var.X;
            Object obj = jg1Var.Z;
            e31 a = k11Var.a();
            Object c = ts6.c(a, obj);
            if (c != ts6.a) {
                j27Var = pu.O(k11Var, a, c);
            } else {
                j27Var = null;
            }
            try {
                k11Var.k(f);
                if (j27Var != null && !j27Var.x0()) {
                    return;
                }
                ts6.a(a, c);
                return;
            } catch (Throwable th) {
                if (j27Var == null || j27Var.x0()) {
                    ts6.a(a, c);
                }
                throw th;
            }
        }
        j11Var.k(f);
    }

    public static final LinkedHashMap p0(cw0 cw0Var) {
        CaptureRequest.Key key;
        Object g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (uw uwVar : cw0Var.e()) {
            Object obj = uwVar.c;
            if (obj instanceof CaptureRequest.Key) {
                key = (CaptureRequest.Key) obj;
            } else {
                key = null;
            }
            if (key != null && (g = cw0Var.g(uwVar)) != null) {
                linkedHashMap.put(key, g);
            }
        }
        return linkedHashMap;
    }

    public static final List q0(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return pp1.A;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            hj3 hj3Var = (hj3) arrayList.get(i3);
            int index = hj3Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(hj3Var);
            }
        }
        wq0.A0(arrayList2, d0);
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(defpackage.ki2 r18, defpackage.ff1 r19, defpackage.et0 r20, defpackage.tu0 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt3.t(ki2, ff1, et0, tu0, int, int):void");
    }

    public static final void u(bm5 bm5Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        String o;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1404300063);
        if (sk2Var.d(bm5Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            zy3 X2 = b53.X(o76.c, 32.0f);
            tv3 d = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, X2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e02);
            int i4 = oi5.b[bm5Var.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    o = b31.o(sk2Var, -50144077, R.string.rom_no_results_filter, sk2Var, false);
                } else {
                    o = b31.o(sk2Var, -50146066, R.string.rom_no_favorites, sk2Var, false);
                }
            } else {
                o = b31.o(sk2Var, -50148437, R.string.no_roms_found, sk2Var, false);
            }
            ir6.b(o, null, C.h, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130554);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 25, bm5Var);
        }
    }

    public static final void v(zy3 zy3Var, ih4 ih4Var, gn0 gn0Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        gn0Var.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1863343579);
        if (sk2Var.f(ih4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (sk2Var.f(gn0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if (gn0Var instanceof en0) {
                sk2Var.X(328191092);
                me2.b(b53.W(zy3Var, ih4Var), sk2Var, 0);
                sk2Var.p(false);
            } else if (gn0Var instanceof fn0) {
                sk2Var.X(328194029);
                D(zy3Var, ih4Var, (List) ((fn0) gn0Var).a, mi2Var, sk2Var, i7 & 7294);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, 328189509, false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new iz1(zy3Var, ih4Var, gn0Var, mi2Var, i, 0);
        }
    }

    public static final void y(zy3 zy3Var, ih4 ih4Var, gn0 gn0Var, mi2 mi2Var, mi2 mi2Var2, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        gn0Var.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1156545762);
        if (sk2Var.f(ih4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i | i2;
        if (sk2Var.f(gn0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(mi2Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            if (gn0Var instanceof en0) {
                sk2Var.X(-956043439);
                me2.b(b53.W(zy3Var, ih4Var), sk2Var, 0);
                sk2Var.p(false);
            } else if (gn0Var instanceof fn0) {
                sk2Var.X(-956040459);
                G(zy3Var, ih4Var, (List) ((fn0) gn0Var).a, mi2Var, mi2Var2, sk2Var, i9 & 64638);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, -956045010, false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new b4(zy3Var, ih4Var, gn0Var, mi2Var, mi2Var2, i, 2);
        }
    }

    @Override // defpackage.zu0
    public void A(h06 h06Var, int i, boolean z) {
        h06Var.getClass();
        c0(h06Var, i);
        w(z);
    }

    @Override // defpackage.zu0
    public void C(rt4 rt4Var, int i, char c) {
        rt4Var.getClass();
        c0(rt4Var, i);
        S(c);
    }

    @Override // defpackage.mz1
    public void E(int i) {
        d0(Integer.valueOf(i));
    }

    @Override // defpackage.zu0
    public void F(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        c0(h06Var, i);
        l(m93Var, obj);
    }

    @Override // defpackage.mz1
    public void H(float f) {
        d0(Float.valueOf(f));
    }

    @Override // defpackage.zu0
    public void N(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        c0(h06Var, i);
        if (m93Var.e().h()) {
            l(m93Var, obj);
        } else if (obj == null) {
            g();
        } else {
            l(m93Var, obj);
        }
    }

    @Override // defpackage.mz1
    public void P(long j) {
        d0(Long.valueOf(j));
    }

    @Override // defpackage.zu0
    public void R(rt4 rt4Var, int i, byte b) {
        rt4Var.getClass();
        c0(rt4Var, i);
        s(b);
    }

    @Override // defpackage.mz1
    public void S(char c) {
        d0(Character.valueOf(c));
    }

    @Override // defpackage.zu0
    public mz1 Y(rt4 rt4Var, int i) {
        rt4Var.getClass();
        c0(rt4Var, i);
        return x(rt4Var.j(i));
    }

    @Override // defpackage.zu0
    public void a(h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.mz1
    public void b0(String str) {
        str.getClass();
        d0(str);
    }

    @Override // defpackage.mz1
    public zu0 c(h06 h06Var) {
        h06Var.getClass();
        return this;
    }

    public abstract void c0(h06 h06Var, int i);

    @Override // defpackage.zu0
    public void d(rt4 rt4Var, int i, double d) {
        rt4Var.getClass();
        c0(rt4Var, i);
        o(d);
    }

    public void d0(Object obj) {
        obj.getClass();
        throw new IllegalArgumentException("Non-serializable " + q75.a(obj.getClass()) + " is not supported by " + q75.a(getClass()) + " encoder");
    }

    @Override // defpackage.zu0
    public void e0(h06 h06Var, int i, float f) {
        h06Var.getClass();
        c0(h06Var, i);
        H(f);
    }

    @Override // defpackage.mz1
    public void g0(h06 h06Var, int i) {
        h06Var.getClass();
        d0(Integer.valueOf(i));
    }

    @Override // defpackage.zu0
    public void m(rt4 rt4Var, int i, short s) {
        rt4Var.getClass();
        c0(rt4Var, i);
        p(s);
    }

    @Override // defpackage.mz1
    public void o(double d) {
        d0(Double.valueOf(d));
    }

    @Override // defpackage.mz1
    public void p(short s) {
        d0(Short.valueOf(s));
    }

    @Override // defpackage.zu0
    public void q(int i, int i2, h06 h06Var) {
        h06Var.getClass();
        c0(h06Var, i);
        E(i2);
    }

    @Override // defpackage.zu0
    public void r(h06 h06Var, int i, long j) {
        h06Var.getClass();
        c0(h06Var, i);
        P(j);
    }

    @Override // defpackage.mz1
    public void s(byte b) {
        d0(Byte.valueOf(b));
    }

    @Override // defpackage.mz1
    public void w(boolean z) {
        d0(Boolean.valueOf(z));
    }

    @Override // defpackage.mz1
    public abstract mz1 x(h06 h06Var);

    @Override // defpackage.zu0
    public void z(h06 h06Var, int i, String str) {
        h06Var.getClass();
        str.getClass();
        c0(h06Var, i);
        b0(str);
    }
}
