package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: de1  reason: default package */
/* loaded from: classes.dex */
public final class de1 extends se6 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public s14 e;
    public Object f;
    public int g;

    public de1(long j) {
        super(j);
        s14 s14Var = a94.a;
        s14Var.getClass();
        this.e = s14Var;
        this.f = h;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        de1 de1Var = (de1) se6Var;
        this.e = de1Var.e;
        this.f = de1Var.f;
        this.g = de1Var.g;
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new de1(j);
    }

    public final boolean c(ee1 ee1Var, ga6 ga6Var) {
        boolean z;
        boolean z2;
        Object obj = ma6.c;
        synchronized (obj) {
            z = true;
            if (this.c == ga6Var.g()) {
                if (this.d == ga6Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(ee1Var, ga6Var))) {
            z = false;
        }
        if (z && z2) {
            synchronized (obj) {
                this.c = ga6Var.g();
                this.d = ga6Var.h();
            }
            return z;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [de1] */
    /* JADX WARN: Type inference failed for: r13v5, types: [se6] */
    /* JADX WARN: Type inference failed for: r13v6, types: [se6, java.lang.Object] */
    public final int d(ee1 ee1Var, ga6 ga6Var) {
        s14 s14Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? i5;
        synchronized (ma6.c) {
            s14Var = this.e;
        }
        int i6 = 7;
        if (s14Var.e == 0) {
            return 7;
        }
        o24 p = me2.p();
        Object[] objArr3 = p.A;
        int i7 = p.L;
        boolean z = false;
        for (int i8 = 0; i8 < i7; i8++) {
            ((rk2) objArr3[i8]).b();
        }
        try {
            Object[] objArr4 = s14Var.b;
            int[] iArr = s14Var.c;
            long[] jArr3 = s14Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i9 = 0;
                while (true) {
                    long j3 = jArr3[i9];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i6) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        i2 = i6;
                        int i12 = z ? 1 : 0;
                        while (i12 < i11) {
                            if ((j3 & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                j2 = j4;
                                pe6 pe6Var = (pe6) objArr4[i13];
                                int i14 = i10;
                                if (iArr[i13] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i12;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (pe6Var instanceof ee1) {
                                        ee1 ee1Var2 = (ee1) pe6Var;
                                        i5 = ee1Var2.h((de1) ma6.i(ee1Var2.R, ga6Var), ga6Var, z, ee1Var2.B);
                                        s14 s14Var2 = i5.e;
                                        Object[] objArr5 = s14Var2.b;
                                        long[] jArr4 = s14Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i12;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j5 = jArr4[i15];
                                                j = j3;
                                                int i16 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i17 = 8 - ((~(i15 - length2)) >>> 31);
                                                    for (int i18 = 0; i18 < i17; i18++) {
                                                        if ((j5 & 255) < 128) {
                                                            i16 = (i16 * 31) + System.identityHashCode((pe6) objArr5[(i15 << 3) + i18]);
                                                        }
                                                        j5 >>= i14;
                                                    }
                                                    if (i17 != i14) {
                                                        i = i16;
                                                        break;
                                                    }
                                                }
                                                i = i16;
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                j3 = j;
                                                i14 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i12;
                                        objArr2 = objArr4;
                                        j = j3;
                                        i5 = ma6.i(pe6Var.b(), ga6Var);
                                    }
                                    i = (((i * 31) + System.identityHashCode(i5)) * 31) + Long.hashCode(i5.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i12;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i10;
                            }
                            j3 = j >> i4;
                            i10 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i12 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i6;
                        objArr = objArr4;
                    }
                    if (i9 != length) {
                        i9++;
                        i6 = i2;
                        jArr3 = jArr;
                        objArr4 = objArr;
                        z = false;
                    } else {
                        i6 = i;
                        break;
                    }
                }
            }
            i = i6;
            Object[] objArr6 = p.A;
            int i19 = p.L;
            for (int i20 = 0; i20 < i19; i20++) {
                ((rk2) objArr6[i20]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = p.A;
            int i21 = p.L;
            for (int i22 = 0; i22 < i21; i22++) {
                ((rk2) objArr7[i22]).a();
            }
            throw th;
        }
    }
}
