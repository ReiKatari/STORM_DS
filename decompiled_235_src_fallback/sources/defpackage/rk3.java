package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rk3 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ rk3(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.A
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Object r12 = r12.B
            switch(r0) {
                case 0: goto L210;
                case 1: goto L1c3;
                case 2: goto L1bb;
                case 3: goto L1b5;
                case 4: goto L1ad;
                case 5: goto L19f;
                case 6: goto L199;
                case 7: goto L17a;
                case 8: goto L174;
                case 9: goto L16e;
                case 10: goto L14a;
                case 11: goto L128;
                case 12: goto L107;
                case 13: goto Lff;
                case 14: goto Led;
                case 15: goto Le7;
                case 16: goto Ldf;
                case 17: goto L23;
                case 18: goto L18;
                default: goto Lb;
            }
        Lb:
            java.util.concurrent.ExecutorService r12 = (java.util.concurrent.ExecutorService) r12
            r12.shutdownNow()
            r0 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r12.awaitTermination(r0, r2)
            return
        L18:
            android.os.HandlerThread r12 = (android.os.HandlerThread) r12
            r12.quit()
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.join(r0)
            return
        L23:
            r37 r12 = (defpackage.r37) r12
            bt r0 = r12.b
            r12.n = r4
            ua4 r5 = r12.m
            android.view.View r12 = r12.a
            boolean r6 = r12.isFocused()
            if (r6 != 0) goto L48
            android.view.View r12 = r12.getRootView()
            android.view.View r12 = r12.findFocus()
            if (r12 == 0) goto L48
            boolean r12 = r12.onCheckIsTextEditor()
            if (r12 != r3) goto L48
            r5.g()
            goto Lde
        L48:
            java.lang.Object[] r12 = r5.A
            int r6 = r5.L
            r8 = r2
            r7 = r4
        L4e:
            if (r8 >= r6) goto L8a
            r9 = r12[r8]
            p37 r9 = (defpackage.p37) r9
            int[] r10 = defpackage.q37.a
            int r11 = r9.ordinal()
            r10 = r10[r11]
            if (r10 == r3) goto L84
            if (r10 == r1) goto L80
            r11 = 3
            if (r10 == r11) goto L6c
            r11 = 4
            if (r10 != r11) goto L67
            goto L6c
        L67:
            defpackage.i.d()
            goto Lde
        L6c:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r10 = defpackage.nb3.k(r4, r10)
            if (r10 != 0) goto L87
            p37 r7 = defpackage.p37.ShowKeyboard
            if (r9 != r7) goto L7a
            r7 = r3
            goto L7b
        L7a:
            r7 = r2
        L7b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L87
        L80:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L82:
            r7 = r4
            goto L87
        L84:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L82
        L87:
            int r8 = r8 + 1
            goto L4e
        L8a:
            r5.g()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = defpackage.nb3.k(r4, r12)
            if (r12 == 0) goto La6
            java.lang.Object r12 = r0.L
            go3 r12 = (defpackage.go3) r12
            java.lang.Object r12 = r12.getValue()
            android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12
            java.lang.Object r1 = r0.B
            android.view.View r1 = (android.view.View) r1
            r12.restartInput(r1)
        La6:
            if (r7 == 0) goto Lc5
            boolean r12 = r7.booleanValue()
            if (r12 == 0) goto Lba
            java.lang.Object r12 = r0.R
            s35 r12 = (defpackage.s35) r12
            java.lang.Object r12 = r12.A
            s35 r12 = (defpackage.s35) r12
            r12.E()
            goto Lc5
        Lba:
            java.lang.Object r12 = r0.R
            s35 r12 = (defpackage.s35) r12
            java.lang.Object r12 = r12.A
            s35 r12 = (defpackage.s35) r12
            r12.z()
        Lc5:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            boolean r12 = defpackage.nb3.k(r4, r12)
            if (r12 == 0) goto Lde
            java.lang.Object r12 = r0.L
            go3 r12 = (defpackage.go3) r12
            java.lang.Object r12 = r12.getValue()
            android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12
            java.lang.Object r0 = r0.B
            android.view.View r0 = (android.view.View) r0
            r12.restartInput(r0)
        Lde:
            return
        Ldf:
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            android.widget.EditText r12 = r12.d0
            r12.requestLayout()
            return
        Le7:
            wy6 r12 = (defpackage.wy6) r12
            r12.b()
            return
        Led:
            hx6 r12 = (defpackage.hx6) r12
            fx6 r12 = r12.a
            android.view.ViewParent r0 = r12.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lfe
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r12)
        Lfe:
            return
        Lff:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r12
            int[] r0 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.H0
            r12.l()
            return
        L107:
            m44 r12 = (defpackage.m44) r12
            java.lang.Object r12 = r12.R
            qs0 r12 = (defpackage.qs0) r12
            if (r12 == 0) goto L127
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L117:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L127
            java.lang.Object r0 = r12.next()
            qv6 r0 = (defpackage.qv6) r0
            r0.b()
            goto L117
        L127:
            return
        L128:
            k60 r12 = (defpackage.k60) r12
            r12.c = r2
            java.lang.Object r0 = r12.e
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            ho7 r2 = r0.i
            if (r2 == 0) goto L140
            boolean r2 = r2.f()
            if (r2 == 0) goto L140
            int r0 = r12.b
            r12.a(r0)
            goto L149
        L140:
            int r2 = r0.h
            if (r2 != r1) goto L149
            int r12 = r12.b
            r0.w(r12)
        L149:
            return
        L14a:
            me.magnum.melonds.ui.settings.SettingsActivity r12 = (me.magnum.melonds.ui.settings.SettingsActivity) r12
            tp6 r0 = r12.B0
            ak7 r1 = r12.w()
            if (r1 == 0) goto L160
            java.lang.CharSequence r1 = r1.h0()
            if (r1 == 0) goto L160
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L162
        L160:
            java.lang.String r1 = ""
        L162:
            r0.getClass()
            r0.m(r4, r1)
            tp6 r12 = r12.C0
            r12.l(r4)
            return
        L16e:
            hq5 r12 = (defpackage.hq5) r12
            defpackage.hq5.a(r12)
            return
        L174:
            id5 r12 = (defpackage.id5) r12
            r12.o()
            return
        L17a:
            h35 r12 = (defpackage.h35) r12
            ku3 r0 = r12.Y
            int r1 = r12.B
            if (r1 != 0) goto L189
            r12.L = r3
            st3 r1 = defpackage.st3.ON_PAUSE
            r0.f(r1)
        L189:
            int r1 = r12.A
            if (r1 != 0) goto L198
            boolean r1 = r12.L
            if (r1 == 0) goto L198
            st3 r1 = defpackage.st3.ON_STOP
            r0.f(r1)
            r12.R = r3
        L198:
            return
        L199:
            p25 r12 = (defpackage.p25) r12
            r12.r()
            return
        L19f:
            nw4 r12 = (defpackage.nw4) r12
            f35 r0 = r12.e
            if (r0 == 0) goto L1aa
            ci0 r0 = r0.a
            r0.m()
        L1aa:
            r12.e = r4
            return
        L1ad:
            w64 r12 = (defpackage.w64) r12
            r12.m0 = r3
            r12.invalidate()
            return
        L1b5:
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            com.google.android.material.button.MaterialButton.a(r12)
            return
        L1bb:
            rc3 r12 = (defpackage.rc3) r12
            if (r12 == 0) goto L1c2
            r12.h(r4)
        L1c2:
            return
        L1c3:
            ci0 r12 = (defpackage.ci0) r12
            java.lang.Object r0 = r12.d
            gj0 r0 = (defpackage.gj0) r0
            if (r0 == 0) goto L20f
            r12.m()
            java.lang.Object r0 = r12.e
            zt3 r0 = (defpackage.zt3) r0
            r0.getClass()
            java.lang.Object r12 = r12.h
            java.util.HashSet r12 = (java.util.HashSet) r12
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            if (r12 != 0) goto L1e7
            java.util.HashMap r12 = r0.b     // Catch: java.lang.Throwable -> L1e5
            java.util.Set r12 = r12.keySet()     // Catch: java.lang.Throwable -> L1e5
            goto L1e7
        L1e5:
            r12 = move-exception
            goto L20d
        L1e7:
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L1e5
        L1eb:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> L1e5
            if (r2 == 0) goto L20b
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> L1e5
            my r2 = (defpackage.my) r2     // Catch: java.lang.Throwable -> L1e5
            java.util.HashMap r3 = r0.b     // Catch: java.lang.Throwable -> L1e5
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L1e5
            if (r3 == 0) goto L1eb
            java.util.HashMap r3 = r0.b     // Catch: java.lang.Throwable -> L1e5
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L1e5
            vt3 r2 = (defpackage.vt3) r2     // Catch: java.lang.Throwable -> L1e5
            r0.k(r2)     // Catch: java.lang.Throwable -> L1e5
            goto L1eb
        L20b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e5
            goto L20f
        L20d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e5
            throw r12
        L20f:
            return
        L210:
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r12 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r12
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r12.E()
            return
    }
}
