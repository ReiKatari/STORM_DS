package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x01  reason: default package */
/* loaded from: classes.dex */
public abstract class x01 {
    public static final long a = hv.c(4077389577L);
    public static final /* synthetic */ int b = 0;

    public static final void a(final jq1 jq1Var, final qn2 qn2Var, final boolean z, final qn2 qn2Var2, final boolean z2, final qn2 qn2Var3, final boolean z3, final qn2 qn2Var4, final boolean z4, final qn2 qn2Var5, final boolean z5, final qn2 qn2Var6, final boolean z6, final qn2 qn2Var7, final p66 p66Var, final qn2 qn2Var8, final p66 p66Var2, final qn2 qn2Var9, final on2 on2Var, px0 px0Var, final int i) {
        int i2;
        int ordinal;
        boolean z7;
        int i3;
        int i4;
        jq1Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        qn2Var3.getClass();
        qn2Var4.getClass();
        qn2Var5.getClass();
        qn2Var6.getClass();
        qn2Var7.getClass();
        qn2Var8.getClass();
        qn2Var9.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-363551146);
        int i5 = i | (xq2Var.d(jq1Var.ordinal()) ? 4 : 2) | (xq2Var.h(qn2Var) ? 32 : 16) | (xq2Var.g(z) ? 256 : 128) | (xq2Var.h(qn2Var2) ? 2048 : 1024) | (xq2Var.g(z2) ? 16384 : 8192) | (xq2Var.h(qn2Var3) ? 131072 : 65536) | (xq2Var.g(z3) ? 1048576 : 524288) | (xq2Var.h(qn2Var4) ? 8388608 : 4194304) | (xq2Var.g(z4) ? 67108864 : 33554432) | (xq2Var.h(qn2Var5) ? 536870912 : 268435456);
        int i6 = (xq2Var.g(z5) ? (char) 4 : (char) 2) | (xq2Var.h(qn2Var6) ? ' ' : (char) 16) | (xq2Var.g(z6) ? 256 : 128) | (xq2Var.h(qn2Var7) ? 2048 : 1024);
        if (p66Var == null) {
            i2 = i5;
            ordinal = -1;
        } else {
            i2 = i5;
            ordinal = p66Var.ordinal();
        }
        int i7 = i6 | (xq2Var.d(ordinal) ? (char) 16384 : (char) 8192) | (xq2Var.h(qn2Var8) ? (char) 0 : (char) 0) | (xq2Var.d(p66Var2 != null ? p66Var2.ordinal() : -1) ? (char) 0 : (char) 0) | (xq2Var.h(qn2Var9) ? (char) 0 : (char) 0) | (xq2Var.h(on2Var) ? (char) 0 : (char) 0);
        if (xq2Var.S(i2 & 1, ((i2 & 306783379) == 306783378 && (i7 & 38347923) == 38347922) ? false : true)) {
            final es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(f25.MAIN);
                xq2Var.l0(P);
            }
            final qa4 qa4Var = (qa4) P;
            int i8 = i7 & 234881024;
            boolean z8 = i8 == 67108864;
            Object P2 = xq2Var.P();
            if (z8 || P2 == vs0Var) {
                P2 = new s00(on2Var, qa4Var, 4);
                xq2Var.l0(P2);
            }
            ge7.b(false, (on2) P2, xq2Var, 0, 1);
            int i9 = w01.a[((f25) qa4Var.getValue()).ordinal()];
            if (i9 == 1) {
                z7 = false;
                i3 = -1480263710;
                i4 = R.string.dual_screen_presets;
            } else if (i9 == 2) {
                z7 = false;
                i3 = -1480261014;
                i4 = R.string.dual_screen_fill_area_title;
            } else if (i9 != 3) {
                throw xg6.f(xq2Var, -1480265048, false);
            } else {
                i3 = -1480257773;
                i4 = R.string.dual_screen_vertical_alignment_title;
                z7 = false;
            }
            String l = i61.l(xq2Var, i3, i4, xq2Var, z7);
            boolean z9 = i8 == 67108864 ? true : z7;
            Object P3 = xq2Var.P();
            if (z9 || P3 == vs0Var) {
                P3 = new s00(on2Var, qa4Var, 5);
                xq2Var.l0(P3);
            }
            c(l, (on2) P3, n16.I(1026676182, new eo2() { // from class: u01
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z10;
                    boolean z11;
                    int i10;
                    jq1 jq1Var2;
                    float f;
                    boolean z12;
                    float f2;
                    float f3;
                    qa4 qa4Var2;
                    char c;
                    String str;
                    boolean z13;
                    nh2 nh2Var;
                    Object obj3;
                    boolean z14;
                    int ordinal2;
                    Object obj4;
                    final int i11;
                    boolean z15;
                    Object obj5;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    boolean z16 = true;
                    if ((intValue & 3) != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue & 1, z10)) {
                        qa4 qa4Var3 = qa4Var;
                        int i12 = w01.a[((f25) qa4Var3.getValue()).ordinal()];
                        x64 x64Var = x64.a;
                        boolean z17 = z;
                        boolean z18 = z2;
                        final es7 es7Var = F;
                        Object obj6 = ox0.a;
                        Throwable th = null;
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    xq2Var2.b0(1255020778);
                                    List<vr4> c0 = hf.c0(new vr4(null, yh2.O(xq2Var2, R.string.use_global_preference)), new vr4(p66.TOP, yh2.O(xq2Var2, R.string.dual_screen_vertical_alignment_option_top)), new vr4(p66.CENTER, yh2.O(xq2Var2, R.string.dual_screen_vertical_alignment_option_center)), new vr4(p66.BOTTOM, yh2.O(xq2Var2, R.string.dual_screen_vertical_alignment_option_bottom)));
                                    x01.d(yh2.O(xq2Var2, R.string.dual_screen_vertical_alignment_internal_label), xq2Var2, 0);
                                    xq2Var2.b0(-1206422972);
                                    Iterator it = c0.iterator();
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = -1;
                                        if (it.hasNext()) {
                                            Object next = it.next();
                                            int i15 = i13 + 1;
                                            if (i13 >= 0) {
                                                vr4 vr4Var = (vr4) next;
                                                final p66 p66Var3 = (p66) vr4Var.A;
                                                String str2 = (String) vr4Var.B;
                                                final p66 p66Var4 = p66Var;
                                                if (p66Var3 == p66Var4) {
                                                    z15 = z16;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (i13 == 0) {
                                                    xq2Var2.b0(270296167);
                                                    Object f4 = x01.f(xq2Var2);
                                                    xq2Var2.p(false);
                                                    obj5 = f4;
                                                } else {
                                                    xq2Var2.b0(-210728118);
                                                    xq2Var2.p(false);
                                                    obj5 = th;
                                                }
                                                final qn2 qn2Var10 = qn2Var8;
                                                boolean f5 = xq2Var2.f(qn2Var10);
                                                if (p66Var3 != null) {
                                                    i14 = p66Var3.ordinal();
                                                }
                                                boolean d = f5 | xq2Var2.d(i14);
                                                Object P4 = xq2Var2.P();
                                                if (d || P4 == obj6) {
                                                    P4 = new on2() { // from class: o01
                                                        @Override // defpackage.on2
                                                        public final Object c() {
                                                            int i16 = r3;
                                                            jg7 jg7Var = jg7.a;
                                                            p66 p66Var5 = p66Var3;
                                                            qn2 qn2Var11 = qn2Var10;
                                                            switch (i16) {
                                                                case 0:
                                                                    qn2Var11.g(p66Var5);
                                                                    return jg7Var;
                                                                default:
                                                                    qn2Var11.g(p66Var5);
                                                                    return jg7Var;
                                                            }
                                                        }
                                                    };
                                                    xq2Var2.l0(P4);
                                                }
                                                xq2 xq2Var3 = xq2Var2;
                                                Object obj7 = obj6;
                                                boolean z19 = z15;
                                                x01.b(str2, null, null, z19, obj5, false, (on2) P4, n16.I(1341627946, new eo2() { // from class: p01
                                                    @Override // defpackage.eo2
                                                    public final Object o(Object obj8, Object obj9) {
                                                        boolean z20;
                                                        boolean z21;
                                                        int i16 = r4;
                                                        jg7 jg7Var = jg7.a;
                                                        x64 x64Var2 = x64.a;
                                                        es7 es7Var2 = es7Var;
                                                        p66 p66Var5 = p66Var4;
                                                        p66 p66Var6 = p66Var3;
                                                        switch (i16) {
                                                            case 0:
                                                                px0 px0Var3 = (px0) obj8;
                                                                int intValue2 = ((Integer) obj9).intValue();
                                                                if ((intValue2 & 3) != 2) {
                                                                    z20 = true;
                                                                } else {
                                                                    z20 = false;
                                                                }
                                                                xq2 xq2Var4 = (xq2) px0Var3;
                                                                if (xq2Var4.S(1 & intValue2, z20)) {
                                                                    if (p66Var6 == p66Var5) {
                                                                        xq2Var4.b0(-527453180);
                                                                        i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var2.l, xq2Var4, 432, 0);
                                                                    } else {
                                                                        xq2Var4.b0(-527372456);
                                                                    }
                                                                    xq2Var4.p(false);
                                                                } else {
                                                                    xq2Var4.V();
                                                                }
                                                                return jg7Var;
                                                            default:
                                                                px0 px0Var4 = (px0) obj8;
                                                                int intValue3 = ((Integer) obj9).intValue();
                                                                if ((intValue3 & 3) != 2) {
                                                                    z21 = true;
                                                                } else {
                                                                    z21 = false;
                                                                }
                                                                xq2 xq2Var5 = (xq2) px0Var4;
                                                                if (xq2Var5.S(1 & intValue3, z21)) {
                                                                    if (p66Var6 == p66Var5) {
                                                                        xq2Var5.b0(1301030070);
                                                                        i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var2.l, xq2Var5, 432, 0);
                                                                    } else {
                                                                        xq2Var5.b0(1301110794);
                                                                    }
                                                                    xq2Var5.p(false);
                                                                } else {
                                                                    xq2Var5.V();
                                                                }
                                                                return jg7Var;
                                                        }
                                                    }
                                                }, xq2Var2), xq2Var3, 12582912, 38);
                                                th = null;
                                                es7Var = es7Var;
                                                xq2Var2 = xq2Var3;
                                                i13 = i15;
                                                obj6 = obj7;
                                                z16 = true;
                                            } else {
                                                Throwable th2 = th;
                                                hf.q0();
                                                throw th2;
                                            }
                                        } else {
                                            final es7 es7Var2 = es7Var;
                                            Object obj8 = obj6;
                                            xq2Var2.p(false);
                                            gi2.h(xq2Var2, dj6.e(x64Var, 6.0f));
                                            x01.d(yh2.O(xq2Var2, R.string.dual_screen_vertical_alignment_external_label), xq2Var2, 0);
                                            for (vr4 vr4Var2 : c0) {
                                                final p66 p66Var5 = (p66) vr4Var2.A;
                                                String str3 = (String) vr4Var2.B;
                                                final p66 p66Var6 = p66Var2;
                                                if (p66Var5 == p66Var6) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                final qn2 qn2Var11 = qn2Var9;
                                                boolean f6 = xq2Var2.f(qn2Var11);
                                                if (p66Var5 == null) {
                                                    ordinal2 = -1;
                                                } else {
                                                    ordinal2 = p66Var5.ordinal();
                                                }
                                                boolean d2 = f6 | xq2Var2.d(ordinal2);
                                                Object P5 = xq2Var2.P();
                                                if (!d2) {
                                                    obj4 = obj8;
                                                    if (P5 != obj4) {
                                                        i11 = 1;
                                                        obj8 = obj4;
                                                        xq2 xq2Var4 = xq2Var2;
                                                        x01.b(str3, null, null, z14, null, false, (on2) P5, n16.I(1264990904, new eo2() { // from class: p01
                                                            @Override // defpackage.eo2
                                                            public final Object o(Object obj82, Object obj9) {
                                                                boolean z20;
                                                                boolean z21;
                                                                int i16 = i11;
                                                                jg7 jg7Var = jg7.a;
                                                                x64 x64Var2 = x64.a;
                                                                es7 es7Var22 = es7Var2;
                                                                p66 p66Var52 = p66Var6;
                                                                p66 p66Var62 = p66Var5;
                                                                switch (i16) {
                                                                    case 0:
                                                                        px0 px0Var3 = (px0) obj82;
                                                                        int intValue2 = ((Integer) obj9).intValue();
                                                                        if ((intValue2 & 3) != 2) {
                                                                            z20 = true;
                                                                        } else {
                                                                            z20 = false;
                                                                        }
                                                                        xq2 xq2Var42 = (xq2) px0Var3;
                                                                        if (xq2Var42.S(1 & intValue2, z20)) {
                                                                            if (p66Var62 == p66Var52) {
                                                                                xq2Var42.b0(-527453180);
                                                                                i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var22.l, xq2Var42, 432, 0);
                                                                            } else {
                                                                                xq2Var42.b0(-527372456);
                                                                            }
                                                                            xq2Var42.p(false);
                                                                        } else {
                                                                            xq2Var42.V();
                                                                        }
                                                                        return jg7Var;
                                                                    default:
                                                                        px0 px0Var4 = (px0) obj82;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if ((intValue3 & 3) != 2) {
                                                                            z21 = true;
                                                                        } else {
                                                                            z21 = false;
                                                                        }
                                                                        xq2 xq2Var5 = (xq2) px0Var4;
                                                                        if (xq2Var5.S(1 & intValue3, z21)) {
                                                                            if (p66Var62 == p66Var52) {
                                                                                xq2Var5.b0(1301030070);
                                                                                i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var22.l, xq2Var5, 432, 0);
                                                                            } else {
                                                                                xq2Var5.b0(1301110794);
                                                                            }
                                                                            xq2Var5.p(false);
                                                                        } else {
                                                                            xq2Var5.V();
                                                                        }
                                                                        return jg7Var;
                                                                }
                                                            }
                                                        }, xq2Var2), xq2Var4, 12582912, 54);
                                                        xq2Var2 = xq2Var4;
                                                    }
                                                } else {
                                                    obj4 = obj8;
                                                }
                                                i11 = 1;
                                                P5 = new on2() { // from class: o01
                                                    @Override // defpackage.on2
                                                    public final Object c() {
                                                        int i16 = r3;
                                                        jg7 jg7Var = jg7.a;
                                                        p66 p66Var52 = p66Var5;
                                                        qn2 qn2Var112 = qn2Var11;
                                                        switch (i16) {
                                                            case 0:
                                                                qn2Var112.g(p66Var52);
                                                                return jg7Var;
                                                            default:
                                                                qn2Var112.g(p66Var52);
                                                                return jg7Var;
                                                        }
                                                    }
                                                };
                                                xq2Var2.l0(P5);
                                                obj8 = obj4;
                                                xq2 xq2Var42 = xq2Var2;
                                                x01.b(str3, null, null, z14, null, false, (on2) P5, n16.I(1264990904, new eo2() { // from class: p01
                                                    @Override // defpackage.eo2
                                                    public final Object o(Object obj82, Object obj9) {
                                                        boolean z20;
                                                        boolean z21;
                                                        int i16 = i11;
                                                        jg7 jg7Var = jg7.a;
                                                        x64 x64Var2 = x64.a;
                                                        es7 es7Var22 = es7Var2;
                                                        p66 p66Var52 = p66Var6;
                                                        p66 p66Var62 = p66Var5;
                                                        switch (i16) {
                                                            case 0:
                                                                px0 px0Var3 = (px0) obj82;
                                                                int intValue2 = ((Integer) obj9).intValue();
                                                                if ((intValue2 & 3) != 2) {
                                                                    z20 = true;
                                                                } else {
                                                                    z20 = false;
                                                                }
                                                                xq2 xq2Var422 = (xq2) px0Var3;
                                                                if (xq2Var422.S(1 & intValue2, z20)) {
                                                                    if (p66Var62 == p66Var52) {
                                                                        xq2Var422.b0(-527453180);
                                                                        i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var22.l, xq2Var422, 432, 0);
                                                                    } else {
                                                                        xq2Var422.b0(-527372456);
                                                                    }
                                                                    xq2Var422.p(false);
                                                                } else {
                                                                    xq2Var422.V();
                                                                }
                                                                return jg7Var;
                                                            default:
                                                                px0 px0Var4 = (px0) obj82;
                                                                int intValue3 = ((Integer) obj9).intValue();
                                                                if ((intValue3 & 3) != 2) {
                                                                    z21 = true;
                                                                } else {
                                                                    z21 = false;
                                                                }
                                                                xq2 xq2Var5 = (xq2) px0Var4;
                                                                if (xq2Var5.S(1 & intValue3, z21)) {
                                                                    if (p66Var62 == p66Var52) {
                                                                        xq2Var5.b0(1301030070);
                                                                        i13.a(jw2.r(), null, dj6.i(x64Var2, 20.0f), es7Var22.l, xq2Var5, 432, 0);
                                                                    } else {
                                                                        xq2Var5.b0(1301110794);
                                                                    }
                                                                    xq2Var5.p(false);
                                                                } else {
                                                                    xq2Var5.V();
                                                                }
                                                                return jg7Var;
                                                        }
                                                    }
                                                }, xq2Var2), xq2Var42, 12582912, 54);
                                                xq2Var2 = xq2Var42;
                                            }
                                            xq2Var2.p(false);
                                        }
                                    }
                                } else {
                                    throw xg6.f(xq2Var2, -1206658035, false);
                                }
                            } else {
                                xq2Var2.b0(1253949759);
                                if (!z18 && !z17) {
                                    xq2Var2.b0(1253985936);
                                    x01.d(yh2.O(xq2Var2, R.string.dual_screen_fill_area_requires_integer), xq2Var2, 0);
                                    xq2Var2.p(false);
                                } else {
                                    xq2Var2.b0(1254105100);
                                    xq2Var2.p(false);
                                }
                                x01.d(yh2.O(xq2Var2, R.string.dual_screen_fill_section_internal), xq2Var2, 0);
                                x01.e(yh2.O(xq2Var2, R.string.dual_screen_fill_height_label), z3, qn2Var4, true, false, xq2Var2, 3072, 16);
                                x01.e(yh2.O(xq2Var2, R.string.dual_screen_fill_width_label), z4, qn2Var5, false, false, xq2Var2, 0, 24);
                                gi2.h(xq2Var2, dj6.e(x64Var, 6.0f));
                                x01.d(yh2.O(xq2Var2, R.string.dual_screen_fill_section_external), xq2Var2, 0);
                                x01.e(yh2.O(xq2Var2, R.string.dual_screen_fill_height_label), z5, qn2Var6, false, false, xq2Var2, 0, 24);
                                x01.e(yh2.O(xq2Var2, R.string.dual_screen_fill_width_label), z6, qn2Var7, false, false, xq2Var2, 0, 24);
                                xq2Var2.p(false);
                            }
                        } else {
                            xq2Var2.b0(1248263801);
                            jq1 jq1Var3 = jq1.OFF;
                            jq1 jq1Var4 = jq1.this;
                            if (jq1Var4 != jq1Var3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a74 g = u24.g(dj6.c(x64Var, 1.0f), z16.b(14.0f));
                            long j = kt0.d;
                            a74 O = ge7.O(ak7.I(vy7.L(g, kt0.c(0.06f, j), u24.m), 1.0f, kt0.c(0.12f, j), z16.b(14.0f)), 14.0f);
                            e34 d3 = h70.d(d90.L, false);
                            int hashCode = Long.hashCode(xq2Var2.T);
                            xv4 l2 = xq2Var2.l();
                            a74 E = l.E(xq2Var2, O);
                            jx0.i.getClass();
                            iy0 iy0Var = ix0.b;
                            xq2Var2.f0();
                            if (xq2Var2.S) {
                                xq2Var2.k(iy0Var);
                            } else {
                                xq2Var2.o0();
                            }
                            pn pnVar = ix0.f;
                            yh2.K(xq2Var2, pnVar, d3);
                            pn pnVar2 = ix0.e;
                            yh2.K(xq2Var2, pnVar2, l2);
                            Integer valueOf = Integer.valueOf(hashCode);
                            pn pnVar3 = ix0.g;
                            yh2.K(xq2Var2, pnVar3, valueOf);
                            ne neVar = ix0.h;
                            yh2.F(xq2Var2, neVar);
                            pn pnVar4 = ix0.d;
                            yh2.K(xq2Var2, pnVar4, E);
                            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                            int hashCode2 = Long.hashCode(xq2Var2.T);
                            xv4 l3 = xq2Var2.l();
                            a74 E2 = l.E(xq2Var2, x64Var);
                            xq2Var2.f0();
                            if (xq2Var2.S) {
                                xq2Var2.k(iy0Var);
                            } else {
                                xq2Var2.o0();
                            }
                            yh2.K(xq2Var2, pnVar, a2);
                            yh2.K(xq2Var2, pnVar2, l3);
                            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                            yh2.K(xq2Var2, pnVar4, E2);
                            l26 a3 = k26.a(ju.a, d90.i0, xq2Var2, 48);
                            int hashCode3 = Long.hashCode(xq2Var2.T);
                            xv4 l4 = xq2Var2.l();
                            a74 E3 = l.E(xq2Var2, x64Var);
                            xq2Var2.f0();
                            if (xq2Var2.S) {
                                xq2Var2.k(iy0Var);
                            } else {
                                xq2Var2.o0();
                            }
                            yh2.K(xq2Var2, pnVar, a3);
                            yh2.K(xq2Var2, pnVar2, l4);
                            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                            yh2.K(xq2Var2, pnVar4, E3);
                            e33 F2 = gi2.F();
                            long j2 = es7.p;
                            i13.a(F2, null, dj6.i(x64Var, 17.0f), j2, xq2Var2, 3504, 0);
                            gi2.h(xq2Var2, dj6.l(x64Var, 7.0f));
                            Object obj9 = obj6;
                            x37.b(yh2.O(xq2Var2, R.string.dual_screen_info_title), null, j2, hi2.E(13), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130962);
                            xq2Var2.p(true);
                            gi2.h(xq2Var2, dj6.e(x64Var, 6.0f));
                            x37.b(yh2.O(xq2Var2, R.string.dual_screen_info_desc), null, kt0.c(0.75f, j), hi2.E(11), null, null, 0L, null, hi2.E(15), 0, false, 0, 0, null, null, xq2Var2, 3456, 6, 130034);
                            xq2 xq2Var5 = xq2Var2;
                            xq2Var5.p(true);
                            xq2Var5.p(true);
                            gi2.h(xq2Var5, dj6.e(x64Var, 8.0f));
                            if (!z11) {
                                xq2Var5.b0(1249806485);
                                i10 = 0;
                                x01.d(yh2.O(xq2Var5, R.string.dual_screen_presets_disabled_hint), xq2Var5, 0);
                                xq2Var5.p(false);
                            } else {
                                i10 = 0;
                                xq2Var5.b0(1249920844);
                                xq2Var5.p(false);
                            }
                            x01.d(yh2.O(xq2Var5, R.string.dual_screen_presets), xq2Var5, i10);
                            String O2 = yh2.O(xq2Var5, R.string.dual_screen_preset_off);
                            e33 e33Var = lb4.n;
                            if (e33Var != null) {
                                jq1Var2 = jq1Var4;
                            } else {
                                d33 d33Var = new d33("Filled.Block", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i16 = el7.a;
                                jq1Var2 = jq1Var4;
                                cn6 cn6Var = new cn6(kt0.b);
                                ww2 ww2Var = new ww2(1, (byte) 0);
                                ww2Var.o(12.0f, 2.0f);
                                ww2Var.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                ww2Var.q(4.48f, 10.0f, 10.0f, 10.0f);
                                ww2Var.q(10.0f, -4.48f, 10.0f, -10.0f);
                                ww2Var.p(17.52f, 2.0f, 12.0f, 2.0f);
                                ww2Var.g();
                                ww2Var.o(4.0f, 12.0f);
                                ww2Var.i(RecyclerView.B1, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
                                ww2Var.i(1.85f, RecyclerView.B1, 3.55f, 0.63f, 4.9f, 1.69f);
                                ww2Var.m(5.69f, 16.9f);
                                ww2Var.h(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
                                ww2Var.g();
                                ww2Var.o(12.0f, 20.0f);
                                ww2Var.i(-1.85f, RecyclerView.B1, -3.55f, -0.63f, -4.9f, -1.69f);
                                ww2Var.m(18.31f, 7.1f);
                                ww2Var.h(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
                                ww2Var.i(RecyclerView.B1, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
                                ww2Var.g();
                                d33.a(d33Var, ww2Var.b, 0, cn6Var);
                                e33Var = d33Var.b();
                                lb4.n = e33Var;
                            }
                            oc7 oc7Var = new oc7(jq1Var3, O2, e33Var);
                            oc7 oc7Var2 = new oc7(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, yh2.O(xq2Var5, R.string.dual_screen_preset_internal_top_external_bottom), nj2.v());
                            jq1 jq1Var5 = jq1.INTERNAL_BOTTOM_EXTERNAL_TOP;
                            String O3 = yh2.O(xq2Var5, R.string.dual_screen_preset_internal_bottom_external_top);
                            e33 e33Var2 = uj2.g;
                            if (e33Var2 != null) {
                                f = 3.0f;
                            } else {
                                d33 d33Var2 = new d33("Filled.Smartphone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i17 = el7.a;
                                cn6 cn6Var2 = new cn6(kt0.b);
                                ww2 ww2Var2 = new ww2(1, (byte) 0);
                                ww2Var2.o(17.0f, 1.01f);
                                ww2Var2.m(7.0f, 1.0f);
                                ww2Var2.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                                ww2Var2.u(18.0f);
                                ww2Var2.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                ww2Var2.l(10.0f);
                                ww2Var2.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                f = 3.0f;
                                ww2Var2.t(3.0f);
                                ww2Var2.i(RecyclerView.B1, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                                ww2Var2.g();
                                ww2Var2.o(17.0f, 19.0f);
                                ww2Var2.k(7.0f);
                                ww2Var2.t(5.0f);
                                ww2Var2.l(10.0f);
                                ww2Var2.u(14.0f);
                                ww2Var2.g();
                                d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                                e33Var2 = d33Var2.b();
                                uj2.g = e33Var2;
                            }
                            List c02 = hf.c0(oc7Var, oc7Var2, new oc7(jq1Var5, O3, e33Var2));
                            xq2Var5.b0(-1206575821);
                            Iterator it2 = c02.iterator();
                            int i18 = 0;
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                int i19 = i18 + 1;
                                if (i18 >= 0) {
                                    oc7 oc7Var3 = (oc7) next2;
                                    jq1 jq1Var6 = (jq1) oc7Var3.A;
                                    String str4 = (String) oc7Var3.B;
                                    e33 e33Var3 = (e33) oc7Var3.L;
                                    int i20 = w01.b[jq1Var6.ordinal()];
                                    if (i20 != 1) {
                                        c = 2;
                                        if (i20 != 2) {
                                            if (i20 == 3) {
                                                str = "Основной экран смартфона — Нижний (тач в руках), Внешний монитор — Верхний (игра)";
                                            } else {
                                                i.d();
                                                return null;
                                            }
                                        } else {
                                            str = "Основной экран смартфона — Верхний (игра), Внешний монитор — Нижний (тач)";
                                        }
                                    } else {
                                        c = 2;
                                        str = "Оба экрана Nintendo DS выводятся на основном дисплее устройства";
                                    }
                                    jq1 jq1Var7 = jq1Var2;
                                    if (jq1Var6 == jq1Var7) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (i18 == 0) {
                                        xq2Var5.b0(-864326629);
                                        nh2 f7 = x01.f(xq2Var5);
                                        xq2Var5.p(false);
                                        nh2Var = f7;
                                    } else {
                                        xq2Var5.b0(-1024296426);
                                        xq2Var5.p(false);
                                        nh2Var = null;
                                    }
                                    qn2 qn2Var12 = qn2Var;
                                    boolean f8 = xq2Var5.f(qn2Var12) | xq2Var5.d(jq1Var6.ordinal());
                                    Object P6 = xq2Var5.P();
                                    if (!f8) {
                                        obj3 = obj9;
                                        if (P6 != obj3) {
                                            xq2 xq2Var6 = xq2Var5;
                                            x01.b(str4, str, e33Var3, z13, nh2Var, false, (on2) P6, n16.I(-2127705314, new x3(jq1Var6, jq1Var7, es7Var, 10), xq2Var5), xq2Var6, 12582912, 32);
                                            jq1Var2 = jq1Var7;
                                            f = 3.0f;
                                            i18 = i19;
                                            xq2Var5 = xq2Var6;
                                            it2 = it2;
                                            obj9 = obj3;
                                        }
                                    } else {
                                        obj3 = obj9;
                                    }
                                    P6 = new q6(19, qn2Var12, jq1Var6);
                                    xq2Var5.l0(P6);
                                    xq2 xq2Var62 = xq2Var5;
                                    x01.b(str4, str, e33Var3, z13, nh2Var, false, (on2) P6, n16.I(-2127705314, new x3(jq1Var6, jq1Var7, es7Var, 10), xq2Var5), xq2Var62, 12582912, 32);
                                    jq1Var2 = jq1Var7;
                                    f = 3.0f;
                                    i18 = i19;
                                    xq2Var5 = xq2Var62;
                                    it2 = it2;
                                    obj9 = obj3;
                                } else {
                                    hf.q0();
                                    throw null;
                                }
                            }
                            float f9 = f;
                            Object obj10 = obj9;
                            xq2Var5.p(false);
                            gi2.h(xq2Var5, dj6.e(x64Var, 8.0f));
                            boolean z20 = z11;
                            x01.e(yh2.O(xq2Var5, R.string.keep_ds_ratio), z17, qn2Var2, false, z20, xq2Var5, 0, 8);
                            x01.e(yh2.O(xq2Var5, R.string.dual_screen_integer_scale), z18, qn2Var3, false, z20, xq2Var5, 0, 8);
                            gi2.h(xq2Var5, dj6.e(x64Var, 8.0f));
                            if (z20 && (z17 || z18)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String O4 = yh2.O(xq2Var5, R.string.dual_screen_fill_area_button);
                            e33 e33Var4 = q60.o;
                            if (e33Var4 != null) {
                                f3 = 12.0f;
                                f2 = 2.0f;
                            } else {
                                d33 d33Var3 = new d33("Filled.FitScreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i21 = el7.a;
                                cn6 cn6Var3 = new cn6(kt0.b);
                                ww2 ww2Var3 = new ww2(1, (byte) 0);
                                ww2Var3.o(17.0f, 4.0f);
                                ww2Var3.l(f9);
                                ww2Var3.i(1.1f, RecyclerView.B1, 2.0f, 0.9f, 2.0f, 2.0f);
                                f2 = 2.0f;
                                ww2Var3.u(2.0f);
                                ww2Var3.l(-2.0f);
                                ww2Var3.m(20.0f, 6.0f);
                                ww2Var3.l(-3.0f);
                                ww2Var3.m(17.0f, 4.0f);
                                ww2Var3.g();
                                ww2Var3.o(4.0f, 8.0f);
                                ww2Var3.m(4.0f, 6.0f);
                                ww2Var3.l(f9);
                                ww2Var3.m(7.0f, 4.0f);
                                ww2Var3.m(4.0f, 4.0f);
                                ww2Var3.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                                ww2Var3.u(2.0f);
                                ww2Var3.l(2.0f);
                                ww2Var3.g();
                                ww2Var3.o(20.0f, 16.0f);
                                ww2Var3.u(2.0f);
                                ww2Var3.l(-3.0f);
                                ww2Var3.u(2.0f);
                                ww2Var3.l(f9);
                                ww2Var3.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                ww2Var3.u(-2.0f);
                                ww2Var3.l(-2.0f);
                                ww2Var3.g();
                                ww2Var3.o(7.0f, 18.0f);
                                ww2Var3.m(4.0f, 18.0f);
                                ww2Var3.u(-2.0f);
                                ww2Var3.m(2.0f, 16.0f);
                                ww2Var3.u(2.0f);
                                ww2Var3.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                ww2Var3.l(f9);
                                ww2Var3.u(-2.0f);
                                ww2Var3.g();
                                ww2Var3.o(18.0f, 8.0f);
                                ww2Var3.m(6.0f, 8.0f);
                                ww2Var3.u(8.0f);
                                f3 = 12.0f;
                                ww2Var3.l(12.0f);
                                ww2Var3.m(18.0f, 8.0f);
                                ww2Var3.g();
                                d33.a(d33Var3, ww2Var3.b, 0, cn6Var3);
                                e33Var4 = d33Var3.b();
                                q60.o = e33Var4;
                            }
                            Object P7 = xq2Var5.P();
                            if (P7 == obj10) {
                                qa4Var2 = qa4Var3;
                                P7 = new f4(qa4Var2, 14);
                                xq2Var5.l0(P7);
                            } else {
                                qa4Var2 = qa4Var3;
                            }
                            qa4 qa4Var4 = qa4Var2;
                            xq2 xq2Var7 = xq2Var5;
                            boolean z21 = z12;
                            float f10 = f2;
                            x01.b(O4, "Настройка заполнения пространства по ширине и высоте для обоих экранов", e33Var4, false, null, z21, (on2) P7, vy7.A, xq2Var7, 14155824, 24);
                            String O5 = yh2.O(xq2Var7, R.string.dual_screen_vertical_alignment_button);
                            e33 e33Var5 = mb3.D;
                            if (e33Var5 == null) {
                                d33 d33Var4 = new d33("Filled.AspectRatio", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i22 = el7.a;
                                cn6 cn6Var4 = new cn6(kt0.b);
                                ww2 ww2Var4 = new ww2(1, (byte) 0);
                                ww2Var4.o(19.0f, f3);
                                ww2Var4.l(-2.0f);
                                ww2Var4.u(f9);
                                ww2Var4.l(-3.0f);
                                ww2Var4.u(f10);
                                ww2Var4.l(5.0f);
                                ww2Var4.u(-5.0f);
                                ww2Var4.g();
                                ww2Var4.o(7.0f, 9.0f);
                                ww2Var4.l(f9);
                                ww2Var4.m(10.0f, 7.0f);
                                ww2Var4.m(5.0f, 7.0f);
                                ww2Var4.u(5.0f);
                                ww2Var4.l(f10);
                                ww2Var4.m(7.0f, 9.0f);
                                ww2Var4.g();
                                ww2Var4.o(21.0f, f9);
                                ww2Var4.m(f9, f9);
                                ww2Var4.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                                ww2Var4.u(14.0f);
                                ww2Var4.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                ww2Var4.l(18.0f);
                                ww2Var4.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                ww2Var4.m(23.0f, 5.0f);
                                ww2Var4.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                ww2Var4.g();
                                ww2Var4.o(21.0f, 19.01f);
                                ww2Var4.m(f9, 19.01f);
                                ww2Var4.m(f9, 4.99f);
                                ww2Var4.l(18.0f);
                                ww2Var4.u(14.02f);
                                ww2Var4.g();
                                d33.a(d33Var4, ww2Var4.b, 0, cn6Var4);
                                e33Var5 = d33Var4.b();
                                mb3.D = e33Var5;
                            }
                            Object P8 = xq2Var7.P();
                            if (P8 == obj10) {
                                P8 = new f4(qa4Var4, 15);
                                xq2Var7.l0(P8);
                            }
                            x01.b(O5, "Точное позиционирование и выравнивание кадров (сверху, по центру, снизу)", e33Var5, false, null, z21, (on2) P8, vy7.B, xq2Var7, 14155824, 24);
                            xq2Var7.p(false);
                        }
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(qn2Var, z, qn2Var2, z2, qn2Var3, z3, qn2Var4, z4, qn2Var5, z5, qn2Var6, z6, qn2Var7, p66Var, qn2Var8, p66Var2, qn2Var9, on2Var, i) { // from class: v01
                public final /* synthetic */ qn2 B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ qn2 R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ qn2 Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ qn2 d0;
                public final /* synthetic */ boolean e0;
                public final /* synthetic */ qn2 f0;
                public final /* synthetic */ boolean g0;
                public final /* synthetic */ qn2 h0;
                public final /* synthetic */ boolean i0;
                public final /* synthetic */ qn2 j0;
                public final /* synthetic */ p66 k0;
                public final /* synthetic */ qn2 l0;
                public final /* synthetic */ p66 m0;
                public final /* synthetic */ qn2 n0;
                public final /* synthetic */ on2 o0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    x01.a(jq1.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, String str2, e33 e33Var, boolean z, nh2 nh2Var, boolean z2, final on2 on2Var, final eo2 eo2Var, px0 px0Var, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        int i5;
        e33 e33Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        nh2 nh2Var2;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        boolean z4;
        xq2 xq2Var;
        final boolean z5;
        final String str4;
        final e33 e33Var3;
        final nh2 nh2Var3;
        final boolean z6;
        cf5 t;
        String str5;
        boolean z7;
        nh2 nh2Var4;
        boolean z8;
        float f;
        long j;
        float f2;
        pn pnVar;
        pn pnVar2;
        boolean z9;
        nh2 nh2Var5;
        int i14;
        ne neVar;
        pn pnVar3;
        oj2 oj2Var;
        String str6;
        long c;
        int i15;
        int i16;
        int i17;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(173738977);
        if ((i & 6) == 0) {
            if (xq2Var2.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i3 = i17 | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str2;
            if (xq2Var2.f(str3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
            } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                e33Var2 = e33Var;
                if (xq2Var2.f(e33Var2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
                i7 = i2 & 8;
                if (i7 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (xq2Var2.g(z)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i3 |= i8;
                    i9 = i2 & 16;
                    if (i9 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        nh2Var2 = nh2Var;
                        if (xq2Var2.f(nh2Var2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i3 |= i10;
                        i11 = i2 & 32;
                        if (i11 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            z3 = z2;
                            if (xq2Var2.g(z3)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i3 |= i12;
                            if ((i & 1572864) == 0) {
                                if (xq2Var2.h(on2Var)) {
                                    i16 = 1048576;
                                } else {
                                    i16 = 524288;
                                }
                                i3 |= i16;
                            }
                            if ((i & 12582912) == 0) {
                                if (xq2Var2.h(eo2Var)) {
                                    i15 = 8388608;
                                } else {
                                    i15 = Compress.MAXWINSIZE;
                                }
                                i3 |= i15;
                            }
                            i13 = i3;
                            if ((i13 & 4793491) == 4793490) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!xq2Var2.S(i13 & 1, z4)) {
                                e33 e33Var4 = null;
                                if (i18 != 0) {
                                    str5 = null;
                                } else {
                                    str5 = str3;
                                }
                                if (i5 == 0) {
                                    e33Var4 = e33Var2;
                                }
                                if (i7 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z;
                                }
                                if (i9 != 0) {
                                    nh2Var4 = null;
                                } else {
                                    nh2Var4 = nh2Var2;
                                }
                                if (i11 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z3;
                                }
                                es7 F = bl2.F(xq2Var2);
                                Object P = xq2Var2.P();
                                if (P == ox0.a) {
                                    P = i61.f(xq2Var2);
                                }
                                r94 r94Var = (r94) P;
                                qa4 a2 = bw7.a(r94Var, xq2Var2, 6);
                                y16 b2 = z16.b(12.0f);
                                d40 d40Var = d90.i0;
                                x64 x64Var = x64.a;
                                a74 g = u24.g(dj6.f(dj6.c(x64Var, 1.0f), 46.0f, RecyclerView.B1, 2), b2);
                                if (z8) {
                                    f = 1.0f;
                                } else {
                                    f = 0.4f;
                                }
                                a74 j2 = jw2.j(g, f);
                                if (((Boolean) a2.getValue()).booleanValue()) {
                                    j = kt0.d;
                                    f2 = 0.16f;
                                } else if (z7) {
                                    j = kt0.d;
                                    f2 = 0.08f;
                                } else {
                                    j = kt0.d;
                                    f2 = 0.045f;
                                }
                                a74 L = vy7.L(j2, kt0.c(f2, j), u24.m);
                                if (((Boolean) a2.getValue()).booleanValue()) {
                                    L = ak7.I(L, 2.0f, F.j, b2);
                                } else if (z7) {
                                    L = ak7.I(L, 1.0f, kt0.c(0.22f, kt0.d), b2);
                                }
                                if (nh2Var4 != null) {
                                    L = ak7.S(L, nh2Var4);
                                }
                                boolean z10 = z8;
                                a74 P2 = ge7.P(mb3.t(L, r94Var, null, z8, null, on2Var, 24), 14.0f, 10.0f);
                                l26 a3 = k26.a(ju.a, d40Var, xq2Var2, 48);
                                int hashCode = Long.hashCode(xq2Var2.T);
                                xv4 l = xq2Var2.l();
                                a74 E = l.E(xq2Var2, P2);
                                jx0.i.getClass();
                                iy0 iy0Var = ix0.b;
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var);
                                } else {
                                    xq2Var2.o0();
                                }
                                pn pnVar4 = ix0.f;
                                yh2.K(xq2Var2, pnVar4, a3);
                                pn pnVar5 = ix0.e;
                                yh2.K(xq2Var2, pnVar5, l);
                                Integer valueOf = Integer.valueOf(hashCode);
                                pn pnVar6 = ix0.g;
                                yh2.K(xq2Var2, pnVar6, valueOf);
                                ne neVar2 = ix0.h;
                                yh2.F(xq2Var2, neVar2);
                                pn pnVar7 = ix0.d;
                                yh2.K(xq2Var2, pnVar7, E);
                                if (e33Var4 != null) {
                                    xq2Var2.b0(148755507);
                                    if (z7) {
                                        c = F.j;
                                    } else {
                                        c = kt0.c(0.8f, kt0.d);
                                    }
                                    pnVar = pnVar5;
                                    pnVar2 = pnVar6;
                                    z9 = z10;
                                    nh2Var5 = nh2Var4;
                                    pnVar3 = pnVar7;
                                    neVar = neVar2;
                                    i13.a(e33Var4, null, dj6.i(x64Var, 22.0f), c, xq2Var2, ((i13 >> 6) & 14) | 432, 0);
                                    gi2.h(xq2Var2, dj6.l(x64Var, 12.0f));
                                    i14 = 0;
                                    xq2Var2.p(false);
                                } else {
                                    pnVar = pnVar5;
                                    pnVar2 = pnVar6;
                                    z9 = z10;
                                    nh2Var5 = nh2Var4;
                                    i14 = 0;
                                    neVar = neVar2;
                                    pnVar3 = pnVar7;
                                    xq2Var2.b0(149041885);
                                    xq2Var2.p(false);
                                }
                                vn3 vn3Var = new vn3(1.0f, true);
                                yt0 a4 = wt0.a(ju.c, d90.k0, xq2Var2, i14);
                                int hashCode2 = Long.hashCode(xq2Var2.T);
                                xv4 l2 = xq2Var2.l();
                                a74 E2 = l.E(xq2Var2, vn3Var);
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var);
                                } else {
                                    xq2Var2.o0();
                                }
                                yh2.K(xq2Var2, pnVar4, a4);
                                yh2.K(xq2Var2, pnVar, l2);
                                i61.w(hashCode2, xq2Var2, pnVar2, xq2Var2, neVar);
                                yh2.K(xq2Var2, pnVar3, E2);
                                long j3 = kt0.d;
                                long D = hi2.D(13.5d);
                                long E3 = hi2.E(17);
                                if (z7) {
                                    oj2Var = oj2.e0;
                                } else {
                                    oj2Var = oj2.d0;
                                }
                                nh2 nh2Var6 = nh2Var5;
                                x37.b(str, null, j3, D, oj2Var, null, 0L, null, E3, 2, false, 2, 0, null, null, xq2Var2, (i13 & 14) | 3456, 3126, 119762);
                                xq2Var = xq2Var2;
                                if (str5 != null) {
                                    xq2Var.b0(-980396302);
                                    gi2.h(xq2Var, dj6.e(x64Var, 2.0f));
                                    str6 = str5;
                                    x37.b(str6, null, kt0.c(0.55f, j3), hi2.E(11), null, null, 0L, null, hi2.E(14), 0, false, 0, 0, null, null, xq2Var, ((i13 >> 3) & 14) | 3456, 6, 130034);
                                    xq2Var.p(false);
                                } else {
                                    str6 = str5;
                                    xq2Var.b0(-980130105);
                                    xq2Var.p(false);
                                }
                                xq2Var.p(true);
                                gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
                                eo2Var.o(xq2Var, Integer.valueOf((i13 >> 21) & 14));
                                xq2Var.p(true);
                                z6 = z9;
                                e33Var3 = e33Var4;
                                nh2Var3 = nh2Var6;
                                str4 = str6;
                                z5 = z7;
                            } else {
                                xq2Var = xq2Var2;
                                xq2Var.V();
                                z5 = z;
                                str4 = str3;
                                e33Var3 = e33Var2;
                                nh2Var3 = nh2Var2;
                                z6 = z3;
                            }
                            t = xq2Var.t();
                            if (t == null) {
                                t.d = new eo2() { // from class: t01
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        x01.b(str, str4, e33Var3, z5, nh2Var3, z6, on2Var, eo2Var, (px0) obj, ii2.a0(i | 1), i2);
                                        return jg7.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        z3 = z2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i13 = i3;
                        if ((i13 & 4793491) == 4793490) {
                        }
                        if (!xq2Var2.S(i13 & 1, z4)) {
                        }
                        t = xq2Var.t();
                        if (t == null) {
                        }
                    }
                    nh2Var2 = nh2Var;
                    i11 = i2 & 32;
                    if (i11 != 0) {
                    }
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i13 = i3;
                    if ((i13 & 4793491) == 4793490) {
                    }
                    if (!xq2Var2.S(i13 & 1, z4)) {
                    }
                    t = xq2Var.t();
                    if (t == null) {
                    }
                }
                i9 = i2 & 16;
                if (i9 == 0) {
                }
                nh2Var2 = nh2Var;
                i11 = i2 & 32;
                if (i11 != 0) {
                }
                z3 = z2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i13 = i3;
                if ((i13 & 4793491) == 4793490) {
                }
                if (!xq2Var2.S(i13 & 1, z4)) {
                }
                t = xq2Var.t();
                if (t == null) {
                }
            }
            e33Var2 = e33Var;
            i7 = i2 & 8;
            if (i7 != 0) {
            }
            i9 = i2 & 16;
            if (i9 == 0) {
            }
            nh2Var2 = nh2Var;
            i11 = i2 & 32;
            if (i11 != 0) {
            }
            z3 = z2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i13 = i3;
            if ((i13 & 4793491) == 4793490) {
            }
            if (!xq2Var2.S(i13 & 1, z4)) {
            }
            t = xq2Var.t();
            if (t == null) {
            }
        }
        str3 = str2;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        e33Var2 = e33Var;
        i7 = i2 & 8;
        if (i7 != 0) {
        }
        i9 = i2 & 16;
        if (i9 == 0) {
        }
        nh2Var2 = nh2Var;
        i11 = i2 & 32;
        if (i11 != 0) {
        }
        z3 = z2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i13 = i3;
        if ((i13 & 4793491) == 4793490) {
        }
        if (!xq2Var2.S(i13 & 1, z4)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final void c(String str, on2 on2Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        zv0 zv0Var2;
        xq2 xq2Var;
        boolean z2;
        boolean z3;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-902534990);
        if (xq2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (xq2Var2.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i5 & 1, z)) {
            lc2 lc2Var = dj6.c;
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(lc2Var, a, jy2Var);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new vn0(11);
                xq2Var2.l0(P);
            }
            a74 y = ge7.y(L, (qn2) P);
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = i61.f(xq2Var2);
            }
            r94 r94Var = (r94) P2;
            int i6 = i5 & 112;
            if (i6 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P3 = xq2Var2.P();
            if (z2 || P3 == vs0Var) {
                P3 = new x7(5, on2Var);
                xq2Var2.l0(P3);
            }
            a74 t = mb3.t(y, r94Var, null, false, null, (on2) P3, 28);
            if (i6 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P4 = xq2Var2.P();
            if (z3 || P4 == vs0Var) {
                P4 = new m01(1, on2Var);
                xq2Var2.l0(P4);
            }
            a74 B = u24.B(t, (qn2) P4);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, B);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, d);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            a74 j0 = nc1.j0(lc2Var, nc1.o);
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                P5 = new vn0(12);
                xq2Var2.l0(P5);
            }
            a74 y2 = ge7.y(j0, (qn2) P5);
            Object P6 = xq2Var2.P();
            if (P6 == vs0Var) {
                P6 = i61.f(xq2Var2);
            }
            r94 r94Var2 = (r94) P6;
            Object P7 = xq2Var2.P();
            if (P7 == vs0Var) {
                P7 = new c5(21);
                xq2Var2.l0(P7);
            }
            a74 t2 = mb3.t(y2, r94Var2, null, false, null, (on2) P7, 28);
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(ju.c, c40Var, xq2Var2, 0);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, t2);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a2);
            yh2.K(xq2Var2, pnVar2, l2);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            d40 d40Var = d90.i0;
            x64 x64Var = x64.a;
            a74 R = ge7.R(dj6.c(x64Var, 1.0f), 12.0f, 8.0f, 22.0f, 8.0f);
            l26 a3 = k26.a(ju.a, d40Var, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, R);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a3);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            a74 g = u24.g(dj6.i(x64Var, 38.0f), z16.a);
            Object P8 = xq2Var2.P();
            if (P8 == vs0Var) {
                P8 = new vn0(13);
                xq2Var2.l0(P8);
            }
            a74 u = mb3.u(ge7.y(g, (qn2) P8), false, null, on2Var, 15);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, u);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            e33 q = jw2.q();
            long j = kt0.d;
            i13.a(q, null, dj6.i(x64Var, 20.0f), j, xq2Var2, 3504, 0);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.l(x64Var, 10.0f));
            x37.b(str, null, j, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, 1772928 | (i5 & 14), 3120, 120722);
            xq2Var2.p(true);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), kt0.c(0.09f, j), jy2Var), xq2Var2, 6);
            gu guVar = new gu(5.0f, true, new i(1));
            a74 P9 = ge7.P(nb3.W(dj6.c(dj6.m(720.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0)), 1.0f), nb3.U(xq2Var2), true), 22.0f, 12.0f);
            yt0 a4 = wt0.a(guVar, c40Var, xq2Var2, 6);
            int hashCode5 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E5 = l.E(xq2Var2, P9);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a4);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E5);
            zv0Var2 = zv0Var;
            zv0Var2.o(xq2Var2, 6);
            xq2Var2.p(true);
            is7.a(hf.c0(new rq2(null, yh2.O(xq2Var2, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var2, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var2, R.string.pause_hint_back))), null, false, xq2Var2, 0, 6);
            xq2Var = xq2Var2;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            zv0Var2 = zv0Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new x3(str, on2Var, zv0Var2, i, 11);
        }
    }

    public static final void d(String str, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(748457454);
        if (xq2Var2.f(str)) {
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
        if (xq2Var2.S(i3 & 1, z)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            xq2Var = xq2Var2;
            x37.b(upperCase, ge7.S(x64.a, 2.0f, 8.0f, RecyclerView.B1, 2.0f, 4), kt0.c(0.45f, kt0.d), hi2.E(10), oj2.d0, qs7.c, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355888, 0, 130832);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g5(str, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final boolean z, final qn2 qn2Var, boolean z2, boolean z3, px0 px0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        boolean z6;
        final boolean z7;
        final boolean z8;
        cf5 t;
        final boolean z9;
        nh2 nh2Var;
        boolean z10;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-150145654);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i3 | i;
        if (xq2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        int i13 = i2 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            if (xq2Var.g(z4)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i12 |= i6;
            i7 = i2 & 16;
            if (i7 == 0) {
                i9 = i12 | 24576;
                z5 = z3;
            } else {
                z5 = z3;
                if (xq2Var.g(z5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i9 = i12 | i8;
            }
            boolean z11 = true;
            if ((i9 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!xq2Var.S(i9 & 1, z6)) {
                if (i13 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                if (z7) {
                    xq2Var.b0(1738920702);
                    nh2Var = f(xq2Var);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-1928007789);
                    xq2Var.p(false);
                    nh2Var = null;
                }
                nh2 nh2Var2 = nh2Var;
                if ((i9 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i9 & 112) != 32) {
                    z11 = false;
                }
                boolean z12 = z10 | z11;
                Object P = xq2Var.P();
                if (z12 || P == ox0.a) {
                    P = new q01(qn2Var, z, 0);
                    xq2Var.l0(P);
                }
                b(str, null, null, false, nh2Var2, z9, (on2) P, n16.I(831789025, new eo2() { // from class: r01
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        boolean z13;
                        px0 px0Var2 = (px0) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if ((intValue & 3) != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xq2 xq2Var2 = (xq2) px0Var2;
                        if (xq2Var2.S(intValue & 1, z13)) {
                            is7.f(z, qn2Var, null, z9, xq2Var2, 0, 4);
                        } else {
                            xq2Var2.V();
                        }
                        return jg7.a;
                    }
                }, xq2Var), xq2Var, (i9 & 14) | 12582912 | ((i9 << 3) & 458752), 14);
                z8 = z9;
            } else {
                xq2Var.V();
                z7 = z4;
                z8 = z5;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: s01
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x01.e(str, z, qn2Var, z7, z8, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z4 = z2;
        i7 = i2 & 16;
        if (i7 == 0) {
        }
        boolean z112 = true;
        if ((i9 & 9363) == 9362) {
        }
        if (!xq2Var.S(i9 & 1, z6)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final nh2 f(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new nh2();
            xq2Var.l0(P);
        }
        nh2 nh2Var = (nh2) P;
        is7.b(nh2Var, xq2Var, 6);
        return nh2Var;
    }
}
