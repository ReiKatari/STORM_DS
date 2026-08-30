package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ee1  reason: default package */
/* loaded from: classes.dex */
public final class ee1 extends qe6 implements ae6 {
    public final ki2 B;
    public final ta6 L;
    public de1 R = new de1(ma6.j().g());

    public ee1(ki2 ki2Var, ta6 ta6Var) {
        this.B = ki2Var;
        this.L = ta6Var;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.R;
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.R = (de1) se6Var;
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        mi2 e = ma6.j().e();
        if (e != null) {
            e.n(this);
        }
        ga6 j = ma6.j();
        return h((de1) ma6.i(this.R, j), j, true, this.B).f;
    }

    public final de1 h(de1 de1Var, ga6 ga6Var, boolean z, ki2 ki2Var) {
        o24 p;
        de1 de1Var2;
        ta6 ta6Var;
        int i;
        if (de1Var.c(this, ga6Var)) {
            if (z) {
                p = me2.p();
                Object[] objArr = p.A;
                int i2 = p.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((rk2) objArr[i3]).b();
                }
                try {
                    s14 s14Var = de1Var.e;
                    n85 n85Var = ua6.a;
                    f33 f33Var = (f33) n85Var.d();
                    if (f33Var == null) {
                        f33Var = new f33();
                        n85Var.u(f33Var);
                    }
                    int i4 = f33Var.a;
                    Object[] objArr2 = s14Var.b;
                    int[] iArr = s14Var.c;
                    long[] jArr = s14Var.a;
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
                                        pe6 pe6Var = (pe6) objArr2[i9];
                                        i = i6;
                                        f33Var.a = i4 + iArr[i9];
                                        mi2 e = ga6Var.e();
                                        if (e != null) {
                                            e.n(pe6Var);
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
                    f33Var.a = i4;
                    Object[] objArr3 = p.A;
                    int i10 = p.L;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((rk2) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return de1Var;
        }
        s14 s14Var2 = new s14();
        n85 n85Var2 = ua6.a;
        f33 f33Var2 = (f33) n85Var2.d();
        if (f33Var2 == null) {
            f33Var2 = new f33();
            n85Var2.u(f33Var2);
        }
        int i12 = f33Var2.a;
        p = me2.p();
        Object[] objArr4 = p.A;
        int i13 = p.L;
        for (int i14 = 0; i14 < i13; i14++) {
            ((rk2) objArr4[i14]).b();
        }
        try {
            f33Var2.a = i12 + 1;
            Object b0 = io2.b0(new ce1(this, f33Var2, s14Var2, i12, 0), ki2Var);
            f33Var2.a = i12;
            Object[] objArr5 = p.A;
            int i15 = p.L;
            for (int i16 = 0; i16 < i15; i16++) {
                ((rk2) objArr5[i16]).a();
            }
            Object obj = ma6.c;
            synchronized (obj) {
                try {
                    ga6 j2 = ma6.j();
                    Object obj2 = de1Var.f;
                    if (obj2 != de1.h && (ta6Var = this.L) != null && ta6Var.b(b0, obj2)) {
                        de1Var.e = s14Var2;
                        de1Var.g = de1Var.d(this, j2);
                        de1Var2 = de1Var;
                    } else {
                        de1 de1Var3 = this.R;
                        synchronized (obj) {
                            se6 m = ma6.m(de1Var3, this);
                            m.a(de1Var3);
                            m.a = j2.g();
                            de1Var2 = (de1) m;
                            de1Var2.e = s14Var2;
                            de1Var2.g = de1Var2.d(this, j2);
                            de1Var2.f = b0;
                        }
                        return de1Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f33 f33Var3 = (f33) ua6.a.d();
            if (f33Var3 != null && f33Var3.a == 0) {
                ma6.j().m();
                synchronized (obj) {
                    ga6 j3 = ma6.j();
                    de1Var2.c = j3.g();
                    de1Var2.d = j3.h();
                    return de1Var2;
                }
            }
            return de1Var2;
        } finally {
            Object[] objArr6 = p.A;
            int i17 = p.L;
            for (int i18 = 0; i18 < i17; i18++) {
                ((rk2) objArr6[i18]).a();
            }
        }
    }

    public final de1 i() {
        ga6 j = ma6.j();
        return h((de1) ma6.i(this.R, j), j, false, this.B);
    }

    public final String toString() {
        String str;
        de1 de1Var = (de1) ma6.h(this.R);
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        de1 de1Var2 = (de1) ma6.h(this.R);
        if (de1Var2.c(this, ma6.j())) {
            str = String.valueOf(de1Var2.f);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
