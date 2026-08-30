package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tl4  reason: default package */
/* loaded from: classes.dex */
public final class tl4 implements sb6 {
    public final u60 A;
    public final f60 B;
    public cy5 L;
    public int R;
    public boolean X;
    public long Y;

    public tl4(u60 u60Var) {
        int i;
        this.A = u60Var;
        f60 b = u60Var.b();
        this.B = b;
        cy5 cy5Var = b.A;
        this.L = cy5Var;
        if (cy5Var != null) {
            i = cy5Var.b;
        } else {
            i = -1;
        }
        this.R = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 == r5.b) goto L14;
     */
    @Override // defpackage.sb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.f60 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.X
            if (r3 != 0) goto L5f
            cy5 r3 = r8.L
            f60 r4 = r8.B
            if (r3 == 0) goto L27
            cy5 r5 = r4.A
            if (r3 != r5) goto L21
            int r3 = r8.R
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.i.n(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.Y
            r2 = 1
            long r0 = r0 + r2
            u60 r2 = r8.A
            boolean r0 = r2.u(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            cy5 r0 = r8.L
            if (r0 != 0) goto L48
            cy5 r0 = r4.A
            if (r0 == 0) goto L48
            r8.L = r0
            int r0 = r0.b
            r8.R = r0
        L48:
            long r0 = r4.B
            long r2 = r8.Y
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            f60 r2 = r8.B
            long r4 = r8.Y
            r3 = r9
            r2.B(r3, r4, r6)
            long r9 = r8.Y
            long r9 = r9 + r6
            r8.Y = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.i.n(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.wh1.h(r10, r8)
            defpackage.i.g(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl4.L(f60, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X = true;
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.A.f();
    }
}
