package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends r1 {
    public static final cd.h1 P0;
    public final n2 N0;
    public u O0;

    static {
        cd.h1 f8 = i3.z.f();
        int i2 = i3.s.f6688i;
        f8.j(i3.s.f6684e);
        f8.p(1.0f);
        f8.q(1);
        P0 = f8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a4.n2, b3.o] */
    /* JADX WARN: Type inference failed for: r3v4, types: [a4.y0] */
    public v(o0 o0Var) {
        super(o0Var);
        u uVar;
        ?? oVar = new b3.o();
        oVar.R = 0;
        this.N0 = oVar;
        oVar.f1771b0 = this;
        if (o0Var.f280d0 != null) {
            uVar = new y0(this);
        } else {
            uVar = null;
        }
        this.O0 = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a4.u, a4.y0] */
    @Override // a4.r1
    public final void S0() {
        if (this.O0 == null) {
            this.O0 = new y0(this);
        }
    }

    @Override // a4.r1
    public final y0 V0() {
        return this.O0;
    }

    @Override // a4.r1
    public final b3.o X0() {
        return this.N0;
    }

    @Override // y3.u0
    public final int b0(int i2) {
        a0.g t5 = this.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.g(o0Var.A0.f266d, o0Var.m(), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // a4.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(a4.o1 r19, long r20, a4.t r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.v.d1(a4.o1, long, a4.t, int, boolean):void");
    }

    @Override // y3.u0
    public final y3.i1 e(long j2) {
        if (this.f317k0) {
            u uVar = this.O0;
            uVar.getClass();
            j2 = uVar.R;
        }
        s0(j2);
        o0 o0Var = this.f315i0;
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ((o0) objArr[i10]).B0.f348p.f225f0 = k0.NotUsed;
        }
        q1(o0Var.f293r0.a(this, o0Var.m(), j2));
        h1();
        return this;
    }

    @Override // y3.u0
    public final int g(int i2) {
        a0.g t5 = this.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.j(o0Var.A0.f266d, o0Var.m(), i2);
    }

    @Override // y3.u0
    public final int g0(int i2) {
        a0.g t5 = this.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.d(o0Var.A0.f266d, o0Var.m(), i2);
    }

    @Override // y3.u0
    public final int h0(int i2) {
        a0.g t5 = this.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.c(o0Var.A0.f266d, o0Var.m(), i2);
    }

    @Override // a4.r1
    public final void m1(i3.q qVar, l3.b bVar) {
        o0 o0Var = this.f315i0;
        c2 a10 = s0.a(o0Var);
        p2.b y10 = o0Var.y();
        Object[] objArr = y10.A;
        int i2 = y10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (o0Var2.I()) {
                o0Var2.i(qVar, bVar);
            }
        }
        if (((b4.x) a10).getShowLayoutBounds()) {
            long j2 = this.L;
            qVar.f(0.5f, 0.5f, ((int) (j2 >> 32)) - 0.5f, ((int) (j2 & 4294967295L)) - 0.5f, P0);
        }
    }

    @Override // y3.i1
    public final void q0(long j2, float f8, mc.l lVar) {
        if (this.f316j0) {
            y0 V0 = V0();
            V0.getClass();
            n1(V0.f372j0, f8, lVar);
        } else {
            n1(j2, f8, lVar);
        }
        if (this.f361d0) {
            return;
        }
        this.f315i0.B0.f348p.C0();
    }

    @Override // a4.x0
    public final int w0(y3.q qVar) {
        u uVar = this.O0;
        if (uVar != null) {
            return uVar.w0(qVar);
        }
        i1 i1Var = this.f315i0.B0.f348p;
        p0 p0Var = i1Var.f236r0;
        if (!i1Var.f226g0) {
            if (i1Var.Y.f337d == i0.Measuring) {
                p0Var.f310f = true;
                if (p0Var.f306b) {
                    i1Var.p0 = true;
                    i1Var.f235q0 = true;
                }
            } else {
                p0Var.f311g = true;
            }
        }
        v z10 = i1Var.z();
        boolean z11 = z10.f362e0;
        z10.f362e0 = true;
        i1Var.M();
        z10.f362e0 = z11;
        Integer num = (Integer) p0Var.f313i.get(qVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
