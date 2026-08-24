package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x81  reason: default package */
/* loaded from: classes.dex */
public final class x81 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.c97 Y;
    public int Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.m16 e0;
    public final /* synthetic */ defpackage.qn2 f0;

    public /* synthetic */ x81(defpackage.m16 r1, defpackage.r41 r2, defpackage.qn2 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.e0 = r1
            r0.f0 = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            d97 r3 = (defpackage.d97) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            x81 r2 = (defpackage.x81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            x81 r2 = (defpackage.x81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            x81 r0 = new x81
            qn2 r1 = r3.f0
            r2 = 1
            m16 r3 = r3.e0
            r0.<init>(r3, r4, r1, r2)
            r0.d0 = r5
            return r0
        L12:
            x81 r0 = new x81
            qn2 r1 = r3.f0
            r2 = 0
            m16 r3 = r3.e0
            r0.<init>(r3, r4, r1, r2)
            r0.d0 = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            m16 r6 = r12.e0
            qn2 r7 = r12.f0
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto Lc0;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r12.Z
            if (r10 == 0) goto L50
            if (r10 == r8) goto L46
            if (r10 == r2) goto L3c
            if (r10 == r3) goto L33
            if (r10 == r4) goto L2c
            if (r10 != r5) goto L26
            defpackage.oi2.Y(r13)
            goto Lbf
        L26:
            defpackage.i.m(r1)
            r13 = r9
            goto Lbf
        L2c:
            java.lang.Object r12 = r12.d0
            defpackage.oi2.Y(r13)
            goto La9
        L33:
            java.lang.Object r1 = r12.d0
            d97 r1 = (defpackage.d97) r1
            defpackage.oi2.Y(r13)
            goto L9a
        L3c:
            c97 r1 = r12.Y
            java.lang.Object r2 = r12.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r13)
            goto L83
        L46:
            c97 r1 = r12.Y
            java.lang.Object r5 = r12.d0
            d97 r5 = (defpackage.d97) r5
            defpackage.oi2.Y(r13)
            goto L69
        L50:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.d0
            d97 r13 = (defpackage.d97) r13
            c97 r1 = defpackage.c97.IMMEDIATE
            r12.d0 = r13
            r12.Y = r1
            r12.Z = r8
            java.lang.Boolean r5 = r13.c(r12)
            if (r5 != r0) goto L66
            goto La4
        L66:
            r11 = r5
            r5 = r13
            r13 = r11
        L69:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L86
            zb3 r13 = r6.g()
            r12.d0 = r5
            r12.Y = r1
            r12.Z = r2
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L82
            goto La4
        L82:
            r2 = r5
        L83:
            r13 = r1
            r1 = r2
            goto L88
        L86:
            r13 = r1
            r1 = r5
        L88:
            w81 r2 = new w81
            r2.<init>(r8, r9, r7)
            r12.d0 = r1
            r12.Y = r9
            r12.Z = r3
            java.lang.Object r13 = r1.a(r13, r2, r12)
            if (r13 != r0) goto L9a
            goto La4
        L9a:
            r12.d0 = r13
            r12.Z = r4
            java.lang.Boolean r12 = r1.c(r12)
            if (r12 != r0) goto La6
        La4:
            r13 = r0
            goto Lbf
        La6:
            r11 = r13
            r13 = r12
            r12 = r11
        La9:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Lbe
            zb3 r13 = r6.g()
            nc7 r0 = r13.b
            ns1 r1 = r13.e
            ns1 r13 = r13.f
            r0.e(r1, r13)
        Lbe:
            r13 = r12
        Lbf:
            return r13
        Lc0:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r12.Z
            if (r10 == 0) goto Lff
            if (r10 == r8) goto Lf5
            if (r10 == r2) goto Leb
            if (r10 == r3) goto Le2
            if (r10 == r4) goto Ldb
            if (r10 != r5) goto Ld5
            defpackage.oi2.Y(r13)
            goto L16f
        Ld5:
            defpackage.i.m(r1)
            r13 = r9
            goto L16f
        Ldb:
            java.lang.Object r12 = r12.d0
            defpackage.oi2.Y(r13)
            goto L159
        Le2:
            java.lang.Object r1 = r12.d0
            d97 r1 = (defpackage.d97) r1
            defpackage.oi2.Y(r13)
            goto L14a
        Leb:
            c97 r1 = r12.Y
            java.lang.Object r2 = r12.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r13)
            goto L132
        Lf5:
            c97 r1 = r12.Y
            java.lang.Object r5 = r12.d0
            d97 r5 = (defpackage.d97) r5
            defpackage.oi2.Y(r13)
            goto L118
        Lff:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.d0
            d97 r13 = (defpackage.d97) r13
            c97 r1 = defpackage.c97.IMMEDIATE
            r12.d0 = r13
            r12.Y = r1
            r12.Z = r8
            java.lang.Boolean r5 = r13.c(r12)
            if (r5 != r0) goto L115
            goto L154
        L115:
            r11 = r5
            r5 = r13
            r13 = r11
        L118:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L135
            zb3 r13 = r6.g()
            r12.d0 = r5
            r12.Y = r1
            r12.Z = r2
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L131
            goto L154
        L131:
            r2 = r5
        L132:
            r13 = r1
            r1 = r2
            goto L137
        L135:
            r13 = r1
            r1 = r5
        L137:
            w81 r2 = new w81
            r5 = 0
            r2.<init>(r5, r9, r7)
            r12.d0 = r1
            r12.Y = r9
            r12.Z = r3
            java.lang.Object r13 = r1.a(r13, r2, r12)
            if (r13 != r0) goto L14a
            goto L154
        L14a:
            r12.d0 = r13
            r12.Z = r4
            java.lang.Boolean r12 = r1.c(r12)
            if (r12 != r0) goto L156
        L154:
            r13 = r0
            goto L16f
        L156:
            r11 = r13
            r13 = r12
            r12 = r11
        L159:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L16e
            zb3 r13 = r6.g()
            nc7 r0 = r13.b
            ns1 r1 = r13.e
            ns1 r13 = r13.f
            r0.e(r1, r13)
        L16e:
            r13 = r12
        L16f:
            return r13
    }
}
