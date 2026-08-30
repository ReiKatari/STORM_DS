package mj;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Closeable {
    public static final long[] X = new long[64];
    public final rj.b A;
    public final ByteOrder B;
    public long L;
    public int R;

    static {
        for (int i2 = 1; i2 <= 63; i2++) {
            long[] jArr = X;
            jArr[i2] = (jArr[i2 - 1] << 1) + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oj.c, rj.a] */
    public a(InputStream inputStream, ByteOrder byteOrder) {
        int i2 = rj.b.X;
        ?? cVar = new oj.c();
        cVar.f12777h = -1L;
        cVar.f12778i = true;
        cVar.f11054e = new oj.a(inputStream);
        try {
            oj.a aVar = cVar.f11054e;
            if (aVar != null) {
                this.A = new rj.b((InputStream) aVar.f11052e, cVar.f12777h, cVar.f12778i);
                this.B = byteOrder;
                return;
            }
            throw new IllegalStateException("origin == null");
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0 >= r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = r13 - r0;
        r5 = 8 - r0;
        r6 = r4.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        r2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r3 = mj.a.X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r1 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r12.L = ((r3[r0] & r6) << r12.R) | r12.L;
        r0 = (r6 >>> r0) & r3[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        r1 = r12.L << r0;
        r12.L = r1;
        r12.L = r1 | ((r6 >>> r5) & r3[r0]);
        r0 = r3[r5] & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        r2 = r3[r13] & r12.L;
        r12.L = r0;
        r12.R = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
        return i(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(int r13) {
        /*
            r12 = this;
            if (r13 < 0) goto L82
            r0 = 63
            if (r13 > r0) goto L82
        L6:
            int r0 = r12.R
            java.nio.ByteOrder r1 = r12.B
            r2 = 0
            rj.b r4 = r12.A
            if (r0 >= r13) goto L3b
            r5 = 57
            if (r0 >= r5) goto L3b
            int r0 = r4.read()
            long r4 = (long) r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L20
            r0 = -1
            return r0
        L20:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            long r2 = r12.L
            r6 = 8
            if (r1 != r0) goto L30
            int r0 = r12.R
            long r0 = r4 << r0
            long r0 = r0 | r2
            r12.L = r0
            goto L35
        L30:
            long r0 = r2 << r6
            long r0 = r0 | r4
            r12.L = r0
        L35:
            int r0 = r12.R
            int r0 = r0 + r6
            r12.R = r0
            goto L6
        L3b:
            if (r0 >= r13) goto L7d
            int r0 = r13 - r0
            int r5 = 8 - r0
            int r4 = r4.read()
            long r6 = (long) r4
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L4b
            return r6
        L4b:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            long[] r3 = mj.a.X
            if (r1 != r2) goto L62
            r1 = r3[r0]
            long r1 = r1 & r6
            long r8 = r12.L
            int r4 = r12.R
            long r1 = r1 << r4
            long r1 = r1 | r8
            r12.L = r1
            long r0 = r6 >>> r0
            r6 = r3[r5]
            long r0 = r0 & r6
            goto L73
        L62:
            long r1 = r12.L
            long r1 = r1 << r0
            r12.L = r1
            long r8 = r6 >>> r5
            r10 = r3[r0]
            long r8 = r8 & r10
            long r0 = r1 | r8
            r12.L = r0
            r0 = r3[r5]
            long r0 = r0 & r6
        L73:
            long r6 = r12.L
            r2 = r3[r13]
            long r2 = r2 & r6
            r12.L = r0
            r12.R = r5
            return r2
        L7d:
            long r0 = r12.i(r13)
            return r0
        L82:
            java.lang.String r13 = "count must not be negative or greater than 63"
            fj.j.h(r13)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.a.d(int):long");
    }

    public final long i(int i2) {
        long j2;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j10 = this.L;
        long[] jArr = X;
        if (this.B == byteOrder) {
            j2 = j10 & jArr[i2];
            this.L = j10 >>> i2;
        } else {
            j2 = (j10 >> (this.R - i2)) & jArr[i2];
        }
        this.R -= i2;
        return j2;
    }
}
