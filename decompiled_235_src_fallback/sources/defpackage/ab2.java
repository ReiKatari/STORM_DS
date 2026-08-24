package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab2  reason: default package */
/* loaded from: classes.dex */
public final class ab2 {
    public final java.lang.String a;
    public final java.util.HashMap b;

    public ab2(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    public final java.io.File a(android.net.Uri r6) {
            r5 = this;
            java.lang.String r0 = r6.getEncodedPath()
            r1 = 47
            r2 = 1
            int r1 = r0.indexOf(r1, r2)
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L68
            java.lang.String r3 = r0.substring(r2, r1)
            java.lang.String r3 = android.net.Uri.decode(r3)
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = android.net.Uri.decode(r0)
            java.util.HashMap r5 = r5.b
            java.lang.Object r5 = r5.get(r3)
            java.io.File r5 = (java.io.File) r5
            if (r5 == 0) goto L5e
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r0)
            java.io.File r6 = r6.getCanonicalFile()     // Catch: java.io.IOException -> L58
            java.lang.String r0 = r6.getPath()
            java.lang.String r5 = r5.getPath()
            java.lang.String r0 = androidx.core.content.FileProvider.a(r0)
            java.lang.String r5 = androidx.core.content.FileProvider.a(r5)
            java.lang.String r1 = "/"
            java.lang.String r5 = r5.concat(r1)
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L50
            return r6
        L50:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            java.lang.String r6 = "Resolved path jumped beyond configured root"
            r5.<init>(r6)
            throw r5
        L58:
            java.lang.String r5 = "Failed to resolve canonical path for "
            defpackage.e41.w(r6, r5)
            return r4
        L5e:
            java.lang.String r5 = "Unable to find configured root for "
            java.lang.String r5 = defpackage.xg6.n(r6, r5)
            defpackage.i.h(r5)
            return r4
        L68:
            java.lang.String r5 = "Unable to find path from root: "
            java.lang.String r5 = defpackage.xg6.n(r6, r5)
            defpackage.i.h(r5)
            return r4
    }
}
