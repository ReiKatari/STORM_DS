package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir5  reason: default package */
/* loaded from: classes.dex */
public final class ir5 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ defpackage.qw5 B;
    public final /* synthetic */ defpackage.qn2 L;

    public ir5(java.util.List r1, defpackage.qw5 r2, defpackage.qn2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            lp3 r1 = (defpackage.lp3) r1
            r2 = r24
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r25
            px0 r3 = (defpackage.px0) r3
            r4 = r26
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
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L4a
            r4 = r6
            goto L4b
        L4a:
            r4 = r7
        L4b:
            r1 = r1 & r6
            xq2 r3 = (defpackage.xq2) r3
            boolean r1 = r3.S(r1, r4)
            if (r1 == 0) goto Lcd
            java.util.List r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            vr4 r1 = (defpackage.vr4) r1
            r2 = 1944892793(0x73ecb579, float:3.750802E31)
            r3.b0(r2)
            java.lang.Object r2 = r1.A
            qw5 r2 = (defpackage.qw5) r2
            java.lang.Object r1 = r1.B
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            qw5 r4 = defpackage.qw5.FAVORITES
            if (r2 != r4) goto L75
            java.lang.String r4 = "★ "
            goto L77
        L75:
            java.lang.String r4 = ""
        L77:
            java.lang.String r1 = defpackage.yh2.O(r3, r1)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r5)
            r1.getClass()
            java.lang.String r8 = r4.concat(r1)
            qw5 r1 = r0.B
            if (r2 != r1) goto L8e
            r9 = r6
            goto L8f
        L8e:
            r9 = r7
        L8f:
            qn2 r0 = r0.L
            boolean r1 = r3.f(r0)
            int r4 = r2.ordinal()
            boolean r4 = r3.d(r4)
            r1 = r1 | r4
            java.lang.Object r4 = r3.P()
            if (r1 != 0) goto La8
            vs0 r1 = defpackage.ox0.a
            if (r4 != r1) goto Lb2
        La8:
            i5 r4 = new i5
            r1 = 10
            r4.<init>(r1, r0, r2)
            r3.l0(r4)
        Lb2:
            r10 = r4
            on2 r10 = (defpackage.on2) r10
            r20 = 0
            r21 = 504(0x1f8, float:7.06E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r3
            defpackage.ak7.C(r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            r3.p(r7)
            goto Ld0
        Lcd:
            r3.V()
        Ld0:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
