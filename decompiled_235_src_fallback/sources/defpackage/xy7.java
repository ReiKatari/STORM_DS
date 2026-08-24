package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy7  reason: default package */
/* loaded from: classes.dex */
public abstract class xy7 {
    public static final java.util.logging.Logger a = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.xy7.a = r0
            return
    }

    public static final boolean a(java.lang.AssertionError r2) {
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L14
            java.lang.String r0 = "getsockname failed"
            boolean r2 = defpackage.qs6.j0(r2, r0, r1)
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L19
            r2 = 1
            return r2
        L19:
            return r1
    }
}
