package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements x4.c {
    public int A;
    public float B = 1.0f;
    public float L = 1.0f;
    public float R = 1.0f;
    public float X;
    public long Y;
    public long Z;

    /* renamed from: b0  reason: collision with root package name */
    public float f6643b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f6644c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f6645d0;

    /* renamed from: e0  reason: collision with root package name */
    public n0 f6646e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6647f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f6648g0;

    /* renamed from: h0  reason: collision with root package name */
    public x4.c f6649h0;

    /* renamed from: i0  reason: collision with root package name */
    public x4.m f6650i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f6651j0;

    /* renamed from: k0  reason: collision with root package name */
    public z f6652k0;

    public k0() {
        long j2 = a0.f6614a;
        this.Y = j2;
        this.Z = j2;
        this.f6644c0 = 8.0f;
        this.f6645d0 = q0.f6677b;
        this.f6646e0 = z.f6703b;
        this.f6648g0 = 9205357640488583168L;
        this.f6649h0 = p7.l.c();
        this.f6650i0 = x4.m.Ltr;
        this.f6651j0 = 3;
    }

    public final void a() {
        k(1.0f);
        l(1.0f);
        d(1.0f);
        n(0.0f);
        long j2 = a0.f6614a;
        e(j2);
        s(j2);
        h(0.0f);
        if (this.f6644c0 != 8.0f) {
            this.A |= 2048;
            this.f6644c0 = 8.0f;
        }
        u(q0.f6677b);
        o(z.f6703b);
        g(false);
        if (this.f6651j0 != 3) {
            this.A |= 524288;
            this.f6651j0 = 3;
        }
        this.f6648g0 = 9205357640488583168L;
        this.f6652k0 = null;
        this.A = 0;
    }

    @Override // x4.c
    public final float b() {
        return this.f6649h0.b();
    }

    public final void d(float f8) {
        if (this.R == f8) {
            return;
        }
        this.A |= 4;
        this.R = f8;
    }

    public final void e(long j2) {
        if (!s.c(this.Y, j2)) {
            this.A |= 64;
            this.Y = j2;
        }
    }

    public final void g(boolean z10) {
        if (this.f6647f0 != z10) {
            this.A |= 16384;
            this.f6647f0 = z10;
        }
    }

    public final void h(float f8) {
        if (this.f6643b0 == f8) {
            return;
        }
        this.A |= 1024;
        this.f6643b0 = f8;
    }

    @Override // x4.c
    public final float j() {
        return this.f6649h0.j();
    }

    public final void k(float f8) {
        if (this.B == f8) {
            return;
        }
        this.A |= 1;
        this.B = f8;
    }

    public final void l(float f8) {
        if (this.L == f8) {
            return;
        }
        this.A |= 2;
        this.L = f8;
    }

    public final void n(float f8) {
        if (this.X == f8) {
            return;
        }
        this.A |= 32;
        this.X = f8;
    }

    public final void o(n0 n0Var) {
        if (!nc.k.a(this.f6646e0, n0Var)) {
            this.A |= 8192;
            this.f6646e0 = n0Var;
        }
    }

    public final void s(long j2) {
        if (!s.c(this.Z, j2)) {
            this.A |= 128;
            this.Z = j2;
        }
    }

    public final void u(long j2) {
        if (!q0.a(this.f6645d0, j2)) {
            this.A |= 4096;
            this.f6645d0 = j2;
        }
    }
}
