package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wj4 implements defpackage.qr2 {
    public static final defpackage.wj4 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            wj4 r0 = new wj4
            r0.<init>()
            defpackage.wj4.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheLeaderboard"
            r3 = 3
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
            r4 = 2
            r5 = 1
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "format"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r0.<init>(r3, r2)
            r1.m(r0)
            defpackage.wj4.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            r2 = 3
            gg3[] r2 = new defpackage.gg3[r2]
            fz3 r0 = defpackage.fz3.a
            r1 = 0
            r2[r1] = r0
            ps6 r0 = defpackage.ps6.a
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return r2
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r12) {
            r11 = this;
            wb6 r11 = defpackage.wj4.descriptor
            ux0 r12 = r12.c(r11)
            r12.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = r1
            r7 = r2
            r9 = r4
            r10 = r9
            r2 = r0
        L13:
            if (r2 == 0) goto L40
            int r3 = r12.q(r11)
            r4 = -1
            if (r3 == r4) goto L3e
            if (r3 == 0) goto L37
            if (r3 == r0) goto L30
            r4 = 2
            if (r3 != r4) goto L2a
            java.lang.String r10 = r12.A(r11, r4)
            r6 = r6 | 4
            goto L13
        L2a:
            lg7 r11 = new lg7
            r11.<init>(r3)
            throw r11
        L30:
            java.lang.String r9 = r12.A(r11, r0)
            r6 = r6 | 2
            goto L13
        L37:
            long r7 = r12.c0(r11, r1)
            r6 = r6 | 1
            goto L13
        L3e:
            r2 = r1
            goto L13
        L40:
            r12.a(r11)
            yj4 r5 = new yj4
            r5.<init>(r6, r7, r9, r10)
            return r5
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r6, java.lang.Object r7) {
            r5 = this;
            yj4 r7 = (defpackage.yj4) r7
            r7.getClass()
            java.lang.String r5 = r7.c
            java.lang.String r0 = r7.b
            long r1 = r7.a
            wb6 r7 = defpackage.wj4.descriptor
            vx0 r6 = r6.c(r7)
            boolean r3 = r6.i(r7)
            if (r3 == 0) goto L18
            goto L1e
        L18:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
        L1e:
            r3 = 0
            r6.n(r7, r3, r1)
        L22:
            boolean r1 = r6.i(r7)
            java.lang.String r2 = ""
            if (r1 == 0) goto L2b
            goto L31
        L2b:
            boolean r1 = defpackage.nb3.k(r0, r2)
            if (r1 != 0) goto L35
        L31:
            r1 = 1
            r6.Q(r7, r1, r0)
        L35:
            boolean r0 = r6.i(r7)
            if (r0 == 0) goto L3c
            goto L42
        L3c:
            boolean r0 = defpackage.nb3.k(r5, r2)
            if (r0 != 0) goto L46
        L42:
            r0 = 2
            r6.Q(r7, r0, r5)
        L46:
            r6.a(r7)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.wj4.descriptor
            return r0
    }
}
