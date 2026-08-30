package fj;

import java.util.zip.Inflater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements g0 {
    public final a0 A;
    public final Inflater B;
    public int L;
    public boolean R;

    public q(a0 a0Var, Inflater inflater) {
        this.A = a0Var;
        this.B = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            return;
        }
        this.B.end();
        this.R = true;
        this.A.close();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.A.A.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[SYNTHETIC] */
    @Override // fj.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(fj.e r11, long r12) {
        /*
            r10 = this;
            r11.getClass()
        L3:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb3
            boolean r3 = r10.R
            if (r3 != 0) goto Lab
            fj.a0 r3 = r10.A
            java.util.zip.Inflater r4 = r10.B
            if (r2 != 0) goto L15
        L13:
            r8 = r0
            goto L80
        L15:
            r2 = 1
            fj.b0 r2 = r11.a0(r2)     // Catch: java.util.zip.DataFormatException -> L6e
            int r5 = r2.f4978c     // Catch: java.util.zip.DataFormatException -> L6e
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> L6e
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> L6e
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> L6e
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> L6e
            if (r6 != 0) goto L2b
            goto L45
        L2b:
            boolean r6 = r3.d()     // Catch: java.util.zip.DataFormatException -> L6e
            if (r6 == 0) goto L32
            goto L45
        L32:
            fj.e r6 = r3.B     // Catch: java.util.zip.DataFormatException -> L6e
            fj.b0 r6 = r6.A     // Catch: java.util.zip.DataFormatException -> L6e
            r6.getClass()     // Catch: java.util.zip.DataFormatException -> L6e
            int r7 = r6.f4978c     // Catch: java.util.zip.DataFormatException -> L6e
            int r8 = r6.f4977b     // Catch: java.util.zip.DataFormatException -> L6e
            int r7 = r7 - r8
            r10.L = r7     // Catch: java.util.zip.DataFormatException -> L6e
            byte[] r6 = r6.f4976a     // Catch: java.util.zip.DataFormatException -> L6e
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L6e
        L45:
            byte[] r6 = r2.f4976a     // Catch: java.util.zip.DataFormatException -> L6e
            int r7 = r2.f4978c     // Catch: java.util.zip.DataFormatException -> L6e
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> L6e
            int r6 = r10.L     // Catch: java.util.zip.DataFormatException -> L6e
            if (r6 != 0) goto L52
            goto L60
        L52:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> L6e
            int r6 = r6 - r7
            int r7 = r10.L     // Catch: java.util.zip.DataFormatException -> L6e
            int r7 = r7 - r6
            r10.L = r7     // Catch: java.util.zip.DataFormatException -> L6e
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L6e
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> L6e
        L60:
            if (r5 <= 0) goto L70
            int r6 = r2.f4978c     // Catch: java.util.zip.DataFormatException -> L6e
            int r6 = r6 + r5
            r2.f4978c = r6     // Catch: java.util.zip.DataFormatException -> L6e
            long r6 = r11.B     // Catch: java.util.zip.DataFormatException -> L6e
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> L6e
            long r6 = r6 + r8
            r11.B = r6     // Catch: java.util.zip.DataFormatException -> L6e
            goto L80
        L6e:
            r11 = move-exception
            goto La5
        L70:
            int r5 = r2.f4977b     // Catch: java.util.zip.DataFormatException -> L6e
            int r6 = r2.f4978c     // Catch: java.util.zip.DataFormatException -> L6e
            if (r5 != r6) goto L13
            fj.b0 r5 = r2.a()     // Catch: java.util.zip.DataFormatException -> L6e
            r11.A = r5     // Catch: java.util.zip.DataFormatException -> L6e
            fj.c0.a(r2)     // Catch: java.util.zip.DataFormatException -> L6e
            goto L13
        L80:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L85
            return r8
        L85:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La2
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L92
            goto La2
        L92:
            boolean r0 = r3.d()
            if (r0 != 0) goto L9a
            goto L3
        L9a:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La2:
            r11 = -1
            return r11
        La5:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lab:
            java.lang.String r11 = "closed"
            a0.j.p(r11)
        Lb0:
            r11 = 0
            return r11
        Lb3:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = kc.a.e(r12, r11)
            a0.j.e(r11)
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.q.k(fj.e, long):long");
    }
}
