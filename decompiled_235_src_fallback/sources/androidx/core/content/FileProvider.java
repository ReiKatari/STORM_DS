package androidx.core.content;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {
    public static final java.lang.String[] R = null;
    public static final java.io.File X = null;
    public static final java.util.HashMap Y = null;
    public final java.lang.Object A;
    public java.lang.String B;
    public defpackage.ab2 L;

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.R = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.X = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.Y = r0
            return
    }

    public FileProvider() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.A = r0
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            int r0 = r2.length()
            if (r0 <= 0) goto L1f
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L1f
            int r0 = r2.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1f:
            return r2
    }

    public static defpackage.ab2 c(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap r0 = androidx.core.content.FileProvider.Y
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            ab2 r1 = (defpackage.ab2) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L27
            ab2 r1 = d(r2, r3)     // Catch: java.lang.Throwable -> L13 org.xmlpull.v1.XmlPullParserException -> L15 java.io.IOException -> L1e
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L13
            goto L27
        L13:
            r2 = move-exception
            goto L29
        L15:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L1e:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public static defpackage.ab2 d(android.content.Context r7, java.lang.String r8) {
            ab2 r0 = new ab2
            r0.<init>(r8)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r8, r2)
            r2 = 0
            if (r1 == 0) goto Le5
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            java.lang.String r3 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r8 = r1.loadXmlMetaData(r8, r3)
            if (r8 == 0) goto Ldf
        L1e:
            int r1 = r8.next()
            r3 = 1
            if (r1 == r3) goto Lde
            r3 = 2
            if (r1 != r3) goto L1e
            java.lang.String r1 = r8.getName()
            java.lang.String r3 = "name"
            java.lang.String r3 = r8.getAttributeValue(r2, r3)
            java.lang.String r4 = "path"
            java.lang.String r4 = r8.getAttributeValue(r2, r4)
            java.lang.String r5 = "root-path"
            boolean r5 = r5.equals(r1)
            r6 = 0
            if (r5 == 0) goto L44
            java.io.File r1 = androidx.core.content.FileProvider.X
            goto La2
        L44:
            java.lang.String r5 = "files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L51
            java.io.File r1 = r7.getFilesDir()
            goto La2
        L51:
            java.lang.String r5 = "cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5e
            java.io.File r1 = r7.getCacheDir()
            goto La2
        L5e:
            java.lang.String r5 = "external-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L6b
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            goto La2
        L6b:
            java.lang.String r5 = "external-files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L7d
            java.io.File[] r1 = r7.getExternalFilesDirs(r2)
            int r5 = r1.length
            if (r5 <= 0) goto La1
            r1 = r1[r6]
            goto La2
        L7d:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8f
            java.io.File[] r1 = r7.getExternalCacheDirs()
            int r5 = r1.length
            if (r5 <= 0) goto La1
            r1 = r1[r6]
            goto La2
        L8f:
            java.lang.String r5 = "external-media-path"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La1
            java.io.File[] r1 = r7.getExternalMediaDirs()
            int r5 = r1.length
            if (r5 <= 0) goto La1
            r1 = r1[r6]
            goto La2
        La1:
            r1 = r2
        La2:
            if (r1 == 0) goto L1e
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r4 = r4[r6]
            if (r4 == 0) goto Lb2
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r4)
            r1 = r5
        Lb2:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Ld8
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.io.IOException -> Lc3
            java.util.HashMap r4 = r0.b
            r4.put(r3, r1)
            goto L1e
        Lc3:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to resolve canonical path for "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0, r7)
            throw r8
        Ld8:
            java.lang.String r7 = "Name must not be empty"
            defpackage.i.h(r7)
            return r2
        Lde:
            return r0
        Ldf:
            java.lang.String r7 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            defpackage.i.h(r7)
            return r2
        Le5:
            java.lang.String r7 = "Couldn't find meta-data for provider with authority "
            java.lang.String r7 = defpackage.i61.m(r7, r8)
            defpackage.i.h(r7)
            return r2
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context r1, android.content.pm.ProviderInfo r2) {
            r0 = this;
            super.attachInfo(r1, r2)
            boolean r1 = r2.exported
            if (r1 != 0) goto L48
            boolean r1 = r2.grantUriPermissions
            if (r1 == 0) goto L40
            java.lang.String r1 = r2.authority
            if (r1 == 0) goto L38
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L38
            java.lang.String r1 = r2.authority
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r2 = r0.A
            monitor-enter(r2)
            r0.B = r1     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r0 = androidx.core.content.FileProvider.Y
            monitor-enter(r0)
            r0.remove(r1)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
        L35:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must have a non-empty authority"
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must grant uri permissions"
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must not be exported"
            r0.<init>(r1)
            throw r0
    }

    public final defpackage.ab2 b() {
            r3 = this;
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            java.lang.String r1 = r3.B     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?"
            if (r1 == 0) goto L20
            ab2 r1 = r3.L     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r3.B     // Catch: java.lang.Throwable -> L1a
            ab2 r1 = c(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r3.L = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            ab2 r3 = r3.L     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            ab2 r0 = r0.b()
            java.io.File r0 = r0.a(r1)
            boolean r0 = r0.delete()
            return r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            ab2 r1 = r1.b()
            java.io.File r1 = r1.a(r2)
            java.lang.String r2 = r1.getName()
            r0 = 46
            int r2 = r2.lastIndexOf(r0)
            if (r2 < 0) goto L29
            java.lang.String r1 = r1.getName()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r2.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L29
            return r1
        L29:
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    public final java.lang.String getTypeAnonymous(android.net.Uri r1) {
            r0 = this;
            java.lang.String r0 = "application/octet-stream"
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external inserts"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r1, java.lang.String r2) {
            r0 = this;
            ab2 r0 = r0.b()
            java.io.File r0 = r0.a(r1)
            java.lang.String r1 = "r"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L13
            r1 = 268435456(0x10000000, float:2.524355E-29)
            goto L52
        L13:
            java.lang.String r1 = "w"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50
            java.lang.String r1 = "wt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            goto L50
        L24:
            java.lang.String r1 = "wa"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            r1 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L52
        L2f:
            java.lang.String r1 = "rw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3a
            r1 = 939524096(0x38000000, float:3.0517578E-5)
            goto L52
        L3a:
            java.lang.String r1 = "rwt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = 1006632960(0x3c000000, float:0.0078125)
            goto L52
        L45:
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r0 = defpackage.i61.m(r0, r2)
            defpackage.i.h(r0)
            r0 = 0
            return r0
        L50:
            r1 = 738197504(0x2c000000, float:1.8189894E-12)
        L52:
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r0, r1)
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r7, java.lang.String[] r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            r6 = this;
            ab2 r6 = r6.b()
            java.io.File r6 = r6.a(r7)
            java.lang.String r9 = "displayName"
            java.lang.String r7 = r7.getQueryParameter(r9)
            if (r8 != 0) goto L12
            java.lang.String[] r8 = androidx.core.content.FileProvider.R
        L12:
            int r9 = r8.length
            java.lang.String[] r9 = new java.lang.String[r9]
            int r10 = r8.length
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r11 = r8.length
            r0 = 0
            r1 = r0
            r2 = r1
        L1c:
            if (r1 >= r11) goto L52
            r3 = r8[r1]
            java.lang.String r4 = "_display_name"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L38
            r9[r2] = r4
            int r3 = r2 + 1
            if (r7 != 0) goto L33
            java.lang.String r4 = r6.getName()
            goto L34
        L33:
            r4 = r7
        L34:
            r10[r2] = r4
        L36:
            r2 = r3
            goto L4f
        L38:
            java.lang.String r4 = "_size"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4f
            r9[r2] = r4
            int r3 = r2 + 1
            long r4 = r6.length()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r10[r2] = r4
            goto L36
        L4f:
            int r1 = r1 + 1
            goto L1c
        L52:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.System.arraycopy(r9, r0, r6, r0, r2)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.System.arraycopy(r10, r0, r7, r0, r2)
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r9 = 1
            r8.<init>(r6, r9)
            r8.addRow(r7)
            return r8
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external updates"
            r0.<init>(r1)
            throw r0
    }
}
