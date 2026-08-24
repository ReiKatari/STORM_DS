package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn  reason: default package */
/* loaded from: classes.dex */
public final class nn extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.zv0 L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public nn(defpackage.ga7 r2, java.lang.Object r3, defpackage.qn2 r4, defpackage.yn r5, defpackage.mm6 r6, defpackage.zv0 r7) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.R = r2
            r1.X = r3
            r1.Y = r4
            r1.Z = r5
            r1.d0 = r6
            r1.L = r7
            r2 = 2
            r1.<init>(r2)
            return
    }

    public nn(defpackage.ta4 r1, defpackage.a74 r2, defpackage.o52 r3, defpackage.z72 r4, java.lang.String r5, defpackage.zv0 r6, int r7) {
            r0 = this;
            r7 = 1
            r0.B = r7
            r0.R = r1
            r0.X = r2
            r0.Y = r3
            r0.Z = r4
            r0.d0 = r5
            r0.L = r6
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r22, java.lang.Object r23) {
            r21 = this;
            r0 = r21
            int r1 = r0.B
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r0.d0
            java.lang.Object r4 = r0.Z
            java.lang.Object r5 = r0.Y
            java.lang.Object r6 = r0.R
            switch(r1) {
                case 0: goto L3a;
                default: goto L11;
            }
        L11:
            r13 = r22
            px0 r13 = (defpackage.px0) r13
            r1 = r23
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            r7 = r6
            ta4 r7 = (defpackage.ta4) r7
            java.lang.Object r1 = r0.X
            r8 = r1
            a74 r8 = (defpackage.a74) r8
            r9 = r5
            o52 r9 = (defpackage.o52) r9
            r10 = r4
            z72 r10 = (defpackage.z72) r10
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r1 = 199681(0x30c01, float:2.79813E-40)
            int r14 = defpackage.ii2.a0(r1)
            zv0 r12 = r0.L
            defpackage.g04.d(r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L3a:
            r1 = r22
            px0 r1 = (defpackage.px0) r1
            r7 = r23
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            qn2 r5 = (defpackage.qn2) r5
            r11 = r4
            yn r11 = (defpackage.yn) r11
            r4 = r6
            ga7 r4 = (defpackage.ga7) r4
            r8 = r7 & 3
            r9 = 2
            r10 = 1
            if (r8 == r9) goto L56
            r8 = r10
            goto L57
        L56:
            r8 = 0
        L57:
            r7 = r7 & r10
            xq2 r1 = (defpackage.xq2) r1
            boolean r7 = r1.S(r7, r8)
            if (r7 == 0) goto L14e
            java.lang.Object r7 = r1.P()
            vs0 r8 = defpackage.ox0.a
            if (r7 != r8) goto L71
            java.lang.Object r7 = r5.g(r11)
            b41 r7 = (defpackage.b41) r7
            r1.l0(r7)
        L71:
            b41 r7 = (defpackage.b41) r7
            aa7 r12 = r4.f()
            vs4 r13 = r4.d
            java.lang.Object r12 = r12.c()
            java.lang.Object r14 = r0.X
            boolean r12 = defpackage.nb3.k(r12, r14)
            boolean r12 = r1.g(r12)
            java.lang.Object r15 = r1.P()
            if (r12 != 0) goto L8f
            if (r15 != r8) goto Lad
        L8f:
            aa7 r4 = r4.f()
            java.lang.Object r4 = r4.c()
            boolean r4 = defpackage.nb3.k(r4, r14)
            if (r4 == 0) goto La1
            z72 r4 = defpackage.z72.b
        L9f:
            r15 = r4
            goto Laa
        La1:
            java.lang.Object r4 = r5.g(r11)
            b41 r4 = (defpackage.b41) r4
            z72 r4 = r4.b
            goto L9f
        Laa:
            r1.l0(r15)
        Lad:
            z72 r15 = (defpackage.z72) r15
            java.lang.Object r4 = r1.P()
            if (r4 != r8) goto Lc5
            tn r4 = new tn
            java.lang.Object r5 = r13.getValue()
            boolean r5 = defpackage.nb3.k(r14, r5)
            r4.<init>(r5)
            r1.l0(r4)
        Lc5:
            tn r4 = (defpackage.tn) r4
            o52 r5 = r7.a
            boolean r12 = r1.h(r7)
            java.lang.Object r9 = r1.P()
            if (r12 != 0) goto Ld5
            if (r9 != r8) goto Ldd
        Ld5:
            ug6 r9 = new ug6
            r9.<init>(r7, r10)
            r1.l0(r9)
        Ldd:
            fo2 r9 = (defpackage.fo2) r9
            x64 r7 = defpackage.x64.a
            a74 r7 = defpackage.ge7.L(r7, r9)
            java.lang.Object r9 = r13.getValue()
            boolean r9 = defpackage.nb3.k(r14, r9)
            vs4 r10 = r4.a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.setValue(r9)
            a74 r4 = r7.d(r4)
            ga7 r6 = (defpackage.ga7) r6
            boolean r7 = r1.h(r14)
            java.lang.Object r9 = r1.P()
            if (r7 != 0) goto L108
            if (r9 != r8) goto L111
        L108:
            mc r9 = new mc
            r7 = 5
            r9.<init>(r14, r7)
            r1.l0(r9)
        L111:
            r7 = r9
            qn2 r7 = (defpackage.qn2) r7
            boolean r9 = r1.f(r15)
            java.lang.Object r10 = r1.P()
            if (r9 != 0) goto L120
            if (r10 != r8) goto L129
        L120:
            o0 r10 = new o0
            r8 = 2
            r10.<init>(r15, r8)
            r1.l0(r10)
        L129:
            r17 = r10
            eo2 r17 = (defpackage.eo2) r17
            mn r8 = new mn
            r9 = r3
            mm6 r9 = (defpackage.mm6) r9
            zv0 r12 = r0.L
            r13 = 0
            r10 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = -143346359(0xfffffffff774b549, float:-4.9632708E33)
            zv0 r18 = defpackage.n16.I(r0, r8, r1)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r1
            r14 = r4
            r12 = r6
            r13 = r7
            r16 = r15
            r15 = r5
            defpackage.g04.b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L153
        L14e:
            r19 = r1
            r19.V()
        L153:
            return r2
    }
}
