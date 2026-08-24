package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Junrar {
    private static final defpackage.ry3 logger = null;

    static {
            java.lang.Class<com.github.junrar.Junrar> r0 = com.github.junrar.Junrar.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.Junrar.logger = r0
            return
    }

    public Junrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.github.junrar.Archive createArchiveOrThrowException(com.github.junrar.volume.VolumeManager r2, java.lang.String r3) {
            com.github.junrar.Archive r0 = new com.github.junrar.Archive     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r2 = move-exception
            ry3 r3 = com.github.junrar.Junrar.logger
            java.lang.String r0 = "Error while creating archive"
            r3.v(r0, r2)
            throw r2
    }

    private static com.github.junrar.Archive createArchiveOrThrowException(java.io.File r1, java.lang.String r2) {
            com.github.junrar.Archive r0 = new com.github.junrar.Archive     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            r1 = move-exception
            ry3 r2 = com.github.junrar.Junrar.logger
            java.lang.String r0 = "Error while creating archive"
            r2.v(r0, r1)
            throw r1
    }

    private static com.github.junrar.Archive createArchiveOrThrowException(java.io.InputStream r1, java.lang.String r2) {
            com.github.junrar.Archive r0 = new com.github.junrar.Archive     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            r1 = move-exception
            ry3 r2 = com.github.junrar.Junrar.logger
            java.lang.String r0 = "Error while creating archive"
            r2.v(r0, r1)
            throw r1
    }

    public static java.util.List<java.io.File> extract(com.github.junrar.volume.VolumeManager r1, java.io.File r2) {
            validateDestinationPath(r2)
            r0 = 0
            com.github.junrar.Archive r1 = createArchiveOrThrowException(r1, r0)
            com.github.junrar.LocalFolderExtractor r0 = new com.github.junrar.LocalFolderExtractor
            r0.<init>(r2)
            java.util.List r1 = extractArchiveTo(r1, r0)
            return r1
    }

    public static java.util.List<java.io.File> extract(com.github.junrar.volume.VolumeManager r0, java.io.File r1, java.lang.String r2) {
            validateDestinationPath(r1)
            com.github.junrar.Archive r0 = createArchiveOrThrowException(r0, r2)
            com.github.junrar.LocalFolderExtractor r2 = new com.github.junrar.LocalFolderExtractor
            r2.<init>(r1)
            java.util.List r0 = extractArchiveTo(r0, r2)
            return r0
    }

    public static java.util.List<java.io.File> extract(java.io.File r1, java.io.File r2) {
            r0 = 0
            java.util.List r1 = extract(r1, r2, r0)
            return r1
    }

    public static java.util.List<java.io.File> extract(java.io.File r0, java.io.File r1, java.lang.String r2) {
            validateRarPath(r0)
            validateDestinationPath(r1)
            com.github.junrar.Archive r0 = createArchiveOrThrowException(r0, r2)
            com.github.junrar.LocalFolderExtractor r2 = new com.github.junrar.LocalFolderExtractor
            r2.<init>(r1)
            java.util.List r0 = extractArchiveTo(r0, r2)
            return r0
    }

    public static java.util.List<java.io.File> extract(java.io.InputStream r1, java.io.File r2) {
            r0 = 0
            java.util.List r1 = extract(r1, r2, r0)
            return r1
    }

    public static java.util.List<java.io.File> extract(java.io.InputStream r0, java.io.File r1, java.lang.String r2) {
            validateDestinationPath(r1)
            com.github.junrar.Archive r0 = createArchiveOrThrowException(r0, r2)
            com.github.junrar.LocalFolderExtractor r2 = new com.github.junrar.LocalFolderExtractor
            r2.<init>(r1)
            java.util.List r0 = extractArchiveTo(r0, r2)
            return r0
    }

    public static java.util.List<java.io.File> extract(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            java.util.List r1 = extract(r1, r2, r0)
            return r1
    }

    public static java.util.List<java.io.File> extract(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L13
            if (r2 == 0) goto L13
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            java.util.List r1 = extract(r0, r1, r3)
            return r1
        L13:
            java.lang.String r1 = "archive and destination must be set"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    private static java.util.List<java.io.File> extractArchiveTo(com.github.junrar.Archive r3, com.github.junrar.LocalFolderExtractor r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L1f
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1f
            com.github.junrar.rarfile.FileHeader r2 = (com.github.junrar.rarfile.FileHeader) r2     // Catch: java.lang.Throwable -> L1f
            java.io.File r2 = tryToExtract(r4, r3, r2)     // Catch: java.lang.Throwable -> L1f com.github.junrar.exception.RarException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L9
            r0.add(r2)     // Catch: java.lang.Throwable -> L1f com.github.junrar.exception.RarException -> L21 java.io.IOException -> L23
            goto L9
        L1f:
            r4 = move-exception
            goto L30
        L21:
            r4 = move-exception
            goto L24
        L23:
            r4 = move-exception
        L24:
            ry3 r0 = com.github.junrar.Junrar.logger     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "error extracting the file"
            r0.v(r1, r4)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L2c:
            r3.close()
            return r0
        L30:
            r3.close()
            throw r4
    }

    public static java.util.List<com.github.junrar.ContentDescription> getContentsDescription(java.io.File r1) {
            validateRarPath(r1)
            r0 = 0
            com.github.junrar.Archive r1 = createArchiveOrThrowException(r1, r0)
            java.util.List r1 = getContentsDescriptionFromArchive(r1)
            return r1
    }

    public static java.util.List<com.github.junrar.ContentDescription> getContentsDescription(java.io.InputStream r1) {
            r0 = 0
            com.github.junrar.Archive r1 = createArchiveOrThrowException(r1, r0)
            java.util.List r1 = getContentsDescriptionFromArchive(r1)
            return r1
    }

    private static java.util.List<com.github.junrar.ContentDescription> getContentsDescriptionFromArchive(com.github.junrar.Archive r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r7.isEncrypted()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            ry3 r0 = com.github.junrar.Junrar.logger     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "archive is encrypted cannot extract"
            r0.q(r1)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            r7.close()
            return r0
        L1b:
            r0 = move-exception
            goto L42
        L1d:
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L1b
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.github.junrar.rarfile.FileHeader r2 = (com.github.junrar.rarfile.FileHeader) r2     // Catch: java.lang.Throwable -> L1b
            com.github.junrar.ContentDescription r3 = new com.github.junrar.ContentDescription     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r2.getFileName()     // Catch: java.lang.Throwable -> L1b
            long r5 = r2.getUnpSize()     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1b
            r0.add(r3)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L3e:
            r7.close()
            return r0
        L42:
            r7.close()
            throw r0
    }

    private static java.io.File tryToExtract(com.github.junrar.LocalFolderExtractor r3, com.github.junrar.Archive r4, com.github.junrar.rarfile.FileHeader r5) {
            java.lang.String r0 = r5.getFileName()
            ry3 r1 = com.github.junrar.Junrar.logger
            java.lang.String r2 = "extracting: {}"
            r1.b(r0, r2)
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L16
            java.io.File r3 = r3.createDirectory(r5)
            return r3
        L16:
            java.io.File r3 = r3.extract(r4, r5)
            return r3
    }

    private static void validateDestinationPath(java.io.File r1) {
            if (r1 == 0) goto L15
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lf
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "the destination must exist and point to a directory: "
            defpackage.e41.w(r1, r0)
            return
        L15:
            java.lang.String r1 = "archive and destination must me set"
            defpackage.i.h(r1)
            return
    }

    private static void validateRarPath(java.io.File r1) {
            if (r1 == 0) goto L1f
            boolean r0 = r1.exists()
            if (r0 == 0) goto L19
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "First argument should be a file but was "
            java.lang.String r1 = r1.getAbsolutePath()
            defpackage.e41.A(r1, r0)
            return
        L19:
            java.lang.String r0 = "the archive does not exit: "
            defpackage.e41.w(r1, r0)
            return
        L1f:
            java.lang.String r1 = "archive and destination must me set"
            defpackage.i.h(r1)
            return
    }
}
