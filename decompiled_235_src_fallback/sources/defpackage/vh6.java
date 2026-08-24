package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh6  reason: default package */
/* loaded from: classes.dex */
public abstract class vh6 {
    public static androidx.window.sidecar.SidecarInterface a(android.content.Context r0) {
            r0.getClass()
            android.content.Context r0 = r0.getApplicationContext()
            androidx.window.sidecar.SidecarInterface r0 = androidx.window.sidecar.SidecarProvider.getSidecarImpl(r0)
            return r0
    }

    public static defpackage.cm7 b() {
            java.lang.String r0 = androidx.window.sidecar.SidecarProvider.getApiVersion()     // Catch: java.lang.Throwable -> L11
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L11
            cm7 r1 = defpackage.cm7.Y     // Catch: java.lang.Throwable -> L11
            cm7 r0 = defpackage.jx2.D(r0)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }
}
