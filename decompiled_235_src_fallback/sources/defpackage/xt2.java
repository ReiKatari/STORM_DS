package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt2  reason: default package */
/* loaded from: classes.dex */
public final class xt2 implements defpackage.yp4 {
    public defpackage.ut2 A;
    public final defpackage.tt2 B;
    public final defpackage.te L;
    public defpackage.eo2 R;
    public defpackage.on2 X;
    public long Y;
    public boolean Z;
    public final float[] d0;
    public float[] e0;
    public boolean f0;
    public defpackage.qh1 g0;
    public defpackage.kk3 h0;
    public final defpackage.zj0 i0;
    public int j0;
    public long k0;
    public defpackage.mp2 l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final defpackage.mc q0;

    public xt2(defpackage.ut2 r1, defpackage.tt2 r2, defpackage.te r3, defpackage.eo2 r4, defpackage.on2 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r0.Y = r1
            float[] r1 = defpackage.v24.a()
            r0.d0 = r1
            th1 r1 = defpackage.f04.h()
            r0.g0 = r1
            kk3 r1 = defpackage.kk3.Ltr
            r0.h0 = r1
            zj0 r1 = new zj0
            r1.<init>()
            r0.i0 = r1
            long r1 = defpackage.i97.b
            r0.k0 = r1
            r1 = 1
            r0.o0 = r1
            mc r1 = new mc
            r2 = 16
            r1.<init>(r0, r2)
            r0.q0 = r1
            return
    }

    public final float[] a() {
            r4 = this;
            float[] r0 = r4.e0
            if (r0 != 0) goto La
            float[] r0 = defpackage.v24.a()
            r4.e0 = r0
        La:
            boolean r1 = r4.n0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L19
            r4 = r0[r2]
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2a
            return r3
        L19:
            r4.n0 = r2
            float[] r1 = r4.b()
            boolean r4 = r4.o0
            if (r4 == 0) goto L24
            return r1
        L24:
            boolean r4 = defpackage.jx2.w(r1, r0)
            if (r4 == 0) goto L2b
        L2a:
            return r0
        L2b:
            r4 = 2143289344(0x7fc00000, float:NaN)
            r0[r2] = r4
            return r3
    }

    public final float[] b() {
            r24 = this;
            r0 = r24
            boolean r1 = r0.m0
            float[] r2 = r0.d0
            if (r1 == 0) goto L12d
            ut2 r1 = r0.A
            long r3 = r1.v
            wt2 r1 = r1.a
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L27
            long r3 = r0.Y
            long r3 = defpackage.qo2.S(r3)
            long r3 = defpackage.ii2.v(r3)
        L27:
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r4 = r1.C()
            float r6 = r1.u()
            float r7 = r1.F()
            float r8 = r1.n()
            float r9 = r1.p()
            float r10 = r1.b()
            float r1 = r1.N()
            double r11 = (double) r7
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r11 = r11 * r13
            r15 = r13
            double r13 = java.lang.Math.sin(r11)
            float r7 = (float) r13
            double r11 = java.lang.Math.cos(r11)
            float r11 = (float) r11
            float r12 = -r7
            float r13 = r6 * r11
            r14 = 0
            float r17 = r14 * r7
            float r13 = r13 - r17
            float r6 = r6 * r7
            float r17 = r14 * r11
            float r17 = r17 + r6
            r6 = r14
            r18 = r15
            double r14 = (double) r8
            double r14 = r14 * r18
            r16 = r6
            r8 = r7
            double r6 = java.lang.Math.sin(r14)
            float r6 = (float) r6
            double r14 = java.lang.Math.cos(r14)
            float r7 = (float) r14
            float r14 = -r6
            float r15 = r8 * r6
            float r8 = r8 * r7
            float r20 = r11 * r6
            float r21 = r11 * r7
            float r22 = r4 * r7
            float r23 = r17 * r6
            float r23 = r23 + r22
            float r4 = -r4
            float r4 = r4 * r6
            float r17 = r17 * r7
            float r17 = r17 + r4
            r6 = r3
            double r3 = (double) r9
            double r3 = r3 * r18
            r18 = r3
            double r3 = java.lang.Math.sin(r18)
            float r3 = (float) r3
            r9 = r6
            r4 = r7
            double r6 = java.lang.Math.cos(r18)
            float r6 = (float) r6
            float r7 = -r3
            float r18 = r7 * r4
            float r19 = r6 * r15
            float r19 = r19 + r18
            float r4 = r4 * r6
            float r15 = r15 * r3
            float r15 = r15 + r4
            float r4 = r3 * r11
            float r11 = r11 * r6
            float r7 = r7 * r14
            float r18 = r6 * r8
            float r18 = r18 + r7
            float r6 = r6 * r14
            float r3 = r3 * r8
            float r3 = r3 + r6
            float r15 = r15 * r10
            float r4 = r4 * r10
            float r3 = r3 * r10
            float r19 = r19 * r1
            float r11 = r11 * r1
            float r18 = r18 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r20 = r20 * r1
            float r12 = r12 * r1
            float r21 = r21 * r1
            int r6 = r2.length
            r7 = 0
            r8 = 16
            if (r6 >= r8) goto Lda
            goto L125
        Lda:
            r2[r7] = r15
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r3
            r6 = 3
            r2[r6] = r16
            r6 = 4
            r2[r6] = r19
            r6 = 5
            r2[r6] = r11
            r6 = 6
            r2[r6] = r18
            r6 = 7
            r2[r6] = r16
            r6 = 8
            r2[r6] = r20
            r6 = 9
            r2[r6] = r12
            r6 = 10
            r2[r6] = r21
            r6 = 11
            r2[r6] = r16
            float r6 = -r5
            float r15 = r15 * r6
            float r8 = r9 * r19
            float r15 = r15 - r8
            float r15 = r15 + r23
            float r15 = r15 + r5
            r5 = 12
            r2[r5] = r15
            float r4 = r4 * r6
            float r5 = r9 * r11
            float r4 = r4 - r5
            float r4 = r4 + r13
            float r4 = r4 + r9
            r5 = 13
            r2[r5] = r4
            float r6 = r6 * r3
            float r3 = r9 * r18
            float r6 = r6 - r3
            float r6 = r6 + r17
            r3 = 14
            r2[r3] = r6
            r3 = 15
            r2[r3] = r1
        L125:
            r0.m0 = r7
            boolean r1 = defpackage.nj2.w(r2)
            r0.o0 = r1
        L12d:
            return r2
    }

    public final void c() {
            r1 = this;
            boolean r0 = r1.f0
            if (r0 != 0) goto L11
            boolean r0 = r1.Z
            if (r0 != 0) goto L11
            te r0 = r1.L
            r0.invalidate()
            r0 = 1
            r1.f(r0)
        L11:
            return
    }

    public final void d(long r7) {
            r6 = this;
            boolean r0 = defpackage.te.m()
            te r1 = r6.L
            if (r0 == 0) goto Ld
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            r1.J(r0)
        Ld:
            ut2 r6 = r6.A
            long r2 = r6.t
            boolean r0 = defpackage.i93.a(r2, r7)
            if (r0 != 0) goto L2c
            r6.t = r7
            long r2 = r6.u
            wt2 r6 = r6.a
            r0 = 32
            long r4 = r7 >> r0
            int r0 = (int) r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            r6.B(r2, r0, r7)
        L2c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L3c
            android.view.ViewParent r6 = r1.getParent()
            if (r6 == 0) goto L3b
            defpackage.q66.x(r6, r1, r1)
        L3b:
            return
        L3c:
            r1.invalidate()
            return
    }

    public final void e(long r3) {
            r2 = this;
            long r0 = r2.Y
            boolean r0 = defpackage.q93.b(r3, r0)
            if (r0 != 0) goto L1a
            boolean r0 = defpackage.te.m()
            if (r0 == 0) goto L15
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            te r1 = r2.L
            r1.J(r0)
        L15:
            r2.Y = r3
            r2.c()
        L1a:
            return
    }

    public final void f(boolean r4) {
            r3 = this;
            boolean r0 = r3.f0
            if (r4 == r0) goto L2f
            r3.f0 = r4
            te r0 = r3.L
            ca4 r1 = r0.D0
            boolean r2 = r0.F0
            if (r4 != 0) goto L1b
            if (r2 != 0) goto L2f
            r1.j(r3)
            ca4 r4 = r0.E0
            if (r4 == 0) goto L2f
            r4.j(r3)
            return
        L1b:
            if (r2 != 0) goto L21
            r1.a(r3)
            return
        L21:
            ca4 r4 = r0.E0
            if (r4 != 0) goto L2c
            ca4 r4 = new ca4
            r4.<init>()
            r0.E0 = r4
        L2c:
            r4.a(r3)
        L2f:
            return
    }

    public final void g() {
            r9 = this;
            defpackage.te.m()
            boolean r0 = r9.f0
            if (r0 == 0) goto L70
            long r0 = r9.k0
            long r2 = defpackage.i97.b
            boolean r0 = defpackage.i97.a(r0, r2)
            if (r0 != 0) goto L5f
            ut2 r0 = r9.A
            long r0 = r0.u
            long r2 = r9.Y
            boolean r0 = defpackage.q93.b(r0, r2)
            if (r0 != 0) goto L5f
            ut2 r0 = r9.A
            long r1 = r9.k0
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r4 = r9.Y
            long r4 = r4 >> r3
            int r2 = (int) r4
            float r2 = (float) r2
            float r1 = r1 * r2
            long r4 = r9.k0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r4 = r9.Y
            long r4 = r4 & r6
            int r4 = (int) r4
            float r4 = (float) r4
            float r2 = r2 * r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            long r3 = r4 << r3
            long r1 = r1 & r6
            long r1 = r1 | r3
            long r3 = r0.v
            boolean r3 = defpackage.jk4.c(r3, r1)
            if (r3 != 0) goto L5f
            r0.v = r1
            wt2 r0 = r0.a
            r0.q(r1)
        L5f:
            ut2 r3 = r9.A
            qh1 r4 = r9.g0
            kk3 r5 = r9.h0
            long r6 = r9.Y
            mc r8 = r9.q0
            r3.e(r4, r5, r6, r8)
            r0 = 0
            r9.f(r0)
        L70:
            return
    }
}
