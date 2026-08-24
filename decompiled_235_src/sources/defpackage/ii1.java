package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii1  reason: default package */
/* loaded from: classes.dex */
public final class ii1 extends fq6 implements pp6 {
    public final on2 B;
    public final im6 L;
    public hi1 R = new hi1(bm6.j().g());

    public ii1(on2 on2Var, im6 im6Var) {
        this.B = on2Var;
        this.L = im6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.R;
    }

    @Override // defpackage.eq6
    public final void f(hq6 hq6Var) {
        hq6Var.getClass();
        this.R = (hi1) hq6Var;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        qn2 e = bm6.j().e();
        if (e != null) {
            e.g(this);
        }
        vl6 j = bm6.j();
        return h((hi1) bm6.i(this.R, j), j, true, this.B).f;
    }

    public final hi1 h(hi1 hi1Var, vl6 vl6Var, boolean z, on2 on2Var) {
        ua4 H;
        hi1 hi1Var2;
        im6 im6Var;
        int i;
        if (hi1Var.c(this, vl6Var)) {
            if (z) {
                H = np2.H();
                Object[] objArr = H.A;
                int i2 = H.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((wq2) objArr[i3]).b();
                }
                try {
                    y94 y94Var = hi1Var.e;
                    m44 m44Var = jm6.a;
                    n93 n93Var = (n93) m44Var.f();
                    if (n93Var == null) {
                        n93Var = new n93();
                        m44Var.F(n93Var);
                    }
                    int i4 = n93Var.a;
                    Object[] objArr2 = y94Var.b;
                    int[] iArr = y94Var.c;
                    long[] jArr = y94Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        eq6 eq6Var = (eq6) objArr2[i9];
                                        i = i6;
                                        n93Var.a = i4 + iArr[i9];
                                        qn2 e = vl6Var.e();
                                        if (e != null) {
                                            e.g(eq6Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    n93Var.a = i4;
                    Object[] objArr3 = H.A;
                    int i10 = H.L;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((wq2) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return hi1Var;
        }
        y94 y94Var2 = new y94();
        m44 m44Var2 = jm6.a;
        n93 n93Var2 = (n93) m44Var2.f();
        if (n93Var2 == null) {
            n93Var2 = new n93();
            m44Var2.F(n93Var2);
        }
        int i12 = n93Var2.a;
        H = np2.H();
        Object[] objArr4 = H.A;
        int i13 = H.L;
        for (int i14 = 0; i14 < i13; i14++) {
            ((wq2) objArr4[i14]).b();
        }
        try {
            n93Var2.a = i12 + 1;
            Object Q = ln2.Q(new gi1(this, n93Var2, y94Var2, i12, 0), on2Var);
            n93Var2.a = i12;
            Object[] objArr5 = H.A;
            int i15 = H.L;
            for (int i16 = 0; i16 < i15; i16++) {
                ((wq2) objArr5[i16]).a();
            }
            Object obj = bm6.c;
            synchronized (obj) {
                try {
                    vl6 j2 = bm6.j();
                    Object obj2 = hi1Var.f;
                    if (obj2 != hi1.h && (im6Var = this.L) != null && im6Var.i(Q, obj2)) {
                        hi1Var.e = y94Var2;
                        hi1Var.g = hi1Var.d(this, j2);
                        hi1Var2 = hi1Var;
                    } else {
                        hi1 hi1Var3 = this.R;
                        synchronized (obj) {
                            hq6 m = bm6.m(hi1Var3, this);
                            m.a(hi1Var3);
                            m.a = j2.g();
                            hi1Var2 = (hi1) m;
                            hi1Var2.e = y94Var2;
                            hi1Var2.g = hi1Var2.d(this, j2);
                            hi1Var2.f = Q;
                        }
                        return hi1Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n93 n93Var3 = (n93) jm6.a.f();
            if (n93Var3 != null && n93Var3.a == 0) {
                bm6.j().m();
                synchronized (obj) {
                    vl6 j3 = bm6.j();
                    hi1Var2.c = j3.g();
                    hi1Var2.d = j3.h();
                    return hi1Var2;
                }
            }
            return hi1Var2;
        } finally {
            Object[] objArr6 = H.A;
            int i17 = H.L;
            for (int i18 = 0; i18 < i17; i18++) {
                ((wq2) objArr6[i18]).a();
            }
        }
    }

    public final hi1 i() {
        vl6 j = bm6.j();
        return h((hi1) bm6.i(this.R, j), j, false, this.B);
    }

    public final String toString() {
        String str;
        hi1 hi1Var = (hi1) bm6.h(this.R);
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        hi1 hi1Var2 = (hi1) bm6.h(this.R);
        if (hi1Var2.c(this, bm6.j())) {
            str = String.valueOf(hi1Var2.f);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
