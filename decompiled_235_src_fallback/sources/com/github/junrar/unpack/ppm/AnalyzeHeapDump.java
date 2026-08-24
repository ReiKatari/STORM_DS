package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AnalyzeHeapDump {
    private static final defpackage.ry3 logger = null;

    static {
            java.lang.Class<com.github.junrar.rarfile.MainHeader> r0 = com.github.junrar.rarfile.MainHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger = r0
            return
    }

    public AnalyzeHeapDump() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r14) {
            java.lang.String r14 = ""
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "P:\\test\\heapdumpc"
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "P:\\test\\heapdumpj"
            r1.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L20
            ry3 r14 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            java.lang.String r0 = r0.getAbsolutePath()
            r14.u(r0)
            return
        L20:
            boolean r2 = r1.exists()
            if (r2 != 0) goto L30
            ry3 r14 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            java.lang.String r0 = r1.getAbsolutePath()
            r14.u(r0)
            return
        L30:
            long r2 = r0.length()
            long r4 = r1.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L55
            ry3 r6 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            java.lang.String r7 = "File size mismatch"
            r6.o(r7)
            java.lang.String r7 = "clen = {}"
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r6.b(r8, r7)
            java.lang.String r7 = "jlen = {}"
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            r6.b(r8, r7)
        L55:
            long r2 = java.lang.Math.min(r2, r4)
            r4 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.<init>(r6, r0)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc2
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc2
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc2
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc2
            r0 = 0
            r4 = 0
            r7 = 1
            r8 = r0
            r11 = r4
            r10 = r7
        L77:
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L9c
            int r12 = r5.read()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            int r13 = r6.read()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            if (r12 == r13) goto L8b
            if (r10 == 0) goto L98
            r8 = r0
            r10 = r4
            r11 = r7
            goto L98
        L8b:
            if (r10 != 0) goto L98
            printMismatch(r8, r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r10 = r7
            goto L98
        L92:
            r0 = move-exception
        L93:
            r4 = r5
            goto Ld7
        L95:
            r0 = move-exception
        L96:
            r4 = r5
            goto Lca
        L98:
            r12 = 1
            long r0 = r0 + r12
            goto L77
        L9c:
            if (r10 != 0) goto La1
            printMismatch(r8, r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
        La1:
            if (r11 != 0) goto Laa
            ry3 r0 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.lang.String r1 = "Files are identical"
            r0.o(r1)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
        Laa:
            ry3 r0 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            java.lang.String r1 = "Done"
            r0.o(r1)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L95
            r5.close()     // Catch: java.io.IOException -> Lb8
            r6.close()     // Catch: java.io.IOException -> Lb8
            return
        Lb8:
            r0 = move-exception
            ry3 r1 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            r1.v(r14, r0)
            goto Ld5
        Lbf:
            r0 = move-exception
            r6 = r4
            goto L93
        Lc2:
            r0 = move-exception
            r6 = r4
            goto L96
        Lc5:
            r0 = move-exception
            r6 = r4
            goto Ld7
        Lc8:
            r0 = move-exception
            r6 = r4
        Lca:
            ry3 r1 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger     // Catch: java.lang.Throwable -> Ld6
            r1.v(r14, r0)     // Catch: java.lang.Throwable -> Ld6
            r4.close()     // Catch: java.io.IOException -> Lb8
            r6.close()     // Catch: java.io.IOException -> Lb8
        Ld5:
            return
        Ld6:
            r0 = move-exception
        Ld7:
            r4.close()     // Catch: java.io.IOException -> Lde
            r6.close()     // Catch: java.io.IOException -> Lde
            goto Le4
        Lde:
            r1 = move-exception
            ry3 r2 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            r2.v(r14, r1)
        Le4:
            throw r0
    }

    private static void printMismatch(long r3, long r5) {
            ry3 r0 = com.github.junrar.unpack.ppm.AnalyzeHeapDump.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L1c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r2 = java.lang.Long.toHexString(r3)
            long r5 = r5 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r2, r3}
            r0.x(r3)
        L1c:
            return
    }
}
