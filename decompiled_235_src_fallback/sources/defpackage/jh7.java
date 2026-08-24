package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh7  reason: default package */
/* loaded from: classes.dex */
public final class jh7 extends defpackage.z64 implements defpackage.jm3 {
    public float k0;
    public float l0;

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r2 = r2.c(r3)
            float r3 = r0.l0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r0 = r0.l0
            int r0 = r1.r0(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r2 >= r0) goto L17
            return r0
        L17:
            return r2
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r5, defpackage.x24 r6, long r7) {
            r4 = this;
            float r0 = r4.k0
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 != 0) goto L21
            int r0 = defpackage.q21.j(r7)
            if (r0 != 0) goto L21
            float r0 = r4.k0
            int r0 = r5.r0(r0)
            int r2 = defpackage.q21.h(r7)
            if (r0 >= 0) goto L1c
            r0 = r1
        L1c:
            if (r0 <= r2) goto L1f
            goto L25
        L1f:
            r2 = r0
            goto L25
        L21:
            int r2 = defpackage.q21.j(r7)
        L25:
            int r0 = defpackage.q21.h(r7)
            float r3 = r4.l0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L4a
            int r3 = defpackage.q21.i(r7)
            if (r3 != 0) goto L4a
            float r4 = r4.l0
            int r4 = r5.r0(r4)
            int r3 = defpackage.q21.g(r7)
            if (r4 >= 0) goto L44
            goto L45
        L44:
            r1 = r4
        L45:
            if (r1 <= r3) goto L48
            goto L4e
        L48:
            r3 = r1
            goto L4e
        L4a:
            int r3 = defpackage.q21.i(r7)
        L4e:
            int r4 = defpackage.q21.g(r7)
            long r7 = defpackage.s21.a(r2, r0, r3, r4)
            dx4 r4 = r6.y(r7)
            int r6 = r4.A
            int r7 = r4.B
            jv r8 = new jv
            r0 = 11
            r8.<init>(r4, r0)
            zt1 r4 = defpackage.zt1.A
            f34 r4 = r5.K(r6, r7, r4, r8)
            return r4
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r2 = r2.u(r3)
            float r3 = r0.k0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r0 = r0.k0
            int r0 = r1.r0(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r2 >= r0) goto L17
            return r0
        L17:
            return r2
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r2 = r2.V(r3)
            float r3 = r0.l0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r0 = r0.l0
            int r0 = r1.r0(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r2 >= r0) goto L17
            return r0
        L17:
            return r2
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r2 = r2.n(r3)
            float r3 = r0.k0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r0 = r0.k0
            int r0 = r1.r0(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r2 >= r0) goto L17
            return r0
        L17:
            return r2
    }
}
