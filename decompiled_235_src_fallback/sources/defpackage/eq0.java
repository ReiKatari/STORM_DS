package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq0  reason: default package */
/* loaded from: classes.dex */
public final class eq0 extends defpackage.p55 {
    public static final /* synthetic */ int R = 0;
    public long A;
    public final long B;
    public final long L;

    public eq0(java.io.InputStream r2, java.util.zip.CRC32 r3, long r4, long r6) {
            r1 = this;
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r1.L = r6
            r1.B = r4
            return
    }

    @Override // defpackage.p55
    public final synchronized void e(int r6) {
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L23
            r0 = -1
            if (r6 == r0) goto Lf
            long r1 = r5.A     // Catch: java.lang.Throwable -> Lc
            long r3 = (long) r6     // Catch: java.lang.Throwable -> Lc
            long r1 = r1 + r3
            r5.A = r1     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            throw r6     // Catch: java.lang.Throwable -> L23
        Lf:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            long r1 = r5.L     // Catch: java.lang.Throwable -> L23
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L28
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L23
            long r1 = r5.A     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            long r3 = r5.L     // Catch: java.lang.Throwable -> L23
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2a
            goto L28
        L23:
            r6 = move-exception
            goto L47
        L25:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r6     // Catch: java.lang.Throwable -> L23
        L28:
            if (r6 != r0) goto L45
        L2a:
            long r0 = r5.B     // Catch: java.lang.Throwable -> L23
            java.io.InputStream r6 = r5.in     // Catch: java.lang.Throwable -> L23
            java.util.zip.CheckedInputStream r6 = (java.util.zip.CheckedInputStream) r6     // Catch: java.lang.Throwable -> L23
            java.util.zip.Checksum r6 = r6.getChecksum()     // Catch: java.lang.Throwable -> L23
            long r2 = r6.getValue()     // Catch: java.lang.Throwable -> L23
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            goto L45
        L3d:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "Checksum verification failed."
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r6     // Catch: java.lang.Throwable -> L23
        L45:
            monitor-exit(r5)
            return
        L47:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Le
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> Le
            long r0 = r2.A     // Catch: java.lang.Throwable -> Le
            long r0 = r0 + r3
            r2.A = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
