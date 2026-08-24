package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy6  reason: default package */
/* loaded from: classes.dex */
public final class wy6 implements defpackage.fk2 {
    public final java.util.ArrayDeque A;
    public defpackage.eb B;
    public final java.util.ArrayList L;
    public boolean R;

    public wy6(defpackage.x31 r1) {
            r0 = this;
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.A = r1
            r1 = 0
            r0.R = r1
            defpackage.nj2.h()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.L = r1
            return
    }

    public final void a() {
            r4 = this;
            defpackage.nj2.h()
            f23 r0 = new f23
            java.lang.String r1 = "Camera is closed."
            r2 = 3
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.ArrayDeque r0 = r4.A
            java.util.Iterator r1 = r0.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L32
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r4 = r4.L
            r0.<init>(r4)
            int r4 = r0.size()
            if (r4 > 0) goto L29
            return
        L29:
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            defpackage.xg6.A(r4)
            throw r3
        L32:
            java.lang.ClassCastException r4 = defpackage.i61.j(r1)
            throw r4
    }

    public final void b() {
            r4 = this;
            defpackage.nj2.h()
            java.lang.String r0 = "TakePictureManagerImpl"
            java.lang.String r1 = "Issue the next TakePictureRequest."
            android.util.Log.d(r0, r1)
            boolean r1 = r4.R
            if (r1 == 0) goto L14
            java.lang.String r4 = "The class is paused."
            android.util.Log.d(r0, r4)
            return
        L14:
            eb r1 = r4.B
            r1.getClass()
            defpackage.nj2.h()
            java.lang.Object r1 = r1.L
            bt r1 = (defpackage.bt) r1
            r1.getClass()
            defpackage.nj2.h()
            java.lang.Object r2 = r1.B
            re5 r2 = (defpackage.re5) r2
            if (r2 == 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.String r3 = "The ImageReader is not initialized."
            defpackage.np2.A(r3, r2)
            java.lang.Object r1 = r1.B
            re5 r1 = (defpackage.re5) r1
            java.lang.Object r2 = r1.R
            monitor-enter(r2)
            java.lang.Object r3 = r1.X     // Catch: java.lang.Throwable -> L61
            v23 r3 = (defpackage.v23) r3     // Catch: java.lang.Throwable -> L61
            int r3 = r3.f()     // Catch: java.lang.Throwable -> L61
            int r1 = r1.L     // Catch: java.lang.Throwable -> L61
            int r3 = r3 - r1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L4f
            java.lang.String r4 = "Too many acquire images. Close image to be able to process next."
            android.util.Log.d(r0, r4)
            return
        L4f:
            java.util.ArrayDeque r4 = r4.A
            java.lang.Object r4 = r4.poll()
            if (r4 != 0) goto L5d
            java.lang.String r4 = "No new request."
            android.util.Log.d(r0, r4)
            return
        L5d:
            defpackage.u34.a()
            return
        L61:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            throw r4
    }

    @Override // defpackage.fk2
    public final void c(defpackage.gk2 r3) {
            r2 = this;
            ov2 r3 = defpackage.u24.x()
            rk3 r0 = new rk3
            r1 = 15
            r0.<init>(r2, r1)
            r3.execute(r0)
            return
    }
}
