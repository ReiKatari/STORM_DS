package rj;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends g {
    public static final /* synthetic */ int R = 0;
    public long A;
    public final long B;
    public final long L;

    public d(InputStream inputStream, CRC32 crc32, long j2, long j10) {
        super(new CheckedInputStream(inputStream, crc32));
        this.L = j10;
        this.B = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
        if (r1 < r5.L) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
        if (r6 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if (r5.B != ((java.util.zip.CheckedInputStream) ((java.io.FilterInputStream) r5).in).getChecksum().getValue()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
        throw new java.io.IOException("Checksum verification failed.");
     */
    @Override // rj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(int r6) {
        /*
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
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.d.d(int):void");
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j2) {
        long skip;
        skip = ((FilterInputStream) this).in.skip(j2);
        this.A += skip;
        return skip;
    }
}
