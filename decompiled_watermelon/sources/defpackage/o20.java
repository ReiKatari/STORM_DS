package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o20  reason: default package */
/* loaded from: classes.dex */
public final class o20 implements Closeable {
    public static final long[] X = new long[64];
    public final r40 A;
    public final ByteOrder B;
    public long L;
    public int R;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = X;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v1, q40] */
    public o20(InputStream inputStream, ByteOrder byteOrder) {
        int i = r40.X;
        ?? v1Var = new v1();
        v1Var.x = -1L;
        v1Var.y = true;
        v1Var.u = new e1(inputStream);
        try {
            e1 e1Var = v1Var.u;
            if (e1Var != null) {
                this.A = new r40((InputStream) e1Var.u, v1Var.x, v1Var.y);
                this.B = byteOrder;
                return;
            }
            throw new IllegalStateException("origin == null");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r2 >= r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        r2 = r13 - r2;
        r5 = 8 - r2;
        r6 = r4.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r6 >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        r0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r1 = defpackage.o20.X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r3 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r12.L = ((r1[r2] & r6) << r12.R) | r12.L;
        r2 = (r6 >>> r2) & r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        r3 = r12.L << r2;
        r12.L = r3;
        r12.L = r3 | ((r6 >>> r5) & r1[r2]);
        r2 = r1[r5] & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0 = r1[r13] & r12.L;
        r12.L = r2;
        r12.R = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        return i(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(int r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 < 0) goto L82
            r2 = 63
            if (r13 > r2) goto L82
        L8:
            int r2 = r12.R
            java.nio.ByteOrder r3 = r12.B
            r40 r4 = r12.A
            if (r2 >= r13) goto L3b
            r5 = 57
            if (r2 >= r5) goto L3b
            int r2 = r4.read()
            long r4 = (long) r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L20
            r12 = -1
            return r12
        L20:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            long r6 = r12.L
            r8 = 8
            if (r3 != r2) goto L30
            int r2 = r12.R
            long r2 = r4 << r2
            long r2 = r2 | r6
            r12.L = r2
            goto L35
        L30:
            long r2 = r6 << r8
            long r2 = r2 | r4
            r12.L = r2
        L35:
            int r2 = r12.R
            int r2 = r2 + r8
            r12.R = r2
            goto L8
        L3b:
            if (r2 >= r13) goto L7d
            int r2 = r13 - r2
            int r5 = 8 - r2
            int r4 = r4.read()
            long r6 = (long) r4
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4b
            return r6
        L4b:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            long[] r1 = defpackage.o20.X
            if (r3 != r0) goto L62
            r3 = r1[r2]
            long r3 = r3 & r6
            long r8 = r12.L
            int r0 = r12.R
            long r3 = r3 << r0
            long r3 = r3 | r8
            r12.L = r3
            long r2 = r6 >>> r2
            r6 = r1[r5]
            long r2 = r2 & r6
            goto L73
        L62:
            long r3 = r12.L
            long r3 = r3 << r2
            r12.L = r3
            long r8 = r6 >>> r5
            r10 = r1[r2]
            long r8 = r8 & r10
            long r2 = r3 | r8
            r12.L = r2
            r2 = r1[r5]
            long r2 = r2 & r6
        L73:
            long r6 = r12.L
            r0 = r1[r13]
            long r0 = r0 & r6
            r12.L = r2
            r12.R = r5
            return r0
        L7d:
            long r12 = r12.i(r13)
            return r12
        L82:
            java.lang.String r12 = "count must not be negative or greater than 63"
            defpackage.f81.j(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o20.d(int):long");
    }

    public final long i(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.L;
        long[] jArr = X;
        if (this.B == byteOrder) {
            j = j2 & jArr[i];
            this.L = j2 >>> i;
        } else {
            j = (j2 >> (this.R - i)) & jArr[i];
        }
        this.R -= i;
        return j;
    }
}
