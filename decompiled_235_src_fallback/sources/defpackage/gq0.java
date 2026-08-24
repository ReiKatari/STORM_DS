package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq0  reason: default package */
/* loaded from: classes.dex */
public final class gq0 extends defpackage.uc3 {
    public final defpackage.rj0 d0;

    public gq0(defpackage.rj0 r1) {
            r0 = this;
            r0.<init>()
            r0.d0 = r1
            return
    }

    @Override // defpackage.uc3
    public final boolean q() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.uc3
    public final void r(java.lang.Throwable r2) {
            r1 = this;
            ed3 r2 = r1.p()
            rj0 r1 = r1.d0
            java.lang.Throwable r2 = r1.q(r2)
            boolean r0 = r1.B()
            if (r0 != 0) goto L12
            r0 = 0
            goto L1a
        L12:
            r41 r0 = r1.R
            nk1 r0 = (defpackage.nk1) r0
            boolean r0 = r0.p(r2)
        L1a:
            if (r0 == 0) goto L1d
            goto L29
        L1d:
            r1.w(r2)
            boolean r2 = r1.B()
            if (r2 != 0) goto L29
            r1.o()
        L29:
            return
    }
}
