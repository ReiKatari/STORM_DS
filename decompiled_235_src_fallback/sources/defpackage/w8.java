package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w8  reason: default package */
/* loaded from: classes.dex */
public final class w8 implements android.app.Application.ActivityLifecycleCallbacks {
    public java.lang.Object A;
    public android.app.Activity B;
    public final int L;
    public boolean R;
    public boolean X;
    public boolean Y;

    public w8(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.R = r0
            r1.X = r0
            r1.Y = r0
            r1.B = r2
            int r2 = r2.hashCode()
            r1.L = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.B
            if (r0 != r2) goto La
            r2 = 0
            r1.B = r2
            r2 = 1
            r1.X = r2
        La:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r5) {
            r4 = this;
            boolean r0 = r4.X
            if (r0 == 0) goto L3f
            boolean r0 = r4.Y
            if (r0 != 0) goto L3f
            boolean r0 = r4.R
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r4.A
            java.lang.reflect.Field r1 = defpackage.x8.c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L37
            if (r1 != r0) goto L3f
            int r0 = r5.hashCode()     // Catch: java.lang.Throwable -> L37
            int r2 = r4.L
            if (r0 == r2) goto L1f
            goto L3f
        L1f:
            java.lang.reflect.Field r0 = defpackage.x8.b     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L37
            android.os.Handler r0 = defpackage.x8.g     // Catch: java.lang.Throwable -> L37
            uo2 r2 = new uo2     // Catch: java.lang.Throwable -> L37
            r3 = 4
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L37
            r0.postAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L37
            r5 = 1
            r4.Y = r5
            r5 = 0
            r4.A = r5
            return
        L37:
            r4 = move-exception
            java.lang.String r5 = "ActivityRecreator"
            java.lang.String r0 = "Exception while fetching field values"
            android.util.Log.e(r5, r0, r4)
        L3f:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.B
            if (r0 != r2) goto L7
            r2 = 1
            r1.R = r2
        L7:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
