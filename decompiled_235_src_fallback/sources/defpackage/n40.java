package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n40  reason: default package */
/* loaded from: classes.dex */
public final class n40 implements java.io.Closeable {
    public static final long[] X = null;
    public final defpackage.u60 A;
    public final java.nio.ByteOrder B;
    public long L;
    public int R;

    static {
            r0 = 64
            long[] r0 = new long[r0]
            defpackage.n40.X = r0
            r0 = 1
            r1 = r0
        L8:
            r2 = 63
            if (r1 > r2) goto L1b
            long[] r2 = defpackage.n40.X
            int r3 = r1 + (-1)
            r3 = r2[r3]
            long r3 = r3 << r0
            r5 = 1
            long r3 = r3 + r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto L8
        L1b:
            return
    }

    public n40(java.io.InputStream r5, java.nio.ByteOrder r6) {
            r4 = this;
            r4.<init>()
            int r0 = defpackage.u60.X
            t60 r0 = new t60
            r0.<init>()
            r1 = -1
            r0.w = r1
            r1 = 1
            r0.x = r1
            f1 r1 = new f1
            r1.<init>(r5)
            r0.t = r1
            u60 r5 = new u60     // Catch: java.io.IOException -> L36
            f1 r1 = r0.t     // Catch: java.io.IOException -> L36
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.t     // Catch: java.io.IOException -> L36
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.io.IOException -> L36
            long r2 = r0.w     // Catch: java.io.IOException -> L36
            boolean r0 = r0.x     // Catch: java.io.IOException -> L36
            r5.<init>(r1, r2, r0)     // Catch: java.io.IOException -> L36
            r4.A = r5
            r4.B = r6
            return
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L36
            java.lang.String r5 = "origin == null"
            r4.<init>(r5)     // Catch: java.io.IOException -> L36
            throw r4     // Catch: java.io.IOException -> L36
        L36:
            r4 = move-exception
            java.io.UncheckedIOException r5 = new java.io.UncheckedIOException
            r5.<init>(r4)
            throw r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            u60 r0 = r0.A
            r0.close()
            return
    }

    public final long e(int r13) {
            r12 = this;
            r0 = 0
            if (r13 < 0) goto L82
            r2 = 63
            if (r13 > r2) goto L82
        L8:
            int r2 = r12.R
            java.nio.ByteOrder r3 = r12.B
            u60 r4 = r12.A
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
            long[] r1 = defpackage.n40.X
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
            long r12 = r12.h(r13)
            return r12
        L82:
            java.lang.String r12 = "count must not be negative or greater than 63"
            defpackage.e41.i(r12)
            return r0
    }

    public final long h(int r7) {
            r6 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            long r1 = r6.L
            long[] r3 = defpackage.n40.X
            java.nio.ByteOrder r4 = r6.B
            if (r4 != r0) goto L13
            r4 = r3[r7]
            long r3 = r1 & r4
            long r0 = r1 >>> r7
            r6.L = r0
            goto L1c
        L13:
            int r0 = r6.R
            int r0 = r0 - r7
            long r0 = r1 >> r0
            r2 = r3[r7]
            long r3 = r0 & r2
        L1c:
            int r0 = r6.R
            int r0 = r0 - r7
            r6.R = r0
            return r3
    }
}
