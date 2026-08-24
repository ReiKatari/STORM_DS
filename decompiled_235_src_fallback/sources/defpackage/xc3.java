package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc3  reason: default package */
/* loaded from: classes.dex */
public final class xc3 extends defpackage.uc3 {
    public final defpackage.ed3 d0;
    public final defpackage.yc3 e0;
    public final defpackage.iq0 f0;
    public final java.lang.Object g0;

    public xc3(defpackage.ed3 r1, defpackage.yc3 r2, defpackage.iq0 r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r0.g0 = r4
            return
    }

    @Override // defpackage.uc3
    public final boolean q() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.uc3
    public final void r(java.lang.Throwable r6) {
            r5 = this;
            iq0 r6 = r5.f0
            iq0 r0 = defpackage.ed3.g0(r6)
            ed3 r1 = r5.d0
            yc3 r2 = r5.e0
            java.lang.Object r5 = r5.g0
            if (r0 == 0) goto L15
            boolean r0 = r1.t0(r2, r0, r5)
            if (r0 == 0) goto L15
            goto L2c
        L15:
            gg4 r0 = r2.A
            lw3 r3 = new lw3
            r4 = 2
            r3.<init>(r4)
            r0.b(r3, r4)
            iq0 r6 = defpackage.ed3.g0(r6)
            if (r6 == 0) goto L2d
            boolean r6 = r1.t0(r2, r6, r5)
            if (r6 == 0) goto L2d
        L2c:
            return
        L2d:
            java.lang.Object r5 = r1.I(r2, r5)
            r1.d(r5)
            return
    }
}
