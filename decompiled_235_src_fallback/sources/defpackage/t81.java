package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t81  reason: default package */
/* loaded from: classes.dex */
public final class t81 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ java.lang.Object f0;

    public t81(defpackage.m16 r2, boolean r3, boolean r4, defpackage.qn2 r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r1.e0 = r4
            r1.f0 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    public t81(defpackage.r41 r2, defpackage.m16 r3, boolean r4, boolean r5, defpackage.qn2 r6) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r3
            r1.d0 = r4
            r1.e0 = r5
            r1.f0 = r6
            r3 = 2
            r1.<init>(r3, r2)
            return
    }

    public t81(defpackage.r41 r2, defpackage.wz3 r3, defpackage.tu0 r4, boolean r5, boolean r6) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.Z = r3
            r1.f0 = r4
            r1.d0 = r5
            r1.e0 = r6
            r1.<init>(r0, r2)
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            t81 r2 = (defpackage.t81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            t81 r2 = (defpackage.t81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            t81 r2 = (defpackage.t81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            int r11 = r9.X
            java.lang.Object r0 = r9.f0
            java.lang.Object r1 = r9.Z
            switch(r11) {
                case 0: goto L2d;
                case 1: goto L1a;
                default: goto L9;
            }
        L9:
            t81 r2 = new t81
            r4 = r1
            wz3 r4 = (defpackage.wz3) r4
            r5 = r0
            tu0 r5 = (defpackage.tu0) r5
            boolean r6 = r9.d0
            boolean r7 = r9.e0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L1a:
            r3 = r10
            t81 r10 = new t81
            r5 = r1
            m16 r5 = (defpackage.m16) r5
            boolean r7 = r9.e0
            r8 = r0
            qn2 r8 = (defpackage.qn2) r8
            boolean r6 = r9.d0
            r4 = r3
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L2d:
            r3 = r10
            t81 r10 = new t81
            r4 = r1
            m16 r4 = (defpackage.m16) r4
            boolean r6 = r9.e0
            r7 = r0
            qn2 r7 = (defpackage.qn2) r7
            boolean r5 = r9.d0
            r8 = r3
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto Le0;
                case 1: goto Lab;
                default: goto L8;
            }
        L8:
            boolean r0 = r12.d0
            java.lang.Object r4 = r12.f0
            tu0 r4 = (defpackage.tu0) r4
            java.lang.Object r5 = r12.Z
            wz3 r5 = (defpackage.wz3) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r12.Y
            if (r7 == 0) goto L25
            if (r7 != r2) goto L1e
            defpackage.oi2.Y(r13)
            goto L37
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto Laa
        L25:
            defpackage.oi2.Y(r13)
            jg1 r13 = r5.i
            if (r13 == 0) goto L3e
            r12.Y = r2
            java.lang.Object r13 = r13.X(r12)
            if (r13 != r6) goto L37
            r3 = r6
            goto Laa
        L37:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            goto L3f
        L3e:
            r13 = r1
        L3f:
            r2 = -1
            if (r13 == 0) goto L52
            s94 r12 = r5.f
            r5.c(r12, r2)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Low Light Boost is disabled when expected frame rate range exceeds 30."
            r12.<init>(r13)
            r4.v0(r12)
            goto La8
        L52:
            r5.e = r0
            if (r0 != 0) goto L5b
            s94 r13 = r5.f
            r5.c(r13, r2)
        L5b:
            li7 r13 = r5.c
            if (r13 == 0) goto La3
            if (r0 == 0) goto L66
            s94 r13 = r5.f
            r5.c(r13, r1)
        L66:
            boolean r12 = r12.e0
            tu0 r13 = r5.h
            if (r12 == 0) goto L76
            if (r13 == 0) goto L73
            java.lang.String r12 = "There is a new enableLowLightBoost being set"
            defpackage.i61.A(r12, r13)
        L73:
            r5.h = r3
            goto L7b
        L76:
            if (r13 == 0) goto L7b
            defpackage.nc1.a0(r4, r13)
        L7b:
            r5.h = r4
            op6 r12 = r5.a
            if (r0 == 0) goto L87
            java.lang.Integer r3 = new java.lang.Integer
            r13 = 6
            r3.<init>(r13)
        L87:
            java.lang.Object r13 = r12.d
            monitor-enter(r13)
            r12.k = r3     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r13)
            tu0 r12 = r12.f()
            defpackage.nc1.a0(r12, r4)
            r5 r12 = new r5
            r13 = 16
            r12.<init>(r13, r4, r5)
            r4.a0(r12)
            goto La8
        L9f:
            r0 = move-exception
            r12 = r0
            monitor-exit(r13)
            throw r12
        La3:
            java.lang.String r12 = "Camera is not active."
            defpackage.i61.A(r12, r4)
        La8:
            jg7 r3 = defpackage.jg7.a
        Laa:
            return r3
        Lab:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.Y
            if (r1 == 0) goto Lbe
            if (r1 != r2) goto Lb7
            defpackage.oi2.Y(r13)
            goto Ldf
        Lb7:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r13 = r3
            goto Ldf
        Lbe:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.Z
            r6 = r13
            m16 r6 = (defpackage.m16) r6
            boolean r5 = r12.d0
            boolean r4 = r12.e0
            s81 r3 = new s81
            java.lang.Object r13 = r12.f0
            r8 = r13
            qn2 r8 = (defpackage.qn2) r8
            r9 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.Y = r2
            java.lang.Object r13 = r6.q(r5, r3, r12)
            if (r13 != r0) goto Ldf
            r13 = r0
        Ldf:
            return r13
        Le0:
            java.lang.Object r0 = r12.Z
            m16 r0 = (defpackage.m16) r0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r12.Y
            if (r5 == 0) goto Lf7
            if (r5 != r2) goto Lf0
            defpackage.oi2.Y(r13)
            goto L129
        Lf0:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r13 = r3
            goto L129
        Lf7:
            defpackage.oi2.Y(r13)
            boolean r13 = r0.k()
            if (r13 == 0) goto L106
            boolean r13 = r0.l()
            if (r13 != 0) goto L10c
        L106:
            boolean r13 = r12.d0
            if (r13 == 0) goto L10c
            r6 = r2
            goto L10d
        L10c:
            r6 = r1
        L10d:
            java.lang.Object r13 = r12.Z
            r8 = r13
            m16 r8 = (defpackage.m16) r8
            boolean r7 = r12.e0
            java.lang.Object r13 = r12.f0
            r10 = r13
            qn2 r10 = (defpackage.qn2) r10
            s81 r5 = new s81
            r9 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.Y = r2
            java.lang.Object r13 = r8.q(r7, r5, r12)
            if (r13 != r4) goto L129
            r13 = r4
        L129:
            return r13
    }
}
