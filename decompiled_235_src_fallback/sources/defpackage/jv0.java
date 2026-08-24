package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv0  reason: default package */
/* loaded from: classes.dex */
public final class jv0 implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {
    public final long A;
    public java.lang.Runnable B;
    public boolean L;
    public final /* synthetic */ defpackage.mv0 R;

    public jv0(defpackage.mv0 r5) {
            r4 = this;
            r4.<init>()
            r4.R = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            r4.A = r0
            return
    }

    public final void a(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Le
            r0 = 1
            r1.L = r0
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnDrawListener(r1)
        Le:
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            r3.getClass()
            r2.B = r3
            mv0 r3 = r2.R
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.getClass()
            boolean r0 = r2.L
            if (r0 == 0) goto L2c
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L28
            r3.invalidate()
            return
        L28:
            r3.postInvalidate()
            return
        L2c:
            n0 r0 = new n0
            r1 = 12
            r0.<init>(r2, r1)
            r3.postOnAnimation(r0)
            return
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
            r6 = this;
            java.lang.Runnable r0 = r6.B
            r1 = 0
            if (r0 == 0) goto L30
            r0.run()
            r0 = 0
            r6.B = r0
            mv0 r0 = r6.R
            ex6 r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            nn2 r0 = (defpackage.nn2) r0
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r0 == 0) goto L49
            r6.L = r1
            mv0 r0 = r6.R
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
            return
        L2d:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L30:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.A
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            r6.L = r1
            mv0 r0 = r6.R
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
        L49:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            mv0 r0 = r1.R
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnDrawListener(r1)
            return
    }
}
