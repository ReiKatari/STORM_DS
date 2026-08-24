package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r10 implements defpackage.qr2 {
    public static final defpackage.r10 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            r10 r0 = new r10
            r0.<init>()
            defpackage.r10.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundPreview"
            r3 = 1
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "backgroundParcelable"
            r2 = 0
            r1.l(r0, r2)
            defpackage.r10.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            r2 = 1
            gg3[] r2 = new defpackage.gg3[r2]
            e10 r0 = defpackage.e10.a
            r1 = 0
            r2[r1] = r0
            return r2
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r8) {
            r7 = this;
            wb6 r7 = defpackage.r10.descriptor
            ux0 r8 = r8.c(r7)
            r8.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = r0
            r4 = r1
        Le:
            if (r3 == 0) goto L2b
            int r5 = r8.q(r7)
            r6 = -1
            if (r5 == r6) goto L29
            if (r5 != 0) goto L23
            e10 r4 = defpackage.e10.a
            java.lang.Object r2 = r8.G(r7, r1, r4, r2)
            g10 r2 = (defpackage.g10) r2
            r4 = r0
            goto Le
        L23:
            lg7 r7 = new lg7
            r7.<init>(r5)
            throw r7
        L29:
            r3 = r1
            goto Le
        L2b:
            r8.a(r7)
            t10 r7 = new t10
            r7.<init>(r4, r2)
            return r7
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            t10 r4 = (defpackage.t10) r4
            r4.getClass()
            wb6 r2 = defpackage.r10.descriptor
            vx0 r3 = r3.c(r2)
            e10 r0 = defpackage.e10.a
            g10 r4 = r4.l
            r1 = 0
            r3.w(r2, r1, r0, r4)
            r3.a(r2)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.r10.descriptor
            return r0
    }
}
