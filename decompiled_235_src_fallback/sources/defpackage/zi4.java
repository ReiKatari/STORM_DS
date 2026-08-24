package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zi4 implements defpackage.qr2 {
    public static final defpackage.zi4 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            zi4 r0 = new zi4
            r0.<init>()
            defpackage.zi4.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecord"
            r3 = 3
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "payload"
            r2 = 1
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 0
            r0.<init>(r2, r4)
            r1.m(r0)
            java.lang.String r0 = "payloadHash"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r4 = 2
            r5 = 0
            r0.<init>(r4, r5)
            r1.m(r0)
            java.lang.String r0 = "signature"
            r1.l(r0, r2)
            vi4 r0 = new vi4
            r2 = 0
            r0.<init>(r3, r2)
            r1.m(r0)
            defpackage.zi4.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            r2 = 3
            gg3[] r2 = new defpackage.gg3[r2]
            wi4 r0 = defpackage.wi4.a
            r1 = 0
            r2[r1] = r0
            x90 r0 = defpackage.x90.c
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return r2
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r10) {
            r9 = this;
            wb6 r9 = defpackage.zi4.descriptor
            ux0 r10 = r10.c(r9)
            r10.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r5 = r0
            r6 = r1
            r3 = r2
            r4 = r3
        L10:
            if (r5 == 0) goto L49
            int r7 = r10.q(r9)
            r8 = -1
            if (r7 == r8) goto L47
            if (r7 == 0) goto L3c
            if (r7 == r0) goto L31
            r8 = 2
            if (r7 != r8) goto L2b
            x90 r7 = defpackage.x90.c
            java.lang.Object r4 = r10.G(r9, r8, r7, r4)
            byte[] r4 = (byte[]) r4
            r6 = r6 | 4
            goto L10
        L2b:
            lg7 r9 = new lg7
            r9.<init>(r7)
            throw r9
        L31:
            x90 r7 = defpackage.x90.c
            java.lang.Object r3 = r10.G(r9, r0, r7, r3)
            byte[] r3 = (byte[]) r3
            r6 = r6 | 2
            goto L10
        L3c:
            wi4 r7 = defpackage.wi4.a
            java.lang.Object r2 = r10.G(r9, r1, r7, r2)
            yi4 r2 = (defpackage.yi4) r2
            r6 = r6 | 1
            goto L10
        L47:
            r5 = r1
            goto L10
        L49:
            r10.a(r9)
            bj4 r9 = new bj4
            r9.<init>(r6, r2, r3, r4)
            return r9
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r32, java.lang.Object r33) {
            r31 = this;
            r0 = r33
            bj4 r0 = (defpackage.bj4) r0
            r0.getClass()
            byte[] r1 = r0.c
            byte[] r2 = r0.b
            yi4 r0 = r0.a
            wb6 r3 = defpackage.zi4.descriptor
            r4 = r32
            vx0 r4 = r4.c(r3)
            boolean r5 = r4.i(r3)
            r6 = 0
            if (r5 == 0) goto L1d
            goto L45
        L1d:
            yi4 r7 = new yi4
            r29 = 0
            r30 = 131071(0x1ffff, float:1.8367E-40)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r19, r21, r23, r25, r27, r28, r29, r30)
            boolean r5 = defpackage.nb3.k(r0, r7)
            if (r5 != 0) goto L4a
        L45:
            wi4 r5 = defpackage.wi4.a
            r4.w(r3, r6, r5, r0)
        L4a:
            boolean r0 = r4.i(r3)
            if (r0 == 0) goto L51
            goto L59
        L51:
            byte[] r0 = new byte[r6]
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L5f
        L59:
            x90 r0 = defpackage.x90.c
            r5 = 1
            r4.w(r3, r5, r0, r2)
        L5f:
            boolean r0 = r4.i(r3)
            if (r0 == 0) goto L66
            goto L6e
        L66:
            byte[] r0 = new byte[r6]
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L74
        L6e:
            x90 r0 = defpackage.x90.c
            r2 = 2
            r4.w(r3, r2, r0, r1)
        L74:
            r4.a(r3)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.zi4.descriptor
            return r0
    }
}
