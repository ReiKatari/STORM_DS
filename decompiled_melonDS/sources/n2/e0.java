package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends z2.z implements s2 {
    public final mc.a B;
    public final e L;
    public d0 R = new d0(z2.l.j().g());

    public e0(mc.a aVar, e eVar) {
        this.B = aVar;
        this.L = eVar;
    }

    @Override // z2.y
    public final z2.a0 a() {
        return this.R;
    }

    @Override // z2.y
    public final void c(z2.a0 a0Var) {
        a0Var.getClass();
        this.R = (d0) a0Var;
    }

    public final d0 g(d0 d0Var, z2.f fVar, boolean z10, mc.a aVar) {
        p2.b p10;
        d0 d0Var2;
        e eVar;
        int i2;
        if (d0Var.c(this, fVar)) {
            if (z10) {
                p10 = s.p();
                Object[] objArr = p10.A;
                int i10 = p10.L;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((q) objArr[i11]).b();
                }
                try {
                    a1.d0 d0Var3 = d0Var.f9883e;
                    p1.c1 c1Var = m2.f9956a;
                    v2.d dVar = (v2.d) c1Var.d();
                    if (dVar == null) {
                        dVar = new v2.d();
                        c1Var.r(dVar);
                    }
                    int i12 = dVar.f13611a;
                    Object[] objArr2 = d0Var3.f33b;
                    int[] iArr = d0Var3.f34c;
                    long[] jArr = d0Var3.f32a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j2 = jArr[i13];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j2 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        i2 = i14;
                                        z2.y yVar = (z2.y) objArr2[i17];
                                        dVar.f13611a = i12 + iArr[i17];
                                        mc.l e6 = fVar.e();
                                        if (e6 != null) {
                                            e6.k(yVar);
                                        }
                                    } else {
                                        i2 = i14;
                                    }
                                    j2 >>= i2;
                                    i16++;
                                    i14 = i2;
                                }
                                if (i15 != i14) {
                                    break;
                                }
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    dVar.f13611a = i12;
                    Object[] objArr3 = p10.A;
                    int i18 = p10.L;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((q) objArr3[i19]).a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return d0Var;
        }
        a1.d0 d0Var4 = new a1.d0();
        p1.c1 c1Var2 = m2.f9956a;
        v2.d dVar2 = (v2.d) c1Var2.d();
        if (dVar2 == null) {
            dVar2 = new v2.d();
            c1Var2.r(dVar2);
        }
        int i20 = dVar2.f13611a;
        p10 = s.p();
        Object[] objArr4 = p10.A;
        int i21 = p10.L;
        for (int i22 = 0; i22 < i21; i22++) {
            ((q) objArr4[i22]).b();
        }
        try {
            dVar2.f13611a = i20 + 1;
            Object j10 = z2.q.j(new l1.n1(this, dVar2, d0Var4, i20, 1), aVar);
            dVar2.f13611a = i20;
            Object[] objArr5 = p10.A;
            int i23 = p10.L;
            for (int i24 = 0; i24 < i23; i24++) {
                ((q) objArr5[i24]).a();
            }
            Object obj = z2.l.f14919c;
            synchronized (obj) {
                try {
                    z2.f j11 = z2.l.j();
                    Object obj2 = d0Var.f9884f;
                    if (obj2 != d0.f9880h && (eVar = this.L) != null && eVar.b(j10, obj2)) {
                        d0Var.f9883e = d0Var4;
                        d0Var.f9885g = d0Var.d(this, j11);
                        d0Var2 = d0Var;
                    } else {
                        d0 d0Var5 = this.R;
                        synchronized (obj) {
                            z2.a0 m = z2.l.m(d0Var5, this);
                            m.a(d0Var5);
                            m.f14882a = j11.g();
                            d0Var2 = (d0) m;
                            d0Var2.f9883e = d0Var4;
                            d0Var2.f9885g = d0Var2.d(this, j11);
                            d0Var2.f9884f = j10;
                        }
                        return d0Var2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            v2.d dVar3 = (v2.d) m2.f9956a.d();
            if (dVar3 != null && dVar3.f13611a == 0) {
                z2.l.j().m();
                synchronized (obj) {
                    z2.f j12 = z2.l.j();
                    d0Var2.f9881c = j12.g();
                    d0Var2.f9882d = j12.h();
                    return d0Var2;
                }
            }
            return d0Var2;
        } finally {
            Object[] objArr6 = p10.A;
            int i25 = p10.L;
            for (int i26 = 0; i26 < i25; i26++) {
                ((q) objArr6[i26]).a();
            }
        }
    }

    @Override // n2.s2
    public final Object getValue() {
        mc.l e6 = z2.l.j().e();
        if (e6 != null) {
            e6.k(this);
        }
        z2.f j2 = z2.l.j();
        return g((d0) z2.l.i(this.R, j2), j2, true, this.B).f9884f;
    }

    public final d0 h() {
        z2.f j2 = z2.l.j();
        return g((d0) z2.l.i(this.R, j2), j2, false, this.B);
    }

    public final String toString() {
        String str;
        d0 d0Var = (d0) z2.l.h(this.R);
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        d0 d0Var2 = (d0) z2.l.h(this.R);
        if (d0Var2.c(this, z2.l.j())) {
            str = String.valueOf(d0Var2.f9884f);
        } else {
            str = "<Not calculated>";
        }
        sb2.append(str);
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
