package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn  reason: default package */
/* loaded from: classes.dex */
public final class hn extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public java.lang.Object f0;
    public java.lang.Object g0;
    public final /* synthetic */ java.lang.Object h0;

    public hn(defpackage.dh5 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, defpackage.r41 r8) {
            r1 = this;
            r0 = 4
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r1.e0 = r4
            r1.f0 = r5
            r1.g0 = r6
            r1.h0 = r7
            r2 = 2
            r1.<init>(r2, r8)
            return
    }

    public /* synthetic */ hn(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, defpackage.r41 r6, int r7) {
            r0 = this;
            r0.X = r7
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r0.g0 = r4
            r0.h0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    public /* synthetic */ hn(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.e0 = r1
            r0.f0 = r2
            r0.g0 = r3
            r0.h0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ hn(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.g0 = r1
            r0.h0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public hn(defpackage.nx3 r2, defpackage.ww2 r3, defpackage.yw7 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 3
            r1.X = r0
            r1.f0 = r2
            r1.g0 = r3
            r1.h0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public hn(defpackage.ta7 r2, java.lang.String r3, java.lang.String r4, defpackage.hq2 r5, defpackage.f13 r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 6
            r1.X = r0
            r1.Z = r2
            r1.e0 = r3
            r1.f0 = r4
            r1.g0 = r5
            r1.h0 = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public hn(defpackage.wq6 r1, defpackage.li7 r2, defpackage.uq6 r3, defpackage.r41 r4) {
            r0 = this;
            r3 = 9
            r0.X = r3
            r0.g0 = r1
            r0.h0 = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public hn(defpackage.wq6 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 10
            r1.X = r0
            r1.h0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    private final java.lang.Object A(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.h0
            wq6 r0 = (defpackage.wq6) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r7.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L41
            r0 = 3
            if (r2 != r0) goto L3b
            java.lang.Object r0 = r7.g0
            wq6 r0 = (defpackage.wq6) r0
            java.lang.Object r1 = r7.f0
            li7 r1 = (defpackage.li7) r1
            java.lang.Object r2 = r7.e0
            wq6 r2 = (defpackage.wq6) r2
            java.lang.Object r7 = r7.Z
            fb4 r7 = (defpackage.fb4) r7
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L39
            jg1 r8 = (defpackage.jg1) r8     // Catch: java.lang.Throwable -> L39
            r0.getClass()     // Catch: java.lang.Throwable -> L39
            t00 r4 = new t00     // Catch: java.lang.Throwable -> L39
            r4.<init>(r0, r8, r6, r1)     // Catch: java.lang.Throwable -> L39
            ed3 r8 = (defpackage.ed3) r8     // Catch: java.lang.Throwable -> L39
            r8.a0(r4)     // Catch: java.lang.Throwable -> L39
            goto L83
        L39:
            r8 = move-exception
            goto L98
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r6
        L41:
            java.lang.Object r0 = r7.e0
            wq6 r0 = (defpackage.wq6) r0
            java.lang.Object r7 = r7.Z
            fb4 r7 = (defpackage.fb4) r7
            defpackage.oi2.Y(r8)
            goto L82
        L4d:
            java.lang.Object r2 = r7.d0
            li7 r2 = (defpackage.li7) r2
            defpackage.oi2.Y(r8)
            goto L68
        L55:
            defpackage.oi2.Y(r8)
            li7 r2 = r0.d
            if (r2 != 0) goto L5d
            goto L9c
        L5d:
            r7.d0 = r2
            r7.Y = r5
            java.lang.Object r8 = r2.c(r7)
            if (r8 != r1) goto L68
            goto L80
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9c
            hb4 r8 = r0.c
            r7.d0 = r2
            r7.Z = r8
            r7.e0 = r0
            r7.Y = r4
            java.lang.Object r7 = r8.e(r7)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            r7 = r8
        L82:
            r2 = r0
        L83:
            java.util.LinkedList r8 = r2.e     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L94
            java.util.LinkedList r8 = r2.e     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r8.poll()     // Catch: java.lang.Throwable -> L39
            uq6 r8 = (defpackage.uq6) r8     // Catch: java.lang.Throwable -> L39
            goto L83
        L94:
            r7.h(r6)
            return r3
        L98:
            r7.h(r6)
            throw r8
        L9c:
            return r3
    }

    private final java.lang.Object B(java.lang.Object r13) {
            r12 = this;
            java.lang.Object r0 = r12.d0
            zy4 r0 = (defpackage.zy4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r12.Y
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            defpackage.oi2.Y(r13)
            goto L48
        L11:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L18:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.Z
            r5 = r13
            w61 r5 = (defpackage.w61) r5
            j25 r6 = new j25
            r6.<init>(r0)
            cz6 r4 = new cz6
            java.lang.Object r13 = r12.e0
            r7 = r13
            qn2 r7 = (defpackage.qn2) r7
            java.lang.Object r13 = r12.f0
            r8 = r13
            qn2 r8 = (defpackage.qn2) r8
            java.lang.Object r13 = r12.g0
            r9 = r13
            fo2 r9 = (defpackage.fo2) r9
            java.lang.Object r13 = r12.h0
            r10 = r13
            qn2 r10 = (defpackage.qn2) r10
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.Y = r3
            java.lang.Object r12 = defpackage.uj2.o(r0, r4, r12)
            if (r12 != r1) goto L48
            return r1
        L48:
            jg7 r12 = defpackage.jg7.a
            return r12
    }

    private final java.lang.Object v(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.h0
            mc5 r1 = (defpackage.mc5) r1
            java.lang.Object r2 = r0.g0
            r4 = r2
            sz1 r4 = (defpackage.sz1) r4
            of6 r2 = r4.J0
            of6 r9 = r4.T0
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            jy1 r11 = defpackage.jy1.a
            jg7 r12 = defpackage.jg7.a
            r13 = 0
            switch(r3) {
                case 0: goto Lb9;
                case 1: goto Lb5;
                case 2: goto Lad;
                case 3: goto La3;
                case 4: goto L9f;
                case 5: goto L94;
                case 6: goto L90;
                case 7: goto L84;
                case 8: goto L7f;
                case 9: goto L7a;
                case 10: goto L76;
                case 11: goto L60;
                case 12: goto L46;
                case 13: goto L39;
                case 14: goto L35;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L25:
            defpackage.oi2.Y(r17)
            return r12
        L29:
            defpackage.oi2.Y(r17)
            r7 = r13
            goto L274
        L2f:
            defpackage.oi2.Y(r17)
            r7 = r13
            goto L261
        L35:
            defpackage.oi2.Y(r17)
            return r12
        L39:
            java.lang.Object r2 = r0.d0
            dy1 r2 = (defpackage.dy1) r2
            defpackage.oi2.Y(r17)
            r6 = r2
            r7 = r13
            r2 = r17
            goto L209
        L46:
            java.lang.Object r3 = r0.f0
            pj4 r3 = (defpackage.pj4) r3
            java.lang.Object r5 = r0.e0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.Z
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.d0
            dy1 r7 = (defpackage.dy1) r7
            defpackage.oi2.Y(r17)
            r8 = r6
            r6 = r7
            r7 = r13
            r13 = r17
            goto L1ed
        L60:
            java.lang.Object r3 = r0.e0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.Z
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.d0
            dy1 r6 = (defpackage.dy1) r6
            defpackage.oi2.Y(r17)
            r8 = r5
            r7 = r13
            r5 = r3
            r3 = r17
            goto L1cf
        L76:
            defpackage.oi2.Y(r17)
            return r12
        L7a:
            defpackage.oi2.Y(r17)
            goto L196
        L7f:
            defpackage.oi2.Y(r17)
            goto L188
        L84:
            java.lang.Object r3 = r0.d0
            dy1 r3 = (defpackage.dy1) r3
            defpackage.oi2.Y(r17)
            r5 = r17
        L8d:
            r14 = r3
            goto L174
        L90:
            defpackage.oi2.Y(r17)
            return r12
        L94:
            java.lang.Object r3 = r0.d0
            dy1 r3 = (defpackage.dy1) r3
            defpackage.oi2.Y(r17)
            r14 = r17
            goto L13b
        L9f:
            defpackage.oi2.Y(r17)
            return r12
        La3:
            java.lang.Object r3 = r0.d0
            dy1 r3 = (defpackage.dy1) r3
            defpackage.oi2.Y(r17)
            r14 = r17
            goto Lf7
        Lad:
            java.lang.Object r3 = r0.d0
            dy1 r3 = (defpackage.dy1) r3
            defpackage.oi2.Y(r17)
            goto Leb
        Lb5:
            defpackage.oi2.Y(r17)
            return r12
        Lb9:
            defpackage.oi2.Y(r17)
            tp6 r3 = r4.p0
            java.lang.Object r3 = r3.getValue()
            boolean r14 = r3 instanceof defpackage.dy1
            if (r14 == 0) goto Lc9
            dy1 r3 = (defpackage.dy1) r3
            goto Lca
        Lc9:
            r3 = r13
        Lca:
            if (r3 != 0) goto Ldb
            r4.a1()
            r0.d0 = r13
            r0.Y = r8
            java.lang.Object r0 = r9.a(r11, r0)
            if (r0 != r10) goto L28a
            goto L289
        Ldb:
            jh r14 = r4.v
            r0.d0 = r3
            r0.Y = r7
            r14.getClass()
            defpackage.jh.i()
            if (r12 != r10) goto Leb
            goto L289
        Leb:
            r0.d0 = r3
            r0.Y = r6
            java.lang.Object r14 = r4.P0(r0)
            if (r14 != r10) goto Lf7
            goto L289
        Lf7:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L114
            g77 r3 = defpackage.g77.a
            r2.k(r3)
            mc5 r2 = defpackage.mc5.RESUMABLE_SESSION
            if (r1 != r2) goto L28a
            r0.d0 = r13
            r1 = 4
            r0.Y = r1
            r4.U0()
            if (r12 != r10) goto L28a
            goto L289
        L114:
            nv4 r14 = r4.b0
            if (r14 == 0) goto L12b
            de5 r14 = r14.i
            if (r14 == 0) goto L12b
            rp6 r14 = r14.A
            java.lang.Object r14 = r14.getValue()
            bv4 r14 = (defpackage.bv4) r14
            if (r14 == 0) goto L12b
            lc5 r14 = r14.c
            int r14 = r14.a
            goto L12c
        L12b:
            r14 = 0
        L12c:
            if (r14 <= 0) goto L161
            r0.d0 = r3
            r14 = 5
            r0.Y = r14
            java.lang.Enum r14 = defpackage.sz1.C(r4, r1, r0)
            if (r14 != r10) goto L13b
            goto L289
        L13b:
            nc5 r14 = (defpackage.nc5) r14
            int[] r15 = defpackage.x22.a
            int r14 = r14.ordinal()
            r14 = r15[r14]
            if (r14 == r8) goto L161
            if (r14 == r7) goto L151
            if (r14 != r6) goto L14d
            goto L28a
        L14d:
            defpackage.i.d()
            return r5
        L151:
            mc5 r2 = defpackage.mc5.RESUMABLE_SESSION
            if (r1 != r2) goto L28a
            r0.d0 = r13
            r1 = 6
            r0.Y = r1
            r4.U0()
            if (r12 != r10) goto L28a
            goto L289
        L161:
            pn5 r5 = r4.g
            r0.d0 = r3
            r6 = 7
            r0.Y = r6
            pl r5 = (defpackage.pl) r5
            hk r5 = r5.c
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r10) goto L8d
            goto L289
        L174:
            jb5 r5 = (defpackage.jb5) r5
            if (r5 != 0) goto L1a7
            pq5 r1 = r14.a
            r0.d0 = r13
            r2 = 8
            r0.Y = r2
            java.lang.Object r1 = defpackage.sz1.I(r4, r1, r0)
            if (r1 != r10) goto L188
            goto L289
        L188:
            r0.d0 = r13
            r1 = 9
            r0.Y = r1
            java.lang.Object r1 = r4.l0(r0)
            if (r1 != r10) goto L196
            goto L289
        L196:
            r4.a1()
            r0.d0 = r13
            r1 = 10
            r0.Y = r1
            java.lang.Object r0 = r9.a(r11, r0)
            if (r0 != r10) goto L28a
            goto L289
        L1a7:
            java.lang.String r5 = r5.a()
            pq5 r3 = r14.a
            java.lang.String r6 = r3.i
            xe1 r3 = defpackage.xk1.a
            de1 r15 = defpackage.de1.L
            i02 r3 = new i02
            r8 = 5
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.d0 = r14
            r0.Z = r5
            r0.e0 = r6
            r8 = 11
            r0.Y = r8
            java.lang.Object r3 = defpackage.hv.d0(r15, r3, r0)
            if (r3 != r10) goto L1cc
            goto L289
        L1cc:
            r8 = r5
            r5 = r6
            r6 = r14
        L1cf:
            pj4 r3 = (defpackage.pj4) r3
            ui4 r13 = r3.a
            ui4 r14 = defpackage.ui4.OK
            if (r13 != r14) goto L24c
            iw2 r13 = r4.o0
            r0.d0 = r6
            r0.Z = r8
            r0.e0 = r5
            r0.f0 = r3
            r14 = 12
            r0.Y = r14
            java.lang.Object r13 = r13.f(r0)
            if (r13 != r10) goto L1ed
            goto L289
        L1ed:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 <= 0) goto L22d
            r0.d0 = r6
            r0.Z = r7
            r0.e0 = r7
            r0.f0 = r7
            r2 = 13
            r0.Y = r2
            java.lang.Object r2 = defpackage.sz1.A(r4, r8, r5, r1, r0)
            if (r2 != r10) goto L209
            goto L289
        L209:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L24c
            mc5 r2 = defpackage.mc5.RESUMABLE_SESSION
            if (r1 != r2) goto L227
            r0.d0 = r7
            r0.Z = r7
            r0.e0 = r7
            r0.f0 = r7
            r1 = 14
            r0.Y = r1
            r4.U0()
            if (r12 != r10) goto L28a
            goto L289
        L227:
            mc5 r0 = defpackage.mc5.TERMINAL_STOP
            r4.Q0(r0)
            return r12
        L22d:
            ui4 r1 = r3.a
            ui4 r13 = defpackage.ui4.OK
            if (r1 != r13) goto L24c
            xv2 r1 = r4.m
            r1.b(r8, r5)
            int r1 = r3.b()
            if (r1 <= 0) goto L24c
            f77 r1 = new f77
            int r5 = r3.b()
            java.lang.Long r3 = r3.e
            r1.<init>(r5, r3)
            r2.k(r1)
        L24c:
            pq5 r1 = r6.a
            r0.d0 = r7
            r0.Z = r7
            r0.e0 = r7
            r0.f0 = r7
            r2 = 15
            r0.Y = r2
            java.lang.Object r1 = defpackage.sz1.I(r4, r1, r0)
            if (r1 != r10) goto L261
            goto L289
        L261:
            r0.d0 = r7
            r0.Z = r7
            r0.e0 = r7
            r0.f0 = r7
            r1 = 16
            r0.Y = r1
            java.lang.Object r1 = r4.l0(r0)
            if (r1 != r10) goto L274
            goto L289
        L274:
            r4.a1()
            r0.d0 = r7
            r0.Z = r7
            r0.e0 = r7
            r0.f0 = r7
            r1 = 17
            r0.Y = r1
            java.lang.Object r0 = r9.a(r11, r0)
            if (r0 != r10) goto L28a
        L289:
            return r10
        L28a:
            return r12
    }

    private final java.lang.Object x(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.g0
            hq2 r1 = (defpackage.hq2) r1
            java.lang.Object r2 = r0.Z
            ta7 r2 = (defpackage.ta7) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            r5 = 1
            if (r4 == 0) goto L29
            if (r4 != r5) goto L22
            java.lang.Object r0 = r0.d0
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            defpackage.oi2.Y(r20)     // Catch: java.lang.Exception -> L1f
            r0 = r20
            goto L2d2
        L1f:
            r0 = move-exception
            goto L2db
        L22:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L29:
            defpackage.oi2.Y(r20)
            java.util.List r4 = defpackage.qp2.a
            java.lang.String r4 = r2.a
            r4.getClass()
            java.util.List r4 = defpackage.qs6.z0(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = defpackage.ht0.v0(r4, r7)
            r6.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r8 = r4.hasNext()
            java.lang.String r9 = ""
            java.lang.String r10 = " "
            if (r8 == 0) goto Lad
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = defpackage.qs6.T0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "(?i)^\\[?TR\\]?[:\\s]+\\s*"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            r11.getClass()
            r8.getClass()
            java.util.regex.Matcher r8 = r11.matcher(r8)
            java.lang.String r8 = r8.replaceAll(r9)
            r8.getClass()
            java.lang.String r11 = "^[lI1|!:'\"\\s\\.\\,\\-\\_~>•\\[\\]]+(?=[A-ZА-Яa-zа-я])"
            java.lang.String r8 = defpackage.lb1.z(r11, r8, r9)
            java.lang.String r11 = "(?i)^([lI1|!:'\"\\.\\,\\-\\_]+\\s+)+"
            java.lang.String r8 = defpackage.lb1.z(r11, r8, r9)
            java.lang.String r11 = "^[|•>~_—\\-]+\\s*"
            java.lang.String r8 = defpackage.lb1.z(r11, r8, r9)
            java.lang.String r11 = "\\s*[|•>~_—\\-]+$"
            java.lang.String r8 = defpackage.lb1.z(r11, r8, r9)
            java.lang.String r9 = "\\s+"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            r9.getClass()
            java.util.regex.Matcher r8 = r9.matcher(r8)
            java.lang.String r8 = r8.replaceAll(r10)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.qs6.T0(r8)
            java.lang.String r8 = r8.toString()
            r6.add(r8)
            goto L46
        Lad:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = defpackage.ht0.v0(r6, r7)
            r4.<init>(r8)
            int r8 = r6.size()
            r11 = 0
            r12 = r11
        Lbc:
            if (r12 >= r8) goto L195
            java.lang.Object r13 = r6.get(r12)
            int r12 = r12 + 1
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            xh5 r14 = new xh5
            java.lang.String r15 = "([a-zA-Z])[1|!]([a-zA-Z])"
            r14.<init>(r15)
            bz1 r15 = new bz1
            r15.<init>(r7)
            java.lang.String r13 = r14.e(r13, r15)
            xh5 r14 = new xh5
            java.lang.String r15 = "(?i)\\b([a-z])[1|!]([a-z]+)\\b"
            r14.<init>(r15)
            bz1 r15 = new bz1
            r7 = 11
            r15.<init>(r7)
            java.lang.String r7 = r14.e(r13, r15)
            xh5 r13 = new xh5
            java.lang.String r14 = "(?i)\\b1([a-z]{2,})\\b"
            r13.<init>(r14)
            bz1 r14 = new bz1
            r15 = 12
            r14.<init>(r15)
            java.lang.String r7 = r13.e(r7, r14)
            xh5 r13 = new xh5
            java.lang.String r14 = "(?i)\\b([a-z]+)1\\b"
            r13.<init>(r14)
            bz1 r14 = new bz1
            r15 = 13
            r14.<init>(r15)
            java.lang.String r7 = r13.e(r7, r14)
            xh5 r13 = new xh5
            java.lang.String r14 = "([a-zA-Z])0([a-zA-Z])"
            r13.<init>(r14)
            bz1 r14 = new bz1
            r15 = 14
            r14.<init>(r15)
            java.lang.String r7 = r13.e(r7, r14)
            java.lang.String r13 = "(?i)\\by0u\\b"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            r13.getClass()
            r7.getClass()
            java.util.regex.Matcher r7 = r13.matcher(r7)
            java.lang.String r13 = "you"
            java.lang.String r7 = r7.replaceAll(r13)
            r7.getClass()
            java.lang.String r13 = "(?i)\\bc0me\\b"
            java.lang.String r14 = "come"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            java.lang.String r13 = "(?i)\\bg0\\b"
            java.lang.String r14 = "go"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            java.lang.String r13 = "(?i)\\bt0\\b"
            java.lang.String r14 = "to"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            java.lang.String r13 = "(?i)\\bn0\\b"
            java.lang.String r14 = "no"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            java.lang.String r13 = "(?i)\\bf0r\\b"
            java.lang.String r14 = "for"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            java.lang.String r13 = "(?i)\\bfr0m\\b"
            java.lang.String r14 = "from"
            java.lang.String r7 = defpackage.lb1.z(r13, r7, r14)
            xh5 r13 = new xh5
            java.lang.String r14 = "(?i)\\b5([a-z]{2,})\\b"
            r13.<init>(r14)
            bz1 r14 = new bz1
            r15 = 15
            r14.<init>(r15)
            java.lang.String r7 = r13.e(r7, r14)
            xh5 r13 = new xh5
            java.lang.String r14 = "(?i)\\b8([a-z]{2,})\\b"
            r13.<init>(r14)
            bz1 r14 = new bz1
            r15 = 16
            r14.<init>(r15)
            java.lang.String r7 = r13.e(r7, r14)
            r4.add(r7)
            r7 = 10
            goto Lbc
        L195:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r6 = r4.size()
            r7 = r11
        L19f:
            if (r7 >= r6) goto L1b4
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = defpackage.qs6.v0(r12)
            if (r12 != 0) goto L19f
            r13.add(r8)
            goto L19f
        L1b4:
            boolean r4 = r13.isEmpty()
            if (r4 == 0) goto L1bd
        L1ba:
            r12 = r9
            goto L27e
        L1bd:
            int r4 = r13.size()
            if (r4 != r5) goto L1cb
            java.lang.Object r4 = defpackage.gt0.H0(r13)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            goto L1ba
        L1cb:
            boolean r4 = r13.isEmpty()
            if (r4 == 0) goto L1d3
            goto L26f
        L1d3:
            int r4 = r13.size()
            r6 = r11
        L1d8:
            if (r6 >= r4) goto L26f
            java.lang.Object r7 = r13.get(r6)
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.length()
            r9 = 25
            r12 = 63
            r14 = 33
            r15 = 46
            if (r8 >= r9) goto L203
            boolean r8 = defpackage.qs6.m0(r7, r15)
            if (r8 != 0) goto L203
            boolean r8 = defpackage.qs6.m0(r7, r14)
            if (r8 != 0) goto L203
            boolean r7 = defpackage.qs6.m0(r7, r12)
            if (r7 != 0) goto L203
            goto L1d8
        L203:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r13.size()
        L20c:
            if (r11 >= r6) goto L261
            java.lang.Object r7 = r13.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r4.length()
            if (r8 != 0) goto L21e
            r4.append(r7)
            goto L25e
        L21e:
            java.lang.String r8 = r4.toString()
            r9 = 45
            boolean r9 = defpackage.qs6.m0(r8, r9)
            if (r9 == 0) goto L236
            int r8 = r4.length()
            int r8 = r8 - r5
            r4.setLength(r8)
            r4.append(r7)
            goto L25e
        L236:
            boolean r9 = defpackage.qs6.m0(r8, r15)
            if (r9 != 0) goto L258
            boolean r9 = defpackage.qs6.m0(r8, r14)
            if (r9 != 0) goto L258
            boolean r9 = defpackage.qs6.m0(r8, r12)
            if (r9 != 0) goto L258
            r9 = 58
            boolean r8 = defpackage.qs6.m0(r8, r9)
            if (r8 == 0) goto L251
            goto L258
        L251:
            r4.append(r10)
            r4.append(r7)
            goto L25e
        L258:
            r4.append(r10)
            r4.append(r7)
        L25e:
            int r11 = r11 + 1
            goto L20c
        L261:
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)
            java.lang.String r9 = r4.toString()
            goto L1ba
        L26f:
            r17 = 0
            r18 = 62
            java.lang.String r14 = "\n"
            r15 = 0
            r16 = 0
            java.lang.String r9 = defpackage.gt0.P0(r13, r14, r15, r16, r17, r18)
            goto L1ba
        L27e:
            java.lang.Object r4 = r0.e0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r0.f0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            java.lang.String r8 = "|"
            r7.append(r8)
            r7.append(r4)
            r7.append(r8)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.util.LinkedHashMap r6 = r1.u
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L2ad
            r2.b = r6
            goto L30b
        L2ad:
            l5 r10 = new l5     // Catch: java.lang.Exception -> L2d9
            java.lang.Object r6 = r0.h0     // Catch: java.lang.Exception -> L2d9
            r11 = r6
            f13 r11 = (defpackage.f13) r11     // Catch: java.lang.Exception -> L2d9
            java.lang.Object r6 = r0.e0     // Catch: java.lang.Exception -> L2d9
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> L2d9
            java.lang.Object r6 = r0.f0     // Catch: java.lang.Exception -> L2d9
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> L2d9
            r15 = 0
            r16 = 15
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L2d9
            r0.d0 = r4     // Catch: java.lang.Exception -> L2d9
            r0.Y = r5     // Catch: java.lang.Exception -> L2d9
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = defpackage.xk2.N(r5, r10, r0)     // Catch: java.lang.Exception -> L2d9
            if (r0 != r3) goto L2d1
            return r3
        L2d1:
            r3 = r4
        L2d2:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L2fe
            java.lang.String r0 = r2.a     // Catch: java.lang.Exception -> L1f
            goto L2fe
        L2d9:
            r0 = move-exception
            r3 = r4
        L2db:
            java.lang.String r4 = r2.a
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Translation error for block '"
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = "': "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "GameTranslatorManager"
            android.util.Log.w(r5, r4, r0)
            java.lang.String r0 = r2.a
        L2fe:
            java.util.LinkedHashMap r1 = r1.u
            r1.put(r3, r0)
            r2.getClass()
            r0.getClass()
            r2.b = r0
        L30b:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    private final java.lang.Object z(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.g0
            wq6 r0 = (defpackage.wq6) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L2a
            if (r2 != r3) goto L24
            java.lang.Object r0 = r9.e0
            uq6 r0 = (defpackage.uq6) r0
            java.lang.Object r1 = r9.d0
            wq6 r1 = (defpackage.wq6) r1
            java.lang.Object r9 = r9.Z
            fb4 r9 = (defpackage.fb4) r9
            defpackage.oi2.Y(r10)
            r10 = r0
            r0 = r1
            goto L96
        L24:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L2a:
            java.lang.Object r2 = r9.f0
            wq6 r2 = (defpackage.wq6) r2
            java.lang.Object r5 = r9.e0
            li7 r5 = (defpackage.li7) r5
            java.lang.Object r6 = r9.d0
            uq6 r6 = (defpackage.uq6) r6
            java.lang.Object r7 = r9.Z
            zg5 r7 = (defpackage.zg5) r7
            defpackage.oi2.Y(r10)
            goto L6b
        L3e:
            defpackage.oi2.Y(r10)
            zg5 r7 = new zg5
            r7.<init>()
            r7.A = r5
            li7 r10 = r0.d
            if (r10 == 0) goto L7d
            java.lang.Object r2 = r9.h0
            li7 r2 = (defpackage.li7) r2
            boolean r2 = defpackage.nb3.k(r2, r10)
            if (r2 != 0) goto L7d
            r9.Z = r7
            r9.d0 = r4
            r9.e0 = r10
            r9.f0 = r0
            r9.Y = r5
            java.lang.Object r2 = defpackage.wq6.a(r0, r4, r10, r9)
            if (r2 != r1) goto L67
            goto L93
        L67:
            r5 = r10
            r10 = r2
            r6 = r4
            r2 = r0
        L6b:
            jg1 r10 = (defpackage.jg1) r10
            r2.getClass()
            t00 r8 = new t00
            r8.<init>(r2, r10, r6, r5)
            ed3 r10 = (defpackage.ed3) r10
            r10.a0(r8)
            r10 = 0
            r7.A = r10
        L7d:
            boolean r10 = r7.A
            if (r10 == 0) goto Lc2
            hb4 r10 = r0.c
            r9.Z = r10
            r9.d0 = r0
            r9.e0 = r4
            r9.f0 = r4
            r9.Y = r3
            java.lang.Object r9 = r10.e(r9)
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            r9 = r10
            r10 = r4
        L96:
            java.util.LinkedList r0 = r0.e     // Catch: java.lang.Throwable -> Lbd
            r0.add(r10)     // Catch: java.lang.Throwable -> Lbd
            r9.h(r4)
            java.lang.String r9 = "CXCP"
            boolean r10 = defpackage.kj2.F(r9)
            if (r10 == 0) goto Lc2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "StillCaptureRequestControl: failed to submit "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r0 = ", will be retried with a future UseCaseCamera"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r9, r10)
            goto Lc2
        Lbd:
            r10 = move-exception
            r9.h(r4)
            throw r10
        Lc2:
            jg7 r9 = defpackage.jg7.a
            return r9
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L84;
                case 2: goto L79;
                case 3: goto L6e;
                case 4: goto L63;
                case 5: goto L58;
                case 6: goto L4d;
                case 7: goto L42;
                case 8: goto L37;
                case 9: goto L2c;
                case 10: goto L21;
                case 11: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L42:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L4d:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L58:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L63:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L6e:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L79:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L84:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8f:
            r41 r2 = r2.q(r4, r3)
            hn r2 = (defpackage.hn) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.X
            java.lang.Object r1 = r11.h0
            switch(r0) {
                case 0: goto L12e;
                case 1: goto L112;
                case 2: goto L104;
                case 3: goto Lf1;
                case 4: goto Lcd;
                case 5: goto Lbf;
                case 6: goto La0;
                case 7: goto L7e;
                case 8: goto L63;
                case 9: goto L55;
                case 10: goto L4c;
                case 11: goto L29;
                default: goto L7;
            }
        L7:
            hn r2 = new hn
            java.lang.Object r0 = r11.d0
            r3 = r0
            tc6 r3 = (defpackage.tc6) r3
            java.lang.Object r0 = r11.e0
            r4 = r0
            jj7 r4 = (defpackage.jj7) r4
            java.lang.Object r0 = r11.f0
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r11 = r11.g0
            r6 = r11
            java.util.Map r6 = (java.util.Map) r6
            r7 = r1
            sf0 r7 = (defpackage.sf0) r7
            r9 = 12
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2.Z = r13
            return r2
        L29:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.d0
            r4 = r12
            zy4 r4 = (defpackage.zy4) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            qn2 r5 = (defpackage.qn2) r5
            java.lang.Object r12 = r11.f0
            r6 = r12
            qn2 r6 = (defpackage.qn2) r6
            java.lang.Object r11 = r11.g0
            r7 = r11
            fo2 r7 = (defpackage.fo2) r7
            qn2 r1 = (defpackage.qn2) r1
            r10 = 11
            r9 = r8
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.Z = r13
            return r3
        L4c:
            r8 = r12
            hn r11 = new hn
            wq6 r1 = (defpackage.wq6) r1
            r11.<init>(r1, r8)
            return r11
        L55:
            r8 = r12
            hn r12 = new hn
            java.lang.Object r11 = r11.g0
            wq6 r11 = (defpackage.wq6) r11
            li7 r1 = (defpackage.li7) r1
            r13 = 0
            r12.<init>(r11, r1, r13, r8)
            return r12
        L63:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.e0
            r4 = r12
            ut3 r4 = (defpackage.ut3) r4
            java.lang.Object r12 = r11.f0
            r5 = r12
            tt3 r5 = (defpackage.tt3) r5
            java.lang.Object r11 = r11.g0
            r6 = r11
            w61 r6 = (defpackage.w61) r6
            r7 = r1
            eo2 r7 = (defpackage.eo2) r7
            r9 = 8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L7e:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.d0
            r4 = r12
            dh5 r4 = (defpackage.dh5) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.f0
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.g0
            r7 = r11
            hq2 r7 = (defpackage.hq2) r7
            f13 r1 = (defpackage.f13) r1
            r10 = 7
            r9 = r8
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.Z = r13
            return r3
        La0:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.Z
            r4 = r12
            ta7 r4 = (defpackage.ta7) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.f0
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.g0
            r7 = r11
            hq2 r7 = (defpackage.hq2) r7
            f13 r1 = (defpackage.f13) r1
            r9 = r8
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        Lbf:
            r8 = r12
            hn r12 = new hn
            java.lang.Object r11 = r11.g0
            sz1 r11 = (defpackage.sz1) r11
            mc5 r1 = (defpackage.mc5) r1
            r13 = 5
            r12.<init>(r11, r1, r8, r13)
            return r12
        Lcd:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.d0
            r4 = r12
            dh5 r4 = (defpackage.dh5) r4
            java.lang.Object r12 = r11.Z
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r11.f0
            r7 = r12
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r11.g0
            java.lang.String r11 = (java.lang.String) r11
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r10 = r8
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        Lf1:
            r8 = r12
            hn r12 = new hn
            java.lang.Object r0 = r11.f0
            nx3 r0 = (defpackage.nx3) r0
            java.lang.Object r11 = r11.g0
            ww2 r11 = (defpackage.ww2) r11
            yw7 r1 = (defpackage.yw7) r1
            r12.<init>(r0, r11, r1, r8)
            r12.Z = r13
            return r12
        L104:
            r8 = r12
            hn r12 = new hn
            java.lang.Object r11 = r11.g0
            pq5 r11 = (defpackage.pq5) r11
            e70 r1 = (defpackage.e70) r1
            r13 = 2
            r12.<init>(r11, r1, r8, r13)
            return r12
        L112:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.e0
            r4 = r12
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r12 = r11.f0
            r5 = r12
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r11 = r11.g0
            r6 = r11
            m20 r6 = (defpackage.m20) r6
            r7 = r1
            zn3 r7 = (defpackage.zn3) r7
            r9 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r13
            return r3
        L12e:
            r8 = r12
            hn r3 = new hn
            java.lang.Object r12 = r11.e0
            r4 = r12
            ul0 r4 = (defpackage.ul0) r4
            java.lang.Object r12 = r11.f0
            r5 = r12
            gn r5 = (defpackage.gn) r5
            java.lang.Object r11 = r11.g0
            r6 = r11
            qa4 r6 = (defpackage.qa4) r6
            r7 = r1
            qa4 r7 = (defpackage.qa4) r7
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r13
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r32) {
            r31 = this;
            r1 = r31
            int r0 = r1.X
            r2 = 2
            r3 = 10
            r4 = 3
            r5 = 0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L8ad;
                case 1: goto L78c;
                case 2: goto L667;
                case 3: goto L595;
                case 4: goto L2fb;
                case 5: goto L2f6;
                case 6: goto L2f1;
                case 7: goto L281;
                case 8: goto L1d7;
                case 9: goto L1d2;
                case 10: goto L1cd;
                case 11: goto L1c8;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L2a
            if (r2 != r6) goto L23
            java.lang.Object r0 = r1.Z
            w61 r0 = (defpackage.w61) r0
            defpackage.oi2.Y(r32)     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            r4 = r32
            goto L5b
        L20:
            r0 = move-exception
            goto L1a6
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L1c7
        L2a:
            defpackage.oi2.Y(r32)
            java.lang.Object r2 = r1.Z
            w61 r2 = (defpackage.w61) r2
            java.lang.Object r4 = r1.d0
            tc6 r4 = (defpackage.tc6) r4
            ex6 r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            pc6 r4 = (defpackage.pc6) r4
            boolean r4 = r4.c()
            if (r4 == 0) goto L1c2
            java.lang.Object r4 = r1.e0     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            jj7 r4 = (defpackage.jj7) r4     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            java.lang.Object r5 = r1.f0     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            java.util.List r5 = (java.util.List) r5     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            r1.Z = r2     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            r1.Y = r6     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            r8 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r4 = defpackage.jj7.a(r4, r5, r8, r1)     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            if (r4 != r0) goto L5a
            r7 = r0
            goto L1c7
        L5a:
            r0 = r2
        L5b:
            java.util.List r4 = (java.util.List) r4     // Catch: defpackage.hg1 -> L20 defpackage.c67 -> L196
            boolean r2 = defpackage.g04.H(r0)
            if (r2 == 0) goto L16e
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L6b
            goto L16e
        L6b:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L149
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L149
            java.lang.Object r0 = r1.e0
            jj7 r0 = (defpackage.jj7) r0
            java.lang.Object r2 = r0.e
            java.lang.Object r5 = r1.f0
            java.util.List r5 = (java.util.List) r5
            monitor-enter(r2)
            int r3 = defpackage.ht0.v0(r5, r3)     // Catch: java.lang.Throwable -> Lb5
            int r3 = defpackage.c14.k0(r3)     // Catch: java.lang.Throwable -> Lb5
            r6 = 16
            if (r3 >= r6) goto L8f
            r3 = r6
        L8f:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            java.util.Iterator r3 = r5.iterator()     // Catch: java.lang.Throwable -> Lb5
        L98:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto Lc0
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> Lb5
            r8 = r7
            ig1 r8 = (defpackage.ig1) r8     // Catch: java.lang.Throwable -> Lb5
            int r8 = r5.indexOf(r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Throwable -> Lb5
            if (r8 == 0) goto Lb8
            android.view.Surface r8 = (android.view.Surface) r8     // Catch: java.lang.Throwable -> Lb5
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> Lb5
            goto L98
        Lb5:
            r0 = move-exception
            goto L147
        Lb8:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            throw r1     // Catch: java.lang.Throwable -> Lb5
        Lc0:
            r0.h = r6     // Catch: java.lang.Throwable -> Lb5
            defpackage.jj7.b(r0)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r2)
            java.lang.Object r0 = r1.g0
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r1.f0
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.h0
            sf0 r3 = (defpackage.sf0) r3
            java.lang.Object r1 = r1.e0
            jj7 r1 = (defpackage.jj7) r1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lde:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L136
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            kr6 r6 = (defpackage.kr6) r6
            int r6 = r6.a
            java.lang.Object r7 = r5.getKey()
            int r7 = r2.indexOf(r7)
            java.lang.Object r7 = r4.get(r7)
            android.view.Surface r7 = (android.view.Surface) r7
            java.lang.String r8 = "CXCP"
            boolean r8 = defpackage.kj2.F(r8)
            if (r8 == 0) goto L127
            java.lang.String r8 = "CXCP"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Configured "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r10 = " for "
            r9.append(r10)
            java.lang.String r10 = defpackage.kr6.a(r6)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
        L127:
            r3.k(r6, r7)
            c43 r7 = r1.c
            java.lang.Object r5 = r5.getKey()
            ig1 r5 = (defpackage.ig1) r5
            r7.g(r6, r5, r3)
            goto Lde
        L136:
            boolean r0 = defpackage.kj2.H()
            if (r0 == 0) goto L143
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Surface setup complete"
            android.util.Log.i(r0, r1)
        L143:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L1c7
        L147:
            monitor-exit(r2)
            throw r0
        L149:
            boolean r0 = defpackage.kj2.L()
            if (r0 == 0) goto L156
            java.lang.String r0 = "CXCP"
            java.lang.String r2 = "Surface setup failed: Some Surfaces are invalid"
            android.util.Log.w(r0, r2)
        L156:
            java.lang.Object r0 = r1.d0
            tc6 r0 = (defpackage.tc6) r0
            java.lang.Object r1 = r1.f0
            java.util.List r1 = (java.util.List) r1
            int r2 = r4.indexOf(r7)
            java.lang.Object r1 = r1.get(r2)
            ig1 r1 = (defpackage.ig1) r1
            r0.a(r1)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L1c7
        L16e:
            boolean r1 = defpackage.kj2.H()
            if (r1 == 0) goto L193
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get Surfaces: isActive="
            r2.<init>(r3)
            boolean r0 = defpackage.g04.H(r0)
            r2.append(r0)
            java.lang.String r0 = ", surfaces="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            android.util.Log.i(r1, r0)
        L193:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L1c7
        L196:
            boolean r0 = defpackage.kj2.L()
            if (r0 == 0) goto L1a3
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Failed to get Surfaces within 5000 ms"
            android.util.Log.w(r0, r1)
        L1a3:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L1c7
        L1a6:
            boolean r2 = defpackage.kj2.L()
            if (r2 == 0) goto L1b3
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "Failed to get Surfaces: Surfaces closed"
            android.util.Log.w(r2, r3, r0)
        L1b3:
            java.lang.Object r1 = r1.d0
            tc6 r1 = (defpackage.tc6) r1
            ig1 r0 = r0.A
            r0.getClass()
            r1.a(r0)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L1c7
        L1c2:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
        L1c7:
            return r7
        L1c8:
            java.lang.Object r0 = r31.B(r32)
            return r0
        L1cd:
            java.lang.Object r0 = r31.A(r32)
            return r0
        L1d2:
            java.lang.Object r0 = r31.z(r32)
            return r0
        L1d7:
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r2 = r1.e0
            ut3 r2 = (defpackage.ut3) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.Y
            if (r4 == 0) goto L1fb
            if (r4 != r6) goto L1f4
            java.lang.Object r3 = r1.Z
            dh5 r3 = (defpackage.dh5) r3
            java.lang.Object r1 = r1.d0
            dh5 r1 = (defpackage.dh5) r1
            defpackage.oi2.Y(r32)     // Catch: java.lang.Throwable -> L1f1
            goto L257
        L1f1:
            r0 = move-exception
            goto L26e
        L1f4:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L26a
        L1fb:
            defpackage.oi2.Y(r32)
            tt3 r4 = r2.b()
            tt3 r5 = defpackage.tt3.DESTROYED
            if (r4 != r5) goto L207
            goto L269
        L207:
            dh5 r10 = new dh5
            r10.<init>()
            dh5 r4 = new dh5
            r4.<init>()
            java.lang.Object r5 = r1.f0     // Catch: java.lang.Throwable -> L26b
            tt3 r5 = (defpackage.tt3) r5     // Catch: java.lang.Throwable -> L26b
            java.lang.Object r8 = r1.g0     // Catch: java.lang.Throwable -> L26b
            r11 = r8
            w61 r11 = (defpackage.w61) r11     // Catch: java.lang.Throwable -> L26b
            java.lang.Object r8 = r1.h0     // Catch: java.lang.Throwable -> L26b
            r15 = r8
            eo2 r15 = (defpackage.eo2) r15     // Catch: java.lang.Throwable -> L26b
            r1.d0 = r10     // Catch: java.lang.Throwable -> L26b
            r1.Z = r4     // Catch: java.lang.Throwable -> L26b
            r1.Y = r6     // Catch: java.lang.Throwable -> L26b
            rj0 r13 = new rj0     // Catch: java.lang.Throwable -> L26b
            r41 r1 = defpackage.np2.V(r1)     // Catch: java.lang.Throwable -> L26b
            r13.<init>(r6, r1)     // Catch: java.lang.Throwable -> L26b
            r13.v()     // Catch: java.lang.Throwable -> L26b
            qt3 r1 = defpackage.st3.Companion     // Catch: java.lang.Throwable -> L26b
            r1.getClass()     // Catch: java.lang.Throwable -> L26b
            st3 r9 = defpackage.qt3.c(r5)     // Catch: java.lang.Throwable -> L26b
            st3 r12 = defpackage.qt3.a(r5)     // Catch: java.lang.Throwable -> L26b
            hb4 r14 = new hb4     // Catch: java.lang.Throwable -> L26b
            r14.<init>()     // Catch: java.lang.Throwable -> L26b
            dk5 r8 = new dk5     // Catch: java.lang.Throwable -> L26b
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L26b
            r4.A = r8     // Catch: java.lang.Throwable -> L26b
            r2.a(r8)     // Catch: java.lang.Throwable -> L26b
            java.lang.Object r1 = r13.s()     // Catch: java.lang.Throwable -> L26b
            if (r1 != r3) goto L255
            r7 = r3
            goto L26a
        L255:
            r3 = r4
            r1 = r10
        L257:
            java.lang.Object r1 = r1.A
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto L260
            r1.h(r7)
        L260:
            java.lang.Object r1 = r3.A
            fu3 r1 = (defpackage.fu3) r1
            if (r1 == 0) goto L269
            r2.c(r1)
        L269:
            r7 = r0
        L26a:
            return r7
        L26b:
            r0 = move-exception
            r3 = r4
            r1 = r10
        L26e:
            java.lang.Object r1 = r1.A
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto L277
            r1.h(r7)
        L277:
            java.lang.Object r1 = r3.A
            fu3 r1 = (defpackage.fu3) r1
            if (r1 == 0) goto L280
            r2.c(r1)
        L280:
            throw r0
        L281:
            java.lang.Object r0 = r1.Z
            w61 r0 = (defpackage.w61) r0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r1.Y
            if (r5 == 0) goto L29a
            if (r5 != r6) goto L293
            defpackage.oi2.Y(r32)
            r0 = r32
            goto L2f0
        L293:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto L2f0
        L29a:
            defpackage.oi2.Y(r32)
            java.lang.Object r5 = r1.d0
            dh5 r5 = (defpackage.dh5) r5
            java.lang.Object r5 = r5.A
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r8 = r1.e0
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r1.f0
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r8 = r1.g0
            r13 = r8
            hq2 r13 = (defpackage.hq2) r13
            java.lang.Object r8 = r1.h0
            r14 = r8
            f13 r14 = (defpackage.f13) r14
            java.util.ArrayList r8 = new java.util.ArrayList
            int r3 = defpackage.ht0.v0(r5, r3)
            r8.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
        L2c6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2e5
            java.lang.Object r5 = r3.next()
            r10 = r5
            ta7 r10 = (defpackage.ta7) r10
            xe1 r5 = defpackage.xk1.a
            de1 r5 = defpackage.de1.L
            hn r9 = new hn
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            kg1 r5 = defpackage.hv.i(r0, r5, r7, r9, r2)
            r8.add(r5)
            goto L2c6
        L2e5:
            r1.Z = r7
            r1.Y = r6
            java.lang.Object r0 = defpackage.n16.m(r8, r1)
            if (r0 != r4) goto L2f0
            r0 = r4
        L2f0:
            return r0
        L2f1:
            java.lang.Object r0 = r31.x(r32)
            return r0
        L2f6:
            java.lang.Object r0 = r31.v(r32)
            return r0
        L2fb:
            java.lang.String r0 = "-"
            java.lang.String r2 = ""
            java.lang.String r3 = "&Sec-MS-GEC-Version=1-130.0.2849.68"
            java.lang.String r4 = "wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1?TrustedClientToken=6A5AA1D4EAFF4E9FB37E23D68491D6F4&ConnectionId="
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.Y
            if (r9 == 0) goto L319
            if (r9 != r6) goto L312
            defpackage.oi2.Y(r32)
            r7 = r32
            goto L594
        L312:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L594
        L319:
            defpackage.oi2.Y(r32)
            tu0 r18 = new tu0
            r18.<init>()
            java.io.ByteArrayOutputStream r17 = new java.io.ByteArrayOutputStream
            r17.<init>()
            java.util.UUID r9 = java.util.UUID.randomUUID()
            java.lang.String r9 = r9.toString()
            r9.getClass()
            java.lang.String r9 = defpackage.xs6.e0(r9, r0, r2)
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            r10.getClass()
            java.lang.String r13 = defpackage.xs6.e0(r10, r0, r2)
            qr1 r0 = defpackage.qr1.a
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b6
            r14 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r14
            r14 = 11644473600(0x2b6109100, double:5.7531343697E-314)
            long r10 = r10 + r14
            r14 = 300(0x12c, double:1.48E-321)
            long r14 = r10 % r14
            long r10 = r10 - r14
            r14 = 10000000(0x989680, double:4.9406565E-317)
            long r10 = r10 * r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b6
            r0.<init>()     // Catch: java.lang.Throwable -> L3b6
            r0.append(r10)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r10 = "6A5AA1D4EAFF4E9FB37E23D68491D6F4"
            r0.append(r10)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r10 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r10)     // Catch: java.lang.Throwable -> L3b6
            java.nio.charset.Charset r11 = defpackage.qm0.d     // Catch: java.lang.Throwable -> L3b6
            byte[] r0 = r0.getBytes(r11)     // Catch: java.lang.Throwable -> L3b6
            r0.getClass()     // Catch: java.lang.Throwable -> L3b6
            byte[] r0 = r10.digest(r0)     // Catch: java.lang.Throwable -> L3b6
            r0.getClass()     // Catch: java.lang.Throwable -> L3b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b6
            r10.<init>()     // Catch: java.lang.Throwable -> L3b6
            r10.append(r2)     // Catch: java.lang.Throwable -> L3b6
            int r11 = r0.length     // Catch: java.lang.Throwable -> L3b6
            r12 = r5
        L38d:
            if (r5 >= r11) goto L3af
            r14 = r0[r5]     // Catch: java.lang.Throwable -> L3b6
            int r12 = r12 + r6
            if (r12 <= r6) goto L397
            r10.append(r2)     // Catch: java.lang.Throwable -> L3b6
        L397:
            java.lang.Byte r14 = java.lang.Byte.valueOf(r14)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r15 = "%02X"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L3b6
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r6)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r14 = java.lang.String.format(r15, r14)     // Catch: java.lang.Throwable -> L3b6
            r10.append(r14)     // Catch: java.lang.Throwable -> L3b6
            int r5 = r5 + 1
            goto L38d
        L3af:
            r10.append(r2)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L3b6
        L3b6:
            int r0 = r2.length()
            if (r0 <= 0) goto L3c3
            java.lang.String r0 = "&Sec-MS-GEC="
            java.lang.String r0 = defpackage.lb1.n(r4, r9, r0, r2, r3)
            goto L3c7
        L3c3:
            java.lang.String r0 = defpackage.lb1.A(r4, r9, r3)
        L3c7:
            s9 r2 = new s9
            r3 = 13
            r2.<init>(r3)
            r2.I(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36 Edg/130.0.0.0"
            r2.B(r0, r3)
            java.lang.String r0 = "Origin"
            java.lang.String r3 = "chrome-extension://jdiccldimpdaibmpdkjnbmckianbfold"
            r2.B(r0, r3)
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r3 = "gzip, deflate, br"
            r2.B(r0, r3)
            java.lang.String r0 = "Accept-Language"
            java.lang.String r3 = "en-US,en;q=0.9,ru;q=0.8"
            r2.B(r0, r3)
            pa r0 = new pa
            r0.<init>(r2)
            zp3 r22 = new zp3
            java.lang.Object r2 = r1.d0
            r10 = r2
            dh5 r10 = (defpackage.dh5) r10
            java.lang.Object r2 = r1.Z
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r1.e0
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r1.f0
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r1.g0
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r2 = r1.h0
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r9 = r22
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r18
            xk4 r3 = defpackage.qr1.c
            r3.getClass()
            af5 r19 = new af5
            qz6 r4 = r3.C
            java.util.Random r23 = new java.util.Random
            r23.<init>()
            long r9 = r3.A
            int r5 = r3.z
            long r11 = (long) r5
            r24 = 0
            r21 = r0
            r20 = r4
            r26 = r9
            r28 = r11
            r19.<init>(r20, r21, r22, r23, r24, r26, r28)
            r4 = r19
            java.lang.String r9 = "Upgrade"
            java.lang.String r10 = "Sec-WebSocket-Extensions"
            java.lang.Object r11 = r0.R
            yw2 r11 = (defpackage.yw2) r11
            java.lang.String r11 = r11.a(r10)
            if (r11 == 0) goto L457
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r3 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r0.<init>(r3)
            r3 = 6
            defpackage.af5.c(r4, r0, r3)
            goto L57b
        L457:
            wk4 r11 = new wk4
            r11.<init>()
            eb r12 = r3.a
            r11.a = r12
            os0 r12 = r3.D
            r11.b = r12
            java.util.ArrayList r12 = r11.c
            java.util.List r13 = r3.b
            defpackage.gt0.A0(r12, r13)
            java.util.ArrayList r12 = r11.d
            java.util.List r13 = r3.c
            defpackage.gt0.A0(r12, r13)
            fa6 r12 = r3.d
            r11.e = r12
            boolean r12 = r3.e
            r11.f = r12
            boolean r12 = r3.f
            r11.g = r12
            xd5 r12 = r3.g
            r11.h = r12
            boolean r12 = r3.h
            r11.i = r12
            boolean r12 = r3.i
            r11.j = r12
            vs0 r12 = r3.j
            r11.k = r12
            la0 r12 = r3.k
            r11.l = r12
            d90 r12 = r3.l
            r11.m = r12
            java.net.ProxySelector r12 = r3.m
            r11.n = r12
            xd5 r12 = r3.n
            r11.o = r12
            javax.net.SocketFactory r12 = r3.o
            r11.p = r12
            javax.net.ssl.SSLSocketFactory r12 = r3.p
            r11.q = r12
            javax.net.ssl.X509TrustManager r12 = r3.q
            r11.r = r12
            java.util.List r12 = r3.r
            r11.s = r12
            java.util.List r12 = r3.s
            r11.t = r12
            sk4 r12 = r3.t
            r11.u = r12
            il0 r12 = r3.u
            r11.v = r12
            q60 r12 = r3.v
            r11.w = r12
            int r12 = r3.w
            r11.x = r12
            int r12 = r3.x
            r11.y = r12
            int r12 = r3.y
            r11.z = r12
            r11.A = r5
            long r12 = r3.A
            r11.B = r12
            il5 r5 = r3.B
            r11.C = r5
            qz6 r3 = r3.C
            r11.D = r3
            java.util.TimeZone r3 = defpackage.az7.a
            fa6 r3 = new fa6
            r5 = 23
            r3.<init>(r5)
            r11.e = r3
            java.util.List r3 = defpackage.af5.x
            r3.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            k55 r3 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            boolean r12 = r5.contains(r3)
            if (r12 != 0) goto L505
            k55 r12 = defpackage.k55.HTTP_1_1
            boolean r12 = r5.contains(r12)
            if (r12 == 0) goto L4fe
            goto L505
        L4fe:
            java.lang.String r0 = "protocols must contain h2_prior_knowledge or http/1.1: "
            defpackage.u34.w(r5, r0)
            goto L594
        L505:
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L519
            int r3 = r5.size()
            if (r3 > r6) goto L512
            goto L519
        L512:
            java.lang.String r0 = "protocols containing h2_prior_knowledge cannot use other protocols: "
            defpackage.u34.w(r5, r0)
            goto L594
        L519:
            k55 r3 = defpackage.k55.HTTP_1_0
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L58f
            boolean r3 = r5.contains(r7)
            if (r3 != 0) goto L589
            k55 r3 = defpackage.k55.SPDY_3
            r5.remove(r3)
            java.util.List r3 = r11.t
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L536
            r11.C = r7
        L536:
            java.util.List r3 = java.util.Collections.unmodifiableList(r5)
            r3.getClass()
            r11.t = r3
            xk4 r3 = new xk4
            r3.<init>(r11)
            s9 r0 = r0.o()
            java.lang.String r5 = "websocket"
            r0.B(r9, r5)
            java.lang.String r5 = "Connection"
            r0.B(r5, r9)
            java.lang.String r5 = "Sec-WebSocket-Key"
            java.lang.String r7 = r4.g
            r0.B(r5, r7)
            java.lang.String r5 = "Sec-WebSocket-Version"
            java.lang.String r7 = "13"
            r0.B(r5, r7)
            java.lang.String r5 = "permessage-deflate"
            r0.B(r10, r5)
            pa r5 = new pa
            r5.<init>(r0)
            je5 r0 = new je5
            r0.<init>(r3, r5, r6)
            r4.h = r0
            ap3 r3 = new ap3
            r7 = 21
            r3.<init>(r7, r4, r5)
            r0.d(r3)
        L57b:
            r1.Y = r6
            java.lang.Object r0 = r2.q(r1)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r8) goto L587
            r7 = r8
            goto L594
        L587:
            r7 = r0
            goto L594
        L589:
            java.lang.String r0 = "protocols must not contain null"
            defpackage.i.h(r0)
            goto L594
        L58f:
            java.lang.String r0 = "protocols must not contain http/1.0: "
            defpackage.u34.w(r5, r0)
        L594:
            return r7
        L595:
            java.lang.Object r0 = r1.f0
            r2 = r0
            nx3 r2 = (defpackage.nx3) r2
            java.lang.String r3 = "Delegated worker "
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r1.Y
            r9 = -256(0xffffffffffffff00, float:NaN)
            if (r8 == 0) goto L5c7
            if (r8 != r6) goto L5c1
            java.lang.Object r0 = r1.e0
            r4 = r0
            ap6 r4 = (defpackage.ap6) r4
            java.lang.Object r0 = r1.d0
            r8 = r0
            gx3 r8 = (defpackage.gx3) r8
            java.lang.Object r0 = r1.Z
            r1 = r0
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            defpackage.oi2.Y(r32)     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L5be
            r13 = r1
            r1 = r32
            goto L5fc
        L5bc:
            r0 = move-exception
            goto L60a
        L5be:
            r0 = move-exception
            goto L62b
        L5c1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L602
        L5c7:
            defpackage.oi2.Y(r32)
            java.lang.Object r8 = r1.Z
            w61 r8 = (defpackage.w61) r8
            java.util.concurrent.atomic.AtomicInteger r13 = new java.util.concurrent.atomic.AtomicInteger
            r13.<init>(r9)
            tb0 r14 = r2.d()
            l5 r10 = new l5
            java.lang.Object r11 = r1.g0
            ww2 r11 = (defpackage.ww2) r11
            java.lang.Object r12 = r1.h0
            yw7 r12 = (defpackage.yw7) r12
            r15 = 0
            r16 = 6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            ap6 r4 = defpackage.hv.L(r8, r7, r7, r10, r4)
            r1.Z = r13     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L606
            r1.d0 = r14     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L606
            r1.e0 = r4     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L606
            r1.Y = r6     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L606
            java.lang.Object r1 = defpackage.gi2.m(r14, r1)     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L606
            if (r1 != r0) goto L5fb
            r7 = r0
            goto L602
        L5fb:
            r8 = r14
        L5fc:
            mx3 r1 = (defpackage.mx3) r1     // Catch: java.lang.Throwable -> L5bc java.util.concurrent.CancellationException -> L603
            r4.h(r7)
            r7 = r1
        L602:
            return r7
        L603:
            r0 = move-exception
            r1 = r13
            goto L62b
        L606:
            r0 = move-exception
            r1 = r13
            r8 = r14
            goto L62b
        L60a:
            java.lang.String r1 = defpackage.i21.a     // Catch: java.lang.Throwable -> L629
            ga0 r5 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L629
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L629
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L629
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L629
            r6.append(r2)     // Catch: java.lang.Throwable -> L629
            java.lang.String r2 = " threw exception in startWork."
            r6.append(r2)     // Catch: java.lang.Throwable -> L629
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L629
            r5.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L629
            throw r0     // Catch: java.lang.Throwable -> L629
        L629:
            r0 = move-exception
            goto L663
        L62b:
            java.lang.String r10 = defpackage.i21.a     // Catch: java.lang.Throwable -> L629
            ga0 r11 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L629
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L629
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L629
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L629
            r12.append(r2)     // Catch: java.lang.Throwable -> L629
            java.lang.String r2 = " was cancelled"
            r12.append(r2)     // Catch: java.lang.Throwable -> L629
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L629
            r11.c(r10, r2, r0)     // Catch: java.lang.Throwable -> L629
            int r2 = r1.get()     // Catch: java.lang.Throwable -> L629
            if (r2 == r9) goto L650
            r5 = r6
        L650:
            boolean r2 = r8.isCancelled()     // Catch: java.lang.Throwable -> L629
            if (r2 == 0) goto L662
            if (r5 == 0) goto L662
            c21 r0 = new c21     // Catch: java.lang.Throwable -> L629
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L629
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L629
            throw r0     // Catch: java.lang.Throwable -> L629
        L662:
            throw r0     // Catch: java.lang.Throwable -> L629
        L663:
            r4.h(r7)
            throw r0
        L667:
            java.lang.Object r0 = r1.h0
            e70 r0 = (defpackage.e70) r0
            java.lang.Object r2 = r1.g0
            pq5 r2 = (defpackage.pq5) r2
            java.lang.String r3 = "-"
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.Y
            if (r9 == 0) goto L695
            if (r9 != r6) goto L68e
            java.lang.Object r0 = r1.f0
            r2 = r0
            pq5 r2 = (defpackage.pq5) r2
            java.lang.Object r0 = r1.e0
            e70 r0 = (defpackage.e70) r0
            java.lang.Object r8 = r1.Z
            hb4 r8 = (defpackage.hb4) r8
            java.lang.Object r1 = r1.d0
            java.lang.String r1 = (java.lang.String) r1
            defpackage.oi2.Y(r32)
            goto L6cd
        L68e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L787
        L695:
            defpackage.oi2.Y(r32)
            android.net.Uri r9 = r2.d
            java.lang.String r9 = r9.toString()
            r9.getClass()
            java.util.concurrent.ConcurrentHashMap r10 = r0.e
            java.lang.Object r10 = r10.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L6b6
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L6b3
            goto L787
        L6b3:
            r7 = r10
            goto L787
        L6b6:
            hb4 r10 = r0.d
            r1.d0 = r9
            r1.Z = r10
            r1.e0 = r0
            r1.f0 = r2
            r1.Y = r6
            java.lang.Object r1 = r10.e(r1)
            if (r1 != r8) goto L6cb
            r7 = r8
            goto L787
        L6cb:
            r1 = r9
            r8 = r10
        L6cd:
            java.util.concurrent.ConcurrentHashMap r9 = r0.e     // Catch: java.lang.Throwable -> L6e2
            java.lang.Object r10 = r9.get(r1)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L6e2
            if (r10 == 0) goto L6e5
            boolean r0 = r10.equals(r3)     // Catch: java.lang.Throwable -> L6e2
            if (r0 == 0) goto L6de
        L6dd:
            r10 = r7
        L6de:
            r8.h(r7)
            goto L6b3
        L6e2:
            r0 = move-exception
            goto L788
        L6e5:
            boolean r10 = r0.g     // Catch: java.lang.Throwable -> L6e2
            if (r10 != 0) goto L6ec
            defpackage.e70.c(r0)     // Catch: java.lang.Throwable -> L6e2
        L6ec:
            java.lang.Object r10 = r9.get(r1)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L6e2
            if (r10 == 0) goto L6fb
            boolean r0 = r10.equals(r3)     // Catch: java.lang.Throwable -> L6e2
            if (r0 == 0) goto L6de
            goto L6dd
        L6fb:
            java.util.List r10 = defpackage.e70.b(r0)     // Catch: java.lang.Throwable -> L6e2
            if (r10 != 0) goto L706
            r8.h(r7)
            goto L787
        L706:
            kw3 r11 = defpackage.hf.I()     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r12 = r2.a     // Catch: java.lang.Throwable -> L6e2
            boolean r13 = defpackage.qs6.v0(r12)     // Catch: java.lang.Throwable -> L6e2
            if (r13 != 0) goto L715
            r11.add(r12)     // Catch: java.lang.Throwable -> L6e2
        L715:
            java.lang.String r13 = r2.c     // Catch: java.lang.Throwable -> L6e2
            r14 = 46
            java.lang.String r13 = defpackage.qs6.R0(r14, r13, r13)     // Catch: java.lang.Throwable -> L6e2
            boolean r14 = defpackage.qs6.v0(r13)     // Catch: java.lang.Throwable -> L6e2
            if (r14 != 0) goto L72c
            boolean r12 = r13.equals(r12)     // Catch: java.lang.Throwable -> L6e2
            if (r12 != 0) goto L72c
            r11.add(r13)     // Catch: java.lang.Throwable -> L6e2
        L72c:
            jt5 r2 = r2.f     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r2 = r2.e     // Catch: java.lang.Throwable -> L6e2
            if (r2 == 0) goto L73b
            boolean r12 = defpackage.qs6.v0(r2)     // Catch: java.lang.Throwable -> L6e2
            if (r12 != 0) goto L73b
            r11.add(r2)     // Catch: java.lang.Throwable -> L6e2
        L73b:
            kw3 r2 = defpackage.hf.A(r11)     // Catch: java.lang.Throwable -> L6e2
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6e2
            r11.<init>()     // Catch: java.lang.Throwable -> L6e2
            java.util.ListIterator r2 = r2.listIterator(r5)     // Catch: java.lang.Throwable -> L6e2
        L748:
            r5 = r2
            xx2 r5 = (defpackage.xx2) r5     // Catch: java.lang.Throwable -> L6e2
            boolean r12 = r5.hasNext()     // Catch: java.lang.Throwable -> L6e2
            if (r12 == 0) goto L762
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L6e2
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L6e2
            boolean r12 = defpackage.qs6.v0(r12)     // Catch: java.lang.Throwable -> L6e2
            if (r12 != 0) goto L748
            r11.add(r5)     // Catch: java.lang.Throwable -> L6e2
            goto L748
        L762:
            d70 r2 = defpackage.e70.a(r0, r11, r10)     // Catch: java.lang.Throwable -> L6e2
            if (r2 == 0) goto L76b
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L6e2
            goto L76c
        L76b:
            r2 = r3
        L76c:
            r9.put(r1, r2)     // Catch: java.lang.Throwable -> L6e2
            r0.h = r6     // Catch: java.lang.Throwable -> L6e2
            o41 r1 = r0.a     // Catch: java.lang.Throwable -> L6e2
            m5 r5 = new m5     // Catch: java.lang.Throwable -> L6e2
            r6 = 5
            r5.<init>(r0, r7, r6)     // Catch: java.lang.Throwable -> L6e2
            defpackage.hv.L(r1, r7, r7, r5, r4)     // Catch: java.lang.Throwable -> L6e2
            boolean r0 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6e2
            if (r0 == 0) goto L783
            r2 = r7
        L783:
            r8.h(r7)
            r7 = r2
        L787:
            return r7
        L788:
            r8.h(r7)
            throw r0
        L78c:
            jg7 r3 = defpackage.jg7.a
            java.lang.Object r0 = r1.g0
            r9 = r0
            m20 r9 = (defpackage.m20) r9
            java.lang.Object r0 = r1.h0
            r11 = r0
            zn3 r11 = (defpackage.zn3) r11
            java.lang.String r0 = " (Imported)"
            java.lang.Object r8 = r1.Z
            w61 r8 = (defpackage.w61) r8
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r1.Y
            r15 = 4
            r12 = 0
            if (r8 == 0) goto L7d6
            if (r8 == r6) goto L7d0
            if (r8 == r2) goto L7c6
            if (r8 == r4) goto L7bc
            if (r8 != r15) goto L7b5
            defpackage.oi2.Y(r32)
            r0 = r32
            goto L8a8
        L7b5:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L8ac
        L7bc:
            defpackage.oi2.Y(r32)     // Catch: java.lang.Exception -> L7c3
            r0 = r32
            goto L86e
        L7c3:
            r0 = move-exception
            goto L88e
        L7c6:
            java.lang.Object r0 = r1.d0
            fk3 r0 = (defpackage.fk3) r0
            defpackage.oi2.Y(r32)     // Catch: java.lang.Exception -> L7c3
        L7cd:
            r10 = r0
            goto L857
        L7d0:
            defpackage.oi2.Y(r32)     // Catch: java.lang.Exception -> L7c3
        L7d3:
            r7 = r3
            goto L8ac
        L7d6:
            defpackage.oi2.Y(r32)
            java.lang.Object r7 = r1.e0     // Catch: java.lang.Exception -> L7c3
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Exception -> L7c3
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Exception -> L7c3
            java.lang.Object r8 = r1.f0     // Catch: java.lang.Exception -> L7c3
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Exception -> L7c3
            java.io.InputStream r7 = r7.openInputStream(r8)     // Catch: java.lang.Exception -> L7c3
            if (r7 == 0) goto L87a
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L872
            java.nio.charset.Charset r8 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L872
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L872
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L872
            r10 = 8192(0x2000, float:1.148E-41)
            r8.<init>(r6, r10)     // Catch: java.lang.Throwable -> L872
            java.lang.String r6 = defpackage.yh2.E(r8)     // Catch: java.lang.Throwable -> L872
            r7.close()     // Catch: java.lang.Exception -> L7c3
            su2 r7 = new su2     // Catch: java.lang.Exception -> L7c3
            r7.<init>()     // Catch: java.lang.Exception -> L7c3
            java.lang.Class<gk3> r8 = defpackage.gk3.class
            ie7 r10 = new ie7     // Catch: java.lang.Exception -> L7c3
            r10.<init>(r8)     // Catch: java.lang.Exception -> L7c3
            java.io.StringReader r8 = new java.io.StringReader     // Catch: java.lang.Exception -> L7c3
            r8.<init>(r6)     // Catch: java.lang.Exception -> L7c3
            java.lang.Object r6 = r7.c(r8, r10)     // Catch: java.lang.Exception -> L7c3
            gk3 r6 = (defpackage.gk3) r6     // Catch: java.lang.Exception -> L7c3
            fk3 r6 = r6.a()     // Catch: java.lang.Exception -> L7c3
            java.util.UUID r17 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L7c3
            java.lang.String r7 = r6.b     // Catch: java.lang.Exception -> L7c3
            if (r7 == 0) goto L833
            java.lang.String r8 = ")"
            boolean r8 = defpackage.xs6.Y(r7, r8, r5)     // Catch: java.lang.Exception -> L7c3
            if (r8 == 0) goto L82c
            goto L830
        L82c:
            java.lang.String r7 = r7.concat(r0)     // Catch: java.lang.Exception -> L7c3
        L830:
            r18 = r7
            goto L836
        L833:
            java.lang.String r7 = "Imported Layout"
            goto L830
        L836:
            dk3 r19 = defpackage.dk3.CUSTOM     // Catch: java.lang.Exception -> L7c3
            r23 = 0
            r24 = 120(0x78, float:1.68E-43)
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r6
            fk3 r0 = defpackage.fk3.a(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Exception -> L7c3
            wa3 r6 = r9.b     // Catch: java.lang.Exception -> L7c3
            r1.Z = r12     // Catch: java.lang.Exception -> L7c3
            r1.d0 = r0     // Catch: java.lang.Exception -> L7c3
            r1.Y = r2     // Catch: java.lang.Exception -> L7c3
            java.lang.Object r2 = r6.f(r0, r1)     // Catch: java.lang.Exception -> L7c3
            if (r2 != r14) goto L7cd
            goto L8a6
        L857:
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Exception -> L7c3
            jv2 r0 = defpackage.e04.a     // Catch: java.lang.Exception -> L7c3
            ag r8 = new ag     // Catch: java.lang.Exception -> L7c3
            r13 = 3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L7c3
            r1.Z = r12     // Catch: java.lang.Exception -> L7c3
            r1.d0 = r12     // Catch: java.lang.Exception -> L7c3
            r1.Y = r4     // Catch: java.lang.Exception -> L7c3
            java.lang.Object r0 = defpackage.hv.d0(r0, r8, r1)     // Catch: java.lang.Exception -> L7c3
            if (r0 != r14) goto L86e
            goto L8a6
        L86e:
            jg7 r0 = (defpackage.jg7) r0     // Catch: java.lang.Exception -> L7c3
            goto L7d3
        L872:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L875
        L875:
            r0 = move-exception
            defpackage.ge7.t(r7, r2)     // Catch: java.lang.Exception -> L7c3
            throw r0     // Catch: java.lang.Exception -> L7c3
        L87a:
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Exception -> L7c3
            jv2 r0 = defpackage.e04.a     // Catch: java.lang.Exception -> L7c3
            l20 r2 = new l20     // Catch: java.lang.Exception -> L7c3
            r2.<init>(r11, r12, r6)     // Catch: java.lang.Exception -> L7c3
            r1.Z = r12     // Catch: java.lang.Exception -> L7c3
            r1.Y = r6     // Catch: java.lang.Exception -> L7c3
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r1)     // Catch: java.lang.Exception -> L7c3
            if (r0 != r14) goto L7d3
            goto L8a6
        L88e:
            r0.printStackTrace()
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            l20 r2 = new l20
            r2.<init>(r11, r12, r5)
            r1.Z = r12
            r1.d0 = r12
            r1.Y = r15
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r1)
            if (r0 != r14) goto L8a8
        L8a6:
            r7 = r14
            goto L8ac
        L8a8:
            jg7 r0 = (defpackage.jg7) r0
            goto L7d3
        L8ac:
            return r7
        L8ad:
            java.lang.Object r0 = r1.e0
            ul0 r0 = (defpackage.ul0) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L8cd
            if (r3 != r6) goto L8c7
            java.lang.Object r3 = r1.d0
            n80 r3 = (defpackage.n80) r3
            java.lang.Object r5 = r1.Z
            w61 r5 = (defpackage.w61) r5
            defpackage.oi2.Y(r32)
            r8 = r32
            goto L8eb
        L8c7:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L91f
        L8cd:
            defpackage.oi2.Y(r32)
            java.lang.Object r3 = r1.Z
            w61 r3 = (defpackage.w61) r3
            n80 r5 = r0.iterator()
            r30 = r5
            r5 = r3
            r3 = r30
        L8dd:
            r1.Z = r5
            r1.d0 = r3
            r1.Y = r6
            java.lang.Object r8 = r3.b(r1)
            if (r8 != r2) goto L8eb
            r7 = r2
            goto L91f
        L8eb:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L91d
            java.lang.Object r8 = r3.c()
            java.lang.Object r9 = r0.m()
            java.lang.Object r9 = defpackage.gm0.a(r9)
            if (r9 != 0) goto L903
            r11 = r8
            goto L904
        L903:
            r11 = r9
        L904:
            l5 r10 = new l5
            java.lang.Object r8 = r1.f0
            r12 = r8
            gn r12 = (defpackage.gn) r12
            java.lang.Object r8 = r1.g0
            r13 = r8
            qa4 r13 = (defpackage.qa4) r13
            java.lang.Object r8 = r1.h0
            r14 = r8
            qa4 r14 = (defpackage.qa4) r14
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            defpackage.hv.L(r5, r7, r7, r10, r4)
            goto L8dd
        L91d:
            jg7 r7 = defpackage.jg7.a
        L91f:
            return r7
    }
}
