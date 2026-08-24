package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o31  reason: default package */
/* loaded from: classes.dex */
public final class o31 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ java.lang.Object g0;

    public o31(defpackage.p31 r2, defpackage.nh7 r3, defpackage.z70 r4, long r5, defpackage.r41 r7) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.g0 = r4
            r1.Z = r5
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public o31(defpackage.sz1 r2, defpackage.qz1 r3, long r4, defpackage.gk4 r6, defpackage.ik4 r7, defpackage.r41 r8) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.Z = r4
            r1.f0 = r6
            r1.g0 = r7
            r2 = 2
            r1.<init>(r2, r8)
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
            o31 r2 = (defpackage.o31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            o31 r2 = (defpackage.o31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.X
            java.lang.Object r1 = r12.g0
            java.lang.Object r2 = r12.f0
            java.lang.Object r3 = r12.e0
            switch(r0) {
                case 0: goto L22;
                default: goto Lb;
            }
        Lb:
            o31 r4 = new o31
            java.lang.Object r14 = r12.d0
            r5 = r14
            sz1 r5 = (defpackage.sz1) r5
            r6 = r3
            qz1 r6 = (defpackage.qz1) r6
            r9 = r2
            gk4 r9 = (defpackage.gk4) r9
            r10 = r1
            ik4 r10 = (defpackage.ik4) r10
            long r7 = r12.Z
            r11 = r13
            r4.<init>(r5, r6, r7, r9, r10, r11)
            return r4
        L22:
            r11 = r13
            o31 r5 = new o31
            r6 = r3
            p31 r6 = (defpackage.p31) r6
            r7 = r2
            nh7 r7 = (defpackage.nh7) r7
            r8 = r1
            z70 r8 = (defpackage.z70) r8
            long r9 = r12.Z
            r5.<init>(r6, r7, r8, r9, r11)
            r5.d0 = r14
            return r5
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r21) {
            r20 = this;
            r11 = r20
            int r0 = r11.X
            java.lang.Object r1 = r11.g0
            r2 = 0
            java.lang.Object r3 = r11.f0
            java.lang.Object r4 = r11.e0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L5d;
                default: goto L11;
            }
        L11:
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r11.Y
            if (r0 == 0) goto L28
            if (r0 != r6) goto L23
            defpackage.oi2.Y(r21)
            r0 = r21
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L57
        L23:
            defpackage.i.m(r5)
            r7 = 0
            goto L5c
        L28:
            defpackage.oi2.Y(r21)
            java.lang.Object r0 = r11.d0
            sz1 r0 = (defpackage.sz1) r0
            oj4 r0 = r0.i
            qz1 r4 = (defpackage.qz1) r4
            r8 = r1
            java.lang.String r1 = r4.a
            r9 = r2
            java.lang.String r2 = r4.b
            long r13 = r4.c
            java.lang.String r5 = r4.f
            gk4 r3 = (defpackage.gk4) r3
            gk4 r4 = defpackage.gk4.HARDCORE
            r10 = r8
            if (r3 != r4) goto L46
            r8 = r6
            goto L47
        L46:
            r8 = r9
        L47:
            ik4 r10 = (defpackage.ik4) r10
            r11.Y = r6
            long r6 = r11.Z
            r9 = r3
            r3 = r13
            java.lang.Object r0 = r0.e(r1, r2, r3, r5, r6, r8, r9, r10, r11)
            if (r0 != r12) goto L57
            r7 = r12
            goto L5c
        L57:
            hm5 r7 = new hm5
            r7.<init>(r0)
        L5c:
            return r7
        L5d:
            r10 = r1
            r9 = r2
            r14 = r4
            p31 r14 = (defpackage.p31) r14
            p70 r1 = r14.p0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.Y
            if (r2 == 0) goto L7b
            if (r2 != r6) goto L76
            defpackage.oi2.Y(r21)     // Catch: java.lang.Throwable -> L70 java.util.concurrent.CancellationException -> L73
            goto Lab
        L70:
            r0 = move-exception
            r7 = 0
            goto Lbf
        L73:
            r0 = move-exception
            r7 = r0
            goto Lbd
        L76:
            defpackage.i.m(r5)
            r7 = 0
            goto Lb8
        L7b:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r11.d0
            w61 r2 = (defpackage.w61) r2
            l61 r2 = r2.A()
            rc3 r18 = defpackage.yh2.u(r2)
            r14.s0 = r6     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            m86 r2 = r14.l0     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            xa4 r4 = defpackage.xa4.Default     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            n31 r12 = new n31     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            r13 = r3
            nh7 r13 = (defpackage.nh7) r13     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            r15 = r10
            z70 r15 = (defpackage.z70) r15     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            long r7 = r11.Z     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            r19 = 0
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r18, r19)     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            r11.Y = r6     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            java.lang.Object r2 = r2.f(r4, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            if (r2 != r0) goto Lab
            r7 = r0
            goto Lb8
        Lab:
            r1.b()     // Catch: java.util.concurrent.CancellationException -> L73 java.lang.Throwable -> Lb9
            r14.s0 = r9
            r3 = 0
            r1.a(r3)
            r14.q0 = r9
            jg7 r7 = defpackage.jg7.a
        Lb8:
            return r7
        Lb9:
            r0 = move-exception
            r3 = 0
            r7 = r3
            goto Lbf
        Lbd:
            throw r7     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r0 = move-exception
        Lbf:
            r14.s0 = r9
            r1.a(r7)
            r14.q0 = r9
            throw r0
    }
}
