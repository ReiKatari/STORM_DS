package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qj4 implements defpackage.qr2 {
    public static final defpackage.qj4 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            qj4 r0 = new qj4
            r0.<init>()
            defpackage.qj4.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheAchievement"
            r3 = 2
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "id"
            r2 = 1
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 1
            r0.<init>(r2, r4)
            r1.m(r0)
            java.lang.String r0 = "memoryAddress"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r0.<init>(r3, r2)
            r1.m(r0)
            defpackage.qj4.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            r2 = 2
            gg3[] r2 = new defpackage.gg3[r2]
            fz3 r0 = defpackage.fz3.a
            r1 = 0
            r2[r1] = r0
            ps6 r0 = defpackage.ps6.a
            r1 = 1
            r2[r1] = r0
            return r2
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r10) {
            r9 = this;
            wb6 r9 = defpackage.qj4.descriptor
            ux0 r10 = r10.c(r9)
            r10.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = r0
            r6 = r1
        L10:
            if (r5 == 0) goto L33
            int r7 = r10.q(r9)
            r8 = -1
            if (r7 == r8) goto L31
            if (r7 == 0) goto L2a
            if (r7 != r0) goto L24
            java.lang.String r4 = r10.A(r9, r0)
            r6 = r6 | 2
            goto L10
        L24:
            lg7 r9 = new lg7
            r9.<init>(r7)
            throw r9
        L2a:
            long r2 = r10.c0(r9, r1)
            r6 = r6 | 1
            goto L10
        L31:
            r5 = r1
            goto L10
        L33:
            r10.a(r9)
            sj4 r9 = new sj4
            r9.<init>(r4, r6, r2)
            return r9
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r5, java.lang.Object r6) {
            r4 = this;
            sj4 r6 = (defpackage.sj4) r6
            r6.getClass()
            java.lang.String r4 = r6.b
            long r0 = r6.a
            wb6 r6 = defpackage.qj4.descriptor
            vx0 r5 = r5.c(r6)
            boolean r2 = r5.i(r6)
            if (r2 == 0) goto L16
            goto L1c
        L16:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L20
        L1c:
            r2 = 0
            r5.n(r6, r2, r0)
        L20:
            boolean r0 = r5.i(r6)
            if (r0 == 0) goto L27
            goto L2f
        L27:
            java.lang.String r0 = ""
            boolean r0 = defpackage.nb3.k(r4, r0)
            if (r0 != 0) goto L33
        L2f:
            r0 = 1
            r5.Q(r6, r0, r4)
        L33:
            r5.a(r6)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.qj4.descriptor
            return r0
    }
}
