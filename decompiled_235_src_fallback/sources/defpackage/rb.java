package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb  reason: default package */
/* loaded from: classes.dex */
public final class rb {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public rb(android.hardware.camera2.CameraManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            android.hardware.camera2.CameraDevice$CameraDeviceSetup r2 = defpackage.xp.b(r2, r3)
            r1.b = r2
            return
    }

    public rb(java.util.ArrayList r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public final defpackage.ga0 a(android.hardware.camera2.params.SessionConfiguration r7) {
            r6 = this;
            int r0 = r6.a
            r1 = 5
            java.lang.Object r6 = r6.b
            switch(r0) {
                case 0: goto L24;
                default: goto L8;
            }
        L8:
            ga0 r0 = new ga0
            android.hardware.camera2.CameraDevice$CameraDeviceSetup r6 = (android.hardware.camera2.CameraDevice.CameraDeviceSetup) r6
            boolean r6 = defpackage.xp.m(r6, r7)
            if (r6 == 0) goto L14
            r6 = 1
            goto L15
        L14:
            r6 = 2
        L15:
            java.lang.String r7 = "ro.build.date.utc"
            java.lang.String r7 = java.lang.System.getProperty(r7)
            if (r7 == 0) goto L20
            java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L20
        L20:
            r0.<init>(r6, r1)
            return r0
        L24:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r2 = 0
            r3 = r2
        L2c:
            if (r3 >= r0) goto L3f
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            rb r4 = (defpackage.rb) r4
            ga0 r4 = r4.a(r7)
            int r5 = r4.b
            if (r5 == 0) goto L2c
            goto L44
        L3f:
            ga0 r4 = new ga0
            r4.<init>(r2, r1)
        L44:
            return r4
    }
}
