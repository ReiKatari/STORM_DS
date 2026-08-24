package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv0  reason: default package */
/* loaded from: classes.dex */
public abstract class mv0 extends defpackage.lv0 implements defpackage.bp7, defpackage.mw2, defpackage.g56, defpackage.jl4, defpackage.id4, defpackage.l9, defpackage.kl4, defpackage.yl4, defpackage.rl4, defpackage.sl4, defpackage.l44 {
    public final defpackage.f41 B;
    public final defpackage.m44 L;
    public final defpackage.e56 R;
    public defpackage.ap7 X;
    public final defpackage.jv0 Y;
    public final defpackage.ex6 Z;
    public final java.util.concurrent.atomic.AtomicInteger d0;
    public final defpackage.kv0 e0;
    public final java.util.concurrent.CopyOnWriteArrayList f0;
    public final java.util.concurrent.CopyOnWriteArrayList g0;
    public final java.util.concurrent.CopyOnWriteArrayList h0;
    public final java.util.concurrent.CopyOnWriteArrayList i0;
    public final java.util.concurrent.CopyOnWriteArrayList j0;
    public final java.util.concurrent.CopyOnWriteArrayList k0;
    public final java.util.concurrent.CopyOnWriteArrayList l0;
    public boolean m0;
    public boolean n0;
    public final defpackage.ex6 o0;
    public final defpackage.ex6 p0;
    public final defpackage.ex6 q0;

    public mv0() {
            r5 = this;
            r5.<init>()
            f41 r0 = new f41
            r0.<init>()
            r5.B = r0
            m44 r0 = new m44
            cv0 r1 = new cv0
            r2 = 1
            r1.<init>(r5, r2)
            r0.<init>(r1)
            r5.L = r0
            f56 r0 = new f56
            t46 r1 = new t46
            r3 = 2
            r1.<init>(r5, r3)
            r0.<init>(r5, r1)
            e56 r1 = new e56
            r1.<init>(r0)
            r5.R = r1
            jv0 r0 = new jv0
            r0.<init>(r5)
            r5.Y = r0
            dv0 r0 = new dv0
            r0.<init>(r5, r2)
            ex6 r4 = new ex6
            r4.<init>(r0)
            r5.Z = r4
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r5.d0 = r0
            kv0 r0 = new kv0
            r0.<init>(r5)
            r5.e0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.f0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.g0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.h0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.i0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.j0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.k0 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.l0 = r0
            dv0 r0 = new dv0
            r0.<init>(r5, r3)
            ex6 r3 = new ex6
            r3.<init>(r0)
            r5.o0 = r3
            ku3 r0 = r5.A
            if (r0 == 0) goto Ldd
            fv0 r3 = new fv0
            r4 = 0
            r3.<init>(r5, r4)
            r0.a(r3)
            ku3 r0 = r5.A
            fv0 r3 = new fv0
            r3.<init>(r5, r2)
            r0.a(r3)
            ku3 r0 = r5.A
            mf5 r3 = new mf5
            r3.<init>(r5, r2)
            r0.a(r3)
            r1.a()
            defpackage.y46.b(r5)
            gv0 r0 = new gv0
            r0.<init>(r5, r4)
            d56 r1 = r1.b
            java.lang.String r2 = "android:support:activity-result"
            r1.c(r2, r0)
            hv0 r0 = new hv0
            r0.<init>(r5, r4)
            r5.q(r0)
            dv0 r0 = new dv0
            r1 = 3
            r0.<init>(r5, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r5.p0 = r1
            dv0 r0 = new dv0
            r1 = 4
            r0.<init>(r5, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r5.q0 = r1
            return
        Ldd:
            java.lang.String r5 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            defpackage.i.m(r5)
            r5 = 0
            throw r5
    }

    public static void p(defpackage.mv0 r2) {
            super.onBackPressed()     // Catch: java.lang.NullPointerException -> L4 java.lang.IllegalStateException -> L13
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L12
            goto L20
        L12:
            throw r2
        L13:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L21
        L20:
            return
        L21:
            throw r2
    }

    @Override // defpackage.id4
    public final defpackage.eb a() {
            r0 = this;
            il4 r0 = r0.b()
            gl4 r0 = r0.c()
            eb r0 = r0.c
            return r0
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.r()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            jv0 r1 = r2.Y
            r1.a(r0)
            super.addContentView(r3, r4)
            return
    }

    @Override // defpackage.jl4
    public final defpackage.il4 b() {
            r0 = this;
            ex6 r0 = r0.q0
            java.lang.Object r0 = r0.getValue()
            il4 r0 = (defpackage.il4) r0
            return r0
    }

    @Override // defpackage.sl4
    public final void d(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.j0
            r0.add(r1)
            return
    }

    @Override // defpackage.rl4
    public final void e(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.i0
            r0.add(r1)
            return
    }

    @Override // defpackage.yl4
    public final void f(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.g0
            r0.add(r1)
            return
    }

    @Override // defpackage.l9
    public final defpackage.j9 g() {
            r0 = this;
            kv0 r0 = r0.e0
            return r0
    }

    @Override // defpackage.mw2
    public final defpackage.j71 getDefaultViewModelCreationExtras() {
            r4 = this;
            m94 r0 = new m94
            r1 = 0
            r0.<init>(r1)
            android.app.Application r1 = r4.getApplication()
            java.util.LinkedHashMap r2 = r0.a
            if (r1 == 0) goto L17
            vo7 r1 = defpackage.wo7.d
            android.app.Application r3 = r4.getApplication()
            r2.put(r1, r3)
        L17:
            q61 r1 = defpackage.y46.a
            r2.put(r1, r4)
            jd1 r1 = defpackage.y46.b
            r2.put(r1, r4)
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L2c
            android.os.Bundle r4 = r4.getExtras()
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 == 0) goto L34
            w31 r1 = defpackage.y46.c
            r2.put(r1, r4)
        L34:
            return r0
    }

    public defpackage.yo7 getDefaultViewModelProviderFactory() {
            r0 = this;
            ex6 r0 = r0.p0
            java.lang.Object r0 = r0.getValue()
            yo7 r0 = (defpackage.yo7) r0
            return r0
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            ku3 r0 = r0.A
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r0 = this;
            e56 r0 = r0.R
            d56 r0 = r0.b
            return r0
    }

    @Override // defpackage.bp7
    public final defpackage.ap7 getViewModelStore() {
            r1 = this;
            android.app.Application r0 = r1.getApplication()
            if (r0 == 0) goto L27
            ap7 r0 = r1.X
            if (r0 != 0) goto L21
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            iv0 r0 = (defpackage.iv0) r0
            if (r0 == 0) goto L16
            ap7 r0 = r0.a
            r1.X = r0
        L16:
            ap7 r0 = r1.X
            if (r0 != 0) goto L21
            ap7 r0 = new ap7
            r0.<init>()
            r1.X = r0
        L21:
            ap7 r1 = r1.X
            r1.getClass()
            return r1
        L27:
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.yl4
    public final void h(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.g0
            r0.remove(r1)
            return
    }

    @Override // defpackage.l44
    public final void i(defpackage.fl2 r2) {
            r1 = this;
            r2.getClass()
            m44 r1 = r1.L
            java.lang.Object r0 = r1.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r2)
            java.lang.Object r0 = r1.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.remove(r2)
            if (r2 != 0) goto L1e
            java.lang.Object r1 = r1.B
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
        L1e:
            defpackage.u34.a()
            return
    }

    @Override // defpackage.kl4
    public final void k(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f0
            r0.add(r1)
            return
    }

    @Override // defpackage.kl4
    public final void l(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f0
            r0.remove(r1)
            return
    }

    @Override // defpackage.l44
    public final void m(defpackage.fl2 r2) {
            r1 = this;
            r2.getClass()
            m44 r1 = r1.L
            java.lang.Object r0 = r1.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r2)
            java.lang.Object r1 = r1.B
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
    }

    @Override // defpackage.sl4
    public final void n(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.j0
            r0.remove(r1)
            return
    }

    @Override // defpackage.rl4
    public final void o(defpackage.b31 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.i0
            r0.remove(r1)
            return
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            kv0 r0 = r1.e0
            boolean r0 = r0.a(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
            r0 = this;
            ex6 r0 = r0.o0
            java.lang.Object r0 = r0.getValue()
            vj1 r0 = (defpackage.vj1) r0
            r0.a()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            r2.getClass()
            super.onConfigurationChanged(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            b31 r0 = (defpackage.b31) r0
            r0.accept(r2)
            goto Lf
        L1f:
            return
    }

    @Override // defpackage.lv0, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            e56 r0 = r2.R
            r0.b(r3)
            f41 r0 = r2.B
            r0.getClass()
            r0.b = r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            ml4 r1 = (defpackage.ml4) r1
            r1.a(r2)
            goto L12
        L22:
            super.onCreate(r3)
            int r3 = defpackage.ik5.B
            defpackage.gk5.b(r2)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r3 = "android.software.picture_in_picture"
            r2.hasSystemFeature(r3)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            r3.getClass()
            if (r2 != 0) goto L28
            super.onCreatePanelMenu(r2, r3)
            android.view.MenuInflater r2 = r1.getMenuInflater()
            m44 r1 = r1.L
            java.lang.Object r1 = r1.L
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.next()
            fl2 r0 = (defpackage.fl2) r0
            androidx.fragment.app.u r0 = r0.a
            r0.k(r3, r2)
            goto L16
        L28:
            r1 = 1
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r3, android.view.MenuItem r4) {
            r2 = this;
            r4.getClass()
            boolean r0 = super.onMenuItemSelected(r3, r4)
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            r0 = 0
            if (r3 != 0) goto L2d
            m44 r2 = r2.L
            java.lang.Object r2 = r2.L
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            fl2 r3 = (defpackage.fl2) r3
            androidx.fragment.app.u r3 = r3.a
            boolean r3 = r3.p(r4)
            if (r3 == 0) goto L18
            return r1
        L2d:
            return r0
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.m0
            if (r0 == 0) goto L5
            goto L23
        L5:
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.i0
            java.util.Iterator r2 = r2.iterator()
            r2.getClass()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            b31 r0 = (defpackage.b31) r0
            h94 r1 = new h94
            r1.<init>(r3)
            r0.accept(r1)
            goto Le
        L23:
            return
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            r3.getClass()
            r0 = 1
            r1.m0 = r0
            r0 = 0
            super.onMultiWindowModeChanged(r2, r3)     // Catch: java.lang.Throwable -> L2b
            r1.m0 = r0
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.i0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            b31 r3 = (defpackage.b31) r3
            h94 r0 = new h94
            r0.<init>(r2)
            r3.accept(r0)
            goto L15
        L2a:
            return
        L2b:
            r2 = move-exception
            r1.m0 = r0
            throw r2
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent r2) {
            r1 = this;
            r2.getClass()
            super.onNewIntent(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.h0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            b31 r0 = (defpackage.b31) r0
            r0.accept(r2)
            goto Lf
        L1f:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, android.view.Menu r4) {
            r2 = this;
            r4.getClass()
            m44 r0 = r2.L
            java.lang.Object r0 = r0.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            fl2 r1 = (defpackage.fl2) r1
            androidx.fragment.app.u r1 = r1.a
            r1.q(r4)
            goto Ld
        L1f:
            super.onPanelClosed(r3, r4)
            return
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.n0
            if (r0 == 0) goto L5
            goto L23
        L5:
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.j0
            java.util.Iterator r2 = r2.iterator()
            r2.getClass()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            b31 r0 = (defpackage.b31) r0
            yw4 r1 = new yw4
            r1.<init>(r3)
            r0.accept(r1)
            goto Le
        L23:
            return
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            r3.getClass()
            r0 = 1
            r1.n0 = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r2, r3)     // Catch: java.lang.Throwable -> L2b
            r1.n0 = r0
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.j0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            b31 r3 = (defpackage.b31) r3
            yw4 r0 = new yw4
            r0.<init>(r2)
            r3.accept(r0)
            goto L15
        L2a:
            return
        L2b:
            r2 = move-exception
            r1.n0 = r0
            throw r2
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState r4) {
            r3 = this;
            r4.getClass()
            super.onPictureInPictureUiStateChanged(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 18
            if (r0 < r1) goto L1a
            x31 r0 = new x31
            r4.isStashed()
            defpackage.xp.j(r4)
            r0.<init>(r2)
            goto L2c
        L1a:
            r1 = 31
            if (r0 < r1) goto L27
            x31 r0 = new x31
            r4.isStashed()
            r0.<init>(r2)
            goto L2c
        L27:
            x31 r0 = new x31
            r0.<init>(r2)
        L2c:
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.k0
            java.util.Iterator r3 = r3.iterator()
            r3.getClass()
        L35:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()
            b31 r4 = (defpackage.b31) r4
            r4.accept(r0)
            goto L35
        L45:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            r3.getClass()
            if (r1 != 0) goto L24
            super.onPreparePanel(r1, r2, r3)
            m44 r0 = r0.L
            java.lang.Object r0 = r0.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            fl2 r1 = (defpackage.fl2) r1
            androidx.fragment.app.u r1 = r1.a
            r1.t(r3)
            goto L12
        L24:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            r5.getClass()
            r6.getClass()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r0 = r0.putExtra(r1, r5)
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r0 = r0.putExtra(r1, r6)
            kv0 r1 = r3.e0
            r2 = -1
            boolean r0 = r1.a(r4, r2, r0)
            if (r0 != 0) goto L23
            super.onRequestPermissionsResult(r4, r5, r6)
        L23:
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r1 = this;
            ap7 r0 = r1.X
            if (r0 != 0) goto Le
            java.lang.Object r1 = r1.getLastNonConfigurationInstance()
            iv0 r1 = (defpackage.iv0) r1
            if (r1 == 0) goto Le
            ap7 r0 = r1.a
        Le:
            if (r0 != 0) goto L12
            r1 = 0
            return r1
        L12:
            iv0 r1 = new iv0
            r1.<init>()
            r1.a = r0
            return r1
    }

    @Override // defpackage.lv0, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            r3.getClass()
            ku3 r0 = r2.A
            if (r0 == 0) goto Lc
            tt3 r1 = defpackage.tt3.CREATED
            r0.h(r1)
        Lc:
            super.onSaveInstanceState(r3)
            e56 r2 = r2.R
            r2.c(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
            r2 = this;
            super.onTrimMemory(r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.g0
            java.util.Iterator r2 = r2.iterator()
            r2.getClass()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            b31 r0 = (defpackage.b31) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.accept(r1)
            goto Lc
        L20:
            return
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
            r1 = this;
            super.onUserLeaveHint()
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.l0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto Lc
        L1c:
            return
    }

    public final void q(defpackage.ml4 r2) {
            r1 = this;
            f41 r1 = r1.B
            r1.getClass()
            mv0 r0 = r1.b
            if (r0 == 0) goto Lc
            r2.a(r0)
        Lc:
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.a
            r1.add(r2)
            return
    }

    public final void r() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428078(0x7f0b02ee, float:1.847779E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131427838(0x7f0b01fe, float:1.8477304E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428077(0x7f0b02ed, float:1.8477788E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
            r5 = this;
            boolean r0 = defpackage.ln2.H()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto Lf
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            java.lang.String r0 = defpackage.ln2.f0(r0)     // Catch: java.lang.Throwable -> L43
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L43
        Lf:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L43
            ex6 r5 = r5.Z     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L43
            nn2 r5 = (defpackage.nn2) r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r5.b     // Catch: java.lang.Throwable -> L43
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r5.c = r1     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r1 = r5.d     // Catch: java.lang.Throwable -> L35
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L35
            r3 = 0
        L27:
            if (r3 >= r2) goto L37
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L35
            int r3 = r3 + 1
            on2 r4 = (defpackage.on2) r4     // Catch: java.lang.Throwable -> L35
            r4.c()     // Catch: java.lang.Throwable -> L35
            goto L27
        L35:
            r5 = move-exception
            goto L41
        L37:
            java.util.ArrayList r5 = r5.d     // Catch: java.lang.Throwable -> L35
            r5.clear()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            android.os.Trace.endSection()
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L43
        L43:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    public final defpackage.d9 s(defpackage.b9 r4, defpackage.a9 r5) {
            r3 = this;
            kv0 r0 = r3.e0
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "activity_rq#"
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r3.d0
            int r2 = r2.getAndIncrement()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            i9 r3 = r0.d(r1, r3, r4, r5)
            return r3
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
            r2 = this;
            r2.r()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            jv0 r1 = r2.Y
            r1.a(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3) {
            r2 = this;
            r2.r()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            jv0 r1 = r2.Y
            r1.a(r0)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.r()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            jv0 r1 = r2.Y
            r1.a(r0)
            super.setContentView(r3, r4)
            return
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            r1.getClass()
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1.getClass()
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) {
            r0 = this;
            r1.getClass()
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) {
            r0 = this;
            r1.getClass()
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
