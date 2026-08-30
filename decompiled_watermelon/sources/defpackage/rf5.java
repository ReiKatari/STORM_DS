package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf5  reason: default package */
/* loaded from: classes.dex */
public final class rf5 implements od1 {
    public int A;
    public float B = 1.0f;
    public float L = 1.0f;
    public float R = 1.0f;
    public float X;
    public float Y;
    public long Z;
    public long c0;
    public float d0;
    public float e0;
    public long f0;
    public y26 g0;
    public boolean h0;
    public long i0;
    public od1 j0;
    public sd3 k0;
    public o30 l0;
    public int m0;
    public jk2 n0;

    public rf5() {
        long j = un2.a;
        this.Z = j;
        this.c0 = j;
        this.e0 = 8.0f;
        this.f0 = sw6.b;
        this.g0 = iq2.g;
        this.i0 = 9205357640488583168L;
        this.j0 = w81.d();
        this.k0 = sd3.Ltr;
        this.m0 = 3;
    }

    public final void a() {
        l(1.0f);
        m(1.0f);
        c(1.0f);
        t(RecyclerView.A1);
        n(RecyclerView.A1);
        long j = un2.a;
        e(j);
        r(j);
        k(RecyclerView.A1);
        if (this.e0 != 8.0f) {
            this.A |= 2048;
            this.e0 = 8.0f;
        }
        s(sw6.b);
        p(iq2.g);
        f(false);
        h(null);
        if (this.m0 != 3) {
            this.A |= 524288;
            this.m0 = 3;
        }
        this.i0 = 9205357640488583168L;
        this.n0 = null;
        this.A = 0;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.j0.b();
    }

    public final void c(float f) {
        if (this.R == f) {
            return;
        }
        this.A |= 4;
        this.R = f;
    }

    public final void e(long j) {
        if (!xq0.c(this.Z, j)) {
            this.A |= 64;
            this.Z = j;
        }
    }

    public final void f(boolean z) {
        if (this.h0 != z) {
            this.A |= 16384;
            this.h0 = z;
        }
    }

    public final void h(o30 o30Var) {
        if (!b53.x(this.l0, o30Var)) {
            this.A |= 131072;
            this.l0 = o30Var;
        }
    }

    public final void k(float f) {
        if (this.d0 == f) {
            return;
        }
        this.A |= 1024;
        this.d0 = f;
    }

    public final void l(float f) {
        if (this.B == f) {
            return;
        }
        this.A |= 1;
        this.B = f;
    }

    public final void m(float f) {
        if (this.L == f) {
            return;
        }
        this.A |= 2;
        this.L = f;
    }

    public final void n(float f) {
        if (this.Y == f) {
            return;
        }
        this.A |= 32;
        this.Y = f;
    }

    @Override // defpackage.od1
    public final float o() {
        return this.j0.o();
    }

    public final void p(y26 y26Var) {
        if (!b53.x(this.g0, y26Var)) {
            this.A |= 8192;
            this.g0 = y26Var;
        }
    }

    public final void r(long j) {
        if (!xq0.c(this.c0, j)) {
            this.A |= 128;
            this.c0 = j;
        }
    }

    public final void s(long j) {
        if (!sw6.a(this.f0, j)) {
            this.A |= 4096;
            this.f0 = j;
        }
    }

    public final void t(float f) {
        if (this.X == f) {
            return;
        }
        this.A |= 16;
        this.X = f;
    }
}
