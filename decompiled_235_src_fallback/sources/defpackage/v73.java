package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v73  reason: default package */
/* loaded from: classes.dex */
public final class v73 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ defpackage.b63 L;
    public final /* synthetic */ defpackage.qn2 R;
    public final /* synthetic */ defpackage.qn2 X;

    public /* synthetic */ v73(java.util.List r1, defpackage.b63 r2, defpackage.qn2 r3, defpackage.qn2 r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
            r22 = this;
            r0 = r22
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            b63 r3 = r0.L
            java.util.List r4 = r0.B
            r5 = 146(0x92, float:2.05E-43)
            r8 = 2
            r9 = 4
            r10 = 1
            r11 = 0
            qn2 r12 = r0.R
            vs0 r13 = defpackage.ox0.a
            qn2 r0 = r0.X
            switch(r1) {
                case 0: goto Lc7;
                default: goto L19;
            }
        L19:
            r1 = r23
            lp3 r1 = (defpackage.lp3) r1
            r14 = r24
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r15 = r25
            px0 r15 = (defpackage.px0) r15
            r16 = r26
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            r17 = r16 & 6
            if (r17 != 0) goto L42
            r6 = r15
            xq2 r6 = (defpackage.xq2) r6
            boolean r1 = r6.f(r1)
            if (r1 == 0) goto L3f
            r8 = r9
        L3f:
            r1 = r16 | r8
            goto L44
        L42:
            r1 = r16
        L44:
            r6 = r16 & 48
            if (r6 != 0) goto L57
            r6 = r15
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.d(r14)
            if (r6 == 0) goto L54
            r6 = 32
            goto L56
        L54:
            r6 = 16
        L56:
            r1 = r1 | r6
        L57:
            r6 = r1 & 147(0x93, float:2.06E-43)
            if (r6 == r5) goto L5d
            r5 = r10
            goto L5e
        L5d:
            r5 = r11
        L5e:
            r1 = r1 & r10
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.S(r1, r5)
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r4.get(r14)
            i63 r1 = (defpackage.i63) r1
            r4 = 977837842(0x3a489f12, float:7.653098E-4)
            r15.b0(r4)
            b63 r4 = r1.a
            if (r4 != r3) goto L7a
            r17 = r10
            goto L7c
        L7a:
            r17 = r11
        L7c:
            boolean r3 = r15.f(r12)
            boolean r4 = r15.f(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r15.P()
            if (r3 != 0) goto L8d
            if (r4 != r13) goto L95
        L8d:
            t73 r4 = new t73
            r4.<init>(r12, r1)
            r15.l0(r4)
        L95:
            r18 = r4
            on2 r18 = (defpackage.on2) r18
            boolean r3 = r15.f(r0)
            boolean r4 = r15.f(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r15.P()
            if (r3 != 0) goto Laa
            if (r4 != r13) goto Lb2
        Laa:
            u73 r4 = new u73
            r4.<init>(r0, r1)
            r15.l0(r4)
        Lb2:
            r19 = r4
            on2 r19 = (defpackage.on2) r19
            r21 = 0
            r16 = r1
            r20 = r15
            defpackage.x73.a(r16, r17, r18, r19, r20, r21)
            r15.p(r11)
            goto Lc6
        Lc3:
            r15.V()
        Lc6:
            return r2
        Lc7:
            r1 = r23
            lp3 r1 = (defpackage.lp3) r1
            r6 = r24
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r14 = r25
            px0 r14 = (defpackage.px0) r14
            r15 = r26
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r16 = r15 & 6
            if (r16 != 0) goto Lf0
            r7 = r14
            xq2 r7 = (defpackage.xq2) r7
            boolean r1 = r7.f(r1)
            if (r1 == 0) goto Led
            r8 = r9
        Led:
            r1 = r15 | r8
            goto Lf1
        Lf0:
            r1 = r15
        Lf1:
            r7 = r15 & 48
            if (r7 != 0) goto L105
            r7 = r14
            xq2 r7 = (defpackage.xq2) r7
            boolean r7 = r7.d(r6)
            if (r7 == 0) goto L101
            r16 = 32
            goto L103
        L101:
            r16 = 16
        L103:
            r1 = r1 | r16
        L105:
            r7 = r1 & 147(0x93, float:2.06E-43)
            if (r7 == r5) goto L10b
            r5 = r10
            goto L10c
        L10b:
            r5 = r11
        L10c:
            r1 = r1 & r10
            xq2 r14 = (defpackage.xq2) r14
            boolean r1 = r14.S(r1, r5)
            if (r1 == 0) goto L170
            java.lang.Object r1 = r4.get(r6)
            r15 = r1
            i63 r15 = (defpackage.i63) r15
            r1 = -867420325(0xffffffffcc4c375b, float:-5.353406E7)
            r14.b0(r1)
            b63 r1 = r15.a
            if (r1 != r3) goto L129
            r16 = r10
            goto L12b
        L129:
            r16 = r11
        L12b:
            boolean r1 = r14.f(r12)
            boolean r3 = r14.f(r15)
            r1 = r1 | r3
            java.lang.Object r3 = r14.P()
            if (r1 != 0) goto L13c
            if (r3 != r13) goto L144
        L13c:
            r73 r3 = new r73
            r3.<init>(r12, r15)
            r14.l0(r3)
        L144:
            r17 = r3
            on2 r17 = (defpackage.on2) r17
            boolean r1 = r14.f(r0)
            boolean r3 = r14.f(r15)
            r1 = r1 | r3
            java.lang.Object r3 = r14.P()
            if (r1 != 0) goto L159
            if (r3 != r13) goto L161
        L159:
            s73 r3 = new s73
            r3.<init>(r0, r15)
            r14.l0(r3)
        L161:
            r18 = r3
            on2 r18 = (defpackage.on2) r18
            r20 = 0
            r19 = r14
            defpackage.x73.a(r15, r16, r17, r18, r19, r20)
            r14.p(r11)
            goto L173
        L170:
            r14.V()
        L173:
            return r2
    }
}
