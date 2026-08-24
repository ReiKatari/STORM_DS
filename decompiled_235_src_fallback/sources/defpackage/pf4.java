package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf4  reason: default package */
/* loaded from: classes.dex */
public final class pf4 extends defpackage.xf3 {
    public static java.lang.Long U(java.nio.file.attribute.FileTime r4) {
            long r0 = defpackage.wa2.z(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            return r4
        Lf:
            r4 = 0
            return r4
    }

    @Override // defpackage.xf3, defpackage.db2
    public final defpackage.ai1 D(defpackage.lt4 r10) {
            r9 = this;
            r10.getClass()
            da0 r9 = r10.A
            java.lang.String r9 = r9.s()
            r10 = 0
            java.lang.String[] r0 = new java.lang.String[r10]
            java.nio.file.Path r9 = defpackage.oc3.h(r9, r0)
            r9.getClass()
            r0 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            r2 = 1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]     // Catch: java.lang.Throwable -> L77
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Throwable -> L77
            r2[r10] = r3     // Catch: java.lang.Throwable -> L77
            java.nio.file.attribute.BasicFileAttributes r10 = java.nio.file.Files.readAttributes(r9, r1, r2)     // Catch: java.lang.Throwable -> L77
            boolean r1 = r10.isSymbolicLink()
            if (r1 == 0) goto L2c
            java.nio.file.Path r9 = java.nio.file.Files.readSymbolicLink(r9)
            goto L2d
        L2c:
            r9 = r0
        L2d:
            ai1 r1 = new ai1
            boolean r2 = r10.isRegularFile()
            boolean r3 = r10.isDirectory()
            if (r9 == 0) goto L45
            java.lang.String r4 = defpackage.lt4.B
            java.lang.String r9 = r9.toString()
            lt4 r9 = defpackage.w31.p(r9)
            r4 = r9
            goto L46
        L45:
            r4 = r0
        L46:
            long r5 = r10.size()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.nio.file.attribute.FileTime r9 = r10.creationTime()
            if (r9 == 0) goto L5a
            java.lang.Long r9 = U(r9)
            r6 = r9
            goto L5b
        L5a:
            r6 = r0
        L5b:
            java.nio.file.attribute.FileTime r9 = r10.lastModifiedTime()
            if (r9 == 0) goto L67
            java.lang.Long r9 = U(r9)
            r7 = r9
            goto L68
        L67:
            r7 = r0
        L68:
            java.nio.file.attribute.FileTime r9 = r10.lastAccessTime()
            if (r9 == 0) goto L72
            java.lang.Long r0 = U(r9)
        L72:
            r8 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L77:
            return r0
    }

    @Override // defpackage.xf3, defpackage.db2
    public final void h(defpackage.lt4 r3, defpackage.lt4 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            da0 r2 = r3.A     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.lang.String r2 = r2.s()     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.nio.file.Path r2 = defpackage.oc3.h(r2, r0)     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r2.getClass()     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            da0 r4 = r4.A     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.lang.String r4 = r4.s()     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.nio.file.Path r4 = defpackage.oc3.h(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r4.getClass()     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r0[r3] = r1     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            r1 = 1
            r0[r1] = r3     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            java.nio.file.Files.move(r2, r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L35 java.lang.UnsupportedOperationException -> L37
            return
        L35:
            r2 = move-exception
            goto L3d
        L37:
            java.lang.String r2 = "atomic move not supported"
            defpackage.e41.i(r2)
            return
        L3d:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            throw r3
    }

    @Override // defpackage.xf3
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }
}
