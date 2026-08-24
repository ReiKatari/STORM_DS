package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv  reason: default package */
/* loaded from: classes.dex */
public final class rv extends defpackage.xk5 {
    public final android.content.Context a;
    public final java.lang.Object b;
    public android.content.res.AssetManager c;

    public rv(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    @Override // defpackage.xk5
    public final boolean a(defpackage.m44 r2) {
            r1 = this;
            java.lang.Object r1 = r2.B
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r2 = "file"
            java.lang.String r0 = r1.getScheme()
            boolean r2 = r2.equals(r0)
            r0 = 0
            if (r2 == 0) goto L2d
            java.util.List r2 = r1.getPathSegments()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2d
            java.util.List r1 = r1.getPathSegments()
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r2 = "android_asset"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2d
            r1 = 1
            return r1
        L2d:
            return r0
    }

    @Override // defpackage.xk5
    public final defpackage.aj c(defpackage.m44 r2, int r3) {
            r1 = this;
            android.content.res.AssetManager r3 = r1.c
            if (r3 != 0) goto L1a
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            android.content.res.AssetManager r0 = r1.c     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> L14
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L14
            r1.c = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r1
        L1a:
            android.content.res.AssetManager r1 = r1.c
            java.lang.Object r2 = r2.B
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.toString()
            r3 = 22
            java.lang.String r2 = r2.substring(r3)
            java.io.InputStream r1 = r1.open(r2)
            a83 r1 = defpackage.hi2.P(r1)
            aj r2 = new aj
            qw4 r3 = defpackage.qw4.DISK
            r2.<init>(r1, r3)
            return r2
    }
}
