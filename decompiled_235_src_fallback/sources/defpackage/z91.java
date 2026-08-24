package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z91  reason: default package */
/* loaded from: classes.dex */
public final class z91 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ defpackage.eo2 R;
    public final /* synthetic */ defpackage.eo2 X;
    public final /* synthetic */ defpackage.qn2 Y;

    public z91(java.util.List r1, defpackage.qn2 r2, defpackage.qn2 r3, defpackage.eo2 r4, defpackage.eo2 r5, defpackage.qn2 r6) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            lp3 r1 = (defpackage.lp3) r1
            r2 = r20
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r21
            px0 r3 = (defpackage.px0) r3
            r4 = r22
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            r6 = 2
            if (r5 != 0) goto L2d
            r5 = r3
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
            r4 = r3
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r2)
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
            r7 = 0
            r8 = 1
            if (r4 == r5) goto L4b
            r4 = r8
            goto L4c
        L4b:
            r4 = r7
        L4c:
            r1 = r1 & r8
            xq2 r3 = (defpackage.xq2) r3
            boolean r1 = r3.S(r1, r4)
            if (r1 == 0) goto L10f
            java.util.List r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            r10 = r1
            me.magnum.melonds.domain.model.DSiWareTitle r10 = (me.magnum.melonds.domain.model.DSiWareTitle) r10
            r1 = 1655772304(0x62b11490, float:1.6332777E21)
            r3.b0(r1)
            x64 r1 = defpackage.x64.a
            r2 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.dj6.c(r1, r2)
            qn2 r1 = r0.B
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r10)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            vs0 r5 = defpackage.ox0.a
            if (r2 != 0) goto L81
            if (r4 != r5) goto L89
        L81:
            x91 r4 = new x91
            r4.<init>(r7, r1, r10)
            r3.l0(r4)
        L89:
            r11 = r4
            on2 r11 = (defpackage.on2) r11
            qn2 r1 = r0.L
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r10)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            if (r2 != 0) goto L9f
            if (r4 != r5) goto La7
        L9f:
            x91 r4 = new x91
            r4.<init>(r8, r1, r10)
            r3.l0(r4)
        La7:
            r12 = r4
            on2 r12 = (defpackage.on2) r12
            eo2 r1 = r0.R
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r10)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            if (r2 != 0) goto Lbd
            if (r4 != r5) goto Lc5
        Lbd:
            y91 r4 = new y91
            r4.<init>(r1, r10, r7)
            r3.l0(r4)
        Lc5:
            r13 = r4
            qn2 r13 = (defpackage.qn2) r13
            eo2 r1 = r0.X
            boolean r2 = r3.f(r1)
            boolean r4 = r3.h(r10)
            r2 = r2 | r4
            java.lang.Object r4 = r3.P()
            if (r2 != 0) goto Ldb
            if (r4 != r5) goto Le3
        Ldb:
            y91 r4 = new y91
            r4.<init>(r1, r10, r8)
            r3.l0(r4)
        Le3:
            r14 = r4
            qn2 r14 = (defpackage.qn2) r14
            qn2 r0 = r0.Y
            boolean r1 = r3.f(r0)
            boolean r2 = r3.h(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto Lf9
            if (r2 != r5) goto L101
        Lf9:
            x91 r2 = new x91
            r2.<init>(r6, r0, r10)
            r3.l0(r2)
        L101:
            r15 = r2
            on2 r15 = (defpackage.on2) r15
            r17 = 6
            r16 = r3
            defpackage.ge7.e(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.p(r7)
            goto L112
        L10f:
            r3.V()
        L112:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
