package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gr7 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qr7 B;
    public final /* synthetic */ defpackage.on2 L;

    public /* synthetic */ gr7(defpackage.on2 r2, defpackage.qr7 r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ gr7(defpackage.qr7 r1, defpackage.on2 r2, int r3) {
            r0 = this;
            r3 = 1
            r0.A = r3
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r22, java.lang.Object r23) {
            r21 = this;
            r0 = r21
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 1
            on2 r4 = r0.L
            qr7 r0 = r0.B
            switch(r1) {
                case 0: goto L21;
                default: goto Le;
            }
        Le:
            r1 = r22
            px0 r1 = (defpackage.px0) r1
            r5 = r23
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r3 = defpackage.ii2.a0(r3)
            defpackage.vy7.F(r0, r4, r1, r3)
            return r2
        L21:
            r1 = r22
            px0 r1 = (defpackage.px0) r1
            r5 = r23
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 0
            if (r6 == r7) goto L35
            r6 = r3
            goto L36
        L35:
            r6 = r8
        L36:
            r3 = r3 & r5
            xq2 r1 = (defpackage.xq2) r1
            boolean r3 = r1.S(r3, r6)
            if (r3 == 0) goto L78
            zv0 r9 = defpackage.mb3.f
            j10 r3 = new j10
            r5 = 6
            r3.<init>(r4, r5, r8)
            r4 = 1124103538(0x43007572, float:128.45877)
            zv0 r11 = defpackage.n16.I(r4, r3, r1)
            ov4 r3 = new ov4
            r4 = 18
            r3.<init>(r0, r4)
            r0 = -1951012197(0xffffffff8bb5ea9b, float:-7.007166E-32)
            zv0 r12 = defpackage.n16.I(r0, r3, r1)
            nq6 r0 = defpackage.vt0.a
            java.lang.Object r0 = r1.j(r0)
            ut0 r0 = (defpackage.ut0) r0
            long r13 = r0.j()
            r19 = 1576326(0x180d86, float:2.208903E-39)
            r20 = 34
            r10 = 0
            r15 = 0
            r17 = 1082130432(0x40800000, float:4.0)
            r18 = r1
            defpackage.gq.c(r9, r10, r11, r12, r13, r15, r17, r18, r19, r20)
            goto L7d
        L78:
            r18 = r1
            r18.V()
        L7d:
            return r2
    }
}
