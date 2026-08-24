package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na7  reason: default package */
/* loaded from: classes.dex */
public final class na7 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public defpackage.ea7 A;
    public android.view.ViewGroup B;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r19 = this;
            r0 = r19
            ea7 r1 = r0.A
            android.view.ViewGroup r2 = r0.B
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            r3.removeOnPreDrawListener(r0)
            r2.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r3 = defpackage.oa7.c
            boolean r3 = r3.remove(r2)
            r6 = 1
            if (r3 != 0) goto L1c
            r10 = r6
            goto L33d
        L1c:
            wu r3 = defpackage.oa7.b()
            java.lang.Object r4 = r3.get(r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L32
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.put(r2, r4)
        L30:
            r7 = 0
            goto L3d
        L32:
            int r7 = r4.size()
            if (r7 <= 0) goto L30
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r4)
        L3d:
            r4.add(r1)
            ma7 r4 = new ma7
            r4.<init>(r0, r3)
            r1.a(r4)
            r8 = 0
            r1.i(r2, r8)
            if (r7 == 0) goto L61
            int r0 = r7.size()
            r3 = r8
        L53:
            if (r3 >= r0) goto L61
            java.lang.Object r4 = r7.get(r3)
            int r3 = r3 + 1
            ea7 r4 = (defpackage.ea7) r4
            r4.F(r2)
            goto L53
        L61:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h0 = r0
            eb r0 = r1.Z
            eb r3 = r1.d0
            wu r4 = new wu
            java.lang.Object r7 = r0.B
            wu r7 = (defpackage.wu) r7
            r4.<init>(r7)
            wu r7 = new wu
            java.lang.Object r9 = r3.B
            wu r9 = (defpackage.wu) r9
            r7.<init>(r9)
            r9 = r8
        L86:
            int[] r10 = r1.f0
            int r11 = r10.length
            r12 = 2
            if (r9 >= r11) goto L1ea
            r10 = r10[r9]
            if (r10 == r6) goto L1a9
            if (r10 == r12) goto L154
            r11 = 3
            if (r10 == r11) goto Lff
            r11 = 4
            if (r10 == r11) goto L9d
        L98:
            r17 = r6
            r15 = r9
            goto L1e3
        L9d:
            java.lang.Object r10 = r0.R
            hz3 r10 = (defpackage.hz3) r10
            java.lang.Object r11 = r3.R
            hz3 r11 = (defpackage.hz3) r11
            int r12 = r10.i()
            r13 = r8
        Laa:
            if (r13 >= r12) goto L98
            java.lang.Object r14 = r10.j(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto Lf5
            boolean r15 = r1.y(r14)
            if (r15 == 0) goto Lf5
            r15 = r9
            long r8 = r10.e(r13)
            java.lang.Object r8 = r11.b(r8)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto Lf2
            boolean r9 = r1.y(r8)
            if (r9 == 0) goto Lf2
            java.lang.Object r9 = r4.get(r14)
            sa7 r9 = (defpackage.sa7) r9
            java.lang.Object r16 = r7.get(r8)
            r17 = r6
            r6 = r16
            sa7 r6 = (defpackage.sa7) r6
            if (r9 == 0) goto Lf8
            if (r6 == 0) goto Lf8
            java.util.ArrayList r5 = r1.g0
            r5.add(r9)
            java.util.ArrayList r5 = r1.h0
            r5.add(r6)
            r4.remove(r14)
            r7.remove(r8)
            goto Lf8
        Lf2:
            r17 = r6
            goto Lf8
        Lf5:
            r17 = r6
            r15 = r9
        Lf8:
            int r13 = r13 + 1
            r9 = r15
            r6 = r17
            r8 = 0
            goto Laa
        Lff:
            r17 = r6
            r15 = r9
            java.lang.Object r5 = r0.L
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r6 = r3.L
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            int r8 = r5.size()
            r9 = 0
        L10f:
            if (r9 >= r8) goto L1e3
            java.lang.Object r10 = r5.valueAt(r9)
            android.view.View r10 = (android.view.View) r10
            if (r10 == 0) goto L151
            boolean r11 = r1.y(r10)
            if (r11 == 0) goto L151
            int r11 = r5.keyAt(r9)
            java.lang.Object r11 = r6.get(r11)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L151
            boolean r12 = r1.y(r11)
            if (r12 == 0) goto L151
            java.lang.Object r12 = r4.get(r10)
            sa7 r12 = (defpackage.sa7) r12
            java.lang.Object r13 = r7.get(r11)
            sa7 r13 = (defpackage.sa7) r13
            if (r12 == 0) goto L151
            if (r13 == 0) goto L151
            java.util.ArrayList r14 = r1.g0
            r14.add(r12)
            java.util.ArrayList r12 = r1.h0
            r12.add(r13)
            r4.remove(r10)
            r7.remove(r11)
        L151:
            int r9 = r9 + 1
            goto L10f
        L154:
            r17 = r6
            r15 = r9
            java.lang.Object r5 = r0.X
            wu r5 = (defpackage.wu) r5
            java.lang.Object r6 = r3.X
            wu r6 = (defpackage.wu) r6
            int r8 = r5.L
            r9 = 0
        L162:
            if (r9 >= r8) goto L1e3
            java.lang.Object r10 = r5.i(r9)
            android.view.View r10 = (android.view.View) r10
            if (r10 == 0) goto L1a6
            boolean r11 = r1.y(r10)
            if (r11 == 0) goto L1a6
            java.lang.Object r11 = r5.f(r9)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r6.get(r11)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L1a6
            boolean r12 = r1.y(r11)
            if (r12 == 0) goto L1a6
            java.lang.Object r12 = r4.get(r10)
            sa7 r12 = (defpackage.sa7) r12
            java.lang.Object r13 = r7.get(r11)
            sa7 r13 = (defpackage.sa7) r13
            if (r12 == 0) goto L1a6
            if (r13 == 0) goto L1a6
            java.util.ArrayList r14 = r1.g0
            r14.add(r12)
            java.util.ArrayList r12 = r1.h0
            r12.add(r13)
            r4.remove(r10)
            r7.remove(r11)
        L1a6:
            int r9 = r9 + 1
            goto L162
        L1a9:
            r17 = r6
            r15 = r9
            int r5 = r4.L
            int r5 = r5 + (-1)
        L1b0:
            if (r5 < 0) goto L1e3
            java.lang.Object r6 = r4.f(r5)
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L1e0
            boolean r8 = r1.y(r6)
            if (r8 == 0) goto L1e0
            java.lang.Object r6 = r7.remove(r6)
            sa7 r6 = (defpackage.sa7) r6
            if (r6 == 0) goto L1e0
            android.view.View r8 = r6.b
            boolean r8 = r1.y(r8)
            if (r8 == 0) goto L1e0
            java.lang.Object r8 = r4.g(r5)
            sa7 r8 = (defpackage.sa7) r8
            java.util.ArrayList r9 = r1.g0
            r9.add(r8)
            java.util.ArrayList r8 = r1.h0
            r8.add(r6)
        L1e0:
            int r5 = r5 + (-1)
            goto L1b0
        L1e3:
            int r9 = r15 + 1
            r6 = r17
            r8 = 0
            goto L86
        L1ea:
            r17 = r6
            r0 = 0
        L1ed:
            int r3 = r4.L
            if (r0 >= r3) goto L20d
            java.lang.Object r3 = r4.i(r0)
            sa7 r3 = (defpackage.sa7) r3
            android.view.View r5 = r3.b
            boolean r5 = r1.y(r5)
            if (r5 == 0) goto L20a
            java.util.ArrayList r5 = r1.g0
            r5.add(r3)
            java.util.ArrayList r3 = r1.h0
            r5 = 0
            r3.add(r5)
        L20a:
            int r0 = r0 + 1
            goto L1ed
        L20d:
            r0 = 0
        L20e:
            int r3 = r7.L
            if (r0 >= r3) goto L230
            java.lang.Object r3 = r7.i(r0)
            sa7 r3 = (defpackage.sa7) r3
            android.view.View r4 = r3.b
            boolean r4 = r1.y(r4)
            if (r4 == 0) goto L22c
            java.util.ArrayList r4 = r1.h0
            r4.add(r3)
            java.util.ArrayList r3 = r1.g0
            r5 = 0
            r3.add(r5)
            goto L22d
        L22c:
            r5 = 0
        L22d:
            int r0 = r0 + 1
            goto L20e
        L230:
            wu r0 = defpackage.ea7.q()
            int r3 = r0.L
            android.view.WindowId r4 = r2.getWindowId()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r3 = r3 + (-1)
        L241:
            if (r3 < 0) goto L2be
            java.lang.Object r6 = r0.f(r3)
            android.animation.Animator r6 = (android.animation.Animator) r6
            if (r6 == 0) goto L2b9
            java.lang.Object r7 = r0.get(r6)
            u97 r7 = (defpackage.u97) r7
            if (r7 == 0) goto L2b9
            ea7 r8 = r7.e
            android.view.View r9 = r7.a
            if (r9 == 0) goto L2b9
            android.view.WindowId r10 = r7.d
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L2b9
            sa7 r7 = r7.c
            r10 = r17
            sa7 r11 = r1.t(r9, r10)
            sa7 r13 = r1.o(r9, r10)
            if (r11 != 0) goto L27e
            if (r13 != 0) goto L27e
            eb r10 = r1.d0
            java.lang.Object r10 = r10.B
            wu r10 = (defpackage.wu) r10
            java.lang.Object r9 = r10.get(r9)
            r13 = r9
            sa7 r13 = (defpackage.sa7) r13
        L27e:
            if (r11 != 0) goto L282
            if (r13 == 0) goto L2b9
        L282:
            boolean r7 = r8.w(r7, r13)
            if (r7 == 0) goto L2b9
            ea7 r7 = r8.p()
            java.util.ArrayList r9 = r8.j0
            z97 r7 = r7.u0
            if (r7 == 0) goto L2a5
            r6.cancel()
            r9.remove(r6)
            r0.g(r3)
            int r6 = r9.size()
            if (r6 != 0) goto L2b9
            r5.add(r8)
            goto L2b9
        L2a5:
            boolean r7 = r6.isRunning()
            if (r7 != 0) goto L2b6
            boolean r7 = r6.isStarted()
            if (r7 == 0) goto L2b2
            goto L2b6
        L2b2:
            r0.g(r3)
            goto L2b9
        L2b6:
            r6.cancel()
        L2b9:
            int r3 = r3 + (-1)
            r17 = 1
            goto L241
        L2be:
            r0 = 0
        L2bf:
            int r3 = r5.size()
            if (r0 >= r3) goto L2e0
            java.lang.Object r3 = r5.get(r0)
            ea7 r3 = (defpackage.ea7) r3
            fa6 r4 = defpackage.fa6.R
            r6 = 0
            r3.A(r3, r4, r6)
            boolean r4 = r3.n0
            if (r4 != 0) goto L2dd
            r10 = 1
            r3.n0 = r10
            fa6 r4 = defpackage.fa6.L
            r3.A(r3, r4, r6)
        L2dd:
            int r0 = r0 + 1
            goto L2bf
        L2e0:
            eb r0 = r1.Z
            eb r3 = r1.d0
            java.util.ArrayList r4 = r1.g0
            java.util.ArrayList r5 = r1.h0
            r18 = r2
            r2 = r0
            r0 = r1
            r1 = r18
            r0.m(r1, r2, r3, r4, r5)
            z97 r1 = r0.u0
            if (r1 != 0) goto L2fb
            r0.G()
            r17 = 1
            return r17
        L2fb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L33c
            r0.C()
            z97 r1 = r0.u0
            qa7 r2 = r1.h
            long r3 = r2.t0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L312
            r5 = 1
        L312:
            long r3 = r1.a
            r2.H(r5, r3)
            r1.a = r5
            z97 r0 = r0.u0
            r10 = 1
            r0.b = r10
            int r1 = r0.d
            if (r1 != r10) goto L329
            r6 = 0
            r0.d = r6
            r0.g()
            return r10
        L329:
            r6 = 0
            if (r1 != r12) goto L33d
            r0.d = r6
            java.lang.Runnable r1 = r0.g
            r0.g = r1
            r0.h()
            fo6 r0 = r0.e
            r1 = 0
            r0.a(r1)
            return r10
        L33c:
            r10 = 1
        L33d:
            return r10
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup r5 = r4.B
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r0.removeOnPreDrawListener(r4)
            r5.removeOnAttachStateChangeListener(r4)
            java.util.ArrayList r0 = defpackage.oa7.c
            r0.remove(r5)
            wu r0 = defpackage.oa7.b()
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L36
            int r1 = r0.size()
            if (r1 <= 0) goto L36
            int r1 = r0.size()
            r2 = 0
        L28:
            if (r2 >= r1) goto L36
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            ea7 r3 = (defpackage.ea7) r3
            r3.F(r5)
            goto L28
        L36:
            ea7 r4 = r4.A
            r5 = 1
            r4.j(r5)
            return
    }
}
