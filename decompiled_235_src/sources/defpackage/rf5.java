package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf5  reason: default package */
/* loaded from: classes.dex */
public final class rf5 {
    public final te a;
    public final ei b;
    public final v57 c;
    public final ca4 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public fe h;
    public long i;
    public final pj j;
    public final ia4 k;

    public rf5(te teVar) {
        this.a = teVar;
        ei eiVar = new ei(6);
        eiVar.L = new long[192];
        eiVar.R = new long[192];
        this.b = eiVar;
        this.c = new v57();
        this.d = new ca4();
        this.i = -1L;
        this.j = new pj(this, 16);
        this.k = new ia4();
    }

    public static boolean c(eg4 eg4Var) {
        yp4 yp4Var = eg4Var.J0;
        if (yp4Var != null && !nj2.w(((xt2) yp4Var).b())) {
            return true;
        }
        return false;
    }

    public static long e(sm3 sm3Var) {
        if0 if0Var = sm3Var.B0;
        eg4 eg4Var = (eg4) if0Var.e;
        long j = 0;
        for (eg4 eg4Var2 = (y53) if0Var.d; eg4Var2 != null && eg4Var2 != eg4Var; eg4Var2 = eg4Var2.o0) {
            if (c(eg4Var2)) {
                return 9223372034707292159L;
            }
            j = i93.c(j, eg4Var2.x0);
        }
        return j;
    }

    public static void h(sm3 sm3Var) {
        if (sm3Var.L && !c((eg4) sm3Var.B0.e)) {
            sm3Var.L = false;
            if (sm3Var.X) {
                sm3Var.R = e(sm3Var);
                sm3Var.X = false;
            }
            if (!i93.a(sm3Var.R, 9223372034707292159L)) {
                ua4 z = sm3Var.z();
                Object[] objArr = z.A;
                int i = z.L;
                for (int i2 = 0; i2 < i; i2++) {
                    h((sm3) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        boolean z2;
        long j;
        ei eiVar;
        int i;
        long j2;
        long j3;
        int i2;
        long b;
        long[] jArr;
        boolean z3;
        long j4;
        long j5;
        fe feVar = this.h;
        if (feVar != null) {
            this.a.removeCallbacks(feVar);
            this.h = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z4 = this.e;
        if (!z4 && !this.f) {
            z = false;
        } else {
            z = true;
        }
        ei eiVar2 = this.b;
        boolean z5 = true;
        v57 v57Var = this.c;
        if (z4) {
            this.e = false;
            ca4 ca4Var = this.d;
            Object[] objArr = ca4Var.a;
            int i3 = ca4Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((on2) objArr[i4]).c();
            }
            long[] jArr2 = (long[]) eiVar2.L;
            int i5 = eiVar2.B;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z6 = z5;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    u57 u57Var = (u57) v57Var.a.b(((int) j6) & 33554431);
                    while (u57Var != null) {
                        u57 u57Var2 = u57Var.d;
                        boolean z7 = z;
                        long j9 = u57Var.g;
                        if (currentTimeMillis - j9 < 0 && j9 != Long.MIN_VALUE) {
                            z3 = false;
                        } else {
                            z3 = z6;
                        }
                        u57Var.e = j7;
                        u57Var.f = j8;
                        if (z3) {
                            u57Var.g = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            u57Var.a(j4, j5, v57Var.d, v57Var.e, v57Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        u57Var = u57Var2;
                        j7 = j4;
                        j8 = j5;
                        z = z7;
                    }
                }
                i6 += 3;
                z5 = z6;
                i5 = i7;
                z = z;
            }
            z2 = z;
            j = 0;
            long[] jArr3 = (long[]) eiVar2.L;
            int i8 = eiVar2.B;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z2 = z;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j10 = v57Var.d;
            long j11 = v57Var.e;
            float[] fArr = v57Var.g;
            p94 p94Var = v57Var.a;
            j2 = 128;
            Object[] objArr2 = p94Var.c;
            long[] jArr4 = p94Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    eiVar = eiVar2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                u57 u57Var3 = (u57) objArr2[(i11 << 3) + i15];
                                while (u57Var3 != null) {
                                    v57Var.a(u57Var3, j12, j11, fArr, currentTimeMillis);
                                    u57Var3 = u57Var3.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    eiVar2 = eiVar;
                    jArr4 = jArr;
                }
                if (z2) {
                    long j15 = v57Var.d;
                    long j16 = v57Var.e;
                    float[] fArr2 = v57Var.g;
                    u57 u57Var4 = v57Var.b;
                    if (u57Var4 != null) {
                        while (u57Var4 != null) {
                            sm3 f0 = nc1.f0(u57Var4.b);
                            u57Var4.e = ((te) vm3.a(f0)).getRectManager().b(f0);
                            d34 d34Var = f0.C0.p;
                            u57Var4.f = ((d34Var.A + ((int) (b >> 32))) << 32) | ((d34Var.B + ((int) (b & 4294967295L))) & 4294967295L);
                            v57Var.a(u57Var4, j15, j16, fArr2, currentTimeMillis);
                            u57Var4 = u57Var4.d;
                        }
                    }
                }
                if (!this.g) {
                    i2 = 0;
                    this.g = false;
                    ei eiVar3 = eiVar;
                    long[] jArr6 = (long[]) eiVar3.L;
                    int i17 = eiVar3.B;
                    long[] jArr7 = (long[]) eiVar3.R;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != qf5.a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    eiVar3.B = i18;
                    eiVar3.L = jArr7;
                    eiVar3.R = jArr6;
                } else {
                    i2 = 0;
                }
                if (v57Var.c <= currentTimeMillis) {
                    p94 p94Var2 = v57Var.a;
                    Object[] objArr3 = p94Var2.c;
                    long[] jArr8 = p94Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (u57 u57Var5 = (u57) objArr3[(i21 << 3) + i23]; u57Var5 != null; u57Var5 = u57Var5.d) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            }
                            i21++;
                        }
                    }
                    u57 u57Var6 = v57Var.b;
                    if (u57Var6 != null) {
                        while (u57Var6 != null) {
                            u57Var6 = u57Var6.d;
                        }
                    }
                    v57Var.c = -1L;
                }
                if (v57Var.c <= j) {
                    i();
                    return;
                }
                return;
            }
            eiVar = eiVar2;
            i = 8;
        } else {
            eiVar = eiVar2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z2) {
        }
        if (!this.g) {
        }
        if (v57Var.c <= currentTimeMillis) {
        }
        if (v57Var.c <= j) {
        }
    }

    public final long b(sm3 sm3Var) {
        long j;
        int i = sm3Var.B & 33554431;
        ei eiVar = this.b;
        long[] jArr = (long[]) eiVar.L;
        int i2 = eiVar.B;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public final void d(sm3 sm3Var) {
        d34 d34Var;
        boolean z;
        int i;
        long b;
        boolean z2 = true;
        sm3Var.L = true;
        if0 if0Var = sm3Var.B0;
        eg4 eg4Var = (eg4) if0Var.e;
        int d0 = sm3Var.C0.p.d0();
        ia4 ia4Var = this.k;
        ia4Var.a = RecyclerView.B1;
        ia4Var.b = RecyclerView.B1;
        ia4Var.c = d0;
        ia4Var.d = d34Var.Z();
        while (true) {
            if (eg4Var == null) {
                break;
            }
            sm3 sm3Var2 = eg4Var.k0;
            if (eg4Var == ((eg4) sm3Var2.B0.e) && !sm3Var2.L) {
                if (!i93.a(b(sm3Var2), 9223372034707292159L)) {
                    ia4Var.c((Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            yp4 yp4Var = eg4Var.J0;
            if (yp4Var != null) {
                float[] b2 = ((xt2) yp4Var).b();
                if (!nj2.w(b2)) {
                    v24.c(b2, ia4Var);
                }
            }
            long j = eg4Var.x0;
            ia4Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            eg4Var = eg4Var.o0;
        }
        int i2 = (int) ia4Var.a;
        int i3 = (int) ia4Var.b;
        int i4 = (int) ia4Var.c;
        int i5 = (int) ia4Var.d;
        int i6 = sm3Var.B;
        boolean z3 = sm3Var.Z;
        sm3Var.Z = true;
        ei eiVar = this.b;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) eiVar.L;
            int i8 = eiVar.B;
            int i9 = 0;
            while (i9 < jArr.length - 2 && i9 < i8) {
                int i10 = i9 + 2;
                long j2 = jArr[i10];
                z = z2;
                if ((((int) j2) & 33554431) == i7) {
                    jArr[i9] = (i2 << 32) | (i3 & 4294967295L);
                    jArr[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
                    jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i9 += 3;
                z2 = z;
            }
        }
        z = z2;
        sm3 v = sm3Var.v();
        if (v != null) {
            i = v.B;
        } else {
            i = -1;
        }
        ei.h(eiVar, i6, i2, i3, i4, i5, i, if0Var.g(1024), if0Var.g(16), this.c.a.a(i6), 512);
        sm3Var.Y = false;
        this.e = z;
        ua4 z4 = sm3Var.z();
        Object[] objArr = z4.A;
        int i11 = z4.L;
        for (int i12 = 0; i12 < i11; i12++) {
            sm3 sm3Var3 = (sm3) objArr[i12];
            if (sm3Var3.I()) {
                d(sm3Var3);
            }
        }
    }

    public final void f(sm3 sm3Var) {
        long j;
        boolean z;
        boolean z2;
        boolean I = sm3Var.I();
        if0 if0Var = sm3Var.B0;
        if (I && sm3Var.Y) {
            sm3 v = sm3Var.v();
            if (v != null && !v.L) {
                if (v.X) {
                    v.X = false;
                    v.R = e(v);
                }
                j = v.R;
            } else if (v == null) {
                j = 0;
            } else {
                j = 9223372034707292159L;
            }
            eg4 eg4Var = (eg4) if0Var.e;
            if (!i93.a(j, 9223372034707292159L) && !c(eg4Var)) {
                if (!sm3Var.L) {
                    long c = i93.c(j, eg4Var.x0);
                    d34 d34Var = sm3Var.C0.p;
                    int d0 = d34Var.d0();
                    int Z = d34Var.Z();
                    int i = sm3Var.B;
                    boolean z3 = sm3Var.Z;
                    ei eiVar = this.b;
                    long j2 = 4294967295L;
                    if (z3) {
                        if (v != null) {
                            int i2 = v.B;
                            int i3 = (int) (c >> 32);
                            int i4 = (int) (c & 4294967295L);
                            int i5 = i & 33554431;
                            long[] jArr = (long[]) eiVar.L;
                            int i6 = eiVar.B;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= jArr.length - 2 || i7 >= i6) {
                                    break;
                                }
                                long j3 = j2;
                                if ((((int) jArr[i7 + 2]) & 33554431) == i2) {
                                    long j4 = jArr[i7];
                                    int i8 = ((int) (j4 >> 32)) + i3;
                                    int i9 = ((int) j4) + i4;
                                    int i10 = i8 + d0;
                                    int i11 = i9 + Z;
                                    i7 += 3;
                                    while (i7 < jArr.length - 2 && i7 < i6) {
                                        int i12 = i7 + 2;
                                        int i13 = i2;
                                        int i14 = i3;
                                        long j5 = jArr[i12];
                                        int i15 = i4;
                                        if ((((int) j5) & 33554431) == i5) {
                                            long j6 = jArr[i7];
                                            long[] jArr2 = jArr;
                                            int i16 = i8 - ((int) (j6 >> 32));
                                            int i17 = i9 - ((int) j6);
                                            jArr2[i7] = (i9 & j3) | (i8 << 32);
                                            jArr2[i7 + 1] = (i10 << 32) | (i11 & j3);
                                            jArr2[i12] = j5 | (((j5 >> 63) & 1) << 60);
                                            if (i16 != 0 || i17 != 0) {
                                                int i18 = qf5.b;
                                                eiVar.l((j5 & (-1125899873288193L)) | (((i7 + 3) & 33554431) << 25), i16, i17);
                                            }
                                        } else {
                                            i7 += 3;
                                            i2 = i13;
                                            i3 = i14;
                                            i4 = i15;
                                        }
                                    }
                                }
                                i7 += 3;
                                jArr = jArr;
                                j2 = j3;
                                i2 = i2;
                                i3 = i3;
                                i4 = i4;
                            }
                        } else {
                            int i19 = (int) (c >> 32);
                            int i20 = (int) (c & 4294967295L);
                            int i21 = d0 + i19;
                            int i22 = i20 + Z;
                            int i23 = i & 33554431;
                            long[] jArr3 = (long[]) eiVar.L;
                            int i24 = eiVar.B;
                            int i25 = 0;
                            while (true) {
                                if (i25 >= jArr3.length - 2 || i25 >= i24) {
                                    break;
                                }
                                int i26 = i25 + 2;
                                long j7 = jArr3[i26];
                                if ((((int) j7) & 33554431) == i23) {
                                    long j8 = jArr3[i25];
                                    int i27 = i25;
                                    jArr3[i27] = (i19 << 32) | (i20 & 4294967295L);
                                    jArr3[i27 + 1] = (i21 << 32) | (i22 & 4294967295L);
                                    jArr3[i26] = (((j7 >> 63) & 1) << 60) | j7;
                                    int i28 = i19 - ((int) (j8 >> 32));
                                    int i29 = i20 - ((int) j8);
                                    if (i28 != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i29 != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z | z2) {
                                        int i30 = qf5.b;
                                        eiVar.l((j7 & (-1125899873288193L)) | (((i27 + 3) & 33554431) << 25), i28, i29);
                                    }
                                } else {
                                    i25 += 3;
                                }
                            }
                        }
                    } else {
                        sm3Var.Z = true;
                        boolean g = if0Var.g(1024);
                        boolean g2 = if0Var.g(16);
                        boolean a = this.c.a.a(i);
                        if (v != null) {
                            int i31 = v.B;
                            int i32 = (int) (c >> 32);
                            int i33 = (int) (c & 4294967295L);
                            int i34 = i & 33554431;
                            long[] jArr4 = (long[]) eiVar.L;
                            int i35 = eiVar.B - 3;
                            while (true) {
                                if (i35 < 0) {
                                    break;
                                } else if ((((int) jArr4[i35 + 2]) & 33554431) == i31) {
                                    long j9 = jArr4[i35];
                                    int i36 = ((int) (j9 >> 32)) + i32;
                                    int i37 = ((int) j9) + i33;
                                    eiVar.g(i34, i36, i37, i36 + d0, i37 + Z, i31, g, g2, a, i35);
                                    break;
                                } else {
                                    i35 -= 3;
                                }
                            }
                        } else {
                            int i38 = (int) (c >> 32);
                            int i39 = (int) (c & 4294967295L);
                            ei.h(eiVar, i, i38, i39, i38 + d0, i39 + Z, 0, g, g2, a, 544);
                        }
                    }
                } else {
                    d(sm3Var);
                    h(sm3Var);
                }
            } else {
                d(sm3Var);
            }
            sm3Var.Y = false;
            this.e = true;
            i();
        }
    }

    public final void g(sm3 sm3Var) {
        if (sm3Var.Z) {
            int i = sm3Var.B & 33554431;
            ei eiVar = this.b;
            long[] jArr = (long[]) eiVar.L;
            int i2 = eiVar.B;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = qf5.a;
                    break;
                }
                i3 += 3;
            }
            sm3Var.Z = false;
            sm3Var.Y = true;
            this.e = true;
            this.g = true;
        }
    }

    public final void i() {
        boolean z;
        fe feVar = this.h;
        if (feVar != null) {
            z = true;
        } else {
            z = false;
        }
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            te teVar = this.a;
            if (feVar != null) {
                teVar.removeCallbacks(feVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.i = max;
            fe feVar2 = new fe(0, this.j);
            teVar.postDelayed(feVar2, max - currentTimeMillis);
            this.h = feVar2;
        }
    }
}
