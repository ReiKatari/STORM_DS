package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on1  reason: default package */
/* loaded from: classes.dex */
public final class on1 extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ java.lang.Object X;
    public java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.ao2 d0;
    public final /* synthetic */ defpackage.ao2 e0;
    public final /* synthetic */ java.lang.Object f0;

    public on1(defpackage.c5 r2, defpackage.ov4 r3, defpackage.z5 r4, defpackage.dz3 r5, defpackage.k0 r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 0
            r1.L = r0
            r1.Y = r2
            r1.Z = r3
            r1.d0 = r4
            r1.e0 = r5
            r1.f0 = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public /* synthetic */ on1(java.lang.Object r1, defpackage.ao2 r2, defpackage.ao2 r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.L = r6
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
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            on1 r2 = (defpackage.on1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            on1 r2 = (defpackage.on1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            on1 r2 = (defpackage.on1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.L
            java.lang.Object r1 = r13.f0
            ao2 r2 = r13.e0
            ao2 r3 = r13.d0
            java.lang.Object r4 = r13.Z
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L23;
                default: goto Ld;
            }
        Ld:
            on1 r5 = new on1
            r6 = r4
            w61 r6 = (defpackage.w61) r6
            r7 = r3
            c27 r7 = (defpackage.c27) r7
            r8 = r2
            j4 r8 = (defpackage.j4) r8
            r9 = r1
            j25 r9 = (defpackage.j25) r9
            r11 = 2
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r5.X = r15
            return r5
        L23:
            r10 = r14
            on1 r6 = new on1
            r7 = r4
            br5 r7 = (defpackage.br5) r7
            r8 = r3
            dr5 r8 = (defpackage.dr5) r8
            r9 = r2
            cr5 r9 = (defpackage.cr5) r9
            cr5 r1 = (defpackage.cr5) r1
            r12 = 1
            r11 = r10
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.X = r15
            return r6
        L3a:
            r10 = r14
            on1 r6 = new on1
            java.lang.Object r13 = r13.Y
            r7 = r13
            c5 r7 = (defpackage.c5) r7
            r8 = r4
            ov4 r8 = (defpackage.ov4) r8
            r9 = r3
            z5 r9 = (defpackage.z5) r9
            dz3 r2 = (defpackage.dz3) r2
            r11 = r1
            k0 r11 = (defpackage.k0) r11
            r12 = r10
            r10 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.X = r15
            return r6
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r30) {
            r29 = this;
            r5 = r29
            int r0 = r5.L
            r6 = 3
            jg7 r8 = defpackage.jg7.a
            ao2 r7 = r5.e0
            ao2 r1 = r5.d0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r9 = r5.f0
            r4 = 2
            java.lang.Object r10 = r5.Z
            r11 = 1
            switch(r0) {
                case 0: goto L1aa;
                case 1: goto Lc0;
                default: goto L17;
            }
        L17:
            w61 r10 = (defpackage.w61) r10
            r15 = r9
            j25 r15 = (defpackage.j25) r15
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r5.R
            r13 = 0
            if (r9 == 0) goto L48
            if (r9 == r11) goto L39
            if (r9 != r4) goto L33
            java.lang.Object r0 = r5.X
            rc3 r0 = (defpackage.rc3) r0
            defpackage.oi2.Y(r30)
            r4 = r30
            r1 = r13
            goto L9b
        L33:
            defpackage.i.m(r3)
            r8 = 0
            goto Lbf
        L39:
            java.lang.Object r3 = r5.Y
            ap6 r3 = (defpackage.ap6) r3
            java.lang.Object r6 = r5.X
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r30)
            r9 = r6
            r6 = r30
            goto L6c
        L48:
            defpackage.oi2.Y(r30)
            java.lang.Object r3 = r5.X
            mw6 r3 = (defpackage.mw6) r3
            a71 r9 = defpackage.a71.UNDISPATCHED
            bz6 r12 = new bz6
            r12.<init>(r15, r13, r2)
            ap6 r9 = defpackage.hv.L(r10, r13, r9, r12, r11)
            r5.X = r3
            r5.Y = r9
            r5.R = r11
            java.lang.Object r6 = defpackage.hz6.b(r3, r5, r6)
            if (r6 != r0) goto L67
            goto L98
        L67:
            r27 = r9
            r9 = r3
            r3 = r27
        L6c:
            r16 = r6
            vy4 r16 = (defpackage.vy4) r16
            r16.a()
            r14 = r1
            c27 r14 = (defpackage.c27) r14
            do1 r1 = defpackage.hz6.a
            if (r14 == r1) goto L89
            r17 = r13
            vy5 r13 = new vy5
            r18 = 11
            r13.<init>(r14, r15, r16, r17, r18)
            r1 = r17
            defpackage.hz6.f(r10, r3, r13)
            goto L8a
        L89:
            r1 = r13
        L8a:
            r5.X = r3
            r5.Y = r1
            r5.R = r4
            py4 r4 = defpackage.py4.Main
            java.lang.Object r4 = defpackage.hz6.i(r9, r4, r5)
            if (r4 != r0) goto L9a
        L98:
            r8 = r0
            goto Lbf
        L9a:
            r0 = r3
        L9b:
            vy4 r4 = (defpackage.vy4) r4
            if (r4 != 0) goto La8
            az6 r3 = new az6
            r3.<init>(r15, r1, r2)
            defpackage.hz6.f(r10, r0, r3)
            goto Lbf
        La8:
            r4.a()
            az6 r2 = new az6
            r2.<init>(r15, r1, r11)
            defpackage.hz6.f(r10, r0, r2)
            j4 r7 = (defpackage.j4) r7
            long r0 = r4.c
            jk4 r2 = new jk4
            r2.<init>(r0)
            r7.g(r2)
        Lbf:
            return r8
        Lc0:
            r13 = r1
            dr5 r13 = (defpackage.dr5) r13
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r5.R
            if (r0 == 0) goto Lf5
            if (r0 == r11) goto Leb
            if (r0 == r4) goto Ldc
            if (r0 != r6) goto Ld6
            defpackage.oi2.Y(r30)
            r0 = r30
            goto L196
        Ld6:
            defpackage.i.m(r3)
            r8 = 0
            goto L1a9
        Ldc:
            java.lang.Object r0 = r5.Y
            ah5 r0 = (defpackage.ah5) r0
            java.lang.Object r1 = r5.X
            mw6 r1 = (defpackage.mw6) r1
            defpackage.oi2.Y(r30)
            r2 = r1
            r1 = r30
            goto L12f
        Leb:
            java.lang.Object r0 = r5.X
            mw6 r0 = (defpackage.mw6) r0
            defpackage.oi2.Y(r30)
            r1 = r30
            goto L108
        Lf5:
            defpackage.oi2.Y(r30)
            java.lang.Object r0 = r5.X
            mw6 r0 = (defpackage.mw6) r0
            r5.X = r0
            r5.R = r11
            java.lang.Object r1 = defpackage.hz6.b(r0, r5, r4)
            if (r1 != r14) goto L108
            goto L194
        L108:
            vy4 r1 = (defpackage.vy4) r1
            ah5 r11 = new ah5
            r11.<init>()
            long r2 = r1.a
            int r1 = r1.i
            z5 r15 = new z5
            r6 = 10
            r15.<init>(r11, r6)
            r5.X = r0
            r5.Y = r11
            r5.R = r4
            r27 = r2
            r3 = r1
            r1 = r27
            r4 = r15
            java.lang.Object r1 = defpackage.sn1.d(r0, r1, r3, r4, r5)
            if (r1 != r14) goto L12d
            goto L194
        L12d:
            r2 = r0
            r0 = r11
        L12f:
            vy4 r1 = (defpackage.vy4) r1
            if (r1 == 0) goto L1a9
            br5 r10 = (defpackage.br5) r10
            long r3 = r1.c
            qa4 r6 = r10.A
            int r11 = r10.B
            boolean r15 = r10.L
            on2 r12 = r10.R
            r17 = r3
            java.util.List r3 = r10.X
            java.util.Map r4 = r10.Y
            r20 = r3
            qa4 r3 = r10.Z
            r22 = r3
            qa4 r3 = r10.d0
            r23 = r3
            qa4 r3 = r10.e0
            eo2 r10 = r10.f0
            r24 = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r6.setValue(r3)
            r25 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = r4
            long r3 = r17 & r25
            int r3 = (int) r3
            float r26 = java.lang.Float.intBitsToFloat(r3)
            r25 = r10
            r17 = r11
            r19 = r12
            r18 = r15
            defpackage.ak7.F(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r0 = r0.A
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r13.o(r1, r3)
            long r0 = r1.a
            k0 r3 = new k0
            r4 = 22
            r3.<init>(r13, r4)
            r4 = 0
            r5.X = r4
            r5.Y = r4
            r4 = 3
            r5.R = r4
            java.lang.Object r0 = defpackage.sn1.i(r2, r0, r3, r5)
            if (r0 != r14) goto L196
        L194:
            r8 = r14
            goto L1a9
        L196:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a4
            cr5 r7 = (defpackage.cr5) r7
            r7.c()
            goto L1a9
        L1a4:
            cr5 r9 = (defpackage.cr5) r9
            r9.c()
        L1a9:
            return r8
        L1aa:
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r5.R
            if (r0 == 0) goto L1c7
            if (r0 == r11) goto L1bd
            if (r0 != r4) goto L1b8
            defpackage.oi2.Y(r30)
            goto L1fd
        L1b8:
            defpackage.i.m(r3)
            r8 = 0
            goto L1fd
        L1bd:
            java.lang.Object r0 = r5.X
            mw6 r0 = (defpackage.mw6) r0
            defpackage.oi2.Y(r30)
            r2 = r30
            goto L1db
        L1c7:
            defpackage.oi2.Y(r30)
            java.lang.Object r0 = r5.X
            mw6 r0 = (defpackage.mw6) r0
            py4 r3 = defpackage.py4.Initial
            r5.X = r0
            r5.R = r11
            java.lang.Object r2 = defpackage.hz6.a(r0, r2, r3, r5)
            if (r2 != r12) goto L1db
            goto L1fc
        L1db:
            vy4 r2 = (defpackage.vy4) r2
            java.lang.Object r3 = r5.Y
            c5 r3 = (defpackage.c5) r3
            ov4 r10 = (defpackage.ov4) r10
            z5 r1 = (defpackage.z5) r1
            dz3 r7 = (defpackage.dz3) r7
            r6 = r9
            k0 r6 = (defpackage.k0) r6
            r9 = 0
            r5.X = r9
            r5.R = r4
            r4 = r7
            r7 = r5
            r5 = r4
            r4 = r1
            r1 = r2
            r2 = r3
            r3 = r10
            java.lang.Object r0 = defpackage.sn1.h(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r12) goto L1fd
        L1fc:
            r8 = r12
        L1fd:
            return r8
    }
}
