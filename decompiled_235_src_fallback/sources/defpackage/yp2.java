package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp2 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.hq2 B;
    public final /* synthetic */ defpackage.o60 L;

    public /* synthetic */ yp2(defpackage.hq2 r1, defpackage.o60 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            o60 r3 = r0.L
            hq2 r0 = r0.B
            r4 = 2
            r5 = 1
            r6 = 0
            switch(r1) {
                case 0: goto L42;
                default: goto L10;
            }
        L10:
            r1 = r17
            px0 r1 = (defpackage.px0) r1
            r7 = r18
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            if (r8 == r4) goto L22
            r4 = r5
            goto L23
        L22:
            r4 = r6
        L23:
            r7 = r7 & r5
            xq2 r1 = (defpackage.xq2) r1
            boolean r4 = r1.S(r7, r4)
            if (r4 == 0) goto L3e
            yp2 r4 = new yp2
            r4.<init>(r0, r3, r6)
            r0 = 1465585272(0x575b0e78, float:2.4085519E14)
            zv0 r0 = defpackage.n16.I(r0, r4, r1)
            r3 = 48
            defpackage.bl2.e(r6, r0, r1, r3, r5)
            goto L41
        L3e:
            r1.V()
        L41:
            return r2
        L42:
            r1 = r17
            px0 r1 = (defpackage.px0) r1
            r7 = r18
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            if (r8 == r4) goto L53
            r6 = r5
        L53:
            r7 = r7 & r5
            r14 = r1
            xq2 r14 = (defpackage.xq2) r14
            boolean r1 = r14.S(r7, r6)
            if (r1 == 0) goto Le2
            android.content.SharedPreferences r8 = r0.f
            boolean r1 = r14.h(r3)
            java.lang.Object r6 = r14.P()
            vs0 r7 = defpackage.ox0.a
            if (r1 != 0) goto L6d
            if (r6 != r7) goto L77
        L6d:
            a5 r6 = new a5
            r1 = 29
            r6.<init>(r3, r1)
            r14.l0(r6)
        L77:
            r9 = r6
            on2 r9 = (defpackage.on2) r9
            boolean r1 = r14.h(r0)
            java.lang.Object r6 = r14.P()
            if (r1 != 0) goto L86
            if (r6 != r7) goto L8e
        L86:
            xp2 r6 = new xp2
            r6.<init>(r0, r4)
            r14.l0(r6)
        L8e:
            r10 = r6
            on2 r10 = (defpackage.on2) r10
            boolean r1 = r14.h(r0)
            java.lang.Object r4 = r14.P()
            if (r1 != 0) goto L9d
            if (r4 != r7) goto La6
        L9d:
            xp2 r4 = new xp2
            r1 = 3
            r4.<init>(r0, r1)
            r14.l0(r4)
        La6:
            r11 = r4
            on2 r11 = (defpackage.on2) r11
            boolean r1 = r14.h(r3)
            boolean r4 = r14.h(r0)
            r1 = r1 | r4
            java.lang.Object r4 = r14.P()
            if (r1 != 0) goto Lba
            if (r4 != r7) goto Lc2
        Lba:
            ci2 r4 = new ci2
            r4.<init>(r5, r3, r0)
            r14.l0(r4)
        Lc2:
            r12 = r4
            on2 r12 = (defpackage.on2) r12
            boolean r1 = r14.h(r0)
            java.lang.Object r3 = r14.P()
            if (r1 != 0) goto Ld1
            if (r3 != r7) goto Lda
        Ld1:
            xp2 r3 = new xp2
            r1 = 4
            r3.<init>(r0, r1)
            r14.l0(r3)
        Lda:
            r13 = r3
            on2 r13 = (defpackage.on2) r13
            r15 = 0
            defpackage.hi2.p(r8, r9, r10, r11, r12, r13, r14, r15)
            goto Le5
        Le2:
            r14.V()
        Le5:
            return r2
    }
}
