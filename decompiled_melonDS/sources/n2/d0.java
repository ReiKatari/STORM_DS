package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends z2.a0 {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f9880h = new Object();

    /* renamed from: c  reason: collision with root package name */
    public long f9881c;

    /* renamed from: d  reason: collision with root package name */
    public int f9882d;

    /* renamed from: e  reason: collision with root package name */
    public a1.d0 f9883e;

    /* renamed from: f  reason: collision with root package name */
    public Object f9884f;

    /* renamed from: g  reason: collision with root package name */
    public int f9885g;

    public d0(long j2) {
        super(j2);
        a1.d0 d0Var = a1.r0.f92a;
        d0Var.getClass();
        this.f9883e = d0Var;
        this.f9884f = f9880h;
    }

    @Override // z2.a0
    public final void a(z2.a0 a0Var) {
        a0Var.getClass();
        d0 d0Var = (d0) a0Var;
        this.f9883e = d0Var.f9883e;
        this.f9884f = d0Var.f9884f;
        this.f9885g = d0Var.f9885g;
    }

    @Override // z2.a0
    public final z2.a0 b(long j2) {
        return new d0(j2);
    }

    public final boolean c(e0 e0Var, z2.f fVar) {
        boolean z10;
        boolean z11;
        Object obj = z2.l.f14919c;
        synchronized (obj) {
            z10 = true;
            if (this.f9881c == fVar.g()) {
                if (this.f9882d == fVar.h()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (this.f9884f == f9880h || (z11 && this.f9885g != d(e0Var, fVar))) {
            z10 = false;
        }
        if (z10 && z11) {
            synchronized (obj) {
                this.f9881c = fVar.g();
                this.f9882d = fVar.h();
            }
            return z10;
        }
        return z10;
    }

    public final int d(e0 e0Var, z2.f fVar) {
        a1.d0 d0Var;
        int i2;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        z2.a0 g10;
        synchronized (z2.l.f14919c) {
            d0Var = this.f9883e;
        }
        int i13 = 7;
        if (d0Var.f36e == 0) {
            return 7;
        }
        p2.b p10 = s.p();
        Object[] objArr = p10.A;
        int i14 = p10.L;
        for (int i15 = 0; i15 < i14; i15++) {
            ((q) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = d0Var.f33b;
            int[] iArr = d0Var.f34c;
            long[] jArr3 = d0Var.f32a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i2 = 7;
                int i16 = 0;
                while (true) {
                    long j2 = jArr3[i16];
                    if ((((~j2) << i13) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j2 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                Object obj = objArr2[i20];
                                i11 = i13;
                                int i21 = iArr[i20];
                                i12 = i17;
                                z2.y yVar = (z2.y) obj;
                                if (i21 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (yVar instanceof e0) {
                                        try {
                                            e0 e0Var2 = (e0) yVar;
                                            g10 = e0Var2.g((d0) z2.l.i(e0Var2.R, fVar), fVar, false, e0Var2.B);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = p10.A;
                                            int i22 = p10.L;
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                ((q) objArr3[i23]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g10 = z2.l.i(yVar.a(), fVar);
                                    }
                                    jArr2 = jArr3;
                                    i2 = (((i2 * 31) + System.identityHashCode(g10)) * 31) + Long.hashCode(g10.f14882a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                                i12 = i17;
                            }
                            j2 >>= i12;
                            i19++;
                            i13 = i11;
                            jArr3 = jArr2;
                            i17 = i12;
                        }
                        jArr = jArr3;
                        i10 = i13;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i13;
                    }
                    if (i16 != length) {
                        i16++;
                        i13 = i10;
                        jArr3 = jArr;
                    } else {
                        i13 = i2;
                        break;
                    }
                }
            }
            i2 = i13;
            Object[] objArr4 = p10.A;
            int i24 = p10.L;
            for (int i25 = 0; i25 < i24; i25++) {
                ((q) objArr4[i25]).a();
            }
            return i2;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
