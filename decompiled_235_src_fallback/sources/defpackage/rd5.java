package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd5  reason: default package */
/* loaded from: classes.dex */
public final class rd5 extends defpackage.ny0 {
    @Override // defpackage.ny0
    public final defpackage.ss0 g(java.io.InputStream r6) {
            r5 = this;
            r5 = 0
            com.github.junrar.Archive r0 = new com.github.junrar.Archive     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            java.util.List r6 = r0.getFileHeaders()     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L36
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3d
        L10:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L32
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L3d
            r2 = r1
            com.github.junrar.rarfile.FileHeader r2 = (com.github.junrar.rarfile.FileHeader) r2     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L10
            java.lang.String r2 = r2.getFileName()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
            java.lang.String r2 = ""
        L2b:
            boolean r2 = defpackage.ny0.i(r2)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L10
            goto L33
        L32:
            r1 = r5
        L33:
            com.github.junrar.rarfile.FileHeader r1 = (com.github.junrar.rarfile.FileHeader) r1     // Catch: java.lang.Throwable -> L3d
            goto L37
        L36:
            r1 = r5
        L37:
            if (r1 != 0) goto L3f
            r0.close()     // Catch: java.lang.Throwable -> L3d
            return r5
        L3d:
            r6 = move-exception
            goto L6b
        L3f:
            ss0 r6 = new ss0     // Catch: java.lang.Throwable -> L3d
            java.io.InputStream r2 = r0.getInputStream(r1)     // Catch: java.lang.Throwable -> L3d
            r2.getClass()     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r2 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L4f
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2     // Catch: java.lang.Throwable -> L3d
            goto L57
        L4f:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3d
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3d
            r2 = r3
        L57:
            r3 = 2
            r6.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L3d
            ss0 r0 = new ss0     // Catch: java.lang.Throwable -> L3d
            hj6 r2 = new hj6     // Catch: java.lang.Throwable -> L3d
            long r3 = r1.getFullUnpackSize()     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            r1 = 1
            r0.<init>(r6, r2, r1)     // Catch: java.lang.Throwable -> L3d
            return r0
        L6b:
            r6.printStackTrace()
            return r5
    }
}
