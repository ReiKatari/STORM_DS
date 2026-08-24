package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h53  reason: default package */
/* loaded from: classes.dex */
public final class h53 implements defpackage.in6 {
    public final defpackage.fe5 A;
    public final java.util.zip.Inflater B;
    public int L;
    public boolean R;

    public h53(defpackage.fe5 r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            fe5 r0 = r0.A
            in6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r5, long r6) {
            r4 = this;
            r5.getClass()
        L3:
            long r0 = r4.e(r5, r6)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Le
            return r0
        Le:
            java.util.zip.Inflater r0 = r4.B
            boolean r1 = r0.finished()
            if (r1 != 0) goto L2e
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L1d
            goto L2e
        L1d:
            fe5 r0 = r4.A
            boolean r0 = r0.e()
            if (r0 != 0) goto L26
            goto L3
        L26:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "source exhausted prematurely"
            r4.<init>(r5)
            throw r4
        L2e:
            r4 = -1
            return r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.B
            r0.end()
            r0 = 1
            r1.R = r0
            fe5 r1 = r1.A
            r1.close()
            return
    }

    public final long e(defpackage.k80 r8, long r9) {
            r7 = this;
            java.util.zip.Inflater r0 = r7.B
            r8.getClass()
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 < 0) goto L8a
            boolean r4 = r7.R
            if (r4 != 0) goto L84
            if (r3 != 0) goto L12
            goto L7c
        L12:
            r3 = 1
            o96 r3 = r8.j0(r3)     // Catch: java.util.zip.DataFormatException -> L7d
            int r4 = r3.c     // Catch: java.util.zip.DataFormatException -> L7d
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch: java.util.zip.DataFormatException -> L7d
            long r9 = java.lang.Math.min(r9, r4)     // Catch: java.util.zip.DataFormatException -> L7d
            int r9 = (int) r9     // Catch: java.util.zip.DataFormatException -> L7d
            boolean r10 = r0.needsInput()     // Catch: java.util.zip.DataFormatException -> L7d
            fe5 r4 = r7.A
            if (r10 != 0) goto L2a
            goto L44
        L2a:
            boolean r10 = r4.e()     // Catch: java.util.zip.DataFormatException -> L7d
            if (r10 == 0) goto L31
            goto L44
        L31:
            k80 r10 = r4.B     // Catch: java.util.zip.DataFormatException -> L7d
            o96 r10 = r10.A     // Catch: java.util.zip.DataFormatException -> L7d
            r10.getClass()     // Catch: java.util.zip.DataFormatException -> L7d
            int r5 = r10.c     // Catch: java.util.zip.DataFormatException -> L7d
            int r6 = r10.b     // Catch: java.util.zip.DataFormatException -> L7d
            int r5 = r5 - r6
            r7.L = r5     // Catch: java.util.zip.DataFormatException -> L7d
            byte[] r10 = r10.a     // Catch: java.util.zip.DataFormatException -> L7d
            r0.setInput(r10, r6, r5)     // Catch: java.util.zip.DataFormatException -> L7d
        L44:
            byte[] r10 = r3.a     // Catch: java.util.zip.DataFormatException -> L7d
            int r5 = r3.c     // Catch: java.util.zip.DataFormatException -> L7d
            int r9 = r0.inflate(r10, r5, r9)     // Catch: java.util.zip.DataFormatException -> L7d
            int r10 = r7.L     // Catch: java.util.zip.DataFormatException -> L7d
            if (r10 != 0) goto L51
            goto L5f
        L51:
            int r0 = r0.getRemaining()     // Catch: java.util.zip.DataFormatException -> L7d
            int r10 = r10 - r0
            int r0 = r7.L     // Catch: java.util.zip.DataFormatException -> L7d
            int r0 = r0 - r10
            r7.L = r0     // Catch: java.util.zip.DataFormatException -> L7d
            long r5 = (long) r10     // Catch: java.util.zip.DataFormatException -> L7d
            r4.skip(r5)     // Catch: java.util.zip.DataFormatException -> L7d
        L5f:
            if (r9 <= 0) goto L6d
            int r7 = r3.c     // Catch: java.util.zip.DataFormatException -> L7d
            int r7 = r7 + r9
            r3.c = r7     // Catch: java.util.zip.DataFormatException -> L7d
            long r0 = r8.B     // Catch: java.util.zip.DataFormatException -> L7d
            long r9 = (long) r9     // Catch: java.util.zip.DataFormatException -> L7d
            long r0 = r0 + r9
            r8.B = r0     // Catch: java.util.zip.DataFormatException -> L7d
            return r9
        L6d:
            int r7 = r3.b     // Catch: java.util.zip.DataFormatException -> L7d
            int r9 = r3.c     // Catch: java.util.zip.DataFormatException -> L7d
            if (r7 != r9) goto L7c
            o96 r7 = r3.a()     // Catch: java.util.zip.DataFormatException -> L7d
            r8.A = r7     // Catch: java.util.zip.DataFormatException -> L7d
            defpackage.r96.a(r3)     // Catch: java.util.zip.DataFormatException -> L7d
        L7c:
            return r1
        L7d:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L84:
            java.lang.String r7 = "closed"
            defpackage.i.m(r7)
            return r1
        L8a:
            java.lang.String r7 = "byteCount < 0: "
            java.lang.String r7 = defpackage.lb1.h(r9, r7)
            defpackage.i.f(r7)
            return r1
    }
}
