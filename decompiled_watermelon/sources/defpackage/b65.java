package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b65  reason: default package */
/* loaded from: classes.dex */
public final class b65 {
    public final ee a;
    public final sh b;
    public final et6 c;
    public final w14 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public qd h;
    public long i;
    public final dj j;
    public final c24 k;

    public b65(ee eeVar) {
        this.a = eeVar;
        sh shVar = new sh(6);
        shVar.c = new long[192];
        shVar.d = new long[192];
        this.b = shVar;
        this.c = new et6();
        this.d = new w14();
        this.i = -1L;
        this.j = new dj(16, this);
        this.k = new c24();
    }

    public static boolean c(m74 m74Var) {
        vg4 vg4Var = m74Var.I0;
        if (vg4Var != null && !yf2.B(((tn2) vg4Var).b())) {
            return true;
        }
        return false;
    }

    public static long e(vf3 vf3Var) {
        zc0 zc0Var = vf3Var.A0;
        m74 m74Var = (m74) zc0Var.e;
        long j = 0;
        for (m74 m74Var2 = (vz2) zc0Var.d; m74Var2 != null && m74Var2 != m74Var; m74Var2 = m74Var2.n0) {
            if (c(m74Var2)) {
                return 9223372034707292159L;
            }
            j = a33.c(j, m74Var2.w0);
        }
        return j;
    }

    public static void h(vf3 vf3Var) {
        if (vf3Var.L && !c((m74) vf3Var.A0.e)) {
            vf3Var.L = false;
            if (vf3Var.X) {
                vf3Var.R = e(vf3Var);
                vf3Var.X = false;
            }
            if (!a33.a(vf3Var.R, 9223372034707292159L)) {
                o24 y = vf3Var.y();
                Object[] objArr = y.A;
                int i = y.L;
                for (int i2 = 0; i2 < i; i2++) {
                    h((vf3) objArr[i2]);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b65.a():void");
    }

    public final long b(vf3 vf3Var) {
        long j;
        int i = vf3Var.B & 33554431;
        sh shVar = this.b;
        long[] jArr = (long[]) shVar.c;
        int i2 = shVar.b;
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

    public final void d(vf3 vf3Var) {
        sv3 sv3Var;
        boolean z;
        int i;
        long b;
        boolean z2 = true;
        vf3Var.L = true;
        zc0 zc0Var = vf3Var.A0;
        m74 m74Var = (m74) zc0Var.e;
        int l0 = vf3Var.B0.p.l0();
        c24 c24Var = this.k;
        c24Var.a = RecyclerView.A1;
        c24Var.b = RecyclerView.A1;
        c24Var.c = l0;
        c24Var.d = sv3Var.k0();
        while (true) {
            if (m74Var == null) {
                break;
            }
            vf3 vf3Var2 = m74Var.j0;
            if (m74Var == ((m74) vf3Var2.A0.e) && !vf3Var2.L) {
                if (!a33.a(b(vf3Var2), 9223372034707292159L)) {
                    c24Var.c((Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            vg4 vg4Var = m74Var.I0;
            if (vg4Var != null) {
                float[] b2 = ((tn2) vg4Var).b();
                if (!yf2.B(b2)) {
                    kv3.c(b2, c24Var);
                }
            }
            long j = m74Var.w0;
            c24Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            m74Var = m74Var.n0;
        }
        int i2 = (int) c24Var.a;
        int i3 = (int) c24Var.b;
        int i4 = (int) c24Var.c;
        int i5 = (int) c24Var.d;
        int i6 = vf3Var.B;
        boolean z3 = vf3Var.Z;
        vf3Var.Z = true;
        sh shVar = this.b;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) shVar.c;
            int i8 = shVar.b;
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
        vf3 u = vf3Var.u();
        if (u != null) {
            i = u.B;
        } else {
            i = -1;
        }
        sh.h(shVar, i6, i2, i3, i4, i5, i, zc0Var.g(1024), zc0Var.g(16), this.c.a.a(i6), 512);
        vf3Var.Y = false;
        this.e = z;
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i11 = y.L;
        for (int i12 = 0; i12 < i11; i12++) {
            vf3 vf3Var3 = (vf3) objArr[i12];
            if (vf3Var3.I()) {
                d(vf3Var3);
            }
        }
    }

    public final void f(vf3 vf3Var) {
        long j;
        boolean z;
        boolean z2;
        boolean I = vf3Var.I();
        zc0 zc0Var = vf3Var.A0;
        if (I && vf3Var.Y) {
            vf3 u = vf3Var.u();
            if (u != null && !u.L) {
                if (u.X) {
                    u.X = false;
                    u.R = e(u);
                }
                j = u.R;
            } else if (u == null) {
                j = 0;
            } else {
                j = 9223372034707292159L;
            }
            m74 m74Var = (m74) zc0Var.e;
            if (!a33.a(j, 9223372034707292159L) && !c(m74Var)) {
                if (!vf3Var.L) {
                    long c = a33.c(j, m74Var.w0);
                    sv3 sv3Var = vf3Var.B0.p;
                    int l0 = sv3Var.l0();
                    int k0 = sv3Var.k0();
                    int i = vf3Var.B;
                    boolean z3 = vf3Var.Z;
                    sh shVar = this.b;
                    long j2 = 4294967295L;
                    if (z3) {
                        if (u != null) {
                            int i2 = u.B;
                            int i3 = (int) (c >> 32);
                            int i4 = (int) (c & 4294967295L);
                            int i5 = i & 33554431;
                            long[] jArr = (long[]) shVar.c;
                            int i6 = shVar.b;
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
                                    int i10 = i8 + l0;
                                    int i11 = i9 + k0;
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
                                                int i18 = a65.b;
                                                shVar.l((j5 & (-1125899873288193L)) | (((i7 + 3) & 33554431) << 25), i16, i17);
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
                            int i21 = l0 + i19;
                            int i22 = i20 + k0;
                            int i23 = i & 33554431;
                            long[] jArr3 = (long[]) shVar.c;
                            int i24 = shVar.b;
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
                                        int i30 = a65.b;
                                        shVar.l((j7 & (-1125899873288193L)) | (((i27 + 3) & 33554431) << 25), i28, i29);
                                    }
                                } else {
                                    i25 += 3;
                                }
                            }
                        }
                    } else {
                        vf3Var.Z = true;
                        boolean g = zc0Var.g(1024);
                        boolean g2 = zc0Var.g(16);
                        boolean a = this.c.a.a(i);
                        if (u != null) {
                            int i31 = u.B;
                            int i32 = (int) (c >> 32);
                            int i33 = (int) (c & 4294967295L);
                            int i34 = i & 33554431;
                            long[] jArr4 = (long[]) shVar.c;
                            int i35 = shVar.b - 3;
                            while (true) {
                                if (i35 < 0) {
                                    break;
                                } else if ((((int) jArr4[i35 + 2]) & 33554431) == i31) {
                                    long j9 = jArr4[i35];
                                    int i36 = ((int) (j9 >> 32)) + i32;
                                    int i37 = ((int) j9) + i33;
                                    shVar.g(i34, i36, i37, i36 + l0, i37 + k0, i31, g, g2, a, i35);
                                    break;
                                } else {
                                    i35 -= 3;
                                }
                            }
                        } else {
                            int i38 = (int) (c >> 32);
                            int i39 = (int) (c & 4294967295L);
                            sh.h(shVar, i, i38, i39, i38 + l0, i39 + k0, 0, g, g2, a, 544);
                        }
                    }
                } else {
                    d(vf3Var);
                    h(vf3Var);
                }
            } else {
                d(vf3Var);
            }
            vf3Var.Y = false;
            this.e = true;
            i();
        }
    }

    public final void g(vf3 vf3Var) {
        if (vf3Var.Z) {
            int i = vf3Var.B & 33554431;
            sh shVar = this.b;
            long[] jArr = (long[]) shVar.c;
            int i2 = shVar.b;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = a65.a;
                    break;
                }
                i3 += 3;
            }
            vf3Var.Z = false;
            vf3Var.Y = true;
            this.e = true;
            this.g = true;
        }
    }

    public final void i() {
        boolean z;
        qd qdVar = this.h;
        if (qdVar != null) {
            z = true;
        } else {
            z = false;
        }
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            ee eeVar = this.a;
            if (qdVar != null) {
                eeVar.removeCallbacks(qdVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.i = max;
            qd qdVar2 = new qd(0, this.j);
            eeVar.postDelayed(qdVar2, max - currentTimeMillis);
            this.h = qdVar2;
        }
    }
}
