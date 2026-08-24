package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hi1  reason: default package */
/* loaded from: classes.dex */
public final class hi1 extends hq6 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public y94 e;
    public Object f;
    public int g;

    public hi1(long j) {
        super(j);
        y94 y94Var = th4.a;
        y94Var.getClass();
        this.e = y94Var;
        this.f = h;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        hi1 hi1Var = (hi1) hq6Var;
        this.e = hi1Var.e;
        this.f = hi1Var.f;
        this.g = hi1Var.g;
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new hi1(j);
    }

    public final boolean c(ii1 ii1Var, vl6 vl6Var) {
        boolean z;
        boolean z2;
        Object obj = bm6.c;
        synchronized (obj) {
            z = true;
            if (this.c == vl6Var.g()) {
                if (this.d == vl6Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(ii1Var, vl6Var))) {
            z = false;
        }
        if (z && z2) {
            synchronized (obj) {
                this.c = vl6Var.g();
                this.d = vl6Var.h();
            }
            return z;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [hi1] */
    /* JADX WARN: Type inference failed for: r13v5, types: [hq6] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, hq6] */
    public final int d(ii1 ii1Var, vl6 vl6Var) {
        y94 y94Var;
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
        synchronized (bm6.c) {
            y94Var = this.e;
        }
        int i6 = 7;
        if (y94Var.e == 0) {
            return 7;
        }
        ua4 H = np2.H();
        Object[] objArr3 = H.A;
        int i7 = H.L;
        boolean z = false;
        for (int i8 = 0; i8 < i7; i8++) {
            ((wq2) objArr3[i8]).b();
        }
        try {
            Object[] objArr4 = y94Var.b;
            int[] iArr = y94Var.c;
            long[] jArr3 = y94Var.a;
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
                                eq6 eq6Var = (eq6) objArr4[i13];
                                int i14 = i10;
                                if (iArr[i13] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i12;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (eq6Var instanceof ii1) {
                                        ii1 ii1Var2 = (ii1) eq6Var;
                                        i5 = ii1Var2.h((hi1) bm6.i(ii1Var2.R, vl6Var), vl6Var, z, ii1Var2.B);
                                        y94 y94Var2 = i5.e;
                                        Object[] objArr5 = y94Var2.b;
                                        long[] jArr4 = y94Var2.a;
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
                                                            i16 = (i16 * 31) + System.identityHashCode((eq6) objArr5[(i15 << 3) + i18]);
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
                                        i5 = bm6.i(eq6Var.a(), vl6Var);
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
            Object[] objArr6 = H.A;
            int i19 = H.L;
            for (int i20 = 0; i20 < i19; i20++) {
                ((wq2) objArr6[i20]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = H.A;
            int i21 = H.L;
            for (int i22 = 0; i22 < i21; i22++) {
                ((wq2) objArr7[i22]).a();
            }
            throw th;
        }
    }
}
