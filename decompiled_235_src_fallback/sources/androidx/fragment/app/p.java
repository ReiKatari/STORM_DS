package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class p extends defpackage.mv0 {
    public final defpackage.d51 r0;
    public final defpackage.ku3 s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    public p() {
            r4 = this;
            r4.<init>()
            vk2 r0 = new vk2
            r1 = r4
            jq r1 = (defpackage.jq) r1
            r0.<init>(r1)
            d51 r2 = new d51
            r3 = 20
            r2.<init>(r0, r3)
            r4.r0 = r2
            ku3 r0 = new ku3
            r2 = 1
            r0.<init>(r4, r2)
            r4.s0 = r0
            r4.v0 = r2
            e56 r0 = r4.R
            d56 r0 = r0.b
            gv0 r2 = new gv0
            r3 = 2
            r2.<init>(r1, r3)
            java.lang.String r3 = "android:support:lifecycle"
            r0.c(r3, r2)
            uk2 r0 = new uk2
            r2 = 0
            r0.<init>(r1, r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r4.f0
            r2.add(r0)
            uk2 r0 = new uk2
            r2 = 1
            r0.<init>(r1, r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r4.h0
            r2.add(r0)
            hv0 r0 = new hv0
            r2 = 1
            r0.<init>(r1, r2)
            r4.q(r0)
            return
    }

    public static boolean u(androidx.fragment.app.u r5, defpackage.tt3 r6) {
            androidx.fragment.app.y r5 = r5.c
            java.util.List r5 = r5.f()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.o r1 = (androidx.fragment.app.o) r1
            if (r1 != 0) goto L1a
            goto Lb
        L1a:
            java.lang.Object r2 = r1.getHost()
            if (r2 == 0) goto L29
            androidx.fragment.app.u r2 = r1.getChildFragmentManager()
            boolean r2 = u(r2, r6)
            r0 = r0 | r2
        L29:
            androidx.fragment.app.z r2 = r1.mViewLifecycleOwner
            r3 = 1
            if (r2 == 0) goto L46
            ut3 r2 = r2.getLifecycle()
            tt3 r2 = r2.b()
            tt3 r4 = defpackage.tt3.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto L46
            androidx.fragment.app.z r0 = r1.mViewLifecycleOwner
            ku3 r0 = r0.X
            r0.h(r6)
            r0 = r3
        L46:
            ku3 r2 = r1.mLifecycleRegistry
            tt3 r2 = r2.d
            tt3 r4 = defpackage.tt3.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto Lb
            ku3 r0 = r1.mLifecycleRegistry
            r0.h(r6)
            r0 = r3
            goto Lb
        L59:
            return r0
    }

    @Override // android.app.Activity
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            super.dump(r7, r8, r9, r10)
            r0 = 0
            if (r10 == 0) goto L5d
            int r1 = r10.length
            if (r1 != 0) goto La
            goto L5d
        La:
            r1 = r10[r0]
            int r2 = r1.hashCode()
            switch(r2) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r2 = "--autofill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d
            goto L5d
        L1d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L5d
            goto L5c
        L24:
            java.lang.String r2 = "--contentcapture"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2d
            goto L5d
        L2d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L5d
            goto L5c
        L34:
            java.lang.String r2 = "--list-dumpables"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r2 = "--dump-dumpable"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L5d
        L46:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L5d
            goto L5c
        L4d:
            java.lang.String r2 = "--translation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L5d
        L56:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L5d
        L5c:
            return
        L5d:
            r9.print(r7)
            java.lang.String r1 = "Local FragmentActivity "
            r9.print(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r9.print(r1)
            java.lang.String r1 = " State:"
            r9.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "  "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.print(r1)
            java.lang.String r2 = "mCreated="
            r9.print(r2)
            boolean r2 = r6.t0
            r9.print(r2)
            java.lang.String r2 = " mResumed="
            r9.print(r2)
            boolean r2 = r6.u0
            r9.print(r2)
            java.lang.String r2 = " mStopped="
            r9.print(r2)
            boolean r2 = r6.v0
            r9.print(r2)
            android.app.Application r2 = r6.getApplication()
            if (r2 == 0) goto L115
            ap7 r2 = r6.getViewModelStore()
            r2.getClass()
            h71 r3 = defpackage.h71.b
            r3.getClass()
            eb r4 = new eb
            nl2 r5 = defpackage.tx3.c
            r4.<init>(r2, r5, r3)
            java.lang.Class<tx3> r2 = defpackage.tx3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r3 = r2.b()
            if (r3 == 0) goto L10f
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r5.concat(r3)
            qo7 r2 = r4.G(r2, r3)
            tx3 r2 = (defpackage.tx3) r2
            un6 r2 = r2.b
            int r3 = r2.f()
            if (r3 <= 0) goto L115
            r9.print(r1)
            java.lang.String r3 = "Loaders:"
            r9.println(r3)
            int r3 = r2.f()
            if (r3 > 0) goto Lef
            goto L115
        Lef:
            java.lang.Object r6 = r2.g(r0)
            if (r6 == 0) goto Lf9
            defpackage.u34.a()
            return
        Lf9:
            r9.print(r1)
            java.lang.String r6 = "  #"
            r9.print(r6)
            int r6 = r2.d(r0)
            r9.print(r6)
            java.lang.String r6 = ": "
            r9.print(r6)
            r6 = 0
            throw r6
        L10f:
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r6)
            return
        L115:
            d51 r6 = r6.r0
            java.lang.Object r6 = r6.B
            vk2 r6 = (defpackage.vk2) r6
            ll2 r6 = r6.R
            r6.v(r7, r8, r9, r10)
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            d51 r0 = r1.r0
            r0.l()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @Override // defpackage.mv0, defpackage.lv0, android.app.Activity
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            ku3 r2 = r1.s0
            st3 r0 = defpackage.st3.ON_CREATE
            r2.f(r0)
            d51 r1 = r1.r0
            java.lang.Object r1 = r1.B
            vk2 r1 = (defpackage.vk2) r1
            ll2 r1 = r1.R
            r2 = 0
            r1.H = r2
            r1.I = r2
            androidx.fragment.app.v r0 = r1.O
            r0.g = r2
            r2 = 1
            r1.u(r2)
            return
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            d51 r0 = r1.r0
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            androidx.fragment.app.r r0 = r0.f
            android.view.View r0 = r0.onCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto L15
            android.view.View r1 = super.onCreateView(r2, r3, r4, r5)
            return r1
        L15:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            d51 r0 = r2.r0
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            androidx.fragment.app.r r0 = r0.f
            r1 = 0
            android.view.View r0 = r0.onCreateView(r1, r3, r4, r5)
            if (r0 != 0) goto L16
            android.view.View r2 = super.onCreateView(r3, r4, r5)
            return r2
        L16:
            return r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            d51 r0 = r1.r0
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            r0.l()
            ku3 r1 = r1.s0
            st3 r0 = defpackage.st3.ON_DESTROY
            r1.f(r0)
            return
    }

    @Override // defpackage.mv0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r0 = 6
            if (r2 != r0) goto L18
            d51 r1 = r1.r0
            java.lang.Object r1 = r1.B
            vk2 r1 = (defpackage.vk2) r1
            ll2 r1 = r1.R
            boolean r1 = r1.j(r3)
            return r1
        L18:
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.u0 = r0
            d51 r0 = r2.r0
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            r1 = 5
            r0.u(r1)
            ku3 r2 = r2.s0
            st3 r0 = defpackage.st3.ON_PAUSE
            r2.f(r0)
            return
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r2 = this;
            super.onPostResume()
            ku3 r0 = r2.s0
            st3 r1 = defpackage.st3.ON_RESUME
            r0.f(r1)
            d51 r2 = r2.r0
            java.lang.Object r2 = r2.B
            vk2 r2 = (defpackage.vk2) r2
            ll2 r2 = r2.R
            r0 = 0
            r2.H = r0
            r2.I = r0
            androidx.fragment.app.v r1 = r2.O
            r1.g = r0
            r0 = 7
            r2.u(r0)
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            d51 r0 = r1.r0
            r0.l()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r2 = this;
            d51 r0 = r2.r0
            r0.l()
            super.onResume()
            r1 = 1
            r2.u0 = r1
            java.lang.Object r2 = r0.B
            vk2 r2 = (defpackage.vk2) r2
            ll2 r2 = r2.R
            r2.z(r1)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r5 = this;
            d51 r0 = r5.r0
            r0.l()
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            super.onStart()
            r1 = 0
            r5.v0 = r1
            boolean r2 = r5.t0
            r3 = 1
            if (r2 != 0) goto L24
            r5.t0 = r3
            ll2 r2 = r0.R
            r2.H = r1
            r2.I = r1
            androidx.fragment.app.v r4 = r2.O
            r4.g = r1
            r4 = 4
            r2.u(r4)
        L24:
            ll2 r2 = r0.R
            r2.z(r3)
            ku3 r5 = r5.s0
            st3 r2 = defpackage.st3.ON_START
            r5.f(r2)
            ll2 r5 = r0.R
            r5.H = r1
            r5.I = r1
            androidx.fragment.app.v r0 = r5.O
            r0.g = r1
            r0 = 5
            r5.u(r0)
            return
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
            r0 = this;
            d51 r0 = r0.r0
            r0.l()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r3 = this;
            super.onStop()
            r0 = 1
            r3.v0 = r0
        L6:
            ll2 r1 = r3.t()
            tt3 r2 = defpackage.tt3.CREATED
            boolean r1 = u(r1, r2)
            if (r1 != 0) goto L6
            d51 r1 = r3.r0
            java.lang.Object r1 = r1.B
            vk2 r1 = (defpackage.vk2) r1
            ll2 r1 = r1.R
            r1.I = r0
            androidx.fragment.app.v r2 = r1.O
            r2.g = r0
            r0 = 4
            r1.u(r0)
            ku3 r3 = r3.s0
            st3 r0 = defpackage.st3.ON_STOP
            r3.f(r0)
            return
    }

    public final defpackage.ll2 t() {
            r0 = this;
            d51 r0 = r0.r0
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            return r0
    }
}
