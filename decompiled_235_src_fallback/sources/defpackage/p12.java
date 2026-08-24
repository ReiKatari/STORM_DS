package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p12  reason: default package */
/* loaded from: classes.dex */
public final class p12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.sz1 d0;

    public /* synthetic */ p12(int r1, defpackage.r41 r2, defpackage.sz1 r3) {
            r0 = this;
            r0.X = r1
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            p12 r2 = (defpackage.p12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            hb5 r3 = (defpackage.hb5) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            p12 r2 = (defpackage.p12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            sz1 r2 = r2.d0
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            p12 r0 = new p12
            r1 = 1
            r0.<init>(r1, r3, r2)
            r0.Z = r4
            return r0
        L10:
            p12 r0 = new p12
            r1 = 0
            r0.<init>(r1, r3, r2)
            r0.Z = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            sz1 r1 = r8.d0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L5c;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r8.Z
            w61 r0 = (defpackage.w61) r0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1f
            if (r6 != r3) goto L1b
            defpackage.oi2.Y(r9)
            goto L3c
        L1b:
            defpackage.i.m(r2)
            goto L5b
        L1f:
            defpackage.oi2.Y(r9)
        L22:
            boolean r9 = defpackage.g04.H(r0)
            if (r9 == 0) goto L59
            jd1 r9 = defpackage.oq1.B
            uq1 r9 = defpackage.uq1.SECONDS
            long r6 = defpackage.n16.L(r3, r9)
            r8.Z = r0
            r8.Y = r3
            java.lang.Object r9 = defpackage.q60.u(r6, r8)
            if (r9 != r5) goto L3c
            r4 = r5
            goto L5b
        L3c:
            tp6 r9 = r1.H0
            jh r2 = r1.v
            r2.getClass()
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            float r2 = r2.getFPS()
            int r2 = defpackage.u24.E(r2)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            r9.getClass()
            r9.m(r4, r6)
            goto L22
        L59:
            jg7 r4 = defpackage.jg7.a
        L5b:
            return r4
        L5c:
            java.lang.Object r0 = r8.Z
            hb5 r0 = (defpackage.hb5) r0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L70
            if (r6 != r3) goto L6c
            defpackage.oi2.Y(r9)
            goto L8d
        L6c:
            defpackage.i.m(r2)
            goto L9b
        L70:
            defpackage.oi2.Y(r9)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = r1.N
            hb5 r9 = defpackage.sz1.W0(r9)
            boolean r9 = defpackage.nb3.k(r9, r0)
            if (r9 == 0) goto L96
            r8.Z = r4
            r8.Y = r3
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = r1.N
            java.lang.Object r9 = r1.W(r9, r8)
            if (r9 != r5) goto L8d
            r4 = r5
            goto L9b
        L8d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L96
            goto L97
        L96:
            r3 = 0
        L97:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L9b:
            return r4
    }
}
