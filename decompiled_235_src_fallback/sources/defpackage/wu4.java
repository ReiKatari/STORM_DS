package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu4  reason: default package */
/* loaded from: classes.dex */
public final class wu4 implements defpackage.in6 {
    public final defpackage.z80 A;
    public final defpackage.k80 B;
    public defpackage.o96 L;
    public int R;
    public boolean X;
    public long Y;

    public wu4(defpackage.z80 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            k80 r1 = r1.a()
            r0.B = r1
            o96 r1 = r1.A
            r0.L = r1
            if (r1 == 0) goto L14
            int r1 = r1.b
            goto L15
        L14:
            r1 = -1
        L15:
            r0.R = r1
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            z80 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r9, long r10) {
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.X
            if (r3 != 0) goto L5f
            o96 r3 = r8.L
            k80 r4 = r8.B
            if (r3 == 0) goto L27
            o96 r5 = r4.A
            if (r3 != r5) goto L21
            int r3 = r8.R
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.i.m(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.Y
            r2 = 1
            long r0 = r0 + r2
            z80 r2 = r8.A
            boolean r0 = r2.T(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            o96 r0 = r8.L
            if (r0 != 0) goto L48
            o96 r0 = r4.A
            if (r0 == 0) goto L48
            r8.L = r0
            int r0 = r0.b
            r8.R = r0
        L48:
            long r0 = r4.B
            long r2 = r8.Y
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            k80 r2 = r8.B
            long r4 = r8.Y
            r3 = r9
            r2.n(r3, r4, r6)
            long r9 = r8.Y
            long r9 = r9 + r6
            r8.Y = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.i.m(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.lb1.h(r10, r8)
            defpackage.i.f(r8)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            r0 = 1
            r1.X = r0
            return
    }
}
