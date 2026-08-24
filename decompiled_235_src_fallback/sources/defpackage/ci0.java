package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci0  reason: default package */
/* loaded from: classes.dex */
public final class ci0 implements defpackage.y23 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;

    public ci0(defpackage.ne1 r9) {
            r8 = this;
            r8.<init>()
            r8.a = r9
            r9 = 0
            tp6 r0 = defpackage.up6.a(r9)
            r8.b = r0
            d83 r1 = defpackage.d83.e
            tp6 r1 = defpackage.up6.a(r1)
            r8.c = r1
            tp6 r2 = defpackage.up6.a(r9)
            r8.d = r2
            yt1 r3 = defpackage.yt1.A
            tp6 r3 = defpackage.up6.a(r3)
            r8.e = r3
            tp6 r4 = defpackage.up6.a(r9)
            r8.f = r4
            if7 r5 = new if7
            r5.<init>(r9)
            r6 = 5
            le2[] r6 = new defpackage.le2[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r1 = 4
            r6[r1] = r4
            wp0 r1 = new wp0
            r2 = 6
            r1.<init>(r2, r6, r5)
            le2 r1 = defpackage.f04.z(r1)
            jd1 r2 = defpackage.oq1.B
            r2 = 50
            uq1 r3 = defpackage.uq1.MILLISECONDS
            long r2 = defpackage.n16.L(r2, r3)
            long r2 = defpackage.q60.Y(r2)
            le2 r1 = defpackage.f04.x(r1, r2)
            tp6 r2 = defpackage.up6.a(r9)
            r8.g = r2
            kz0 r3 = new kz0
            r3.<init>(r8, r9, r0)
            xf2 r9 = new xf2
            r9.<init>(r2, r1, r3)
            r8.h = r9
            return
    }

    public static final java.lang.Object a(defpackage.ci0 r8, defpackage.tn5 r9, defpackage.s41 r10) {
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.ao5
            if (r0 == 0) goto L17
            r0 = r10
            ao5 r0 = (defpackage.ao5) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.e0 = r1
        L15:
            r4 = r0
            goto L1d
        L17:
            ao5 r0 = new ao5
            r0.<init>(r8, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r4.Z
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.e0
            r2 = 0
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L45
            if (r1 == r5) goto L3b
            if (r1 != r3) goto L35
            kw3 r8 = r4.Y
            kw3 r9 = r4.X
            defpackage.oi2.Y(r10)
            goto La2
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r2
        L3b:
            tn5 r9 = r4.R
            defpackage.oi2.Y(r10)
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r10 = r10.A
            goto L5f
        L45:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r8.a
            pn5 r10 = (defpackage.pn5) r10
            o75 r1 = r9.a
            boolean r6 = r9.b
            hb5 r7 = r9.c
            r4.R = r9
            r4.e0 = r5
            pl r10 = (defpackage.pl) r10
            java.lang.Object r10 = r10.c(r1, r6, r7, r4)
            if (r10 != r0) goto L5f
            goto L9f
        L5f:
            java.lang.Throwable r1 = defpackage.hm5.a(r10)
            yt1 r5 = defpackage.yt1.A
            if (r1 != 0) goto Lb4
            o85 r10 = (defpackage.o85) r10
            boolean r1 = r10.a
            if (r1 == 0) goto Lae
            kw3 r7 = defpackage.hf.I()
            q95 r1 = new q95
            o75 r5 = r9.a
            r1.<init>(r5)
            r7.add(r1)
            boolean r1 = r10.a
            if (r1 == 0) goto Laa
            int r10 = r10.b
            if (r10 != 0) goto Laa
            o75 r10 = r9.a
            long r5 = r10.c
            r10 = r2
            r1 = r3
            r2 = r5
            boolean r6 = r9.b
            hb5 r9 = r9.c
            java.lang.String r5 = r9.a
            r4.R = r10
            r4.X = r7
            r4.Y = r7
            r4.e0 = r1
            r1 = r8
            java.lang.Object r10 = r1.h(r2, r4, r5, r6)
            if (r10 != r0) goto La0
        L9f:
            return r0
        La0:
            r8 = r7
            r9 = r8
        La2:
            s95 r10 = (defpackage.s95) r10
            if (r10 == 0) goto La9
            r8.add(r10)
        La9:
            r7 = r9
        Laa:
            kw3 r5 = defpackage.hf.A(r7)
        Lae:
            xn5 r8 = new xn5
            r8.<init>(r5)
            return r8
        Lb4:
            boolean r8 = r9.d
            o75 r10 = r9.a
            if (r8 == 0) goto Lc3
            p95 r8 = new p95
            r8.<init>(r10)
            java.util.List r5 = defpackage.hf.b0(r8)
        Lc3:
            wn5 r8 = new wn5
            boolean r0 = r9.b
            hb5 r9 = r9.c
            tn5 r1 = new tn5
            r2 = 0
            r1.<init>(r10, r0, r9, r2)
            r8.<init>(r1, r5)
            return r8
    }

    public static final defpackage.qe0 d(defpackage.ci0 r3, defpackage.mh0 r4) {
            java.util.LinkedHashSet r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
            r4.getClass()
        L9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r4.next()
            r0.getClass()
            lt3 r0 = (defpackage.lt3) r0
            ky r0 = defpackage.lt3.b
            boolean r1 = defpackage.nb3.k(r0, r0)
            if (r1 != 0) goto L9
            java.lang.Object r1 = defpackage.d82.a
            monitor-enter(r1)
            java.util.HashMap r2 = defpackage.d82.b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L34
            pe0 r0 = (defpackage.pe0) r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r3.f
            android.content.Context r0 = (android.content.Context) r0
            r0.getClass()
            goto L9
        L34:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r3
        L37:
            qe0 r3 = defpackage.re0.a
            return r3
    }

    public static final void e(defpackage.ci0 r5, int r6) {
            java.lang.Object r5 = r5.d
            gj0 r5 = (defpackage.gj0) r5
            if (r5 == 0) goto L6d
            r5.getClass()
            if0 r5 = r5.g
            if (r5 == 0) goto L68
            java.lang.Object r5 = r5.g
            ze0 r5 = (defpackage.ze0) r5
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            r5.e = r6     // Catch: java.lang.Throwable -> L65
            kh0 r1 = r5.c     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)
            if (r1 != 0) goto L1c
            goto L64
        L1c:
            r0 = 0
            r2 = 2
            r3 = 1
            if (r6 != r2) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r0
        L24:
            r5.f = r4
            java.util.LinkedHashSet r5 = r1.c()
            java.util.Iterator r5 = r5.iterator()
            r5.getClass()
        L31:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            eg0 r1 = (defpackage.eg0) r1
            boolean r4 = r1 instanceof defpackage.gg0
            if (r4 == 0) goto L44
            gg0 r1 = (defpackage.gg0) r1
            goto L45
        L44:
            r1 = 0
        L45:
            if (r1 == 0) goto L31
            if (r6 == r3) goto L58
            if (r6 == r2) goto L4c
            goto L31
        L4c:
            gj7 r1 = r1.A
            java.lang.Object r4 = r1.k
            monitor-enter(r4)
            r1.o = r0     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            goto L31
        L55:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L58:
            gj7 r1 = r1.A
            java.lang.Object r4 = r1.k
            monitor-enter(r4)
            r1.o = r3     // Catch: java.lang.Throwable -> L61
            monitor-exit(r4)
            goto L31
        L61:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L64:
            return
        L65:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L68:
            java.lang.String r5 = "CameraX not initialized yet."
            defpackage.i.m(r5)
        L6d:
            return
    }

    public static final java.lang.Object f(defpackage.ci0 r27, defpackage.un5 r28, defpackage.s41 r29) {
            r0 = r27
            r1 = r29
            java.lang.Object r2 = r0.a
            pn5 r2 = (defpackage.pn5) r2
            boolean r3 = r1 instanceof defpackage.fo5
            if (r3 == 0) goto L1c
            r3 = r1
            fo5 r3 = (defpackage.fo5) r3
            int r4 = r3.d0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.d0 = r4
        L1a:
            r9 = r3
            goto L22
        L1c:
            fo5 r3 = new fo5
            r3.<init>(r0, r1)
            goto L1a
        L22:
            java.lang.Object r1 = r9.Y
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r9.d0
            yt1 r10 = defpackage.yt1.A
            r11 = 3
            r5 = 2
            r12 = 1
            r13 = 0
            if (r4 == 0) goto L55
            if (r4 == r12) goto L4f
            if (r4 == r5) goto L45
            if (r4 != r11) goto L3f
            cb5 r0 = r9.X
            un5 r2 = r9.R
            defpackage.oi2.Y(r1)
            goto Ld6
        L3f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L45:
            un5 r0 = r9.R
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            goto Lb5
        L4f:
            un5 r0 = r9.R
            defpackage.oi2.Y(r1)
            goto L74
        L55:
            defpackage.oi2.Y(r1)
            java.lang.Object r0 = r0.c
            kd6 r0 = (defpackage.kd6) r0
            ng6 r0 = (defpackage.ng6) r0
            wp0 r0 = r0.C()
            r1 = r28
            r9.R = r1
            r9.d0 = r12
            java.lang.Object r0 = defpackage.f04.D(r0, r9)
            if (r0 != r3) goto L6f
            goto Lcf
        L6f:
            r26 = r1
            r1 = r0
            r0 = r26
        L74:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L9d
            ta5 r1 = r0.a
            long r6 = r1.a
            int r1 = r0.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "event_type=kotlin_leaderboard_submit_start submit_path=kotlin_api leaderboard_id="
            r4.<init>(r8)
            r4.append(r6)
            java.lang.String r6 = " request_score="
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "RASubmission"
            android.util.Log.i(r4, r1)
        L9d:
            ta5 r1 = r0.a
            long r6 = r1.a
            r14 = r6
            int r7 = r0.b
            hb5 r8 = r0.d
            r9.R = r0
            r9.d0 = r5
            r4 = r2
            pl r4 = (defpackage.pl) r4
            r5 = r14
            java.lang.Object r1 = r4.C(r5, r7, r8, r9)
            if (r1 != r3) goto Lb5
            goto Lcf
        Lb5:
            java.lang.Throwable r4 = defpackage.hm5.a(r1)
            if (r4 != 0) goto L10c
            cb5 r1 = (defpackage.cb5) r1
            ta5 r4 = r0.a
            long r4 = r4.c
            r9.R = r0
            r9.X = r1
            r9.d0 = r11
            pl r2 = (defpackage.pl) r2
            java.lang.Object r2 = r2.i(r4, r9)
            if (r2 != r3) goto Ld0
        Lcf:
            return r3
        Ld0:
            r26 = r2
            r2 = r0
            r0 = r1
            r1 = r26
        Ld6:
            u75 r1 = (defpackage.u75) r1
            if (r1 == 0) goto L102
            x95 r14 = new x95
            ta5 r3 = r2.a
            long r4 = r3.a
            java.lang.String r3 = r3.g
            java.net.URL r1 = r1.e
            java.lang.String r2 = r2.c
            int r6 = r0.a
            long r6 = (long) r6
            int r0 = r0.b
            long r8 = (long) r0
            r17 = 0
            r21 = 0
            r19 = r1
            r20 = r2
            r18 = r3
            r15 = r4
            r22 = r6
            r24 = r8
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r24)
            java.util.List r13 = defpackage.hf.b0(r14)
        L102:
            if (r13 != 0) goto L105
            goto L106
        L105:
            r10 = r13
        L106:
            xn5 r0 = new xn5
            r0.<init>(r10)
            return r0
        L10c:
            boolean r1 = r0.e
            ta5 r3 = r0.a
            if (r1 == 0) goto L11d
            w95 r1 = new w95
            long r4 = r3.a
            r1.<init>(r4, r13, r12)
            java.util.List r10 = defpackage.hf.b0(r1)
        L11d:
            wn5 r1 = new wn5
            int r4 = r0.b
            java.lang.String r5 = r0.c
            hb5 r6 = r0.d
            un5 r2 = new un5
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1.<init>(r2, r10)
            return r1
    }

    public static defpackage.vt3 g(defpackage.ci0 r16, me.magnum.melonds.ui.emulator.EmulatorActivity r17, defpackage.mh0 r18, defpackage.qi1 r19) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            u63 r9 = defpackage.u63.X
            java.lang.String r4 = "CX:bindToLifecycle-internal"
            java.lang.String r4 = defpackage.ln2.f0(r4)
            android.os.Trace.beginSection(r4)
            defpackage.nj2.h()     // Catch: java.lang.Throwable -> L182
            java.lang.Object r4 = r0.d     // Catch: java.lang.Throwable -> L182
            gj0 r4 = (defpackage.gj0) r4     // Catch: java.lang.Throwable -> L182
            r4.getClass()     // Catch: java.lang.Throwable -> L182
            kh0 r4 = r4.a     // Catch: java.lang.Throwable -> L182
            java.util.LinkedHashSet r4 = r4.c()     // Catch: java.lang.Throwable -> L182
            eg0 r5 = r2.c(r4)     // Catch: java.lang.Throwable -> L182
            r5.getClass()     // Catch: java.lang.Throwable -> L182
            r4 = 1
            r5.p(r4)     // Catch: java.lang.Throwable -> L182
            w9 r7 = r0.i(r2)     // Catch: java.lang.Throwable -> L182
            r6 = 0
            yf0 r2 = defpackage.nc1.M(r7, r6)     // Catch: java.lang.Throwable -> L182
            java.lang.Object r8 = r0.e     // Catch: java.lang.Throwable -> L182
            zt3 r8 = (defpackage.zt3) r8     // Catch: java.lang.Throwable -> L182
            r8.getClass()     // Catch: java.lang.Throwable -> L182
            java.lang.Object r10 = r8.a     // Catch: java.lang.Throwable -> L182
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L182
            my r11 = new my     // Catch: java.lang.Throwable -> L78
            int r12 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Throwable -> L78
            r11.<init>(r12, r2)     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r12 = r8.b     // Catch: java.lang.Throwable -> L78
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Throwable -> L78
            vt3 r11 = (defpackage.vt3) r11     // Catch: java.lang.Throwable -> L78
            if (r11 == 0) goto L7b
            zi0 r12 = r11.L     // Catch: java.lang.Throwable -> L78
            x9 r13 = r12.A     // Catch: java.lang.Throwable -> L78
            eg0 r13 = r13.A     // Catch: java.lang.Throwable -> L78
            boolean r13 = r13.k()     // Catch: java.lang.Throwable -> L78
            if (r13 != 0) goto L6f
            x9 r12 = r12.B     // Catch: java.lang.Throwable -> L78
            if (r12 == 0) goto L6d
            eg0 r12 = r12.A     // Catch: java.lang.Throwable -> L78
            boolean r12 = r12.k()     // Catch: java.lang.Throwable -> L78
            if (r12 == 0) goto L6d
            goto L6f
        L6d:
            r12 = 0
            goto L70
        L6f:
            r12 = r4
        L70:
            if (r12 == 0) goto L7b
            r8.k(r11)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            r11 = r6
            goto L7c
        L78:
            r0 = move-exception
            goto L180
        L7b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
        L7c:
            java.lang.Object r8 = r0.e     // Catch: java.lang.Throwable -> L182
            zt3 r8 = (defpackage.zt3) r8     // Catch: java.lang.Throwable -> L182
            r8.getClass()     // Catch: java.lang.Throwable -> L182
            java.lang.Object r10 = r8.a     // Catch: java.lang.Throwable -> L182
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L182
            java.util.HashMap r8 = r8.b     // Catch: java.lang.Throwable -> L17d
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> L17d
            java.util.Collection r8 = java.util.Collections.unmodifiableCollection(r8)     // Catch: java.lang.Throwable -> L17d
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L17d
            java.lang.Object r10 = r3.g     // Catch: java.lang.Throwable -> L182
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L182
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L182
        L99:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L182
            if (r12 == 0) goto Lf0
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L182
            di7 r12 = (defpackage.di7) r12     // Catch: java.lang.Throwable -> L182
            java.util.Iterator r13 = r8.iterator()     // Catch: java.lang.Throwable -> L182
        La9:
            boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L182
            if (r14 == 0) goto L99
            java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L182
            r14.getClass()     // Catch: java.lang.Throwable -> L182
            vt3 r14 = (defpackage.vt3) r14     // Catch: java.lang.Throwable -> L182
            java.lang.Object r15 = r14.A     // Catch: java.lang.Throwable -> L182
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L182
            r18 = r6
            zi0 r6 = r14.L     // Catch: java.lang.Throwable -> Led
            java.util.List r6 = r6.z()     // Catch: java.lang.Throwable -> Led
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> Led
            boolean r6 = r6.contains(r12)     // Catch: java.lang.Throwable -> Led
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Led
            if (r6 == 0) goto Ld6
            hu3 r6 = r14.d()     // Catch: java.lang.Throwable -> L182
            boolean r6 = defpackage.nb3.k(r6, r1)     // Catch: java.lang.Throwable -> L182
            if (r6 == 0) goto Ld9
        Ld6:
            r6 = r18
            goto La9
        Ld9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L182
            java.lang.String r1 = "Use case %s already bound to a different lifecycle."
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L182
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch: java.lang.Throwable -> L182
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L182
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L182
            throw r0     // Catch: java.lang.Throwable -> L182
        Led:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Led
            throw r0     // Catch: java.lang.Throwable -> L182
        Lf0:
            r18 = r6
            if (r11 != 0) goto L13d
            java.lang.Object r4 = r0.e     // Catch: java.lang.Throwable -> L182
            r14 = r4
            zt3 r14 = (defpackage.zt3) r14     // Catch: java.lang.Throwable -> L182
            r14.getClass()     // Catch: java.lang.Throwable -> L182
            java.lang.Object r4 = r0.d     // Catch: java.lang.Throwable -> L182
            gj0 r4 = (defpackage.gj0) r4     // Catch: java.lang.Throwable -> L182
            r4.getClass()     // Catch: java.lang.Throwable -> L182
            eb r4 = r4.k     // Catch: java.lang.Throwable -> L182
            if (r4 == 0) goto L135
            zi0 r6 = new zi0     // Catch: java.lang.Throwable -> L182
            java.lang.Object r8 = r4.L     // Catch: java.lang.Throwable -> L182
            r11 = r8
            ze0 r11 = (defpackage.ze0) r11     // Catch: java.lang.Throwable -> L182
            java.lang.Object r8 = r4.X     // Catch: java.lang.Throwable -> L182
            r12 = r8
            rr6 r12 = (defpackage.rr6) r12     // Catch: java.lang.Throwable -> L182
            java.lang.Object r4 = r4.R     // Catch: java.lang.Throwable -> L182
            r13 = r4
            cj7 r13 = (defpackage.cj7) r13     // Catch: java.lang.Throwable -> L182
            r8 = r18
            r10 = r9
            r4 = r6
            r6 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L182
            java.lang.Object r5 = r0.d     // Catch: java.lang.Throwable -> L182
            gj0 r5 = (defpackage.gj0) r5     // Catch: java.lang.Throwable -> L182
            r5.getClass()     // Catch: java.lang.Throwable -> L182
            ex6 r5 = r5.o     // Catch: java.lang.Throwable -> L182
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L182
            t16 r5 = (defpackage.t16) r5     // Catch: java.lang.Throwable -> L182
            vt3 r11 = r14.b(r1, r4, r5)     // Catch: java.lang.Throwable -> L182
            goto L13d
        L135:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L182
            java.lang.String r1 = "CameraX not initialized yet."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L182
            throw r0     // Catch: java.lang.Throwable -> L182
        L13d:
            java.lang.Object r4 = r3.g     // Catch: java.lang.Throwable -> L182
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L182
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L182
            if (r4 == 0) goto L148
            goto L171
        L148:
            java.lang.Object r4 = r0.e     // Catch: java.lang.Throwable -> L182
            zt3 r4 = (defpackage.zt3) r4     // Catch: java.lang.Throwable -> L182
            r4.getClass()     // Catch: java.lang.Throwable -> L182
            java.lang.Object r5 = r0.d     // Catch: java.lang.Throwable -> L182
            gj0 r5 = (defpackage.gj0) r5     // Catch: java.lang.Throwable -> L182
            r5.getClass()     // Catch: java.lang.Throwable -> L182
            if0 r5 = r5.g     // Catch: java.lang.Throwable -> L182
            if (r5 == 0) goto L175
            java.lang.Object r5 = r5.g     // Catch: java.lang.Throwable -> L182
            ze0 r5 = (defpackage.ze0) r5     // Catch: java.lang.Throwable -> L182
            r4.a(r11, r3, r5)     // Catch: java.lang.Throwable -> L182
            java.lang.Object r0 = r0.h     // Catch: java.lang.Throwable -> L182
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L182
            my r3 = new my     // Catch: java.lang.Throwable -> L182
            int r1 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Throwable -> L182
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L182
            r0.add(r3)     // Catch: java.lang.Throwable -> L182
        L171:
            android.os.Trace.endSection()
            return r11
        L175:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L182
            java.lang.String r1 = "CameraX not initialized yet."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L182
            throw r0     // Catch: java.lang.Throwable -> L182
        L17d:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L17d
            throw r0     // Catch: java.lang.Throwable -> L182
        L180:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L182
        L182:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    @Override // defpackage.y23
    public void b() {
            r2 = this;
            java.lang.Object r0 = r2.a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.b
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.d
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            goto L21
        L18:
            java.lang.Object r0 = r2.e
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L21:
            java.lang.Object r0 = r2.f
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            java.lang.Object r2 = r2.c
            qn2 r2 = (defpackage.qn2) r2
            r2.g(r1)
            return
    }

    @Override // defpackage.y23
    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.h
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            java.lang.Object r2 = r2.g
            qn2 r2 = (defpackage.qn2) r2
            r2.g(r1)
            return
    }

    public java.lang.Object h(long r18, defpackage.s41 r20, java.lang.String r21, boolean r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            java.lang.Object r4 = r0.a
            pn5 r4 = (defpackage.pn5) r4
            boolean r5 = r3 instanceof defpackage.bo5
            if (r5 == 0) goto L1d
            r5 = r3
            bo5 r5 = (defpackage.bo5) r5
            int r6 = r5.h0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.h0 = r6
            goto L22
        L1d:
            bo5 r5 = new bo5
            r5.<init>(r0, r3)
        L22:
            java.lang.Object r3 = r5.f0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r5.h0
            java.lang.String r8 = ""
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r7 == 0) goto L67
            if (r7 == r11) goto L5b
            if (r7 == r10) goto L49
            if (r7 != r9) goto L43
            boolean r0 = r5.X
            oq1 r1 = r5.e0
            u75 r2 = r5.d0
            java.lang.String r4 = r5.Y
            defpackage.oi2.Y(r3)
            goto Lf1
        L43:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L49:
            boolean r0 = r5.X
            long r1 = r5.R
            u75 r7 = r5.d0
            pq5 r10 = r5.Z
            java.lang.String r11 = r5.Y
            defpackage.oi2.Y(r3)
            r15 = r7
            r7 = r3
            r3 = r15
            goto Lbf
        L5b:
            boolean r1 = r5.X
            long r13 = r5.R
            pq5 r2 = r5.Z
            java.lang.String r7 = r5.Y
            defpackage.oi2.Y(r3)
            goto L9d
        L67:
            defpackage.oi2.Y(r3)
            java.lang.Object r3 = r0.d
            sx1 r3 = (defpackage.sx1) r3
            lb4 r3 = r3.e
            boolean r7 = r3 instanceof defpackage.rx1
            if (r7 == 0) goto L77
            rx1 r3 = (defpackage.rx1) r3
            goto L78
        L77:
            r3 = r12
        L78:
            if (r3 == 0) goto L7d
            pq5 r3 = r3.o
            goto L7e
        L7d:
            r3 = r12
        L7e:
            if (r3 == 0) goto L11b
            r7 = r21
            r5.Y = r7
            r5.Z = r3
            r5.R = r1
            r13 = r22
            r5.X = r13
            r5.h0 = r11
            r11 = r4
            pl r11 = (defpackage.pl) r11
            java.lang.Object r11 = r11.i(r1, r5)
            if (r11 != r6) goto L98
            goto Lec
        L98:
            r15 = r1
            r1 = r13
            r13 = r15
            r2 = r3
            r3 = r11
        L9d:
            u75 r3 = (defpackage.u75) r3
            java.lang.Object r0 = r0.b
            p06 r0 = (defpackage.p06) r0
            android.net.Uri r11 = r2.d
            r5.Y = r7
            r5.Z = r2
            r5.d0 = r3
            r5.R = r13
            r5.X = r1
            r5.h0 = r10
            xb2 r0 = (defpackage.xb2) r0
            java.lang.Object r0 = r0.l(r11, r5)
            if (r0 != r6) goto Lba
            goto Lec
        Lba:
            r10 = r2
            r11 = r7
            r7 = r0
            r0 = r1
            r1 = r13
        Lbf:
            pq5 r7 = (defpackage.pq5) r7
            if (r7 == 0) goto Lcb
            long r13 = r7.j
            oq1 r7 = new oq1
            r7.<init>(r13)
            goto Lcc
        Lcb:
            r7 = r12
        Lcc:
            if (r3 == 0) goto L11b
            r75 r13 = r3.d
            r75 r14 = defpackage.r75.Core
            if (r13 != r14) goto Lff
            java.lang.String r10 = r10.i
            r5.Y = r11
            r5.Z = r12
            r5.d0 = r3
            r5.e0 = r7
            r5.R = r1
            r5.X = r0
            r5.h0 = r9
            pl r4 = (defpackage.pl) r4
            java.lang.Object r1 = r4.l(r10, r5)
            if (r1 != r6) goto Led
        Lec:
            return r6
        Led:
            r2 = r3
            r4 = r11
            r3 = r1
            r1 = r7
        Lf1:
            ja5 r3 = (defpackage.ja5) r3
            if (r3 == 0) goto Lf7
            java.lang.String r12 = r3.a
        Lf7:
            r7 = r1
            r3 = r2
            r11 = r4
            if (r12 != 0) goto Lfd
            goto L105
        Lfd:
            r8 = r12
            goto L105
        Lff:
            java.lang.String r1 = r3.c
            if (r1 != 0) goto L104
            goto L105
        L104:
            r8 = r1
        L105:
            s95 r1 = new s95
            java.net.URL r2 = r3.e
            r22 = r0
            r17 = r1
            r19 = r2
            r21 = r7
            r18 = r8
            r20 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            r0 = r17
            return r0
        L11b:
            return r12
    }

    public defpackage.w9 i(defpackage.mh0 r5) {
            r4 = this;
            java.lang.String r0 = "CX:getCameraInfo"
            java.lang.String r0 = defpackage.ln2.f0(r0)
            android.os.Trace.beginSection(r0)
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L58
            gj0 r0 = (defpackage.gj0) r0     // Catch: java.lang.Throwable -> L58
            r0.getClass()     // Catch: java.lang.Throwable -> L58
            kh0 r0 = r0.a     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashSet r0 = r0.c()     // Catch: java.lang.Throwable -> L58
            eg0 r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L58
            cg0 r0 = r0.q()     // Catch: java.lang.Throwable -> L58
            r0.getClass()     // Catch: java.lang.Throwable -> L58
            qe0 r5 = d(r4, r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = r0.d()     // Catch: java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L58
            ky r2 = r5.A     // Catch: java.lang.Throwable -> L58
            r3 = 0
            yf0 r1 = defpackage.nc1.J(r1, r3, r2)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r4.a     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r4.g     // Catch: java.lang.Throwable -> L4d
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L4f
            w9 r3 = new w9     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r0, r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.g     // Catch: java.lang.Throwable -> L4d
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L4d
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r4 = move-exception
            goto L56
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L58
            w9 r3 = (defpackage.w9) r3     // Catch: java.lang.Throwable -> L58
            android.os.Trace.endSection()
            return r3
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L58
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
    }

    public void j(defpackage.gj0 r4, android.content.Context r5) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            r3.d = r4     // Catch: java.lang.Throwable -> L27
            r3.f = r5     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            gh0 r4 = r4.n     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            ov2 r5 = defpackage.u24.x()     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            fh0 r1 = new fh0     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.CopyOnWriteArrayList r2 = r4.n     // Catch: java.lang.Throwable -> L27
            r2.add(r1)     // Catch: java.lang.Throwable -> L27
            ch0 r1 = new ch0     // Catch: java.lang.Throwable -> L27
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27
            r5.execute(r1)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r3 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)
            return
        L2b:
            monitor-exit(r0)
            throw r3
    }

    public defpackage.ff7 k(defpackage.ff7 r7, defpackage.jf7 r8) {
            r6 = this;
            z66 r0 = r7.b
            z66 r1 = r7.a
            java.util.List r2 = r1.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L13
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = r4
            goto L14
        L13:
            r2 = r3
        L14:
            java.util.List r5 = r0.c
            if (r5 == 0) goto L1e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L25
        L1e:
            ok3 r5 = r8.e
            mk3 r5 = r5.b
            if (r5 == 0) goto L25
            goto L26
        L25:
            r3 = r4
        L26:
            if (r2 != 0) goto L2c
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            return r7
        L2c:
            java.lang.Object r6 = r6.a
            ne1 r6 = (defpackage.ne1) r6
            ff7 r6 = r6.c(r8)
            r7 = 3
            r8 = 0
            if (r2 == 0) goto L40
            z66 r2 = r6.a
            java.util.List r2 = r2.c
            z66 r1 = defpackage.z66.a(r1, r8, r8, r2, r7)
        L40:
            if (r3 == 0) goto L4a
            z66 r6 = r6.b
            java.util.List r6 = r6.c
            z66 r0 = defpackage.z66.a(r0, r8, r8, r6, r7)
        L4a:
            ff7 r6 = new ff7
            r6.<init>(r1, r0)
            return r6
    }

    public java.lang.Object l(java.lang.String r24, int r25, long r26, defpackage.gd0 r28, defpackage.bx r29, defpackage.s41 r30) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r30
            boolean r3 = r2 instanceof defpackage.wh0
            if (r3 == 0) goto L19
            r3 = r2
            wh0 r3 = (defpackage.wh0) r3
            int r4 = r3.g0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.g0 = r4
            goto L1e
        L19:
            wh0 r3 = new wh0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.e0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.g0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L4c
            if (r5 == r7) goto L37
            if (r5 != r6) goto L31
            defpackage.oi2.Y(r2)
            return r2
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L37:
            long r9 = r3.d0
            int r1 = r3.Z
            bx r5 = r3.Y
            gd0 r11 = r3.X
            java.lang.String r12 = r3.R
            defpackage.oi2.Y(r2)
            r20 = r5
            r13 = r9
            r17 = r11
            r10 = r12
            r12 = r1
            goto L90
        L4c:
            defpackage.oi2.Y(r2)
            java.lang.Object r2 = r0.b
            ld0 r2 = (defpackage.ld0) r2
            r3.R = r1
            r5 = r28
            r3.X = r5
            r9 = r29
            r3.Y = r9
            r10 = r25
            r3.Z = r10
            r11 = r26
            r3.d0 = r11
            r3.g0 = r7
            android.util.ArrayMap r13 = r2.f
            monitor-enter(r13)
            android.util.ArrayMap r14 = r2.f     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r14 = r14.get(r1)     // Catch: java.lang.Throwable -> Ld9
            lg0 r14 = (defpackage.lg0) r14     // Catch: java.lang.Throwable -> Ld9
            if (r14 == 0) goto L77
            monitor-exit(r13)
            r2 = r14
            goto L86
        L77:
            monitor-exit(r13)
            t57 r13 = r2.b
            n61 r13 = r13.f
            m5 r14 = new m5
            r15 = 7
            r14.<init>(r2, r1, r8, r15)
            java.lang.Object r2 = defpackage.hv.d0(r13, r14, r3)
        L86:
            if (r2 != r4) goto L89
            goto Ld7
        L89:
            r17 = r5
            r20 = r9
            r13 = r11
            r12 = r10
            r10 = r1
        L90:
            r11 = r2
            lg0 r11 = (defpackage.lg0) r11
            vd r9 = new vd
            java.lang.Object r1 = r0.e
            r15 = r1
            yx6 r15 = (defpackage.yx6) r15
            java.lang.Object r1 = r0.c
            r16 = r1
            id0 r16 = (defpackage.id0) r16
            java.lang.Object r1 = r0.d
            r18 = r1
            nd0 r18 = (defpackage.nd0) r18
            java.lang.Object r1 = r0.g
            r19 = r1
            t57 r19 = (defpackage.t57) r19
            java.lang.Object r1 = r0.f
            og0 r1 = (defpackage.og0) r1
            android.hardware.camera2.CameraDevice$StateCallback r2 = r1.a
            u63 r1 = r1.b
            r22 = r1
            r21 = r2
            r9.<init>(r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22)
            bi0 r1 = new bi0
            r1.<init>(r0, r10, r9, r8)
            r3.R = r8
            r3.X = r8
            r3.Y = r8
            r3.g0 = r6
            fu6 r0 = new fu6
            l61 r2 = r3.b()
            r0.<init>(r3, r2)
            java.lang.Object r0 = defpackage.mp2.Z(r0, r7, r0, r1)
            if (r0 != r4) goto Ld8
        Ld7:
            return r4
        Ld8:
            return r0
        Ld9:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
    }

    public void m() {
            r1 = this;
            java.lang.String r0 = "CX:unbindAll"
            java.lang.String r0 = defpackage.ln2.f0(r0)
            android.os.Trace.beginSection(r0)
            defpackage.nj2.h()     // Catch: java.lang.Throwable -> L22
            r0 = 0
            e(r1, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r1.e     // Catch: java.lang.Throwable -> L22
            zt3 r0 = (defpackage.zt3) r0     // Catch: java.lang.Throwable -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.h     // Catch: java.lang.Throwable -> L22
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> L22
            r0.j(r1)     // Catch: java.lang.Throwable -> L22
            android.os.Trace.endSection()
            return
        L22:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }

    public void n(java.util.List r2) {
            r1 = this;
            java.lang.Object r1 = r1.e
            tp6 r1 = (defpackage.tp6) r1
            r1.getClass()
            r0 = 0
            r1.m(r0, r2)
            return
    }

    public void o(defpackage.d83 r2) {
            r1 = this;
            java.lang.Object r1 = r1.c
            tp6 r1 = (defpackage.tp6) r1
            r1.getClass()
            r0 = 0
            r1.m(r0, r2)
            return
    }
}
