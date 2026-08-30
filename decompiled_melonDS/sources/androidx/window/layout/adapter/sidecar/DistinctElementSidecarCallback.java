package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import m8.f;
import m8.g;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f1706b;

    /* renamed from: d  reason: collision with root package name */
    public final g f1708d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1709e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1705a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f1707c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1708d = gVar;
        this.f1709e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (m8.f.b(r2) == m8.f.b(r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.f1705a
            monitor-enter(r0)
            m8.g r1 = r3.f1708d     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f1706b     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = nc.k.a(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = m8.f.b(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = m8.f.b(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            goto L2e
        L25:
            r3.f1706b = r4     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r0 = r3.f1709e
            r0.onDeviceStateChanged(r4)
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b10;
        synchronized (this.f1705a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1707c.get(iBinder);
                this.f1708d.getClass();
                if (k.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b10 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b10 = g.b(f.c(sidecarWindowLayoutInfo2), f.c(sidecarWindowLayoutInfo));
                    }
                    b10 = false;
                }
                if (b10) {
                    return;
                }
                this.f1707c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1709e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
