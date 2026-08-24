package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g35  reason: default package */
/* loaded from: classes.dex */
public final class g35 extends defpackage.st1 {
    final /* synthetic */ defpackage.h35 this$0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: g35$a */
    /* loaded from: classes.dex */
    public static final class a extends defpackage.st1 {
        final /* synthetic */ defpackage.h35 this$0;

        public a(defpackage.h35 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                h35 r0 = r0.this$0
                r0.a()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                h35 r1 = r1.this$0
                int r2 = r1.A
                r0 = 1
                int r2 = r2 + r0
                r1.A = r2
                if (r2 != r0) goto L1b
                boolean r2 = r1.R
                if (r2 == 0) goto L1b
                ku3 r2 = r1.Y
                st3 r0 = defpackage.st3.ON_START
                r2.f(r0)
                r2 = 0
                r1.R = r2
            L1b:
                return
        }
    }

    public g35(defpackage.h35 r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            r2.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 >= r0) goto L20
            int r3 = defpackage.ik5.B
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r2.findFragmentByTag(r3)
            r2.getClass()
            ik5 r2 = (defpackage.ik5) r2
            h35 r1 = r1.this$0
            s63 r1 = r1.d0
            r2.A = r1
        L20:
            return
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            r3.getClass()
            h35 r2 = r2.this$0
            int r3 = r2.B
            int r3 = r3 + (-1)
            r2.B = r3
            if (r3 != 0) goto L19
            android.os.Handler r3 = r2.X
            r3.getClass()
            rk3 r2 = r2.Z
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L19:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            g35$a r2 = new g35$a
            h35 r0 = r0.this$0
            r2.<init>(r0)
            defpackage.rp.p(r1, r2)
            return
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            h35 r1 = r1.this$0
            int r2 = r1.A
            int r2 = r2 + (-1)
            r1.A = r2
            if (r2 != 0) goto L1b
            boolean r2 = r1.L
            if (r2 == 0) goto L1b
            ku3 r2 = r1.Y
            st3 r0 = defpackage.st3.ON_STOP
            r2.f(r0)
            r2 = 1
            r1.R = r2
        L1b:
            return
    }
}
