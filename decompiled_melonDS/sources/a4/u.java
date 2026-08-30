package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends y0 {
    @Override // a4.y0
    public final void O0() {
        c1 c1Var = this.f371i0.f315i0.B0.f349q;
        c1Var.getClass();
        c1Var.C0();
    }

    @Override // y3.u0
    public final int b0(int i2) {
        a0.g t5 = this.f371i0.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.g(o0Var.A0.f266d, o0Var.l(), i2);
    }

    @Override // y3.u0
    public final y3.i1 e(long j2) {
        s0(j2);
        r1 r1Var = this.f371i0;
        p2.b z10 = r1Var.f315i0.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            c1 c1Var = ((o0) objArr[i10]).B0.f349q;
            c1Var.getClass();
            c1Var.f163d0 = k0.NotUsed;
        }
        o0 o0Var = r1Var.f315i0;
        y0.M0(this, o0Var.f293r0.a(this, o0Var.l(), j2));
        return this;
    }

    @Override // y3.u0
    public final int g(int i2) {
        a0.g t5 = this.f371i0.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.j(o0Var.A0.f266d, o0Var.l(), i2);
    }

    @Override // y3.u0
    public final int g0(int i2) {
        a0.g t5 = this.f371i0.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.d(o0Var.A0.f266d, o0Var.l(), i2);
    }

    @Override // y3.u0
    public final int h0(int i2) {
        a0.g t5 = this.f371i0.f315i0.t();
        y3.v0 r5 = t5.r();
        o0 o0Var = (o0) t5.B;
        return r5.c(o0Var.A0.f266d, o0Var.l(), i2);
    }

    @Override // a4.x0
    public final int w0(y3.q qVar) {
        int i2;
        c1 c1Var = this.f371i0.f315i0.B0.f349q;
        c1Var.getClass();
        p0 p0Var = c1Var.f171l0;
        if (!c1Var.f164e0) {
            t0 t0Var = c1Var.Y;
            if (t0Var.f337d == i0.LookaheadMeasuring) {
                p0Var.f310f = true;
                if (p0Var.f306b) {
                    t0Var.f339f = true;
                    t0Var.f340g = true;
                }
            } else {
                p0Var.f311g = true;
            }
        }
        u uVar = c1Var.z().O0;
        if (uVar != null) {
            uVar.f362e0 = true;
        }
        c1Var.M();
        u uVar2 = c1Var.z().O0;
        if (uVar2 != null) {
            uVar2.f362e0 = false;
        }
        Integer num = (Integer) p0Var.f313i.get(qVar);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        this.f376n0.g(i2, qVar);
        return i2;
    }
}
