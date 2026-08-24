package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n40  reason: default package */
/* loaded from: classes.dex */
public final class n40 implements Closeable {
    public static final long[] X = new long[64];
    public final u60 A;
    public final ByteOrder B;
    public long L;
    public int R;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = X;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w1, t60] */
    public n40(InputStream inputStream, ByteOrder byteOrder) {
        int i = u60.X;
        ?? w1Var = new w1();
        w1Var.w = -1L;
        w1Var.x = true;
        w1Var.t = new f1(inputStream);
        try {
            f1 f1Var = w1Var.t;
            if (f1Var != null) {
                this.A = new u60((InputStream) f1Var.t, w1Var.w, w1Var.x);
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
        r1 = defpackage.n40.X;
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
        return h(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(int i) {
        if (i < 0 || i > 63) {
            e41.i("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            int i2 = this.R;
            ByteOrder byteOrder = this.B;
            u60 u60Var = this.A;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long read = u60Var.read();
            if (read < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j = this.L;
            if (byteOrder == byteOrder2) {
                this.L = (read << this.R) | j;
            } else {
                this.L = (j << 8) | read;
            }
            this.R += 8;
        }
    }

    public final long h(int i) {
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
