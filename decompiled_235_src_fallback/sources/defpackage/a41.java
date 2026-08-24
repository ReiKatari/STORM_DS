package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a41  reason: default package */
/* loaded from: classes.dex */
public class a41 extends defpackage.xk5 {
    public final /* synthetic */ int a;
    public final android.content.Context b;

    public /* synthetic */ a41(android.content.Context r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.xk5
    public boolean a(defpackage.m44 r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.B
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            return r0
        L14:
            java.lang.Object r0 = r1.B
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            return r0
    }

    @Override // defpackage.xk5
    public defpackage.aj c(defpackage.m44 r6, int r7) {
            r5 = this;
            int r7 = r5.a
            android.content.Context r5 = r5.b
            switch(r7) {
                case 0: goto Lc1;
                default: goto L7;
            }
        L7:
            java.lang.StringBuilder r7 = defpackage.ck7.a
            r6.getClass()
            java.lang.Object r6 = r6.B
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.String r7 = "No package provided: "
            if (r6 != 0) goto L19
            android.content.res.Resources r5 = r5.getResources()
            goto L27
        L19:
            java.lang.String r0 = r6.getAuthority()
            if (r0 == 0) goto Lb7
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            android.content.res.Resources r5 = r5.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
        L27:
            r0 = 0
            if (r6 != 0) goto L2c
            r6 = r0
            goto L73
        L2c:
            java.lang.String r1 = r6.getAuthority()
            if (r1 == 0) goto La1
            java.util.List r7 = r6.getPathSegments()
            if (r7 == 0) goto L95
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L95
            int r2 = r7.size()
            r3 = 1
            if (r2 != r3) goto L5c
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.NumberFormatException -> L50
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NumberFormatException -> L50
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L50
            goto L73
        L50:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r7 = "Last path segment is not a resource ID: "
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        L5c:
            int r2 = r7.size()
            r4 = 2
            if (r2 != r4) goto L89
            java.lang.Object r6 = r7.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r5.getIdentifier(r7, r6, r1)
        L73:
            aj r7 = new aj
            r1 = 0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r5, r6, r1)
            qw4 r6 = defpackage.qw4.DISK
            if (r5 == 0) goto L82
            r7.<init>(r5, r1, r6, r0)
            goto L88
        L82:
            java.lang.String r5 = "bitmap == null"
            defpackage.u34.x(r5)
            r7 = r1
        L88:
            return r7
        L89:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r7 = "More than two path segments: "
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        L95:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r7 = "No path segments: "
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        La1:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        Lab:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r7 = "Unable to obtain resources for package: "
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        Lb7:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r6 = defpackage.xg6.n(r6, r7)
            r5.<init>(r6)
            throw r5
        Lc1:
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.Object r6 = r6.B
            android.net.Uri r6 = (android.net.Uri) r6
            java.io.InputStream r5 = r5.openInputStream(r6)
            a83 r5 = defpackage.hi2.P(r5)
            aj r6 = new aj
            qw4 r7 = defpackage.qw4.DISK
            r6.<init>(r5, r7)
            return r6
    }
}
