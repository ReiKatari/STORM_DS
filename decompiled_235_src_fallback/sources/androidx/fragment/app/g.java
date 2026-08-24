package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class g extends defpackage.wn6 {
    public final java.util.ArrayList c;
    public final androidx.fragment.app.b0 d;
    public final androidx.fragment.app.b0 e;
    public final defpackage.dm2 f;
    public final java.lang.Object g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public final defpackage.wu j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;
    public final defpackage.wu m;
    public final defpackage.wu n;
    public final boolean o;
    public final defpackage.uj0 p;
    public java.lang.Object q;
    public boolean r;

    public g(java.util.ArrayList r1, androidx.fragment.app.b0 r2, androidx.fragment.app.b0 r3, defpackage.dm2 r4, java.lang.Object r5, java.util.ArrayList r6, java.util.ArrayList r7, defpackage.wu r8, java.util.ArrayList r9, java.util.ArrayList r10, defpackage.wu r11, defpackage.wu r12, boolean r13) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.k = r9
            r0.l = r10
            r0.m = r11
            r0.n = r12
            r0.o = r13
            uj0 r1 = new uj0
            r1.<init>()
            r0.p = r1
            return
    }

    public static void f(android.view.View r4, java.util.ArrayList r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L30
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = defpackage.jo7.a
            boolean r1 = r0.isTransitionGroup()
            if (r1 == 0) goto L19
            boolean r0 = r5.contains(r4)
            if (r0 != 0) goto L39
            r5.add(r4)
            return
        L19:
            int r4 = r0.getChildCount()
            r1 = 0
        L1e:
            if (r1 >= r4) goto L39
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2d
            f(r2, r5)
        L2d:
            int r1 = r1 + 1
            goto L1e
        L30:
            boolean r0 = r5.contains(r4)
            if (r0 != 0) goto L39
            r5.add(r4)
        L39:
            return
    }

    @Override // defpackage.wn6
    public final boolean a() {
            r8 = this;
            dm2 r0 = r8.f
            boolean r1 = r0.l()
            r2 = 0
            if (r1 == 0) goto L3e
            java.util.ArrayList r1 = r8.c
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12
            goto L32
        L12:
            int r3 = r1.size()
            r4 = r2
        L17:
            if (r4 >= r3) goto L32
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            nf1 r5 = (defpackage.nf1) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r6 < r7) goto L3e
            java.lang.Object r5 = r5.b
            if (r5 == 0) goto L3e
            boolean r5 = r0.m(r5)
            if (r5 == 0) goto L3e
            goto L17
        L32:
            java.lang.Object r8 = r8.g
            if (r8 == 0) goto L3c
            boolean r8 = r0.m(r8)
            if (r8 == 0) goto L3e
        L3c:
            r8 = 1
            return r8
        L3e:
            return r2
    }

    @Override // defpackage.wn6
    public final void b(android.view.ViewGroup r1) {
            r0 = this;
            r1.getClass()
            uj0 r0 = r0.p
            r0.a()
            return
    }

    @Override // defpackage.wn6
    public final void c(android.view.ViewGroup r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r1.getClass()
            boolean r2 = r1.isLaidOut()
            java.util.ArrayList r4 = r0.c
            r5 = 2
            java.lang.String r6 = "FragmentManager"
            if (r2 == 0) goto L16
            boolean r2 = r0.r
            if (r2 == 0) goto L1a
        L16:
            r16 = r5
            goto Lbb
        L1a:
            java.lang.Object r2 = r0.q
            java.lang.String r7 = " to "
            dm2 r8 = r0.f
            androidx.fragment.app.b0 r9 = r0.e
            androidx.fragment.app.b0 r10 = r0.d
            if (r2 == 0) goto L47
            r8.c(r2)
            boolean r0 = androidx.fragment.app.u.K(r5)
            if (r0 == 0) goto Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ending execution of operations from "
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
            return
        L47:
            vr4 r2 = r0.g(r1, r9, r10)
            java.lang.Object r11 = r2.A
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r2 = r2.B
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.ht0.v0(r4, r13)
            r12.<init>(r13)
            int r13 = r4.size()
            r14 = 0
        L61:
            if (r14 >= r13) goto L71
            java.lang.Object r15 = r4.get(r14)
            int r14 = r14 + 1
            nf1 r15 = (defpackage.nf1) r15
            androidx.fragment.app.b0 r15 = r15.a
            r12.add(r15)
            goto L61
        L71:
            int r4 = r12.size()
            r13 = 0
        L76:
            if (r13 >= r4) goto L92
            java.lang.Object r14 = r12.get(r13)
            int r13 = r13 + 1
            androidx.fragment.app.b0 r14 = (androidx.fragment.app.b0) r14
            androidx.fragment.app.o r15 = r14.c
            r16 = r5
            kf1 r5 = new kf1
            r3 = 1
            r5.<init>(r14, r0, r3)
            uj0 r3 = r0.p
            r8.u(r15, r2, r3, r5)
            r5 = r16
            goto L76
        L92:
            r16 = r5
            mf1 r3 = new mf1
            r4 = 0
            r3.<init>(r0, r1, r2, r4)
            r0.i(r11, r1, r3)
            boolean r0 = androidx.fragment.app.u.K(r16)
            if (r0 == 0) goto Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Completed executing operations from "
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
        Lba:
            return
        Lbb:
            int r2 = r4.size()
            r3 = 0
        Lc0:
            if (r3 >= r2) goto L107
            java.lang.Object r5 = r4.get(r3)
            int r3 = r3 + 1
            nf1 r5 = (defpackage.nf1) r5
            androidx.fragment.app.b0 r7 = r5.a
            boolean r8 = androidx.fragment.app.u.K(r16)
            if (r8 == 0) goto L101
            boolean r8 = r0.r
            if (r8 == 0) goto Le8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "SpecialEffectsController: TransitionSeekController was not created. Completing operation "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.v(r6, r7)
            goto L101
        Le8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "SpecialEffectsController: Container "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = " has not been laid out. Completing operation "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.v(r6, r7)
        L101:
            androidx.fragment.app.b0 r5 = r5.a
            r5.c(r0)
            goto Lc0
        L107:
            r3 = 0
            r0.r = r3
            return
    }

    @Override // defpackage.wn6
    public final void d(defpackage.b00 r1, android.view.ViewGroup r2) {
            r0 = this;
            r2.getClass()
            java.lang.Object r2 = r0.q
            if (r2 == 0) goto Le
            dm2 r0 = r0.f
            float r1 = r1.c
            r0.r(r2, r1)
        Le:
            return
    }

    @Override // defpackage.wn6
    public final void e(android.view.ViewGroup r13) {
            r12 = this;
            r13.getClass()
            boolean r0 = r13.isLaidOut()
            r1 = 0
            java.lang.String r2 = "FragmentManager"
            java.util.ArrayList r3 = r12.c
            if (r0 != 0) goto L3f
            int r12 = r3.size()
        L12:
            if (r1 >= r12) goto Le4
            java.lang.Object r0 = r3.get(r1)
            int r1 = r1 + 1
            nf1 r0 = (defpackage.nf1) r0
            androidx.fragment.app.b0 r0 = r0.a
            r4 = 2
            boolean r4 = androidx.fragment.app.u.K(r4)
            if (r4 == 0) goto L12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "SpecialEffectsController: Container "
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r5 = " has not been laid out. Skipping onStart for operation "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r2, r0)
            goto L12
        L3f:
            boolean r0 = r12.h()
            androidx.fragment.app.b0 r4 = r12.e
            androidx.fragment.app.b0 r5 = r12.d
            if (r0 == 0) goto L79
            java.lang.Object r0 = r12.g
            if (r0 == 0) goto L79
            boolean r6 = r12.a()
            if (r6 != 0) goto L79
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Ignoring shared elements transition "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = " between "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " and "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.i(r2, r0)
        L79:
            boolean r0 = r12.a()
            if (r0 == 0) goto Le4
            boolean r0 = r12.h()
            if (r0 == 0) goto Le4
            dh5 r10 = new dh5
            r10.<init>()
            vr4 r0 = r12.g(r13, r4, r5)
            java.lang.Object r2 = r0.A
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r9 = r0.B
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r3, r4)
            r0.<init>(r4)
            int r4 = r3.size()
            r5 = r1
        La4:
            if (r5 >= r4) goto Lb4
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            nf1 r6 = (defpackage.nf1) r6
            androidx.fragment.app.b0 r6 = r6.a
            r0.add(r6)
            goto La4
        Lb4:
            int r3 = r0.size()
            r4 = r1
        Lb9:
            if (r4 >= r3) goto Ld9
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.b0) r5
            n0 r6 = new n0
            r7 = 15
            r6.<init>(r10, r7)
            androidx.fragment.app.o r7 = r5.c
            kf1 r7 = new kf1
            r7.<init>(r5, r12, r1)
            dm2 r5 = r12.f
            uj0 r8 = r12.p
            r5.v(r9, r8, r6, r7)
            goto Lb9
        Ld9:
            ig r6 = new ig
            r11 = 1
            r7 = r12
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r7.i(r2, r8, r6)
        Le4:
            return
    }

    public final defpackage.vr4 g(android.view.ViewGroup r31, androidx.fragment.app.b0 r32, androidx.fragment.app.b0 r33) {
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            android.view.View r4 = new android.view.View
            android.content.Context r5 = r1.getContext()
            r4.<init>(r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            java.util.ArrayList r6 = r0.c
            int r7 = r6.size()
            r10 = 0
            r11 = 0
            r12 = 0
        L1f:
            java.util.ArrayList r13 = r0.i
            java.util.ArrayList r14 = r0.h
            java.lang.Object r15 = r0.g
            dm2 r8 = r0.f
            if (r12 >= r7) goto Ldf
            java.lang.Object r16 = r6.get(r12)
            int r12 = r12 + 1
            r9 = r16
            nf1 r9 = (defpackage.nf1) r9
            java.lang.Object r9 = r9.d
            if (r9 == 0) goto Ld5
            if (r3 == 0) goto Ld5
            if (r2 == 0) goto Ld5
            wu r9 = r0.j
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Ld5
            if (r15 == 0) goto Ld5
            androidx.fragment.app.o r9 = r2.c
            r20 = r7
            androidx.fragment.app.o r7 = r3.c
            bm2 r16 = defpackage.wl2.a
            r9.getClass()
            r7.getClass()
            r16 = r7
            boolean r7 = r0.o
            if (r7 == 0) goto L5d
            r16.getEnterTransitionCallback()
            goto L60
        L5d:
            r9.getEnterTransitionCallback()
        L60:
            v r7 = new v
            r9 = 11
            r7.<init>(r2, r3, r0, r9)
            defpackage.fm4.a(r1, r7)
            wu r7 = r0.m
            java.util.Collection r9 = r7.values()
            r14.addAll(r9)
            java.util.ArrayList r9 = r0.l
            boolean r16 = r9.isEmpty()
            r22 = r11
            if (r16 != 0) goto L91
            r11 = 0
            java.lang.Object r9 = r9.get(r11)
            r9.getClass()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r7.get(r9)
            android.view.View r7 = (android.view.View) r7
            r8.s(r7, r15)
            r10 = r7
        L91:
            wu r7 = r0.n
            java.util.Collection r9 = r7.values()
            r13.addAll(r9)
            java.util.ArrayList r9 = r0.k
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto Lbf
            r11 = 0
            java.lang.Object r9 = r9.get(r11)
            r9.getClass()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r7.get(r9)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto Lbf
            mf r9 = new mf
            r9.<init>(r8, r7, r5)
            defpackage.fm4.a(r1, r9)
            r7 = 1
            r11 = r7
            goto Lc1
        Lbf:
            r11 = r22
        Lc1:
            r8.w(r15, r4, r14)
            r15 = 0
            r16 = 0
            java.lang.Object r14 = r0.g
            r17 = r14
            r18 = r13
            r13 = r8
            r13.q(r14, r15, r16, r17, r18)
            r7 = r20
            goto L1f
        Ld5:
            r20 = r7
            r22 = r11
            r7 = r20
            r11 = r22
            goto L1f
        Ldf:
            r22 = r11
            r7 = r13
            r13 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r8 = r6.size()
            r9 = 0
            r11 = 0
            r12 = 0
        Lef:
            r23 = 2
            r24 = r7
            java.lang.String r7 = "FragmentManager"
            if (r12 >= r8) goto L25c
            java.lang.Object r16 = r6.get(r12)
            int r12 = r12 + 1
            r25 = r6
            r6 = r16
            nf1 r6 = (defpackage.nf1) r6
            r30 = r8
            androidx.fragment.app.b0 r8 = r6.a
            r26 = r12
            java.lang.Object r12 = r6.b
            java.lang.Object r12 = r13.h(r12)
            if (r12 == 0) goto L24f
            r27 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r28 = r15
            androidx.fragment.app.o r15 = r8.c
            r29 = r11
            android.view.View r11 = r15.mView
            r11.getClass()
            f(r11, r14)
            if (r28 == 0) goto L141
            if (r8 == r3) goto L12c
            if (r8 != r2) goto L141
        L12c:
            if (r8 != r3) goto L138
            java.util.Set r11 = defpackage.gt0.p1(r27)
            java.util.Collection r11 = (java.util.Collection) r11
            r14.removeAll(r11)
            goto L141
        L138:
            java.util.Set r11 = defpackage.gt0.p1(r24)
            java.util.Collection r11 = (java.util.Collection) r11
            r14.removeAll(r11)
        L141:
            boolean r11 = r14.isEmpty()
            if (r11 == 0) goto L14e
            r13.a(r4, r12)
            r11 = r12
            r12 = r14
        L14c:
            r14 = 0
            goto L185
        L14e:
            r13.b(r12, r14)
            r20 = 0
            r21 = 0
            r18 = r12
            r17 = r12
            r16 = r13
            r19 = r14
            r16.q(r17, r18, r19, r20, r21)
            r11 = r17
            r12 = r19
            ao6 r14 = r8.a
            ao6 r2 = defpackage.ao6.GONE
            if (r14 != r2) goto L14c
            r2 = 0
            r8.i = r2
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r12)
            android.view.View r2 = r15.mView
            r14.remove(r2)
            android.view.View r2 = r15.mView
            r13.p(r11, r2, r14)
            lf1 r2 = new lf1
            r14 = 0
            r2.<init>(r14, r12)
            defpackage.fm4.a(r1, r2)
        L185:
            ao6 r2 = r8.a
            ao6 r8 = defpackage.ao6.VISIBLE
            java.lang.String r15 = "View: "
            if (r2 != r8) goto L1da
            r0.addAll(r12)
            if (r22 == 0) goto L195
            r13.t(r11, r5)
        L195:
            boolean r2 = androidx.fragment.app.u.K(r23)
            if (r2 == 0) goto L21f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Entering Transition: "
            r2.<init>(r8)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r7, r2)
            java.lang.String r2 = ">>>>> EnteringViews <<<<<"
            android.util.Log.v(r7, r2)
            int r2 = r12.size()
            r8 = r14
        L1b6:
            if (r8 >= r2) goto L21f
            java.lang.Object r16 = r12.get(r8)
            int r8 = r8 + 1
            r16.getClass()
            r14 = r16
            android.view.View r14 = (android.view.View) r14
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r7, r2)
            r2 = r16
            r14 = 0
            goto L1b6
        L1da:
            r13.s(r10, r11)
            boolean r2 = androidx.fragment.app.u.K(r23)
            if (r2 == 0) goto L21f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Exiting Transition: "
            r2.<init>(r8)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r7, r2)
            java.lang.String r2 = ">>>>> ExitingViews <<<<<"
            android.util.Log.v(r7, r2)
            int r2 = r12.size()
            r8 = 0
        L1fe:
            if (r8 >= r2) goto L21f
            java.lang.Object r14 = r12.get(r8)
            int r8 = r8 + 1
            r14.getClass()
            android.view.View r14 = (android.view.View) r14
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r7, r2)
            r2 = r16
            goto L1fe
        L21f:
            boolean r2 = r6.c
            if (r2 == 0) goto L239
            java.lang.Object r9 = r13.o(r9, r11)
            r8 = r30
            r2 = r32
            r7 = r24
            r6 = r25
            r12 = r26
            r14 = r27
            r15 = r28
            r11 = r29
            goto Lef
        L239:
            r2 = r29
            java.lang.Object r11 = r13.o(r2, r11)
            r8 = r30
            r2 = r32
            r7 = r24
            r6 = r25
            r12 = r26
            r14 = r27
            r15 = r28
            goto Lef
        L24f:
            r2 = r11
            r8 = r30
            r7 = r24
            r6 = r25
            r12 = r26
            r2 = r32
            goto Lef
        L25c:
            r2 = r11
            r6 = r15
            java.lang.Object r2 = r13.n(r9, r2, r6)
            boolean r3 = androidx.fragment.app.u.K(r23)
            if (r3 == 0) goto L281
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Final merged transition: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = " for container "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.v(r7, r1)
        L281:
            vr4 r1 = new vr4
            r1.<init>(r0, r2)
            return r1
    }

    public final boolean h() {
            r4 = this;
            java.util.ArrayList r4 = r4.c
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L22
        L9:
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        Lf:
            if (r2 >= r0) goto L22
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            nf1 r3 = (defpackage.nf1) r3
            androidx.fragment.app.b0 r3 = r3.a
            androidx.fragment.app.o r3 = r3.c
            boolean r3 = r3.mTransitioning
            if (r3 != 0) goto Lf
            return r1
        L22:
            r4 = 1
            return r4
    }

    public final void i(java.util.ArrayList r15, android.view.ViewGroup r16, defpackage.on2 r17) {
            r14 = this;
            r1 = 4
            defpackage.wl2.a(r1, r15)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = r14.i
            int r1 = r4.size()
            r8 = 0
            r2 = r8
        L11:
            r3 = 0
            if (r2 >= r1) goto L29
            java.lang.Object r6 = r4.get(r2)
            android.view.View r6 = (android.view.View) r6
            java.util.WeakHashMap r7 = defpackage.ao7.a
            java.lang.String r7 = r6.getTransitionName()
            r5.add(r7)
            r6.setTransitionName(r3)
            int r2 = r2 + 1
            goto L11
        L29:
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            java.util.ArrayList r6 = r14.h
            if (r1 == 0) goto La3
            java.lang.String r1 = ">>>>> Beginning transition <<<<<"
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
            java.lang.String r1 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r2, r1)
            int r1 = r6.size()
            r7 = r8
        L43:
            java.lang.String r9 = " Name: "
            java.lang.String r10 = "View: "
            if (r7 >= r1) goto L70
            java.lang.Object r11 = r6.get(r7)
            int r7 = r7 + 1
            r11.getClass()
            android.view.View r11 = (android.view.View) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r10)
            r12.append(r11)
            r12.append(r9)
            java.util.WeakHashMap r9 = defpackage.ao7.a
            java.lang.String r9 = r11.getTransitionName()
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.v(r2, r9)
            goto L43
        L70:
            java.lang.String r1 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r2, r1)
            int r1 = r4.size()
            r7 = r8
        L7a:
            if (r7 >= r1) goto La3
            java.lang.Object r11 = r4.get(r7)
            int r7 = r7 + 1
            r11.getClass()
            android.view.View r11 = (android.view.View) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r10)
            r12.append(r11)
            r12.append(r9)
            java.util.WeakHashMap r13 = defpackage.ao7.a
            java.lang.String r11 = r11.getTransitionName()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.util.Log.v(r2, r11)
            goto L7a
        La3:
            r17.c()
            int r1 = r4.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = r8
        Lb0:
            if (r2 >= r1) goto Lec
            java.lang.Object r9 = r6.get(r2)
            android.view.View r9 = (android.view.View) r9
            java.util.WeakHashMap r10 = defpackage.ao7.a
            java.lang.String r10 = r9.getTransitionName()
            r7.add(r10)
            if (r10 != 0) goto Lc4
            goto Le9
        Lc4:
            r9.setTransitionName(r3)
            wu r9 = r14.j
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r11 = r8
        Ld0:
            if (r11 >= r1) goto Le9
            java.lang.Object r12 = r5.get(r11)
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto Le6
            java.lang.Object r9 = r4.get(r11)
            android.view.View r9 = (android.view.View) r9
            r9.setTransitionName(r10)
            goto Le9
        Le6:
            int r11 = r11 + 1
            goto Ld0
        Le9:
            int r2 = r2 + 1
            goto Lb0
        Lec:
            cm2 r2 = new cm2
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = r16
            defpackage.fm4.a(r1, r2)
            defpackage.wl2.a(r8, r15)
            java.lang.Object r0 = r14.g
            dm2 r14 = r14.f
            r14.x(r0, r6, r4)
            return
    }
}
