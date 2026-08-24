package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dm implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.hm B;
    public final /* synthetic */ defpackage.m07 L;

    public /* synthetic */ dm(defpackage.hm r1, defpackage.m07 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r7 = this;
            int r0 = r7.A
            java.lang.String r1 = "result"
            r2 = 6
            r3 = 0
            m07 r4 = r7.L
            hm r7 = r7.B
            switch(r0) {
                case 0: goto L57;
                case 1: goto L33;
                default: goto Ld;
            }
        Ld:
            on2 r7 = r7.c
            java.lang.Object r7 = r7.c()
            r0 = r7
            jk3 r0 = (defpackage.jk3) r0
            boolean r0 = r0.t()
            if (r0 == 0) goto L1d
            r3 = r7
        L1d:
            jk3 r3 = (defpackage.jk3) r3
            if (r3 != 0) goto L24
            of5 r7 = defpackage.of5.e
            goto L32
        L24:
            of5 r7 = r4.l(r3)
            r0 = 0
            long r0 = r3.P(r0)
            of5 r7 = r7.i(r0)
        L32:
            return r7
        L33:
            cm r0 = r7.g
            dm r5 = new dm
            r6 = 2
            r5.<init>(r7, r4, r6)
            dh5 r4 = new dh5
            r4.<init>()
            qm6 r7 = r7.e
            q6 r6 = new q6
            r6.<init>(r2, r4, r5)
            java.lang.String r2 = "positioner"
            r7.d(r2, r0, r6)
            java.lang.Object r7 = r4.A
            if (r7 == 0) goto L53
            of5 r7 = (defpackage.of5) r7
            return r7
        L53:
            defpackage.nb3.a0(r1)
            throw r3
        L57:
            cm r0 = r7.f
            a5 r5 = new a5
            r6 = 3
            r5.<init>(r4, r6)
            dh5 r4 = new dh5
            r4.<init>()
            qm6 r7 = r7.e
            q6 r6 = new q6
            r6.<init>(r2, r4, r5)
            java.lang.String r2 = "dataBuilder"
            r7.d(r2, r0, r6)
            java.lang.Object r7 = r4.A
            if (r7 == 0) goto L77
            l07 r7 = (defpackage.l07) r7
            return r7
        L77:
            defpackage.nb3.a0(r1)
            throw r3
    }
}
