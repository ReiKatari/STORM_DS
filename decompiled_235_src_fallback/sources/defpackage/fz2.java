package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz2  reason: default package */
/* loaded from: classes.dex */
public final class fz2 extends defpackage.cz2 {
    public long X;
    public final /* synthetic */ defpackage.hz2 Y;

    public fz2(defpackage.hz2 r1, defpackage.i03 r2, long r3) {
            r0 = this;
            r2.getClass()
            r0.Y = r1
            r0.<init>(r1, r2)
            r0.X = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L15
            yw2 r1 = defpackage.yw2.B
            r0.e(r1)
        L15:
            return
    }

    @Override // defpackage.cz2, defpackage.in6
    public final long b0(defpackage.k80 r8, long r9) {
            r7 = this;
            r8.getClass()
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L4b
            boolean r2 = r7.L
            if (r2 != 0) goto L45
            long r2 = r7.X
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r5 = -1
            if (r4 != 0) goto L16
            return r5
        L16:
            long r9 = java.lang.Math.min(r2, r9)
            long r8 = super.b0(r8, r9)
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r7.X
            long r2 = r2 - r8
            r7.X = r2
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L30
            yw2 r10 = defpackage.yw2.B
            r7.e(r10)
        L30:
            return r8
        L31:
            hz2 r8 = r7.Y
            u62 r8 = r8.b
            r8.e()
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "unexpected end of stream"
            r8.<init>(r9)
            yw2 r9 = defpackage.hz2.f
            r7.e(r9)
            throw r8
        L45:
            java.lang.String r7 = "closed"
            defpackage.i.m(r7)
            return r0
        L4b:
            java.lang.String r7 = "byteCount < 0: "
            java.lang.String r7 = defpackage.lb1.h(r9, r7)
            defpackage.i.f(r7)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.L
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r4.X
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            java.util.TimeZone r0 = defpackage.az7.a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r0 = 100
            boolean r0 = defpackage.az7.g(r4, r0)     // Catch: java.io.IOException -> L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L2a
            hz2 r0 = r4.Y
            u62 r0 = r0.b
            r0.e()
            yw2 r0 = defpackage.hz2.f
            r4.e(r0)
        L2a:
            r0 = 1
            r4.L = r0
            return
    }
}
