package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx6  reason: default package */
/* loaded from: classes.dex */
public abstract class bx6 {
    public static final float a = 14.0f;
    public static final sc7 b = new sc7(100, (hr1) null, 6);
    public static final float c = 1.0f;
    public static final float d = 6.0f;
    public static final float e = 125.0f;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z, qn2 qn2Var, a74 a74Var, boolean z2, rf1 rf1Var, px0 px0Var, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        rf1 rf1Var2;
        boolean z4;
        a74 a74Var2;
        boolean z5;
        cf5 t;
        boolean z6;
        a74 a74Var3;
        int i6;
        dd ddVar;
        boolean z7;
        boolean z8;
        a74 a74Var4;
        boolean z9;
        int i7;
        int i8;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(25866825);
        if ((i & 6) == 0) {
            if (xq2Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        int i11 = i2 & 8;
        if (i11 != 0) {
            i10 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            if (xq2Var.g(z3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i10 |= i4;
            i5 = i10 | 24576;
            if ((196608 & i) != 0) {
                rf1Var2 = rf1Var;
                if (xq2Var.f(rf1Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            } else {
                rf1Var2 = rf1Var;
            }
            if ((74899 & i5) == 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!xq2Var.S(i5 & 1, z4)) {
                xq2Var.X();
                int i12 = i & 1;
                a74 a74Var5 = x64.a;
                if (i12 != 0 && !xq2Var.B()) {
                    xq2Var.V();
                    z6 = z3;
                    a74Var3 = a74Var;
                } else {
                    if (i11 != 0) {
                        z3 = true;
                    }
                    z6 = z3;
                    a74Var3 = a74Var5;
                }
                xq2Var.q();
                xq2Var.b0(1799771122);
                Object P = xq2Var.P();
                Object obj = ox0.a;
                if (P == obj) {
                    P = i61.f(xq2Var);
                }
                r94 r94Var = (r94) P;
                xq2Var.p(false);
                l55 l55Var = ky0.h;
                float e0 = ((qh1) xq2Var.j(l55Var)).e0(14.0f);
                Object P2 = xq2Var.P();
                if (P2 == obj) {
                    P2 = np2.Y(Boolean.FALSE);
                    xq2Var.l0(P2);
                }
                qa4 qa4Var = (qa4) P2;
                final float e02 = ((qh1) xq2Var.j(l55Var)).e0(e);
                boolean c2 = xq2Var.c(e0) | xq2Var.c(e02);
                Object P3 = xq2Var.P();
                if (!c2 && P3 != obj) {
                    i6 = i5;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(Boolean.FALSE, Float.valueOf((float) RecyclerView.B1));
                    linkedHashMap.put(Boolean.TRUE, Float.valueOf(e0));
                    s04 s04Var = new s04(linkedHashMap);
                    Boolean valueOf = Boolean.valueOf(z);
                    dd ddVar2 = new dd(valueOf, new r76(16), new on2() { // from class: xw6
                        @Override // defpackage.on2
                        public final Object c() {
                            return Float.valueOf(e02);
                        }
                    }, b, new k4(10));
                    ddVar2.m.setValue(s04Var);
                    hb4 hb4Var = ddVar2.e.b;
                    if (hb4Var.g()) {
                        try {
                            bd bdVar = ddVar2.n;
                            float c3 = ddVar2.d().c(valueOf);
                            if (!Float.isNaN(c3)) {
                                dd ddVar3 = bdVar.a;
                                i6 = i5;
                                ddVar3.j.i(c3);
                                ddVar3.k.i(RecyclerView.B1);
                                ddVar2.l.setValue(null);
                            } else {
                                i6 = i5;
                            }
                            ddVar2.f(valueOf);
                            hb4Var.h(null);
                        } catch (Throwable th) {
                            hb4Var.h(null);
                            throw th;
                        }
                    } else {
                        i6 = i5;
                    }
                    xq2Var.l0(ddVar2);
                    P3 = ddVar2;
                }
                Object obj2 = (dd) P3;
                int i13 = i6 >> 3;
                Object b0 = np2.b0(qn2Var, xq2Var);
                int i14 = i6 & 14;
                Object b02 = np2.b0(Boolean.valueOf(z), xq2Var);
                boolean f = xq2Var.f(obj2) | xq2Var.f(b02) | xq2Var.f(b0);
                Object P4 = xq2Var.P();
                if (!f && P4 != obj) {
                    ddVar = obj2;
                } else {
                    P4 = new kp5(obj2, b02, b0, qa4Var, null, 6);
                    ddVar = obj2;
                    xq2Var.l0(P4);
                }
                mb3.i(xq2Var, (eo2) P4, ddVar);
                Boolean valueOf2 = Boolean.valueOf(z);
                Boolean bool = (Boolean) qa4Var.getValue();
                bool.getClass();
                if (i14 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean f2 = z7 | xq2Var.f(ddVar);
                Object P5 = xq2Var.P();
                if (f2 || P5 == obj) {
                    P5 = new ax6(z, ddVar, (r41) null);
                    xq2Var.l0(P5);
                }
                mb3.j(valueOf2, bool, (eo2) P5, xq2Var);
                if (xq2Var.j(ky0.n) == kk3.Rtl) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (qn2Var != null) {
                    a74Var4 = g04.W(z, r94Var, z6, new mq5(2), qn2Var);
                } else {
                    a74Var4 = a74Var5;
                }
                if (qn2Var != null) {
                    nq6 nq6Var = u93.a;
                    a74Var5 = m64.a;
                }
                a74 d2 = a74Var3.d(a74Var5).d(a74Var4);
                lo4 lo4Var = lo4.Horizontal;
                if (z6 && qn2Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                a74 d3 = ge7.O(dj6.n(eo1.a(d2, ddVar.f, lo4Var, z9, r94Var, false, new rc(ddVar, null), z8), d90.Z, 2), 2.0f).d(new cj6(34.0f, 20.0f, 34.0f, 20.0f, false));
                e34 d4 = h70.d(d90.L, false);
                int B = ge7.B(xq2Var);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, d3);
                jx0.i.getClass();
                on2 on2Var = ix0.b;
                xq2Var.f0();
                a74 a74Var6 = a74Var3;
                if (xq2Var.S) {
                    xq2Var.k(on2Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d4);
                yh2.K(xq2Var, ix0.e, l);
                pn pnVar = ix0.g;
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                    i61.v(B, xq2Var, B, pnVar);
                }
                yh2.K(xq2Var, ix0.d, E);
                boolean booleanValue = ((Boolean) ddVar.h.getValue()).booleanValue();
                boolean f3 = xq2Var.f(ddVar);
                Object P6 = xq2Var.P();
                if (f3 || P6 == obj) {
                    P6 = new wc(ddVar, 5);
                    xq2Var.l0(P6);
                }
                b(booleanValue, z6, rf1Var2, (on2) P6, r94Var, xq2Var, (i13 & 896) | 6 | ((i6 >> 6) & 7168));
                xq2Var.p(true);
                z5 = z6;
                a74Var2 = a74Var6;
            } else {
                xq2Var.V();
                a74Var2 = a74Var;
                z5 = z3;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new jd5(z, qn2Var, a74Var2, z5, rf1Var, i, i2, 2);
                return;
            }
            return;
        }
        z3 = z2;
        i5 = i10 | 24576;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i5) == 74898) {
        }
        if (!xq2Var.S(i5 & 1, z4)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void b(final boolean z, final boolean z2, final rf1 rf1Var, final on2 on2Var, final r94 r94Var, px0 px0Var, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        float f;
        long j;
        long j2;
        boolean z5;
        long j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        vs0 vs0Var = vs0.Y;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(70908914);
        if ((i & 6) == 0) {
            if (xq2Var.f(vs0Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.g(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.f(rf1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.f(r94Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        boolean z6 = true;
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i9 & 1, z3)) {
            Object P = xq2Var.P();
            vs0 vs0Var2 = ox0.a;
            if (P == vs0Var2) {
                P = new mm6();
                xq2Var.l0(P);
            }
            mm6 mm6Var = (mm6) P;
            if ((i9 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = xq2Var.P();
            if (z4 || P2 == vs0Var2) {
                P2 = new dd1(r94Var, mm6Var, null, 2);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, r94Var);
            if (!mm6Var.isEmpty()) {
                f = d;
            } else {
                f = c;
            }
            float f2 = f;
            xq2Var.b0(-1176343362);
            if (z2) {
                if (z) {
                    j = rf1Var.b;
                } else {
                    j = rf1Var.d;
                }
            } else if (z) {
                j = rf1Var.f;
            } else {
                j = rf1Var.h;
            }
            qa4 g = i61.g(j, xq2Var, false);
            e40 e40Var = d90.Z;
            x64 x64Var = x64.a;
            a74 d2 = vs0Var.n(x64Var, e40Var).d(dj6.c);
            boolean f3 = xq2Var.f(g);
            Object P3 = xq2Var.P();
            if (f3 || P3 == vs0Var2) {
                P3 = new j4(g, 25);
                xq2Var.l0(P3);
            }
            ak7.j(d2, (qn2) P3, xq2Var, 0);
            xq2Var.b0(-66424183);
            if (z2) {
                if (z) {
                    j2 = rf1Var.a;
                } else {
                    j2 = rf1Var.c;
                }
            } else if (z) {
                j2 = rf1Var.e;
            } else {
                j2 = rf1Var.g;
            }
            qa4 g2 = i61.g(j2, xq2Var, false);
            qd1 qd1Var = (qd1) xq2Var.j(os1.a);
            float f4 = ((om1) xq2Var.j(os1.b)).A + f2;
            if (kt0.d(((kt0) g2.getValue()).a, ((ut0) xq2Var.j(vt0.a)).j()) && qd1Var != null) {
                xq2Var.b0(-674840005);
                z5 = false;
                j3 = qd1.a(((kt0) g2.getValue()).a, f4, xq2Var, 0);
                xq2Var.p(false);
            } else {
                z5 = false;
                xq2Var.b0(-674751066);
                xq2Var.p(false);
                j3 = ((kt0) g2.getValue()).a;
            }
            long j4 = j3;
            boolean z7 = z5;
            pp6 a2 = ti6.a(j4, null, xq2Var, 0, 14);
            a74 n = vs0Var.n(x64Var, d90.Y);
            if ((57344 & i9) != 16384) {
                z6 = z7;
            }
            Object P4 = xq2Var.P();
            if (z6 || P4 == vs0Var2) {
                P4 = new mn0(7, on2Var);
                xq2Var.l0(P4);
            }
            a74 g3 = dj6.g(k43.a(g04.L(n, (qn2) P4), r94Var, jq5.a(4, 0L, z7)));
            y16 y16Var = z16.a;
            gi2.h(xq2Var, vy7.L(nj2.E(g3, f2, y16Var, false, 0L, 24), ((kt0) a2.getValue()).a, y16Var));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: yw6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bx6.b(z, z2, rf1Var, on2Var, r94Var, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }
}
