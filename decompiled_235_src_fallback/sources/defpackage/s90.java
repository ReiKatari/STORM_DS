package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s90  reason: default package */
/* loaded from: classes.dex */
public final class s90 {
    public final /* synthetic */ int a;

    public /* synthetic */ s90(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public final java.lang.Object a(java.lang.Object r7, defpackage.fo4 r8) {
            r6 = this;
            int r6 = r6.a
            java.lang.String r0 = "android.resource://"
            java.lang.String r1 = ""
            r2 = 47
            r3 = 0
            switch(r6) {
                case 0: goto L114;
                case 1: goto L106;
                case 2: goto Lb6;
                case 3: goto Lb1;
                case 4: goto L84;
                case 5: goto L13;
                default: goto Lc;
            }
        Lc:
            java.lang.String r7 = (java.lang.String) r7
            android.net.Uri r6 = android.net.Uri.parse(r7)
            return r6
        L13:
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r6 = r7.getScheme()
            java.lang.String r4 = "android.resource"
            boolean r6 = defpackage.nb3.k(r6, r4)
            if (r6 == 0) goto L83
            java.lang.String r6 = r7.getAuthority()
            if (r6 == 0) goto L83
            boolean r6 = defpackage.qs6.v0(r6)
            if (r6 == 0) goto L2e
            goto L83
        L2e:
            java.util.List r6 = r7.getPathSegments()
            int r6 = r6.size()
            r4 = 2
            if (r6 != r4) goto L83
            java.lang.String r6 = r7.getAuthority()
            if (r6 != 0) goto L40
            goto L41
        L40:
            r1 = r6
        L41:
            android.content.Context r6 = r8.a
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.res.Resources r6 = r6.getResourcesForApplication(r1)
            java.util.List r8 = r7.getPathSegments()
            r4 = 0
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            int r6 = r6.getIdentifier(r8, r4, r1)
            if (r6 == 0) goto L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r1)
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.net.Uri r3 = android.net.Uri.parse(r6)
            goto L83
        L7a:
            java.lang.String r6 = "Invalid android.resource URI: "
            java.lang.String r6 = defpackage.xg6.n(r7, r6)
            defpackage.u34.f(r6)
        L83:
            return r3
        L84:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            android.content.Context r7 = r8.a
            android.content.res.Resources r8 = r7.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Lb0
            java.lang.String r8 = r8.getResourceEntryName(r6)     // Catch: android.content.res.Resources.NotFoundException -> Lb0
            if (r8 == 0) goto Lb0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r7 = r7.getPackageName()
            r8.append(r7)
            r8.append(r2)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.net.Uri r3 = android.net.Uri.parse(r6)
        Lb0:
            return r3
        Lb1:
            i03 r7 = (defpackage.i03) r7
            java.lang.String r6 = r7.i
            return r6
        Lb6:
            android.net.Uri r7 = (android.net.Uri) r7
            boolean r6 = defpackage.k.c(r7)
            if (r6 != 0) goto L105
            java.lang.String r6 = r7.getScheme()
            java.lang.String r8 = "file"
            if (r6 == 0) goto Lcc
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L105
        Lcc:
            java.lang.String r6 = r7.getPath()
            if (r6 != 0) goto Ld3
            goto Ld4
        Ld3:
            r1 = r6
        Ld4:
            boolean r6 = defpackage.qs6.L0(r1, r2)
            if (r6 == 0) goto L105
            java.util.List r6 = r7.getPathSegments()
            java.lang.Object r6 = defpackage.gt0.J0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L105
            java.lang.String r6 = r7.getScheme()
            boolean r6 = defpackage.nb3.k(r6, r8)
            if (r6 == 0) goto Lfc
            java.lang.String r6 = r7.getPath()
            if (r6 == 0) goto L105
            java.io.File r3 = new java.io.File
            r3.<init>(r6)
            goto L105
        Lfc:
            java.io.File r3 = new java.io.File
            java.lang.String r6 = r7.toString()
            r3.<init>(r6)
        L105:
            return r3
        L106:
            java.net.URL r7 = (java.net.URL) r7
            java.lang.String r6 = r7.toString()
            r6.getClass()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            return r6
        L114:
            byte[] r7 = (byte[]) r7
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r7)
            return r6
    }
}
