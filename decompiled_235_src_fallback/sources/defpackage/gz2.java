package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gz2  reason: default package */
/* loaded from: classes.dex */
public final class gz2 extends defpackage.cz2 {
    public boolean X;

    @Override // defpackage.cz2, defpackage.in6
    public final long b0(defpackage.k80 r4, long r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L2c
            boolean r2 = r3.L
            if (r2 != 0) goto L26
            boolean r0 = r3.X
            r1 = -1
            if (r0 == 0) goto L14
            return r1
        L14:
            long r4 = super.b0(r4, r5)
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L25
            r4 = 1
            r3.X = r4
            yw2 r4 = defpackage.yw2.B
            r3.e(r4)
            return r1
        L25:
            return r4
        L26:
            java.lang.String r3 = "closed"
            defpackage.i.m(r3)
            return r0
        L2c:
            java.lang.String r3 = "byteCount < 0: "
            java.lang.String r3 = defpackage.lb1.h(r5, r3)
            defpackage.i.f(r3)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.X
            if (r0 != 0) goto Le
            yw2 r0 = defpackage.hz2.f
            r1.e(r0)
        Le:
            r0 = 1
            r1.L = r0
            return
    }
}
