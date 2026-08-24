package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o32  reason: default package */
/* loaded from: classes.dex */
public final class o32 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.String X;
    public java.lang.String Y;
    public java.lang.Object Z;
    public defpackage.dh5 d0;
    public defpackage.dh5 e0;
    public defpackage.dh5 f0;
    public defpackage.dh5 g0;
    public int h0;
    public /* synthetic */ java.lang.Object i0;
    public final /* synthetic */ defpackage.rc3 j0;
    public final /* synthetic */ defpackage.sz1 k0;
    public final /* synthetic */ defpackage.tu0 l0;
    public final /* synthetic */ defpackage.uz1 m0;
    public final /* synthetic */ defpackage.pq5 n0;

    public o32(defpackage.rc3 r1, defpackage.sz1 r2, defpackage.tu0 r3, defpackage.uz1 r4, defpackage.pq5 r5, defpackage.r41 r6) {
            r0 = this;
            r0.j0 = r1
            r0.k0 = r2
            r0.l0 = r3
            r0.m0 = r4
            r0.n0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            o32 r0 = (defpackage.o32) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            o32 r0 = new o32
            uz1 r4 = r7.m0
            pq5 r5 = r7.n0
            rc3 r1 = r7.j0
            sz1 r2 = r7.k0
            tu0 r3 = r7.l0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.i0 = r9
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r31) {
            r30 = this;
            r1 = r30
            java.lang.String r2 = "RetroAchievements bootstrap failed for '"
            java.lang.Object r0 = r1.i0
            w61 r0 = (defpackage.w61) r0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.h0
            r5 = 9
            r6 = 3
            r7 = 2
            r9 = 1
            r10 = 0
            switch(r4) {
                case 0: goto La8;
                case 1: goto La4;
                case 2: goto La0;
                case 3: goto L97;
                case 4: goto L8e;
                case 5: goto L83;
                case 6: goto L78;
                case 7: goto L69;
                case 8: goto L4e;
                case 9: goto L3a;
                case 10: goto L1b;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L1b:
            dh5 r3 = r1.g0
            dh5 r4 = r1.f0
            rz1 r4 = (defpackage.rz1) r4
            dh5 r4 = r1.e0
            dh5 r11 = r1.d0
            java.lang.Object r12 = r1.Z
            dh5 r12 = (defpackage.dh5) r12
            java.lang.String r13 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            r7 = r4
            r15 = 0
            r4 = r31
            goto L30e
        L36:
            r0 = move-exception
        L37:
            r15 = 0
            goto L4da
        L3a:
            dh5 r4 = r1.e0
            dh5 r11 = r1.d0
            java.lang.Object r12 = r1.Z
            dh5 r12 = (defpackage.dh5) r12
            java.lang.String r13 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            r7 = r4
            r4 = r31
            goto L26d
        L4e:
            dh5 r4 = r1.f0
            dh5 r11 = r1.e0
            dh5 r12 = r1.d0
            java.lang.Object r13 = r1.Z
            dh5 r13 = (defpackage.dh5) r13
            java.lang.String r14 = r1.Y
            java.lang.String r15 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L66
            r7 = r4
            r9 = r14
            r14 = r15
            r4 = r31
            goto L230
        L66:
            r0 = move-exception
            r14 = r15
            goto L37
        L69:
            java.lang.Object r4 = r1.Z
            sz1 r4 = (defpackage.sz1) r4
            java.lang.String r11 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            r12 = r31
            goto L1e2
        L78:
            java.lang.String r4 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            r11 = r31
            goto L169
        L83:
            java.lang.String r4 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            r11 = r31
            goto L14a
        L8e:
            java.lang.String r4 = r1.Y
            java.lang.String r14 = r1.X
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L36
            goto L12a
        L97:
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L9d
            r4 = r31
            goto Ld7
        L9d:
            r0 = move-exception
            r14 = r10
            goto L37
        La0:
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L9d
            goto Lc9
        La4:
            defpackage.oi2.Y(r31)     // Catch: java.lang.Throwable -> L9d
            goto Lbb
        La8:
            defpackage.oi2.Y(r31)
            rc3 r4 = r1.j0     // Catch: java.lang.Throwable -> L4d7
            if (r4 == 0) goto Lbb
            r1.i0 = r0     // Catch: java.lang.Throwable -> L9d
            r1.h0 = r9     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r4 = defpackage.yh2.n(r4, r1)     // Catch: java.lang.Throwable -> L9d
            if (r4 != r3) goto Lbb
            goto L30c
        Lbb:
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L4d7
            r1.i0 = r0     // Catch: java.lang.Throwable -> L4d7
            r1.h0 = r7     // Catch: java.lang.Throwable -> L4d7
            java.lang.Object r4 = defpackage.sz1.f(r4, r1)     // Catch: java.lang.Throwable -> L4d7
            if (r4 != r3) goto Lc9
            goto L30c
        Lc9:
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L4d7
            r1.i0 = r0     // Catch: java.lang.Throwable -> L4d7
            r1.h0 = r6     // Catch: java.lang.Throwable -> L4d7
            java.lang.Object r4 = defpackage.sz1.e(r4, r1)     // Catch: java.lang.Throwable -> L4d7
            if (r4 != r3) goto Ld7
            goto L30c
        Ld7:
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L4d7
            sz1 r4 = r1.k0
            if (r14 != 0) goto L118
            r4.N = r10     // Catch: java.lang.Throwable -> L9d
            sz1$c r0 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L9d
            r4.O = r0     // Catch: java.lang.Throwable -> L9d
            sx1 r0 = r4.w     // Catch: java.lang.Throwable -> L9d
            dp2 r3 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L9d
            r0.d(r3)     // Catch: java.lang.Throwable -> L9d
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "ra_runtime_identity_lease_rejected"
            java.lang.String r4 = "reason"
            java.lang.String r5 = "authentication_mutation_or_mismatch"
            vr4 r6 = new vr4     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L9d
            vr4[] r4 = new defpackage.vr4[]{r6}     // Catch: java.lang.Throwable -> L9d
            r0.G0(r3, r4)     // Catch: java.lang.Throwable -> L9d
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L9d
            of6 r0 = r0.N0     // Catch: java.lang.Throwable -> L9d
            la5 r3 = new la5     // Catch: java.lang.Throwable -> L9d
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L9d
            r0.k(r3)     // Catch: java.lang.Throwable -> L9d
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L9d
            jg7 r3 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L9d
            r0.b0(r3)     // Catch: java.lang.Throwable -> L9d
            tu0 r0 = r1.l0
            r0.b0(r3)
            return r3
        L118:
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r14     // Catch: java.lang.Throwable -> L36
            r11 = 4
            r1.h0 = r11     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = defpackage.sz1.f(r4, r1)     // Catch: java.lang.Throwable -> L36
            if (r4 != r3) goto L129
            goto L30c
        L129:
            r4 = r14
        L12a:
            l61 r11 = r1.b()     // Catch: java.lang.Throwable -> L36
            defpackage.yh2.o(r11)     // Catch: java.lang.Throwable -> L36
            sz1 r11 = r1.k0     // Catch: java.lang.Throwable -> L36
            pn5 r11 = r11.g     // Catch: java.lang.Throwable -> L36
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r4     // Catch: java.lang.Throwable -> L36
            r12 = 5
            r1.h0 = r12     // Catch: java.lang.Throwable -> L36
            pl r11 = (defpackage.pl) r11     // Catch: java.lang.Throwable -> L36
            hk r11 = r11.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r11.b(r1)     // Catch: java.lang.Throwable -> L36
            if (r11 != r3) goto L14a
            goto L30c
        L14a:
            boolean r12 = r11 instanceof defpackage.hb5     // Catch: java.lang.Throwable -> L36
            if (r12 == 0) goto L151
            hb5 r11 = (defpackage.hb5) r11     // Catch: java.lang.Throwable -> L36
            goto L152
        L151:
            r11 = r10
        L152:
            if (r11 == 0) goto L171
            sz1 r12 = r1.k0     // Catch: java.lang.Throwable -> L36
            iw2 r12 = r12.o0     // Catch: java.lang.Throwable -> L36
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r4     // Catch: java.lang.Throwable -> L36
            r13 = 6
            r1.h0 = r13     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r12.b(r4, r11, r1)     // Catch: java.lang.Throwable -> L36
            if (r11 != r3) goto L169
            goto L30c
        L169:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L36
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r11 != 0) goto L174
        L171:
            r15 = 0
            goto L491
        L174:
            sz1 r11 = r1.k0     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r11.P     // Catch: java.lang.Throwable -> L36
            sz1 r12 = r1.k0     // Catch: java.lang.Throwable -> L36
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L36
            r12.R = r4     // Catch: java.lang.Throwable -> L48d
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L36
            sz1 r11 = r1.k0     // Catch: java.lang.Throwable -> L36
            ks3 r11 = r11.Z     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r12 = r11.a     // Catch: java.lang.Throwable -> L36
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L36
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L36
            r12.getClass()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L36
        L191:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r13 == 0) goto L1b0
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L36
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.lang.Throwable -> L36
            r13.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L36
            bs3 r13 = (defpackage.bs3) r13     // Catch: java.lang.Throwable -> L36
            as3 r13 = r13.b     // Catch: java.lang.Throwable -> L36
            as3 r15 = defpackage.as3.PENDING     // Catch: java.lang.Throwable -> L36
            if (r13 == r15) goto L191
            r12.remove()     // Catch: java.lang.Throwable -> L36
            goto L191
        L1b0:
            java.util.LinkedHashMap r12 = r11.b     // Catch: java.lang.Throwable -> L36
            r12.clear()     // Catch: java.lang.Throwable -> L36
            r11.e = r9     // Catch: java.lang.Throwable -> L36
            sz1 r11 = r1.k0     // Catch: java.lang.Throwable -> L36
            bg1 r11 = r11.a0     // Catch: java.lang.Throwable -> L36
            r11.k()     // Catch: java.lang.Throwable -> L36
            sz1 r11 = r1.k0     // Catch: java.lang.Throwable -> L36
            kd6 r12 = defpackage.sz1.y(r11)     // Catch: java.lang.Throwable -> L36
            ng6 r12 = (defpackage.ng6) r12     // Catch: java.lang.Throwable -> L36
            wp0 r12 = r12.C()     // Catch: java.lang.Throwable -> L36
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r4     // Catch: java.lang.Throwable -> L36
            r1.Z = r11     // Catch: java.lang.Throwable -> L36
            r13 = 7
            r1.h0 = r13     // Catch: java.lang.Throwable -> L36
            java.lang.Object r12 = defpackage.f04.D(r12, r1)     // Catch: java.lang.Throwable -> L36
            if (r12 != r3) goto L1dd
            goto L30c
        L1dd:
            r29 = r11
            r11 = r4
            r4 = r29
        L1e2:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
            boolean r12 = defpackage.nb3.k(r12, r13)     // Catch: java.lang.Throwable -> L36
            r4.T = r12     // Catch: java.lang.Throwable -> L36
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L36
            r4.M = r10     // Catch: java.lang.Throwable -> L36
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L36
            r4.N = r10     // Catch: java.lang.Throwable -> L36
            sz1$c r12 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L36
            r4.O = r12     // Catch: java.lang.Throwable -> L36
            dh5 r13 = new dh5     // Catch: java.lang.Throwable -> L36
            r13.<init>()     // Catch: java.lang.Throwable -> L36
            uz1 r12 = r1.m0     // Catch: java.lang.Throwable -> L36
            r13.A = r12     // Catch: java.lang.Throwable -> L36
            dh5 r15 = new dh5     // Catch: java.lang.Throwable -> L36
            r15.<init>()     // Catch: java.lang.Throwable -> L36
            sz1$b r12 = r12.a     // Catch: java.lang.Throwable -> L36
            r15.A = r12     // Catch: java.lang.Throwable -> L36
            dh5 r7 = new dh5     // Catch: java.lang.Throwable -> L36
            r7.<init>()     // Catch: java.lang.Throwable -> L36
            sz1$b r9 = defpackage.sz1.b.OFFLINE_ACCUMULATING     // Catch: java.lang.Throwable -> L36
            if (r12 != r9) goto L23b
            pq5 r9 = r1.n0     // Catch: java.lang.Throwable -> L36
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r11     // Catch: java.lang.Throwable -> L36
            r1.Z = r13     // Catch: java.lang.Throwable -> L36
            r1.d0 = r15     // Catch: java.lang.Throwable -> L36
            r1.e0 = r7     // Catch: java.lang.Throwable -> L36
            r1.f0 = r7     // Catch: java.lang.Throwable -> L36
            r12 = 8
            r1.h0 = r12     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.e0(r9, r1)     // Catch: java.lang.Throwable -> L36
            if (r4 != r3) goto L22d
            goto L30c
        L22d:
            r9 = r11
            r12 = r15
            r11 = r7
        L230:
            pz1 r4 = (defpackage.pz1) r4     // Catch: java.lang.Throwable -> L36
            r29 = r9
            r9 = r7
            r7 = r11
            r11 = r12
            r12 = r13
            r13 = r29
            goto L240
        L23b:
            r9 = r7
            r4 = r10
            r12 = r13
            r13 = r11
            r11 = r15
        L240:
            r9.A = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r11.A     // Catch: java.lang.Throwable -> L36
            sz1$b r9 = defpackage.sz1.b.OFFLINE_ACCUMULATING     // Catch: java.lang.Throwable -> L36
            if (r4 == r9) goto L270
            de1 r4 = defpackage.xk1.a()     // Catch: java.lang.Throwable -> L36
            f02 r9 = new f02     // Catch: java.lang.Throwable -> L36
            sz1 r15 = r1.k0     // Catch: java.lang.Throwable -> L36
            pq5 r8 = r1.n0     // Catch: java.lang.Throwable -> L36
            r9.<init>(r15, r8, r10, r6)     // Catch: java.lang.Throwable -> L36
            r1.i0 = r0     // Catch: java.lang.Throwable -> L36
            r1.X = r14     // Catch: java.lang.Throwable -> L36
            r1.Y = r13     // Catch: java.lang.Throwable -> L36
            r1.Z = r12     // Catch: java.lang.Throwable -> L36
            r1.d0 = r11     // Catch: java.lang.Throwable -> L36
            r1.e0 = r7     // Catch: java.lang.Throwable -> L36
            r1.f0 = r10     // Catch: java.lang.Throwable -> L36
            r1.h0 = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = defpackage.hv.d0(r4, r9, r1)     // Catch: java.lang.Throwable -> L36
            if (r4 != r3) goto L26d
            goto L30c
        L26d:
            rz1 r4 = (defpackage.rz1) r4     // Catch: java.lang.Throwable -> L36
            goto L271
        L270:
            r4 = r10
        L271:
            java.lang.Object r8 = r12.A     // Catch: java.lang.Throwable -> L36
            uz1 r8 = (defpackage.uz1) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.g     // Catch: java.lang.Throwable -> L36
            if (r8 != 0) goto L348
            java.lang.Object r8 = r12.A     // Catch: java.lang.Throwable -> L36
            uz1 r8 = (defpackage.uz1) r8     // Catch: java.lang.Throwable -> L36
            sz1$d r8 = r8.b     // Catch: java.lang.Throwable -> L36
            sz1$d r9 = defpackage.sz1.d.HARDCORE     // Catch: java.lang.Throwable -> L36
            if (r8 != r9) goto L285
            r8 = 1
            goto L286
        L285:
            r8 = 0
        L286:
            if (r4 == 0) goto L28b
            sz1$a r9 = r4.b     // Catch: java.lang.Throwable -> L36
            goto L28c
        L28b:
            r9 = r10
        L28c:
            sz1$a r15 = defpackage.sz1.a.NETWORK     // Catch: java.lang.Throwable -> L36
            if (r9 != r15) goto L292
            r9 = 1
            goto L293
        L292:
            r9 = 0
        L293:
            if (r8 == 0) goto L348
            if (r9 != 0) goto L348
            java.lang.Object r4 = r12.A     // Catch: java.lang.Throwable -> L36
            r17 = r4
            uz1 r17 = (defpackage.uz1) r17     // Catch: java.lang.Throwable -> L36
            sz1$b r18 = defpackage.sz1.b.OFFLINE_ACCUMULATING     // Catch: java.lang.Throwable -> L36
            sz1$d r19 = defpackage.sz1.d.SOFTCORE     // Catch: java.lang.Throwable -> L36
            ik4 r20 = defpackage.ik4.OFFLINE_FROM_START     // Catch: java.lang.Throwable -> L36
            r22 = 0
            r24 = 448(0x1c0, float:6.28E-43)
            r21 = 0
            uz1 r4 = defpackage.uz1.a(r17, r18, r19, r20, r21, r22, r24)     // Catch: java.lang.Throwable -> L36
            r12.A = r4     // Catch: java.lang.Throwable -> L36
            sz1$b r4 = r4.a     // Catch: java.lang.Throwable -> L36
            r11.A = r4     // Catch: java.lang.Throwable -> L36
            sz1 r8 = r1.k0     // Catch: java.lang.Throwable -> L36
            r8.G = r4     // Catch: java.lang.Throwable -> L36
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r12.A     // Catch: java.lang.Throwable -> L36
            uz1 r8 = (defpackage.uz1) r8     // Catch: java.lang.Throwable -> L36
            sz1$d r8 = r8.b     // Catch: java.lang.Throwable -> L36
            r4.H = r8     // Catch: java.lang.Throwable -> L36
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L36
            r8 = 0
            r4.I = r8     // Catch: java.lang.Throwable -> L344
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L344
            r4.J = r8     // Catch: java.lang.Throwable -> L344
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L36
            kd6 r4 = defpackage.sz1.y(r4)     // Catch: java.lang.Throwable -> L36
            ng6 r4 = (defpackage.ng6) r4     // Catch: java.lang.Throwable -> L36
            boolean r4 = r4.D()     // Catch: java.lang.Throwable -> L36
            sz1 r8 = r1.k0     // Catch: java.lang.Throwable -> L36
            sx1 r8 = defpackage.sz1.r(r8)     // Catch: java.lang.Throwable -> L36
            rx1 r9 = new rx1     // Catch: java.lang.Throwable -> L36
            pq5 r15 = r1.n0     // Catch: java.lang.Throwable -> L36
            r9.<init>(r15)     // Catch: java.lang.Throwable -> L36
            r8.b = r4     // Catch: java.lang.Throwable -> L36
            r15 = 0
            r8.a = r15     // Catch: java.lang.Throwable -> L316
            r8.d = r15     // Catch: java.lang.Throwable -> L316
            r8.e = r9     // Catch: java.lang.Throwable -> L316
            if (r4 == 0) goto L319
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            pq5 r8 = r1.n0     // Catch: java.lang.Throwable -> L316
            r1.i0 = r0     // Catch: java.lang.Throwable -> L316
            r1.X = r14     // Catch: java.lang.Throwable -> L316
            r1.Y = r13     // Catch: java.lang.Throwable -> L316
            r1.Z = r12     // Catch: java.lang.Throwable -> L316
            r1.d0 = r11     // Catch: java.lang.Throwable -> L316
            r1.e0 = r7     // Catch: java.lang.Throwable -> L316
            r1.f0 = r10     // Catch: java.lang.Throwable -> L316
            r1.g0 = r7     // Catch: java.lang.Throwable -> L316
            r9 = 10
            r1.h0 = r9     // Catch: java.lang.Throwable -> L316
            java.lang.Object r4 = r4.e0(r8, r1)     // Catch: java.lang.Throwable -> L316
            if (r4 != r3) goto L30d
        L30c:
            return r3
        L30d:
            r3 = r7
        L30e:
            pz1 r4 = (defpackage.pz1) r4     // Catch: java.lang.Throwable -> L316
            r29 = r7
            r7 = r3
            r3 = r29
            goto L31b
        L316:
            r0 = move-exception
            goto L4da
        L319:
            r3 = r7
            r4 = r10
        L31b:
            r7.A = r4     // Catch: java.lang.Throwable -> L316
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            java.lang.String r7 = "reason"
            java.lang.String r8 = "network_bootstrap_unavailable"
            vr4 r7 = defpackage.kj2.a0(r7, r8)     // Catch: java.lang.Throwable -> L316
            java.lang.String r8 = "fallback"
            java.lang.Object r9 = r3.A     // Catch: java.lang.Throwable -> L316
            if (r9 == 0) goto L330
            java.lang.String r9 = "softcore_offline"
            goto L332
        L330:
            java.lang.String r9 = "disabled"
        L332:
            vr4 r8 = defpackage.kj2.a0(r8, r9)     // Catch: java.lang.Throwable -> L316
            vr4[] r7 = new defpackage.vr4[]{r7, r8}     // Catch: java.lang.Throwable -> L316
            java.lang.String r8 = "ra_hardcore_online_bootstrap_rejected"
            r4.H0(r8, r7)     // Catch: java.lang.Throwable -> L316
            r7 = r3
            r4 = r10
        L341:
            r21 = r12
            goto L34a
        L344:
            r0 = move-exception
            r15 = r8
            goto L4da
        L348:
            r15 = 0
            goto L341
        L34a:
            java.lang.Object r3 = r11.A     // Catch: java.lang.Throwable -> L316
            sz1$b r3 = (defpackage.sz1.b) r3     // Catch: java.lang.Throwable -> L316
            int[] r8 = defpackage.l32.a     // Catch: java.lang.Throwable -> L316
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L316
            r3 = r8[r3]     // Catch: java.lang.Throwable -> L316
            r8 = 1
            if (r3 == r8) goto L396
            r8 = 2
            if (r3 == r8) goto L396
            if (r3 != r6) goto L390
            java.lang.Object r3 = r7.A     // Catch: java.lang.Throwable -> L316
            pz1 r3 = (defpackage.pz1) r3     // Catch: java.lang.Throwable -> L316
            if (r3 == 0) goto L367
            ep2 r3 = r3.d     // Catch: java.lang.Throwable -> L316
            goto L3bb
        L367:
            dp2 r3 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L316
            r3.getClass()     // Catch: java.lang.Throwable -> L316
            dp2 r4 = defpackage.dp2.ENABLED_FULL     // Catch: java.lang.Throwable -> L316
            if (r3 == r4) goto L388
            dp2 r4 = defpackage.dp2.ENABLED_NO_ACHIEVEMENTS     // Catch: java.lang.Throwable -> L316
            if (r3 == r4) goto L388
            ep2 r22 = new ep2     // Catch: java.lang.Throwable -> L316
            yt1 r24 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L316
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r24
            r23 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L316
        L385:
            r3 = r22
            goto L3bb
        L388:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L316
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L316
            throw r3     // Catch: java.lang.Throwable -> L316
        L390:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L316
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L316
            throw r0     // Catch: java.lang.Throwable -> L316
        L396:
            if (r4 == 0) goto L39c
            ep2 r3 = r4.a     // Catch: java.lang.Throwable -> L316
            if (r3 != 0) goto L3bb
        L39c:
            dp2 r3 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L316
            r3.getClass()     // Catch: java.lang.Throwable -> L316
            dp2 r4 = defpackage.dp2.ENABLED_FULL     // Catch: java.lang.Throwable -> L316
            if (r3 == r4) goto L485
            dp2 r4 = defpackage.dp2.ENABLED_NO_ACHIEVEMENTS     // Catch: java.lang.Throwable -> L316
            if (r3 == r4) goto L485
            ep2 r22 = new ep2     // Catch: java.lang.Throwable -> L316
            yt1 r24 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L316
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r24
            r23 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L316
            goto L385
        L3bb:
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            sx1 r4 = defpackage.sz1.r(r4)     // Catch: java.lang.Throwable -> L316
            dp2 r5 = r3.a     // Catch: java.lang.Throwable -> L316
            r4.d(r5)     // Catch: java.lang.Throwable -> L316
            dp2 r4 = r3.a     // Catch: java.lang.Throwable -> L316
            dp2 r5 = defpackage.dp2.ENABLED_FULL     // Catch: java.lang.Throwable -> L316
            if (r4 == r5) goto L3d3
            dp2 r5 = defpackage.dp2.ENABLED_NO_ACHIEVEMENTS     // Catch: java.lang.Throwable -> L316
            if (r4 != r5) goto L3d1
            goto L3d3
        L3d1:
            r8 = r15
            goto L3d4
        L3d3:
            r8 = 1
        L3d4:
            if (r8 != 0) goto L44c
            java.lang.Object r0 = r11.A     // Catch: java.lang.Throwable -> L316
            sz1$b r4 = defpackage.sz1.b.OFFLINE_ACCUMULATING     // Catch: java.lang.Throwable -> L316
            if (r0 != r4) goto L3f8
            java.lang.Object r0 = r7.A     // Catch: java.lang.Throwable -> L316
            pz1 r0 = (defpackage.pz1) r0     // Catch: java.lang.Throwable -> L316
            if (r0 == 0) goto L3f8
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L316
            r8 = 1
            if (r0 != r8) goto L3f8
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L316
            pa5 r4 = new pa5     // Catch: java.lang.Throwable -> L316
            java.net.URL r3 = r3.f     // Catch: java.lang.Throwable -> L316
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L316
            r0.k(r4)     // Catch: java.lang.Throwable -> L316
            goto L438
        L3f8:
            dp2 r0 = r3.a     // Catch: java.lang.Throwable -> L316
            dp2 r4 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L316
            if (r0 != r4) goto L40f
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L316
            la5 r4 = new la5     // Catch: java.lang.Throwable -> L316
            java.net.URL r3 = r3.f     // Catch: java.lang.Throwable -> L316
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L316
            r0.k(r4)     // Catch: java.lang.Throwable -> L316
            goto L438
        L40f:
            dp2 r4 = defpackage.dp2.DISABLED_GAME_NOT_FOUND     // Catch: java.lang.Throwable -> L316
            if (r0 != r4) goto L424
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L316
            na5 r4 = new na5     // Catch: java.lang.Throwable -> L316
            java.net.URL r3 = r3.f     // Catch: java.lang.Throwable -> L316
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L316
            r0.k(r4)     // Catch: java.lang.Throwable -> L316
            goto L438
        L424:
            dp2 r4 = defpackage.dp2.DISABLED_LOGIN_EXPIRED     // Catch: java.lang.Throwable -> L316
            if (r0 != r4) goto L438
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L316
            oa5 r4 = new oa5     // Catch: java.lang.Throwable -> L316
            java.net.URL r3 = r3.f     // Catch: java.lang.Throwable -> L316
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L316
            r0.k(r4)     // Catch: java.lang.Throwable -> L316
        L438:
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            java.lang.String r3 = "integration_disabled"
            defpackage.sz1.R(r0, r13, r3)     // Catch: java.lang.Throwable -> L316
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L316
            jg7 r3 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L316
            r0.u0()     // Catch: java.lang.Throwable -> L316
            tu0 r0 = r1.l0
            r0.u0()
            return r3
        L44c:
            n32 r16 = new n32     // Catch: java.lang.Throwable -> L316
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            pq5 r5 = r1.n0     // Catch: java.lang.Throwable -> L316
            r24 = 0
            r19 = r3
            r18 = r4
            r20 = r5
            r23 = r7
            r17 = r11
            r22 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L316
            r4 = r16
            ap6 r0 = defpackage.hv.L(r0, r10, r10, r4, r6)     // Catch: java.lang.Throwable -> L316
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            r4.F = r0     // Catch: java.lang.Throwable -> L316
            sz1 r4 = r1.k0     // Catch: java.lang.Throwable -> L316
            t00 r5 = new t00     // Catch: java.lang.Throwable -> L316
            r6 = 13
            r5.<init>(r4, r13, r3, r6)     // Catch: java.lang.Throwable -> L316
            r0.a0(r5)     // Catch: java.lang.Throwable -> L316
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L316
            r0.u0()     // Catch: java.lang.Throwable -> L316
        L47e:
            tu0 r0 = r1.l0
            r0.u0()
            goto L546
        L485:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L316
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L316
            throw r3     // Catch: java.lang.Throwable -> L316
        L48d:
            r0 = move-exception
            r15 = 0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L316
            throw r0     // Catch: java.lang.Throwable -> L316
        L491:
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            java.lang.String r3 = "hardcore_queue_session_rejected"
            defpackage.sz1.R(r0, r4, r3)     // Catch: java.lang.Throwable -> L316
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            r0.N = r10     // Catch: java.lang.Throwable -> L316
            sz1$c r3 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L316
            r0.O = r3     // Catch: java.lang.Throwable -> L316
            sx1 r0 = defpackage.sz1.r(r0)     // Catch: java.lang.Throwable -> L316
            dp2 r3 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L316
            r0.d(r3)     // Catch: java.lang.Throwable -> L316
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            java.lang.String r3 = "ra_runtime_identity_lease_rejected"
            java.lang.String r4 = "reason"
            java.lang.String r5 = "hardcore_queue_not_empty_after_terminal_discard"
            vr4 r4 = defpackage.kj2.a0(r4, r5)     // Catch: java.lang.Throwable -> L316
            vr4[] r4 = new defpackage.vr4[]{r4}     // Catch: java.lang.Throwable -> L316
            r0.G0(r3, r4)     // Catch: java.lang.Throwable -> L316
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L316
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L316
            la5 r3 = new la5     // Catch: java.lang.Throwable -> L316
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L316
            r0.k(r3)     // Catch: java.lang.Throwable -> L316
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L316
            jg7 r3 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L316
            r0.u0()     // Catch: java.lang.Throwable -> L316
            tu0 r0 = r1.l0
            r0.u0()
            return r3
        L4d7:
            r0 = move-exception
            r15 = 0
            r14 = r10
        L4da:
            if (r14 == 0) goto L4ed
            sz1 r3 = r1.k0     // Catch: java.lang.Throwable -> L4eb
            dz1 r4 = new dz1     // Catch: java.lang.Throwable -> L4eb
            r8 = 2
            r4.<init>(r3, r8)     // Catch: java.lang.Throwable -> L4eb
            java.lang.String r5 = "bootstrap_failed"
            boolean r8 = r3.h1(r14, r5, r4)     // Catch: java.lang.Throwable -> L4eb
            goto L4ee
        L4eb:
            r0 = move-exception
            goto L54a
        L4ed:
            r8 = r15
        L4ee:
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L4eb
            if (r3 != 0) goto L549
            if (r8 != 0) goto L501
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L4eb
            jg7 r2 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L4eb
            r0.u0()     // Catch: java.lang.Throwable -> L4eb
            tu0 r0 = r1.l0
            r0.u0()
            return r2
        L501:
            java.lang.String r3 = "EmulatorViewModel"
            pq5 r4 = r1.n0     // Catch: java.lang.Throwable -> L4eb
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L4eb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4eb
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4eb
            r5.append(r4)     // Catch: java.lang.Throwable -> L4eb
            java.lang.String r2 = "'"
            r5.append(r2)     // Catch: java.lang.Throwable -> L4eb
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L4eb
            android.util.Log.e(r3, r2, r0)     // Catch: java.lang.Throwable -> L4eb
            tu0 r0 = r1.l0     // Catch: java.lang.Throwable -> L4eb
            r0.u0()     // Catch: java.lang.Throwable -> L4eb
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L4eb
            r0.I0(r10)     // Catch: java.lang.Throwable -> L4eb
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L4eb
            r0.N = r10     // Catch: java.lang.Throwable -> L4eb
            sz1$c r2 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L4eb
            r0.O = r2     // Catch: java.lang.Throwable -> L4eb
            sx1 r0 = defpackage.sz1.r(r0)     // Catch: java.lang.Throwable -> L4eb
            dp2 r2 = defpackage.dp2.DISABLED_LOAD_ERROR     // Catch: java.lang.Throwable -> L4eb
            r0.d(r2)     // Catch: java.lang.Throwable -> L4eb
            sz1 r0 = r1.k0     // Catch: java.lang.Throwable -> L4eb
            of6 r0 = defpackage.sz1.z(r0)     // Catch: java.lang.Throwable -> L4eb
            la5 r2 = new la5     // Catch: java.lang.Throwable -> L4eb
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4eb
            r0.k(r2)     // Catch: java.lang.Throwable -> L4eb
            goto L47e
        L546:
            jg7 r0 = defpackage.jg7.a
            return r0
        L549:
            throw r0     // Catch: java.lang.Throwable -> L4eb
        L54a:
            tu0 r1 = r1.l0
            r1.u0()
            throw r0
    }
}
