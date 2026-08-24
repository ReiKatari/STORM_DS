package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r71  reason: default package */
/* loaded from: classes.dex */
public final class r71 extends defpackage.sr4 {
    public defpackage.sr4 X;
    public final defpackage.sr4 Y;
    public final defpackage.z31 Z;
    public final int d0;
    public final boolean e0;
    public final defpackage.ss4 f0;
    public long g0;
    public boolean h0;
    public final defpackage.rs4 i0;
    public final defpackage.vs4 j0;

    public r71(defpackage.sr4 r1, defpackage.sr4 r2, defpackage.z31 r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            ss4 r1 = new ss4
            r2 = 0
            r1.<init>(r2)
            r0.f0 = r1
            r1 = -1
            r0.g0 = r1
            rs4 r1 = new rs4
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            r0.i0 = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.j0 = r1
            return
    }

    @Override // defpackage.sr4
    public final void d(float r1) {
            r0 = this;
            rs4 r0 = r0.i0
            r0.i(r1)
            return
    }

    @Override // defpackage.sr4
    public final void e(defpackage.z40 r1) {
            r0 = this;
            vs4 r0 = r0.j0
            r0.setValue(r1)
            return
    }

    @Override // defpackage.sr4
    public final long h() {
            r9 = this;
            sr4 r0 = r9.X
            r1 = 0
            if (r0 == 0) goto Lb
            long r3 = r0.h()
            goto Lc
        Lb:
            r3 = r1
        Lc:
            sr4 r9 = r9.Y
            if (r9 == 0) goto L14
            long r1 = r9.h()
        L14:
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r0 = 0
            r7 = 1
            if (r9 == 0) goto L21
            r9 = r7
            goto L22
        L21:
            r9 = r0
        L22:
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L27
            r0 = r7
        L27:
            if (r9 == 0) goto L48
            if (r0 == 0) goto L48
            float r9 = defpackage.xi6.e(r3)
            float r0 = defpackage.xi6.e(r1)
            float r9 = java.lang.Math.max(r9, r0)
            float r0 = defpackage.xi6.c(r3)
            float r1 = defpackage.xi6.c(r1)
            float r0 = java.lang.Math.max(r0, r1)
            long r0 = defpackage.ii2.n(r9, r0)
            return r0
        L48:
            return r5
    }

    @Override // defpackage.sr4
    public final void i(defpackage.um3 r10) {
            r9 = this;
            boolean r0 = r9.h0
            sr4 r1 = r9.Y
            rs4 r2 = r9.i0
            if (r0 == 0) goto L10
            float r0 = r2.h()
            r9.j(r10, r1, r0)
            return
        L10:
            long r3 = android.os.SystemClock.uptimeMillis()
            long r5 = r9.g0
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L1e
            r9.g0 = r3
        L1e:
            long r5 = r9.g0
            long r3 = r3 - r5
            float r0 = (float) r3
            int r3 = r9.d0
            float r3 = (float) r3
            float r0 = r0 / r3
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = defpackage.gi2.p(r0, r3, r4)
            float r5 = r2.h()
            float r5 = r5 * r3
            boolean r3 = r9.e0
            if (r3 == 0) goto L3c
            float r2 = r2.h()
            float r2 = r2 - r5
            goto L40
        L3c:
            float r2 = r2.h()
        L40:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r3 = 1
            if (r0 < 0) goto L47
            r0 = r3
            goto L48
        L47:
            r0 = 0
        L48:
            r9.h0 = r0
            sr4 r0 = r9.X
            r9.j(r10, r0, r2)
            r9.j(r10, r1, r5)
            boolean r10 = r9.h0
            if (r10 == 0) goto L5a
            r10 = 0
            r9.X = r10
            return
        L5a:
            ss4 r9 = r9.f0
            int r10 = r9.h()
            int r10 = r10 + r3
            r9.i(r10)
            return
    }

    public final void j(defpackage.um3 r14, defpackage.sr4 r15, float r16) {
            r13 = this;
            zj0 r0 = r14.A
            if (r15 == 0) goto L90
            r1 = 0
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 > 0) goto Lb
            goto L90
        Lb:
            long r1 = r0.e()
            long r3 = r15.h()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1e
        L1c:
            r9 = r1
            goto L3c
        L1e:
            boolean r7 = defpackage.xi6.f(r3)
            if (r7 == 0) goto L25
            goto L30
        L25:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L2a
            goto L1c
        L2a:
            boolean r7 = defpackage.xi6.f(r1)
            if (r7 == 0) goto L31
        L30:
            goto L1c
        L31:
            z31 r7 = r13.Z
            long r7 = r7.c(r3, r1)
            long r3 = defpackage.kn2.c0(r3, r7)
            r9 = r3
        L3c:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            vs4 r13 = r13.j0
            if (r3 != 0) goto L43
            goto L49
        L43:
            boolean r3 = defpackage.xi6.f(r1)
            if (r3 == 0) goto L58
        L49:
            java.lang.Object r13 = r13.getValue()
            r12 = r13
            z40 r12 = (defpackage.z40) r12
            r8 = r14
            r7 = r15
            r11 = r16
            r7.g(r8, r9, r11, r12)
            return
        L58:
            float r3 = defpackage.xi6.e(r1)
            float r4 = defpackage.xi6.e(r9)
            float r3 = r3 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = defpackage.xi6.c(r1)
            float r2 = defpackage.xi6.c(r9)
            float r1 = r1 - r2
            float r1 = r1 / r4
            bt r2 = r0.B
            java.lang.Object r2 = r2.B
            os0 r2 = (defpackage.os0) r2
            r2.c0(r3, r1, r3, r1)
            java.lang.Object r13 = r13.getValue()
            r12 = r13
            z40 r12 = (defpackage.z40) r12
            r8 = r14
            r7 = r15
            r11 = r16
            r7.g(r8, r9, r11, r12)
            bt r13 = r0.B
            java.lang.Object r13 = r13.B
            os0 r13 = (defpackage.os0) r13
            float r14 = -r3
            float r15 = -r1
            r13.c0(r14, r15, r14, r15)
        L90:
            return
    }
}
