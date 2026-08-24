package androidx.window.layout.adapter.sidecar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
    public final java.lang.Object a;
    public androidx.window.sidecar.SidecarDeviceState b;
    public final java.util.WeakHashMap c;
    public final defpackage.uh6 d;
    public final androidx.window.sidecar.SidecarInterface.SidecarCallback e;

    public DistinctElementSidecarCallback(defpackage.uh6 r2, androidx.window.sidecar.SidecarInterface.SidecarCallback r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.c = r0
            r1.d = r2
            r1.e = r3
            return
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            uh6 r1 = r3.d     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.b     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = defpackage.nb3.k(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = defpackage.th6.b(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = defpackage.th6.b(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L2e
        L25:
            r3.b = r4     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.e
            r3.onDeviceStateChanged(r4)
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public void onWindowLayoutChanged(android.os.IBinder r4, androidx.window.sidecar.SidecarWindowLayoutInfo r5) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r3.c     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L30
            androidx.window.sidecar.SidecarWindowLayoutInfo r1 = (androidx.window.sidecar.SidecarWindowLayoutInfo) r1     // Catch: java.lang.Throwable -> L30
            uh6 r2 = r3.d     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            boolean r2 = defpackage.nb3.k(r1, r5)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L18
            r1 = 1
            goto L2c
        L18:
            r2 = 0
            if (r1 != 0) goto L1d
        L1b:
            r1 = r2
            goto L2c
        L1d:
            if (r5 != 0) goto L20
            goto L1b
        L20:
            java.util.List r1 = defpackage.th6.c(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r2 = defpackage.th6.c(r5)     // Catch: java.lang.Throwable -> L30
            boolean r1 = defpackage.uh6.b(r1, r2)     // Catch: java.lang.Throwable -> L30
        L2c:
            if (r1 == 0) goto L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r3 = move-exception
            goto L3e
        L32:
            java.util.WeakHashMap r1 = r3.c     // Catch: java.lang.Throwable -> L30
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.e
            r3.onWindowLayoutChanged(r4, r5)
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r3
    }
}
