package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pk0 implements defpackage.u23, defpackage.y05, defpackage.kh6, defpackage.zk4, defpackage.rb0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ pk0(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r12, defpackage.vu7 r13) {
            r11 = this;
            int r0 = r11.A
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r3 = -1
            r4 = 647(0x287, float:9.07E-43)
            java.lang.Object r5 = r11.L
            java.lang.Object r11 = r11.B
            r6 = 0
            bh5 r11 = (defpackage.bh5) r11
            switch(r0) {
                case 6: goto L8e;
                default: goto L13;
            }
        L13:
            bt r5 = (defpackage.bt) r5
            java.lang.Object r0 = r5.L
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            int r7 = me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity.C0
            r12.getClass()
            ru7 r12 = r13.a
            e83 r13 = r12.h(r4)
            r13.getClass()
            int r4 = r13.b
            int r7 = r13.c
            int r13 = r13.a
            int r8 = r11.A
            if (r8 != r3) goto L37
            int r3 = r0.getContentInsetLeft()
            r11.A = r3
        L37:
            int r11 = r11.A
            int r11 = r11 + r13
            int r3 = r0.getContentInsetRight()
            r0.d()
            o26 r8 = r0.s0
            r9 = 0
            r8.h = r9
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r10) goto L4e
            r8.e = r11
            r8.a = r11
        L4e:
            if (r3 == r10) goto L54
            r8.f = r3
            r8.b = r3
        L54:
            int r11 = r0.getPaddingTop()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r13, r11, r7, r3)
            java.lang.Object r11 = r5.R
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 == 0) goto L8a
            r0.height = r4
            r11.setLayoutParams(r0)
            java.lang.Object r11 = r5.B
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 == 0) goto L86
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r13
            r0.rightMargin = r7
            r11.setLayoutParams(r0)
            vu7 r6 = r12.q(r13, r4, r7, r9)
            goto L8d
        L86:
            defpackage.u34.x(r2)
            goto L8d
        L8a:
            defpackage.u34.x(r1)
        L8d:
            return r6
        L8e:
            me.magnum.melonds.ui.settings.SettingsActivity r5 = (me.magnum.melonds.ui.settings.SettingsActivity) r5
            int r0 = me.magnum.melonds.ui.settings.SettingsActivity.F0
            r12.getClass()
            ru7 r12 = r13.a
            e83 r13 = r12.h(r4)
            r13.getClass()
            int r0 = r13.d
            int r4 = r13.b
            int r7 = r13.c
            int r13 = r13.a
            int r8 = r11.A
            java.lang.String r9 = "binding"
            if (r8 != r3) goto Lbf
            s9 r3 = r5.E0
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r3.d
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            int r3 = r3.getContentInsetStartWithNavigation()
            r11.A = r3
            goto Lbf
        Lbb:
            defpackage.nb3.a0(r9)
            throw r6
        Lbf:
            s9 r3 = r5.E0
            if (r3 == 0) goto L14f
            java.lang.Object r3 = r3.d
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            int r3 = r3.getLayoutDirection()
            if (r3 != 0) goto Lcf
            r3 = r13
            goto Ld0
        Lcf:
            r3 = r7
        Ld0:
            s9 r8 = r5.E0
            if (r8 == 0) goto L14b
            java.lang.Object r8 = r8.d
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            int r11 = r11.A
            int r11 = r11 + r3
            r8.setContentInsetStartWithNavigation(r11)
            s9 r11 = r5.E0
            if (r11 == 0) goto L147
            java.lang.Object r11 = r11.d
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            int r3 = r11.getPaddingTop()
            int r8 = r11.getPaddingBottom()
            r11.setPadding(r13, r3, r7, r8)
            s9 r11 = r5.E0
            if (r11 == 0) goto L143
            java.lang.Object r11 = r11.e
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            if (r3 == 0) goto L13f
            r3.height = r4
            r11.setLayoutParams(r3)
            s9 r11 = r5.E0
            if (r11 == 0) goto L13b
            java.lang.Object r11 = r11.b
            androidx.fragment.app.FragmentContainerView r11 = (androidx.fragment.app.FragmentContainerView) r11
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            if (r1 == 0) goto L137
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.leftMargin = r13
            r1.rightMargin = r7
            r11.setLayoutParams(r1)
            s9 r11 = r5.E0
            if (r11 == 0) goto L133
            java.lang.Object r11 = r11.c
            j97 r11 = (defpackage.j97) r11
            java.lang.Object r11 = r11.B
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            int r1 = r11.getPaddingTop()
            r11.setPadding(r13, r1, r7, r0)
            vu7 r6 = r12.q(r13, r4, r7, r0)
            goto L142
        L133:
            defpackage.nb3.a0(r9)
            throw r6
        L137:
            defpackage.u34.x(r2)
            goto L142
        L13b:
            defpackage.nb3.a0(r9)
            throw r6
        L13f:
            defpackage.u34.x(r1)
        L142:
            return r6
        L143:
            defpackage.nb3.a0(r9)
            throw r6
        L147:
            defpackage.nb3.a0(r9)
            throw r6
        L14b:
            defpackage.nb3.a0(r9)
            throw r6
        L14f:
            defpackage.nb3.a0(r9)
            throw r6
    }

    @Override // defpackage.kh6
    public boolean a() {
            r7 = this;
            java.lang.Object r0 = r7.B
            a25 r0 = (defpackage.a25) r0
            java.lang.Object r7 = r7.L
            nz r7 = (defpackage.nz) r7
            boolean r1 = r0.q
            if (r1 != 0) goto L26
            r0.h()
            long r1 = r0.o
            long r3 = r7.a
            long r1 = defpackage.nz.a(r1, r3)
            r7.a = r1
            long r3 = r0.n
            long r5 = r7.b
            long r1 = r1 + r5
            boolean r7 = r0.g(r3, r1)
            r7 = r7 ^ 1
            r0.q = r7
        L26:
            boolean r7 = r0.q
            return r7
    }

    @Override // defpackage.u23
    public void b(defpackage.v23 r2) {
            r1 = this;
            int r2 = r1.A
            java.lang.Object r0 = r1.L
            java.lang.Object r1 = r1.B
            switch(r2) {
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            re5 r1 = (defpackage.re5) r1
            u23 r0 = (defpackage.u23) r0
            r0.b(r1)
            return
        L11:
            s63 r1 = (defpackage.s63) r1
            u23 r0 = (defpackage.u23) r0
            r0.b(r1)
            return
    }

    public void c(defpackage.cz r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            qf1 r0 = (defpackage.qf1) r0
            java.lang.Object r2 = r2.L
            bw6 r2 = (defpackage.bw6) r2
            yo2 r1 = defpackage.yo2.DEFAULT
            yq1 r2 = r2.c
            boolean r2 = r2.a()
            if (r2 == 0) goto L18
            boolean r2 = r3.d
            if (r2 == 0) goto L18
            yo2 r1 = defpackage.yo2.YUV
        L18:
            qm4 r2 = r0.a
            java.lang.Object r3 = r2.L
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            r0 = 1
            defpackage.bp2.d(r3, r0)
            java.lang.Object r3 = r2.X
            java.lang.Thread r3 = (java.lang.Thread) r3
            defpackage.bp2.c(r3)
            java.lang.Object r3 = r2.i0
            yo2 r3 = (defpackage.yo2) r3
            if (r3 == r1) goto L36
            r2.i0 = r1
            int r3 = r2.A
            r2.u(r3)
        L36:
            return
    }

    @Override // defpackage.y05
    public void i(androidx.preference.Preference r6) {
            r5 = this;
            java.lang.Object r0 = r5.B
            d9 r0 = (defpackage.d9) r0
            java.lang.Object r5 = r5.L
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r5 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r5
            r1 = 0
            java.util.Set r6 = r6.getPersistedStringSet(r1)
            if (r6 == 0) goto L1e
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = defpackage.gt0.I0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L1e
            android.net.Uri r6 = android.net.Uri.parse(r6)
            goto L1f
        L1e:
            r6 = r1
        L1f:
            vr4 r2 = new vr4
            java.lang.String r5 = r5.X
            if (r5 == 0) goto L31
            java.lang.String r3 = "|"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r4 = 6
            java.util.List r5 = defpackage.qs6.K0(r5, r3, r4)
            goto L32
        L31:
            r5 = r1
        L32:
            if (r5 == 0) goto L3e
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r1)
            r1 = r5
            java.lang.String[] r1 = (java.lang.String[]) r1
        L3e:
            r2.<init>(r6, r1)
            r0.a(r2)
            return
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r7) {
            r6 = this;
            int r0 = r6.A
            java.lang.Object r1 = r6.L
            java.lang.Object r6 = r6.B
            switch(r0) {
                case 8: goto L2d;
                default: goto L9;
            }
        L9:
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            on2 r1 = (defpackage.on2) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            hx3 r2 = new hx3
            r3 = 1
            r2.<init>(r0, r3)
            tj1 r4 = defpackage.tj1.INSTANCE
            hl5 r5 = r7.c
            if (r5 == 0) goto L22
            r5.a(r4, r2)
        L22:
            ix3 r2 = new ix3
            r2.<init>(r0, r7, r1, r3)
            r6.execute(r2)
            jg7 r6 = defpackage.jg7.a
            return r6
        L2d:
            bw6 r6 = (defpackage.bw6) r6
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            r1.set(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "SurfaceRequest-surface-recreation("
            r7.<init>(r0)
            int r6 = r6.hashCode()
            r7.append(r6)
            java.lang.String r6 = ")"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            return r6
    }
}
