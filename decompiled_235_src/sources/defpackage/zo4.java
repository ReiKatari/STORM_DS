package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo4  reason: default package */
/* loaded from: classes.dex */
public abstract class zo4 {
    public static final long a = hi2.E(8);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final c37 c37Var, final qn2 qn2Var, final a74 a74Var, boolean z, s47 s47Var, eo2 eo2Var, boolean z2, wq7 wq7Var, final xh3 xh3Var, vh3 vh3Var, boolean z3, int i, int i2, ke6 ke6Var, final i17 i17Var, px0 px0Var, final int i3, final int i4, final int i5) {
        int i6;
        s47 s47Var2;
        int i7;
        eo2 eo2Var2;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        xq2 xq2Var;
        final boolean z5;
        final wq7 wq7Var2;
        final boolean z6;
        final int i16;
        final int i17;
        final ke6 ke6Var2;
        final boolean z7;
        final s47 s47Var3;
        final eo2 eo2Var3;
        final vh3 vh3Var2;
        cf5 t;
        s47 s47Var4;
        int i18;
        vh3 vh3Var3;
        int i19;
        ke6 ke6Var3;
        final boolean z8;
        vh3 vh3Var4;
        final eo2 eo2Var4;
        final boolean z9;
        int i20;
        int i21;
        s47 s47Var5;
        final wq7 wq7Var3;
        int i22;
        final boolean z10;
        int i23;
        final ke6 ke6Var4;
        vh3 vh3Var5;
        long j;
        s47 s47Var6;
        boolean z11;
        s47 s47Var7;
        int i24;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-365650761);
        if ((i3 & 6) == 0) {
            i6 = (xq2Var2.f(c37Var) ? 4 : 2) | i3;
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
        int i26 = 1024;
        if (i25 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= xq2Var2.g(z) ? 2048 : 1024;
            if ((i5 & 16) == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= xq2Var2.g(false) ? 16384 : 8192;
            }
            if ((i3 & 196608) != 0) {
                if ((i5 & 32) == 0) {
                    s47Var2 = s47Var;
                    if (xq2Var2.f(s47Var2)) {
                        i24 = 131072;
                        i6 |= i24;
                    }
                } else {
                    s47Var2 = s47Var;
                }
                i24 = 65536;
                i6 |= i24;
            } else {
                s47Var2 = s47Var;
            }
            i7 = i5 & 64;
            if (i7 == 0) {
                i6 |= 1572864;
                eo2Var2 = eo2Var;
            } else {
                eo2Var2 = eo2Var;
                if ((i3 & 1572864) == 0) {
                    i6 |= xq2Var2.h(eo2Var2) ? 1048576 : 524288;
                }
            }
            i8 = i5 & 128;
            int i27 = Compress.MAXWINSIZE;
            if (i8 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i6 |= xq2Var2.h(null) ? 8388608 : 4194304;
            }
            int i28 = 33554432;
            if ((i5 & 256) == 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i6 |= xq2Var2.h(null) ? 67108864 : 33554432;
            }
            if ((i5 & 512) == 0) {
                i6 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i6 |= xq2Var2.h(null) ? 536870912 : 268435456;
            }
            i9 = i5 & 1024;
            if (i9 == 0) {
                i10 = i4 | 6;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i4 & 6) == 0) {
                    i10 = i4 | (xq2Var2.g(z4) ? 4 : 2);
                } else {
                    i10 = i4;
                }
            }
            i11 = i5 & 2048;
            if (i11 == 0) {
                i10 |= 48;
            } else if ((i4 & 48) == 0) {
                i10 |= xq2Var2.f(wq7Var) ? 32 : 16;
            }
            if ((i4 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                i10 |= xq2Var2.f(xh3Var) ? 256 : 128;
            }
            if ((i4 & 3072) == 0) {
                if ((i5 & 8192) == 0 && xq2Var2.f(vh3Var)) {
                    i26 = 2048;
                }
                i10 |= i26;
            }
            int i29 = i10;
            i12 = i5 & 16384;
            if (i12 == 0) {
                i13 = i29 | 24576;
            } else {
                i13 = i29;
                if ((i4 & 24576) == 0) {
                    i13 |= xq2Var2.g(z3) ? 16384 : 8192;
                    if ((i4 & 196608) == 0) {
                        i13 |= ((i5 & 32768) == 0 && xq2Var2.d(i)) ? 131072 : 65536;
                    }
                    i14 = i5 & 65536;
                    if (i14 != 0) {
                        i13 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i13 |= xq2Var2.d(i2) ? 1048576 : 524288;
                    }
                    if ((i5 & 131072) != 0) {
                        i13 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        if (xq2Var2.f(null)) {
                            i27 = 8388608;
                        }
                        i13 |= i27;
                    }
                    if ((i4 & 100663296) == 0) {
                        if ((i5 & 262144) == 0 && xq2Var2.f(ke6Var)) {
                            i28 = 67108864;
                        }
                        i13 |= i28;
                    }
                    if ((i4 & 805306368) == 0) {
                        i13 |= xq2Var2.f(i17Var) ? 536870912 : 268435456;
                    }
                    i15 = i13;
                    if (xq2Var2.S(i6 & 1, (i6 & 306783379) == 306783378 || (i15 & 306783379) != 306783378)) {
                        xq2Var2.X();
                        if ((i3 & 1) != 0 && !xq2Var2.B()) {
                            xq2Var2.V();
                            if ((i5 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i5 & 8192) != 0) {
                                i15 &= -7169;
                            }
                            if ((i5 & 32768) != 0) {
                                i15 &= -458753;
                            }
                            if ((i5 & 262144) != 0) {
                                i15 &= -234881025;
                            }
                            wq7Var3 = wq7Var;
                            vh3Var4 = vh3Var;
                            i23 = i;
                            i22 = i2;
                            ke6Var4 = ke6Var;
                            i20 = i15;
                            i21 = i6;
                            s47Var5 = s47Var2;
                            eo2Var4 = eo2Var2;
                            z10 = z3;
                            z9 = z4;
                            z8 = z;
                        } else {
                            boolean z12 = i25 != 0 ? true : z;
                            if ((i5 & 32) != 0) {
                                s47Var4 = (s47) xq2Var2.j(x37.a);
                                i6 &= -458753;
                            } else {
                                s47Var4 = s47Var2;
                            }
                            if (i7 != 0) {
                                eo2Var2 = null;
                            }
                            if (i9 != 0) {
                                z4 = false;
                            }
                            wq7 wq7Var4 = i11 != 0 ? xd5.v0 : wq7Var;
                            if ((i5 & 8192) != 0) {
                                i18 = -234881025;
                                vh3Var3 = new vh3(63, null);
                                i15 &= -7169;
                            } else {
                                i18 = -234881025;
                                vh3Var3 = vh3Var;
                            }
                            boolean z13 = i12 != 0 ? false : z3;
                            if ((i5 & 32768) != 0) {
                                i19 = z13 ? 1 : Integer.MAX_VALUE;
                                i15 &= -458753;
                            } else {
                                i19 = i;
                            }
                            int i30 = i14 != 0 ? 1 : i2;
                            if ((i5 & 262144) != 0) {
                                ke6Var3 = ((ye6) xq2Var2.j(ze6.a)).a;
                                i15 &= i18;
                            } else {
                                ke6Var3 = ke6Var;
                            }
                            boolean z14 = z4;
                            z8 = z12;
                            vh3Var4 = vh3Var3;
                            eo2Var4 = eo2Var2;
                            z9 = z14;
                            i20 = i15;
                            i21 = i6;
                            s47Var5 = s47Var4;
                            wq7Var3 = wq7Var4;
                            i22 = i30;
                            z10 = z13;
                            i23 = i19;
                            ke6Var4 = ke6Var3;
                        }
                        xq2Var2.q();
                        xq2Var2.b0(-1063705564);
                        Object P = xq2Var2.P();
                        vs0 vs0Var = ox0.a;
                        if (P == vs0Var) {
                            P = i61.f(xq2Var2);
                        }
                        final r94 r94Var = (r94) P;
                        xq2Var2.p(false);
                        xq2Var2.b0(796976005);
                        long b2 = s47Var5.b();
                        if (b2 != 16) {
                            vh3Var5 = vh3Var4;
                            j = b2;
                        } else {
                            vh3Var5 = vh3Var4;
                            j = ((kt0) i17Var.b(z8, xq2Var2).getValue()).a;
                        }
                        xq2Var2.p(false);
                        s47 d = s47Var5.d(new s47(j, 0L, null, 0L, 0L, 0, 0L, 16777214));
                        qh1 qh1Var = (qh1) xq2Var2.j(ky0.h);
                        a74 a74Var2 = x64.a;
                        if (eo2Var4 != null) {
                            s47Var6 = s47Var5;
                            xq2Var2.b0(-1063234302);
                            Object P2 = xq2Var2.P();
                            if (P2 == vs0Var) {
                                P2 = new x84(23);
                                xq2Var2.l0(P2);
                            }
                            a74Var2 = ge7.S(ua6.a(a74Var2, true, (qn2) P2), RecyclerView.B1, qh1Var.x(a), RecyclerView.B1, RecyclerView.B1, 13);
                            z11 = false;
                            xq2Var2.p(false);
                        } else {
                            s47Var6 = s47Var5;
                            z11 = false;
                            xq2Var2.b0(-1062848941);
                            xq2Var2.p(false);
                        }
                        a74 d2 = a74Var.d(a74Var2);
                        String z15 = ii2.z(xq2Var2, 3);
                        if (z9) {
                            s47Var7 = d;
                            d2 = ua6.a(d2, z11, new c70(z15, 17));
                        } else {
                            s47Var7 = d;
                        }
                        a74 a2 = dj6.a(d2, 280.0f, 56.0f);
                        cn6 cn6Var = new cn6(((kt0) i17Var.c(z9, xq2Var2).getValue()).a);
                        boolean z16 = z9;
                        eo2 eo2Var5 = eo2Var4;
                        ke6 ke6Var5 = ke6Var4;
                        zv0 I = n16.I(-1881867558, new fo2() { // from class: wo4
                            @Override // defpackage.fo2
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                boolean z17;
                                int i31;
                                eo2 eo2Var6 = (eo2) obj;
                                px0 px0Var2 = (px0) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    if (((xq2) px0Var2).h(eo2Var6)) {
                                        i31 = 4;
                                    } else {
                                        i31 = 2;
                                    }
                                    intValue |= i31;
                                }
                                if ((intValue & 19) != 18) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                xq2 xq2Var3 = (xq2) px0Var2;
                                if (xq2Var3.S(intValue & 1, z17)) {
                                    d90 d90Var = d90.F0;
                                    String str = c37.this.a.B;
                                    boolean z18 = z8;
                                    boolean z19 = z9;
                                    r94 r94Var2 = r94Var;
                                    i17 i17Var2 = i17Var;
                                    ke6 ke6Var6 = ke6Var4;
                                    d90Var.j(str, eo2Var6, z18, z10, wq7Var3, r94Var2, z19, eo2Var4, null, ke6Var6, i17Var2, null, n16.I(-185364670, new vo4(z18, z19, r94Var2, i17Var2, ke6Var6, 1), xq2Var3), xq2Var3, (intValue << 3) & 112);
                                } else {
                                    xq2Var3.V();
                                }
                                return jg7.a;
                            }
                        }, xq2Var2);
                        int i31 = i20 << 12;
                        vh3Var2 = vh3Var5;
                        z6 = z10;
                        xq2Var = xq2Var2;
                        i16 = i23;
                        i17 = i22;
                        boolean z17 = z8;
                        wq7 wq7Var5 = wq7Var3;
                        k30.a(c37Var, qn2Var, a2, z17, s47Var7, xh3Var, vh3Var2, z6, i16, i17, wq7Var5, null, r94Var, cn6Var, I, xq2Var, (i21 & 64638) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), ((i20 >> 18) & 14) | 196608 | (i20 & 112));
                        wq7Var2 = wq7Var5;
                        s47Var3 = s47Var6;
                        z5 = z17;
                        z7 = z16;
                        ke6Var2 = ke6Var5;
                        eo2Var3 = eo2Var5;
                    } else {
                        xq2Var = xq2Var2;
                        xq2Var.V();
                        z5 = z;
                        wq7Var2 = wq7Var;
                        z6 = z3;
                        i16 = i;
                        i17 = i2;
                        ke6Var2 = ke6Var;
                        z7 = z4;
                        s47Var3 = s47Var2;
                        eo2Var3 = eo2Var2;
                        vh3Var2 = vh3Var;
                    }
                    t = xq2Var.t();
                    if (t != null) {
                        t.d = new eo2() { // from class: xo4
                            @Override // defpackage.eo2
                            public final Object o(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int a0 = ii2.a0(i3 | 1);
                                int a02 = ii2.a0(i4);
                                zo4.a(c37.this, qn2Var, a74Var, z5, s47Var3, eo2Var3, z7, wq7Var2, xh3Var, vh3Var2, z6, i16, i17, ke6Var2, i17Var, (px0) obj, a0, a02, i5);
                                return jg7.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            if ((i4 & 196608) == 0) {
            }
            i14 = i5 & 65536;
            if (i14 != 0) {
            }
            if ((i5 & 131072) != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i15 = i13;
            if (xq2Var2.S(i6 & 1, (i6 & 306783379) == 306783378 || (i15 & 306783379) != 306783378)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        if ((i5 & 16) == 0) {
        }
        if ((i3 & 196608) != 0) {
        }
        i7 = i5 & 64;
        if (i7 == 0) {
        }
        i8 = i5 & 128;
        int i272 = Compress.MAXWINSIZE;
        if (i8 == 0) {
        }
        int i282 = 33554432;
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        i9 = i5 & 1024;
        if (i9 == 0) {
        }
        i11 = i5 & 2048;
        if (i11 == 0) {
        }
        if ((i4 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i292 = i10;
        i12 = i5 & 16384;
        if (i12 == 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        i14 = i5 & 65536;
        if (i14 != 0) {
        }
        if ((i5 & 131072) != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i15 = i13;
        if (xq2Var2.S(i6 & 1, (i6 & 306783379) == 306783378 || (i15 & 306783379) != 306783378)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, qn2 qn2Var, a74 a74Var, boolean z, s47 s47Var, eo2 eo2Var, eo2 eo2Var2, boolean z2, wq7 wq7Var, xh3 xh3Var, vh3 vh3Var, boolean z3, int i, int i2, ke6 ke6Var, final i17 i17Var, px0 px0Var, int i3, int i4, int i5) {
        int i6;
        eo2 eo2Var3;
        eo2 eo2Var4;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var;
        boolean z5;
        s47 s47Var2;
        wq7 wq7Var2;
        xh3 xh3Var2;
        boolean z6;
        int i12;
        ke6 ke6Var2;
        eo2 eo2Var5;
        eo2 eo2Var6;
        boolean z7;
        vh3 vh3Var2;
        int i13;
        cf5 t;
        s47 s47Var3;
        eo2 eo2Var7;
        int i14;
        int i15;
        int i16;
        y16 y16Var;
        wq7 wq7Var3;
        boolean z8;
        final ke6 ke6Var3;
        final eo2 eo2Var8;
        long j;
        s47 s47Var4;
        boolean z9;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(801000036);
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
        int i17 = i6 | 27648;
        if ((i3 & 196608) == 0) {
            i17 = 93184 | i6;
        }
        int i18 = i5 & 64;
        if (i18 != 0) {
            i17 |= 1572864;
            eo2Var3 = eo2Var;
        } else {
            eo2Var3 = eo2Var;
            if ((i3 & 1572864) == 0) {
                i17 |= xq2Var2.h(eo2Var3) ? 1048576 : 524288;
            }
        }
        int i19 = i5 & 128;
        if (i19 != 0) {
            i17 |= 12582912;
            eo2Var4 = eo2Var2;
        } else {
            eo2Var4 = eo2Var2;
            if ((i3 & 12582912) == 0) {
                i17 |= xq2Var2.h(eo2Var4) ? 8388608 : Compress.MAXWINSIZE;
            }
        }
        int i20 = i17 | 905969664;
        int i21 = i5 & 1024;
        if (i21 != 0) {
            i7 = i4 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i4 & 6) == 0) {
                i7 = i4 | (xq2Var2.g(z4) ? 4 : 2);
            } else {
                i7 = i4;
            }
        }
        int i22 = i5 & 2048;
        if (i22 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= xq2Var2.f(wq7Var) ? 32 : 16;
        }
        int i23 = i7;
        int i24 = i5 & 4096;
        if (i24 != 0) {
            i8 = i23 | RendererDebugBridge.CAPTURE_HEIGHT;
        } else {
            int i25 = i23;
            if ((i4 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                i25 |= xq2Var2.f(xh3Var) ? 256 : 128;
            }
            i8 = i25;
        }
        int i26 = i5 & 8192;
        if (i26 != 0) {
            i9 = i8 | 3072;
        } else {
            int i27 = i8;
            if ((i4 & 3072) == 0) {
                i27 |= xq2Var2.f(vh3Var) ? 2048 : 1024;
            }
            i9 = i27;
        }
        int i28 = i5 & 16384;
        if (i28 != 0) {
            i10 = i9 | 24576;
        } else {
            i10 = i9;
            if ((i4 & 24576) == 0) {
                i10 |= xq2Var2.g(z3) ? 16384 : 8192;
                if ((i4 & 196608) == 0) {
                    i10 |= 65536;
                }
                i11 = i10 | 14155776;
                if ((i4 & 100663296) == 0) {
                    i11 = i10 | 47710208;
                }
                if ((i4 & 805306368) == 0) {
                    i11 |= xq2Var2.f(i17Var) ? 536870912 : 268435456;
                }
                if (!xq2Var2.S(i20 & 1, (i20 & 306783379) == 306783378 || (i11 & 306783379) != 306783378)) {
                    xq2Var2.X();
                    if ((i3 & 1) != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        int i29 = i20 & (-458753);
                        z8 = z;
                        wq7Var3 = wq7Var;
                        xh3Var2 = xh3Var;
                        z6 = z3;
                        i12 = i;
                        y16Var = ke6Var;
                        i15 = i29;
                        i14 = i11 & (-235339777);
                        eo2Var7 = eo2Var4;
                        s47Var3 = s47Var;
                        vh3Var2 = vh3Var;
                        i16 = i2;
                    } else {
                        s47Var3 = (s47) xq2Var2.j(x37.a);
                        int i30 = i20 & (-458753);
                        if (i18 != 0) {
                            eo2Var3 = null;
                        }
                        eo2Var7 = i19 == 0 ? eo2Var4 : null;
                        if (i21 != 0) {
                            z4 = false;
                        }
                        wq7 wq7Var4 = i22 != 0 ? xd5.v0 : wq7Var;
                        xh3 xh3Var3 = i24 != 0 ? xh3.e : xh3Var;
                        vh3Var2 = i26 != 0 ? vh3.b : vh3Var;
                        boolean z10 = i28 != 0 ? false : z3;
                        i14 = i11 & (-235339777);
                        xh3Var2 = xh3Var3;
                        i15 = i30;
                        i16 = 1;
                        i12 = z10 ? 1 : Integer.MAX_VALUE;
                        z6 = z10;
                        y16Var = ((ye6) xq2Var2.j(ze6.a)).a;
                        wq7Var3 = wq7Var4;
                        z8 = true;
                    }
                    xq2Var2.q();
                    xq2Var2.b0(-245181289);
                    Object P = xq2Var2.P();
                    int i31 = i16;
                    vs0 vs0Var = ox0.a;
                    if (P == vs0Var) {
                        P = i61.f(xq2Var2);
                    }
                    final r94 r94Var = (r94) P;
                    xq2Var2.p(false);
                    xq2Var2.b0(961927346);
                    long b2 = s47Var3.b();
                    if (b2 != 16) {
                        ke6Var3 = y16Var;
                        eo2Var8 = eo2Var3;
                        j = b2;
                    } else {
                        ke6Var3 = y16Var;
                        eo2Var8 = eo2Var3;
                        j = ((kt0) i17Var.b(z8, xq2Var2).getValue()).a;
                    }
                    xq2Var2.p(false);
                    s47 d = s47Var3.d(new s47(j, 0L, null, 0L, 0L, 0, 0L, 16777214));
                    qh1 qh1Var = (qh1) xq2Var2.j(ky0.h);
                    a74 a74Var2 = x64.a;
                    if (eo2Var8 != null) {
                        s47Var4 = s47Var3;
                        xq2Var2.b0(-244710027);
                        Object P2 = xq2Var2.P();
                        if (P2 == vs0Var) {
                            P2 = new x84(23);
                            xq2Var2.l0(P2);
                        }
                        a74Var2 = ge7.S(ua6.a(a74Var2, true, (qn2) P2), RecyclerView.B1, qh1Var.x(a), RecyclerView.B1, RecyclerView.B1, 13);
                        z9 = false;
                        xq2Var2.p(false);
                    } else {
                        s47Var4 = s47Var3;
                        z9 = false;
                        xq2Var2.b0(-244324666);
                        xq2Var2.p(false);
                    }
                    a74 d2 = a74Var.d(a74Var2);
                    String z11 = ii2.z(xq2Var2, 3);
                    if (z4) {
                        d2 = ua6.a(d2, z9, new c70(z11, 17));
                    }
                    final boolean z12 = z8;
                    final boolean z13 = z6;
                    final boolean z14 = z4;
                    final wq7 wq7Var5 = wq7Var3;
                    final eo2 eo2Var9 = eo2Var7;
                    int i32 = i14;
                    int i33 = 64638 & i15;
                    int i34 = i32 << 12;
                    i13 = i31;
                    xq2Var = xq2Var2;
                    k30.b(str, qn2Var, dj6.a(d2, 280.0f, 56.0f), z8, d, xh3Var2, vh3Var2, z6, i12, i13, wq7Var3, null, r94Var, new cn6(((kt0) i17Var.c(z4, xq2Var2).getValue()).a), n16.I(-591103097, new fo2() { // from class: to4
                        @Override // defpackage.fo2
                        public final Object e(Object obj, Object obj2, Object obj3) {
                            boolean z15;
                            int i35;
                            eo2 eo2Var10 = (eo2) obj;
                            px0 px0Var2 = (px0) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                if (((xq2) px0Var2).h(eo2Var10)) {
                                    i35 = 4;
                                } else {
                                    i35 = 2;
                                }
                                intValue |= i35;
                            }
                            if ((intValue & 19) != 18) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            xq2 xq2Var3 = (xq2) px0Var2;
                            if (xq2Var3.S(intValue & 1, z15)) {
                                d90 d90Var = d90.F0;
                                boolean z16 = z12;
                                boolean z17 = z14;
                                r94 r94Var2 = r94Var;
                                i17 i17Var2 = i17Var;
                                ke6 ke6Var4 = ke6Var3;
                                d90Var.j(str, eo2Var10, z16, z13, wq7Var5, r94Var2, z17, eo2Var8, eo2Var9, ke6Var4, i17Var2, null, n16.I(-1118701585, new vo4(z16, z17, r94Var2, i17Var2, ke6Var4, 0), xq2Var3), xq2Var3, (intValue << 3) & 112);
                            } else {
                                xq2Var3.V();
                            }
                            return jg7.a;
                        }
                    }, xq2Var2), xq2Var, i33 | (3670016 & i34) | (29360128 & i34) | (i34 & 234881024), ((i32 >> 18) & 14) | 196608 | (i32 & 112), 4096);
                    eo2Var5 = eo2Var8;
                    eo2Var6 = eo2Var9;
                    z5 = z8;
                    wq7Var2 = wq7Var3;
                    s47Var2 = s47Var4;
                    ke6Var2 = ke6Var3;
                    z7 = z14;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    z5 = z;
                    s47Var2 = s47Var;
                    wq7Var2 = wq7Var;
                    xh3Var2 = xh3Var;
                    z6 = z3;
                    i12 = i;
                    ke6Var2 = ke6Var;
                    eo2Var5 = eo2Var3;
                    eo2Var6 = eo2Var4;
                    z7 = z4;
                    vh3Var2 = vh3Var;
                    i13 = i2;
                }
                t = xq2Var.t();
                if (t == null) {
                    t.d = new uo4(str, qn2Var, a74Var, z5, s47Var2, eo2Var5, eo2Var6, z7, wq7Var2, xh3Var2, vh3Var2, z6, i12, i13, ke6Var2, i17Var, i3, i4, i5, 0);
                    return;
                }
                return;
            }
        }
        if ((i4 & 196608) == 0) {
        }
        i11 = i10 | 14155776;
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if (!xq2Var2.S(i20 & 1, (i20 & 306783379) == 306783378 || (i11 & 306783379) != 306783378)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void c(final a74 a74Var, eo2 eo2Var, fo2 fo2Var, eo2 eo2Var2, final eo2 eo2Var3, final eo2 eo2Var4, final boolean z, final float f, final qn2 qn2Var, final zv0 zv0Var, lq4 lq4Var, px0 px0Var, final int i) {
        int i2;
        char c;
        boolean z2;
        eo2 eo2Var5;
        fo2 fo2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kk3 kk3Var;
        boolean z7;
        boolean z8;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final eo2 eo2Var6 = eo2Var2;
        final lq4 lq4Var2 = lq4Var;
        e40 e40Var = d90.Z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(36320288);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(fo2Var)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(eo2Var6)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.h(eo2Var3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(eo2Var4)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var.g(z)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((i & 12582912) == 0) {
            if (xq2Var.c(f)) {
                i5 = 8388608;
            } else {
                i5 = Compress.MAXWINSIZE;
            }
            i2 |= i5;
        }
        if ((i & 100663296) == 0) {
            if (xq2Var.h(qn2Var)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((i & 805306368) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if (xq2Var.f(lq4Var2)) {
            c = 4;
        } else {
            c = 2;
        }
        int i13 = i2;
        char c2 = c;
        if ((i2 & 306783379) == 306783378 && (c2 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (xq2Var.S(i13 & 1, z2)) {
            if ((i13 & 234881024) == 67108864) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i13 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z3 | z4;
            if ((i13 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            if ((c2 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            Object P = xq2Var.P();
            if (z11 || P == ox0.a) {
                P = new bp4(qn2Var, z, f, lq4Var2);
                xq2Var.l0(P);
            }
            bp4 bp4Var = (bp4) P;
            kk3 kk3Var2 = (kk3) xq2Var.j(ky0.n);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, bp4Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            zv0Var.o(xq2Var, Integer.valueOf((i13 >> 27) & 14));
            m64 m64Var = m64.a;
            x64 x64Var = x64.a;
            if (eo2Var3 != null) {
                xq2Var.b0(1336978507);
                a74 D = lb4.D(x64Var, "Leading");
                nq6 nq6Var = u93.a;
                a74 d = D.d(m64Var);
                e34 d2 = h70.d(e40Var, false);
                int B2 = ge7.B(xq2Var);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, d);
                xq2Var.f0();
                kk3Var = kk3Var2;
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d2);
                yh2.K(xq2Var, pnVar2, l2);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                    i61.v(B2, xq2Var, B2, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E2);
                eo2Var3.o(xq2Var, Integer.valueOf((i13 >> 12) & 14));
                xq2Var.p(true);
                z7 = false;
                xq2Var.p(false);
            } else {
                kk3Var = kk3Var2;
                z7 = false;
                xq2Var.b0(1337224523);
                xq2Var.p(false);
            }
            if (eo2Var4 != null) {
                xq2Var.b0(1337267241);
                a74 D2 = lb4.D(x64Var, "Trailing");
                nq6 nq6Var2 = u93.a;
                a74 d3 = D2.d(m64Var);
                e34 d4 = h70.d(e40Var, z7);
                int B3 = ge7.B(xq2Var);
                xv4 l3 = xq2Var.l();
                a74 E3 = l.E(xq2Var, d3);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d4);
                yh2.K(xq2Var, pnVar2, l3);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                    i61.v(B3, xq2Var, B3, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E3);
                eo2Var4.o(xq2Var, Integer.valueOf((i13 >> 15) & 14));
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                xq2Var.b0(1337515179);
                xq2Var.p(z7);
            }
            lq4Var2 = lq4Var;
            kk3 kk3Var3 = kk3Var;
            float r = ge7.r(lq4Var2, kk3Var3);
            float q = ge7.q(lq4Var2, kk3Var3);
            if (eo2Var3 != null) {
                r -= 12.0f;
                if (r < RecyclerView.B1) {
                    r = 0.0f;
                }
            }
            float f2 = r;
            if (eo2Var4 != null) {
                q -= 12.0f;
                if (q < RecyclerView.B1) {
                    q = 0.0f;
                }
            }
            a74 S = ge7.S(x64Var, f2, RecyclerView.B1, q, RecyclerView.B1, 10);
            if (fo2Var != null) {
                xq2Var.b0(1338367152);
                fo2Var2 = fo2Var;
                fo2Var2.e(lb4.D(x64Var, "Hint").d(S), xq2Var, Integer.valueOf((i13 >> 3) & 112));
                xq2Var.p(false);
            } else {
                fo2Var2 = fo2Var;
                xq2Var.b0(1338454603);
                xq2Var.p(false);
            }
            a74 d5 = lb4.D(x64Var, "TextField").d(S);
            e40 e40Var2 = d90.L;
            e34 d6 = h70.d(e40Var2, true);
            int B4 = ge7.B(xq2Var);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, d5);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d6);
            yh2.K(xq2Var, pnVar2, l4);
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B4))) {
                i61.v(B4, xq2Var, B4, pnVar3);
            }
            yh2.K(xq2Var, pnVar4, E4);
            eo2Var5 = eo2Var;
            eo2Var5.o(xq2Var, Integer.valueOf((i13 >> 3) & 14));
            xq2Var.p(true);
            if (eo2Var2 != null) {
                xq2Var.b0(1338685429);
                a74 D3 = lb4.D(x64Var, "Label");
                e34 d7 = h70.d(e40Var2, false);
                int B5 = ge7.B(xq2Var);
                xv4 l5 = xq2Var.l();
                a74 E5 = l.E(xq2Var, D3);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d7);
                yh2.K(xq2Var, pnVar2, l5);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B5))) {
                    i61.v(B5, xq2Var, B5, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E5);
                eo2Var6 = eo2Var2;
                eo2Var6.o(xq2Var, Integer.valueOf((i13 >> 9) & 14));
                z8 = true;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                eo2Var6 = eo2Var2;
                z8 = true;
                xq2Var.b0(1338768075);
                xq2Var.p(false);
            }
            xq2Var.p(z8);
        } else {
            eo2Var5 = eo2Var;
            fo2Var2 = fo2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            final eo2 eo2Var7 = eo2Var5;
            final fo2 fo2Var3 = fo2Var2;
            t.d = new eo2() { // from class: so4
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zo4.c(a74.this, eo2Var7, fo2Var3, eo2Var6, eo2Var3, eo2Var4, z, f, qn2Var, zv0Var, lq4Var2, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, lq4 lq4Var) {
        int max = Math.max(i3, Math.max(i5, oi2.M(f, i4, 0)));
        float d = lq4Var.d() * f2;
        return s21.f(Math.max(i, Math.max(i2, u24.E(oi2.L(d, Math.max(d, i4 / 2.0f), f) + max + (lq4Var.a() * f2)))), j);
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, lq4 lq4Var) {
        int max = Math.max(i3, Math.max(oi2.M(f, i4, 0), i5)) + i + i2;
        kk3 kk3Var = kk3.Ltr;
        return s21.g(Math.max(max, u24.E((i4 + ((lq4Var.c(kk3Var) + lq4Var.b(kk3Var)) * f2)) * f)), j);
    }
}
