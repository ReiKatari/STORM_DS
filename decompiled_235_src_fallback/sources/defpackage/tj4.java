package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tj4 implements defpackage.qr2 {
    public static final defpackage.tj4 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            tj4 r0 = new tj4
            r0.<init>()
            defpackage.tj4.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheFile"
            r3 = 7
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "romHash"
            r2 = 1
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 1
            r0.<init>(r2, r4)
            r1.m(r0)
            java.lang.String r0 = "gameId"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 2
            r5 = 1
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "achievements"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 3
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "leaderboards"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 4
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "richPresencePatch"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 5
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "iconUrl"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 6
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "fetchedAtEpochMs"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r0.<init>(r3, r2)
            r1.m(r0)
            defpackage.tj4.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r5 = this;
            go3[] r5 = defpackage.vj4.h
            r0 = 7
            gg3[] r0 = new defpackage.gg3[r0]
            ps6 r1 = defpackage.ps6.a
            r2 = 0
            r0[r2] = r1
            fz3 r2 = defpackage.fz3.a
            r3 = 1
            r0[r3] = r2
            r3 = 2
            r4 = r5[r3]
            java.lang.Object r4 = r4.getValue()
            r0[r3] = r4
            r3 = 3
            r5 = r5[r3]
            java.lang.Object r5 = r5.getValue()
            r0[r3] = r5
            r5 = 4
            gg3 r3 = defpackage.q60.I(r1)
            r0[r5] = r3
            r5 = 5
            r0[r5] = r1
            r5 = 6
            r0[r5] = r2
            return r0
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r20) {
            r19 = this;
            wb6 r0 = defpackage.tj4.descriptor
            r1 = r20
            ux0 r1 = r1.c(r0)
            go3[] r2 = defpackage.vj4.h
            r1.getClass()
            r3 = 1
            r5 = 0
            r6 = 0
            r14 = r5
            r15 = r14
            r16 = r15
            r10 = r6
            r12 = r10
            r9 = 0
            r7 = r3
            r6 = r16
        L1b:
            if (r7 == 0) goto L7f
            int r8 = r1.q(r0)
            switch(r8) {
                case -1: goto L7c;
                case 0: goto L74;
                case 1: goto L6d;
                case 2: goto L5a;
                case 3: goto L47;
                case 4: goto L3a;
                case 5: goto L32;
                case 6: goto L2a;
                default: goto L24;
            }
        L24:
            lg7 r0 = new lg7
            r0.<init>(r8)
            throw r0
        L2a:
            r8 = 6
            long r12 = r1.c0(r0, r8)
            r9 = r9 | 64
            goto L1b
        L32:
            r8 = 5
            java.lang.String r16 = r1.A(r0, r8)
            r9 = r9 | 32
            goto L1b
        L3a:
            ps6 r8 = defpackage.ps6.a
            r4 = 4
            java.lang.Object r4 = r1.P(r0, r4, r8, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r9 = r9 | 16
            goto L1b
        L47:
            r4 = 3
            r8 = r2[r4]
            java.lang.Object r8 = r8.getValue()
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r4 = r1.G(r0, r4, r8, r6)
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r9 = r9 | 8
            goto L1b
        L5a:
            r4 = 2
            r8 = r2[r4]
            java.lang.Object r8 = r8.getValue()
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r4 = r1.G(r0, r4, r8, r5)
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            r9 = r9 | 4
            goto L1b
        L6d:
            long r10 = r1.c0(r0, r3)
            r9 = r9 | 2
            goto L1b
        L74:
            r4 = 0
            java.lang.String r14 = r1.A(r0, r4)
            r9 = r9 | 1
            goto L1b
        L7c:
            r4 = 0
            r7 = r4
            goto L1b
        L7f:
            r1.a(r0)
            vj4 r8 = new vj4
            r17 = r5
            r18 = r6
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18)
            return r8
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r14, java.lang.Object r15) {
            r13 = this;
            vj4 r15 = (defpackage.vj4) r15
            r15.getClass()
            long r0 = r15.g
            java.lang.String r13 = r15.f
            java.lang.String r2 = r15.e
            java.util.List r3 = r15.d
            java.util.List r4 = r15.c
            long r5 = r15.b
            java.lang.String r15 = r15.a
            wb6 r7 = defpackage.tj4.descriptor
            vx0 r14 = r14.c(r7)
            go3[] r8 = defpackage.vj4.h
            boolean r9 = r14.i(r7)
            java.lang.String r10 = ""
            if (r9 == 0) goto L24
            goto L2a
        L24:
            boolean r9 = defpackage.nb3.k(r15, r10)
            if (r9 != 0) goto L2e
        L2a:
            r9 = 0
            r14.Q(r7, r9, r15)
        L2e:
            boolean r15 = r14.i(r7)
            r11 = 0
            if (r15 == 0) goto L37
            goto L3b
        L37:
            int r15 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r15 == 0) goto L3f
        L3b:
            r15 = 1
            r14.n(r7, r15, r5)
        L3f:
            boolean r15 = r14.i(r7)
            yt1 r5 = defpackage.yt1.A
            if (r15 == 0) goto L48
            goto L4e
        L48:
            boolean r15 = defpackage.nb3.k(r4, r5)
            if (r15 != 0) goto L5a
        L4e:
            r15 = 2
            r6 = r8[r15]
            java.lang.Object r6 = r6.getValue()
            gg3 r6 = (defpackage.gg3) r6
            r14.w(r7, r15, r6, r4)
        L5a:
            boolean r15 = r14.i(r7)
            if (r15 == 0) goto L61
            goto L67
        L61:
            boolean r15 = defpackage.nb3.k(r3, r5)
            if (r15 != 0) goto L73
        L67:
            r15 = 3
            r4 = r8[r15]
            java.lang.Object r4 = r4.getValue()
            gg3 r4 = (defpackage.gg3) r4
            r14.w(r7, r15, r4, r3)
        L73:
            boolean r15 = r14.i(r7)
            if (r15 == 0) goto L7a
            goto L7c
        L7a:
            if (r2 == 0) goto L82
        L7c:
            ps6 r15 = defpackage.ps6.a
            r3 = 4
            r14.V(r7, r3, r15, r2)
        L82:
            boolean r15 = r14.i(r7)
            if (r15 == 0) goto L89
            goto L8f
        L89:
            boolean r15 = defpackage.nb3.k(r13, r10)
            if (r15 != 0) goto L93
        L8f:
            r15 = 5
            r14.Q(r7, r15, r13)
        L93:
            boolean r13 = r14.i(r7)
            if (r13 == 0) goto L9a
            goto L9e
        L9a:
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 == 0) goto La2
        L9e:
            r13 = 6
            r14.n(r7, r13, r0)
        La2:
            r14.a(r7)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.tj4.descriptor
            return r0
    }
}
