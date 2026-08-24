package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg0  reason: default package */
/* loaded from: classes.dex */
public final class jg0 extends android.hardware.camera2.CameraDevice.StateCallback {
    public defpackage.xw a;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(android.hardware.camera2.CameraDevice r2) {
            r1 = this;
            r2.getClass()
            xw r1 = r1.a
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
            r0.onClosed(r2)
            goto Ld
        L1d:
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(android.hardware.camera2.CameraDevice r2) {
            r1 = this;
            r2.getClass()
            xw r1 = r1.a
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
            r0.onDisconnected(r2)
            goto Ld
        L1d:
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(android.hardware.camera2.CameraDevice r2, int r3) {
            r1 = this;
            r2.getClass()
            xw r1 = r1.a
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
            r0.onError(r2, r3)
            goto Ld
        L1d:
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(android.hardware.camera2.CameraDevice r2) {
            r1 = this;
            r2.getClass()
            xw r1 = r1.a
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
            r0.onOpened(r2)
            goto Ld
        L1d:
            return
    }
}
