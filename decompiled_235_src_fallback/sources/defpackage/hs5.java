package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs5  reason: default package */
/* loaded from: classes.dex */
public final class hs5 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ java.util.Map L;
    public final /* synthetic */ int R;
    public final /* synthetic */ defpackage.qn2 X;
    public final /* synthetic */ defpackage.ss5 Y;
    public final /* synthetic */ defpackage.qn2 Z;
    public final /* synthetic */ java.util.Map d0;
    public final /* synthetic */ java.util.Map e0;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ java.util.Set h0;
    public final /* synthetic */ defpackage.qn2 i0;
    public final /* synthetic */ defpackage.qn2 j0;
    public final /* synthetic */ defpackage.qn2 k0;

    public hs5(java.util.List r1, defpackage.qn2 r2, java.util.Map r3, int r4, defpackage.qn2 r5, defpackage.ss5 r6, defpackage.qn2 r7, java.util.Map r8, java.util.Map r9, boolean r10, boolean r11, java.util.Set r12, defpackage.qn2 r13, defpackage.qn2 r14, defpackage.qn2 r15) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            r0.h0 = r12
            r0.i0 = r13
            r0.j0 = r14
            r0.k0 = r15
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
            r24 = this;
            r0 = r24
            r1 = r25
            lp3 r1 = (defpackage.lp3) r1
            r2 = r26
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            r2 = r27
            px0 r2 = (defpackage.px0) r2
            r4 = r28
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            r6 = 2
            if (r5 != 0) goto L2d
            r5 = r2
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L2a
            r1 = 4
            goto L2b
        L2a:
            r1 = r6
        L2b:
            r1 = r1 | r4
            goto L2e
        L2d:
            r1 = r4
        L2e:
            r4 = r4 & 48
            if (r4 != 0) goto L41
            r4 = r2
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r3)
            if (r4 == 0) goto L3e
            r4 = 32
            goto L40
        L3e:
            r4 = 16
        L40:
            r1 = r1 | r4
        L41:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r10 = 1
            r11 = 0
            if (r4 == r5) goto L4b
            r4 = r10
            goto L4c
        L4b:
            r4 = r11
        L4c:
            r5 = r1 & 1
            r8 = r2
            xq2 r8 = (defpackage.xq2) r8
            boolean r2 = r8.S(r5, r4)
            if (r2 == 0) goto L1f2
            java.util.List r2 = r0.A
            java.lang.Object r2 = r2.get(r3)
            r1 = r1 & 126(0x7e, float:1.77E-43)
            nr5 r2 = (defpackage.nr5) r2
            r4 = -646432882(0xffffffffd978378e, float:-4.3666798E15)
            r8.b0(r4)
            boolean r4 = r2 instanceof defpackage.lr5
            ss5 r12 = r0.Y
            r5 = 3
            vs0 r9 = defpackage.ox0.a
            if (r4 == 0) goto Ld1
            r4 = -1406325702(0xffffffffac2d2c3a, float:-2.460933E-12)
            r8.b0(r4)
            r4 = r2
            lr5 r4 = (defpackage.lr5) r4
            java.lang.String r13 = r4.b
            r14 = r13
            java.lang.String r13 = r4.c
            qn2 r6 = r0.B
            boolean r7 = r8.f(r6)
            boolean r2 = r8.f(r2)
            r2 = r2 | r7
            java.lang.Object r7 = r8.P()
            if (r2 != 0) goto L91
            if (r7 != r9) goto L9b
        L91:
            i5 r7 = new i5
            r2 = 12
            r7.<init>(r2, r6, r4)
            r8.l0(r7)
        L9b:
            r2 = r7
            on2 r2 = (defpackage.on2) r2
            java.lang.String r4 = r4.a
            java.lang.String r6 = "folder:"
            java.lang.String r4 = defpackage.i61.m(r6, r4)
            int r1 = r1 >> r5
            r9 = r1 & 14
            java.util.Map r5 = r0.L
            int r6 = r0.R
            qn2 r7 = r0.X
            a74 r0 = defpackage.nw7.o0(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r1 = r12.a
            int r1 = r1.size()
            int r1 = r1 - r10
            if (r3 != r1) goto Lbd
            goto Lbe
        Lbd:
            r10 = r11
        Lbe:
            a74 r15 = defpackage.nw7.N(r0, r10)
            r17 = 0
            r16 = r8
            r12 = r14
            r14 = r2
            defpackage.hv.f(r12, r13, r14, r15, r16, r17)
            r8.p(r11)
            r0 = r11
            goto L1e5
        Ld1:
            boolean r4 = r2 instanceof defpackage.mr5
            if (r4 == 0) goto L1e9
            r4 = -645678095(0xffffffffd983bbf1, float:-4.634983E15)
            r8.b0(r4)
            r4 = r2
            mr5 r4 = (defpackage.mr5) r4
            pq5 r13 = r4.a
            java.lang.String r14 = r13.i
            android.net.Uri r15 = r13.d
            qn2 r11 = r0.Z
            boolean r16 = r8.f(r11)
            boolean r17 = r8.f(r2)
            r16 = r16 | r17
            java.lang.Object r7 = r8.P()
            r5 = 0
            if (r16 != 0) goto Lf9
            if (r7 != r9) goto L101
        Lf9:
            ds5 r7 = new ds5
            r7.<init>(r11, r4, r5, r10)
            r8.l0(r7)
        L101:
            eo2 r7 = (defpackage.eo2) r7
            defpackage.mb3.i(r8, r7, r15)
            java.util.Map r7 = r0.d0
            java.lang.Object r7 = r7.get(r14)
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r7 = r15.toString()
            java.util.Map r5 = r0.e0
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L126
            int r16 = r7.length()
            if (r16 <= 0) goto L126
            r16 = r7
            goto L128
        L126:
            r16 = 0
        L128:
            java.lang.String r7 = r15.toString()
            java.lang.Object r5 = r5.get(r7)
            if (r5 != 0) goto L134
            r15 = r10
            goto L135
        L134:
            r15 = 0
        L135:
            boolean r5 = r0.g0
            if (r5 == 0) goto L150
            java.util.Set r5 = r0.h0
            boolean r5 = r5.contains(r14)
            if (r5 != 0) goto L14d
            boolean r5 = defpackage.qs6.v0(r14)
            if (r5 != 0) goto L150
            boolean r5 = r13.c()
            if (r5 != 0) goto L150
        L14d:
            r17 = r10
            goto L152
        L150:
            r17 = 0
        L152:
            qn2 r5 = r0.i0
            boolean r7 = r8.f(r5)
            boolean r14 = r8.f(r2)
            r7 = r7 | r14
            java.lang.Object r14 = r8.P()
            if (r7 != 0) goto L165
            if (r14 != r9) goto L16d
        L165:
            es5 r14 = new es5
            r14.<init>(r5, r4, r6)
            r8.l0(r14)
        L16d:
            r18 = r14
            on2 r18 = (defpackage.on2) r18
            qn2 r5 = r0.j0
            boolean r6 = r8.f(r5)
            boolean r7 = r8.f(r2)
            r6 = r6 | r7
            java.lang.Object r7 = r8.P()
            if (r6 != 0) goto L184
            if (r7 != r9) goto L18d
        L184:
            es5 r7 = new es5
            r6 = 3
            r7.<init>(r5, r4, r6)
            r8.l0(r7)
        L18d:
            r19 = r7
            on2 r19 = (defpackage.on2) r19
            qn2 r5 = r0.k0
            boolean r6 = r8.f(r5)
            boolean r2 = r8.f(r2)
            r2 = r2 | r6
            java.lang.Object r6 = r8.P()
            if (r2 != 0) goto L1a4
            if (r6 != r9) goto L1ad
        L1a4:
            es5 r6 = new es5
            r2 = 4
            r6.<init>(r5, r4, r2)
            r8.l0(r6)
        L1ad:
            r20 = r6
            on2 r20 = (defpackage.on2) r20
            java.lang.String r4 = defpackage.nw7.a0(r4)
            r6 = 3
            int r1 = r1 >> r6
            r9 = r1 & 14
            java.util.Map r5 = r0.L
            int r6 = r0.R
            qn2 r7 = r0.X
            a74 r1 = defpackage.nw7.o0(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r2 = r12.a
            int r2 = r2.size()
            int r2 = r2 - r10
            if (r3 != r2) goto L1cd
            goto L1ce
        L1cd:
            r10 = 0
        L1ce:
            a74 r21 = defpackage.nw7.N(r1, r10)
            r23 = 0
            boolean r0 = r0.f0
            r22 = r8
            r12 = r13
            r14 = r16
            r16 = r0
            r13 = r11
            defpackage.hv.g(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = 0
            r8.p(r0)
        L1e5:
            r8.p(r0)
            goto L1f5
        L1e9:
            r0 = r11
            r1 = -1406325995(0xffffffffac2d2b15, float:-2.4608694E-12)
            ug r0 = defpackage.xg6.f(r8, r1, r0)
            throw r0
        L1f2:
            r8.V()
        L1f5:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
