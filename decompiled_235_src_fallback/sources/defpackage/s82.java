package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s82  reason: default package */
/* loaded from: classes.dex */
public abstract class s82 {
    public static final java.lang.String a = null;

    static {
            java.lang.Class<s82> r0 = defpackage.s82.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r0 = r0.c()
            defpackage.s82.a = r0
            return
    }

    public static int a() {
            java.lang.String r0 = defpackage.s82.a
            androidx.window.extensions.WindowExtensions r1 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch: java.lang.NullPointerException -> Lb java.lang.UnsupportedOperationException -> L17 java.lang.NoClassDefFoundError -> L23
            int r0 = r1.getVendorApiLevel()     // Catch: java.lang.NullPointerException -> Lb java.lang.UnsupportedOperationException -> L17 java.lang.NoClassDefFoundError -> L23
            return r0
        Lb:
            vl7 r1 = defpackage.b90.a
            vl7 r2 = defpackage.vl7.LOG
            if (r1 != r2) goto L2e
            java.lang.String r1 = "Error with Extension implementation"
            android.util.Log.d(r0, r1)
            goto L2e
        L17:
            vl7 r1 = defpackage.b90.a
            vl7 r2 = defpackage.vl7.LOG
            if (r1 != r2) goto L2e
            java.lang.String r1 = "Stub Extension"
            android.util.Log.d(r0, r1)
            goto L2e
        L23:
            vl7 r1 = defpackage.b90.a
            vl7 r2 = defpackage.vl7.LOG
            if (r1 != r2) goto L2e
            java.lang.String r1 = "Embedding extension version not found"
            android.util.Log.d(r0, r1)
        L2e:
            r0 = 0
            return r0
    }
}
