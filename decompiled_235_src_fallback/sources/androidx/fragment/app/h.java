package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class h {
    public final android.view.ViewGroup a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public h(android.view.ViewGroup r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            return
    }

    public static void f(defpackage.wu r4, android.view.View r5) {
            java.util.WeakHashMap r0 = defpackage.ao7.a
            java.lang.String r0 = r5.getTransitionName()
            if (r0 == 0) goto Lb
            r4.put(r0, r5)
        Lb:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L16:
            if (r1 >= r0) goto L28
            android.view.View r2 = r5.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L25
            f(r4, r2)
        L25:
            int r1 = r1 + 1
            goto L16
        L28:
            return
    }

    public static final androidx.fragment.app.h j(android.view.ViewGroup r2, androidx.fragment.app.u r3) {
            r2.getClass()
            r3.getClass()
            q61 r3 = r3.I()
            r3.getClass()
            r3 = 2131427901(0x7f0b023d, float:1.8477431E38)
            java.lang.Object r0 = r2.getTag(r3)
            boolean r1 = r0 instanceof androidx.fragment.app.h
            if (r1 == 0) goto L1b
            androidx.fragment.app.h r0 = (androidx.fragment.app.h) r0
            return r0
        L1b:
            androidx.fragment.app.h r0 = new androidx.fragment.app.h
            r0.<init>(r2)
            r2.setTag(r3, r0)
            return r0
    }

    public static boolean k(java.util.ArrayList r8) {
            int r0 = r8.size()
            r1 = 0
            r2 = 1
            r4 = r1
        L7:
            r3 = r2
        L8:
            if (r4 >= r0) goto L3c
            java.lang.Object r3 = r8.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            java.util.ArrayList r5 = r3.k
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L3a
            java.util.ArrayList r3 = r3.k
            if (r3 == 0) goto L25
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L25
            goto L7
        L25:
            int r5 = r3.size()
            r6 = r1
        L2a:
            if (r6 >= r5) goto L7
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            wn6 r7 = (defpackage.wn6) r7
            boolean r7 = r7.a()
            if (r7 != 0) goto L2a
        L3a:
            r3 = r1
            goto L8
        L3c:
            if (r3 == 0) goto L5f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r8.size()
            r4 = r1
        L48:
            if (r4 >= r3) goto L58
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.b0) r5
            java.util.ArrayList r5 = r5.k
            defpackage.gt0.A0(r0, r5)
            goto L48
        L58:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L5f
            return r2
        L5f:
            return r1
    }

    public final void a(androidx.fragment.app.b0 r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.i
            if (r0 == 0) goto L1a
            ao6 r0 = r3.a
            androidx.fragment.app.o r1 = r3.c
            android.view.View r1 = r1.requireView()
            r1.getClass()
            android.view.ViewGroup r2 = r2.a
            r0.applyState(r1, r2)
            r2 = 0
            r3.i = r2
        L1a:
            return
    }

    public final void b(java.util.ArrayList r27, boolean r28) {
            r26 = this;
            r0 = r26
            r1 = r27
            r14 = r28
            r15 = 2
            boolean r2 = androidx.fragment.app.u.K(r15)
            java.lang.String r3 = "FragmentManager"
            if (r2 == 0) goto L14
            java.lang.String r2 = "Collecting Effects"
            android.util.Log.v(r3, r2)
        L14:
            int r2 = r1.size()
            r4 = 0
            r5 = r4
        L1a:
            if (r5 >= r2) goto L3e
            java.lang.Object r7 = r1.get(r5)
            int r5 = r5 + 1
            r8 = r7
            androidx.fragment.app.b0 r8 = (androidx.fragment.app.b0) r8
            yn6 r9 = defpackage.ao6.Companion
            androidx.fragment.app.o r10 = r8.c
            android.view.View r10 = r10.mView
            r10.getClass()
            r9.getClass()
            ao6 r9 = defpackage.yn6.a(r10)
            ao6 r10 = defpackage.ao6.VISIBLE
            if (r9 != r10) goto L1a
            ao6 r8 = r8.a
            if (r8 == r10) goto L1a
            goto L3f
        L3e:
            r7 = 0
        L3f:
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7
            int r2 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r2)
        L49:
            boolean r5 = r2.hasPrevious()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r2.previous()
            r8 = r5
            androidx.fragment.app.b0 r8 = (androidx.fragment.app.b0) r8
            yn6 r9 = defpackage.ao6.Companion
            androidx.fragment.app.o r10 = r8.c
            android.view.View r10 = r10.mView
            r10.getClass()
            r9.getClass()
            ao6 r9 = defpackage.yn6.a(r10)
            ao6 r10 = defpackage.ao6.VISIBLE
            if (r9 == r10) goto L49
            ao6 r8 = r8.a
            if (r8 != r10) goto L49
            goto L70
        L6f:
            r5 = 0
        L70:
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.b0) r5
            boolean r2 = androidx.fragment.app.u.K(r15)
            if (r2 == 0) goto L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Executing operations from "
            r2.<init>(r8)
            r2.append(r7)
            java.lang.String r8 = " to "
            r2.append(r8)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        L91:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r9 = defpackage.gt0.Q0(r1)
            androidx.fragment.app.b0 r9 = (androidx.fragment.app.b0) r9
            androidx.fragment.app.o r9 = r9.c
            int r10 = r1.size()
            r11 = r4
        La8:
            if (r11 >= r10) goto Lcd
            java.lang.Object r12 = r1.get(r11)
            int r11 = r11 + 1
            androidx.fragment.app.b0 r12 = (androidx.fragment.app.b0) r12
            androidx.fragment.app.o r12 = r12.c
            rk2 r12 = r12.mAnimationInfo
            rk2 r13 = r9.mAnimationInfo
            r16 = r15
            int r15 = r13.b
            r12.b = r15
            int r15 = r13.c
            r12.c = r15
            int r15 = r13.d
            r12.d = r15
            int r13 = r13.e
            r12.e = r13
            r15 = r16
            goto La8
        Lcd:
            r16 = r15
            int r9 = r1.size()
            r10 = r4
        Ld4:
            if (r10 >= r9) goto L104
            java.lang.Object r11 = r1.get(r10)
            int r10 = r10 + 1
            androidx.fragment.app.b0 r11 = (androidx.fragment.app.b0) r11
            androidx.fragment.app.d r12 = new androidx.fragment.app.d
            r12.<init>(r11, r14)
            r2.add(r12)
            nf1 r12 = new nf1
            if (r14 == 0) goto Lf0
            if (r11 != r7) goto Lee
        Lec:
            r15 = 1
            goto Lf3
        Lee:
            r15 = r4
            goto Lf3
        Lf0:
            if (r11 != r5) goto Lee
            goto Lec
        Lf3:
            r12.<init>(r11, r14, r15)
            r8.add(r12)
            ff1 r12 = new ff1
            r12.<init>(r0, r11, r4)
            java.util.ArrayList r11 = r11.d
            r11.add(r12)
            goto Ld4
        L104:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r9 = r8.size()
            r10 = r4
        L10e:
            if (r10 >= r9) goto L123
            java.lang.Object r11 = r8.get(r10)
            int r10 = r10 + 1
            r12 = r11
            nf1 r12 = (defpackage.nf1) r12
            boolean r12 = r12.a()
            if (r12 != 0) goto L10e
            r1.add(r11)
            goto L10e
        L123:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r1.size()
            r10 = r4
        L12d:
            if (r10 >= r9) goto L142
            java.lang.Object r11 = r1.get(r10)
            int r10 = r10 + 1
            r12 = r11
            nf1 r12 = (defpackage.nf1) r12
            dm2 r12 = r12.b()
            if (r12 == 0) goto L12d
            r8.add(r11)
            goto L12d
        L142:
            int r1 = r8.size()
            r10 = r4
            r9 = 0
        L148:
            if (r10 >= r1) goto L188
            java.lang.Object r11 = r8.get(r10)
            int r10 = r10 + 1
            nf1 r11 = (defpackage.nf1) r11
            dm2 r12 = r11.b()
            if (r9 == 0) goto L186
            if (r12 != r9) goto L15b
            goto L186
        L15b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r0.<init>(r1)
            androidx.fragment.app.b0 r1 = r11.a
            androidx.fragment.app.o r1 = r1.c
            r0.append(r1)
            java.lang.Object r1 = r11.b
            java.lang.String r2 = " returned Transition "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " which uses a different Transition type than other Fragments."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L186:
            r9 = r12
            goto L148
        L188:
            if (r9 != 0) goto L190
            r15 = r2
            r0 = r3
            r20 = 1
            goto L43f
        L190:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            wu r11 = new wu
            r11.<init>(r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r17 = r12
            wu r12 = new wu
            r12.<init>(r4)
            r18 = r13
            wu r13 = new wu
            r13.<init>(r4)
            int r4 = r8.size()
            r15 = 0
            r19 = 0
            r20 = 1
        L1c0:
            if (r15 >= r4) goto L3e6
            java.lang.Object r21 = r8.get(r15)
            int r15 = r15 + 1
            r6 = r21
            nf1 r6 = (defpackage.nf1) r6
            java.lang.Object r6 = r6.d
            if (r6 == 0) goto L3da
            if (r7 == 0) goto L3da
            r27 = r1
            androidx.fragment.app.o r1 = r7.c
            r21 = r2
            if (r5 == 0) goto L3d1
            androidx.fragment.app.o r2 = r5.c
            java.lang.Object r6 = r9.h(r6)
            java.lang.Object r6 = r9.y(r6)
            r22 = r4
            java.util.ArrayList r4 = r2.getSharedElementSourceNames()
            r4.getClass()
            r23 = r9
            java.util.ArrayList r9 = r1.getSharedElementSourceNames()
            r9.getClass()
            r24 = r10
            java.util.ArrayList r10 = r1.getSharedElementTargetNames()
            r10.getClass()
            int r14 = r10.size()
            r25 = r15
            r15 = 0
        L206:
            r0 = -1
            if (r15 >= r14) goto L221
            r17 = r14
            java.lang.Object r14 = r10.get(r15)
            int r14 = r4.indexOf(r14)
            if (r14 == r0) goto L21c
            java.lang.Object r0 = r9.get(r15)
            r4.set(r14, r0)
        L21c:
            int r15 = r15 + 1
            r14 = r17
            goto L206
        L221:
            java.util.ArrayList r9 = r2.getSharedElementTargetNames()
            r9.getClass()
            if (r28 != 0) goto L237
            r1.getExitTransitionCallback()
            r2.getEnterTransitionCallback()
            vr4 r10 = new vr4
            r14 = 0
            r10.<init>(r14, r14)
            goto L243
        L237:
            r14 = 0
            r1.getEnterTransitionCallback()
            r2.getExitTransitionCallback()
            vr4 r10 = new vr4
            r10.<init>(r14, r14)
        L243:
            java.lang.Object r15 = r10.A
            if (r15 != 0) goto L3cd
            java.lang.Object r10 = r10.B
            if (r10 != 0) goto L3c9
            int r10 = r4.size()
            r15 = 0
        L250:
            if (r15 >= r10) goto L270
            java.lang.Object r17 = r4.get(r15)
            r17.getClass()
            r14 = r17
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r17 = r9.get(r15)
            r17.getClass()
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r11.put(r14, r0)
            int r15 = r15 + 1
            r0 = -1
            r14 = 0
            goto L250
        L270:
            boolean r0 = androidx.fragment.app.u.K(r16)
            if (r0 == 0) goto L2c8
            java.lang.String r0 = ">>> entering view names <<<"
            android.util.Log.v(r3, r0)
            int r0 = r9.size()
            r10 = 0
        L280:
            java.lang.String r14 = "Name: "
            if (r10 >= r0) goto L2a0
            java.lang.Object r15 = r9.get(r10)
            int r10 = r10 + 1
            java.lang.String r15 = (java.lang.String) r15
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
            r0 = r17
            goto L280
        L2a0:
            java.lang.String r0 = ">>> exiting view names <<<"
            android.util.Log.v(r3, r0)
            int r0 = r4.size()
            r10 = 0
        L2aa:
            if (r10 >= r0) goto L2c8
            java.lang.Object r15 = r4.get(r10)
            int r10 = r10 + 1
            java.lang.String r15 = (java.lang.String) r15
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
            r0 = r17
            goto L2aa
        L2c8:
            android.view.View r0 = r1.mView
            r0.getClass()
            f(r12, r0)
            r12.l(r4)
            java.util.Set r0 = r12.keySet()
            r11.l(r0)
            android.view.View r0 = r2.mView
            r0.getClass()
            f(r13, r0)
            r13.l(r9)
            java.util.Collection r0 = r11.values()
            r13.l(r0)
            bm2 r0 = defpackage.wl2.a
            int r0 = r11.L
            int r0 = r0 + (-1)
            r1 = -1
        L2f3:
            if (r1 >= r0) goto L307
            java.lang.Object r2 = r11.i(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r13.containsKey(r2)
            if (r2 != 0) goto L304
            r11.g(r0)
        L304:
            int r0 = r0 + (-1)
            goto L2f3
        L307:
            java.util.Set r0 = r11.keySet()
            java.util.Set r1 = r12.entrySet()
            yv3 r1 = (defpackage.yv3) r1
            java.util.Iterator r1 = r1.iterator()
        L315:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L337
            r1.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap r10 = defpackage.ao7.a
            java.lang.String r2 = r2.getTransitionName()
            boolean r2 = defpackage.gt0.C0(r0, r2)
            if (r2 != 0) goto L315
            r1.remove()
            goto L315
        L337:
            java.util.Collection r0 = r11.values()
            java.util.Set r1 = r13.entrySet()
            yv3 r1 = (defpackage.yv3) r1
            java.util.Iterator r1 = r1.iterator()
        L345:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L367
            r1.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap r10 = defpackage.ao7.a
            java.lang.String r2 = r2.getTransitionName()
            boolean r2 = defpackage.gt0.C0(r0, r2)
            if (r2 != 0) goto L345
            r1.remove()
            goto L345
        L367:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L3b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring shared elements transition "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " between "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " and "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            r27.clear()
            r24.clear()
            r0 = r26
            r1 = r27
            r14 = r28
            r18 = r4
            r17 = r9
            r2 = r21
            r4 = r22
            r9 = r23
            r10 = r24
            r15 = r25
            r19 = 0
            goto L1c0
        L3b1:
            r0 = r26
            r1 = r27
            r14 = r28
            r18 = r4
            r19 = r6
            r17 = r9
        L3bd:
            r2 = r21
            r4 = r22
            r9 = r23
            r10 = r24
            r15 = r25
            goto L1c0
        L3c9:
            defpackage.u34.a()
            return
        L3cd:
            defpackage.u34.a()
            return
        L3d1:
            r22 = r4
            r23 = r9
            r24 = r10
            r25 = r15
            goto L3df
        L3da:
            r27 = r1
            r21 = r2
            goto L3d1
        L3df:
            r0 = r26
            r1 = r27
            r14 = r28
            goto L3bd
        L3e6:
            r27 = r1
            r21 = r2
            r23 = r9
            r24 = r10
            if (r19 != 0) goto L40e
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L3fa
        L3f6:
            r0 = r3
            r15 = r21
            goto L43f
        L3fa:
            int r0 = r8.size()
            r1 = 0
        L3ff:
            if (r1 >= r0) goto L3f6
            java.lang.Object r2 = r8.get(r1)
            int r1 = r1 + 1
            nf1 r2 = (defpackage.nf1) r2
            java.lang.Object r2 = r2.b
            if (r2 != 0) goto L40e
            goto L3ff
        L40e:
            androidx.fragment.app.g r1 = new androidx.fragment.app.g
            r14 = r28
            r0 = r3
            r4 = r5
            r3 = r7
            r2 = r8
            r9 = r11
            r10 = r17
            r11 = r18
            r6 = r19
            r15 = r21
            r5 = r23
            r8 = r24
            r7 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r3 = r2.size()
            r4 = 0
        L42d:
            if (r4 >= r3) goto L43f
            java.lang.Object r5 = r2.get(r4)
            int r4 = r4 + 1
            nf1 r5 = (defpackage.nf1) r5
            androidx.fragment.app.b0 r5 = r5.a
            java.util.ArrayList r5 = r5.j
            r5.add(r1)
            goto L42d
        L43f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r15.size()
            r4 = 0
        L44e:
            if (r4 >= r3) goto L460
            java.lang.Object r5 = r15.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.d r5 = (androidx.fragment.app.d) r5
            androidx.fragment.app.b0 r5 = r5.a
            java.util.ArrayList r5 = r5.k
            defpackage.gt0.A0(r2, r5)
            goto L44e
        L460:
            boolean r2 = r2.isEmpty()
            int r3 = r15.size()
            r4 = 0
            r5 = 0
        L46a:
            if (r5 >= r3) goto L4d1
            java.lang.Object r6 = r15.get(r5)
            int r5 = r5 + 1
            androidx.fragment.app.d r6 = (androidx.fragment.app.d) r6
            r7 = r26
            android.view.ViewGroup r8 = r7.a
            android.content.Context r8 = r8.getContext()
            androidx.fragment.app.b0 r9 = r6.a
            r8.getClass()
            yc1 r8 = r6.b(r8)
            if (r8 != 0) goto L488
            goto L46a
        L488:
            java.lang.Object r8 = r8.B
            android.animation.AnimatorSet r8 = (android.animation.AnimatorSet) r8
            if (r8 != 0) goto L492
            r1.add(r6)
            goto L46a
        L492:
            androidx.fragment.app.o r8 = r9.c
            java.util.ArrayList r10 = r9.k
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L4b9
            boolean r6 = androidx.fragment.app.u.K(r16)
            if (r6 == 0) goto L46a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Ignoring Animator set on "
            r6.<init>(r9)
            r6.append(r8)
            java.lang.String r8 = " as this Fragment was involved in a Transition."
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r0, r6)
            goto L46a
        L4b9:
            ao6 r4 = r9.a
            ao6 r8 = defpackage.ao6.GONE
            if (r4 != r8) goto L4c3
            r8 = 0
            r9.i = r8
            goto L4c4
        L4c3:
            r8 = 0
        L4c4:
            androidx.fragment.app.e r4 = new androidx.fragment.app.e
            r4.<init>(r6)
            java.util.ArrayList r6 = r9.j
            r6.add(r4)
            r4 = r20
            goto L46a
        L4d1:
            r8 = 0
            int r3 = r1.size()
        L4d6:
            if (r8 >= r3) goto L52b
            java.lang.Object r5 = r1.get(r8)
            int r8 = r8 + 1
            androidx.fragment.app.d r5 = (androidx.fragment.app.d) r5
            androidx.fragment.app.b0 r6 = r5.a
            androidx.fragment.app.o r7 = r6.c
            java.lang.String r9 = "Ignoring Animation set on "
            if (r2 != 0) goto L503
            boolean r5 = androidx.fragment.app.u.K(r16)
            if (r5 == 0) goto L4d6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            r5.append(r7)
            java.lang.String r6 = " as Animations cannot run alongside Transitions."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
            goto L4d6
        L503:
            if (r4 == 0) goto L520
            boolean r5 = androidx.fragment.app.u.K(r16)
            if (r5 == 0) goto L4d6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            r5.append(r7)
            java.lang.String r6 = " as Animations cannot run alongside Animators."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
            goto L4d6
        L520:
            androidx.fragment.app.c r7 = new androidx.fragment.app.c
            r7.<init>(r5)
            java.util.ArrayList r5 = r6.j
            r5.add(r7)
            goto L4d6
        L52b:
            return
    }

    public final void c(java.util.List r7) {
            r6 = this;
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            java.util.ArrayList r2 = r2.k
            defpackage.gt0.A0(r0, r2)
            goto Lc
        L1e:
            java.util.Set r0 = defpackage.gt0.p1(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = defpackage.gt0.k1(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L2e:
            if (r3 >= r1) goto L3e
            java.lang.Object r4 = r0.get(r3)
            wn6 r4 = (defpackage.wn6) r4
            android.view.ViewGroup r5 = r6.a
            r4.c(r5)
            int r3 = r3 + 1
            goto L2e
        L3e:
            int r0 = r7.size()
            r1 = r2
        L43:
            if (r1 >= r0) goto L51
            java.lang.Object r3 = r7.get(r1)
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            r6.a(r3)
            int r1 = r1 + 1
            goto L43
        L51:
            java.util.List r6 = defpackage.gt0.k1(r7)
            int r7 = r6.size()
        L59:
            if (r2 >= r7) goto L6f
            java.lang.Object r0 = r6.get(r2)
            androidx.fragment.app.b0 r0 = (androidx.fragment.app.b0) r0
            java.util.ArrayList r1 = r0.k
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6c
            r0.b()
        L6c:
            int r2 = r2 + 1
            goto L59
        L6f:
            return
    }

    public final void d(defpackage.ao6 r4, defpackage.xn6 r5, androidx.fragment.app.x r6) {
            r3 = this;
            java.util.ArrayList r0 = r3.b
            monitor-enter(r0)
            androidx.fragment.app.o r1 = r6.c     // Catch: java.lang.Throwable -> L1b
            r1.getClass()     // Catch: java.lang.Throwable -> L1b
            androidx.fragment.app.b0 r1 = r3.g(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L21
            androidx.fragment.app.o r1 = r6.c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1.mTransitioning     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            boolean r2 = r1.mRemoving     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L21
        L1b:
            r3 = move-exception
            goto L49
        L1d:
            androidx.fragment.app.b0 r1 = r3.h(r1)     // Catch: java.lang.Throwable -> L1b
        L21:
            if (r1 == 0) goto L28
            r1.d(r4, r5)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L28:
            androidx.fragment.app.b0 r1 = new androidx.fragment.app.b0     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r4 = r3.b     // Catch: java.lang.Throwable -> L1b
            r4.add(r1)     // Catch: java.lang.Throwable -> L1b
            androidx.fragment.app.a0 r4 = new androidx.fragment.app.a0     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r5 = r1.d     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            ff1 r4 = new ff1     // Catch: java.lang.Throwable -> L1b
            r5 = 1
            r4.<init>(r3, r1, r5)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r3 = r1.d     // Catch: java.lang.Throwable -> L1b
            r3.add(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L49:
            monitor-exit(r0)
            throw r3
    }

    public final void e() {
            r10 = this;
            boolean r0 = r10.f
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r10.a
            boolean r0 = r0.isAttachedToWindow()
            r1 = 0
            if (r0 != 0) goto L14
            r10.i()
            r10.e = r1
            return
        L14:
            java.util.ArrayList r0 = r10.b
            monitor-enter(r0)
            java.util.ArrayList r2 = r10.c     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r2 = defpackage.gt0.m1(r2)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r3 = r10.c     // Catch: java.lang.Throwable -> L41
            r3.clear()     // Catch: java.lang.Throwable -> L41
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L41
            r4 = r1
        L27:
            r5 = 1
            if (r4 >= r3) goto L48
            java.lang.Object r6 = r2.get(r4)     // Catch: java.lang.Throwable -> L41
            int r4 = r4 + 1
            androidx.fragment.app.b0 r6 = (androidx.fragment.app.b0) r6     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r7 = r10.b     // Catch: java.lang.Throwable -> L41
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r7 != 0) goto L44
            androidx.fragment.app.o r7 = r6.c     // Catch: java.lang.Throwable -> L41
            boolean r7 = r7.mTransitioning     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L44
            goto L45
        L41:
            r10 = move-exception
            goto L158
        L44:
            r5 = r1
        L45:
            r6.g = r5     // Catch: java.lang.Throwable -> L41
            goto L27
        L48:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L41
            r4 = r1
        L4d:
            r6 = 2
            if (r4 >= r3) goto La9
            java.lang.Object r7 = r2.get(r4)     // Catch: java.lang.Throwable -> L41
            int r4 = r4 + 1
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7     // Catch: java.lang.Throwable -> L41
            boolean r8 = r10.d     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L7c
            boolean r6 = androidx.fragment.app.u.K(r6)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L78
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r8.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = "SpecialEffectsController: Completing non-seekable operation "
            r8.append(r9)     // Catch: java.lang.Throwable -> L41
            r8.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r6, r8)     // Catch: java.lang.Throwable -> L41
        L78:
            r7.b()     // Catch: java.lang.Throwable -> L41
            goto L9d
        L7c:
            boolean r6 = androidx.fragment.app.u.K(r6)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L98
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r8.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = "SpecialEffectsController: Cancelling operation "
            r8.append(r9)     // Catch: java.lang.Throwable -> L41
            r8.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r6, r8)     // Catch: java.lang.Throwable -> L41
        L98:
            android.view.ViewGroup r6 = r10.a     // Catch: java.lang.Throwable -> L41
            r7.a(r6)     // Catch: java.lang.Throwable -> L41
        L9d:
            r10.d = r1     // Catch: java.lang.Throwable -> L41
            boolean r6 = r7.f     // Catch: java.lang.Throwable -> L41
            if (r6 != 0) goto L4d
            java.util.ArrayList r6 = r10.c     // Catch: java.lang.Throwable -> L41
            r6.add(r7)     // Catch: java.lang.Throwable -> L41
            goto L4d
        La9:
            java.util.ArrayList r2 = r10.b     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L156
            r10.n()     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r2 = r10.b     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r2 = defpackage.gt0.m1(r2)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto Lc2
            monitor-exit(r0)
            return
        Lc2:
            java.util.ArrayList r3 = r10.b     // Catch: java.lang.Throwable -> L41
            r3.clear()     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r3 = r10.c     // Catch: java.lang.Throwable -> L41
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L41
            boolean r3 = androidx.fragment.app.u.K(r6)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto Ld9
            java.lang.String r3 = "FragmentManager"
            java.lang.String r4 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r3, r4)     // Catch: java.lang.Throwable -> L41
        Ld9:
            boolean r3 = r10.e     // Catch: java.lang.Throwable -> L41
            r10.b(r2, r3)     // Catch: java.lang.Throwable -> L41
            boolean r3 = k(r2)     // Catch: java.lang.Throwable -> L41
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L41
            r8 = r1
            r7 = r5
        Le8:
            if (r8 >= r4) goto Lfa
            java.lang.Object r9 = r2.get(r8)     // Catch: java.lang.Throwable -> L41
            int r8 = r8 + 1
            androidx.fragment.app.b0 r9 = (androidx.fragment.app.b0) r9     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.o r9 = r9.c     // Catch: java.lang.Throwable -> L41
            boolean r9 = r9.mTransitioning     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto Le8
            r7 = r1
            goto Le8
        Lfa:
            if (r7 == 0) goto Lff
            if (r3 != 0) goto Lff
            goto L100
        Lff:
            r5 = r1
        L100:
            r10.d = r5     // Catch: java.lang.Throwable -> L41
            boolean r4 = androidx.fragment.app.u.K(r6)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L126
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "SpecialEffectsController: Operation seekable = "
            r5.append(r8)     // Catch: java.lang.Throwable -> L41
            r5.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = " \ntransition = "
            r5.append(r8)     // Catch: java.lang.Throwable -> L41
            r5.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L41
        L126:
            if (r7 != 0) goto L12f
            r10.m(r2)     // Catch: java.lang.Throwable -> L41
            r10.c(r2)     // Catch: java.lang.Throwable -> L41
            goto L147
        L12f:
            if (r3 == 0) goto L147
            r10.m(r2)     // Catch: java.lang.Throwable -> L41
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L41
            r4 = r1
        L139:
            if (r4 >= r3) goto L147
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.b0) r5     // Catch: java.lang.Throwable -> L41
            r10.a(r5)     // Catch: java.lang.Throwable -> L41
            int r4 = r4 + 1
            goto L139
        L147:
            r10.e = r1     // Catch: java.lang.Throwable -> L41
            boolean r10 = androidx.fragment.app.u.K(r6)     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto L156
            java.lang.String r10 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r10, r1)     // Catch: java.lang.Throwable -> L41
        L156:
            monitor-exit(r0)
            return
        L158:
            monitor-exit(r0)
            throw r10
    }

    public final androidx.fragment.app.b0 g(androidx.fragment.app.o r6) {
            r5 = this;
            java.util.ArrayList r5 = r5.b
            int r0 = r5.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            r3 = r2
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            androidx.fragment.app.o r4 = r3.c
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L7
            boolean r3 = r3.e
            if (r3 != 0) goto L7
            goto L20
        L1f:
            r2 = 0
        L20:
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            return r2
    }

    public final androidx.fragment.app.b0 h(androidx.fragment.app.o r6) {
            r5 = this;
            java.util.ArrayList r5 = r5.c
            int r0 = r5.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            r3 = r2
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            androidx.fragment.app.o r4 = r3.c
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L7
            boolean r3 = r3.e
            if (r3 != 0) goto L7
            goto L20
        L1f:
            r2 = 0
        L20:
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            return r2
    }

    public final void i() {
            r12 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.u.K(r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing all operations to complete"
            android.util.Log.v(r1, r2)
        Le:
            android.view.ViewGroup r1 = r12.a
            boolean r1 = r1.isAttachedToWindow()
            java.util.ArrayList r2 = r12.b
            monitor-enter(r2)
            r12.n()     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = r12.b     // Catch: java.lang.Throwable -> L38
            r12.m(r3)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = r12.c     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = defpackage.gt0.m1(r3)     // Catch: java.lang.Throwable -> L38
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L38
            r5 = 0
            r6 = r5
        L2b:
            if (r6 >= r4) goto L3b
            java.lang.Object r7 = r3.get(r6)     // Catch: java.lang.Throwable -> L38
            int r6 = r6 + 1
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7     // Catch: java.lang.Throwable -> L38
            r7.g = r5     // Catch: java.lang.Throwable -> L38
            goto L2b
        L38:
            r12 = move-exception
            goto L100
        L3b:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L38
            r6 = r5
        L40:
            if (r6 >= r4) goto L91
            java.lang.Object r7 = r3.get(r6)     // Catch: java.lang.Throwable -> L38
            int r6 = r6 + 1
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7     // Catch: java.lang.Throwable -> L38
            boolean r8 = androidx.fragment.app.u.K(r0)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8b
            if (r1 == 0) goto L55
            java.lang.String r8 = ""
            goto L6d
        L55:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r8.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r9 = "Container "
            r8.append(r9)     // Catch: java.lang.Throwable -> L38
            android.view.ViewGroup r9 = r12.a     // Catch: java.lang.Throwable -> L38
            r8.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r9 = " is not attached to window. "
            r8.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L38
        L6d:
            java.lang.String r9 = "FragmentManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r10.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = "SpecialEffectsController: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L38
            r10.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "Cancelling running operation "
            r10.append(r8)     // Catch: java.lang.Throwable -> L38
            r10.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.v(r9, r8)     // Catch: java.lang.Throwable -> L38
        L8b:
            android.view.ViewGroup r8 = r12.a     // Catch: java.lang.Throwable -> L38
            r7.a(r8)     // Catch: java.lang.Throwable -> L38
            goto L40
        L91:
            java.util.ArrayList r3 = r12.b     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = defpackage.gt0.m1(r3)     // Catch: java.lang.Throwable -> L38
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L38
            r6 = r5
        L9c:
            if (r6 >= r4) goto La9
            java.lang.Object r7 = r3.get(r6)     // Catch: java.lang.Throwable -> L38
            int r6 = r6 + 1
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7     // Catch: java.lang.Throwable -> L38
            r7.g = r5     // Catch: java.lang.Throwable -> L38
            goto L9c
        La9:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L38
        Lad:
            if (r5 >= r4) goto Lfe
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L38
            int r5 = r5 + 1
            androidx.fragment.app.b0 r6 = (androidx.fragment.app.b0) r6     // Catch: java.lang.Throwable -> L38
            boolean r7 = androidx.fragment.app.u.K(r0)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto Lf8
            if (r1 == 0) goto Lc2
            java.lang.String r7 = ""
            goto Lda
        Lc2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r7.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "Container "
            r7.append(r8)     // Catch: java.lang.Throwable -> L38
            android.view.ViewGroup r8 = r12.a     // Catch: java.lang.Throwable -> L38
            r7.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = " is not attached to window. "
            r7.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L38
        Lda:
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r9.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = "SpecialEffectsController: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L38
            r9.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "Cancelling pending operation "
            r9.append(r7)     // Catch: java.lang.Throwable -> L38
            r9.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.v(r8, r7)     // Catch: java.lang.Throwable -> L38
        Lf8:
            android.view.ViewGroup r7 = r12.a     // Catch: java.lang.Throwable -> L38
            r6.a(r7)     // Catch: java.lang.Throwable -> L38
            goto Lad
        Lfe:
            monitor-exit(r2)
            return
        L100:
            monitor-exit(r2)
            throw r12
    }

    public final void l() {
            r7 = this;
            java.util.ArrayList r0 = r7.b
            monitor-enter(r0)
            r7.n()     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r1 = r7.b     // Catch: java.lang.Throwable -> L37
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L37
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch: java.lang.Throwable -> L37
        L10:
            boolean r2 = r1.hasPrevious()     // Catch: java.lang.Throwable -> L37
            r3 = 0
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.previous()     // Catch: java.lang.Throwable -> L37
            r4 = r2
            androidx.fragment.app.b0 r4 = (androidx.fragment.app.b0) r4     // Catch: java.lang.Throwable -> L37
            yn6 r5 = defpackage.ao6.Companion     // Catch: java.lang.Throwable -> L37
            androidx.fragment.app.o r6 = r4.c     // Catch: java.lang.Throwable -> L37
            android.view.View r6 = r6.mView     // Catch: java.lang.Throwable -> L37
            r6.getClass()     // Catch: java.lang.Throwable -> L37
            r5.getClass()     // Catch: java.lang.Throwable -> L37
            ao6 r5 = defpackage.yn6.a(r6)     // Catch: java.lang.Throwable -> L37
            ao6 r4 = r4.a     // Catch: java.lang.Throwable -> L37
            ao6 r6 = defpackage.ao6.VISIBLE     // Catch: java.lang.Throwable -> L37
            if (r4 != r6) goto L10
            if (r5 == r6) goto L10
            goto L3a
        L37:
            r7 = move-exception
            goto L4c
        L39:
            r2 = r3
        L3a:
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L40
            androidx.fragment.app.o r3 = r2.c     // Catch: java.lang.Throwable -> L37
        L40:
            if (r3 == 0) goto L47
            boolean r1 = r3.isPostponed()     // Catch: java.lang.Throwable -> L37
            goto L48
        L47:
            r1 = 0
        L48:
            r7.f = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return
        L4c:
            monitor-exit(r0)
            throw r7
    }

    public final void m(java.util.List r13) {
            r12 = this;
            int r0 = r13.size()
            r1 = 0
            r2 = r1
        L6:
            r3 = 1
            if (r2 >= r0) goto L121
            java.lang.Object r4 = r13.get(r2)
            androidx.fragment.app.b0 r4 = (androidx.fragment.app.b0) r4
            androidx.fragment.app.x r5 = r4.l
            boolean r6 = r4.h
            if (r6 == 0) goto L17
            goto L11d
        L17:
            r4.h = r3
            xn6 r3 = r4.b
            xn6 r6 = defpackage.xn6.ADDING
            java.lang.String r7 = " for Fragment "
            java.lang.String r8 = "FragmentManager"
            r9 = 2
            if (r3 != r6) goto Le1
            androidx.fragment.app.o r3 = r5.c
            r3.getClass()
            android.view.View r6 = r3.mView
            android.view.View r6 = r6.findFocus()
            if (r6 == 0) goto L51
            r3.setFocusedView(r6)
            boolean r10 = androidx.fragment.app.u.K(r9)
            if (r10 == 0) goto L51
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "requestFocus: Saved focused view "
            r10.<init>(r11)
            r10.append(r6)
            r10.append(r7)
            r10.append(r3)
            java.lang.String r6 = r10.toString()
            android.util.Log.v(r8, r6)
        L51:
            androidx.fragment.app.o r4 = r4.c
            android.view.View r4 = r4.requireView()
            r4.getClass()
            android.view.ViewParent r6 = r4.getParent()
            r7 = 0
            if (r6 != 0) goto L8b
            boolean r6 = androidx.fragment.app.u.K(r9)
            if (r6 == 0) goto L85
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Adding fragment "
            r6.<init>(r10)
            r6.append(r3)
            java.lang.String r10 = " view "
            r6.append(r10)
            r6.append(r4)
            java.lang.String r10 = " to container in onStart"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r8, r6)
        L85:
            r5.b()
            r4.setAlpha(r7)
        L8b:
            float r5 = r4.getAlpha()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto Lb9
            int r5 = r4.getVisibility()
            if (r5 != 0) goto Lb9
            boolean r5 = androidx.fragment.app.u.K(r9)
            if (r5 == 0) goto Lb5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Making view "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = " INVISIBLE in onStart"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r8, r5)
        Lb5:
            r5 = 4
            r4.setVisibility(r5)
        Lb9:
            float r5 = r3.getPostOnViewCreatedAlpha()
            r4.setAlpha(r5)
            boolean r4 = androidx.fragment.app.u.K(r9)
            if (r4 == 0) goto L11d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Setting view alpha to "
            r4.<init>(r5)
            float r3 = r3.getPostOnViewCreatedAlpha()
            r4.append(r3)
            java.lang.String r3 = " in onStart"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.v(r8, r3)
            goto L11d
        Le1:
            xn6 r4 = defpackage.xn6.REMOVING
            if (r3 != r4) goto L11d
            androidx.fragment.app.o r3 = r5.c
            r3.getClass()
            android.view.View r4 = r3.requireView()
            r4.getClass()
            boolean r5 = androidx.fragment.app.u.K(r9)
            if (r5 == 0) goto L11a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Clearing focus "
            r5.<init>(r6)
            android.view.View r6 = r4.findFocus()
            r5.append(r6)
            java.lang.String r6 = " on view "
            r5.append(r6)
            r5.append(r4)
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.v(r8, r3)
        L11a:
            r4.clearFocus()
        L11d:
            int r2 = r2 + 1
            goto L6
        L121:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L12a:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L13c
            java.lang.Object r2 = r13.next()
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            java.util.ArrayList r2 = r2.k
            defpackage.gt0.A0(r0, r2)
            goto L12a
        L13c:
            java.util.Set r13 = defpackage.gt0.p1(r0)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = defpackage.gt0.k1(r13)
            int r0 = r13.size()
        L14a:
            if (r1 >= r0) goto L166
            java.lang.Object r2 = r13.get(r1)
            wn6 r2 = (defpackage.wn6) r2
            r2.getClass()
            android.view.ViewGroup r4 = r12.a
            r4.getClass()
            boolean r5 = r2.a
            if (r5 != 0) goto L161
            r2.e(r4)
        L161:
            r2.a = r3
            int r1 = r1 + 1
            goto L14a
        L166:
            return
    }

    public final void n() {
            r5 = this;
            java.util.ArrayList r5 = r5.b
            int r0 = r5.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L33
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            xn6 r3 = r2.b
            xn6 r4 = defpackage.xn6.ADDING
            if (r3 != r4) goto L7
            androidx.fragment.app.o r3 = r2.c
            android.view.View r3 = r3.requireView()
            r3.getClass()
            yn6 r4 = defpackage.ao6.Companion
            int r3 = r3.getVisibility()
            r4.getClass()
            ao6 r3 = defpackage.yn6.b(r3)
            xn6 r4 = defpackage.xn6.NONE
            r2.d(r3, r4)
            goto L7
        L33:
            return
    }
}
