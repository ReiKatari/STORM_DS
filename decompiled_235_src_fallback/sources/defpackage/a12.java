package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a12  reason: default package */
/* loaded from: classes.dex */
public final class a12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.nv4 Z;
    public final /* synthetic */ defpackage.sz1 d0;

    public a12(defpackage.nv4 r2, defpackage.sz1 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public a12(defpackage.sz1 r2, defpackage.nv4 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r2 = 2
            r1.<init>(r2, r4)
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
            a12 r2 = (defpackage.a12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            a12 r2 = (defpackage.a12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            sz1 r0 = r1.d0
            nv4 r1 = r1.Z
            switch(r3) {
                case 0: goto Lf;
                default: goto L9;
            }
        L9:
            a12 r3 = new a12
            r3.<init>(r1, r0, r2)
            return r3
        Lf:
            a12 r3 = new a12
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L65;
                default: goto L7;
            }
        L7:
            sz1 r0 = r8.d0
            nv4 r3 = r8.Z
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.Y
            if (r5 == 0) goto L1d
            if (r5 != r2) goto L17
            defpackage.oi2.Y(r9)
            goto L2a
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            goto L64
        L1d:
            defpackage.oi2.Y(r9)
            r8.Y = r2
            java.lang.Object r9 = r3.d(r8)
            if (r9 != r4) goto L2a
            r1 = r4
            goto L64
        L2a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            xv2 r9 = r0.m
            gd5 r1 = r3.a
            java.lang.String r2 = r1.a
            java.lang.String r1 = r1.c
            r9.b(r2, r1)
            java.lang.String r9 = "ra_pending_session_cleared"
            java.lang.String r1 = "reason"
            java.lang.String r2 = "runtime_job_failed"
            vr4 r3 = new vr4
            r3.<init>(r1, r2)
            java.lang.String r1 = "discarded"
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r8)
            vr4 r8 = new vr4
            r8.<init>(r1, r2)
            java.lang.String r1 = "accepted"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            vr4 r4 = new vr4
            r4.<init>(r1, r2)
            vr4[] r8 = new defpackage.vr4[]{r3, r8, r4}
            r0.G0(r9, r8)
            jg7 r1 = defpackage.jg7.a
        L64:
            return r1
        L65:
            jg7 r0 = defpackage.jg7.a
            sz1 r3 = r8.d0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.Y
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L8c
            if (r5 == r2) goto L88
            if (r5 == r7) goto L84
            if (r5 != r6) goto L7d
            defpackage.oi2.Y(r9)
        L7a:
            r1 = r0
            goto Lf1
        L7d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            goto Lf1
        L84:
            defpackage.oi2.Y(r9)
            goto La5
        L88:
            defpackage.oi2.Y(r9)
            goto L9c
        L8c:
            defpackage.oi2.Y(r9)
            jh r9 = r3.v
            r8.Y = r2
            r9.getClass()
            defpackage.jh.i()
            if (r0 != r4) goto L9c
            goto Lf0
        L9c:
            r8.Y = r7
            java.lang.Object r9 = r3.P0(r8)
            if (r9 != r4) goto La5
            goto Lf0
        La5:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lda
            nv4 r1 = r3.b0
            nv4 r5 = r8.Z
            if (r1 != r5) goto Lda
            de5 r1 = r5.i
            rp6 r1 = r1.A
            java.lang.Object r1 = r1.getValue()
            bv4 r1 = (defpackage.bv4) r1
            lc5 r1 = r1.c
            int r1 = r1.a
            if (r1 != 0) goto Lda
            sx1 r9 = r3.w
            kd6 r1 = r3.c
            ng6 r1 = (defpackage.ng6) r1
            android.content.SharedPreferences r1 = r1.b
            java.lang.String r2 = "ra_hardcore_enabled"
            r5 = 0
            boolean r1 = r1.getBoolean(r2, r5)
            java.util.ArrayList r9 = r9.f(r5, r1)
            defpackage.sz1.l(r3, r9)
            goto Le9
        Lda:
            q33 r1 = r3.g0
            monitor-enter(r1)
            r1.A = r2     // Catch: java.lang.Throwable -> Lf2
            monitor-exit(r1)
            if (r9 != 0) goto Le9
            of6 r9 = r3.J0
            g77 r1 = defpackage.g77.a
            r9.k(r1)
        Le9:
            r8.Y = r6
            r3.U0()
            if (r0 != r4) goto L7a
        Lf0:
            r1 = r4
        Lf1:
            return r1
        Lf2:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf2
            throw r8
    }
}
