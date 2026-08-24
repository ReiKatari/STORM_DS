package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk1  reason: default package */
/* loaded from: classes.dex */
public final class bk1 implements defpackage.nb0 {
    public boolean A;
    public java.lang.Object B;
    public java.lang.Object L;
    public java.lang.Object R;

    public bk1(int r1) {
            r0 = this;
            switch(r1) {
                case 7: goto L1f;
                default: goto L3;
            }
        L3:
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.L = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.B = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.R = r1
            r1 = 1
            r0.A = r1
            return
        L1f:
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.L = r1
            return
    }

    public bk1(java.lang.Class r37) {
            r36 = this;
            r0 = r36
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r1.getClass()
            r0.L = r1
            yw7 r2 = new yw7
            java.lang.Object r1 = r0.L
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.String r3 = r1.toString()
            r3.getClass()
            java.lang.String r5 = r37.getName()
            r34 = 0
            r35 = 33554426(0x1fffffa, float:9.4039514E-38)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35)
            r0.B = r2
            java.lang.String r1 = r37.getName()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.Set r1 = defpackage.ii2.G(r1)
            r0.R = r1
            return
    }

    public bk1(defpackage.kk1 r1, defpackage.dk1 r2) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.L = r2
            boolean r2 = r2.e
            if (r2 == 0) goto Ld
            r1 = 0
            goto L13
        Ld:
            r1.getClass()
            r1 = 2
            boolean[] r1 = new boolean[r1]
        L13:
            r0.B = r1
            return
    }

    public bk1(defpackage.lk1 r1, defpackage.ek1 r2) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.L = r2
            r1 = 2
            boolean[] r1 = new boolean[r1]
            r0.B = r1
            return
    }

    public static java.io.IOException b(defpackage.bk1 r11, boolean r12, java.io.IOException r13, int r14) {
            r0 = r14 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r14 = r14 & 8
            if (r14 == 0) goto Lf
            r14 = r2
            goto L10
        Lf:
            r14 = r1
        L10:
            if (r13 == 0) goto L15
            r11.o(r13)
        L15:
            java.lang.Object r3 = r11.L
            r4 = r3
            je5 r4 = (defpackage.je5) r4
            if (r14 == 0) goto L20
            if (r12 != 0) goto L20
            r6 = r1
            goto L21
        L20:
            r6 = r2
        L21:
            if (r0 == 0) goto L27
            if (r12 != 0) goto L27
            r7 = r1
            goto L28
        L27:
            r7 = r2
        L28:
            if (r14 == 0) goto L2e
            if (r12 == 0) goto L2e
            r9 = r1
            goto L2f
        L2e:
            r9 = r2
        L2f:
            if (r0 == 0) goto L37
            if (r12 == 0) goto L37
            r8 = r1
        L34:
            r5 = r11
            r10 = r13
            goto L39
        L37:
            r8 = r2
            goto L34
        L39:
            java.io.IOException r11 = r4.i(r5, r6, r7, r8, r9, r10)
            return r11
    }

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.R
            kk1 r0 = (defpackage.kk1) r0
            monitor-enter(r0)
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L21
            java.lang.Object r1 = r2.L     // Catch: java.lang.Throwable -> L1a
            dk1 r1 = (defpackage.dk1) r1     // Catch: java.lang.Throwable -> L1a
            bk1 r1 = r1.g     // Catch: java.lang.Throwable -> L1a
            boolean r1 = defpackage.nb3.k(r1, r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            r1 = 0
            r0.h(r2, r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L29
        L1c:
            r1 = 1
            r2.A = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Check failed."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L29:
            monitor-exit(r0)
            throw r2
    }

    public defpackage.gm4 c() {
            r40 = this;
            r0 = r40
            boolean r1 = r0.A
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.B
            yw7 r1 = (defpackage.yw7) r1
            p21 r1 = r1.j
            boolean r1 = r1.d
            if (r1 != 0) goto L12
            goto L18
        L12:
            java.lang.String r0 = "Cannot set backoff criteria on an idle mode job"
            defpackage.i.h(r0)
            return r2
        L18:
            gm4 r1 = new gm4
            java.lang.Object r3 = r0.L
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r4 = r0.B
            yw7 r4 = (defpackage.yw7) r4
            java.lang.Object r5 = r0.R
            java.util.Set r5 = (java.util.Set) r5
            r1.<init>(r3, r4, r5)
            java.lang.Object r3 = r0.B
            yw7 r3 = (defpackage.yw7) r3
            p21 r3 = r3.j
            java.util.Set r4 = r3.i
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L4a
            boolean r4 = r3.e
            if (r4 != 0) goto L4a
            boolean r4 = r3.c
            if (r4 != 0) goto L4a
            boolean r3 = r3.d
            if (r3 == 0) goto L48
            goto L4a
        L48:
            r3 = r6
            goto L4b
        L4a:
            r3 = r5
        L4b:
            java.lang.Object r4 = r0.B
            yw7 r4 = (defpackage.yw7) r4
            boolean r7 = r4.q
            if (r7 == 0) goto L6a
            if (r3 != 0) goto L64
            long r7 = r4.g
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 > 0) goto L5e
            goto L6a
        L5e:
            java.lang.String r0 = "Expedited jobs cannot be delayed"
            defpackage.i.h(r0)
            return r2
        L64:
            java.lang.String r0 = "Expedited jobs only support network and storage constraints"
            defpackage.i.h(r0)
            return r2
        L6a:
            java.lang.String r2 = r4.x
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 != 0) goto L9e
            java.lang.String r2 = r4.c
            java.lang.String r7 = "."
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8 = 6
            java.util.List r2 = defpackage.qs6.K0(r2, r7, r8)
            int r7 = r2.size()
            if (r7 != r5) goto L8a
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            goto L90
        L8a:
            java.lang.Object r2 = defpackage.gt0.Q0(r2)
            java.lang.String r2 = (java.lang.String) r2
        L90:
            int r5 = r2.length()
            if (r5 > r3) goto L97
            goto L9b
        L97:
            java.lang.String r2 = defpackage.qs6.S0(r3, r2)
        L9b:
            r4.x = r2
            goto Lae
        L9e:
            int r4 = r2.length()
            if (r4 <= r3) goto Lae
            java.lang.Object r4 = r0.B
            yw7 r4 = (defpackage.yw7) r4
            java.lang.String r2 = defpackage.qs6.S0(r3, r2)
            r4.x = r2
        Lae:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            r2.getClass()
            r0.L = r2
            yw7 r3 = new yw7
            java.lang.String r4 = r2.toString()
            r4.getClass()
            java.lang.Object r2 = r0.B
            yw7 r2 = (defpackage.yw7) r2
            r2.getClass()
            java.lang.String r6 = r2.c
            iw7 r5 = r2.b
            java.lang.String r7 = r2.d
            xb1 r8 = new xb1
            xb1 r9 = r2.e
            r8.<init>(r9)
            xb1 r9 = new xb1
            xb1 r10 = r2.f
            r9.<init>(r10)
            long r10 = r2.g
            long r12 = r2.h
            long r14 = r2.i
            r37 = r1
            p21 r1 = new p21
            r16 = r3
            p21 r3 = r2.j
            r1.<init>(r3)
            int r3 = r2.k
            r17 = r1
            w10 r1 = r2.l
            r19 = r3
            r18 = r4
            long r3 = r2.m
            r20 = r3
            long r3 = r2.n
            r22 = r3
            long r3 = r2.o
            r24 = r3
            long r3 = r2.p
            r26 = r1
            boolean r1 = r2.q
            r27 = r1
            oo4 r1 = r2.r
            r28 = r1
            int r1 = r2.s
            r29 = r3
            long r3 = r2.u
            r31 = r1
            int r1 = r2.v
            r32 = r1
            int r1 = r2.w
            r33 = r1
            java.lang.String r1 = r2.x
            java.lang.Boolean r2 = r2.y
            r36 = 524288(0x80000, float:7.34684E-40)
            r34 = r1
            r35 = r2
            r38 = r3
            r3 = r16
            r16 = r17
            r4 = r18
            r17 = r19
            r19 = r20
            r21 = r22
            r23 = r24
            r18 = r26
            r25 = r29
            r29 = r31
            r30 = r38
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r14, r16, r17, r18, r19, r21, r23, r25, r27, r28, r29, r30, r32, r33, r34, r35, r36)
            r0.B = r3
            return r37
    }

    public void d() {
            r3 = this;
            java.lang.Object r0 = r3.R
            kk1 r0 = (defpackage.kk1) r0
            monitor-enter(r0)
            boolean r1 = r3.A     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L20
            java.lang.Object r1 = r3.L     // Catch: java.lang.Throwable -> L1a
            dk1 r1 = (defpackage.dk1) r1     // Catch: java.lang.Throwable -> L1a
            bk1 r1 = r1.g     // Catch: java.lang.Throwable -> L1a
            boolean r1 = defpackage.nb3.k(r1, r3)     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            if (r1 == 0) goto L1c
            r0.h(r3, r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L28
        L1c:
            r3.A = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L28:
            monitor-exit(r0)
            throw r3
    }

    public void e(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.R
            lk1 r0 = (defpackage.lk1) r0
            monitor-enter(r0)
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L20
            java.lang.Object r1 = r2.L     // Catch: java.lang.Throwable -> L19
            ek1 r1 = (defpackage.ek1) r1     // Catch: java.lang.Throwable -> L19
            bk1 r1 = r1.g     // Catch: java.lang.Throwable -> L19
            boolean r1 = defpackage.nb3.k(r1, r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            defpackage.lk1.e(r0, r2, r3)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r2 = move-exception
            goto L28
        L1b:
            r3 = 1
            r2.A = r3     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L20:
            java.lang.String r2 = "editor is closed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L28:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.nb0
    public void f(defpackage.je5 r4, defpackage.wl5 r5) {
            r3 = this;
            java.lang.Object r4 = r3.L
            rj0 r4 = (defpackage.rj0) r4
            int r0 = r5.R
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L34
            boolean r0 = r3.A
            if (r0 == 0) goto L34
            r5.close()
            bf4 r5 = new bf4
            java.lang.Object r0 = r3.B
            hb5 r0 = (defpackage.hb5) r0
            java.lang.Object r3 = r3.R
            l85 r3 = (defpackage.l85) r3
            r1 = 9
            r2 = 0
            r5.<init>(r0, r3, r2, r1)
            defpackage.hv.W(r5)
            sj7 r3 = new sj7
            java.lang.String r5 = "User token expired"
            r3.<init>(r5)
            em5 r5 = new em5
            r5.<init>(r3)
            r4.i(r5)
            return
        L34:
            r4.i(r5)
            return
    }

    public void g() {
            r3 = this;
            java.lang.Object r0 = r3.L
            dk1 r0 = (defpackage.dk1) r0
            bk1 r1 = r0.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.R
            kk1 r1 = (defpackage.kk1) r1
            boolean r2 = r1.h0
            if (r2 == 0) goto L19
            r0 = 0
            r1.h(r3, r0)
            return
        L19:
            r3 = 1
            r0.f = r3
        L1c:
            return
    }

    public void h() {
            r2 = this;
            java.lang.Object r0 = r2.L
            monitor-enter(r0)
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r1 = 0
            r2.A = r1     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r2.R = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r2 = move-exception
            goto L19
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Check failed."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L19:
            monitor-exit(r0)
            throw r2
    }

    public defpackage.lt4 i(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.R
            lk1 r0 = (defpackage.lk1) r0
            monitor-enter(r0)
            boolean r1 = r3.A     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L32
            java.lang.Object r1 = r3.B     // Catch: java.lang.Throwable -> L30
            boolean[] r1 = (boolean[]) r1     // Catch: java.lang.Throwable -> L30
            r2 = 1
            r1[r4] = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.L     // Catch: java.lang.Throwable -> L30
            ek1 r3 = (defpackage.ek1) r3     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r3 = r3.d     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L30
            jk1 r4 = r0.l0     // Catch: java.lang.Throwable -> L30
            r1 = r3
            lt4 r1 = (defpackage.lt4) r1     // Catch: java.lang.Throwable -> L30
            boolean r2 = r4.v(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L2c
            ui6 r4 = r4.J(r1)     // Catch: java.lang.Throwable -> L30
            defpackage.k.a(r4)     // Catch: java.lang.Throwable -> L30
        L2c:
            lt4 r3 = (defpackage.lt4) r3     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            return r3
        L30:
            r3 = move-exception
            goto L3a
        L32:
            java.lang.String r3 = "editor is closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r4     // Catch: java.lang.Throwable -> L30
        L3a:
            monitor-exit(r0)
            throw r3
    }

    public defpackage.ke5 j() {
            r2 = this;
            java.lang.Object r2 = r2.R
            v62 r2 = (defpackage.v62) r2
            u62 r2 = r2.i()
            boolean r0 = r2 instanceof defpackage.ke5
            r1 = 0
            if (r0 == 0) goto L10
            ke5 r2 = (defpackage.ke5) r2
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.String r2 = "no connection for CONNECT tunnels"
            defpackage.i.m(r2)
            return r1
    }

    @Override // defpackage.nb0
    public void k(defpackage.je5 r1, java.io.IOException r2) {
            r0 = this;
            java.lang.Object r0 = r0.L
            rj0 r0 = (defpackage.rj0) r0
            em5 r1 = new em5
            r1.<init>(r2)
            r0.i(r1)
            return
    }

    public defpackage.ui6 l(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.R
            kk1 r0 = (defpackage.kk1) r0
            monitor-enter(r0)
            boolean r1 = r4.A     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L5e
            java.lang.Object r1 = r4.L     // Catch: java.lang.Throwable -> L2f
            dk1 r1 = (defpackage.dk1) r1     // Catch: java.lang.Throwable -> L2f
            bk1 r1 = r1.g     // Catch: java.lang.Throwable -> L2f
            boolean r1 = defpackage.nb3.k(r1, r4)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L1c
            y40 r4 = new y40     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r4
        L1c:
            java.lang.Object r1 = r4.L     // Catch: java.lang.Throwable -> L2f
            dk1 r1 = (defpackage.dk1) r1     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.e     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            java.lang.Object r1 = r4.B     // Catch: java.lang.Throwable -> L2f
            boolean[] r1 = (boolean[]) r1     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            r1[r5] = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = move-exception
            goto L66
        L31:
            java.lang.Object r1 = r4.L     // Catch: java.lang.Throwable -> L2f
            dk1 r1 = (defpackage.dk1) r1     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r1 = r1.d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L2f
            lt4 r5 = (defpackage.lt4) r5     // Catch: java.lang.Throwable -> L2f
            ik1 r1 = r0.B     // Catch: java.lang.Throwable -> L2f java.io.FileNotFoundException -> L57
            r1.getClass()     // Catch: java.lang.Throwable -> L2f java.io.FileNotFoundException -> L57
            r5.getClass()     // Catch: java.lang.Throwable -> L2f java.io.FileNotFoundException -> L57
            ui6 r5 = r1.J(r5)     // Catch: java.lang.Throwable -> L2f java.io.FileNotFoundException -> L57
            v92 r1 = new v92     // Catch: java.lang.Throwable -> L2f
            y r2 = new y     // Catch: java.lang.Throwable -> L2f
            r3 = 23
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r1
        L57:
            y40 r4 = new y40     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r4
        L5e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L66:
            monitor-exit(r0)
            throw r4
    }

    public defpackage.ul5 m(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.R     // Catch: java.io.IOException -> Ld
            v62 r0 = (defpackage.v62) r0     // Catch: java.io.IOException -> Ld
            ul5 r2 = r0.f(r2)     // Catch: java.io.IOException -> Ld
            if (r2 == 0) goto Lf
            r2.n = r1     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r2 = move-exception
            goto L10
        Lf:
            return r2
        L10:
            r1.o(r2)
            throw r2
    }

    public boolean n(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.lang.Object r0 = r3.L
            monitor-enter(r0)
            java.lang.Object r1 = r3.B     // Catch: java.lang.Throwable -> L10
            mb5 r1 = (defpackage.mb5) r1     // Catch: java.lang.Throwable -> L10
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r3 = move-exception
            goto L20
        L12:
            r1 = r2
        L13:
            boolean r4 = defpackage.nb3.k(r1, r4)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L1b
            r3 = 0
            goto L1e
        L1b:
            r3.B = r2     // Catch: java.lang.Throwable -> L10
            r3 = 1
        L1e:
            monitor-exit(r0)
            return r3
        L20:
            monitor-exit(r0)
            throw r3
    }

    public void o(java.io.IOException r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            java.lang.Object r0 = r1.R
            v62 r0 = (defpackage.v62) r0
            u62 r0 = r0.i()
            java.lang.Object r1 = r1.L
            je5 r1 = (defpackage.je5) r1
            r0.f(r1, r2)
            return
    }

    public boolean p() {
            r3 = this;
            java.lang.Object r0 = r3.L
            monitor-enter(r0)
            boolean r1 = r3.A     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.lang.Object r1 = r3.B     // Catch: java.lang.Throwable -> L15
            mb5 r1 = (defpackage.mb5) r1     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            goto L17
        Le:
            r1 = 1
            r3.A = r1     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r3.R = r2     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r3 = move-exception
            goto L1a
        L17:
            r1 = 0
        L18:
            monitor-exit(r0)
            return r1
        L1a:
            monitor-exit(r0)
            throw r3
    }

    public defpackage.bt q() {
            r3 = this;
            java.lang.Object r0 = r3.L
            je5 r0 = (defpackage.je5) r0
            boolean r1 = r0.f0
            if (r1 != 0) goto L6c
            r1 = 1
            r0.f0 = r1
            ie5 r2 = r0.X
            r2.j()
            monitor-enter(r0)
            bk1 r2 = r0.n0     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L62
            boolean r2 = r0.j0     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L5a
            boolean r2 = r0.k0     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L5a
            boolean r2 = r0.h0     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L52
            boolean r2 = r0.i0     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            r2 = 0
            r0.i0 = r2     // Catch: java.lang.Throwable -> L48
            r0.j0 = r1     // Catch: java.lang.Throwable -> L48
            r0.k0 = r1     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)
            java.lang.Object r0 = r3.R
            v62 r0 = (defpackage.v62) r0
            u62 r0 = r0.i()
            r0.getClass()
            ke5 r0 = (defpackage.ke5) r0
            java.net.Socket r1 = r0.e
            r1.setSoTimeout(r2)
            r0.e()
            bt r0 = new bt
            r0.<init>(r3)
            return r0
        L48:
            r3 = move-exception
            goto L6a
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L62:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L6a:
            monitor-exit(r0)
            throw r3
        L6c:
            java.lang.String r3 = "Check failed."
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }
}
