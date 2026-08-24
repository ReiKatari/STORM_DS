package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op5  reason: default package */
/* loaded from: classes.dex */
public final class op5 implements defpackage.qh1 {
    public int A;
    public float B;
    public float L;
    public float R;
    public float X;
    public float Y;
    public float Z;
    public long d0;
    public long e0;
    public float f0;
    public float g0;
    public long h0;
    public defpackage.ke6 i0;
    public boolean j0;
    public long k0;
    public defpackage.qh1 l0;
    public defpackage.kk3 m0;
    public defpackage.m50 n0;
    public int o0;
    public defpackage.mp2 p0;

    public op5() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.B = r0
            r2.L = r0
            r2.R = r0
            long r0 = defpackage.yt2.a
            r2.d0 = r0
            r2.e0 = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r2.g0 = r0
            long r0 = defpackage.i97.b
            r2.h0 = r0
            jy2 r0 = defpackage.u24.m
            r2.i0 = r0
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.k0 = r0
            th1 r0 = defpackage.f04.h()
            r2.l0 = r0
            kk3 r0 = defpackage.kk3.Ltr
            r2.m0 = r0
            r0 = 3
            r2.o0 = r0
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            qh1 r0 = r0.l0
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            qh1 r0 = r0.l0
            float r0 = r0.a()
            return r0
    }

    public final void b() {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.k(r0)
            r5.l(r0)
            r5.c(r0)
            float r0 = r5.X
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            goto L1b
        L13:
            int r0 = r5.A
            r0 = r0 | 8
            r5.A = r0
            r5.X = r1
        L1b:
            r5.t(r1)
            r5.m(r1)
            long r2 = defpackage.yt2.a
            r5.d(r2)
            r5.o(r2)
            r5.j(r1)
            float r0 = r5.g0
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            goto L3d
        L35:
            int r0 = r5.A
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r5.A = r0
            r5.g0 = r1
        L3d:
            long r0 = defpackage.i97.b
            r5.r(r0)
            jy2 r0 = defpackage.u24.m
            r5.n(r0)
            r0 = 0
            r5.f(r0)
            r1 = 0
            r5.i(r1)
            int r2 = r5.o0
            r3 = 3
            if (r2 != r3) goto L55
            goto L5e
        L55:
            int r2 = r5.A
            r4 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r4
            r5.A = r2
            r5.o0 = r3
        L5e:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.k0 = r2
            r5.p0 = r1
            r5.A = r0
            return
    }

    public final void c(float r2) {
            r1 = this;
            float r0 = r1.R
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 4
            r1.A = r0
            r1.R = r2
            return
    }

    public final void d(long r3) {
            r2 = this;
            long r0 = r2.d0
            boolean r0 = defpackage.kt0.d(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.A
            r0 = r0 | 64
            r2.A = r0
            r2.d0 = r3
        L10:
            return
    }

    public final void f(boolean r2) {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 == r2) goto Lc
            int r0 = r1.A
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.A = r0
            r1.j0 = r2
        Lc:
            return
    }

    public final void i(defpackage.m50 r3) {
            r2 = this;
            m50 r0 = r2.n0
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L11
            int r0 = r2.A
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r2.A = r0
            r2.n0 = r3
        L11:
            return
    }

    public final void j(float r2) {
            r1 = this;
            float r0 = r1.f0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.A = r0
            r1.f0 = r2
            return
    }

    public final void k(float r2) {
            r1 = this;
            float r0 = r1.B
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 1
            r1.A = r0
            r1.B = r2
            return
    }

    public final void l(float r2) {
            r1 = this;
            float r0 = r1.L
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 2
            r1.A = r0
            r1.L = r2
            return
    }

    public final void m(float r2) {
            r1 = this;
            float r0 = r1.Z
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 32
            r1.A = r0
            r1.Z = r2
            return
    }

    public final void n(defpackage.ke6 r2) {
            r1 = this;
            ke6 r0 = r1.i0
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L10
            int r0 = r1.A
            r0 = r0 | 8192(0x2000, float:1.148E-41)
            r1.A = r0
            r1.i0 = r2
        L10:
            return
    }

    public final void o(long r3) {
            r2 = this;
            long r0 = r2.e0
            boolean r0 = defpackage.kt0.d(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.A
            r0 = r0 | 128(0x80, float:1.8E-43)
            r2.A = r0
            r2.e0 = r3
        L10:
            return
    }

    public final void r(long r3) {
            r2 = this;
            long r0 = r2.h0
            boolean r0 = defpackage.i97.a(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.A
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.A = r0
            r2.h0 = r3
        L10:
            return
    }

    public final void t(float r2) {
            r1 = this;
            float r0 = r1.Y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.A
            r0 = r0 | 16
            r1.A = r0
            r1.Y = r2
            return
    }
}
