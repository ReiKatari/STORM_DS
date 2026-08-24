package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc0  reason: default package */
/* loaded from: classes.dex */
public final class rc0 extends android.hardware.camera2.CameraManager.AvailabilityCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.r35 b;
    public final /* synthetic */ java.lang.Object c;

    public rc0(defpackage.ed0 r2, defpackage.r35 r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.c = r2
            r1.b = r3
            r1.<init>()
            return
    }

    public rc0(defpackage.r35 r2, defpackage.sc0 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.<init>()
            return
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onCameraAccessPrioritiesChanged()
            return
        L9:
            java.lang.String r0 = "Camera access priorities have changed"
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            r35 r2 = r2.b
            fi0 r0 = defpackage.fi0.a
            java.lang.Object r2 = defpackage.f04.W(r2, r0)
            boolean r2 = r2 instanceof defpackage.fm0
            if (r2 == 0) goto L21
            java.lang.String r2 = "Failed to emit CameraPrioritiesChanged"
            android.util.Log.w(r1, r2)
        L21:
            return
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(java.lang.String r3) {
            r2 = this;
            int r0 = r2.a
            r35 r1 = r2.b
            java.lang.Object r2 = r2.c
            r3.getClass()
            switch(r0) {
                case 0: goto L13;
                default: goto Lc;
            }
        Lc:
            ed0 r2 = (defpackage.ed0) r2
            r0 = 1
            defpackage.ed0.a(r2, r1, r3, r0)
            return
        L13:
            sc0 r2 = (defpackage.sc0) r2
            java.lang.String r2 = r2.B
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1e
            goto L5c
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Camera "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r0 = " has become available"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.d(r0, r2)
            ei0 r2 = new ei0
            defpackage.xf0.a(r3)
            r2.<init>(r3)
            java.lang.Object r2 = defpackage.f04.W(r1, r2)
            boolean r2 = r2 instanceof defpackage.fm0
            if (r2 == 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to emit CameraAvailable("
            r2.<init>(r1)
            r2.append(r3)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L5c:
            return
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(java.lang.String r3) {
            r2 = this;
            int r0 = r2.a
            r35 r1 = r2.b
            java.lang.Object r2 = r2.c
            r3.getClass()
            switch(r0) {
                case 0: goto L13;
                default: goto Lc;
            }
        Lc:
            ed0 r2 = (defpackage.ed0) r2
            r0 = 0
            defpackage.ed0.a(r2, r1, r3, r0)
            return
        L13:
            sc0 r2 = (defpackage.sc0) r2
            java.lang.String r2 = r2.B
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1e
            goto L5c
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Camera "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r0 = " has become unavailable"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.d(r0, r2)
            gi0 r2 = new gi0
            defpackage.xf0.a(r3)
            r2.<init>(r3)
            java.lang.Object r2 = defpackage.f04.W(r1, r2)
            boolean r2 = r2 instanceof defpackage.fm0
            if (r2 == 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to emit CameraUnavailable("
            r2.<init>(r1)
            r2.append(r3)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L5c:
            return
    }
}
