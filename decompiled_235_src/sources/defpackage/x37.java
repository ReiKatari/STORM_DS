package defpackage;

import com.github.junrar.unpack.decode.Compress;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x37  reason: default package */
/* loaded from: classes.dex */
public abstract class x37 {
    public static final py0 a = new py0(new kt5(12));

    public static final void a(s47 s47Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-13499697);
        if ((i & 6) == 0) {
            if (xq2Var.f(s47Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
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
        if (xq2Var.S(i2 & 1, z)) {
            py0 py0Var = a;
            hv.d(py0Var.a(((s47) xq2Var.j(py0Var)).d(s47Var)), eo2Var, xq2Var, (i2 & 112) | 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(s47Var, i, 13, eo2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, a74 a74Var, long j, long j2, oj2 oj2Var, li2 li2Var, long j3, wz6 wz6Var, long j4, int i, boolean z, int i2, int i3, qn2 qn2Var, s47 s47Var, px0 px0Var, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        oj2 oj2Var2;
        int i11;
        li2 li2Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        xq2 xq2Var;
        final a74 a74Var2;
        final long j6;
        final long j7;
        final int i24;
        final int i25;
        final qn2 qn2Var2;
        final s47 s47Var2;
        final oj2 oj2Var3;
        final li2 li2Var3;
        final int i26;
        final boolean z3;
        final long j8;
        final long j9;
        final wz6 wz6Var2;
        cf5 t;
        a74 a74Var3;
        long j10;
        long j11;
        wz6 wz6Var3;
        int i27;
        int i28;
        int i29;
        qn2 qn2Var3;
        s47 s47Var3;
        long c;
        boolean e;
        Object P;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1028090691);
        if ((i4 & 6) == 0) {
            i7 = (xq2Var2.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i30 = i6 & 2;
        if (i30 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= xq2Var2.f(a74Var) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= RendererDebugBridge.CAPTURE_HEIGHT;
            } else if ((i4 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                i7 |= xq2Var2.e(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= xq2Var2.e(j5) ? 2048 : 1024;
                }
            }
            if ((i6 & 16) == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= xq2Var2.f(null) ? 16384 : 8192;
            }
            i10 = i6 & 32;
            if (i10 == 0) {
                i7 |= 196608;
                oj2Var2 = oj2Var;
            } else {
                oj2Var2 = oj2Var;
                if ((i4 & 196608) == 0) {
                    i7 |= xq2Var2.f(oj2Var2) ? 131072 : 65536;
                }
            }
            i11 = i6 & 64;
            int i31 = 524288;
            if (i11 == 0) {
                i7 |= 1572864;
                li2Var2 = li2Var;
            } else {
                li2Var2 = li2Var;
                if ((i4 & 1572864) == 0) {
                    i7 |= xq2Var2.f(li2Var2) ? 1048576 : 524288;
                }
            }
            i12 = i6 & 128;
            if (i12 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i7 |= xq2Var2.e(j3) ? 8388608 : Compress.MAXWINSIZE;
            }
            if ((i6 & 256) == 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i7 |= xq2Var2.f(null) ? 67108864 : 33554432;
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i7 |= xq2Var2.f(wz6Var) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i15 = i5 | (xq2Var2.e(j4) ? 4 : 2);
                } else {
                    i15 = i5;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i16;
                } else if ((i5 & 48) == 0) {
                    i17 = i16;
                    i15 |= xq2Var2.d(i) ? 32 : 16;
                } else {
                    i17 = i16;
                }
                int i32 = i15;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i32 |= RendererDebugBridge.CAPTURE_HEIGHT;
                } else if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                    z2 = z;
                    i32 |= xq2Var2.g(z2) ? 256 : 128;
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                        i20 = i32 | 3072;
                    } else {
                        int i33 = i32;
                        if ((i5 & 3072) == 0) {
                            i20 = i33 | (xq2Var2.d(i2) ? 2048 : 1024);
                        } else {
                            i20 = i33;
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                        i22 = i20 | 24576;
                    } else {
                        i22 = i20;
                        if ((i5 & 24576) == 0) {
                            i22 |= xq2Var2.d(i3) ? 16384 : 8192;
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                                i22 |= 196608;
                            } else if ((i5 & 196608) == 0) {
                                i22 |= xq2Var2.h(qn2Var) ? 131072 : 65536;
                            }
                            if ((i5 & 1572864) == 0) {
                                if ((i6 & 65536) == 0 && xq2Var2.f(s47Var)) {
                                    i31 = 1048576;
                                }
                                i22 |= i31;
                            }
                            if (xq2Var2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 599187) != 599186)) {
                                xq2Var2.X();
                                if ((i4 & 1) != 0 && !xq2Var2.B()) {
                                    xq2Var2.V();
                                    if ((i6 & 65536) != 0) {
                                        i22 &= -3670017;
                                    }
                                    a74Var3 = a74Var;
                                    j10 = j;
                                    j11 = j3;
                                    wz6Var3 = wz6Var;
                                    j7 = j4;
                                    i27 = i;
                                    i28 = i2;
                                    i29 = i3;
                                    qn2Var3 = qn2Var;
                                } else {
                                    a74Var3 = i30 != 0 ? x64.a : a74Var;
                                    j10 = i8 != 0 ? kt0.h : j;
                                    if (i9 != 0) {
                                        j5 = x47.c;
                                    }
                                    if (i10 != 0) {
                                        oj2Var2 = null;
                                    }
                                    if (i11 != 0) {
                                        li2Var2 = null;
                                    }
                                    j11 = i12 != 0 ? x47.c : j3;
                                    wz6Var3 = i13 != 0 ? null : wz6Var;
                                    j7 = i14 != 0 ? x47.c : j4;
                                    i27 = i17 != 0 ? 1 : i;
                                    if (i18 != 0) {
                                        z2 = true;
                                    }
                                    i28 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                    i29 = i21 == 0 ? i3 : 1;
                                    qn2Var3 = i23 != 0 ? null : qn2Var;
                                    if ((i6 & 65536) != 0) {
                                        s47Var3 = (s47) xq2Var2.j(a);
                                        i22 &= -3670017;
                                        xq2Var2.q();
                                        a74 a74Var4 = a74Var3;
                                        long j12 = ((kt0) xq2Var2.j(j31.a)).a;
                                        float floatValue = ((Number) xq2Var2.j(g31.a)).floatValue();
                                        if (j10 == 16) {
                                            c = j10;
                                        } else if (s47Var3.b() != 16) {
                                            c = s47Var3.b();
                                        } else {
                                            c = kt0.c(floatValue, j12);
                                        }
                                        s47 e2 = s47.e(s47Var3, 0L, j5, oj2Var2, li2Var2, j11, wz6Var3 == null ? wz6Var3.a : 0, j7, 16609105);
                                        e = xq2Var2.e(c);
                                        P = xq2Var2.P();
                                        s47 s47Var4 = s47Var3;
                                        if (!e || P == ox0.a) {
                                            P = new w37(0, c);
                                            xq2Var2.l0(P);
                                        }
                                        int i34 = i22 << 9;
                                        jw2.b(str, a74Var4, e2, qn2Var3, i27, z2, i28, i29, (lt0) P, xq2Var2, (i7 & 126) | ((i22 >> 6) & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (i34 & 29360128), 512);
                                        xq2Var = xq2Var2;
                                        s47Var2 = s47Var4;
                                        a74Var2 = a74Var4;
                                        oj2Var3 = oj2Var2;
                                        i26 = i27;
                                        i24 = i28;
                                        i25 = i29;
                                        j6 = j10;
                                        qn2Var2 = qn2Var3;
                                        li2 li2Var4 = li2Var2;
                                        z3 = z2;
                                        wz6Var2 = wz6Var3;
                                        j9 = j11;
                                        j8 = j5;
                                        li2Var3 = li2Var4;
                                    }
                                }
                                s47Var3 = s47Var;
                                xq2Var2.q();
                                a74 a74Var42 = a74Var3;
                                long j122 = ((kt0) xq2Var2.j(j31.a)).a;
                                float floatValue2 = ((Number) xq2Var2.j(g31.a)).floatValue();
                                if (j10 == 16) {
                                }
                                s47 e22 = s47.e(s47Var3, 0L, j5, oj2Var2, li2Var2, j11, wz6Var3 == null ? wz6Var3.a : 0, j7, 16609105);
                                e = xq2Var2.e(c);
                                P = xq2Var2.P();
                                s47 s47Var42 = s47Var3;
                                if (!e) {
                                }
                                P = new w37(0, c);
                                xq2Var2.l0(P);
                                int i342 = i22 << 9;
                                jw2.b(str, a74Var42, e22, qn2Var3, i27, z2, i28, i29, (lt0) P, xq2Var2, (i7 & 126) | ((i22 >> 6) & 7168) | (57344 & i342) | (458752 & i342) | (3670016 & i342) | (i342 & 29360128), 512);
                                xq2Var = xq2Var2;
                                s47Var2 = s47Var42;
                                a74Var2 = a74Var42;
                                oj2Var3 = oj2Var2;
                                i26 = i27;
                                i24 = i28;
                                i25 = i29;
                                j6 = j10;
                                qn2Var2 = qn2Var3;
                                li2 li2Var42 = li2Var2;
                                z3 = z2;
                                wz6Var2 = wz6Var3;
                                j9 = j11;
                                j8 = j5;
                                li2Var3 = li2Var42;
                            } else {
                                xq2Var = xq2Var2;
                                xq2Var.V();
                                a74Var2 = a74Var;
                                j6 = j;
                                j7 = j4;
                                i24 = i2;
                                i25 = i3;
                                qn2Var2 = qn2Var;
                                s47Var2 = s47Var;
                                oj2Var3 = oj2Var2;
                                li2Var3 = li2Var2;
                                i26 = i;
                                z3 = z2;
                                j8 = j5;
                                j9 = j3;
                                wz6Var2 = wz6Var;
                            }
                            t = xq2Var.t();
                            if (t != null) {
                                t.d = new eo2() { // from class: u37
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int a0 = ii2.a0(i4 | 1);
                                        int a02 = ii2.a0(i5);
                                        x37.b(str, a74Var2, j6, j8, oj2Var3, li2Var3, j9, wz6Var2, j7, i26, z3, i24, i25, qn2Var2, s47Var2, (px0) obj, a0, a02, i6);
                                        return jg7.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if (xq2Var2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 599187) != 599186)) {
                    }
                    t = xq2Var.t();
                    if (t != null) {
                    }
                }
                z2 = z;
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if (xq2Var2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 599187) != 599186)) {
                }
                t = xq2Var.t();
                if (t != null) {
                }
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i322 = i15;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            z2 = z;
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if (xq2Var2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 599187) != 599186)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        if ((i6 & 16) == 0) {
        }
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        i11 = i6 & 64;
        int i312 = 524288;
        if (i11 == 0) {
        }
        i12 = i6 & 128;
        if (i12 == 0) {
        }
        if ((i6 & 256) == 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3222 = i15;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        z2 = z;
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if (xq2Var2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 599187) != 599186)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final fp fpVar, a74 a74Var, long j, long j2, oj2 oj2Var, long j3, long j4, int i, boolean z, int i2, int i3, Map map, qn2 qn2Var, s47 s47Var, px0 px0Var, final int i4, final int i5, final int i6) {
        a74 a74Var2;
        int i7;
        long j5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        int i15;
        int i16;
        zt1 zt1Var;
        int i17;
        int i18;
        xq2 xq2Var;
        final long j6;
        final boolean z2;
        final qn2 qn2Var2;
        final s47 s47Var2;
        final int i19;
        final a74 a74Var3;
        final long j7;
        final Map map2;
        final oj2 oj2Var2;
        final long j8;
        final long j9;
        final int i20;
        cf5 t;
        a74 a74Var4;
        long j10;
        oj2 oj2Var3;
        s47 s47Var3;
        qn2 qn2Var3;
        int i21;
        Map map3;
        int i22;
        boolean z3;
        int i23;
        int i24;
        long j11;
        long j12;
        long c;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(744129681);
        int i25 = i4 | (xq2Var2.f(fpVar) ? 4 : 2);
        int i26 = i6 & 2;
        if (i26 != 0) {
            i25 |= 48;
        } else if ((i4 & 48) == 0) {
            a74Var2 = a74Var;
            i25 |= xq2Var2.f(a74Var2) ? 32 : 16;
            i7 = i6 & 4;
            if (i7 == 0) {
                i8 = i25 | RendererDebugBridge.CAPTURE_HEIGHT;
                j5 = j;
            } else {
                j5 = j;
                i8 = i25 | (xq2Var2.e(j5) ? 256 : 128);
            }
            int i27 = i8 | 27648;
            i9 = i6 & 32;
            if (i9 == 0) {
                i27 = 224256 | i8;
            } else if ((i4 & 196608) == 0) {
                i27 |= xq2Var2.f(oj2Var) ? 131072 : 65536;
                i10 = i27 | 920125440;
                int i28 = i5 | 6;
                i11 = i6 & 2048;
                if (i11 != 0) {
                    i28 = 54;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i5 & 48) == 0) {
                        i28 |= xq2Var2.d(i12) ? 32 : 16;
                    }
                }
                int i29 = i28;
                int i30 = i29 | RendererDebugBridge.CAPTURE_HEIGHT;
                i13 = i6 & 8192;
                if (i13 != 0) {
                    i15 = i29 | 3456;
                    i14 = i2;
                } else {
                    i14 = i2;
                    i15 = i30 | (xq2Var2.d(i14) ? 2048 : 1024);
                }
                int i31 = i15 | 24576;
                i16 = i6 & 32768;
                if (i16 != 0) {
                    i17 = 221184 | i15;
                    zt1Var = map;
                } else {
                    zt1Var = map;
                    i17 = i31 | (xq2Var2.h(zt1Var) ? 131072 : 65536);
                }
                i18 = i17 | 1572864 | (((i6 & 131072) == 0 || !xq2Var2.f(s47Var)) ? Compress.MAXWINSIZE : 8388608);
                if (xq2Var2.S(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 4793491) != 4793490)) {
                    xq2Var2.X();
                    int i32 = i4 & 1;
                    vs0 vs0Var = ox0.a;
                    if (i32 != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                        }
                        oj2Var3 = oj2Var;
                        z3 = z;
                        qn2Var3 = qn2Var;
                        s47Var3 = s47Var;
                        a74Var4 = a74Var2;
                        i21 = i14;
                        map3 = zt1Var;
                        i22 = i18;
                        j10 = j2;
                        j12 = j4;
                        i23 = i3;
                        i24 = i12;
                        j11 = j3;
                    } else {
                        a74Var4 = i26 != 0 ? x64.a : a74Var2;
                        if (i7 != 0) {
                            j5 = kt0.h;
                        }
                        j10 = x47.c;
                        oj2Var3 = i9 != 0 ? null : oj2Var;
                        if (i11 != 0) {
                            i12 = 1;
                        }
                        if (i13 != 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        if (i16 != 0) {
                            zt1Var = zt1.A;
                        }
                        Object P = xq2Var2.P();
                        if (P == vs0Var) {
                            P = new h37(1);
                            xq2Var2.l0(P);
                        }
                        qn2 qn2Var4 = (qn2) P;
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            qn2Var3 = qn2Var4;
                            s47Var3 = (s47) xq2Var2.j(a);
                        } else {
                            s47Var3 = s47Var;
                            qn2Var3 = qn2Var4;
                        }
                        i21 = i14;
                        map3 = zt1Var;
                        i22 = i18;
                        z3 = true;
                        i23 = 1;
                        i24 = i12;
                        j11 = j10;
                        j12 = j11;
                    }
                    xq2Var2.q();
                    oj2 oj2Var4 = oj2Var3;
                    long j13 = ((kt0) xq2Var2.j(j31.a)).a;
                    a74 a74Var5 = a74Var4;
                    float floatValue = ((Number) xq2Var2.j(g31.a)).floatValue();
                    if (j5 != 16) {
                        c = j5;
                    } else if (s47Var3.b() != 16) {
                        c = s47Var3.b();
                    } else {
                        c = kt0.c(floatValue, j13);
                    }
                    long j14 = j11;
                    long g = ((ut0) xq2Var2.j(vt0.a)).g();
                    boolean e = xq2Var2.e(g);
                    Object P2 = xq2Var2.P();
                    if (e || P2 == vs0Var) {
                        P2 = new g47(new nn6(g, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, b17.c, (ge6) null, 61438), null, null, null);
                        xq2Var2.l0(P2);
                    }
                    g47 g47Var = (g47) P2;
                    boolean f = ((i10 & 14) == 4) | xq2Var2.f(g47Var);
                    Object P3 = xq2Var2.P();
                    if (f || P3 == vs0Var) {
                        P3 = fpVar.b(new ro5(g47Var, 20));
                        xq2Var2.l0(P3);
                    }
                    fp fpVar2 = (fp) P3;
                    long j15 = j12;
                    s47 s47Var4 = s47Var3;
                    s47 e2 = s47.e(s47Var4, 0L, j10, oj2Var4, null, j14, 0, j15, 16609105);
                    boolean e3 = xq2Var2.e(c);
                    Object P4 = xq2Var2.P();
                    if (e3 || P4 == vs0Var) {
                        P4 = new w37(1, c);
                        xq2Var2.l0(P4);
                    }
                    int i33 = i22 << 9;
                    int i34 = i24;
                    boolean z4 = z3;
                    int i35 = i21;
                    int i36 = i23;
                    Map map4 = map3;
                    qn2 qn2Var5 = qn2Var3;
                    jw2.a(fpVar2, a74Var5, e2, qn2Var5, i34, z4, i35, i36, map4, (lt0) P4, xq2Var2, (i10 & 112) | 3072 | (57344 & i33) | 196608 | (3670016 & i33) | 12582912 | (i33 & 234881024));
                    a74Var3 = a74Var5;
                    i14 = i35;
                    xq2Var = xq2Var2;
                    qn2Var2 = qn2Var5;
                    i19 = i34;
                    s47Var2 = s47Var4;
                    map2 = map4;
                    z2 = z4;
                    i20 = i36;
                    oj2Var2 = oj2Var4;
                    j6 = j10;
                    j7 = j5;
                    j8 = j14;
                    j9 = j15;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    j6 = j2;
                    z2 = z;
                    qn2Var2 = qn2Var;
                    s47Var2 = s47Var;
                    i19 = i12;
                    a74Var3 = a74Var2;
                    j7 = j5;
                    map2 = zt1Var;
                    oj2Var2 = oj2Var;
                    j8 = j3;
                    j9 = j4;
                    i20 = i3;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: v37
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(i4 | 1);
                            int a02 = ii2.a0(i5);
                            x37.c(fp.this, a74Var3, j7, j6, oj2Var2, j8, j9, i19, z2, i14, i20, map2, qn2Var2, s47Var2, (px0) obj, a0, a02, i6);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            i10 = i27 | 920125440;
            int i282 = i5 | 6;
            i11 = i6 & 2048;
            if (i11 != 0) {
            }
            int i292 = i282;
            int i302 = i292 | RendererDebugBridge.CAPTURE_HEIGHT;
            i13 = i6 & 8192;
            if (i13 != 0) {
            }
            int i312 = i15 | 24576;
            i16 = i6 & 32768;
            if (i16 != 0) {
            }
            i18 = i17 | 1572864 | (((i6 & 131072) == 0 || !xq2Var2.f(s47Var)) ? Compress.MAXWINSIZE : 8388608);
            if (xq2Var2.S(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 4793491) != 4793490)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        a74Var2 = a74Var;
        i7 = i6 & 4;
        if (i7 == 0) {
        }
        int i272 = i8 | 27648;
        i9 = i6 & 32;
        if (i9 == 0) {
        }
        i10 = i272 | 920125440;
        int i2822 = i5 | 6;
        i11 = i6 & 2048;
        if (i11 != 0) {
        }
        int i2922 = i2822;
        int i3022 = i2922 | RendererDebugBridge.CAPTURE_HEIGHT;
        i13 = i6 & 8192;
        if (i13 != 0) {
        }
        int i3122 = i15 | 24576;
        i16 = i6 & 32768;
        if (i16 != 0) {
        }
        i18 = i17 | 1572864 | (((i6 & 131072) == 0 || !xq2Var2.f(s47Var)) ? Compress.MAXWINSIZE : 8388608);
        if (xq2Var2.S(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 4793491) != 4793490)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }
}
