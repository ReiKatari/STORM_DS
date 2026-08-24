package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ap0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ap0 implements defpackage.qr2 {
    public static final defpackage.ap0 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            ap0 r0 = new ap0
            r0.<init>()
            defpackage.ap0.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.ui.cheats.CheatsNavigation.GameFolders"
            r3 = 1
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "gameName"
            r2 = 0
            r1.l(r0, r2)
            defpackage.ap0.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            ps6 r2 = defpackage.ps6.a
            gg3 r2 = defpackage.q60.I(r2)
            r0 = 1
            gg3[] r0 = new defpackage.gg3[r0]
            r1 = 0
            r0[r1] = r2
            return r0
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r8) {
            r7 = this;
            wb6 r7 = defpackage.ap0.descriptor
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
            ps6 r4 = defpackage.ps6.a
            java.lang.Object r2 = r8.P(r7, r1, r4, r2)
            java.lang.String r2 = (java.lang.String) r2
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
            cp0 r7 = new cp0
            r7.<init>(r4, r2)
            return r7
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            cp0 r4 = (defpackage.cp0) r4
            r4.getClass()
            wb6 r2 = defpackage.ap0.descriptor
            vx0 r3 = r3.c(r2)
            ps6 r0 = defpackage.ps6.a
            java.lang.String r4 = r4.h0
            r1 = 0
            r3.V(r2, r1, r0, r4)
            r3.a(r2)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.ap0.descriptor
            return r0
    }
}
