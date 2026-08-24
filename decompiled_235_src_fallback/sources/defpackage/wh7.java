package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh7  reason: default package */
/* loaded from: classes.dex */
public final class wh7 {
    public final android.content.Context a;

    public wh7(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(android.net.Uri r1, defpackage.sv4 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            int r2 = r2.toFlags()
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L13
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L13
            r0.takePersistableUriPermission(r1, r2)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }
}
