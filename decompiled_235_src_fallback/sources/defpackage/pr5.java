package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pr5 implements defpackage.fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ java.util.Map R;
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.qn2 Y;

    public /* synthetic */ pr5(java.util.ArrayList r1, defpackage.qn2 r2, java.util.Map r3, int r4, defpackage.qn2 r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.<init>()
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
            r22 = this;
            r0 = r22
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            r4 = 16
            r5 = 1
            switch(r1) {
                case 0: goto L8c;
                default: goto Ld;
            }
        Ld:
            r1 = r23
            ro3 r1 = (defpackage.ro3) r1
            r6 = r24
            px0 r6 = (defpackage.px0) r6
            r7 = r25
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.getClass()
            r1 = r7 & 17
            if (r1 == r4) goto L25
            r3 = r5
        L25:
            r1 = r7 & 1
            r14 = r6
            xq2 r14 = (defpackage.xq2) r14
            boolean r1 = r14.S(r1, r3)
            if (r1 == 0) goto L88
            gu r8 = new gu
            i r1 = new i
            r1.<init>(r5)
            r3 = 1092616192(0x41200000, float:10.0)
            r8.<init>(r3, r5, r1)
            gu r9 = new gu
            i r1 = new i
            r1.<init>(r5)
            r9.<init>(r3, r5, r1)
            x64 r1 = defpackage.x64.a
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r15 = defpackage.dj6.c(r1, r3)
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = 7
            r16 = 0
            r17 = 0
            r18 = 0
            a74 r7 = defpackage.ge7.S(r15, r16, r17, r18, r19, r20)
            pr5 r15 = new pr5
            r21 = 0
            java.util.ArrayList r1 = r0.B
            qn2 r3 = r0.L
            java.util.Map r4 = r0.R
            int r5 = r0.X
            qn2 r0 = r0.Y
            r20 = r0
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = 441704622(0x1a53e0ae, float:4.3815272E-23)
            zv0 r13 = defpackage.n16.I(r0, r15, r14)
            r15 = 1573302(0x1801b6, float:2.204666E-39)
            r10 = 0
            r11 = 0
            r12 = 0
            defpackage.wv7.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L8b
        L88:
            r14.V()
        L8b:
            return r2
        L8c:
            r1 = r23
            kg2 r1 = (defpackage.kg2) r1
            r6 = r24
            px0 r6 = (defpackage.px0) r6
            r7 = r25
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.getClass()
            r1 = r7 & 17
            if (r1 == r4) goto La5
            r1 = r5
            goto La6
        La5:
            r1 = r3
        La6:
            r4 = r7 & 1
            r12 = r6
            xq2 r12 = (defpackage.xq2) r12
            boolean r1 = r12.S(r4, r1)
            if (r1 == 0) goto L112
            java.util.ArrayList r1 = r0.B
            int r4 = r1.size()
            r7 = r3
        Lb8:
            if (r3 >= r4) goto L115
            java.lang.Object r5 = r1.get(r3)
            int r3 = r3 + 1
            int r6 = r7 + 1
            if (r7 < 0) goto L10d
            lr5 r5 = (defpackage.lr5) r5
            java.lang.String r14 = r5.b
            java.lang.String r15 = r5.c
            qn2 r8 = r0.L
            boolean r9 = r12.f(r8)
            boolean r10 = r12.f(r5)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto Ldf
            vs0 r9 = defpackage.ox0.a
            if (r10 != r9) goto Le9
        Ldf:
            ci2 r10 = new ci2
            r9 = 22
            r10.<init>(r9, r8, r5)
            r12.l0(r10)
        Le9:
            r16 = r10
            on2 r16 = (defpackage.on2) r16
            java.lang.String r5 = r5.a
            java.lang.String r8 = "folder:"
            java.lang.String r8 = defpackage.i61.m(r8, r5)
            r13 = 0
            java.util.Map r9 = r0.R
            int r10 = r0.X
            qn2 r11 = r0.Y
            a74 r10 = defpackage.nw7.o0(r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            r11 = r12
            r7 = r14
            r8 = r15
            r9 = r16
            r12 = r5
            defpackage.ii2.f(r7, r8, r9, r10, r11, r12)
            r7 = r6
            r12 = r11
            goto Lb8
        L10d:
            defpackage.hf.q0()
            r0 = 0
            throw r0
        L112:
            r12.V()
        L115:
            return r2
    }
}
