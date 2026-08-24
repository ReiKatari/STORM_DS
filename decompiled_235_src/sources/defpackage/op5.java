package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op5  reason: default package */
/* loaded from: classes.dex */
public final class op5 implements qh1 {
    public int A;
    public float B = 1.0f;
    public float L = 1.0f;
    public float R = 1.0f;
    public float X;
    public float Y;
    public float Z;
    public long d0;
    public long e0;
    public float f0;
    public float g0;
    public long h0;
    public ke6 i0;
    public boolean j0;
    public long k0;
    public qh1 l0;
    public kk3 m0;
    public m50 n0;
    public int o0;
    public mp2 p0;

    public op5() {
        long j = yt2.a;
        this.d0 = j;
        this.e0 = j;
        this.g0 = 8.0f;
        this.h0 = i97.b;
        this.i0 = u24.m;
        this.k0 = 9205357640488583168L;
        this.l0 = f04.h();
        this.m0 = kk3.Ltr;
        this.o0 = 3;
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.l0.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.l0.a();
    }

    public final void b() {
        k(1.0f);
        l(1.0f);
        c(1.0f);
        if (this.X != RecyclerView.B1) {
            this.A |= 8;
            this.X = RecyclerView.B1;
        }
        t(RecyclerView.B1);
        m(RecyclerView.B1);
        long j = yt2.a;
        d(j);
        o(j);
        j(RecyclerView.B1);
        if (this.g0 != 8.0f) {
            this.A |= 2048;
            this.g0 = 8.0f;
        }
        r(i97.b);
        n(u24.m);
        f(false);
        i(null);
        if (this.o0 != 3) {
            this.A |= 524288;
            this.o0 = 3;
        }
        this.k0 = 9205357640488583168L;
        this.p0 = null;
        this.A = 0;
    }

    public final void c(float f) {
        if (this.R == f) {
            return;
        }
        this.A |= 4;
        this.R = f;
    }

    public final void d(long j) {
        if (!kt0.d(this.d0, j)) {
            this.A |= 64;
            this.d0 = j;
        }
    }

    public final void f(boolean z) {
        if (this.j0 != z) {
            this.A |= 16384;
            this.j0 = z;
        }
    }

    public final void i(m50 m50Var) {
        if (!nb3.k(this.n0, m50Var)) {
            this.A |= 131072;
            this.n0 = m50Var;
        }
    }

    public final void j(float f) {
        if (this.f0 == f) {
            return;
        }
        this.A |= 1024;
        this.f0 = f;
    }

    public final void k(float f) {
        if (this.B == f) {
            return;
        }
        this.A |= 1;
        this.B = f;
    }

    public final void l(float f) {
        if (this.L == f) {
            return;
        }
        this.A |= 2;
        this.L = f;
    }

    public final void m(float f) {
        if (this.Z == f) {
            return;
        }
        this.A |= 32;
        this.Z = f;
    }

    public final void n(ke6 ke6Var) {
        if (!nb3.k(this.i0, ke6Var)) {
            this.A |= 8192;
            this.i0 = ke6Var;
        }
    }

    public final void o(long j) {
        if (!kt0.d(this.e0, j)) {
            this.A |= 128;
            this.e0 = j;
        }
    }

    public final void r(long j) {
        if (!i97.a(this.h0, j)) {
            this.A |= 4096;
            this.h0 = j;
        }
    }

    public final void t(float f) {
        if (this.Y == f) {
            return;
        }
        this.A |= 16;
        this.Y = f;
    }
}
