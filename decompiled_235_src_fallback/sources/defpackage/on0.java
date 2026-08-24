package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class on0 implements defpackage.fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.xn0 B;
    public final /* synthetic */ defpackage.on2 L;

    public /* synthetic */ on0(defpackage.xn0 r1, defpackage.on2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r16 = this;
            r0 = r16
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            x64 r3 = defpackage.x64.a
            r4 = 18
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            switch(r1) {
                case 0: goto L85;
                default: goto L11;
            }
        L11:
            r1 = r17
            lq4 r1 = (defpackage.lq4) r1
            r9 = r18
            px0 r9 = (defpackage.px0) r9
            r10 = r19
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r1.getClass()
            r11 = r10 & 6
            if (r11 != 0) goto L33
            r11 = r9
            xq2 r11 = (defpackage.xq2) r11
            boolean r11 = r11.f(r1)
            if (r11 == 0) goto L32
            r5 = r6
        L32:
            r10 = r10 | r5
        L33:
            r5 = r10 & 19
            if (r5 == r4) goto L38
            r8 = r7
        L38:
            r4 = r10 & 1
            r14 = r9
            xq2 r14 = (defpackage.xq2) r14
            boolean r4 = r14.S(r4, r8)
            if (r4 == 0) goto L81
            a74 r3 = defpackage.q60.s(r3, r1)
            s76 r4 = defpackage.nb3.U(r14)
            a74 r10 = defpackage.nb3.W(r3, r4, r7)
            nq6 r3 = defpackage.ky0.n
            java.lang.Object r4 = r14.j(r3)
            kk3 r4 = (defpackage.kk3) r4
            float r4 = defpackage.ge7.r(r1, r4)
            r5 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 + r5
            float r6 = r1.d()
            float r6 = r6 + r5
            java.lang.Object r3 = r14.j(r3)
            kk3 r3 = (defpackage.kk3) r3
            float r3 = defpackage.ge7.q(r1, r3)
            float r3 = r3 + r5
            float r1 = r1.a()
            float r1 = r1 + r5
            pq4 r12 = new pq4
            r12.<init>(r4, r6, r3, r1)
            r15 = 0
            xn0 r11 = r0.B
            on2 r13 = r0.L
            defpackage.lb4.b(r10, r11, r12, r13, r14, r15)
            goto L84
        L81:
            r14.V()
        L84:
            return r2
        L85:
            r1 = r17
            lq4 r1 = (defpackage.lq4) r1
            r9 = r18
            px0 r9 = (defpackage.px0) r9
            r10 = r19
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r1.getClass()
            r11 = r10 & 6
            if (r11 != 0) goto La7
            r11 = r9
            xq2 r11 = (defpackage.xq2) r11
            boolean r11 = r11.f(r1)
            if (r11 == 0) goto La6
            r5 = r6
        La6:
            r10 = r10 | r5
        La7:
            r5 = r10 & 19
            if (r5 == r4) goto Lac
            goto Lad
        Lac:
            r7 = r8
        Lad:
            r4 = r10 & 1
            xq2 r9 = (defpackage.xq2) r9
            boolean r4 = r9.S(r4, r7)
            if (r4 == 0) goto Lcd
            r4 = 1065353216(0x3f800000, float:1.0)
            a74 r3 = defpackage.dj6.c(r3, r4)
            int r4 = r10 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r8 = r4 | 6
            xn0 r4 = r0.B
            on2 r6 = r0.L
            r5 = r1
            r7 = r9
            defpackage.lb4.b(r3, r4, r5, r6, r7, r8)
            goto Ld1
        Lcd:
            r7 = r9
            r7.V()
        Ld1:
            return r2
    }
}
