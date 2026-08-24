package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss0  reason: default package */
/* loaded from: classes.dex */
public final class ss0 extends java.io.FilterInputStream {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ ss0(java.io.InputStream r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.<init>(r1)
            r0.B = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L32;
                case 1: goto L5;
                case 2: goto L27;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.close()
            return
        L9:
            java.lang.String r0 = "Failed to close 7z archive"
            java.lang.String r1 = "SevenZRomProcessor"
            java.lang.Object r2 = r3.B
            sd6 r2 = (defpackage.sd6) r2
            super.close()     // Catch: java.lang.Throwable -> L1d
            r2.close()     // Catch: java.lang.Exception -> L18
            goto L1c
        L18:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
        L1c:
            return
        L1d:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Exception -> L22
            goto L26
        L22:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L26:
            throw r3
        L27:
            super.close()
            java.lang.Object r3 = r3.B     // Catch: java.lang.Throwable -> L31
            com.github.junrar.Archive r3 = (com.github.junrar.Archive) r3     // Catch: java.lang.Throwable -> L31
            r3.close()     // Catch: java.lang.Throwable -> L31
        L31:
            return
        L32:
            java.lang.Object r0 = r3.B
            java.util.zip.Inflater r0 = (java.util.zip.Inflater) r0
            super.close()     // Catch: java.lang.Throwable -> L3d
            r0.end()
            return
        L3d:
            r3 = move-exception
            r0.end()
            throw r3
    }
}
