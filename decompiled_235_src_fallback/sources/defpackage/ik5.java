package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik5  reason: default package */
/* loaded from: classes.dex */
public class ik5 extends android.app.Fragment {
    public static final /* synthetic */ int B = 0;
    public defpackage.s63 A;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ik5$a */
    /* loaded from: classes.dex */
    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public static final defpackage.hk5 Companion = null;

        static {
                hk5 r0 = new hk5
                r0.<init>()
                defpackage.ik5.a.Companion = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                hk5 r0 = defpackage.ik5.a.Companion
                r0.getClass()
                r1.getClass()
                ik5$a r0 = new ik5$a
                r0.<init>()
                defpackage.r74.q(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_CREATE
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_RESUME
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_START
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_DESTROY
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_PAUSE
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = defpackage.ik5.B
                st3 r0 = defpackage.st3.ON_STOP
                defpackage.gk5.a(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }
    }

    public ik5() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(defpackage.st3 r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L10
            android.app.Activity r2 = r2.getActivity()
            r2.getClass()
            defpackage.gk5.a(r2, r3)
        L10:
            return
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            st3 r1 = defpackage.st3.ON_CREATE
            r0.a(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            st3 r0 = defpackage.st3.ON_DESTROY
            r1.a(r0)
            r0 = 0
            r1.A = r0
            return
    }

    @Override // android.app.Fragment
    public final void onPause() {
            r1 = this;
            super.onPause()
            st3 r0 = defpackage.st3.ON_PAUSE
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            s63 r0 = r1.A
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.B
            h35 r0 = (defpackage.h35) r0
            r0.a()
        Le:
            st3 r0 = defpackage.st3.ON_RESUME
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r3 = this;
            super.onStart()
            s63 r0 = r3.A
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.B
            h35 r0 = (defpackage.h35) r0
            int r1 = r0.A
            r2 = 1
            int r1 = r1 + r2
            r0.A = r1
            if (r1 != r2) goto L21
            boolean r1 = r0.R
            if (r1 == 0) goto L21
            ku3 r1 = r0.Y
            st3 r2 = defpackage.st3.ON_START
            r1.f(r2)
            r1 = 0
            r0.R = r1
        L21:
            st3 r0 = defpackage.st3.ON_START
            r3.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            st3 r0 = defpackage.st3.ON_STOP
            r1.a(r0)
            return
    }
}
