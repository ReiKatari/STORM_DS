package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v56  reason: default package */
/* loaded from: classes.dex */
public abstract class v56 {
    public static final nq6 a = new l55(new kt5(5));
    public static final float b = 16.0f;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [tt7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a74 a74Var, x56 x56Var, eo2 eo2Var, eo2 eo2Var2, fo2 fo2Var, eo2 eo2Var3, int i, boolean z, ke6 ke6Var, float f, long j, long j2, long j3, final long j4, long j5, final zv0 zv0Var, px0 px0Var, final int i2, final int i3, final int i4) {
        x64 x64Var;
        int i5;
        eo2 eo2Var4;
        int i6;
        fo2 fo2Var2;
        int i7;
        int i8;
        xq2 xq2Var;
        final x56 x56Var2;
        final zv0 zv0Var2;
        final zv0 zv0Var3;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final a74 a74Var2;
        final eo2 eo2Var5;
        final fo2 fo2Var3;
        final int i9;
        final boolean z2;
        final y16 y16Var;
        cf5 t;
        long a2;
        int i10;
        xq2 xq2Var2;
        int i11;
        int i12;
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(1135600301);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i2 | 6;
            x64Var = a74Var;
        } else {
            x64Var = a74Var;
            i5 = (xq2Var3.f(x64Var) ? 4 : 2) | i2;
        }
        int i14 = i5 | 16;
        int i15 = i4 & 4;
        if (i15 != 0) {
            i14 = i5 | 400;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            eo2Var4 = eo2Var;
            i14 |= xq2Var3.h(eo2Var4) ? 256 : 128;
            int i16 = i14 | 3072;
            i6 = i4 & 16;
            if (i6 == 0) {
                i16 = i14 | 27648;
            } else if ((i2 & 24576) == 0) {
                fo2Var2 = fo2Var;
                i16 |= xq2Var3.h(fo2Var2) ? 16384 : 8192;
                i7 = i16 | 920322048;
                int i17 = i3 | 9394;
                if ((196608 & i3) == 0) {
                    i17 |= xq2Var3.e(j4) ? 131072 : 65536;
                }
                i8 = i17 | 524288;
                boolean z3 = true;
                if (xq2Var3.S(i7 & 1, (306783379 & i7) == 306783378 || (4793491 & i8) != 4793490)) {
                    xq2Var3.X();
                    if ((i2 & 1) != 0 && !xq2Var3.B()) {
                        xq2Var3.V();
                        int i18 = i7 & (-113);
                        int i19 = i8 & (-3735439);
                        x56Var2 = x56Var;
                        z3 = z;
                        j6 = j;
                        j7 = j2;
                        a2 = j3;
                        j9 = j5;
                        xq2Var2 = xq2Var3;
                        i10 = i18;
                        eo2Var5 = eo2Var4;
                        fo2Var3 = fo2Var2;
                        i11 = i19;
                        zv0Var2 = eo2Var2;
                        zv0Var3 = eo2Var3;
                        i12 = i;
                        y16Var = ke6Var;
                        f2 = f;
                    } else {
                        if (i13 != 0) {
                            x64Var = x64.a;
                        }
                        x56 d = d(null, xq2Var3, 3);
                        int i20 = i7 & (-113);
                        if (i15 != 0) {
                            eo2Var4 = hf.h;
                        }
                        zv0 zv0Var4 = hf.i;
                        if (i6 != 0) {
                            fo2Var2 = hf.j;
                        }
                        zv0 zv0Var5 = hf.k;
                        y16 y16Var2 = ((ye6) xq2Var3.j(ze6.a)).c;
                        float f3 = cp1.a;
                        long j10 = ((ut0) xq2Var3.j(vt0.a)).j();
                        long b2 = vt0.b(j10, xq2Var3);
                        a2 = cp1.a(xq2Var3);
                        long b3 = vt0.b(j4, xq2Var3);
                        i10 = i20;
                        xq2Var2 = xq2Var3;
                        zv0Var2 = zv0Var4;
                        f2 = f3;
                        i11 = i8 & (-3735439);
                        zv0Var3 = zv0Var5;
                        j6 = j10;
                        x56Var2 = d;
                        eo2Var5 = eo2Var4;
                        fo2Var3 = fo2Var2;
                        y16Var = y16Var2;
                        j7 = b2;
                        j9 = b3;
                        i12 = 2;
                    }
                    xq2Var2.q();
                    int i21 = (i10 << 3) & 2147483632;
                    int i22 = ((i11 << 3) & 3670016) | 100663686;
                    xq2 xq2Var4 = xq2Var2;
                    a74Var2 = x64Var;
                    i9 = i12;
                    z2 = z3;
                    j8 = a2;
                    b(new Object(), a74Var2, x56Var2, eo2Var5, zv0Var2, fo2Var3, zv0Var3, i9, z2, y16Var, f2, j6, j7, j8, j4, j9, zv0Var, xq2Var4, i21, i22, 0);
                    xq2Var = xq2Var4;
                } else {
                    xq2Var = xq2Var3;
                    xq2Var.V();
                    x56Var2 = x56Var;
                    zv0Var2 = eo2Var2;
                    zv0Var3 = eo2Var3;
                    f2 = f;
                    j6 = j;
                    j7 = j2;
                    j8 = j3;
                    j9 = j5;
                    a74Var2 = x64Var;
                    eo2Var5 = eo2Var4;
                    fo2Var3 = fo2Var2;
                    i9 = i;
                    z2 = z;
                    y16Var = ke6Var;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: t56
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(i2 | 1);
                            int a02 = ii2.a0(i3);
                            v56.a(a74.this, x56Var2, eo2Var5, zv0Var2, fo2Var3, zv0Var3, i9, z2, y16Var, f2, j6, j7, j8, j4, j9, zv0Var, (px0) obj, a0, a02, i4);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            fo2Var2 = fo2Var;
            i7 = i16 | 920322048;
            int i172 = i3 | 9394;
            if ((196608 & i3) == 0) {
            }
            i8 = i172 | 524288;
            boolean z32 = true;
            if (xq2Var3.S(i7 & 1, (306783379 & i7) == 306783378 || (4793491 & i8) != 4793490)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        eo2Var4 = eo2Var;
        int i162 = i14 | 3072;
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        fo2Var2 = fo2Var;
        i7 = i162 | 920322048;
        int i1722 = i3 | 9394;
        if ((196608 & i3) == 0) {
        }
        i8 = i1722 | 524288;
        boolean z322 = true;
        if (xq2Var3.S(i7 & 1, (306783379 & i7) == 306783378 || (4793491 & i8) != 4793490)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final tt7 tt7Var, a74 a74Var, x56 x56Var, final eo2 eo2Var, eo2 eo2Var2, fo2 fo2Var, eo2 eo2Var3, int i, boolean z, ke6 ke6Var, float f, long j, long j2, long j3, final long j4, long j5, final zv0 zv0Var, px0 px0Var, final int i2, final int i3, final int i4) {
        int i5;
        a74 a74Var2;
        x56 x56Var2;
        int i6;
        eo2 eo2Var4;
        int i7;
        fo2 fo2Var2;
        int i8;
        eo2 eo2Var5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final int i17;
        final long j6;
        final long j7;
        final eo2 eo2Var6;
        final fo2 fo2Var3;
        final a74 a74Var3;
        final x56 x56Var3;
        final eo2 eo2Var7;
        xq2 xq2Var;
        final boolean z2;
        final ke6 ke6Var2;
        final float f2;
        final long j8;
        final long j9;
        cf5 t;
        x56 x56Var4;
        int i18;
        a74 a74Var4;
        long j10;
        int i19;
        final int i20;
        ke6 ke6Var3;
        long j11;
        a74 a74Var5;
        final fo2 fo2Var4;
        final eo2 eo2Var8;
        long j12;
        long j13;
        final eo2 eo2Var9;
        float f3;
        final long j14;
        boolean z3;
        final x56 x56Var5;
        boolean z4;
        Object P;
        int i21;
        int i22;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(50073903);
        if ((i2 & 6) == 0) {
            i5 = (xq2Var2.f(tt7Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i23 = i4 & 2;
        if (i23 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            a74Var2 = a74Var;
            i5 |= xq2Var2.f(a74Var2) ? 32 : 16;
            if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) != 0) {
                if ((i4 & 4) == 0) {
                    x56Var2 = x56Var;
                    if (xq2Var2.f(x56Var2)) {
                        i22 = 256;
                        i5 |= i22;
                    }
                } else {
                    x56Var2 = x56Var;
                }
                i22 = 128;
                i5 |= i22;
            } else {
                x56Var2 = x56Var;
            }
            int i24 = 1024;
            if ((i2 & 3072) == 0) {
                i5 |= xq2Var2.h(eo2Var) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            int i25 = 8192;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                eo2Var4 = eo2Var2;
                i5 |= xq2Var2.h(eo2Var4) ? 16384 : 8192;
                i7 = i4 & 32;
                int i26 = 65536;
                if (i7 != 0) {
                    i5 |= 196608;
                    fo2Var2 = fo2Var;
                } else {
                    fo2Var2 = fo2Var;
                    if ((i2 & 196608) == 0) {
                        i5 |= xq2Var2.h(fo2Var2) ? 131072 : 65536;
                    }
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    eo2Var5 = eo2Var3;
                } else {
                    eo2Var5 = eo2Var3;
                    if ((i2 & 1572864) == 0) {
                        i5 |= xq2Var2.h(eo2Var5) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                int i27 = Compress.MAXWINSIZE;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i10 = i5 | (xq2Var2.d(i) ? 8388608 : 4194304);
                    if ((i4 & 256) == 0) {
                        i10 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i10 |= xq2Var2.g(false) ? 67108864 : 33554432;
                    }
                    if ((i4 & 512) == 0) {
                        i10 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i10 |= xq2Var2.h(null) ? 536870912 : 268435456;
                    }
                    i11 = i10;
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                        i13 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i13 = i3 | (xq2Var2.g(z) ? 4 : 2);
                    } else {
                        i13 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        if ((i4 & 2048) == 0 && xq2Var2.f(ke6Var)) {
                            i21 = 32;
                            i13 |= i21;
                        }
                        i21 = 16;
                        i13 |= i21;
                    }
                    int i28 = i13;
                    i14 = i4 & 4096;
                    if (i14 == 0) {
                        i15 = i28 | RendererDebugBridge.CAPTURE_HEIGHT;
                    } else {
                        i15 = i28;
                        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                            i15 |= xq2Var2.c(f) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                i16 = i14;
                                if ((i4 & 8192) == 0 && xq2Var2.e(j)) {
                                    i24 = 2048;
                                }
                                i15 |= i24;
                            } else {
                                i16 = i14;
                            }
                            if ((i3 & 24576) == 0) {
                                if ((i4 & 16384) == 0 && xq2Var2.e(j2)) {
                                    i25 = 16384;
                                }
                                i15 |= i25;
                            }
                            if ((i3 & 196608) == 0) {
                                if ((i4 & 32768) == 0 && xq2Var2.e(j3)) {
                                    i26 = 131072;
                                }
                                i15 |= i26;
                            }
                            if ((i3 & 1572864) == 0) {
                                i15 |= xq2Var2.e(j4) ? 1048576 : 524288;
                            }
                            if ((i3 & 12582912) == 0) {
                                if ((i4 & 131072) == 0 && xq2Var2.e(j5)) {
                                    i27 = 8388608;
                                }
                                i15 |= i27;
                            }
                            if ((i3 & 100663296) == 0) {
                                i15 |= xq2Var2.h(zv0Var) ? 67108864 : 33554432;
                            }
                            if (xq2Var2.S(i11 & 1, (306783379 & i11) == 306783378 || (i15 & 38347923) != 38347922)) {
                                xq2Var2.X();
                                if ((i2 & 1) != 0 && !xq2Var2.B()) {
                                    xq2Var2.V();
                                    if ((i4 & 4) != 0) {
                                        i11 &= -897;
                                    }
                                    x56 x56Var6 = x56Var2;
                                    fo2Var4 = fo2Var2;
                                    eo2Var8 = eo2Var5;
                                    x56Var5 = x56Var6;
                                    i20 = i;
                                    z3 = z;
                                    ke6Var3 = ke6Var;
                                    f3 = f;
                                    j13 = j;
                                    j12 = j2;
                                    j11 = j3;
                                    i19 = i11;
                                    a74Var5 = a74Var2;
                                    j14 = j5;
                                } else {
                                    a74 a74Var6 = i23 != 0 ? x64.a : a74Var2;
                                    if ((i4 & 4) != 0) {
                                        x56Var4 = d(null, xq2Var2, 3);
                                        i11 &= -897;
                                    } else {
                                        x56Var4 = x56Var2;
                                    }
                                    if (i6 != 0) {
                                        eo2Var4 = hf.e;
                                    }
                                    if (i7 != 0) {
                                        fo2Var2 = hf.f;
                                    }
                                    eo2 eo2Var10 = i8 != 0 ? hf.g : eo2Var5;
                                    int i29 = i9 != 0 ? 2 : i;
                                    boolean z5 = i12 != 0 ? true : z;
                                    ke6 ke6Var4 = (i4 & 2048) != 0 ? ((ye6) xq2Var2.j(ze6.a)).c : ke6Var;
                                    float f4 = i16 != 0 ? cp1.a : f;
                                    if ((i4 & 8192) != 0) {
                                        i18 = i11;
                                        a74Var4 = a74Var6;
                                        j10 = ((ut0) xq2Var2.j(vt0.a)).j();
                                    } else {
                                        i18 = i11;
                                        a74Var4 = a74Var6;
                                        j10 = j;
                                    }
                                    long b2 = (i4 & 16384) != 0 ? vt0.b(j10, xq2Var2) : j2;
                                    long a2 = (i4 & 32768) != 0 ? cp1.a(xq2Var2) : j3;
                                    if ((i4 & 131072) != 0) {
                                        j13 = j10;
                                        j14 = vt0.b(j4, xq2Var2);
                                        j12 = b2;
                                        j11 = a2;
                                        i19 = i18;
                                        i20 = i29;
                                        ke6Var3 = ke6Var4;
                                        f3 = f4;
                                        a74Var5 = a74Var4;
                                        fo2Var4 = fo2Var2;
                                        eo2Var8 = eo2Var10;
                                        z3 = z5;
                                        x56Var5 = x56Var4;
                                    } else {
                                        i19 = i18;
                                        i20 = i29;
                                        ke6Var3 = ke6Var4;
                                        j11 = a2;
                                        a74Var5 = a74Var4;
                                        fo2Var4 = fo2Var2;
                                        eo2Var8 = eo2Var10;
                                        j12 = b2;
                                        j13 = j10;
                                        eo2Var9 = eo2Var4;
                                        f3 = f4;
                                        j14 = j5;
                                        z3 = z5;
                                        x56Var5 = x56Var4;
                                        xq2Var2.q();
                                        z4 = (i19 & 14) == 4;
                                        P = xq2Var2.P();
                                        if (!z4 || P == ox0.a) {
                                            P = new wa4(tt7Var);
                                            xq2Var2.l0(P);
                                        }
                                        final wa4 wa4Var = (wa4) P;
                                        zv0 I = n16.I(-1236753028, new fo2() { // from class: r56
                                            @Override // defpackage.fo2
                                            public final Object e(Object obj, Object obj2, Object obj3) {
                                                boolean z6;
                                                int i30;
                                                a74 a74Var7 = (a74) obj;
                                                px0 px0Var2 = (px0) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                if ((intValue & 6) == 0) {
                                                    if (((xq2) px0Var2).f(a74Var7)) {
                                                        i30 = 4;
                                                    } else {
                                                        i30 = 2;
                                                    }
                                                    intValue |= i30;
                                                }
                                                if ((intValue & 19) != 18) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                xq2 xq2Var3 = (xq2) px0Var2;
                                                if (xq2Var3.S(intValue & 1, z6)) {
                                                    wa4 wa4Var2 = wa4.this;
                                                    boolean f5 = xq2Var3.f(wa4Var2);
                                                    tt7 tt7Var2 = tt7Var;
                                                    boolean f6 = f5 | xq2Var3.f(tt7Var2);
                                                    Object P2 = xq2Var3.P();
                                                    if (f6 || P2 == ox0.a) {
                                                        P2 = new qk4(16, wa4Var2, tt7Var2);
                                                        xq2Var3.l0(P2);
                                                    }
                                                    ej2.c(q60.Q(a74Var7, (qn2) P2), null, j4, j14, RecyclerView.B1, n16.I(-1761194824, new n91(i20, eo2Var, zv0Var, eo2Var8, wa4Var2, eo2Var9, fo2Var4, x56Var5), xq2Var3), xq2Var3, 1572864, 50);
                                                } else {
                                                    xq2Var3.V();
                                                }
                                                return jg7.a;
                                            }
                                        }, xq2Var2);
                                        xq2Var2.b0(1400739380);
                                        I.e(a74Var5, xq2Var2, Integer.valueOf(((i19 >> 3) & 14) | 48));
                                        xq2Var2.p(false);
                                        i17 = i20;
                                        eo2Var7 = eo2Var8;
                                        x56Var3 = x56Var5;
                                        a74Var3 = a74Var5;
                                        xq2Var = xq2Var2;
                                        z2 = z3;
                                        ke6Var2 = ke6Var3;
                                        j9 = j12;
                                        j6 = j11;
                                        long j15 = j14;
                                        eo2Var6 = eo2Var9;
                                        fo2Var3 = fo2Var4;
                                        f2 = f3;
                                        j8 = j13;
                                        j7 = j15;
                                    }
                                }
                                eo2Var9 = eo2Var4;
                                xq2Var2.q();
                                if ((i19 & 14) == 4) {
                                }
                                P = xq2Var2.P();
                                if (!z4) {
                                }
                                P = new wa4(tt7Var);
                                xq2Var2.l0(P);
                                final wa4 wa4Var2 = (wa4) P;
                                zv0 I2 = n16.I(-1236753028, new fo2() { // from class: r56
                                    @Override // defpackage.fo2
                                    public final Object e(Object obj, Object obj2, Object obj3) {
                                        boolean z6;
                                        int i30;
                                        a74 a74Var7 = (a74) obj;
                                        px0 px0Var2 = (px0) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        if ((intValue & 6) == 0) {
                                            if (((xq2) px0Var2).f(a74Var7)) {
                                                i30 = 4;
                                            } else {
                                                i30 = 2;
                                            }
                                            intValue |= i30;
                                        }
                                        if ((intValue & 19) != 18) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        xq2 xq2Var3 = (xq2) px0Var2;
                                        if (xq2Var3.S(intValue & 1, z6)) {
                                            wa4 wa4Var22 = wa4.this;
                                            boolean f5 = xq2Var3.f(wa4Var22);
                                            tt7 tt7Var2 = tt7Var;
                                            boolean f6 = f5 | xq2Var3.f(tt7Var2);
                                            Object P2 = xq2Var3.P();
                                            if (f6 || P2 == ox0.a) {
                                                P2 = new qk4(16, wa4Var22, tt7Var2);
                                                xq2Var3.l0(P2);
                                            }
                                            ej2.c(q60.Q(a74Var7, (qn2) P2), null, j4, j14, RecyclerView.B1, n16.I(-1761194824, new n91(i20, eo2Var, zv0Var, eo2Var8, wa4Var22, eo2Var9, fo2Var4, x56Var5), xq2Var3), xq2Var3, 1572864, 50);
                                        } else {
                                            xq2Var3.V();
                                        }
                                        return jg7.a;
                                    }
                                }, xq2Var2);
                                xq2Var2.b0(1400739380);
                                I2.e(a74Var5, xq2Var2, Integer.valueOf(((i19 >> 3) & 14) | 48));
                                xq2Var2.p(false);
                                i17 = i20;
                                eo2Var7 = eo2Var8;
                                x56Var3 = x56Var5;
                                a74Var3 = a74Var5;
                                xq2Var = xq2Var2;
                                z2 = z3;
                                ke6Var2 = ke6Var3;
                                j9 = j12;
                                j6 = j11;
                                long j152 = j14;
                                eo2Var6 = eo2Var9;
                                fo2Var3 = fo2Var4;
                                f2 = f3;
                                j8 = j13;
                                j7 = j152;
                            } else {
                                xq2Var2.V();
                                i17 = i;
                                j6 = j3;
                                j7 = j5;
                                eo2Var6 = eo2Var4;
                                fo2Var3 = fo2Var2;
                                a74Var3 = a74Var2;
                                x56Var3 = x56Var2;
                                eo2Var7 = eo2Var5;
                                xq2Var = xq2Var2;
                                z2 = z;
                                ke6Var2 = ke6Var;
                                f2 = f;
                                j8 = j;
                                j9 = j2;
                            }
                            t = xq2Var.t();
                            if (t != null) {
                                t.d = new eo2() { // from class: s56
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int a0 = ii2.a0(i2 | 1);
                                        int a02 = ii2.a0(i3);
                                        v56.b(tt7.this, a74Var3, x56Var3, eo2Var, eo2Var6, fo2Var3, eo2Var7, i17, z2, ke6Var2, f2, j8, j9, j6, j4, j7, zv0Var, (px0) obj, a0, a02, i4);
                                        return jg7.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    if (xq2Var2.S(i11 & 1, (306783379 & i11) == 306783378 || (i15 & 38347923) != 38347922)) {
                    }
                    t = xq2Var.t();
                    if (t != null) {
                    }
                }
                i10 = i5;
                if ((i4 & 256) == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                i11 = i10;
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i282 = i13;
                i14 = i4 & 4096;
                if (i14 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if (xq2Var2.S(i11 & 1, (306783379 & i11) == 306783378 || (i15 & 38347923) != 38347922)) {
                }
                t = xq2Var.t();
                if (t != null) {
                }
            }
            eo2Var4 = eo2Var2;
            i7 = i4 & 32;
            int i262 = 65536;
            if (i7 != 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            int i272 = Compress.MAXWINSIZE;
            if (i9 != 0) {
            }
            i10 = i5;
            if ((i4 & 256) == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            i11 = i10;
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i2822 = i13;
            i14 = i4 & 4096;
            if (i14 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if (xq2Var2.S(i11 & 1, (306783379 & i11) == 306783378 || (i15 & 38347923) != 38347922)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        a74Var2 = a74Var;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) != 0) {
        }
        int i242 = 1024;
        if ((i2 & 3072) == 0) {
        }
        i6 = i4 & 16;
        int i252 = 8192;
        if (i6 == 0) {
        }
        eo2Var4 = eo2Var2;
        i7 = i4 & 32;
        int i2622 = 65536;
        if (i7 != 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        int i2722 = Compress.MAXWINSIZE;
        if (i9 != 0) {
        }
        i10 = i5;
        if ((i4 & 256) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        i11 = i10;
        i12 = i4 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i28222 = i13;
        i14 = i4 & 4096;
        if (i14 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if (xq2Var2.S(i11 & 1, (306783379 & i11) == 306783378 || (i15 & 38347923) != 38347922)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final void c(int i, eo2 eo2Var, zv0 zv0Var, zv0 zv0Var2, eo2 eo2Var2, tt7 tt7Var, eo2 eo2Var3, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(675142332);
        if (xq2Var.g(false)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(eo2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(zv0Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(eo2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.f(tt7Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if (xq2Var.h(eo2Var3)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i16 = i15 | i9;
        if ((4793491 & i16) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i16 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new u56();
                xq2Var.l0(P);
            }
            u56 u56Var = (u56) P;
            if ((i16 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((3670016 & i16) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((458752 & i16) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((i16 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z10 | z5;
            if ((i16 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((29360128 & i16) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i16 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            Object P2 = xq2Var.P();
            if (z14 || P2 == vs0Var) {
                n91 n91Var = new n91(eo2Var, zv0Var2, eo2Var2, i, tt7Var, u56Var, eo2Var3, zv0Var);
                xq2Var.l0(n91Var);
                P2 = n91Var;
            }
            mt6.a(null, (eo2) P2, xq2Var, 0, 1);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new e5(i, eo2Var, zv0Var, zv0Var2, eo2Var2, tt7Var, eo2Var3, i2);
        }
    }

    public static final x56 d(gl6 gl6Var, px0 px0Var, int i) {
        ep1 a2 = dp1.a(fp1.Closed, px0Var);
        int i2 = i & 2;
        Object obj = ox0.a;
        if (i2 != 0) {
            xq2 xq2Var = (xq2) px0Var;
            Object P = xq2Var.P();
            if (P == obj) {
                P = new gl6();
                xq2Var.l0(P);
            }
            gl6Var = (gl6) P;
        }
        xq2 xq2Var2 = (xq2) px0Var;
        Object P2 = xq2Var2.P();
        if (P2 == obj) {
            P2 = new x56(a2, gl6Var);
            xq2Var2.l0(P2);
        }
        return (x56) P2;
    }
}
