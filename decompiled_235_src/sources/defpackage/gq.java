package defpackage;

import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq  reason: default package */
/* loaded from: classes.dex */
public abstract class gq {
    public static final a74 a;
    public static final a74 b;
    public static final gd2 c;

    /* JADX WARN: Type inference failed for: r0v5, types: [gd2, java.lang.Object] */
    static {
        x64 x64Var = x64.a;
        a = dj6.l(x64Var, 12.0f);
        b = dj6.l(dj6.b(x64Var, 1.0f), 68.0f);
        c = new Object();
    }

    public static final void a(long j, long j2, float f, lq4 lq4Var, tt7 tt7Var, a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        a74 a74Var2;
        boolean z;
        xq2 xq2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        jy2 jy2Var = u24.m;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1222317265);
        if ((i & 6) == 0) {
            if (xq2Var2.e(j)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.e(j2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.c(f)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (xq2Var2.f(lq4Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (xq2Var2.f(jy2Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (xq2Var2.f(tt7Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((i & 1572864) == 0) {
            a74Var2 = a74Var;
            if (xq2Var2.f(a74Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            a74Var2 = a74Var;
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
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i2 & 1, z)) {
            int i11 = i2 << 6;
            xq2Var = xq2Var2;
            ej2.c(a74Var2, jy2Var, j, j2, f, n16.I(-1628734195, new cq(tt7Var, lq4Var, zv0Var, 0), xq2Var2), xq2Var, ((i2 >> 18) & 14) | 1572864 | ((i2 >> 9) & 112) | (i11 & 896) | (i11 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new dq(j, j2, f, lq4Var, tt7Var, a74Var, zv0Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final zv0 zv0Var, final tt7 tt7Var, a74 a74Var, final eo2 eo2Var, fo2 fo2Var, final long j, long j2, float f, px0 px0Var, final int i, final int i2) {
        int i3;
        x64 x64Var;
        int i4;
        int i5;
        zv0 zv0Var2;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        boolean z;
        final a74 a74Var2;
        final fo2 fo2Var2;
        final long j4;
        final float f2;
        cf5 t;
        int i10;
        a74 a74Var3;
        long j5;
        float f3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(138090236);
        if ((i & 6) == 0) {
            if (xq2Var.h(zv0Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(tt7Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i3 |= i15;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            x64Var = a74Var;
            if (xq2Var.f(x64Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
            if ((i & 3072) == 0) {
                if (xq2Var.h(eo2Var)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i3 |= i14;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                zv0Var2 = fo2Var;
                if (xq2Var.h(zv0Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
                if ((196608 & i) == 0) {
                    if (xq2Var.e(j)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i3 |= i13;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j2;
                        if (xq2Var.e(j3)) {
                            i12 = 1048576;
                            i3 |= i12;
                        }
                    } else {
                        j3 = j2;
                    }
                    i12 = 524288;
                    i3 |= i12;
                } else {
                    j3 = j2;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (xq2Var.c(f)) {
                        i8 = 8388608;
                    } else {
                        i8 = Compress.MAXWINSIZE;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq2Var.S(i9 & 1, z)) {
                    xq2Var.X();
                    if ((i & 1) != 0 && !xq2Var.B()) {
                        xq2Var.V();
                        if ((i2 & 64) != 0) {
                            i10 = i9 & (-3670017);
                        } else {
                            long j6 = j3;
                            a74Var3 = x64Var;
                            j5 = j6;
                            f3 = f;
                            i11 = i9;
                            fo2 fo2Var3 = zv0Var2;
                            xq2Var.q();
                            int i18 = i11 >> 15;
                            int i19 = i11 << 12;
                            a(j, j5, f3, zp.a, tt7Var, a74Var3, n16.I(-2019867954, new m4(eo2Var, zv0Var, fo2Var3, 1), xq2Var), xq2Var, (i18 & 896) | (i18 & 14) | 12610560 | (i18 & 112) | (458752 & i19) | (i19 & 3670016));
                            fo2Var2 = fo2Var3;
                            f2 = f3;
                            a74Var2 = a74Var3;
                            j4 = j5;
                        }
                    } else {
                        if (i17 != 0) {
                            x64Var = x64.a;
                        }
                        if (i5 != 0) {
                            zv0Var2 = g04.b;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = vt0.b(j, xq2Var);
                            i10 = i9 & (-3670017);
                        } else {
                            i10 = i9;
                        }
                        if (i7 != 0) {
                            pq4 pq4Var = zp.a;
                            long j7 = j3;
                            a74Var3 = x64Var;
                            j5 = j7;
                            f3 = 4.0f;
                            i11 = i10;
                            fo2 fo2Var32 = zv0Var2;
                            xq2Var.q();
                            int i182 = i11 >> 15;
                            int i192 = i11 << 12;
                            a(j, j5, f3, zp.a, tt7Var, a74Var3, n16.I(-2019867954, new m4(eo2Var, zv0Var, fo2Var32, 1), xq2Var), xq2Var, (i182 & 896) | (i182 & 14) | 12610560 | (i182 & 112) | (458752 & i192) | (i192 & 3670016));
                            fo2Var2 = fo2Var32;
                            f2 = f3;
                            a74Var2 = a74Var3;
                            j4 = j5;
                        }
                    }
                    long j8 = j3;
                    a74Var3 = x64Var;
                    j5 = j8;
                    f3 = f;
                    i11 = i10;
                    fo2 fo2Var322 = zv0Var2;
                    xq2Var.q();
                    int i1822 = i11 >> 15;
                    int i1922 = i11 << 12;
                    a(j, j5, f3, zp.a, tt7Var, a74Var3, n16.I(-2019867954, new m4(eo2Var, zv0Var, fo2Var322, 1), xq2Var), xq2Var, (i1822 & 896) | (i1822 & 14) | 12610560 | (i1822 & 112) | (458752 & i1922) | (i1922 & 3670016));
                    fo2Var2 = fo2Var322;
                    f2 = f3;
                    a74Var2 = a74Var3;
                    j4 = j5;
                } else {
                    xq2Var.V();
                    a74Var2 = x64Var;
                    fo2Var2 = zv0Var2;
                    j4 = j3;
                    f2 = f;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: bq
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gq.b(zv0.this, tt7Var, a74Var2, eo2Var, fo2Var2, j, j4, f2, (px0) obj, ii2.a0(i | 1), i2);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            zv0Var2 = fo2Var;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
            }
            if (xq2Var.S(i9 & 1, z)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        x64Var = a74Var;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        zv0Var2 = fo2Var;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i9 = i3;
        if ((i3 & 4793491) != 4793490) {
        }
        if (xq2Var.S(i9 & 1, z)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final zv0 zv0Var, a74 a74Var, final eo2 eo2Var, fo2 fo2Var, final long j, long j2, final float f, px0 px0Var, final int i, final int i2) {
        a74 a74Var2;
        int i3;
        int i4;
        final zv0 zv0Var2;
        int i5;
        final long j3;
        boolean z;
        final a74 a74Var3;
        cf5 t;
        a74 a74Var4;
        int i6;
        int i7;
        int i8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-350082398);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i | 48;
            a74Var2 = a74Var;
        } else if ((i & 48) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            a74Var2 = a74Var;
            i3 = i;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            zv0Var2 = fo2Var;
            if (xq2Var.h(zv0Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
            if ((i & 24576) == 0) {
                if (xq2Var.e(j)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    j3 = j2;
                    if (xq2Var.e(j3)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    j3 = j2;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                j3 = j2;
            }
            if ((599187 & i3) == 599186) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i3 & 1, z)) {
                xq2Var.X();
                if ((i & 1) != 0 && !xq2Var.B()) {
                    xq2Var.V();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i6 = i3;
                    a74Var3 = a74Var2;
                } else {
                    if (i9 != 0) {
                        a74Var4 = x64.a;
                    } else {
                        a74Var4 = a74Var2;
                    }
                    if (i10 != 0) {
                        zv0Var2 = g04.c;
                    }
                    if ((i2 & 32) != 0) {
                        j3 = vt0.b(j, xq2Var);
                        i3 &= -458753;
                    }
                    int i11 = i3;
                    a74Var3 = a74Var4;
                    i6 = i11;
                }
                xq2Var.q();
                int i12 = i6 << 3;
                gd2 gd2Var = c;
                b(zv0Var, gd2Var, a74Var3, eo2Var, zv0Var2, j, j3, f, xq2Var, (i12 & 3670016) | (i12 & 896) | 3126 | (57344 & i12) | (458752 & i12) | 12582912, 0);
            } else {
                xq2Var.V();
                a74Var3 = a74Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: aq
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gq.c(zv0.this, a74Var3, eo2Var, zv0Var2, j, j3, f, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        zv0Var2 = fo2Var;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        if (!xq2Var.S(i3 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }
}
