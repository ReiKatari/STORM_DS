package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey6  reason: default package */
/* loaded from: classes.dex */
public abstract class ey6 {
    public static final long a = hi2.E(20);
    public static final /* synthetic */ int b = 0;

    public static final void a(final boolean z, final on2 on2Var, a74 a74Var, boolean z2, final eo2 eo2Var, final eo2 eo2Var2, long j, long j2, px0 px0Var, final int i) {
        int i2;
        boolean z3;
        final a74 a74Var2;
        final boolean z4;
        final long j3;
        final long j4;
        float f;
        int i3;
        long c;
        boolean z5;
        long j5;
        x64 x64Var;
        zv0 I;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-610760526);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 39325056;
        if ((38347923 & i4) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i4 & 1, z3)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i3 = i4 & (-264241153);
                x64Var = a74Var;
                z5 = z2;
                j5 = j;
                c = j2;
            } else {
                py0 py0Var = j31.a;
                long j6 = ((kt0) xq2Var.j(py0Var)).a;
                long j7 = ((kt0) xq2Var.j(py0Var)).a;
                if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j7) < 0.5d : hv.N(j7) > 0.5d) {
                    f = 0.74f;
                } else {
                    f = 0.6f;
                }
                i3 = i4 & (-264241153);
                c = kt0.c(f, j6);
                z5 = true;
                j5 = j6;
                x64Var = x64.a;
            }
            xq2Var.q();
            if (eo2Var == null) {
                xq2Var.b0(-1684876703);
                xq2Var.p(false);
                I = null;
            } else {
                xq2Var.b0(-1684876702);
                I = n16.I(1101313667, new bc(8, eo2Var), xq2Var);
                xq2Var.p(false);
            }
            b(z, on2Var, x64Var, z5, j5, c, n16.I(-1088373601, new l4(16, I, eo2Var2), xq2Var), xq2Var, (i3 & 14) | 12610992);
            a74Var2 = x64Var;
            z4 = z5;
            j3 = j5;
            j4 = c;
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
            z4 = z2;
            j3 = j;
            j4 = j2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(z, on2Var, a74Var2, z4, eo2Var, eo2Var2, j3, j4, i) { // from class: zx6
                public final /* synthetic */ boolean A;
                public final /* synthetic */ on2 B;
                public final /* synthetic */ a74 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ eo2 X;
                public final /* synthetic */ eo2 Y;
                public final /* synthetic */ long Z;
                public final /* synthetic */ long d0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(221233);
                    ey6.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final on2 on2Var, final a74 a74Var, final boolean z2, final long j, final long j2, final zv0 zv0Var, px0 px0Var, final int i) {
        int i2;
        on2 on2Var2;
        boolean z3;
        xq2 xq2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1847932236);
        if ((i & 6) == 0) {
            if (xq2Var2.g(z)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            on2Var2 = on2Var;
            if (xq2Var2.h(on2Var2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        } else {
            on2Var2 = on2Var;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.f(a74Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (xq2Var2.g(z2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (xq2Var2.f(null)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (xq2Var2.e(j)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var2.e(j2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var2.h(zv0Var)) {
                i3 = 8388608;
            } else {
                i3 = Compress.MAXWINSIZE;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var2.S(i2 & 1, z3)) {
            xq2Var2.X();
            if ((i & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
            }
            xq2Var2.q();
            final kq5 a2 = jq5.a(2, j, true);
            final on2 on2Var3 = on2Var2;
            int i11 = i2 >> 15;
            xq2Var = xq2Var2;
            d(j, j2, z, n16.I(-652402312, new eo2() { // from class: ay6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z4;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z4)) {
                        a74 c = dj6.c(g04.O(a74.this, z, a2, z2, new mq5(4), on2Var3), 1.0f);
                        yt0 a3 = wt0.a(ju.d, d90.l0, xq2Var3, 54);
                        int B = ge7.B(xq2Var3);
                        xv4 l = xq2Var3.l();
                        a74 E = l.E(xq2Var3, c);
                        jx0.i.getClass();
                        iy0 iy0Var = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.f, a3);
                        yh2.K(xq2Var3, ix0.e, l);
                        pn pnVar = ix0.g;
                        if (xq2Var3.S || !nb3.k(xq2Var3.P(), Integer.valueOf(B))) {
                            i61.v(B, xq2Var3, B, pnVar);
                        }
                        yh2.K(xq2Var3, ix0.d, E);
                        zv0Var.e(zt0.a, xq2Var3, 6);
                        xq2Var3.p(true);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var2), xq2Var, ((i2 << 6) & 896) | (i11 & 112) | (i11 & 14) | 3072);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: by6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ey6.b(z, on2Var, a74Var, z2, j, j2, zv0Var, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [eo2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [eo2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    public static final void c(eo2 eo2Var, eo2 eo2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        ?? r5;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        e40 e40Var = d90.L;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1466813041);
        if (xq2Var.h(eo2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (xq2Var.h(eo2Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            int i7 = i6 & 14;
            if (i7 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            Object P = xq2Var.P();
            if (z6 || P == ox0.a) {
                P = new xj(1, eo2Var, eo2Var2);
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            x64 x64Var = x64.a;
            a74 E = l.E(xq2Var, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, e34Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            if (eo2Var != 0) {
                xq2Var.b0(-1044948645);
                i4 = i6;
                a74 Q = ge7.Q(lb4.D(x64Var, "text"), 16.0f, RecyclerView.B1, 2);
                e34 d = h70.d(e40Var, false);
                int B2 = ge7.B(xq2Var);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, Q);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d);
                yh2.K(xq2Var, pnVar2, l2);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                    i61.v(B2, xq2Var, B2, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E2);
                eo2Var.o(xq2Var, Integer.valueOf(i7));
                xq2Var.p(true);
                z4 = false;
                xq2Var.p(false);
            } else {
                i4 = i6;
                z4 = false;
                xq2Var.b0(-1044843896);
                xq2Var.p(false);
            }
            if (eo2Var2 != 0) {
                xq2Var.b0(-1044815097);
                a74 D = lb4.D(x64Var, "icon");
                e34 d2 = h70.d(e40Var, z4);
                int B3 = ge7.B(xq2Var);
                xv4 l3 = xq2Var.l();
                a74 E3 = l.E(xq2Var, D);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d2);
                yh2.K(xq2Var, pnVar2, l3);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                    i61.v(B3, xq2Var, B3, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E3);
                eo2Var2.o(xq2Var, Integer.valueOf((i4 >> 3) & 14));
                z5 = true;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                z5 = true;
                xq2Var.b0(-1044752632);
                xq2Var.p(z4);
            }
            xq2Var.p(z5);
            r5 = z5;
        } else {
            r5 = 1;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new cc(eo2Var, eo2Var2, i, r5);
        }
    }

    public static final void d(final long j, long j2, final boolean z, final zv0 zv0Var, px0 px0Var, final int i) {
        int i2;
        long j3;
        boolean z2;
        long j4;
        long j5;
        long j6;
        int i3;
        boolean z3;
        sc7 Y;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1841653376);
        if ((i & 6) == 0) {
            if (xq2Var.e(j)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j2;
            if (xq2Var.e(j3)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        } else {
            j3 = j2;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.g(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i2 & 1, z2)) {
            int i8 = i2 >> 6;
            ga7 N = n16.N(Boolean.valueOf(z), null, xq2Var, i8 & 14, 2);
            vs4 vs4Var = N.d;
            boolean booleanValue = ((Boolean) vs4Var.getValue()).booleanValue();
            xq2Var.b0(90393475);
            if (booleanValue) {
                j4 = j;
            } else {
                j4 = j3;
            }
            xq2Var.p(false);
            nt0 g = kt0.g(j4);
            boolean f = xq2Var.f(g);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                wc7 wc7Var = new wc7(ne.n0, new mc(g, 8));
                xq2Var.l0(wc7Var);
                P = wc7Var;
            }
            wc7 wc7Var2 = (wc7) P;
            boolean booleanValue2 = ((Boolean) N.a.f()).booleanValue();
            xq2Var.b0(90393475);
            if (booleanValue2) {
                j5 = j;
            } else {
                j5 = j3;
            }
            xq2Var.p(false);
            kt0 kt0Var = new kt0(j5);
            boolean booleanValue3 = ((Boolean) vs4Var.getValue()).booleanValue();
            xq2Var.b0(90393475);
            if (booleanValue3) {
                j6 = j;
            } else {
                j6 = j3;
            }
            xq2Var.p(false);
            kt0 kt0Var2 = new kt0(j6);
            aa7 f2 = N.f();
            xq2Var.b0(297582231);
            if (f2.b(Boolean.FALSE, Boolean.TRUE)) {
                i3 = i8;
                Y = new sc7(150, 100, ir1.c);
                z3 = false;
            } else {
                i3 = i8;
                z3 = false;
                Y = ge7.Y(100, 0, ir1.c, 2);
            }
            xq2Var.p(z3);
            ca7 t = n16.t(N, kt0Var, kt0Var2, Y, wc7Var2, xq2Var, 0);
            hv.e(new pq[]{j31.a.a(new kt0(kt0.c(1.0f, ((kt0) t.f0.getValue()).a))), g31.a.a(Float.valueOf(kt0.e(((kt0) t.f0.getValue()).a)))}, zv0Var, xq2Var, 8 | (i3 & 112));
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            final long j7 = j3;
            t2.d = new eo2() { // from class: cy6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ey6.d(j, j7, z, zv0Var, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }
}
