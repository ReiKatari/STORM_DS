package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq  reason: default package */
/* loaded from: classes.dex */
public abstract class jq extends androidx.fragment.app.p implements defpackage.mq {
    public defpackage.fr w0;

    public jq() {
            r3 = this;
            r3.<init>()
            e56 r0 = r3.R
            d56 r0 = r0.b
            hq r1 = new hq
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.c(r2, r1)
            iq r0 = new iq
            r1 = 0
            r0.<init>(r3, r1)
            r3.q(r0)
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.r()
            tq r2 = r2.v()
            fr r2 = (defpackage.fr) r2
            r2.z()
            android.view.ViewGroup r0 = r2.v0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            ar r3 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r3.a(r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r10) {
            r9 = this;
            tq r0 = r9.v()
            fr r0 = (defpackage.fr) r0
            r1 = 1
            r0.J0 = r1
            int r2 = r0.N0
            r3 = -100
            if (r2 == r3) goto L10
            goto L12
        L10:
            int r2 = defpackage.tq.B
        L12:
            int r0 = r0.F(r10, r2)
            boolean r2 = defpackage.tq.e(r10)
            if (r2 == 0) goto L1f
            defpackage.tq.p(r10)
        L1f:
            hy3 r2 = defpackage.fr.s(r10)
            boolean r3 = r10 instanceof android.view.ContextThemeWrapper
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L35
            android.content.res.Configuration r3 = defpackage.fr.w(r10, r0, r2, r5, r4)
            r6 = r10
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch: java.lang.IllegalStateException -> L35
            r6.applyOverrideConfiguration(r3)     // Catch: java.lang.IllegalStateException -> L35
            goto L1e7
        L35:
            boolean r3 = r10 instanceof defpackage.p41
            if (r3 == 0) goto L45
            android.content.res.Configuration r3 = defpackage.fr.w(r10, r0, r2, r5, r4)
            r4 = r10
            p41 r4 = (defpackage.p41) r4     // Catch: java.lang.IllegalStateException -> L45
            r4.a(r3)     // Catch: java.lang.IllegalStateException -> L45
            goto L1e7
        L45:
            boolean r3 = defpackage.fr.e1
            if (r3 != 0) goto L4b
            goto L1e7
        L4b:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r4 = -1
            r3.uiMode = r4
            r4 = 0
            r3.fontScale = r4
            android.content.Context r3 = r10.createConfigurationContext(r3)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r3.uiMode = r7
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L189
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r4
            int r4 = r3.diff(r6)
            if (r4 != 0) goto L83
            goto L18a
        L83:
            float r4 = r3.fontScale
            float r8 = r6.fontScale
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L8d
            r7.fontScale = r8
        L8d:
            int r4 = r3.mcc
            int r8 = r6.mcc
            if (r4 == r8) goto L95
            r7.mcc = r8
        L95:
            int r4 = r3.mnc
            int r8 = r6.mnc
            if (r4 == r8) goto L9d
            r7.mnc = r8
        L9d:
            defpackage.yq.a(r3, r6, r7)
            int r4 = r3.touchscreen
            int r8 = r6.touchscreen
            if (r4 == r8) goto La8
            r7.touchscreen = r8
        La8:
            int r4 = r3.keyboard
            int r8 = r6.keyboard
            if (r4 == r8) goto Lb0
            r7.keyboard = r8
        Lb0:
            int r4 = r3.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r4 == r8) goto Lb8
            r7.keyboardHidden = r8
        Lb8:
            int r4 = r3.navigation
            int r8 = r6.navigation
            if (r4 == r8) goto Lc0
            r7.navigation = r8
        Lc0:
            int r4 = r3.navigationHidden
            int r8 = r6.navigationHidden
            if (r4 == r8) goto Lc8
            r7.navigationHidden = r8
        Lc8:
            int r4 = r3.orientation
            int r8 = r6.orientation
            if (r4 == r8) goto Ld0
            r7.orientation = r8
        Ld0:
            int r4 = r3.screenLayout
            r4 = r4 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r4 == r8) goto Ldf
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        Ldf:
            int r4 = r3.screenLayout
            r4 = r4 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r4 == r8) goto Lee
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        Lee:
            int r4 = r3.screenLayout
            r4 = r4 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r4 == r8) goto Lfd
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        Lfd:
            int r4 = r3.screenLayout
            r4 = r4 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r4 == r8) goto L10c
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        L10c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r4 < r8) goto L14a
            int r4 = defpackage.k2.a(r3)
            r4 = r4 & 3
            int r8 = defpackage.k2.a(r6)
            r8 = r8 & 3
            if (r4 == r8) goto L12e
            int r4 = defpackage.k2.a(r7)
            int r8 = defpackage.k2.a(r6)
            r8 = r8 & 3
            r4 = r4 | r8
            defpackage.k2.n(r7, r4)
        L12e:
            int r4 = defpackage.k2.a(r3)
            r4 = r4 & 12
            int r8 = defpackage.k2.a(r6)
            r8 = r8 & 12
            if (r4 == r8) goto L14a
            int r4 = defpackage.k2.a(r7)
            int r8 = defpackage.k2.a(r6)
            r8 = r8 & 12
            r4 = r4 | r8
            defpackage.k2.n(r7, r4)
        L14a:
            int r4 = r3.uiMode
            r4 = r4 & 15
            int r8 = r6.uiMode
            r8 = r8 & 15
            if (r4 == r8) goto L159
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L159:
            int r4 = r3.uiMode
            r4 = r4 & 48
            int r8 = r6.uiMode
            r8 = r8 & 48
            if (r4 == r8) goto L168
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L168:
            int r4 = r3.screenWidthDp
            int r8 = r6.screenWidthDp
            if (r4 == r8) goto L170
            r7.screenWidthDp = r8
        L170:
            int r4 = r3.screenHeightDp
            int r8 = r6.screenHeightDp
            if (r4 == r8) goto L178
            r7.screenHeightDp = r8
        L178:
            int r4 = r3.smallestScreenWidthDp
            int r8 = r6.smallestScreenWidthDp
            if (r4 == r8) goto L180
            r7.smallestScreenWidthDp = r8
        L180:
            int r3 = r3.densityDpi
            int r4 = r6.densityDpi
            if (r3 == r4) goto L18a
            r7.densityDpi = r4
            goto L18a
        L189:
            r7 = r5
        L18a:
            android.content.res.Configuration r0 = defpackage.fr.w(r10, r0, r2, r7, r1)
            p41 r2 = new p41
            r3 = 2132017819(0x7f14029b, float:1.9673927E38)
            r2.<init>(r10, r3)
            r2.a(r0)
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch: java.lang.NullPointerException -> L1e6
            if (r10 == 0) goto L1e6
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L1ad
            defpackage.rp.o(r10)
            goto L1e6
        L1ad:
            java.lang.Object r0 = defpackage.lb4.j
            monitor-enter(r0)
            boolean r3 = defpackage.lb4.l     // Catch: java.lang.Throwable -> L1c2
            if (r3 != 0) goto L1ce
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L1c2 java.lang.NoSuchMethodException -> L1c4
            defpackage.lb4.k = r3     // Catch: java.lang.Throwable -> L1c2 java.lang.NoSuchMethodException -> L1c4
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L1c2 java.lang.NoSuchMethodException -> L1c4
            goto L1cc
        L1c2:
            r9 = move-exception
            goto L1e4
        L1c4:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r6 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r6, r3)     // Catch: java.lang.Throwable -> L1c2
        L1cc:
            defpackage.lb4.l = r1     // Catch: java.lang.Throwable -> L1c2
        L1ce:
            java.lang.reflect.Method r1 = defpackage.lb4.k     // Catch: java.lang.Throwable -> L1c2
            if (r1 == 0) goto L1e2
            r1.invoke(r10, r5)     // Catch: java.lang.Throwable -> L1c2 java.lang.reflect.InvocationTargetException -> L1d6 java.lang.IllegalAccessException -> L1d8
            goto L1e2
        L1d6:
            r10 = move-exception
            goto L1d9
        L1d8:
            r10 = move-exception
        L1d9:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r10)     // Catch: java.lang.Throwable -> L1c2
            defpackage.lb4.k = r5     // Catch: java.lang.Throwable -> L1c2
        L1e2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c2
            goto L1e6
        L1e4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c2
            throw r9
        L1e6:
            r10 = r2
        L1e7:
            super.attachBaseContext(r10)
            return
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
            r3 = this;
            ak7 r0 = r3.w()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.L()
            if (r0 != 0) goto L1a
        L17:
            super.closeOptionsMenu()
        L1a:
            return
    }

    @Override // defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            ak7 r1 = r3.w()
            r2 = 82
            if (r0 != r2) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.s0(r4)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int r1) {
            r0 = this;
            tq r0 = r0.v()
            fr r0 = (defpackage.fr) r0
            r0.z()
            android.view.Window r0 = r0.h0
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
            r2 = this;
            tq r2 = r2.v()
            fr r2 = (defpackage.fr) r2
            ku6 r0 = r2.k0
            if (r0 != 0) goto L1f
            r2.D()
            ku6 r0 = new ku6
            ak7 r1 = r2.j0
            if (r1 == 0) goto L18
            android.content.Context r1 = r1.f0()
            goto L1a
        L18:
            android.content.Context r1 = r2.g0
        L1a:
            r0.<init>(r1)
            r2.k0 = r0
        L1f:
            ku6 r2 = r2.k0
            return r2
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r1 = this;
            int r0 = defpackage.cl7.a
            android.content.res.Resources r1 = super.getResources()
            return r1
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
            r0 = this;
            tq r0 = r0.v()
            r0.d()
            return
    }

    @Override // defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r4) {
            r3 = this;
            super.onConfigurationChanged(r4)
            tq r3 = r3.v()
            fr r3 = (defpackage.fr) r3
            boolean r4 = r3.A0
            if (r4 == 0) goto L1b
            boolean r4 = r3.u0
            if (r4 == 0) goto L1b
            r3.D()
            ak7 r4 = r3.j0
            if (r4 == 0) goto L1b
            r4.p0()
        L1b:
            ir r4 = defpackage.ir.a()
            android.content.Context r0 = r3.g0
            monitor-enter(r4)
            ol5 r1 = r4.a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L4f
            java.util.WeakHashMap r2 = r1.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L33
            hz3 r0 = (defpackage.hz3) r0     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            r0.a()     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r3 = move-exception
            goto L4d
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)
            android.content.res.Configuration r4 = new android.content.res.Configuration
            android.content.Context r0 = r3.g0
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r4.<init>(r0)
            r3.M0 = r4
            r4 = 0
            r3.q(r4, r4)
            return
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L4f
        L4f:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            tq r0 = r0.v()
            r0.g()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L3e
            boolean r0 = r4.isCtrlPressed()
            if (r0 != 0) goto L3e
            int r0 = r4.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L3e
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L3e
            int r0 = r4.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L3e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L3e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L3e
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r4)
            if (r0 == 0) goto L3e
            r2 = 1
            return r2
        L3e:
            boolean r2 = super.onKeyDown(r3, r4)
            return r2
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L8
            r1 = 1
            return r1
        L8:
            ak7 r2 = r1.w()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L24
            if (r2 == 0) goto L24
            int r2 = r2.V()
            r2 = r2 & 4
            if (r2 == 0) goto L24
            boolean r1 = r1.x()
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public final void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            tq r0 = r0.v()
            fr r0 = (defpackage.fr) r0
            r0.z()
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPostResume() {
            r1 = this;
            super.onPostResume()
            tq r1 = r1.v()
            fr r1 = (defpackage.fr) r1
            r1.D()
            ak7 r1 = r1.j0
            if (r1 == 0) goto L14
            r0 = 1
            r1.C0(r0)
        L14:
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStart() {
            r2 = this;
            super.onStart()
            tq r2 = r2.v()
            fr r2 = (defpackage.fr) r2
            r0 = 1
            r1 = 0
            r2.q(r0, r1)
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStop() {
            r1 = this;
            super.onStop()
            tq r1 = r1.v()
            fr r1 = (defpackage.fr) r1
            r1.D()
            ak7 r1 = r1.j0
            if (r1 == 0) goto L14
            r0 = 0
            r1.C0(r0)
        L14:
            return
    }

    @Override // android.app.Activity
    public final void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            tq r0 = r0.v()
            r0.o(r1)
            return
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
            r3 = this;
            ak7 r0 = r3.w()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.t0()
            if (r0 != 0) goto L1a
        L17:
            super.openOptionsMenu()
        L1a:
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void setContentView(int r1) {
            r0 = this;
            r0.r()
            tq r0 = r0.v()
            r0.k(r1)
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.r()
            tq r0 = r0.v()
            r0.l(r1)
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.r()
            tq r0 = r0.v()
            r0.m(r1, r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            tq r0 = r0.v()
            fr r0 = (defpackage.fr) r0
            r0.O0 = r1
            return
    }

    public final defpackage.tq v() {
            r2 = this;
            fr r0 = r2.w0
            if (r0 != 0) goto Le
            zb6 r0 = defpackage.tq.A
            fr r0 = new fr
            r1 = 0
            r0.<init>(r2, r1, r2, r2)
            r2.w0 = r0
        Le:
            fr r2 = r2.w0
            return r2
    }

    public final defpackage.ak7 w() {
            r0 = this;
            tq r0 = r0.v()
            fr r0 = (defpackage.fr) r0
            r0.D()
            ak7 r0 = r0.j0
            return r0
    }

    public final boolean x() {
            r3 = this;
            android.content.Intent r0 = defpackage.ej2.D(r3)
            if (r0 == 0) goto L45
            boolean r1 = r3.shouldUpRecreateTask(r0)
            if (r1 == 0) goto L40
            rz6 r0 = new rz6
            r0.<init>(r3)
            android.content.Intent r1 = defpackage.ej2.D(r3)
            if (r1 != 0) goto L1b
            android.content.Intent r1 = defpackage.ej2.D(r3)
        L1b:
            if (r1 == 0) goto L35
            android.content.ComponentName r2 = r1.getComponent()
            if (r2 != 0) goto L2d
            android.content.Context r2 = r0.B
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r1.resolveActivity(r2)
        L2d:
            r0.a(r2)
            java.util.ArrayList r2 = r0.A
            r2.add(r1)
        L35:
            r0.b()
            r3.finishAffinity()     // Catch: java.lang.IllegalStateException -> L3c
            goto L43
        L3c:
            r3.finish()
            goto L43
        L40:
            r3.navigateUpTo(r0)
        L43:
            r3 = 1
            return r3
        L45:
            r3 = 0
            return r3
    }

    public final void y(androidx.appcompat.widget.Toolbar r4) {
            r3 = this;
            tq r3 = r3.v()
            fr r3 = (defpackage.fr) r3
            java.lang.Object r0 = r3.f0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto Ld
            return
        Ld:
            r3.D()
            ak7 r0 = r3.j0
            boolean r1 = r0 instanceof defpackage.nt7
            if (r1 != 0) goto L46
            r1 = 0
            r3.k0 = r1
            if (r0 == 0) goto L1e
            r0.q0()
        L1e:
            r3.j0 = r1
            i87 r0 = new i87
            java.lang.Object r1 = r3.f0
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L2f
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.CharSequence r1 = r1.getTitle()
            goto L31
        L2f:
            java.lang.CharSequence r1 = r3.l0
        L31:
            ar r2 = r3.i0
            r0.<init>(r4, r1, r2)
            r3.j0 = r0
            ar r1 = r3.i0
            h87 r0 = r0.n
            r1.B = r0
            r0 = 1
            r4.setBackInvokedCallbackEnabled(r0)
            r3.d()
            return
        L46:
            java.lang.String r3 = "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
            defpackage.i.m(r3)
            return
    }
}
