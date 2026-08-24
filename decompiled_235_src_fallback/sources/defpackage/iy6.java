package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iy6 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.zv0 B;
    public final /* synthetic */ defpackage.eo2 L;
    public final /* synthetic */ defpackage.fo2 R;

    public /* synthetic */ iy6(defpackage.zv0 r1, defpackage.eo2 r2, defpackage.fo2 r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r23, java.lang.Object r24) {
            r22 = this;
            r0 = r22
            int r1 = r0.A
            r2 = 0
            zv0 r3 = r0.B
            r4 = 1
            switch(r1) {
                case 0: goto Lb9;
                default: goto Lb;
            }
        Lb:
            r7 = r23
            qt6 r7 = (defpackage.qt6) r7
            r10 = r24
            q21 r10 = (defpackage.q21) r10
            long r5 = r10.a
            int r14 = defpackage.q21.h(r5)
            my6 r1 = defpackage.my6.Tabs
            java.util.List r1 = r7.v(r3, r1)
            int r3 = r1.size()
            int r17 = r14 / r3
            java.util.ArrayList r6 = new java.util.ArrayList
            int r5 = r1.size()
            r6.<init>(r5)
            int r5 = r1.size()
            r8 = r2
        L33:
            if (r8 >= r5) goto L56
            java.lang.Object r9 = r1.get(r8)
            x24 r9 = (defpackage.x24) r9
            long r11 = r10.a
            r20 = 0
            r21 = 12
            r19 = 0
            r18 = r17
            r15 = r11
            long r11 = defpackage.q21.a(r15, r17, r18, r19, r20, r21)
            r13 = r17
            dx4 r9 = r9.y(r11)
            r6.add(r9)
            int r8 = r8 + 1
            goto L33
        L56:
            r13 = r17
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L60
            r1 = 0
            goto L82
        L60:
            java.lang.Object r1 = r6.get(r2)
            r5 = r1
            dx4 r5 = (defpackage.dx4) r5
            int r5 = r5.B
            int r8 = r6.size()
            int r8 = r8 - r4
            if (r4 > r8) goto L82
        L70:
            java.lang.Object r9 = r6.get(r4)
            r11 = r9
            dx4 r11 = (defpackage.dx4) r11
            int r11 = r11.B
            if (r5 >= r11) goto L7d
            r1 = r9
            r5 = r11
        L7d:
            if (r4 == r8) goto L82
            int r4 = r4 + 1
            goto L70
        L82:
            dx4 r1 = (defpackage.dx4) r1
            if (r1 == 0) goto L8a
            int r1 = r1.B
            r11 = r1
            goto L8b
        L8a:
            r11 = r2
        L8b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L90:
            if (r2 >= r3) goto La7
            fy6 r4 = new fy6
            float r5 = r7.Q(r13)
            float r8 = (float) r2
            float r5 = r5 * r8
            float r8 = r7.Q(r13)
            r4.<init>(r5, r8)
            r1.add(r4)
            int r2 = r2 + 1
            goto L90
        La7:
            ky6 r5 = new ky6
            eo2 r8 = r0.L
            fo2 r12 = r0.R
            r9 = r13
            r13 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            zt1 r0 = defpackage.zt1.A
            f34 r0 = r7.K(r14, r11, r0, r5)
            return r0
        Lb9:
            r1 = r23
            px0 r1 = (defpackage.px0) r1
            r5 = r24
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            if (r6 == r7) goto Lcc
            r6 = r4
            goto Lcd
        Lcc:
            r6 = r2
        Lcd:
            r5 = r5 & r4
            xq2 r1 = (defpackage.xq2) r1
            boolean r5 = r1.S(r5, r6)
            if (r5 == 0) goto L109
            x64 r5 = defpackage.x64.a
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.dj6.c(r5, r6)
            boolean r6 = r1.f(r3)
            eo2 r7 = r0.L
            boolean r8 = r1.f(r7)
            r6 = r6 | r8
            fo2 r0 = r0.R
            boolean r8 = r1.f(r0)
            r6 = r6 | r8
            java.lang.Object r8 = r1.P()
            if (r6 != 0) goto Lfa
            vs0 r6 = defpackage.ox0.a
            if (r8 != r6) goto L102
        Lfa:
            iy6 r8 = new iy6
            r8.<init>(r3, r7, r0, r4)
            r1.l0(r8)
        L102:
            eo2 r8 = (defpackage.eo2) r8
            r0 = 6
            defpackage.mt6.a(r5, r8, r1, r0, r2)
            goto L10c
        L109:
            r1.V()
        L10c:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
