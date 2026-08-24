package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr7  reason: default package */
/* loaded from: classes.dex */
public final class nr7 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.util.Map L;
    public final /* synthetic */ java.util.List R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ java.lang.String Y;
    public final /* synthetic */ defpackage.qn2 Z;
    public final /* synthetic */ defpackage.qn2 d0;

    public nr7(java.util.List r1, java.lang.String r2, java.util.Map r3, java.util.List r4, boolean r5, java.lang.String r6, defpackage.qn2 r7, defpackage.qn2 r8) {
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
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            lp3 r1 = (defpackage.lp3) r1
            r2 = r19
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r20
            px0 r3 = (defpackage.px0) r3
            r4 = r21
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
            r15 = r3
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.S(r1, r4)
            if (r1 == 0) goto Le8
            java.util.List r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            hm4 r8 = (defpackage.hm4) r8
            r1 = -1192284838(0xffffffffb8ef2d5a, float:-1.14048555E-4)
            r15.b0(r1)
            java.lang.String r1 = r0.B
            java.lang.String r2 = r8.a
            boolean r9 = defpackage.nb3.k(r1, r2)
            java.util.Map r1 = r0.L
            java.lang.String r2 = r8.a
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L7e
            int r1 = r1.intValue()
            r10 = r1
            goto L7f
        L7e:
            r10 = r7
        L7f:
            java.util.List r1 = r0.R
            zq7 r1 = defpackage.vy7.h0(r8, r1)
            boolean r2 = r0.X
            if (r2 == 0) goto L99
            java.lang.String r2 = r0.Y
            if (r2 == 0) goto L99
            if (r1 == 0) goto L99
            java.lang.String r3 = r1.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L99
            r12 = r6
            goto L9a
        L99:
            r12 = r7
        L9a:
            if (r1 == 0) goto L9e
            r11 = r6
            goto L9f
        L9e:
            r11 = r7
        L9f:
            qn2 r2 = r0.Z
            boolean r3 = r15.f(r2)
            boolean r4 = r15.h(r8)
            r3 = r3 | r4
            java.lang.Object r4 = r15.P()
            vs0 r5 = defpackage.ox0.a
            if (r3 != 0) goto Lb4
            if (r4 != r5) goto Lbe
        Lb4:
            i5 r4 = new i5
            r3 = 13
            r4.<init>(r3, r2, r8)
            r15.l0(r4)
        Lbe:
            r13 = r4
            on2 r13 = (defpackage.on2) r13
            boolean r2 = r15.f(r1)
            qn2 r0 = r0.d0
            boolean r3 = r15.f(r0)
            r2 = r2 | r3
            java.lang.Object r3 = r15.P()
            if (r2 != 0) goto Ld4
            if (r3 != r5) goto Ldc
        Ld4:
            lr7 r3 = new lr7
            r3.<init>(r1, r0)
            r15.l0(r3)
        Ldc:
            r14 = r3
            on2 r14 = (defpackage.on2) r14
            r16 = 0
            defpackage.vy7.y(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15.p(r7)
            goto Leb
        Le8:
            r15.V()
        Leb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
