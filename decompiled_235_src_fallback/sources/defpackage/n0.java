package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ n0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final void a() {
            r5 = this;
            java.lang.Object r5 = r5.B
            vi2 r5 = (defpackage.vi2) r5
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r1 = r5.d
            monitor-enter(r1)
            hv r2 = r5.h     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r5 = move-exception
            goto Lcb
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            rj2 r1 = r5.c()     // Catch: java.lang.Throwable -> L24
            int r2 = r1.f     // Catch: java.lang.Throwable -> L24
            r3 = 2
            if (r2 != r3) goto L27
            java.lang.Object r3 = r5.d     // Catch: java.lang.Throwable -> L24
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            goto Lb7
        L27:
            if (r2 != 0) goto La0
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            java.lang.reflect.Method r2 = defpackage.v87.b     // Catch: java.lang.Throwable -> L93
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L93
            w31 r0 = r5.c     // Catch: java.lang.Throwable -> L93
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L93
            r0.getClass()     // Catch: java.lang.Throwable -> L93
            rj2[] r0 = new defpackage.rj2[]{r1}     // Catch: java.lang.Throwable -> L93
            bl2 r3 = defpackage.je7.a     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r3 = defpackage.ln2.f0(r3)     // Catch: java.lang.Throwable -> L93
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L93
            bl2 r3 = defpackage.je7.a     // Catch: java.lang.Throwable -> L95
            r4 = 0
            android.graphics.Typeface r0 = r3.p(r2, r0, r4)     // Catch: java.lang.Throwable -> L95
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L93
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L93
            android.net.Uri r1 = r1.a     // Catch: java.lang.Throwable -> L93
            java.nio.MappedByteBuffer r1 = defpackage.kn2.T(r2, r1)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L8b
            if (r0 == 0) goto L8b
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L84
            eb r2 = new eb     // Catch: java.lang.Throwable -> L84
            q54 r1 = defpackage.mp2.S(r1)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L84
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L93
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r5.d     // Catch: java.lang.Throwable -> L24
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L24
            hv r1 = r5.h     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7d
            r1.P(r2)     // Catch: java.lang.Throwable -> L7b
            goto L7d
        L7b:
            r1 = move-exception
            goto L82
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            r5.b()     // Catch: java.lang.Throwable -> L24
            return
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r1     // Catch: java.lang.Throwable -> L24
        L84:
            r0 = move-exception
            java.lang.reflect.Method r1 = defpackage.v87.b     // Catch: java.lang.Throwable -> L93
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L8b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            goto L9a
        L95:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L9a:
            java.lang.reflect.Method r1 = defpackage.v87.b     // Catch: java.lang.Throwable -> L24
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        La0:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r3.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        Lb7:
            java.lang.Object r2 = r5.d
            monitor-enter(r2)
            hv r1 = r5.h     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lc4
            r1.O(r0)     // Catch: java.lang.Throwable -> Lc2
            goto Lc4
        Lc2:
            r5 = move-exception
            goto Lc9
        Lc4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc2
            r5.b()
            return
        Lc9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc2
            throw r5
        Lcb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }

    @Override // java.lang.Runnable
    public final void run() {
            r33 = this;
            r0 = r33
            int r1 = r0.A
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r1) {
                case 0: goto L539;
                case 1: goto L49e;
                case 2: goto L473;
                case 3: goto L3b9;
                case 4: goto L3ad;
                case 5: goto L16f;
                case 6: goto L165;
                case 7: goto L15b;
                case 8: goto L14d;
                case 9: goto L141;
                case 10: goto L139;
                case 11: goto L131;
                case 12: goto L123;
                case 13: goto L11b;
                case 14: goto L113;
                case 15: goto L105;
                case 16: goto Ldd;
                case 17: goto Ld5;
                case 18: goto Lcb;
                case 19: goto Lbb;
                case 20: goto Lb1;
                case 21: goto L8e;
                case 22: goto L86;
                case 23: goto L77;
                case 24: goto L6f;
                case 25: goto L5e;
                case 26: goto L5a;
                case 27: goto L41;
                case 28: goto L24;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r0.B
            y13 r0 = (defpackage.y13) r0
            java.lang.Object r1 = r0.s0
            monitor-enter(r1)
            r0.u0 = r3     // Catch: java.lang.Throwable -> L1e
            s23 r2 = r0.t0     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            r0.t0 = r3     // Catch: java.lang.Throwable -> L1e
            r0.f(r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L24:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView) r0
            boolean r1 = r0.q0
            if (r1 == 0) goto L40
            boolean r1 = r0.t0
            if (r1 != 0) goto L40
            r0.q0 = r5
            r0.performHapticFeedback(r5)
            on2 r1 = r0.n1
            if (r1 == 0) goto L3d
            r1.c()
            goto L40
        L3d:
            r0.setEditRegionsMode(r4)
        L40:
            return
        L41:
            java.lang.Object r0 = r0.B
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            java.util.ArrayList r0 = r0.n
            int r1 = r0.size()
        L4b:
            if (r5 >= r1) goto L59
            java.lang.Object r2 = r0.get(r5)
            int r5 = r5 + 1
            gd6 r2 = (defpackage.gd6) r2
            r2.getClass()
            goto L4b
        L59:
            return
        L5a:
            r0.a()
            return
        L5e:
            java.lang.Object r0 = r0.B
            xb2 r0 = (defpackage.xb2) r0
            android.content.Context r0 = r0.a
            r1 = 2131952555(0x7f1303ab, float:1.9541556E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r5)
            r0.show()
            return
        L6f:
            java.lang.Object r0 = r0.B
            c92 r0 = (defpackage.c92) r0
            r0.b()
            return
        L77:
            java.lang.Object r0 = r0.B
            b31 r0 = (defpackage.b31) r0
            kv7 r1 = new kv7
            yt1 r2 = defpackage.yt1.A
            r1.<init>(r2)
            r0.accept(r1)
            return
        L86:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r0 = (me.magnum.melonds.impl.emulator.EmulatorMessageQueue) r0
            r0.e()
            return
        L8e:
            java.lang.Object r0 = r0.B
            s9 r0 = (defpackage.s9) r0
            java.lang.Object r0 = r0.d
            qs0 r0 = (defpackage.qs0) r0
            if (r0 == 0) goto Lb0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            qv6 r1 = (defpackage.qv6) r1
            r1.b()
            goto La0
        Lb0:
            return
        Lb1:
            java.lang.Object r0 = r0.B
            mq1 r0 = (defpackage.mq1) r0
            r0.f = r4
            r0.c()
            return
        Lbb:
            java.lang.Object r0 = r0.B
            vp1 r0 = (defpackage.vp1) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            boolean r1 = r1.isPopupShowing()
            r0.s(r1)
            r0.m = r1
            return
        Lcb:
            java.lang.Object r0 = r0.B
            qf1 r0 = (defpackage.qf1) r0
            r0.j = r4
            r0.c()
            return
        Ld5:
            java.lang.Object r0 = r0.B
            wv6 r0 = (defpackage.wv6) r0
            r0.close()
            return
        Ldd:
            java.lang.Object r0 = r0.B
            androidx.fragment.app.g r0 = (androidx.fragment.app.g) r0
            boolean r1 = androidx.fragment.app.u.K(r2)
            if (r1 == 0) goto Lee
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "Transition for all operations has completed"
            android.util.Log.v(r1, r2)
        Lee:
            java.util.ArrayList r1 = r0.c
            int r2 = r1.size()
        Lf4:
            if (r5 >= r2) goto L104
            java.lang.Object r3 = r1.get(r5)
            int r5 = r5 + 1
            nf1 r3 = (defpackage.nf1) r3
            androidx.fragment.app.b0 r3 = r3.a
            r3.c(r0)
            goto Lf4
        L104:
            return
        L105:
            java.lang.Object r0 = r0.B
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r0 = r0.A
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto L112
            r0.c()
        L112:
            return
        L113:
            java.lang.Object r0 = r0.B
            sz1 r0 = (defpackage.sz1) r0
            r0.L0(r5)
            return
        L11b:
            java.lang.Object r0 = r0.B
            qv0 r0 = (defpackage.qv0) r0
            defpackage.qv0.c(r0)
            return
        L123:
            java.lang.Object r0 = r0.B
            jv0 r0 = (defpackage.jv0) r0
            java.lang.Runnable r1 = r0.B
            if (r1 == 0) goto L130
            r1.run()
            r0.B = r3
        L130:
            return
        L131:
            java.lang.Object r0 = r0.B
            lr0 r0 = (defpackage.lr0) r0
            r0.s(r4)
            return
        L139:
            java.lang.Object r0 = r0.B
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.o0()
            return
        L141:
            java.lang.Object r0 = r0.B
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = -3
            android.os.Process.setThreadPriority(r1)
            r0.run()
            return
        L14d:
            java.lang.Object r0 = r0.B
            rd0 r0 = (defpackage.rd0) r0
            a6 r1 = new a6
            r2 = 6
            r1.<init>(r0, r3, r2)
            defpackage.hv.W(r1)
            return
        L15b:
            java.lang.Object r0 = r0.B
            ed0 r0 = (defpackage.ed0) r0
            o41 r0 = r0.e
            defpackage.g04.x(r0, r3)
            return
        L165:
            java.lang.Object r0 = r0.B
            bx r0 = (defpackage.bx) r0
            o41 r0 = r0.a
            defpackage.g04.x(r0, r3)
            return
        L16f:
            java.lang.Object r0 = r0.B
            po r0 = (defpackage.po) r0
            os0 r0 = r0.c
            java.lang.Object r0 = r0.B
            po r0 = (defpackage.po) r0
            long r1 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r6 = r0.b
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = r5
        L184:
            int r10 = r6.size()
            if (r9 >= r10) goto L355
            java.lang.Object r10 = r6.get(r9)
            fo6 r10 = (defpackage.fo6) r10
            if (r10 != 0) goto L19a
        L192:
            r20 = r1
            r33 = r6
            r18 = r7
            goto L348
        L19a:
            ci6 r11 = r0.a
            java.lang.Object r12 = r11.get(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 != 0) goto L1a5
            goto L1b0
        L1a5:
            long r12 = r12.longValue()
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 >= 0) goto L192
            r11.remove(r10)
        L1b0:
            long r11 = r10.i
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L1c0
            r10.i = r1
            float r11 = r10.b
            r10.c(r11)
            goto L192
        L1c0:
            long r11 = r1 - r11
            r10.i = r1
            po r15 = defpackage.fo6.b()
            float r15 = r15.g
            r13 = 0
            int r14 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r14 != 0) goto L1d5
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L1d2:
            r23 = r11
            goto L1d9
        L1d5:
            float r11 = (float) r11
            float r11 = r11 / r15
            long r11 = (long) r11
            goto L1d2
        L1d9:
            boolean r11 = r10.o
            float r12 = r10.n
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r11 == 0) goto L1ff
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 == 0) goto L1ed
            go6 r11 = r10.m
            double r3 = (double) r12
            r11.i = r3
            r10.n = r14
        L1ed:
            go6 r3 = r10.m
            double r3 = r3.i
            float r3 = (float) r3
            r10.b = r3
            r10.a = r13
            r10.o = r5
            r33 = r6
            r18 = r7
        L1fc:
            r3 = 1
            goto L294
        L1ff:
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            go6 r4 = r10.m
            float r11 = r10.b
            float r12 = r10.a
            if (r3 == 0) goto L23d
            r33 = r6
            double r5 = (double) r11
            double r11 = (double) r12
            r18 = 2
            long r31 = r23 / r18
            r26 = r4
            r27 = r5
            r29 = r11
            gv r4 = r26.c(r27, r29, r31)
            go6 r5 = r10.m
            float r6 = r10.n
            double r11 = (double) r6
            r5.i = r11
            r10.n = r14
            float r6 = r4.a
            double r11 = (double) r6
            float r4 = r4.b
            double r3 = (double) r4
            r29 = r3
            r26 = r5
            r27 = r11
            gv r3 = r26.c(r27, r29, r31)
            float r4 = r3.a
            r10.b = r4
            float r3 = r3.b
            r10.a = r3
            goto L253
        L23d:
            r18 = r4
            r33 = r6
            double r3 = (double) r11
            double r11 = (double) r12
            r19 = r3
            r21 = r11
            gv r3 = r18.c(r19, r21, r23)
            float r4 = r3.a
            r10.b = r4
            float r3 = r3.b
            r10.a = r3
        L253:
            float r3 = r10.b
            float r4 = r10.h
            float r3 = java.lang.Math.max(r3, r4)
            r10.b = r3
            float r4 = r10.g
            float r3 = java.lang.Math.min(r3, r4)
            r10.b = r3
            float r4 = r10.a
            go6 r5 = r10.m
            r5.getClass()
            float r4 = java.lang.Math.abs(r4)
            double r11 = (double) r4
            r18 = r7
            double r6 = r5.e
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto L293
            double r6 = r5.i
            float r6 = (float) r6
            float r3 = r3 - r6
            float r3 = java.lang.Math.abs(r3)
            double r6 = (double) r3
            double r11 = r5.d
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 >= 0) goto L293
            go6 r3 = r10.m
            double r5 = r3.i
            float r3 = (float) r5
            r10.b = r3
            r10.a = r13
            goto L1fc
        L293:
            r3 = 0
        L294:
            float r5 = r10.b
            float r6 = r10.g
            float r5 = java.lang.Math.min(r5, r6)
            r10.b = r5
            float r6 = r10.h
            float r5 = java.lang.Math.max(r5, r6)
            r10.b = r5
            r10.c(r5)
            if (r3 == 0) goto L346
            java.util.ArrayList r5 = r10.k
            r3 = 0
            r10.f = r3
            po r4 = defpackage.fo6.b()
            ci6 r6 = r4.a
            r6.remove(r10)
            java.util.ArrayList r6 = r4.b
            int r7 = r6.indexOf(r10)
            if (r7 < 0) goto L2c8
            r15 = 0
            r6.set(r7, r15)
            r6 = 1
            r4.f = r6
        L2c8:
            r6 = 0
            r10.i = r6
            r3 = 0
            r10.c = r3
            r4 = 0
        L2d0:
            int r6 = r5.size()
            if (r4 >= r6) goto L330
            java.lang.Object r6 = r5.get(r4)
            if (r6 == 0) goto L327
            java.lang.Object r6 = r5.get(r4)
            y97 r6 = (defpackage.y97) r6
            float r7 = r10.b
            z97 r6 = r6.a
            fa6 r8 = defpackage.fa6.L
            qa7 r11 = r6.h
            r12 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 >= 0) goto L31e
            long r12 = r11.t0
            r3 = 0
            ea7 r7 = r11.R(r3)
            ea7 r14 = r7.o0
            r15 = 0
            r7.o0 = r15
            r7 = r4
            long r3 = r6.a
            r20 = r1
            r1 = -1
            r11.H(r1, r3)
            r11.H(r12, r1)
            r6.a = r12
            java.lang.Runnable r1 = r6.g
            if (r1 == 0) goto L312
            r1.run()
        L312:
            java.util.ArrayList r1 = r11.q0
            r1.clear()
            if (r14 == 0) goto L32a
            r6 = 1
            r14.A(r14, r8, r6)
            goto L32b
        L31e:
            r20 = r1
            r7 = r4
            r3 = 0
            r6 = 1
            r11.A(r11, r8, r3)
            goto L32b
        L327:
            r20 = r1
            r7 = r4
        L32a:
            r6 = 1
        L32b:
            int r4 = r7 + 1
            r1 = r20
            goto L2d0
        L330:
            r20 = r1
            r6 = 1
            int r1 = r5.size()
            int r1 = r1 - r6
        L338:
            if (r1 < 0) goto L348
            java.lang.Object r2 = r5.get(r1)
            if (r2 != 0) goto L343
            r5.remove(r1)
        L343:
            int r1 = r1 + (-1)
            goto L338
        L346:
            r20 = r1
        L348:
            int r9 = r9 + 1
            r3 = 0
            r4 = 1
            r6 = r33
            r7 = r18
            r1 = r20
            r5 = 0
            goto L184
        L355:
            r33 = r6
            boolean r1 = r0.f
            if (r1 == 0) goto L393
            int r1 = r33.size()
            r25 = 1
            int r1 = r1 + (-1)
        L363:
            if (r1 < 0) goto L375
            r2 = r33
            java.lang.Object r4 = r2.get(r1)
            if (r4 != 0) goto L370
            r2.remove(r1)
        L370:
            int r1 = r1 + (-1)
            r33 = r2
            goto L363
        L375:
            r2 = r33
            int r1 = r2.size()
            if (r1 != 0) goto L38f
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r1 < r4) goto L38f
            u63 r1 = r0.h
            java.lang.Object r4 = r1.B
            no r4 = (defpackage.no) r4
            defpackage.o2.x(r4)
            r15 = 0
            r1.B = r15
        L38f:
            r3 = 0
            r0.f = r3
            goto L396
        L393:
            r2 = r33
            r3 = 0
        L396:
            int r1 = r2.size()
            if (r1 <= 0) goto L3ac
            u63 r1 = r0.e
            n0 r0 = r0.d
            java.lang.Object r1 = r1.B
            android.view.Choreographer r1 = (android.view.Choreographer) r1
            oo r2 = new oo
            r2.<init>(r0, r3)
            r1.postFrameCallback(r2)
        L3ac:
            return
        L3ad:
            java.lang.Object r0 = r0.B
            hm r0 = (defpackage.hm) r0
            android.view.ActionMode r0 = r0.h
            if (r0 == 0) goto L3b8
            r0.finish()
        L3b8:
            return
        L3b9:
            java.lang.Object r0 = r0.B
            qf r0 = (defpackage.qf) r0
            boolean r1 = r0.d()
            te r4 = r0.A
            if (r1 != 0) goto L3c7
            goto L468
        L3c7:
            java.lang.String r1 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r1)
            r6 = 1
            r4.s(r6)     // Catch: java.lang.Throwable -> L46e
            p94 r1 = r0.g0     // Catch: java.lang.Throwable -> L46e
            int[] r5 = r1.b     // Catch: java.lang.Throwable -> L46e
            long[] r1 = r1.a     // Catch: java.lang.Throwable -> L46e
            int r6 = r1.length     // Catch: java.lang.Throwable -> L46e
            int r6 = r6 - r2
            if (r6 < 0) goto L441
            r2 = 0
        L3db:
            r7 = r1[r2]     // Catch: java.lang.Throwable -> L46e
            long r9 = ~r7     // Catch: java.lang.Throwable -> L46e
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L438
            int r9 = r2 - r6
            int r9 = ~r9     // Catch: java.lang.Throwable -> L46e
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r7
            r7 = 0
        L3f6:
            if (r7 >= r9) goto L433
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r11
            r15 = 128(0x80, double:6.3E-322)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto L42b
            int r8 = r2 << 3
            int r8 = r8 + r7
            r14 = r5[r8]     // Catch: java.lang.Throwable -> L46e
            g93 r8 = r0.c()     // Catch: java.lang.Throwable -> L46e
            boolean r8 = r8.a(r14)     // Catch: java.lang.Throwable -> L46e
            if (r8 != 0) goto L42b
            java.util.ArrayList r8 = r0.R     // Catch: java.lang.Throwable -> L46e
            h31 r13 = new h31     // Catch: java.lang.Throwable -> L46e
            r20 = r4
            long r3 = r0.f0     // Catch: java.lang.Throwable -> L46e
            i31 r17 = defpackage.i31.VIEW_DISAPPEAR     // Catch: java.lang.Throwable -> L46e
            r18 = 0
            r15 = r3
            r13.<init>(r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L46e
            r8.add(r13)     // Catch: java.lang.Throwable -> L46e
            v80 r3 = r0.d0     // Catch: java.lang.Throwable -> L46e
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L46e
            r3.c(r4)     // Catch: java.lang.Throwable -> L46e
            goto L42d
        L42b:
            r20 = r4
        L42d:
            long r11 = r11 >> r10
            int r7 = r7 + 1
            r4 = r20
            goto L3f6
        L433:
            r20 = r4
            if (r9 != r10) goto L443
            goto L43a
        L438:
            r20 = r4
        L43a:
            if (r2 == r6) goto L443
            int r2 = r2 + 1
            r4 = r20
            goto L3db
        L441:
            r20 = r4
        L443:
            java.lang.String r1 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L46e
            ab6 r1 = r20.getSemanticsOwner()     // Catch: java.lang.Throwable -> L469
            xa6 r1 = r1.a()     // Catch: java.lang.Throwable -> L469
            ya6 r2 = r0.h0     // Catch: java.lang.Throwable -> L469
            r0.f(r1, r2)     // Catch: java.lang.Throwable -> L469
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L46e
            g93 r1 = r0.c()     // Catch: java.lang.Throwable -> L46e
            r0.b(r1)     // Catch: java.lang.Throwable -> L46e
            r0.k()     // Catch: java.lang.Throwable -> L46e
            r3 = 0
            r0.i0 = r3     // Catch: java.lang.Throwable -> L46e
            android.os.Trace.endSection()
        L468:
            return
        L469:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L46e
            throw r0     // Catch: java.lang.Throwable -> L46e
        L46e:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L473:
            java.lang.Object r0 = r0.B
            ze r0 = (defpackage.ze) r0
            java.lang.String r1 = "measureAndLayout"
            android.os.Trace.beginSection(r1)
            te r1 = r0.R     // Catch: java.lang.Throwable -> L499
            r6 = 1
            r1.s(r6)     // Catch: java.lang.Throwable -> L499
            android.os.Trace.endSection()
            java.lang.String r1 = "checkForSemanticsChanges"
            android.os.Trace.beginSection(r1)
            r0.n()     // Catch: java.lang.Throwable -> L494
            android.os.Trace.endSection()
            r3 = 0
            r0.E0 = r3
            return
        L494:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L499:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L49e:
            r6 = r4
            java.lang.Object r0 = r0.B
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L538
            android.os.Handler r4 = defpackage.x8.g
            java.lang.reflect.Method r0 = defpackage.x8.f
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r5 < r7) goto L4b9
            r1.recreate()
            goto L538
        L4b9:
            r7 = 27
            r8 = 26
            if (r5 == r8) goto L4c1
            if (r5 != r7) goto L4c5
        L4c1:
            if (r0 != 0) goto L4c5
            goto L535
        L4c5:
            java.lang.reflect.Method r9 = defpackage.x8.e
            if (r9 != 0) goto L4cf
            java.lang.reflect.Method r9 = defpackage.x8.d
            if (r9 != 0) goto L4cf
            goto L535
        L4cf:
            java.lang.reflect.Field r9 = defpackage.x8.c     // Catch: java.lang.Throwable -> L535
            java.lang.Object r10 = r9.get(r1)     // Catch: java.lang.Throwable -> L535
            if (r10 != 0) goto L4d8
            goto L535
        L4d8:
            java.lang.reflect.Field r9 = defpackage.x8.b     // Catch: java.lang.Throwable -> L535
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L535
            if (r9 != 0) goto L4e1
            goto L535
        L4e1:
            android.app.Application r11 = r1.getApplication()     // Catch: java.lang.Throwable -> L535
            w8 r12 = new w8     // Catch: java.lang.Throwable -> L535
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L535
            r11.registerActivityLifecycleCallbacks(r12)     // Catch: java.lang.Throwable -> L535
            uo2 r13 = new uo2     // Catch: java.lang.Throwable -> L535
            r13.<init>(r2, r12, r10)     // Catch: java.lang.Throwable -> L535
            r4.post(r13)     // Catch: java.lang.Throwable -> L535
            if (r5 == r8) goto L4fb
            if (r5 != r7) goto L4fa
            goto L4fb
        L4fa:
            r6 = 0
        L4fb:
            r2 = 3
            if (r6 == 0) goto L51e
            r3 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L51a
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L51a
            r15 = 0
            r16 = 0
            r3 = r11
            r11 = 0
            r5 = r12
            r12 = 0
            r17 = r14
            r18 = r14
            java.lang.Object[] r6 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16, r17, r18}     // Catch: java.lang.Throwable -> L518
            r0.invoke(r9, r6)     // Catch: java.lang.Throwable -> L518
            goto L523
        L518:
            r0 = move-exception
            goto L52c
        L51a:
            r0 = move-exception
            r3 = r11
            r5 = r12
            goto L52c
        L51e:
            r3 = r11
            r5 = r12
            r1.recreate()     // Catch: java.lang.Throwable -> L518
        L523:
            uo2 r0 = new uo2     // Catch: java.lang.Throwable -> L535
            r0.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L535
            r4.post(r0)     // Catch: java.lang.Throwable -> L535
            goto L538
        L52c:
            uo2 r6 = new uo2     // Catch: java.lang.Throwable -> L535
            r6.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L535
            r4.post(r6)     // Catch: java.lang.Throwable -> L535
            throw r0     // Catch: java.lang.Throwable -> L535
        L535:
            r1.recreate()
        L538:
            return
        L539:
            java.lang.Object r0 = r0.B
            p0 r0 = (defpackage.p0) r0
            r0.b()
            return
    }
}
