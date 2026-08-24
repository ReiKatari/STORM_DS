package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej6  reason: default package */
/* loaded from: classes.dex */
public final class ej6 extends defpackage.z64 implements defpackage.jm3 {
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public boolean o0;

    public final long R0(defpackage.g34 r7) {
            r6 = this;
            float r0 = r6.m0
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.m0
            int r0 = r7.r0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.n0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.n0
            int r3 = r7.r0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.k0
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.k0
            int r4 = r7.r0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.l0
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.l0
            int r6 = r7.r0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.s21.a(r4, r0, r2, r3)
            return r6
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            long r0 = r2.R0(r3)
            boolean r3 = defpackage.q21.e(r0)
            if (r3 == 0) goto Lf
            int r2 = defpackage.q21.g(r0)
            return r2
        Lf:
            boolean r2 = r2.o0
            if (r2 == 0) goto L14
            goto L18
        L14:
            int r5 = defpackage.s21.g(r5, r0)
        L18:
            int r2 = r4.c(r5)
            int r2 = defpackage.s21.f(r2, r0)
            return r2
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r7, defpackage.x24 r8, long r9) {
            r6 = this;
            long r0 = r6.R0(r7)
            boolean r2 = r6.o0
            if (r2 == 0) goto Ld
            long r9 = defpackage.s21.e(r9, r0)
            goto L71
        Ld:
            float r2 = r6.k0
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L1a
            int r2 = defpackage.q21.j(r0)
            goto L25
        L1a:
            int r2 = defpackage.q21.j(r9)
            int r3 = defpackage.q21.h(r0)
            if (r2 <= r3) goto L25
            r2 = r3
        L25:
            float r3 = r6.m0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L32
            int r3 = defpackage.q21.h(r0)
            goto L3d
        L32:
            int r3 = defpackage.q21.h(r9)
            int r4 = defpackage.q21.j(r0)
            if (r3 >= r4) goto L3d
            r3 = r4
        L3d:
            float r4 = r6.l0
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L4a
            int r4 = defpackage.q21.i(r0)
            goto L55
        L4a:
            int r4 = defpackage.q21.i(r9)
            int r5 = defpackage.q21.g(r0)
            if (r4 <= r5) goto L55
            r4 = r5
        L55:
            float r6 = r6.n0
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L62
            int r6 = defpackage.q21.g(r0)
            goto L6d
        L62:
            int r6 = defpackage.q21.g(r9)
            int r9 = defpackage.q21.i(r0)
            if (r6 >= r9) goto L6d
            r6 = r9
        L6d:
            long r9 = defpackage.s21.a(r2, r3, r4, r6)
        L71:
            dx4 r6 = r8.y(r9)
            int r8 = r6.A
            int r9 = r6.B
            jv r10 = new jv
            r0 = 7
            r10.<init>(r6, r0)
            zt1 r6 = defpackage.zt1.A
            f34 r6 = r7.K(r8, r9, r6, r10)
            return r6
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            long r0 = r2.R0(r3)
            boolean r3 = defpackage.q21.f(r0)
            if (r3 == 0) goto Lf
            int r2 = defpackage.q21.h(r0)
            return r2
        Lf:
            boolean r2 = r2.o0
            if (r2 == 0) goto L14
            goto L18
        L14:
            int r5 = defpackage.s21.f(r5, r0)
        L18:
            int r2 = r4.u(r5)
            int r2 = defpackage.s21.g(r2, r0)
            return r2
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            long r0 = r2.R0(r3)
            boolean r3 = defpackage.q21.e(r0)
            if (r3 == 0) goto Lf
            int r2 = defpackage.q21.g(r0)
            return r2
        Lf:
            boolean r2 = r2.o0
            if (r2 == 0) goto L14
            goto L18
        L14:
            int r5 = defpackage.s21.g(r5, r0)
        L18:
            int r2 = r4.V(r5)
            int r2 = defpackage.s21.f(r2, r0)
            return r2
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            long r0 = r2.R0(r3)
            boolean r3 = defpackage.q21.f(r0)
            if (r3 == 0) goto Lf
            int r2 = defpackage.q21.h(r0)
            return r2
        Lf:
            boolean r2 = r2.o0
            if (r2 == 0) goto L14
            goto L18
        L14:
            int r5 = defpackage.s21.f(r5, r0)
        L18:
            int r2 = r4.n(r5)
            int r2 = defpackage.s21.g(r2, r0)
            return r2
    }
}
