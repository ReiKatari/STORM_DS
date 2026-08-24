package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class LocalFolderExtractor {
    private static final defpackage.ry3 logger = null;
    private final java.io.File folderDestination;

    static {
            java.lang.Class<com.github.junrar.LocalFolderExtractor> r0 = com.github.junrar.LocalFolderExtractor.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.LocalFolderExtractor.logger = r0
            return
    }

    public LocalFolderExtractor(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.folderDestination = r1
            return
    }

    private java.io.File createFile(com.github.junrar.rarfile.FileHeader r4, java.io.File r5) {
            r3 = this;
            java.lang.String r4 = r4.getFileName()
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r4)
            java.lang.String r1 = r0.getCanonicalPath()
            java.lang.String r2 = r5.getCanonicalPath()
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L2d
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            java.io.File r3 = r3.makeFile(r5, r4)     // Catch: java.io.IOException -> L22
            return r3
        L22:
            r3 = move-exception
            ry3 r4 = com.github.junrar.LocalFolderExtractor.logger
            java.lang.String r5 = r0.getName()
            r4.d(r5, r3)
        L2c:
            return r0
        L2d:
            java.lang.String r3 = "Rar contains file with invalid path: '"
            java.lang.String r4 = "'"
            java.lang.String r3 = defpackage.lb1.A(r3, r1, r4)
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    private java.io.File makeFile(java.io.File r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r3 = "\\\\"
            java.lang.String[] r3 = r5.split(r3)
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L10
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r5)
            return r3
        L10:
            if (r0 <= r1) goto L53
            java.lang.String r5 = ""
            r0 = 0
        L15:
            int r2 = r3.length
            int r2 = r2 - r1
            if (r0 >= r2) goto L36
            java.lang.StringBuilder r5 = defpackage.lb1.s(r5)
            java.lang.String r2 = java.io.File.separator
            r5.append(r2)
            r2 = r3[r0]
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r5)
            r2.mkdir()
            int r0 = r0 + 1
            goto L15
        L36:
            java.lang.StringBuilder r5 = defpackage.lb1.s(r5)
            java.lang.String r0 = java.io.File.separator
            r5.append(r0)
            int r0 = r3.length
            int r0 = r0 - r1
            r3 = r3[r0]
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r4, r3)
            r5.createNewFile()
            return r5
        L53:
            r3 = 0
            return r3
    }

    public java.io.File createDirectory(com.github.junrar.rarfile.FileHeader r4) {
            r3 = this;
            java.lang.String r0 = "Rar contains invalid path: '"
            boolean r1 = r4.isDirectory()
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.String r4 = r4.getFileName()
            goto Lf
        Le:
            r4 = r2
        Lf:
            if (r4 != 0) goto L12
            return r2
        L12:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.folderDestination
            r1.<init>(r2, r4)
            java.lang.String r4 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L41
            java.io.File r3 = r3.folderDestination     // Catch: java.io.IOException -> L41
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.io.IOException -> L41
            boolean r3 = r4.startsWith(r3)     // Catch: java.io.IOException -> L41
            if (r3 == 0) goto L2a
            return r1
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L41
            r3.<init>(r0)     // Catch: java.io.IOException -> L41
            r3.append(r4)     // Catch: java.io.IOException -> L41
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.io.IOException -> L41
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L41
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L41
            r4.<init>(r3)     // Catch: java.io.IOException -> L41
            throw r4     // Catch: java.io.IOException -> L41
        L41:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
    }

    public java.io.File extract(com.github.junrar.Archive r2, com.github.junrar.rarfile.FileHeader r3) {
            r1 = this;
            java.io.File r0 = r1.folderDestination
            java.io.File r1 = r1.createFile(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r2.extractFile(r3, r0)     // Catch: java.lang.Throwable -> L12
            r0.close()
            return r1
        L12:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r3 = move-exception
            r1.addSuppressed(r3)
        L1d:
            throw r2
    }
}
