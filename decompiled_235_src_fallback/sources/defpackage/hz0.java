package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz0  reason: default package */
/* loaded from: classes.dex */
public final class hz0 extends defpackage.v80 {
    public final defpackage.m80 n0;

    public hz0(int r1, defpackage.m80 r2, defpackage.qn2 r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.n0 = r2
            m80 r0 = defpackage.m80.SUSPEND
            r3 = 0
            if (r2 == r0) goto L1a
            r0 = 1
            if (r1 < r0) goto Le
            return
        Le:
            java.lang.String r0 = "Buffered channel capacity must be at least 1, but "
            java.lang.String r2 = " was specified"
            java.lang.String r0 = defpackage.lb1.k(r0, r1, r2)
            defpackage.i.f(r0)
            throw r3
        L1a:
            java.lang.Class<v80> r0 = defpackage.v80.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r0 = r0.c()
            java.lang.String r1 = " instead"
            java.lang.String r2 = "This implementation does not support suspension for senders, use "
            defpackage.u34.A(r0, r1, r2)
            throw r3
    }

    @Override // defpackage.v80
    public final boolean H() {
            r1 = this;
            m80 r1 = r1.n0
            m80 r0 = defpackage.m80.DROP_OLDEST
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final java.lang.Object X(boolean r3, java.lang.Object r4) {
            r2 = this;
            m80 r0 = r2.n0
            m80 r1 = defpackage.m80.DROP_LATEST
            if (r0 != r1) goto L26
            java.lang.Object r0 = super.c(r4)
            boolean r1 = r0 instanceof defpackage.fm0
            if (r1 == 0) goto L25
            boolean r1 = r0 instanceof defpackage.em0
            if (r1 == 0) goto L13
            goto L25
        L13:
            if (r3 == 0) goto L22
            qn2 r2 = r2.B
            if (r2 == 0) goto L22
            r3 = 0
            ug r2 = defpackage.oi2.l(r2, r4, r3)
            if (r2 != 0) goto L21
            goto L22
        L21:
            throw r2
        L22:
            jg7 r2 = defpackage.jg7.a
            return r2
        L25:
            return r0
        L26:
            java.lang.Object r2 = r2.T(r4)
            return r2
    }

    @Override // defpackage.v80, defpackage.ob6
    public final java.lang.Object a(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            r2 = 1
            java.lang.Object r2 = r1.X(r2, r3)
            boolean r2 = r2 instanceof defpackage.em0
            if (r2 == 0) goto L21
            qn2 r2 = r1.B
            if (r2 == 0) goto L1c
            r0 = 0
            ug r2 = defpackage.oi2.l(r2, r3, r0)
            if (r2 == 0) goto L1c
            java.lang.Throwable r1 = r1.y()
            defpackage.mb3.q(r2, r1)
            throw r2
        L1c:
            java.lang.Throwable r1 = r1.y()
            throw r1
        L21:
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    @Override // defpackage.v80, defpackage.ob6
    public final java.lang.Object c(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.X(r0, r2)
            return r1
    }
}
