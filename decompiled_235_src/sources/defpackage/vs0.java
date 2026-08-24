package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs0  reason: default package */
/* loaded from: classes.dex */
public class vs0 implements lx, b51, vr0, k61, im6, t54, pj7, s60, eo7, fu, iu, z31 {
    public static final /* synthetic */ int A0 = 0;
    public static pe5 L;
    public static me5 v0;
    public final /* synthetic */ int A;
    public static final vs0 B = new vs0(0);
    public static final vs0 R = new vs0(1);
    public static final vs0 X = new vs0(2);
    public static final vs0 Y = new vs0(3);
    public static final vs0 Z = new vs0(4);
    public static final vs0 d0 = new vs0(5);
    public static final vs0 e0 = new vs0(6);
    public static final vs0 f0 = new vs0(7);
    public static final of5 g0 = new of5(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ vs0 h0 = new vs0(9);
    public static final /* synthetic */ vs0 i0 = new vs0(10);
    public static final vs0 j0 = new vs0(11);
    public static final vs0 k0 = new vs0(12);
    public static final vs0 l0 = new vs0(13);
    public static final vs0 m0 = new vs0(14);
    public static final vs0 n0 = new vs0(14);
    public static final vs0 o0 = new vs0(14);
    public static final vs0 p0 = new vs0(14);
    public static final vs0 q0 = new vs0(14);
    public static final vs0 r0 = new vs0(14);
    public static final vs0 s0 = new vs0(15);
    public static final vs0 t0 = new vs0(16);
    public static final vs0 u0 = new vs0(17);
    public static final vs0 w0 = new vs0(18);
    public static final vs0 x0 = new vs0(19);
    public static final vs0 y0 = new vs0(20);
    public static final qv7 z0 = new Object();

    public /* synthetic */ vs0(int i) {
        this.A = i;
    }

    public static final pe5 q(Context context) {
        pe5 pe5Var = L;
        if (pe5Var == null) {
            synchronized (B) {
                pe5 pe5Var2 = L;
                if (pe5Var2 != null) {
                    return pe5Var2;
                }
                context.getApplicationContext();
                pe5 g = new pa(context).g();
                L = g;
                return g;
            }
        }
        return pe5Var;
    }

    @Override // defpackage.fu, defpackage.iu
    public float a() {
        return RecyclerView.B1;
    }

    @Override // defpackage.vr0
    public s83 b() {
        return u83.a.b();
    }

    @Override // defpackage.z31
    public long c(long j, long j2) {
        float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        int i = a66.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.fu
    public void d(qh1 qh1Var, int i, int[] iArr, kk3 kk3Var, int[] iArr2) {
        if (kk3Var == kk3.Ltr) {
            ju.b(i, iArr, iArr2, false);
        } else {
            ju.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.eo7
    public on2 e(p0 p0Var) {
        wh whVar = new wh(p0Var, 7);
        p0Var.addOnAttachStateChangeListener(whVar);
        do7 do7Var = new do7(p0Var);
        bl2.D(p0Var).a.add(do7Var);
        return new mf1(p0Var, whVar, do7Var, 2);
    }

    public void f(a74 a74Var, float f, long j, px0 px0Var, int i) {
        boolean z;
        a74 a74Var2;
        float f2;
        long j2;
        long j3;
        float f3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(910934799);
        int i2 = i | 150;
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                f3 = f;
                j3 = j;
            } else {
                long c = kt0.c(0.12f, ((kt0) xq2Var.j(j31.a)).a);
                a74Var = x64.a;
                j3 = c;
                f3 = 1.0f;
            }
            a74 a74Var3 = a74Var;
            xq2Var.q();
            l.c(a74Var3, j3, f3, xq2Var, 6, 8);
            a74Var2 = a74Var3;
            j2 = j3;
            f2 = f3;
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
            f2 = f;
            j2 = j;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new gy6(this, a74Var2, f2, j2, i, 1);
        }
    }

    @Override // defpackage.iu
    public void g(qh1 qh1Var, int i, int[] iArr, int[] iArr2) {
        ju.b(i, iArr, iArr2, false);
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        ((yl5) obj).close();
        return jg7.a;
    }

    @Override // defpackage.im6
    public boolean i(Object obj, Object obj2) {
        switch (this.A) {
            case 11:
                return false;
            default:
                if (obj == obj2) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.lx
    public int j() {
        return 1;
    }

    @Override // defpackage.s60
    public long k(int i, ls0 ls0Var) {
        String str = ((a47) ls0Var.e).a.a.B;
        return jx2.f(qo2.x(i, str), qo2.w(i, str));
    }

    public void l(a74 a74Var, float f, long j, px0 px0Var, int i) {
        int i2;
        boolean z;
        float f2;
        long j2;
        long j3;
        float f3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1499002201);
        if (xq2Var.f(a74Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 144;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                f3 = f;
                j3 = j;
            } else {
                j3 = ((kt0) xq2Var.j(j31.a)).a;
                f3 = 2.0f;
            }
            xq2Var.q();
            h70.a(vy7.L(dj6.e(dj6.c(a74Var, 1.0f), f3), j3, u24.m), xq2Var, 0);
            j2 = j3;
            f2 = f3;
        } else {
            xq2Var.V();
            f2 = f;
            j2 = j;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new gy6(this, a74Var, f2, j2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
        if (r31 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
        if (r31 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0240 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(final z63 z63Var, final long j, final long j2, final t17 t17Var, final boolean z, final zv0 zv0Var, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        float f;
        int i7;
        float f2;
        int i8;
        float f3;
        int i9;
        long j3;
        boolean f4;
        Object P;
        long j4;
        long j5;
        boolean f5;
        Object P2;
        ne neVar = ne.n0;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(509439888);
        if (xq2Var.d(z63Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (xq2Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (xq2Var.e(j2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (xq2Var.h(t17Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (xq2Var.g(z)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if ((74899 & i14) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i14 & 1, z2)) {
            ga7 N = n16.N(z63Var, "TextFieldInputState", xq2Var, (i14 & 14) | 48, 0);
            gx0 gx0Var = N.a;
            vs4 vs4Var = N.d;
            wc7 wc7Var = nw7.e0;
            xq2Var.b0(389927550);
            int[] iArr = a37.a;
            int i15 = iArr[((z63) gx0Var.f()).ordinal()];
            float f6 = RecyclerView.B1;
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        i.d();
                        return;
                    }
                } else {
                    f = 0.0f;
                    xq2Var.p(false);
                    Float valueOf = Float.valueOf(f);
                    xq2Var.b0(389927550);
                    i7 = iArr[((z63) vs4Var.getValue()).ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                i.d();
                                return;
                            }
                        } else {
                            f2 = 0.0f;
                            xq2Var.p(false);
                            Float valueOf2 = Float.valueOf(f2);
                            N.f();
                            xq2Var.b0(-883519390);
                            sc7 Y2 = ge7.Y(150, 0, null, 6);
                            xq2Var.p(false);
                            ca7 t = n16.t(N, valueOf, valueOf2, Y2, wc7Var, xq2Var, 196608);
                            nw0 nw0Var = new nw0(3);
                            xq2Var.b0(1246942589);
                            i8 = iArr[((z63) gx0Var.f()).ordinal()];
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 != 3) {
                                        i.d();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                xq2Var.p(false);
                                Float valueOf3 = Float.valueOf(f3);
                                xq2Var.b0(1246942589);
                                i9 = iArr[((z63) vs4Var.getValue()).ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        if (i9 != 3) {
                                            i.d();
                                            return;
                                        }
                                    }
                                    xq2Var.p(false);
                                    ca7 t2 = n16.t(N, valueOf3, Float.valueOf(f6), (rc2) nw0Var.e(N.f(), xq2Var, 0), wc7Var, xq2Var, 196608);
                                    xq2Var.b0(-2001931362);
                                    if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                                        j3 = j;
                                    } else {
                                        j3 = j2;
                                    }
                                    xq2Var.p(false);
                                    nt0 g = kt0.g(j3);
                                    f4 = xq2Var.f(g);
                                    P = xq2Var.P();
                                    vs0 vs0Var = ox0.a;
                                    if (!f4 || P == vs0Var) {
                                        P = new wc7(neVar, new mc(g, 8));
                                        xq2Var.l0(P);
                                    }
                                    wc7 wc7Var2 = (wc7) P;
                                    xq2Var.b0(-2001931362);
                                    if (iArr[((z63) gx0Var.f()).ordinal()] == 1) {
                                        j4 = j;
                                    } else {
                                        j4 = j2;
                                    }
                                    xq2Var.p(false);
                                    kt0 kt0Var = new kt0(j4);
                                    xq2Var.b0(-2001931362);
                                    if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                                        j5 = j;
                                    } else {
                                        j5 = j2;
                                    }
                                    xq2Var.p(false);
                                    kt0 kt0Var2 = new kt0(j5);
                                    N.f();
                                    xq2Var.b0(-2017811095);
                                    sc7 Y3 = ge7.Y(150, 0, null, 6);
                                    xq2Var.p(false);
                                    ca7 t3 = n16.t(N, kt0Var, kt0Var2, Y3, wc7Var2, xq2Var, 196608);
                                    int i16 = (i14 & 7168) | RendererDebugBridge.CAPTURE_HEIGHT;
                                    nt0 g2 = kt0.g(((kt0) t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf((i16 >> 6) & 112))).a);
                                    f5 = xq2Var.f(g2);
                                    P2 = xq2Var.P();
                                    if (!f5 || P2 == vs0Var) {
                                        P2 = new wc7(neVar, new mc(g2, 8));
                                        xq2Var.l0(P2);
                                    }
                                    int i17 = ((((i16 << 3) & 57344) | 3072) >> 9) & 112;
                                    Object e = t17Var.e(gx0Var.f(), xq2Var, Integer.valueOf(i17));
                                    Object e2 = t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf(i17));
                                    N.f();
                                    xq2Var.b0(-1176639650);
                                    sc7 Y4 = ge7.Y(150, 0, null, 6);
                                    xq2Var.p(false);
                                    zv0Var.n(Float.valueOf(((Number) t.f0.getValue()).floatValue()), new kt0(((kt0) t3.f0.getValue()).a), new kt0(((kt0) n16.t(N, e, e2, Y4, (wc7) P2, xq2Var, 196608).f0.getValue()).a), Float.valueOf(((Number) t2.f0.getValue()).floatValue()), xq2Var, 24576);
                                }
                                f6 = 1.0f;
                                xq2Var.p(false);
                                ca7 t22 = n16.t(N, valueOf3, Float.valueOf(f6), (rc2) nw0Var.e(N.f(), xq2Var, 0), wc7Var, xq2Var, 196608);
                                xq2Var.b0(-2001931362);
                                if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                                }
                                xq2Var.p(false);
                                nt0 g3 = kt0.g(j3);
                                f4 = xq2Var.f(g3);
                                P = xq2Var.P();
                                vs0 vs0Var2 = ox0.a;
                                if (!f4) {
                                }
                                P = new wc7(neVar, new mc(g3, 8));
                                xq2Var.l0(P);
                                wc7 wc7Var22 = (wc7) P;
                                xq2Var.b0(-2001931362);
                                if (iArr[((z63) gx0Var.f()).ordinal()] == 1) {
                                }
                                xq2Var.p(false);
                                kt0 kt0Var3 = new kt0(j4);
                                xq2Var.b0(-2001931362);
                                if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                                }
                                xq2Var.p(false);
                                kt0 kt0Var22 = new kt0(j5);
                                N.f();
                                xq2Var.b0(-2017811095);
                                sc7 Y32 = ge7.Y(150, 0, null, 6);
                                xq2Var.p(false);
                                ca7 t32 = n16.t(N, kt0Var3, kt0Var22, Y32, wc7Var22, xq2Var, 196608);
                                int i162 = (i14 & 7168) | RendererDebugBridge.CAPTURE_HEIGHT;
                                nt0 g22 = kt0.g(((kt0) t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf((i162 >> 6) & 112))).a);
                                f5 = xq2Var.f(g22);
                                P2 = xq2Var.P();
                                if (!f5) {
                                }
                                P2 = new wc7(neVar, new mc(g22, 8));
                                xq2Var.l0(P2);
                                int i172 = ((((i162 << 3) & 57344) | 3072) >> 9) & 112;
                                Object e3 = t17Var.e(gx0Var.f(), xq2Var, Integer.valueOf(i172));
                                Object e22 = t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf(i172));
                                N.f();
                                xq2Var.b0(-1176639650);
                                sc7 Y42 = ge7.Y(150, 0, null, 6);
                                xq2Var.p(false);
                                zv0Var.n(Float.valueOf(((Number) t.f0.getValue()).floatValue()), new kt0(((kt0) t32.f0.getValue()).a), new kt0(((kt0) n16.t(N, e3, e22, Y42, (wc7) P2, xq2Var, 196608).f0.getValue()).a), Float.valueOf(((Number) t22.f0.getValue()).floatValue()), xq2Var, 24576);
                            }
                            f3 = 1.0f;
                            xq2Var.p(false);
                            Float valueOf32 = Float.valueOf(f3);
                            xq2Var.b0(1246942589);
                            i9 = iArr[((z63) vs4Var.getValue()).ordinal()];
                            if (i9 != 1) {
                            }
                            f6 = 1.0f;
                            xq2Var.p(false);
                            ca7 t222 = n16.t(N, valueOf32, Float.valueOf(f6), (rc2) nw0Var.e(N.f(), xq2Var, 0), wc7Var, xq2Var, 196608);
                            xq2Var.b0(-2001931362);
                            if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                            }
                            xq2Var.p(false);
                            nt0 g32 = kt0.g(j3);
                            f4 = xq2Var.f(g32);
                            P = xq2Var.P();
                            vs0 vs0Var22 = ox0.a;
                            if (!f4) {
                            }
                            P = new wc7(neVar, new mc(g32, 8));
                            xq2Var.l0(P);
                            wc7 wc7Var222 = (wc7) P;
                            xq2Var.b0(-2001931362);
                            if (iArr[((z63) gx0Var.f()).ordinal()] == 1) {
                            }
                            xq2Var.p(false);
                            kt0 kt0Var32 = new kt0(j4);
                            xq2Var.b0(-2001931362);
                            if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                            }
                            xq2Var.p(false);
                            kt0 kt0Var222 = new kt0(j5);
                            N.f();
                            xq2Var.b0(-2017811095);
                            sc7 Y322 = ge7.Y(150, 0, null, 6);
                            xq2Var.p(false);
                            ca7 t322 = n16.t(N, kt0Var32, kt0Var222, Y322, wc7Var222, xq2Var, 196608);
                            int i1622 = (i14 & 7168) | RendererDebugBridge.CAPTURE_HEIGHT;
                            nt0 g222 = kt0.g(((kt0) t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf((i1622 >> 6) & 112))).a);
                            f5 = xq2Var.f(g222);
                            P2 = xq2Var.P();
                            if (!f5) {
                            }
                            P2 = new wc7(neVar, new mc(g222, 8));
                            xq2Var.l0(P2);
                            int i1722 = ((((i1622 << 3) & 57344) | 3072) >> 9) & 112;
                            Object e32 = t17Var.e(gx0Var.f(), xq2Var, Integer.valueOf(i1722));
                            Object e222 = t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf(i1722));
                            N.f();
                            xq2Var.b0(-1176639650);
                            sc7 Y422 = ge7.Y(150, 0, null, 6);
                            xq2Var.p(false);
                            zv0Var.n(Float.valueOf(((Number) t.f0.getValue()).floatValue()), new kt0(((kt0) t322.f0.getValue()).a), new kt0(((kt0) n16.t(N, e32, e222, Y422, (wc7) P2, xq2Var, 196608).f0.getValue()).a), Float.valueOf(((Number) t222.f0.getValue()).floatValue()), xq2Var, 24576);
                        }
                    }
                    f2 = 1.0f;
                    xq2Var.p(false);
                    Float valueOf22 = Float.valueOf(f2);
                    N.f();
                    xq2Var.b0(-883519390);
                    sc7 Y22 = ge7.Y(150, 0, null, 6);
                    xq2Var.p(false);
                    ca7 t4 = n16.t(N, valueOf, valueOf22, Y22, wc7Var, xq2Var, 196608);
                    nw0 nw0Var2 = new nw0(3);
                    xq2Var.b0(1246942589);
                    i8 = iArr[((z63) gx0Var.f()).ordinal()];
                    if (i8 != 1) {
                    }
                    f3 = 1.0f;
                    xq2Var.p(false);
                    Float valueOf322 = Float.valueOf(f3);
                    xq2Var.b0(1246942589);
                    i9 = iArr[((z63) vs4Var.getValue()).ordinal()];
                    if (i9 != 1) {
                    }
                    f6 = 1.0f;
                    xq2Var.p(false);
                    ca7 t2222 = n16.t(N, valueOf322, Float.valueOf(f6), (rc2) nw0Var2.e(N.f(), xq2Var, 0), wc7Var, xq2Var, 196608);
                    xq2Var.b0(-2001931362);
                    if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                    }
                    xq2Var.p(false);
                    nt0 g322 = kt0.g(j3);
                    f4 = xq2Var.f(g322);
                    P = xq2Var.P();
                    vs0 vs0Var222 = ox0.a;
                    if (!f4) {
                    }
                    P = new wc7(neVar, new mc(g322, 8));
                    xq2Var.l0(P);
                    wc7 wc7Var2222 = (wc7) P;
                    xq2Var.b0(-2001931362);
                    if (iArr[((z63) gx0Var.f()).ordinal()] == 1) {
                    }
                    xq2Var.p(false);
                    kt0 kt0Var322 = new kt0(j4);
                    xq2Var.b0(-2001931362);
                    if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
                    }
                    xq2Var.p(false);
                    kt0 kt0Var2222 = new kt0(j5);
                    N.f();
                    xq2Var.b0(-2017811095);
                    sc7 Y3222 = ge7.Y(150, 0, null, 6);
                    xq2Var.p(false);
                    ca7 t3222 = n16.t(N, kt0Var322, kt0Var2222, Y3222, wc7Var2222, xq2Var, 196608);
                    int i16222 = (i14 & 7168) | RendererDebugBridge.CAPTURE_HEIGHT;
                    nt0 g2222 = kt0.g(((kt0) t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf((i16222 >> 6) & 112))).a);
                    f5 = xq2Var.f(g2222);
                    P2 = xq2Var.P();
                    if (!f5) {
                    }
                    P2 = new wc7(neVar, new mc(g2222, 8));
                    xq2Var.l0(P2);
                    int i17222 = ((((i16222 << 3) & 57344) | 3072) >> 9) & 112;
                    Object e322 = t17Var.e(gx0Var.f(), xq2Var, Integer.valueOf(i17222));
                    Object e2222 = t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf(i17222));
                    N.f();
                    xq2Var.b0(-1176639650);
                    sc7 Y4222 = ge7.Y(150, 0, null, 6);
                    xq2Var.p(false);
                    zv0Var.n(Float.valueOf(((Number) t4.f0.getValue()).floatValue()), new kt0(((kt0) t3222.f0.getValue()).a), new kt0(((kt0) n16.t(N, e322, e2222, Y4222, (wc7) P2, xq2Var, 196608).f0.getValue()).a), Float.valueOf(((Number) t2222.f0.getValue()).floatValue()), xq2Var, 24576);
                }
            }
            f = 1.0f;
            xq2Var.p(false);
            Float valueOf4 = Float.valueOf(f);
            xq2Var.b0(389927550);
            i7 = iArr[((z63) vs4Var.getValue()).ordinal()];
            if (i7 != 1) {
            }
            f2 = 1.0f;
            xq2Var.p(false);
            Float valueOf222 = Float.valueOf(f2);
            N.f();
            xq2Var.b0(-883519390);
            sc7 Y222 = ge7.Y(150, 0, null, 6);
            xq2Var.p(false);
            ca7 t42 = n16.t(N, valueOf4, valueOf222, Y222, wc7Var, xq2Var, 196608);
            nw0 nw0Var22 = new nw0(3);
            xq2Var.b0(1246942589);
            i8 = iArr[((z63) gx0Var.f()).ordinal()];
            if (i8 != 1) {
            }
            f3 = 1.0f;
            xq2Var.p(false);
            Float valueOf3222 = Float.valueOf(f3);
            xq2Var.b0(1246942589);
            i9 = iArr[((z63) vs4Var.getValue()).ordinal()];
            if (i9 != 1) {
            }
            f6 = 1.0f;
            xq2Var.p(false);
            ca7 t22222 = n16.t(N, valueOf3222, Float.valueOf(f6), (rc2) nw0Var22.e(N.f(), xq2Var, 0), wc7Var, xq2Var, 196608);
            xq2Var.b0(-2001931362);
            if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
            }
            xq2Var.p(false);
            nt0 g3222 = kt0.g(j3);
            f4 = xq2Var.f(g3222);
            P = xq2Var.P();
            vs0 vs0Var2222 = ox0.a;
            if (!f4) {
            }
            P = new wc7(neVar, new mc(g3222, 8));
            xq2Var.l0(P);
            wc7 wc7Var22222 = (wc7) P;
            xq2Var.b0(-2001931362);
            if (iArr[((z63) gx0Var.f()).ordinal()] == 1) {
            }
            xq2Var.p(false);
            kt0 kt0Var3222 = new kt0(j4);
            xq2Var.b0(-2001931362);
            if (iArr[((z63) vs4Var.getValue()).ordinal()] == 1) {
            }
            xq2Var.p(false);
            kt0 kt0Var22222 = new kt0(j5);
            N.f();
            xq2Var.b0(-2017811095);
            sc7 Y32222 = ge7.Y(150, 0, null, 6);
            xq2Var.p(false);
            ca7 t32222 = n16.t(N, kt0Var3222, kt0Var22222, Y32222, wc7Var22222, xq2Var, 196608);
            int i162222 = (i14 & 7168) | RendererDebugBridge.CAPTURE_HEIGHT;
            nt0 g22222 = kt0.g(((kt0) t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf((i162222 >> 6) & 112))).a);
            f5 = xq2Var.f(g22222);
            P2 = xq2Var.P();
            if (!f5) {
            }
            P2 = new wc7(neVar, new mc(g22222, 8));
            xq2Var.l0(P2);
            int i172222 = ((((i162222 << 3) & 57344) | 3072) >> 9) & 112;
            Object e3222 = t17Var.e(gx0Var.f(), xq2Var, Integer.valueOf(i172222));
            Object e22222 = t17Var.e(vs4Var.getValue(), xq2Var, Integer.valueOf(i172222));
            N.f();
            xq2Var.b0(-1176639650);
            sc7 Y42222 = ge7.Y(150, 0, null, 6);
            xq2Var.p(false);
            zv0Var.n(Float.valueOf(((Number) t42.f0.getValue()).floatValue()), new kt0(((kt0) t32222.f0.getValue()).a), new kt0(((kt0) n16.t(N, e3222, e22222, Y42222, (wc7) P2, xq2Var, 196608).f0.getValue()).a), Float.valueOf(((Number) t22222.f0.getValue()).floatValue()), xq2Var, 24576);
        } else {
            xq2Var.V();
        }
        cf5 t5 = xq2Var.t();
        if (t5 != null) {
            t5.d = new eo2(z63Var, j, j2, t17Var, z, zv0Var, i) { // from class: z27
                public final /* synthetic */ z63 B;
                public final /* synthetic */ long L;
                public final /* synthetic */ long R;
                public final /* synthetic */ t17 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ zv0 Z;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1769473);
                    vs0.this.m(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public a74 n(a74 a74Var, e40 e40Var) {
        return a74Var.d(new f70(e40Var, false));
    }

    public List o(Executor executor) {
        return Collections.singletonList(new hd1(executor));
    }

    public List p() {
        return Collections.EMPTY_LIST;
    }

    public a74 r() {
        return new f70(d90.Z, true);
    }

    public String toString() {
        switch (this.A) {
            case 11:
                return "NeverEqualPolicy";
            case 15:
                return "ReferentialEqualityPolicy";
            case ConnectionResult.API_DISABLED /* 23 */:
                return "Arrangement#SpaceBetween";
            case 28:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
