package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm0  reason: default package */
/* loaded from: classes.dex */
public final class hm0 extends defpackage.p96 {
    public final defpackage.v80 Z;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray d0;

    public hm0(long r1, defpackage.hm0 r3, defpackage.v80 r4, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r0.Z = r4
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = defpackage.x80.b
            int r2 = r2 * 2
            r1.<init>(r2)
            r0.d0 = r1
            return
    }

    @Override // defpackage.p96
    public final int l() {
            r0 = this;
            int r0 = defpackage.x80.b
            return r0
    }

    @Override // defpackage.p96
    public final void m(int r7, defpackage.l61 r8) {
            r6 = this;
            int r0 = defpackage.x80.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.d0
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.q(r7)
            boolean r3 = r2 instanceof defpackage.zr7
            v80 r4 = r6.Z
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof defpackage.as7
            if (r3 == 0) goto L22
            goto L58
        L22:
            gr1 r3 = defpackage.x80.j
            if (r2 == r3) goto L48
            gr1 r3 = defpackage.x80.k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            gr1 r3 = defpackage.x80.g
            if (r2 == r3) goto L12
            gr1 r3 = defpackage.x80.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            gr1 r6 = defpackage.x80.i
            if (r2 == r6) goto L79
            gr1 r6 = defpackage.x80.d
            if (r2 != r6) goto L3d
            goto L79
        L3d:
            gr1 r6 = defpackage.x80.l
            if (r2 != r6) goto L42
            goto L79
        L42:
            java.lang.String r6 = "unexpected state: "
            defpackage.e41.h(r2, r6)
            return
        L48:
            r6.s(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            qn2 r6 = r4.B
            if (r6 == 0) goto L79
            defpackage.oi2.k(r6, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            gr1 r3 = defpackage.x80.j
            goto L5f
        L5d:
            gr1 r3 = defpackage.x80.k
        L5f:
            boolean r2 = r6.p(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.s(r7, r5)
            r2 = r1 ^ 1
            r6.r(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            qn2 r6 = r4.B
            if (r6 == 0) goto L79
            defpackage.oi2.k(r6, r0, r8)
        L79:
            return
    }

    public final boolean p(int r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r4 = r4 * 2
            r0 = 1
            int r4 = r4 + r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.d0
            boolean r2 = r1.compareAndSet(r4, r5, r6)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            java.lang.Object r1 = r1.get(r4)
            if (r1 == r5) goto L4
            r3 = 0
            return r3
    }

    public final java.lang.Object q(int r1) {
            r0 = this;
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.d0
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public final void r(int r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            v80 r6 = r4.Z
            r6.getClass()
            int r0 = defpackage.x80.b
            long r0 = (long) r0
            long r2 = r4.X
            long r2 = r2 * r0
            long r0 = (long) r5
            long r2 = r2 + r0
            r6.W(r2)
        L12:
            r4.n()
            return
    }

    public final void s(int r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r1 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.d0
            r0.set(r1, r2)
            return
    }

    public final void t(int r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.d0
            r0.set(r1, r2)
            return
    }
}
