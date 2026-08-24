package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u35  reason: default package */
/* loaded from: classes.dex */
public abstract class u35 {
    public static final defpackage.w31 a = null;

    static {
            w31 r0 = new w31
            r1 = 20
            r0.<init>(r1)
            defpackage.u35.a = r0
            return
    }

    public static void a(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    public static void b(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.t35 r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2ed
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.j(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            defpackage.w35.c(r1, r9)
            goto L2ec
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            byte[] r13 = defpackage.nb3.r
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            qi1 r2 = new qi1
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r4 = r2.e
            byte[] r4 = (byte[]) r4
            if (r4 != 0) goto Lce
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.b(r3, r0)
        Lcb:
            r7 = 1
            goto L2e1
        Lce:
            boolean r6 = r7.exists()
            r14 = 4
            if (r6 == 0) goto Le1
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Ldf
            r2.b(r14, r12)
            goto Lcb
        Ldf:
            r6 = 1
            goto Lee
        Le1:
            boolean r6 = r7.createNewFile()     // Catch: java.io.IOException -> Leb
            if (r6 != 0) goto Ldf
            r2.b(r14, r12)     // Catch: java.io.IOException -> Leb
            goto Lcb
        Leb:
            r7 = 1
            goto L2de
        Lee:
            r2.b = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.a(r3, r0)     // Catch: java.io.IOException -> Lf7 java.io.FileNotFoundException -> Lfc
            r7 = r0
            goto L101
        Lf7:
            r0 = move-exception
            r5.j(r8, r0)
            goto L100
        Lfc:
            r0 = move-exception
            r5.j(r6, r0)
        L100:
            r7 = r12
        L101:
            java.lang.String r15 = "Invalid magic"
            r6 = 8
            if (r7 == 0) goto L150
            byte[] r0 = defpackage.nw7.k0(r7, r14)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            if (r0 == 0) goto L12d
            byte[] r0 = defpackage.nw7.k0(r7, r14)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            java.lang.Object r9 = r2.h     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            ti1[] r9 = defpackage.nb3.S(r7, r0, r9)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            r7.close()     // Catch: java.io.IOException -> L121
            goto L144
        L121:
            r0 = move-exception
            r5.j(r8, r0)
            goto L144
        L126:
            r0 = move-exception
            r1 = r0
            goto L147
        L129:
            r0 = move-exception
            goto L133
        L12b:
            r0 = move-exception
            goto L13f
        L12d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
            throw r0     // Catch: java.lang.Throwable -> L126 java.lang.IllegalStateException -> L129 java.io.IOException -> L12b
        L133:
            r5.j(r6, r0)     // Catch: java.lang.Throwable -> L126
        L136:
            r7.close()     // Catch: java.io.IOException -> L13a
            goto L143
        L13a:
            r0 = move-exception
            r5.j(r8, r0)
            goto L143
        L13f:
            r5.j(r8, r0)     // Catch: java.lang.Throwable -> L126
            goto L136
        L143:
            r9 = r12
        L144:
            r2.i = r9
            goto L150
        L147:
            r7.close()     // Catch: java.io.IOException -> L14b
            goto L14f
        L14b:
            r0 = move-exception
            r5.j(r8, r0)
        L14f:
            throw r1
        L150:
            java.lang.Object r0 = r2.i
            ti1[] r0 = (defpackage.ti1[]) r0
            if (r0 == 0) goto L1ba
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r7 < r9) goto L15d
            goto L166
        L15d:
            r9 = 24
            if (r7 == r9) goto L166
            r9 = 25
            if (r7 == r9) goto L166
            goto L1ba
        L166:
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.a(r3, r7)     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            if (r3 == 0) goto L1a1
            byte[] r7 = defpackage.nb3.s     // Catch: java.lang.Throwable -> L18f
            byte[] r9 = defpackage.nw7.k0(r3, r14)     // Catch: java.lang.Throwable -> L18f
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L18f
            if (r7 == 0) goto L192
            byte[] r7 = defpackage.nw7.k0(r3, r14)     // Catch: java.lang.Throwable -> L18f
            ti1[] r0 = defpackage.nb3.P(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L18f
            r2.i = r0     // Catch: java.lang.Throwable -> L18f
            r3.close()     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            r0 = r2
            goto L1b7
        L189:
            r0 = move-exception
            goto L1a7
        L18b:
            r0 = move-exception
            goto L1ad
        L18d:
            r0 = move-exception
            goto L1b1
        L18f:
            r0 = move-exception
            r4 = r0
            goto L198
        L192:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L18f
            throw r0     // Catch: java.lang.Throwable -> L18f
        L198:
            r3.close()     // Catch: java.lang.Throwable -> L19c
            goto L1a0
        L19c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
        L1a0:
            throw r4     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
        L1a1:
            if (r3 == 0) goto L1b6
            r3.close()     // Catch: java.lang.IllegalStateException -> L189 java.io.IOException -> L18b java.io.FileNotFoundException -> L18d
            goto L1b6
        L1a7:
            r2.i = r12
            r5.j(r6, r0)
            goto L1b6
        L1ad:
            r5.j(r8, r0)
            goto L1b6
        L1b1:
            r3 = 9
            r5.j(r3, r0)
        L1b6:
            r0 = r12
        L1b7:
            if (r0 == 0) goto L1ba
            r2 = r0
        L1ba:
            java.lang.Object r0 = r2.d
            r3 = r0
            t35 r3 = (defpackage.t35) r3
            java.lang.Object r0 = r2.i
            ti1[] r0 = (defpackage.ti1[]) r0
            java.lang.Object r4 = r2.e
            byte[] r4 = (byte[]) r4
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L215
            if (r4 != 0) goto L1ce
            goto L215
        L1ce:
            boolean r7 = r2.b
            if (r7 == 0) goto L211
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            r7.write(r13)     // Catch: java.lang.Throwable -> L1f1
            r7.write(r4)     // Catch: java.lang.Throwable -> L1f1
            boolean r0 = defpackage.nb3.d0(r7, r4, r0)     // Catch: java.lang.Throwable -> L1f1
            if (r0 != 0) goto L1f4
            r0 = 5
            r3.j(r0, r12)     // Catch: java.lang.Throwable -> L1f1
            r2.i = r12     // Catch: java.lang.Throwable -> L1f1
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            goto L215
        L1ed:
            r0 = move-exception
            goto L207
        L1ef:
            r0 = move-exception
            goto L20b
        L1f1:
            r0 = move-exception
            r4 = r0
            goto L1fe
        L1f4:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1f1
            r2.f = r0     // Catch: java.lang.Throwable -> L1f1
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
            goto L20e
        L1fe:
            r7.close()     // Catch: java.lang.Throwable -> L202
            goto L206
        L202:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
        L206:
            throw r4     // Catch: java.lang.IllegalStateException -> L1ed java.io.IOException -> L1ef
        L207:
            r3.j(r6, r0)
            goto L20e
        L20b:
            r3.j(r8, r0)
        L20e:
            r2.i = r12
            goto L215
        L211:
            defpackage.i.m(r5)
            return
        L215:
            java.lang.Object r0 = r2.f
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L21f
            r6 = 0
            r7 = 1
            goto L2ce
        L21f:
            boolean r3 = r2.b
            if (r3 == 0) goto L2da
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L267 java.io.IOException -> L2bb java.io.FileNotFoundException -> L2be
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L267 java.io.IOException -> L2bb java.io.FileNotFoundException -> L2be
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2af
            java.lang.Object r0 = r2.g     // Catch: java.lang.Throwable -> L2af
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L2af
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2af
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L2a3
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L295
            if (r6 == 0) goto L27d
            boolean r0 = r6.isValid()     // Catch: java.lang.Throwable -> L27f
            if (r0 == 0) goto L27d
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L27f
        L245:
            int r7 = r3.read(r0)     // Catch: java.lang.Throwable -> L27f
            if (r7 <= 0) goto L250
            r9 = 0
            r4.write(r0, r9, r7)     // Catch: java.lang.Throwable -> L27f
            goto L245
        L250:
            r7 = 1
            r2.b(r7, r12)     // Catch: java.lang.Throwable -> L27a
            r6.close()     // Catch: java.lang.Throwable -> L277
            r5.close()     // Catch: java.lang.Throwable -> L274
            r4.close()     // Catch: java.lang.Throwable -> L271
            r3.close()     // Catch: java.lang.Throwable -> L267 java.io.IOException -> L26a java.io.FileNotFoundException -> L26d
            r2.f = r12
            r2.i = r12
            r6 = r7
            goto L2ce
        L267:
            r0 = move-exception
            goto L2d5
        L26a:
            r0 = move-exception
            goto L2c1
        L26d:
            r0 = move-exception
        L26e:
            r3 = 6
            goto L2c9
        L271:
            r0 = move-exception
        L272:
            r4 = r0
            goto L2b2
        L274:
            r0 = move-exception
        L275:
            r5 = r0
            goto L2a6
        L277:
            r0 = move-exception
        L278:
            r6 = r0
            goto L298
        L27a:
            r0 = move-exception
        L27b:
            r9 = r0
            goto L28a
        L27d:
            r7 = 1
            goto L282
        L27f:
            r0 = move-exception
            r7 = 1
            goto L27b
        L282:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L27a
            java.lang.String r9 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L27a
            throw r0     // Catch: java.lang.Throwable -> L27a
        L28a:
            if (r6 == 0) goto L294
            r6.close()     // Catch: java.lang.Throwable -> L290
            goto L294
        L290:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L277
        L294:
            throw r9     // Catch: java.lang.Throwable -> L277
        L295:
            r0 = move-exception
            r7 = 1
            goto L278
        L298:
            if (r5 == 0) goto L2a2
            r5.close()     // Catch: java.lang.Throwable -> L29e
            goto L2a2
        L29e:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L274
        L2a2:
            throw r6     // Catch: java.lang.Throwable -> L274
        L2a3:
            r0 = move-exception
            r7 = 1
            goto L275
        L2a6:
            r4.close()     // Catch: java.lang.Throwable -> L2aa
            goto L2ae
        L2aa:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L271
        L2ae:
            throw r5     // Catch: java.lang.Throwable -> L271
        L2af:
            r0 = move-exception
            r7 = 1
            goto L272
        L2b2:
            r3.close()     // Catch: java.lang.Throwable -> L2b6
            goto L2ba
        L2b6:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L267 java.io.IOException -> L26a java.io.FileNotFoundException -> L26d
        L2ba:
            throw r4     // Catch: java.lang.Throwable -> L267 java.io.IOException -> L26a java.io.FileNotFoundException -> L26d
        L2bb:
            r0 = move-exception
            r7 = 1
            goto L2c1
        L2be:
            r0 = move-exception
            r7 = 1
            goto L26e
        L2c1:
            r2.b(r8, r0)     // Catch: java.lang.Throwable -> L267
        L2c4:
            r2.f = r12
            r2.i = r12
            goto L2cd
        L2c9:
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L267
            goto L2c4
        L2cd:
            r6 = 0
        L2ce:
            if (r6 == 0) goto L2d3
            a(r10, r11)
        L2d3:
            r9 = r6
            goto L2e2
        L2d5:
            r2.f = r12
            r2.i = r12
            throw r0
        L2da:
            defpackage.i.m(r5)
            return
        L2de:
            r2.b(r14, r12)
        L2e1:
            r9 = 0
        L2e2:
            if (r9 == 0) goto L2e8
            if (r21 == 0) goto L2e8
            r9 = r7
            goto L2e9
        L2e8:
            r9 = 0
        L2e9:
            defpackage.w35.c(r1, r9)
        L2ec:
            return
        L2ed:
            r0 = move-exception
            r5.j(r8, r0)
            r9 = 0
            defpackage.w35.c(r1, r9)
            return
    }
}
