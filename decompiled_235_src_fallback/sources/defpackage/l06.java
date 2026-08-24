package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l06  reason: default package */
/* loaded from: classes.dex */
public final class l06 {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.uh7 c;

    public l06(android.content.Context r1, defpackage.kd6 r2, defpackage.uh7 r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final defpackage.zl1 a(defpackage.pq5 r2) {
            r1 = this;
            kd6 r0 = r1.b
            ng6 r0 = (defpackage.ng6) r0
            android.net.Uri r2 = r0.u(r2)
            uh7 r1 = r1.c
            zl1 r1 = r1.b(r2)
            if (r1 == 0) goto L11
            return r1
        L11:
            java.lang.String r1 = "Could not open save directory: "
            java.lang.String r1 = defpackage.xg6.n(r2, r1)
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final void b(defpackage.pq5 r3, android.net.Uri r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            boolean r0 = r2.c(r4)
            if (r0 == 0) goto L67
            zl1 r0 = r2.a(r3)
            java.lang.String r3 = r2.g(r3)
            zl1 r1 = r0.f(r3)
            if (r1 == 0) goto L1b
            goto L38
        L1b:
            java.lang.String r1 = "application/octet-stream"
            zl1 r1 = r0.c(r1, r3)
            if (r1 != 0) goto L38
            zl1 r1 = r0.f(r3)
            if (r1 == 0) goto L2a
            goto L38
        L2a:
            android.net.Uri r2 = r0.j()
            java.lang.String r3 = "Could not create save file at "
            java.lang.String r2 = defpackage.xg6.n(r2, r3)
            defpackage.i.m(r2)
            return
        L38:
            android.net.Uri r3 = r1.j()
            r3.getClass()
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L46
            return
        L46:
            java.io.InputStream r4 = r2.d(r4)
            java.io.OutputStream r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L58
            defpackage.f04.w(r4, r2)     // Catch: java.lang.Throwable -> L5a
            r2.close()     // Catch: java.lang.Throwable -> L58
            r4.close()
            return
        L58:
            r2 = move-exception
            goto L61
        L5a:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L61:
            throw r2     // Catch: java.lang.Throwable -> L62
        L62:
            r3 = move-exception
            defpackage.ge7.t(r4, r2)
            throw r3
        L67:
            java.lang.String r2 = "Selected file is not a plausible DS save file"
            defpackage.i.h(r2)
            return
    }

    public final boolean c(android.net.Uri r8) {
            r7 = this;
            r8.getClass()
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = r8.getPath()
            if (r0 == 0) goto L4c
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            long r3 = r3.length()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L4c
        L26:
            android.content.Context r0 = r7.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r4 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r8, r4)
            if (r0 == 0) goto L4c
            long r4 = r0.getLength()     // Catch: java.lang.Throwable -> L45
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L45
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L41
            r3 = r6
        L41:
            r0.close()
            goto L4c
        L45:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L47
        L47:
            r8 = move-exception
            defpackage.ge7.t(r0, r7)
            throw r8
        L4c:
            r0 = 0
            if (r3 == 0) goto L61
            long r7 = r3.longValue()
            r1 = 1
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L79
            r1 = 67108865(0x4000001, double:3.31561847E-316)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L79
            goto L77
        L61:
            java.io.InputStream r7 = r7.d(r8)
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L87
            r3 = r1
        L6a:
            int r5 = r7.read(r8)     // Catch: java.lang.Throwable -> L87
            if (r5 >= 0) goto L7a
            r7.close()
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 <= 0) goto L79
        L77:
            r7 = 1
            return r7
        L79:
            return r0
        L7a:
            long r5 = (long) r5
            long r3 = r3 + r5
            r5 = 67108864(0x4000000, double:3.3156184E-316)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L6a
            r7.close()
            return r0
        L87:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            defpackage.ge7.t(r7, r8)
            throw r0
    }

    public final java.io.InputStream d(android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.String r2 = r3.getPath()
            if (r2 == 0) goto L1e
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            return r2
        L1e:
            java.lang.String r2 = "Invalid file URI: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.i.m(r2)
            return r1
        L28:
            android.content.Context r2 = r2.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.io.InputStream r2 = r2.openInputStream(r3)
            if (r2 == 0) goto L35
            return r2
        L35:
            java.lang.String r2 = "Could not open input stream: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.i.m(r2)
            return r1
    }

    public final java.io.OutputStream e(android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r2 = r3.getPath()
            if (r2 == 0) goto L1f
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r0 = 0
            r2.<init>(r3, r0)
            return r2
        L1f:
            java.lang.String r2 = "Invalid file URI: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.i.m(r2)
            return r1
        L29:
            android.content.Context r2 = r2.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "wt"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L38
            return r2
        L38:
            java.lang.String r2 = "Could not open output stream: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.i.m(r2)
            return r1
    }

    public final defpackage.k06 f(defpackage.pq5 r10) {
            r9 = this;
            r10.getClass()
            zl1 r0 = r9.a(r10)
            java.lang.String r1 = r9.g(r10)
            zl1 r0 = r0.f(r1)
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.net.Uri r2 = r0.j()
            r2.getClass()
            java.lang.String r0 = r0.i()
            if (r0 != 0) goto L24
            java.lang.String r0 = r9.g(r10)
        L24:
            java.io.File r10 = new java.io.File
            android.content.Context r3 = r9.a
            java.io.File r4 = r3.getCacheDir()
            java.lang.String r5 = "shared_saves"
            r10.<init>(r4, r5)
            boolean r4 = r10.isDirectory()
            if (r4 != 0) goto L3a
            r10.mkdirs()
        L3a:
            java.io.File r4 = new java.io.File
            r4.<init>(r10, r0)
            java.io.InputStream r9 = r9.d(r2)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L135
            r2 = 0
            r10.<init>(r4, r2)     // Catch: java.lang.Throwable -> L135
            defpackage.f04.w(r9, r10)     // Catch: java.lang.Throwable -> L137
            r10.close()     // Catch: java.lang.Throwable -> L135
            r9.close()
            java.lang.String r9 = r3.getPackageName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = ".fileprovider"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            ab2 r9 = androidx.core.content.FileProvider.c(r3, r9)
            java.lang.String r10 = r4.getCanonicalPath()     // Catch: java.io.IOException -> L12f
            java.util.HashMap r2 = r9.b
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L7a:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "/"
            if (r4 == 0) goto Lbc
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getValue()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getPath()
            java.lang.String r7 = androidx.core.content.FileProvider.a(r10)
            java.lang.String r8 = androidx.core.content.FileProvider.a(r6)
            java.lang.String r5 = r8.concat(r5)
            boolean r5 = r7.startsWith(r5)
            if (r5 == 0) goto L7a
            if (r3 == 0) goto Lba
            int r5 = r6.length()
            java.lang.Object r6 = r3.getValue()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getPath()
            int r6 = r6.length()
            if (r5 <= r6) goto L7a
        Lba:
            r3 = r4
            goto L7a
        Lbc:
            if (r3 == 0) goto L125
            java.lang.Object r1 = r3.getValue()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r1.getPath()
            boolean r2 = r1.endsWith(r5)
            if (r2 == 0) goto Ld7
            int r1 = r1.length()
            java.lang.String r10 = r10.substring(r1)
            goto Le1
        Ld7:
            int r1 = r1.length()
            int r1 = r1 + 1
            java.lang.String r10 = r10.substring(r1)
        Le1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = android.net.Uri.encode(r2)
            r1.append(r2)
            r2 = 47
            r1.append(r2)
            java.lang.String r10 = android.net.Uri.encode(r10, r5)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r2)
            java.lang.String r9 = r9.a
            android.net.Uri$Builder r9 = r1.authority(r9)
            android.net.Uri$Builder r9 = r9.encodedPath(r10)
            android.net.Uri r9 = r9.build()
            k06 r10 = new k06
            r9.getClass()
            r10.<init>(r9, r0)
            return r10
        L125:
            java.lang.String r9 = "Failed to find configured root that contains "
            java.lang.String r9 = defpackage.i61.m(r9, r10)
            defpackage.i.h(r9)
            return r1
        L12f:
            java.lang.String r9 = "Failed to resolve canonical path for "
            defpackage.e41.w(r4, r9)
            return r1
        L135:
            r10 = move-exception
            goto L13e
        L137:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L139
        L139:
            r1 = move-exception
            defpackage.ge7.t(r10, r0)     // Catch: java.lang.Throwable -> L135
            throw r1     // Catch: java.lang.Throwable -> L135
        L13e:
            throw r10     // Catch: java.lang.Throwable -> L13f
        L13f:
            r0 = move-exception
            defpackage.ge7.t(r9, r10)
            throw r0
    }

    public final java.lang.String g(defpackage.pq5 r3) {
            r2 = this;
            uh7 r0 = r2.c
            android.net.Uri r1 = r3.d
            zl1 r0 = r0.a(r1)
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.i()
            if (r0 == 0) goto L3d
            kd6 r2 = r2.b
            ng6 r2 = (defpackage.ng6) r2
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r3 = "save_file_use_srm_extension"
            r1 = 0
            boolean r2 = r2.getBoolean(r3, r1)
            if (r2 == 0) goto L22
            java.lang.String r2 = "srm"
            goto L24
        L22:
            java.lang.String r2 = "sav"
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r1 = "."
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = defpackage.qs6.F0(r0, r2, r3)
            return r2
        L3d:
            android.net.Uri r2 = r3.d
            java.lang.String r3 = "Could not determine ROM file name: "
            java.lang.String r2 = defpackage.xg6.n(r2, r3)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }
}
