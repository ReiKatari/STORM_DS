package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c10  reason: default package */
/* loaded from: classes.dex */
public final class c10 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ java.util.UUID L;
    public final /* synthetic */ defpackage.qn2 R;
    public final /* synthetic */ defpackage.qn2 X;
    public final /* synthetic */ defpackage.qn2 Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public c10(java.util.List r2, java.util.UUID r3, defpackage.qn2 r4, defpackage.qn2 r5, defpackage.qn2 r6, defpackage.na4 r7, defpackage.qn2 r8) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            r1.Y = r6
            r1.Z = r7
            r1.d0 = r8
            return
    }

    public c10(java.util.List r2, java.util.UUID r3, defpackage.qn2 r4, defpackage.sg6 r5, defpackage.sn r6, defpackage.qn2 r7, defpackage.qn2 r8) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.Z = r5
            r1.d0 = r6
            r1.X = r7
            r1.Y = r8
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
            r26 = this;
            r0 = r26
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.util.UUID r3 = r0.L
            java.util.List r4 = r0.B
            r5 = 146(0x92, float:2.05E-43)
            vs0 r9 = defpackage.ox0.a
            qn2 r10 = r0.R
            qn2 r11 = r0.X
            qn2 r12 = r0.Y
            java.lang.Object r13 = r0.Z
            java.lang.Object r0 = r0.d0
            r14 = 1
            r15 = 2
            r6 = 0
            switch(r1) {
                case 0: goto L116;
                default: goto L1e;
            }
        L1e:
            r1 = r27
            lp3 r1 = (defpackage.lp3) r1
            r17 = r28
            java.lang.Number r17 = (java.lang.Number) r17
            int r7 = r17.intValue()
            r17 = r29
            px0 r17 = (defpackage.px0) r17
            r19 = r30
            java.lang.Number r19 = (java.lang.Number) r19
            int r19 = r19.intValue()
            qn2 r0 = (defpackage.qn2) r0
            na4 r13 = (defpackage.na4) r13
            r20 = r19 & 6
            if (r20 != 0) goto L4e
            r8 = r17
            xq2 r8 = (defpackage.xq2) r8
            boolean r1 = r8.f(r1)
            if (r1 == 0) goto L4a
            r8 = 4
            goto L4b
        L4a:
            r8 = r15
        L4b:
            r1 = r19 | r8
            goto L50
        L4e:
            r1 = r19
        L50:
            r8 = r19 & 48
            if (r8 != 0) goto L65
            r8 = r17
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.d(r7)
            if (r8 == 0) goto L61
            r16 = 32
            goto L63
        L61:
            r16 = 16
        L63:
            r1 = r1 | r16
        L65:
            r8 = r1 & 147(0x93, float:2.06E-43)
            if (r8 == r5) goto L6b
            r5 = r14
            goto L6c
        L6b:
            r5 = r6
        L6c:
            r1 = r1 & r14
            r8 = r17
            xq2 r8 = (defpackage.xq2) r8
            boolean r1 = r8.S(r1, r5)
            if (r1 == 0) goto L111
            java.lang.Object r1 = r4.get(r7)
            fk3 r1 = (defpackage.fk3) r1
            r4 = -1339358008(0xffffffffb02b04c8, float:-6.221623E-10)
            r8.b0(r4)
            java.util.UUID r4 = r1.a
            boolean r19 = defpackage.nb3.k(r4, r3)
            boolean r3 = r8.f(r10)
            boolean r4 = r8.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto L9a
            if (r4 != r9) goto La2
        L9a:
            bo3 r4 = new bo3
            r4.<init>(r10, r1, r6)
            r8.l0(r4)
        La2:
            r20 = r4
            on2 r20 = (defpackage.on2) r20
            boolean r3 = r8.h(r1)
            boolean r4 = r8.f(r11)
            r3 = r3 | r4
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto Lb7
            if (r4 != r9) goto Lbf
        Lb7:
            bo3 r4 = new bo3
            r4.<init>(r1, r11)
            r8.l0(r4)
        Lbf:
            r21 = r4
            on2 r21 = (defpackage.on2) r21
            boolean r3 = r8.f(r12)
            boolean r4 = r8.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto Ld4
            if (r4 != r9) goto Ldc
        Ld4:
            bo3 r4 = new bo3
            r4.<init>(r12, r1, r15)
            r8.l0(r4)
        Ldc:
            r22 = r4
            on2 r22 = (defpackage.on2) r22
            boolean r3 = r8.h(r13)
            boolean r4 = r8.h(r1)
            r3 = r3 | r4
            boolean r4 = r8.f(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto Lf6
            if (r4 != r9) goto Lfe
        Lf6:
            co3 r4 = new co3
            r4.<init>(r13, r1, r0)
            r8.l0(r4)
        Lfe:
            r23 = r4
            on2 r23 = (defpackage.on2) r23
            r25 = 0
            r18 = r1
            r24 = r8
            defpackage.np2.b(r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r24
            r0.p(r6)
            goto L115
        L111:
            r0 = r8
            r0.V()
        L115:
            return r2
        L116:
            r1 = r27
            ro3 r1 = (defpackage.ro3) r1
            r7 = r28
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = r29
            px0 r8 = (defpackage.px0) r8
            r17 = r30
            java.lang.Number r17 = (java.lang.Number) r17
            int r17 = r17.intValue()
            r19 = r17 & 6
            if (r19 != 0) goto L143
            r15 = r8
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.f(r1)
            if (r1 == 0) goto L13e
            r20 = 4
            goto L140
        L13e:
            r20 = 2
        L140:
            r1 = r17 | r20
            goto L145
        L143:
            r1 = r17
        L145:
            r15 = r17 & 48
            if (r15 != 0) goto L159
            r15 = r8
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.d(r7)
            if (r15 == 0) goto L155
            r16 = 32
            goto L157
        L155:
            r16 = 16
        L157:
            r1 = r1 | r16
        L159:
            r15 = r1 & 147(0x93, float:2.06E-43)
            if (r15 == r5) goto L15f
            r5 = r14
            goto L160
        L15f:
            r5 = r6
        L160:
            r1 = r1 & r14
            xq2 r8 = (defpackage.xq2) r8
            boolean r1 = r8.S(r1, r5)
            if (r1 == 0) goto L21a
            java.lang.Object r1 = r4.get(r7)
            r15 = r1
            n00 r15 = (defpackage.n00) r15
            r1 = 673656973(0x2827308d, float:9.28089E-15)
            r8.b0(r1)
            if (r15 != 0) goto L1a0
            r0 = 673656817(0x28272ff1, float:9.280758E-15)
            r8.b0(r0)
            if (r3 != 0) goto L181
            goto L182
        L181:
            r14 = r6
        L182:
            boolean r0 = r8.f(r10)
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L18e
            if (r1 != r9) goto L196
        L18e:
            a10 r1 = new a10
            r1.<init>(r10, r6)
            r8.l0(r1)
        L196:
            on2 r1 = (defpackage.on2) r1
            defpackage.ak7.A(r14, r1, r8, r6)
            r8.p(r6)
            goto L216
        L1a0:
            r1 = 673861665(0x282a5021, float:9.454271E-15)
            r8.b0(r1)
            java.util.UUID r1 = r15.a
            boolean r16 = defpackage.nb3.k(r3, r1)
            r17 = r13
            sg6 r17 = (defpackage.sg6) r17
            r18 = r0
            sn r18 = (defpackage.sn) r18
            boolean r0 = r8.f(r10)
            boolean r1 = r8.h(r15)
            r0 = r0 | r1
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L1c5
            if (r1 != r9) goto L1cd
        L1c5:
            b10 r1 = new b10
            r1.<init>(r10, r15, r6)
            r8.l0(r1)
        L1cd:
            r19 = r1
            on2 r19 = (defpackage.on2) r19
            boolean r0 = r8.f(r11)
            boolean r1 = r8.h(r15)
            r0 = r0 | r1
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L1e2
            if (r1 != r9) goto L1ea
        L1e2:
            b10 r1 = new b10
            r1.<init>(r11, r15, r14)
            r8.l0(r1)
        L1ea:
            r20 = r1
            on2 r20 = (defpackage.on2) r20
            boolean r0 = r8.f(r12)
            boolean r1 = r8.h(r15)
            r0 = r0 | r1
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L1ff
            if (r1 != r9) goto L208
        L1ff:
            b10 r1 = new b10
            r0 = 2
            r1.<init>(r12, r15, r0)
            r8.l0(r1)
        L208:
            r21 = r1
            on2 r21 = (defpackage.on2) r21
            r23 = 0
            r22 = r8
            defpackage.ak7.g(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r8.p(r6)
        L216:
            r8.p(r6)
            goto L21d
        L21a:
            r8.V()
        L21d:
            return r2
    }
}
