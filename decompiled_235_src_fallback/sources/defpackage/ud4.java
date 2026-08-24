package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud4  reason: default package */
/* loaded from: classes.dex */
public final class ud4 {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.v80 c;

    public ud4(android.content.Context r2, defpackage.kd6 r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r2 = 0
            r3 = 6
            r0 = -1
            v80 r2 = defpackage.nb3.c(r0, r2, r2, r3)
            r1.c = r2
            return
    }

    public final void a(defpackage.pq5 r8, defpackage.u63 r9) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = r9.B
            ss0 r0 = (defpackage.ss0) r0
            android.content.Context r1 = r7.a
            java.io.File r1 = r1.getExternalCacheDir()
            if (r1 == 0) goto L17
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "extracted_roms"
            r2.<init>(r1, r3)
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L91
            boolean r1 = r2.isDirectory()
            if (r1 != 0) goto L26
            boolean r1 = r2.mkdirs()
            if (r1 == 0) goto L91
        L26:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "temp"
            r1.<init>(r2, r3)
            java.lang.Object r3 = r0.B     // Catch: java.lang.Exception -> L85
            hj6 r3 = (defpackage.hj6) r3     // Catch: java.lang.Exception -> L85
            r7.c(r3)     // Catch: java.lang.Exception -> L85
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L85
            r3.<init>(r1)     // Catch: java.lang.Exception -> L85
            java.lang.Object r9 = r9.L     // Catch: java.lang.Throwable -> L7c
            n36 r9 = (defpackage.n36) r9     // Catch: java.lang.Throwable -> L7c
            r41 r9 = r9.A     // Catch: java.lang.Throwable -> L7c
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L7c
        L43:
            r5 = 0
            int r6 = r0.read(r4)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L7c
            if (r6 > 0) goto L4b
            goto L58
        L4b:
            r3.write(r4, r5, r6)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L7c
            l61 r6 = r9.b()     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L7c
            boolean r5 = defpackage.yh2.z(r6)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L7c
            if (r5 != 0) goto L43
        L58:
            l61 r9 = r9.b()     // Catch: java.lang.Throwable -> L7c
            boolean r5 = defpackage.yh2.z(r9)     // Catch: java.lang.Throwable -> L7c
        L60:
            if (r5 == 0) goto L7e
            android.net.Uri r8 = r8.d     // Catch: java.lang.Throwable -> L7c
            int r8 = r8.hashCode()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L7c
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L7c
            r9.<init>(r2, r8)     // Catch: java.lang.Throwable -> L7c
            r1.renameTo(r9)     // Catch: java.lang.Throwable -> L7c
            v80 r7 = r7.c     // Catch: java.lang.Throwable -> L7c
            jg7 r8 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L7c
            r7.c(r8)     // Catch: java.lang.Throwable -> L7c
            goto L81
        L7c:
            r7 = move-exception
            goto L87
        L7e:
            r1.delete()     // Catch: java.lang.Throwable -> L7c
        L81:
            r3.close()     // Catch: java.lang.Exception -> L85
            return
        L85:
            r7 = move-exception
            goto L8d
        L87:
            throw r7     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            defpackage.ge7.t(r3, r7)     // Catch: java.lang.Exception -> L85
            throw r8     // Catch: java.lang.Exception -> L85
        L8d:
            r1.delete()
            throw r7
        L91:
            se0 r7 = new se0
            java.lang.String r8 = "Failed to create ROM cache directory"
            r7.<init>(r8)
            throw r7
    }

    public final defpackage.hj6 b() {
            r6 = this;
            android.content.Context r6 = r6.a
            java.io.File r6 = r6.getExternalCacheDir()
            if (r6 == 0) goto L10
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "extracted_roms"
            r0.<init>(r6, r1)
            goto L11
        L10:
            r0 = 0
        L11:
            r1 = 0
            if (r0 == 0) goto L29
            java.io.File[] r6 = r0.listFiles()
            if (r6 == 0) goto L29
            int r0 = r6.length
            r3 = 0
        L1d:
            if (r3 >= r0) goto L29
            r4 = r6[r3]
            long r4 = r4.length()
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L1d
        L29:
            hj6 r6 = new hj6
            r6.<init>(r1)
            return r6
    }

    public final void c(defpackage.hj6 r9) {
            r8 = this;
            hj6 r0 = r8.b()
            kd6 r1 = r8.b
            ng6 r1 = (defpackage.ng6) r1
            android.content.SharedPreferences r1 = r1.b
            java.lang.String r2 = "rom_cache_max_size"
            r3 = 3
            int r1 = r1.getInt(r2, r3)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = (double) r1
            double r1 = java.lang.Math.pow(r2, r4)
            long r1 = (long) r1
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r3 = r3 * r1
            r9.getClass()
            long r0 = r0.A
            long r5 = r9.A
            long r0 = r0 + r5
            int r9 = defpackage.nb3.q(r0, r3)
            if (r9 <= 0) goto L92
            long r0 = r0 - r3
            android.content.Context r8 = r8.a
            java.io.File r8 = r8.getExternalCacheDir()
            if (r8 == 0) goto L3c
            java.io.File r9 = new java.io.File
            java.lang.String r2 = "extracted_roms"
            r9.<init>(r8, r2)
            goto L3d
        L3c:
            r9 = 0
        L3d:
            if (r9 == 0) goto L92
            java.io.File[] r8 = r9.listFiles()
            if (r8 == 0) goto L92
            zh2 r9 = new zh2
            r2 = 24
            r9.<init>(r2)
            int r2 = r8.length
            if (r2 != 0) goto L50
            goto L5c
        L50:
            int r2 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            int r2 = r8.length
            r3 = 1
            if (r2 <= r3) goto L5c
            java.util.Arrays.sort(r8, r9)
        L5c:
            java.util.List r8 = java.util.Arrays.asList(r8)
            r8.getClass()
            hj6 r9 = new hj6
            r2 = 0
            r9.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L6e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r8.next()
            java.io.File r2 = (java.io.File) r2
            long r3 = r2.length()
            hj6 r5 = new hj6
            long r6 = r9.A
            long r6 = r6 + r3
            r5.<init>(r6)
            r2.delete()
            int r9 = defpackage.nb3.q(r6, r0)
            if (r9 < 0) goto L90
            goto L92
        L90:
            r9 = r5
            goto L6e
        L92:
            return
    }

    public final android.net.Uri d(defpackage.pq5 r4, boolean r5) {
            r3 = this;
            r4.getClass()
            android.net.Uri r4 = r4.d
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            android.content.Context r3 = r3.a
            java.io.File r3 = r3.getExternalCacheDir()
            r0 = 0
            if (r3 == 0) goto L1e
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "extracted_roms"
            r1.<init>(r3, r2)
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L46
            boolean r3 = r1.isDirectory()
            if (r3 != 0) goto L28
            goto L46
        L28:
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r4)
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L46
            if (r5 == 0) goto L41
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            r3.setLastModified(r4)
        L41:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            return r3
        L46:
            return r0
    }
}
