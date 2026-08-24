package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd5  reason: default package */
/* loaded from: classes.dex */
public final class vd5 extends defpackage.zl1 {
    public final java.io.File a;

    public vd5(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static boolean p(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 1
            if (r6 == 0) goto L36
            int r1 = r6.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L36
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L19
            boolean r5 = p(r4)
            r0 = r0 & r5
        L19:
            boolean r5 = r4.delete()
            if (r5 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to delete "
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "DocumentFile"
            android.util.Log.w(r4, r0)
            r0 = r2
        L33:
            int r3 = r3 + 1
            goto La
        L36:
            return r0
    }

    @Override // defpackage.zl1
    public final boolean a() {
            r0 = this;
            java.io.File r0 = r0.a
            boolean r0 = r0.canRead()
            return r0
    }

    @Override // defpackage.zl1
    public final defpackage.zl1 b(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r1.a
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L16
            boolean r1 = r0.mkdir()
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            return r1
        L16:
            vd5 r1 = new vd5
            r1.<init>(r0)
            return r1
    }

    @Override // defpackage.zl1
    public final defpackage.zl1 c(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r0.getExtensionFromMimeType(r2)
            if (r2 == 0) goto L10
            java.lang.String r0 = "."
            java.lang.String r3 = defpackage.lb1.m(r3, r0, r2)
        L10:
            java.io.File r2 = new java.io.File
            java.io.File r1 = r1.a
            r2.<init>(r1, r3)
            r1 = 0
            boolean r3 = r2.createNewFile()     // Catch: java.io.IOException -> L24
            if (r3 == 0) goto L26
            vd5 r3 = new vd5     // Catch: java.io.IOException -> L24
            r3.<init>(r2)     // Catch: java.io.IOException -> L24
            return r3
        L24:
            r2 = move-exception
            goto L27
        L26:
            return r1
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to createFile: "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DocumentFile"
            android.util.Log.w(r3, r2)
            return r1
    }

    @Override // defpackage.zl1
    public final boolean d() {
            r0 = this;
            java.io.File r0 = r0.a
            p(r0)
            boolean r0 = r0.delete()
            return r0
    }

    @Override // defpackage.zl1
    public final boolean e() {
            r0 = this;
            java.io.File r0 = r0.a
            boolean r0 = r0.exists()
            return r0
    }

    @Override // defpackage.zl1
    public final java.lang.String i() {
            r0 = this;
            java.io.File r0 = r0.a
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.zl1
    public final android.net.Uri j() {
            r0 = this;
            java.io.File r0 = r0.a
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @Override // defpackage.zl1
    public final boolean k() {
            r0 = this;
            java.io.File r0 = r0.a
            boolean r0 = r0.isDirectory()
            return r0
    }

    @Override // defpackage.zl1
    public final boolean l() {
            r0 = this;
            java.io.File r0 = r0.a
            boolean r0 = r0.isFile()
            return r0
    }

    @Override // defpackage.zl1
    public final long m() {
            r2 = this;
            java.io.File r2 = r2.a
            long r0 = r2.lastModified()
            return r0
    }

    @Override // defpackage.zl1
    public final long n() {
            r2 = this;
            java.io.File r2 = r2.a
            long r0 = r2.length()
            return r0
    }

    @Override // defpackage.zl1
    public final defpackage.zl1[] o() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r6 = r6.a
            java.io.File[] r6 = r6.listFiles()
            r1 = 0
            if (r6 == 0) goto L1f
            int r2 = r6.length
            r3 = r1
        L10:
            if (r3 >= r2) goto L1f
            r4 = r6[r3]
            vd5 r5 = new vd5
            r5.<init>(r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L10
        L1f:
            zl1[] r6 = new defpackage.zl1[r1]
            java.lang.Object[] r6 = r0.toArray(r6)
            zl1[] r6 = (defpackage.zl1[]) r6
            return r6
    }
}
