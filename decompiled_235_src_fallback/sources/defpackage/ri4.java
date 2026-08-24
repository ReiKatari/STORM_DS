package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ri4 implements defpackage.qr2 {
    public static final defpackage.ri4 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            ri4 r0 = new ri4
            r0.<init>()
            defpackage.ri4.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerFile"
            r3 = 2
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "records"
            r2 = 1
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 0
            r0.<init>(r2, r4)
            r1.m(r0)
            java.lang.String r0 = "expirationPolicyVersion"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r2 = 0
            r0.<init>(r3, r2)
            r1.m(r0)
            defpackage.ri4.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            go3[] r2 = defpackage.ti4.c
            r0 = 2
            gg3[] r0 = new defpackage.gg3[r0]
            r1 = 0
            r2 = r2[r1]
            java.lang.Object r2 = r2.getValue()
            r0[r1] = r2
            r2 = 1
            o93 r1 = defpackage.o93.a
            r0[r2] = r1
            return r0
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r10) {
            r9 = this;
            wb6 r9 = defpackage.ri4.descriptor
            ux0 r10 = r10.c(r9)
            go3[] r0 = defpackage.ti4.c
            r10.getClass()
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = r2
            r6 = r5
        L11:
            if (r4 == 0) goto L3e
            int r7 = r10.q(r9)
            r8 = -1
            if (r7 == r8) goto L3c
            if (r7 == 0) goto L2b
            if (r7 != r1) goto L25
            int r6 = r10.H(r9, r1)
            r5 = r5 | 2
            goto L11
        L25:
            lg7 r9 = new lg7
            r9.<init>(r7)
            throw r9
        L2b:
            r7 = r0[r2]
            java.lang.Object r7 = r7.getValue()
            gg3 r7 = (defpackage.gg3) r7
            java.lang.Object r3 = r10.G(r9, r2, r7, r3)
            java.util.List r3 = (java.util.List) r3
            r5 = r5 | 1
            goto L11
        L3c:
            r4 = r2
            goto L11
        L3e:
            r10.a(r9)
            ti4 r9 = new ti4
            r9.<init>(r5, r3, r6)
            return r9
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r4, java.lang.Object r5) {
            r3 = this;
            ti4 r5 = (defpackage.ti4) r5
            r5.getClass()
            int r3 = r5.b
            java.util.List r5 = r5.a
            wb6 r0 = defpackage.ri4.descriptor
            vx0 r4 = r4.c(r0)
            go3[] r1 = defpackage.ti4.c
            boolean r2 = r4.i(r0)
            if (r2 == 0) goto L18
            goto L20
        L18:
            yt1 r2 = defpackage.yt1.A
            boolean r2 = defpackage.nb3.k(r5, r2)
            if (r2 != 0) goto L2c
        L20:
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            gg3 r1 = (defpackage.gg3) r1
            r4.w(r0, r2, r1, r5)
        L2c:
            boolean r5 = r4.i(r0)
            if (r5 == 0) goto L33
            goto L35
        L33:
            if (r3 == 0) goto L39
        L35:
            r5 = 1
            r4.O(r5, r3, r0)
        L39:
            r4.a(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.ri4.descriptor
            return r0
    }
}
