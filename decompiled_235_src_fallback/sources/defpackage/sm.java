package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
public final class sm extends defpackage.n61 {
    public static final defpackage.ex6 i0 = null;
    public static final defpackage.qm j0 = null;
    public final android.view.Choreographer L;
    public final android.os.Handler R;
    public final java.lang.Object X;
    public final defpackage.pu Y;
    public java.util.ArrayList Z;
    public java.util.ArrayList d0;
    public boolean e0;
    public boolean f0;
    public final defpackage.rm g0;
    public final defpackage.um h0;

    static {
            jf r0 = defpackage.jf.h0
            ex6 r1 = new ex6
            r1.<init>(r0)
            defpackage.sm.i0 = r1
            qm r0 = new qm
            r1 = 0
            r0.<init>(r1)
            defpackage.sm.j0 = r0
            return
    }

    public sm(android.view.Choreographer r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.R = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.X = r2
            pu r2 = new pu
            r2.<init>()
            r0.Y = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.Z = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.d0 = r2
            rm r2 = new rm
            r2.<init>(r0)
            r0.g0 = r2
            um r2 = new um
            r2.<init>(r1, r0)
            r0.h0 = r2
            return
    }

    public static final void n0(defpackage.sm r4) {
        L0:
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            pu r1 = r4.Y     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            if (r2 == 0) goto Le
            r1 = r3
            goto L12
        Le:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L4a
        L12:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
        L15:
            if (r1 == 0) goto L32
            r1.run()
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            pu r1 = r4.Y     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L27
            r1 = r3
            goto L2b
        L27:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L2f
        L2b:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            goto L15
        L2f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L32:
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            pu r1 = r4.Y     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            r1 = 0
            r4.e0 = r1     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r4 = move-exception
            goto L48
        L43:
            r1 = 1
        L44:
            monitor-exit(r0)
            if (r1 != 0) goto L0
            return
        L48:
            monitor-exit(r0)
            throw r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r3, java.lang.Runnable r4) {
            r2 = this;
            java.lang.Object r3 = r2.X
            monitor-enter(r3)
            pu r0 = r2.Y     // Catch: java.lang.Throwable -> L24
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L24
            boolean r4 = r2.e0     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L26
            r4 = 1
            r2.e0 = r4     // Catch: java.lang.Throwable -> L24
            android.os.Handler r0 = r2.R     // Catch: java.lang.Throwable -> L24
            rm r1 = r2.g0     // Catch: java.lang.Throwable -> L24
            r0.post(r1)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r2.f0     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            r2.f0 = r4     // Catch: java.lang.Throwable -> L24
            android.view.Choreographer r4 = r2.L     // Catch: java.lang.Throwable -> L24
            rm r2 = r2.g0     // Catch: java.lang.Throwable -> L24
            r4.postFrameCallback(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L28
        L26:
            monitor-exit(r3)
            return
        L28:
            monitor-exit(r3)
            throw r2
    }
}
