package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v50  reason: default package */
/* loaded from: classes.dex */
public final class v50 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ defpackage.gn d0;
    public final /* synthetic */ defpackage.on2 e0;
    public final /* synthetic */ defpackage.qa4 f0;

    public /* synthetic */ v50(boolean r1, defpackage.gn r2, defpackage.on2 r3, defpackage.qa4 r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            v50 r2 = (defpackage.v50) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            v50 r2 = (defpackage.v50) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r10 = r8.X
            switch(r10) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            v50 r0 = new v50
            qa4 r4 = r8.f0
            r6 = 1
            boolean r1 = r8.Z
            gn r2 = r8.d0
            on2 r3 = r8.e0
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L15:
            r5 = r9
            v50 r1 = new v50
            r6 = r5
            qa4 r5 = r8.f0
            r7 = 0
            boolean r2 = r8.Z
            gn r3 = r8.d0
            on2 r4 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.X
            jg7 r6 = defpackage.jg7.a
            on2 r7 = r13.e0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            qa4 r3 = r13.f0
            boolean r5 = r13.Z
            r8 = 0
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 2
            r11 = 1
            switch(r0) {
                case 0: goto L6a;
                default: goto L15;
            }
        L15:
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r13.Y
            if (r0 == 0) goto L2c
            if (r0 == r11) goto L28
            if (r0 != r10) goto L23
            defpackage.oi2.Y(r14)
            goto L66
        L23:
            defpackage.i.m(r9)
            r6 = r8
            goto L69
        L28:
            defpackage.oi2.Y(r14)
            goto L48
        L2c:
            defpackage.oi2.Y(r14)
            if (r5 == 0) goto L69
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r13.Y = r11
            r8 = 90
            java.lang.Object r0 = defpackage.q60.t(r8, r13)
            if (r0 != r12) goto L48
            goto L64
        L48:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r2 = 420(0x1a4, float:5.89E-43)
            v71 r3 = defpackage.ir1.a
            sc7 r2 = defpackage.ge7.Y(r2, r1, r3, r10)
            r13.Y = r10
            r1 = r0
            gn r0 = r13.d0
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L66
        L64:
            r6 = r12
            goto L69
        L66:
            r7.c()
        L69:
            return r6
        L6a:
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r13.Y
            if (r0 == 0) goto L7b
            if (r0 != r11) goto L76
            defpackage.oi2.Y(r14)
            goto Laa
        L76:
            defpackage.i.m(r9)
            r6 = r8
            goto Lad
        L7b:
            defpackage.oi2.Y(r14)
            if (r5 == 0) goto Lad
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lad
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r2 = 380(0x17c, float:5.32E-43)
            v71 r3 = defpackage.ir1.a
            sc7 r2 = defpackage.ge7.Y(r2, r1, r3, r10)
            r13.Y = r11
            r1 = r0
            gn r0 = r13.d0
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto Laa
            r6 = r12
            goto Lad
        Laa:
            r7.c()
        Lad:
            return r6
    }
}
