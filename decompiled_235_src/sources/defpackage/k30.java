package defpackage;

import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k30  reason: default package */
/* loaded from: classes.dex */
public abstract class k30 {
    public static final /* synthetic */ int a = 0;

    static {
        nc1.f(40.0f, 40.0f);
    }

    public static final void a(c37 c37Var, qn2 qn2Var, a74 a74Var, boolean z, s47 s47Var, xh3 xh3Var, vh3 vh3Var, boolean z2, int i, int i2, wq7 wq7Var, qn2 qn2Var2, r94 r94Var, cn6 cn6Var, zv0 zv0Var, px0 px0Var, int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7;
        qn2 qn2Var3;
        qn2 qn2Var4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-971111025);
        if ((i3 & 6) == 0) {
            i5 = (xq2Var.f(c37Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= xq2Var.h(qn2Var) ? 32 : 16;
        }
        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i5 |= xq2Var.f(a74Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            z3 = z;
            i5 |= xq2Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i3 & 24576) == 0) {
            i5 |= xq2Var.g(false) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 = 196608;
            i5 |= xq2Var.f(s47Var) ? 131072 : 65536;
        } else {
            i6 = 196608;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= xq2Var.f(xh3Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= xq2Var.f(vh3Var) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= xq2Var.g(z2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= xq2Var.d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (xq2Var.d(i2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= xq2Var.f(wq7Var) ? 32 : 16;
        }
        int i8 = i7 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i4 & 3072) == 0) {
            i8 |= xq2Var.f(r94Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i8 |= xq2Var.f(cn6Var) ? 16384 : 8192;
        }
        if ((i4 & i6) == 0) {
            i8 |= xq2Var.h(zv0Var) ? 131072 : 65536;
        }
        if (xq2Var.S(i5 & 1, ((i5 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            xq2Var.X();
            int i9 = i3 & 1;
            vs0 vs0Var = ox0.a;
            if (i9 != 0 && !xq2Var.B()) {
                xq2Var.V();
                qn2Var4 = qn2Var2;
            } else {
                Object P = xq2Var.P();
                if (P == vs0Var) {
                    P = new k4(19);
                    xq2Var.l0(P);
                }
                qn2Var4 = (qn2) P;
            }
            xq2Var.q();
            l33 a2 = xh3Var.a(z2);
            boolean z4 = !z2;
            int i10 = z2 ? 1 : i2;
            int i11 = z2 ? 1 : i;
            boolean z5 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object P2 = xq2Var.P();
            if (z5 || P2 == vs0Var) {
                P2 = new y(6, c37Var, qn2Var);
                xq2Var.l0(P2);
            }
            int i12 = i8 << 9;
            qn2 qn2Var5 = qn2Var4;
            hf.c(c37Var, (qn2) P2, a74Var, s47Var, wq7Var, qn2Var5, r94Var, cn6Var, z4, i11, i10, a2, vh3Var, z3, zv0Var, xq2Var, (i5 & 910) | ((i5 >> 6) & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128), (i5 & 7168) | ((i5 >> 15) & 896) | (i5 & 57344) | (i8 & 458752));
            qn2Var3 = qn2Var5;
        } else {
            xq2Var.V();
            qn2Var3 = qn2Var2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new j30(c37Var, qn2Var, a74Var, z, s47Var, xh3Var, vh3Var, z2, i, i2, wq7Var, qn2Var3, r94Var, cn6Var, zv0Var, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final qn2 qn2Var, final a74 a74Var, boolean z, final s47 s47Var, final xh3 xh3Var, vh3 vh3Var, final boolean z2, int i, int i2, wq7 wq7Var, qn2 qn2Var2, r94 r94Var, final cn6 cn6Var, final zv0 zv0Var, px0 px0Var, final int i3, final int i4, final int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8;
        vh3 vh3Var2;
        final int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        xq2 xq2Var;
        final int i18;
        final wq7 wq7Var2;
        final boolean z4;
        final vh3 vh3Var3;
        final qn2 qn2Var3;
        final r94 r94Var2;
        cf5 t;
        int i19;
        int i20;
        int i21;
        boolean z5;
        vh3 vh3Var4;
        wq7 wq7Var3;
        r94 r94Var3;
        int i22;
        qn2 qn2Var4;
        int i23;
        int i24;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (xq2Var2.f(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= xq2Var2.h(qn2Var) ? 32 : 16;
        }
        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i6 |= xq2Var2.f(a74Var) ? 256 : 128;
        }
        int i25 = i5 & 8;
        if (i25 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z3 = z;
            i6 |= xq2Var2.g(z3) ? 2048 : 1024;
            if ((i5 & 16) == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= xq2Var2.g(false) ? 16384 : 8192;
            }
            if ((i3 & 196608) != 0) {
                i7 = 196608;
                i6 |= xq2Var2.f(s47Var) ? 131072 : 65536;
            } else {
                i7 = 196608;
            }
            if ((i3 & 1572864) == 0) {
                i6 |= xq2Var2.f(xh3Var) ? 1048576 : 524288;
            }
            i8 = i5 & 128;
            if (i8 == 0) {
                i6 |= 12582912;
                vh3Var2 = vh3Var;
            } else {
                vh3Var2 = vh3Var;
                if ((i3 & 12582912) == 0) {
                    i6 |= xq2Var2.f(vh3Var2) ? 8388608 : Compress.MAXWINSIZE;
                }
            }
            if ((i3 & 100663296) == 0) {
                i6 |= xq2Var2.g(z2) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) != 0) {
                if ((i5 & 512) == 0) {
                    i9 = i;
                    if (xq2Var2.d(i9)) {
                        i24 = 536870912;
                        i6 |= i24;
                    }
                } else {
                    i9 = i;
                }
                i24 = 268435456;
                i6 |= i24;
            } else {
                i9 = i;
            }
            i10 = i5 & 1024;
            if (i10 == 0) {
                i12 = i4 | 6;
                i11 = i10;
            } else if ((i4 & 6) == 0) {
                i11 = i10;
                i12 = i4 | (xq2Var2.d(i2) ? 4 : 2);
            } else {
                i11 = i10;
                i12 = i4;
            }
            i13 = i5 & 2048;
            if (i13 == 0) {
                i12 |= 48;
                i14 = i13;
            } else if ((i4 & 48) == 0) {
                i14 = i13;
                i12 |= xq2Var2.f(wq7Var) ? 32 : 16;
            } else {
                i14 = i13;
            }
            int i26 = i12;
            i15 = i6;
            int i27 = i26 | RendererDebugBridge.CAPTURE_HEIGHT;
            i16 = i5 & 8192;
            if (i16 == 0) {
                i17 = i26 | 3456;
            } else if ((i4 & 3072) == 0) {
                i17 = i27 | (xq2Var2.f(r94Var) ? 2048 : 1024);
            } else {
                i17 = i27;
            }
            if ((i4 & 24576) == 0) {
                i17 |= xq2Var2.f(cn6Var) ? 16384 : 8192;
            }
            if ((i4 & i7) == 0) {
                i17 |= xq2Var2.h(zv0Var) ? 131072 : 65536;
            }
            if (!xq2Var2.S(i15 & 1, (i15 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
                xq2Var2.X();
                int i28 = i3 & 1;
                vs0 vs0Var = ox0.a;
                if (i28 != 0 && !xq2Var2.B()) {
                    xq2Var2.V();
                    if ((i5 & 512) != 0) {
                        i21 = i15 & (-1879048193);
                        i22 = i2;
                        qn2Var4 = qn2Var2;
                        r94Var3 = r94Var;
                    } else {
                        i22 = i2;
                        qn2Var4 = qn2Var2;
                        r94Var3 = r94Var;
                        i21 = i15;
                    }
                    i23 = i9;
                    z5 = z3;
                    vh3Var4 = vh3Var2;
                    wq7Var3 = wq7Var;
                } else {
                    if (i25 != 0) {
                        z3 = true;
                    }
                    if (i8 != 0) {
                        vh3Var2 = vh3.b;
                    }
                    if ((i5 & 512) != 0) {
                        i19 = z2 ? 1 : Integer.MAX_VALUE;
                        i20 = i15 & (-1879048193);
                    } else {
                        i19 = i9;
                        i20 = i15;
                    }
                    int i29 = i11 != 0 ? 1 : i2;
                    wq7 wq7Var4 = i14 != 0 ? xd5.v0 : wq7Var;
                    int i30 = i19;
                    Object P = xq2Var2.P();
                    if (P == vs0Var) {
                        P = new k4(19);
                        xq2Var2.l0(P);
                    }
                    qn2 qn2Var5 = (qn2) P;
                    r94 r94Var4 = i16 != 0 ? null : r94Var;
                    i21 = i20;
                    z5 = z3;
                    vh3Var4 = vh3Var2;
                    wq7Var3 = wq7Var4;
                    r94Var3 = r94Var4;
                    i22 = i29;
                    qn2Var4 = qn2Var5;
                    i23 = i30;
                }
                xq2Var2.q();
                Object P2 = xq2Var2.P();
                if (P2 == vs0Var) {
                    P2 = np2.Y(new c37(str, 6, 0L));
                    xq2Var2.l0(P2);
                }
                qa4 qa4Var = (qa4) P2;
                c37 c37Var = (c37) qa4Var.getValue();
                int i31 = i23;
                int i32 = i22;
                c37 c37Var2 = new c37(new fp(str), c37Var.b, c37Var.c);
                boolean f = xq2Var2.f(c37Var2);
                Object P3 = xq2Var2.P();
                if (f || P3 == vs0Var) {
                    P3 = new q6(11, c37Var2, qa4Var);
                    xq2Var2.l0(P3);
                }
                mb3.n((on2) P3, xq2Var2);
                boolean z6 = (i21 & 14) == 4;
                Object P4 = xq2Var2.P();
                if (z6 || P4 == vs0Var) {
                    P4 = np2.Y(str);
                    xq2Var2.l0(P4);
                }
                qa4 qa4Var2 = (qa4) P4;
                l33 a2 = xh3Var.a(z2);
                boolean z7 = !z2;
                int i33 = z2 ? 1 : i32;
                int i34 = z2 ? 1 : i31;
                boolean f2 = xq2Var2.f(qa4Var2) | ((i21 & 112) == 32);
                Object P5 = xq2Var2.P();
                if (f2 || P5 == vs0Var) {
                    P5 = new t00(qn2Var, qa4Var, qa4Var2, 2);
                    xq2Var2.l0(P5);
                }
                int i35 = i17 << 9;
                xq2Var = xq2Var2;
                hf.c(c37Var2, (qn2) P5, a74Var, s47Var, wq7Var3, qn2Var4, r94Var3, cn6Var, z7, i34, i33, a2, vh3Var4, z5, zv0Var, xq2Var, (i21 & 896) | ((i21 >> 6) & 7168) | (i35 & 57344) | (i35 & 458752) | (3670016 & i35) | (i35 & 29360128), ((i21 >> 15) & 896) | (i21 & 7168) | (i21 & 57344) | (i17 & 458752));
                i9 = i31;
                i18 = i32;
                wq7Var2 = wq7Var3;
                qn2Var3 = qn2Var4;
                r94Var2 = r94Var3;
                vh3Var3 = vh3Var4;
                z4 = z5;
            } else {
                xq2Var = xq2Var2;
                xq2Var.V();
                i18 = i2;
                wq7Var2 = wq7Var;
                z4 = z3;
                vh3Var3 = vh3Var2;
                qn2Var3 = qn2Var2;
                r94Var2 = r94Var;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: i30
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int a0 = ii2.a0(i3 | 1);
                        int a02 = ii2.a0(i4);
                        k30.b(str, qn2Var, a74Var, z4, s47Var, xh3Var, vh3Var3, z2, i9, i18, wq7Var2, qn2Var3, r94Var2, cn6Var, zv0Var, (px0) obj, a0, a02, i5);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z;
        if ((i5 & 16) == 0) {
        }
        if ((i3 & 196608) != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i8 = i5 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & 805306368) != 0) {
        }
        i10 = i5 & 1024;
        if (i10 == 0) {
        }
        i13 = i5 & 2048;
        if (i13 == 0) {
        }
        int i262 = i12;
        i15 = i6;
        int i272 = i262 | RendererDebugBridge.CAPTURE_HEIGHT;
        i16 = i5 & 8192;
        if (i16 == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        if ((i4 & i7) == 0) {
        }
        if (!xq2Var2.S(i15 & 1, (i15 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }
}
