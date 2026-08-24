package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny7  reason: default package */
/* loaded from: classes.dex */
public final class ny7 extends defpackage.ny0 {
    @Override // defpackage.ny0
    public final defpackage.ss0 g(java.io.InputStream r5) {
            r4 = this;
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
            r4.<init>(r5)
        L5:
            java.util.zip.ZipEntry r5 = r4.getNextEntry()
            r0 = 0
            if (r5 != 0) goto Le
            r5 = r0
            goto L21
        Le:
            boolean r1 = r5.isDirectory()
            if (r1 != 0) goto L5
            java.lang.String r1 = r5.getName()
            r1.getClass()
            boolean r1 = defpackage.ny0.i(r1)
            if (r1 == 0) goto L5
        L21:
            if (r5 == 0) goto L39
            ss0 r0 = new ss0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r2)
            hj6 r4 = new hj6
            long r2 = r5.getSize()
            r4.<init>(r2)
            r5 = 1
            r0.<init>(r1, r4, r5)
        L39:
            return r0
    }
}
