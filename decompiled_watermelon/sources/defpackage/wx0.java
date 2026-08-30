package defpackage;

import java.util.Iterator;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wx0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wx0 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ cm1 B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ mi2 Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ mi2 d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ mi2 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ mi2 h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ mi2 j0;
    public final /* synthetic */ gv5 k0;
    public final /* synthetic */ mi2 l0;
    public final /* synthetic */ gv5 m0;
    public final /* synthetic */ mi2 n0;
    public final /* synthetic */ Object o0;

    public /* synthetic */ wx0(cm1 cm1Var, mi2 mi2Var, boolean z, mi2 mi2Var2, boolean z2, mi2 mi2Var3, boolean z3, mi2 mi2Var4, boolean z4, mi2 mi2Var5, boolean z5, mi2 mi2Var6, boolean z6, mi2 mi2Var7, gv5 gv5Var, mi2 mi2Var8, gv5 gv5Var2, mi2 mi2Var9, ki2 ki2Var, int i) {
        this.B = cm1Var;
        this.L = mi2Var;
        this.R = z;
        this.X = mi2Var2;
        this.Y = z2;
        this.Z = mi2Var3;
        this.c0 = z3;
        this.d0 = mi2Var4;
        this.e0 = z4;
        this.f0 = mi2Var5;
        this.g0 = z5;
        this.h0 = mi2Var6;
        this.i0 = z6;
        this.j0 = mi2Var7;
        this.k0 = gv5Var;
        this.l0 = mi2Var8;
        this.m0 = gv5Var2;
        this.n0 = mi2Var9;
        this.o0 = ki2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        wc2 wc2Var;
        boolean z5;
        int ordinal;
        final int i;
        boolean z6;
        Object obj3;
        int i2 = this.A;
        o27 o27Var = o27.a;
        Object obj4 = this.o0;
        boolean z7 = true;
        switch (i2) {
            case 0:
                k24 k24Var = (k24) obj4;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z8 = false;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    int i3 = xx0.a[((dt4) k24Var.getValue()).ordinal()];
                    wy3 wy3Var = wy3.a;
                    boolean z9 = this.R;
                    boolean z10 = this.Y;
                    float f = 6.0f;
                    Object obj5 = su0.a;
                    Throwable th = null;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                sk2Var.X(1252171010);
                                List<ti4> c0 = l07.c0(new ti4(null, me2.X(sk2Var, R.string.use_global_preference)), new ti4(gv5.TOP, me2.X(sk2Var, R.string.dual_screen_vertical_alignment_option_top)), new ti4(gv5.CENTER, me2.X(sk2Var, R.string.dual_screen_vertical_alignment_option_center)), new ti4(gv5.BOTTOM, me2.X(sk2Var, R.string.dual_screen_vertical_alignment_option_bottom)));
                                yx0.d(me2.X(sk2Var, R.string.dual_screen_vertical_alignment_internal_label), sk2Var, 0);
                                sk2Var.X(-1206514904);
                                Iterator it = c0.iterator();
                                int i4 = 0;
                                while (true) {
                                    int i5 = -1;
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i6 = i4 + 1;
                                        if (i4 >= 0) {
                                            ti4 ti4Var = (ti4) next;
                                            final gv5 gv5Var = (gv5) ti4Var.A;
                                            String str = (String) ti4Var.B;
                                            final gv5 gv5Var2 = this.k0;
                                            if (gv5Var == gv5Var2) {
                                                z6 = z7;
                                            } else {
                                                z6 = false;
                                            }
                                            if (i4 == 0) {
                                                sk2Var.X(270296167);
                                                Object f2 = yx0.f(sk2Var);
                                                sk2Var.p(false);
                                                obj3 = f2;
                                            } else {
                                                sk2Var.X(-210728118);
                                                sk2Var.p(false);
                                                obj3 = th;
                                            }
                                            final mi2 mi2Var = this.l0;
                                            boolean f3 = sk2Var.f(mi2Var);
                                            if (gv5Var != null) {
                                                i5 = gv5Var.ordinal();
                                            }
                                            boolean d = f3 | sk2Var.d(i5);
                                            Object L = sk2Var.L();
                                            if (d || L == obj5) {
                                                L = new ki2() { // from class: qx0
                                                    @Override // defpackage.ki2
                                                    public final Object c() {
                                                        int i7 = r3;
                                                        o27 o27Var2 = o27.a;
                                                        gv5 gv5Var3 = gv5Var;
                                                        mi2 mi2Var2 = mi2Var;
                                                        switch (i7) {
                                                            case 0:
                                                                mi2Var2.n(gv5Var3);
                                                                return o27Var2;
                                                            default:
                                                                mi2Var2.n(gv5Var3);
                                                                return o27Var2;
                                                        }
                                                    }
                                                };
                                                sk2Var.h0(L);
                                            }
                                            sk2 sk2Var2 = sk2Var;
                                            yx0.b(str, z6, obj3, false, (ki2) L, ct3.H0(-597577304, new aj2() { // from class: rx0
                                                @Override // defpackage.aj2
                                                public final Object j(Object obj6, Object obj7) {
                                                    boolean z11;
                                                    boolean z12;
                                                    int i7 = r3;
                                                    o27 o27Var2 = o27.a;
                                                    wy3 wy3Var2 = wy3.a;
                                                    gv5 gv5Var3 = gv5Var2;
                                                    gv5 gv5Var4 = gv5Var;
                                                    switch (i7) {
                                                        case 0:
                                                            tu0 tu0Var2 = (tu0) obj6;
                                                            int intValue2 = ((Integer) obj7).intValue();
                                                            if ((intValue2 & 3) != 2) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            sk2 sk2Var3 = (sk2) tu0Var2;
                                                            if (sk2Var3.O(1 & intValue2, z11)) {
                                                                if (gv5Var4 == gv5Var3) {
                                                                    sk2Var3.X(214042690);
                                                                    ev2.a(pu.t(), null, o76.h(wy3Var2, 20.0f), mj2.C(sk2Var3).l, sk2Var3, 432, 0);
                                                                } else {
                                                                    sk2Var3.X(214127258);
                                                                }
                                                                sk2Var3.p(false);
                                                            } else {
                                                                sk2Var3.R();
                                                            }
                                                            return o27Var2;
                                                        default:
                                                            tu0 tu0Var3 = (tu0) obj6;
                                                            int intValue3 = ((Integer) obj7).intValue();
                                                            if ((intValue3 & 3) != 2) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            sk2 sk2Var4 = (sk2) tu0Var3;
                                                            if (sk2Var4.O(1 & intValue3, z12)) {
                                                                if (gv5Var4 == gv5Var3) {
                                                                    sk2Var4.X(659068592);
                                                                    ev2.a(pu.t(), null, o76.h(wy3Var2, 20.0f), mj2.C(sk2Var4).l, sk2Var4, 432, 0);
                                                                } else {
                                                                    sk2Var4.X(659153160);
                                                                }
                                                                sk2Var4.p(false);
                                                            } else {
                                                                sk2Var4.R();
                                                            }
                                                            return o27Var2;
                                                    }
                                                }
                                            }, sk2Var), sk2Var2, 196608, 8);
                                            th = null;
                                            obj5 = obj5;
                                            f = 6.0f;
                                            sk2Var = sk2Var2;
                                            i4 = i6;
                                            z7 = true;
                                        } else {
                                            Throwable th2 = th;
                                            l07.v0();
                                            throw th2;
                                        }
                                    } else {
                                        Object obj6 = obj5;
                                        sk2Var.p(false);
                                        cg2.k(sk2Var, o76.d(wy3Var, f));
                                        yx0.d(me2.X(sk2Var, R.string.dual_screen_vertical_alignment_external_label), sk2Var, 0);
                                        for (ti4 ti4Var2 : c0) {
                                            final gv5 gv5Var3 = (gv5) ti4Var2.A;
                                            String str2 = (String) ti4Var2.B;
                                            final gv5 gv5Var4 = this.m0;
                                            if (gv5Var3 == gv5Var4) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            final mi2 mi2Var2 = this.n0;
                                            boolean f4 = sk2Var.f(mi2Var2);
                                            if (gv5Var3 == null) {
                                                ordinal = -1;
                                            } else {
                                                ordinal = gv5Var3.ordinal();
                                            }
                                            boolean d2 = f4 | sk2Var.d(ordinal);
                                            Object L2 = sk2Var.L();
                                            if (!d2 && L2 != obj6) {
                                                i = 1;
                                            } else {
                                                i = 1;
                                                L2 = new ki2() { // from class: qx0
                                                    @Override // defpackage.ki2
                                                    public final Object c() {
                                                        int i7 = r3;
                                                        o27 o27Var2 = o27.a;
                                                        gv5 gv5Var32 = gv5Var3;
                                                        mi2 mi2Var22 = mi2Var2;
                                                        switch (i7) {
                                                            case 0:
                                                                mi2Var22.n(gv5Var32);
                                                                return o27Var2;
                                                            default:
                                                                mi2Var22.n(gv5Var32);
                                                                return o27Var2;
                                                        }
                                                    }
                                                };
                                                sk2Var.h0(L2);
                                            }
                                            sk2 sk2Var3 = sk2Var;
                                            yx0.b(str2, z5, null, false, (ki2) L2, ct3.H0(-691705350, new aj2() { // from class: rx0
                                                @Override // defpackage.aj2
                                                public final Object j(Object obj62, Object obj7) {
                                                    boolean z11;
                                                    boolean z12;
                                                    int i7 = i;
                                                    o27 o27Var2 = o27.a;
                                                    wy3 wy3Var2 = wy3.a;
                                                    gv5 gv5Var32 = gv5Var4;
                                                    gv5 gv5Var42 = gv5Var3;
                                                    switch (i7) {
                                                        case 0:
                                                            tu0 tu0Var2 = (tu0) obj62;
                                                            int intValue2 = ((Integer) obj7).intValue();
                                                            if ((intValue2 & 3) != 2) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            sk2 sk2Var32 = (sk2) tu0Var2;
                                                            if (sk2Var32.O(1 & intValue2, z11)) {
                                                                if (gv5Var42 == gv5Var32) {
                                                                    sk2Var32.X(214042690);
                                                                    ev2.a(pu.t(), null, o76.h(wy3Var2, 20.0f), mj2.C(sk2Var32).l, sk2Var32, 432, 0);
                                                                } else {
                                                                    sk2Var32.X(214127258);
                                                                }
                                                                sk2Var32.p(false);
                                                            } else {
                                                                sk2Var32.R();
                                                            }
                                                            return o27Var2;
                                                        default:
                                                            tu0 tu0Var3 = (tu0) obj62;
                                                            int intValue3 = ((Integer) obj7).intValue();
                                                            if ((intValue3 & 3) != 2) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            sk2 sk2Var4 = (sk2) tu0Var3;
                                                            if (sk2Var4.O(1 & intValue3, z12)) {
                                                                if (gv5Var42 == gv5Var32) {
                                                                    sk2Var4.X(659068592);
                                                                    ev2.a(pu.t(), null, o76.h(wy3Var2, 20.0f), mj2.C(sk2Var4).l, sk2Var4, 432, 0);
                                                                } else {
                                                                    sk2Var4.X(659153160);
                                                                }
                                                                sk2Var4.p(false);
                                                            } else {
                                                                sk2Var4.R();
                                                            }
                                                            return o27Var2;
                                                    }
                                                }
                                            }, sk2Var), sk2Var3, 196608, 12);
                                            sk2Var = sk2Var3;
                                        }
                                        sk2Var.p(false);
                                    }
                                }
                            } else {
                                throw ej6.d(sk2Var, -1206660900, false);
                            }
                        } else {
                            sk2Var.X(1251099743);
                            if (!z10 && !z9) {
                                sk2Var.X(1251135920);
                                yx0.d(me2.X(sk2Var, R.string.dual_screen_fill_area_requires_integer), sk2Var, 0);
                                sk2Var.p(false);
                            } else {
                                sk2Var.X(1251255084);
                                sk2Var.p(false);
                            }
                            yx0.d(me2.X(sk2Var, R.string.dual_screen_fill_section_internal), sk2Var, 0);
                            yx0.e(me2.X(sk2Var, R.string.dual_screen_fill_height_label), this.c0, this.Z, true, false, sk2Var, 3072, 16);
                            yx0.e(me2.X(sk2Var, R.string.dual_screen_fill_width_label), this.e0, this.d0, false, false, sk2Var, 0, 24);
                            cg2.k(sk2Var, o76.d(wy3Var, 6.0f));
                            yx0.d(me2.X(sk2Var, R.string.dual_screen_fill_section_external), sk2Var, 0);
                            yx0.e(me2.X(sk2Var, R.string.dual_screen_fill_height_label), this.g0, this.f0, false, false, sk2Var, 0, 24);
                            yx0.e(me2.X(sk2Var, R.string.dual_screen_fill_width_label), this.i0, this.h0, false, false, sk2Var, 0, 24);
                            sk2Var.p(false);
                        }
                        return o27Var;
                    }
                    sk2Var.X(1248174738);
                    cm1 cm1Var = cm1.OFF;
                    cm1 cm1Var2 = this.B;
                    if (cm1Var2 != cm1Var) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        sk2Var.X(1248202421);
                        yx0.d(me2.X(sk2Var, R.string.dual_screen_presets_disabled_hint), sk2Var, 0);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(1248316780);
                        sk2Var.p(false);
                    }
                    yx0.d(me2.X(sk2Var, R.string.dual_screen_presets), sk2Var, 0);
                    List c02 = l07.c0(new ti4(cm1Var, me2.X(sk2Var, R.string.dual_screen_preset_off)), new ti4(cm1.INTERNAL_TOP_EXTERNAL_BOTTOM, me2.X(sk2Var, R.string.dual_screen_preset_internal_top_external_bottom)), new ti4(cm1.INTERNAL_BOTTOM_EXTERNAL_TOP, me2.X(sk2Var, R.string.dual_screen_preset_internal_bottom_external_top)));
                    sk2Var.X(-1206639758);
                    int i7 = 0;
                    sk2 sk2Var4 = sk2Var;
                    for (Object obj7 : c02) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            ti4 ti4Var3 = (ti4) obj7;
                            cm1 cm1Var3 = (cm1) ti4Var3.A;
                            String str3 = (String) ti4Var3.B;
                            int i9 = i7;
                            if (cm1Var3 == cm1Var2) {
                                z4 = true;
                            } else {
                                z4 = z8;
                            }
                            if (i9 == 0) {
                                sk2Var4.X(-994313089);
                                wc2Var = yx0.f(sk2Var4);
                                sk2Var4.p(z8);
                            } else {
                                sk2Var4.X(-758909390);
                                sk2Var4.p(z8);
                                wc2Var = null;
                            }
                            mi2 mi2Var3 = this.j0;
                            boolean f5 = sk2Var4.f(mi2Var3) | sk2Var4.d(cm1Var3.ordinal());
                            o27 o27Var2 = o27Var;
                            Object L3 = sk2Var4.L();
                            if (f5 || L3 == obj5) {
                                L3 = new p6(20, mi2Var3, cm1Var3);
                                sk2Var4.h0(L3);
                            }
                            cm1 cm1Var4 = cm1Var2;
                            wc2 wc2Var2 = wc2Var;
                            sk2 sk2Var5 = sk2Var4;
                            yx0.b(str3, z4, wc2Var2, false, (ki2) L3, ct3.H0(-1729668640, new s4(6, cm1Var3, cm1Var2), sk2Var4), sk2Var5, 196608, 8);
                            cm1Var2 = cm1Var4;
                            z10 = z10;
                            sk2Var4 = sk2Var5;
                            i7 = i8;
                            o27Var = o27Var2;
                            z8 = false;
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                    o27 o27Var3 = o27Var;
                    boolean z11 = z10;
                    sk2Var4.p(z8);
                    cg2.k(sk2Var4, o76.d(wy3Var, 6.0f));
                    boolean z12 = z2;
                    yx0.e(me2.X(sk2Var4, R.string.keep_ds_ratio), z9, this.L, false, z12, sk2Var4, 0, 8);
                    yx0.e(me2.X(sk2Var4, R.string.dual_screen_integer_scale), z11, this.X, false, z12, sk2Var4, 0, 8);
                    cg2.k(sk2Var4, o76.d(wy3Var, 6.0f));
                    if (z12 && (z9 || z11)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String X = me2.X(sk2Var4, R.string.dual_screen_fill_area_button);
                    Object L4 = sk2Var4.L();
                    if (L4 == obj5) {
                        L4 = new f4(k24Var, 14);
                        sk2Var4.h0(L4);
                    }
                    sk2 sk2Var6 = sk2Var4;
                    yx0.b(X, false, null, z3, (ki2) L4, l.c, sk2Var6, 221184, 6);
                    String X2 = me2.X(sk2Var6, R.string.dual_screen_vertical_alignment_button);
                    Object L5 = sk2Var6.L();
                    if (L5 == obj5) {
                        L5 = new f4(k24Var, 15);
                        sk2Var6.h0(L5);
                    }
                    yx0.b(X2, false, null, z3, (ki2) L5, l.d, sk2Var6, 221184, 6);
                    sk2Var6.p(false);
                    return o27Var3;
                }
                sk2Var.R();
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                yx0.a(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, (ki2) obj4, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ wx0(cm1 cm1Var, boolean z, mi2 mi2Var, boolean z2, mi2 mi2Var2, boolean z3, mi2 mi2Var3, boolean z4, mi2 mi2Var4, boolean z5, mi2 mi2Var5, boolean z6, mi2 mi2Var6, k24 k24Var, mi2 mi2Var7, gv5 gv5Var, mi2 mi2Var8, gv5 gv5Var2, mi2 mi2Var9) {
        this.B = cm1Var;
        this.R = z;
        this.L = mi2Var;
        this.Y = z2;
        this.X = mi2Var2;
        this.c0 = z3;
        this.Z = mi2Var3;
        this.e0 = z4;
        this.d0 = mi2Var4;
        this.g0 = z5;
        this.f0 = mi2Var5;
        this.i0 = z6;
        this.h0 = mi2Var6;
        this.o0 = k24Var;
        this.j0 = mi2Var7;
        this.k0 = gv5Var;
        this.l0 = mi2Var8;
        this.m0 = gv5Var2;
        this.n0 = mi2Var9;
    }
}
