package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s57  reason: default package */
/* loaded from: classes.dex */
public abstract class s57 {
    public static final long a = 0;

    static {
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> Ld
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> Ld
            long r0 = r0.getId()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r0 = -1
        Lf:
            defpackage.s57.a = r0
            return
    }
}
