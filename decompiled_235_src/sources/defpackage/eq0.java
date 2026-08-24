package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq0  reason: default package */
/* loaded from: classes.dex */
public final class eq0 extends p55 {
    public static final /* synthetic */ int R = 0;
    public long A;
    public final long B;
    public final long L;

    public eq0(InputStream inputStream, CRC32 crc32, long j, long j2) {
        super(new CheckedInputStream(inputStream, crc32));
        this.L = j2;
        this.B = j;
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
    @Override // defpackage.p55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(int i) {
        synchronized (this) {
            if (i != -1) {
                this.A += i;
            }
        }
        return;
        if (this.L > 0) {
            synchronized (this) {
                long j = this.A;
            }
        }
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        skip = ((FilterInputStream) this).in.skip(j);
        this.A += skip;
        return skip;
    }
}
