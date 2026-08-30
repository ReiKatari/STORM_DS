package fj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements g0 {
    public final g A;
    public final e B;
    public b0 L;
    public int R;
    public boolean X;
    public long Y;

    public y(g gVar) {
        int i2;
        this.A = gVar;
        e b10 = gVar.b();
        this.B = b10;
        b0 b0Var = b10.A;
        this.L = b0Var;
        if (b0Var != null) {
            i2 = b0Var.f4977b;
        } else {
            i2 = -1;
        }
        this.R = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X = true;
    }

    @Override // fj.g0
    public final i0 f() {
        return this.A.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 == r5.f4977b) goto L14;
     */
    @Override // fj.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(fj.e r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r8.X
            if (r3 != 0) goto L61
            fj.b0 r3 = r8.L
            fj.e r4 = r8.B
            if (r3 == 0) goto L29
            fj.b0 r5 = r4.A
            if (r3 != r5) goto L21
            int r3 = r8.R
            r5.getClass()
            int r5 = r5.f4977b
            if (r3 != r5) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            a0.j.p(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            long r0 = r8.Y
            r2 = 1
            long r0 = r0 + r2
            fj.g r2 = r8.A
            boolean r0 = r2.s(r0)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            fj.b0 r0 = r8.L
            if (r0 != 0) goto L4a
            fj.b0 r0 = r4.A
            if (r0 == 0) goto L4a
            r8.L = r0
            int r0 = r0.f4977b
            r8.R = r0
        L4a:
            long r0 = r4.B
            long r2 = r8.Y
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            fj.e r2 = r8.B
            long r4 = r8.Y
            r3 = r9
            r2.w(r3, r4, r6)
            long r9 = r8.Y
            long r9 = r9 + r6
            r8.Y = r9
            return r6
        L61:
            java.lang.String r9 = "closed"
            a0.j.p(r9)
            goto L26
        L67:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = kc.a.e(r10, r9)
            a0.j.e(r9)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.y.k(fj.e, long):long");
    }
}
