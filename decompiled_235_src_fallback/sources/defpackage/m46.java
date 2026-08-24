package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m46  reason: default package */
/* loaded from: classes.dex */
public final class m46 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.String L;
    public final /* synthetic */ java.util.List R;
    public final /* synthetic */ defpackage.nh2 X;
    public final /* synthetic */ defpackage.qn2 Y;
    public final /* synthetic */ defpackage.qn2 Z;
    public final /* synthetic */ defpackage.qa4 d0;
    public final /* synthetic */ defpackage.qa4 e0;

    public m46(java.util.List r1, boolean r2, java.lang.String r3, java.util.List r4, defpackage.nh2 r5, defpackage.qn2 r6, defpackage.qn2 r7, defpackage.qa4 r8, defpackage.qa4 r9) {
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
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            ro3 r1 = (defpackage.ro3) r1
            r2 = r20
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r21
            px0 r3 = (defpackage.px0) r3
            r4 = r22
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            if (r5 != 0) goto L2c
            r5 = r3
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L29
            r1 = 4
            goto L2a
        L29:
            r1 = 2
        L2a:
            r1 = r1 | r4
            goto L2d
        L2c:
            r1 = r4
        L2d:
            r4 = r4 & 48
            if (r4 != 0) goto L40
            r4 = r3
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto L3d
            r4 = 32
            goto L3f
        L3d:
            r4 = 16
        L3f:
            r1 = r1 | r4
        L40:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L4a
            r4 = r7
            goto L4b
        L4a:
            r4 = r6
        L4b:
            r1 = r1 & r7
            xq2 r3 = (defpackage.xq2) r3
            boolean r1 = r3.S(r1, r4)
            if (r1 == 0) goto Lf8
            java.util.List r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            c46 r8 = (defpackage.c46) r8
            r1 = 1604867247(0x5fa854af, float:2.4259024E19)
            r3.b0(r1)
            java.util.List r1 = r0.R
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            c46 r1 = (defpackage.c46) r1
            if (r1 == 0) goto L77
            int r2 = r8.a
            int r1 = r1.a
            if (r2 != r1) goto L77
            nh2 r1 = r0.X
        L75:
            r11 = r1
            goto L79
        L77:
            r1 = 0
            goto L75
        L79:
            qn2 r1 = r0.Y
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r8)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            vs0 r5 = defpackage.ox0.a
            if (r2 != 0) goto L8e
            if (r4 != r5) goto L96
        L8e:
            k46 r4 = new k46
            r4.<init>(r1, r8, r6)
            r3.l0(r4)
        L96:
            r12 = r4
            on2 r12 = (defpackage.on2) r12
            qn2 r1 = r0.Z
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r8)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            if (r2 != 0) goto Lac
            if (r4 != r5) goto Lb4
        Lac:
            k46 r4 = new k46
            r4.<init>(r1, r8, r7)
            r3.l0(r4)
        Lb4:
            r13 = r4
            on2 r13 = (defpackage.on2) r13
            boolean r1 = r3.h(r8)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto Lc3
            if (r2 != r5) goto Lcd
        Lc3:
            l46 r2 = new l46
            qa4 r1 = r0.d0
            r2.<init>(r8, r1, r6)
            r3.l0(r2)
        Lcd:
            r14 = r2
            on2 r14 = (defpackage.on2) r14
            boolean r1 = r3.h(r8)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto Ldc
            if (r2 != r5) goto Le6
        Ldc:
            l46 r2 = new l46
            qa4 r1 = r0.e0
            r2.<init>(r8, r1, r7)
            r3.l0(r2)
        Le6:
            r15 = r2
            on2 r15 = (defpackage.on2) r15
            r17 = 0
            boolean r9 = r0.B
            java.lang.String r10 = r0.L
            r16 = r3
            defpackage.nc1.x(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.p(r6)
            goto Lfb
        Lf8:
            r3.V()
        Lfb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
