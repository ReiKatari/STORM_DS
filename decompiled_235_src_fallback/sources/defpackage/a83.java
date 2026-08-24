package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a83  reason: default package */
/* loaded from: classes.dex */
public final class a83 implements defpackage.in6 {
    public final java.io.InputStream A;
    public final defpackage.b67 B;

    public a83(java.io.InputStream r1, defpackage.b67 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            b67 r0 = r0.B
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r4, long r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            return r0
        La:
            if (r2 < 0) goto L59
            b67 r0 = r3.B     // Catch: java.lang.AssertionError -> L4b
            r0.f()     // Catch: java.lang.AssertionError -> L4b
            r0 = 1
            o96 r0 = r4.j0(r0)     // Catch: java.lang.AssertionError -> L4b
            int r1 = r0.c     // Catch: java.lang.AssertionError -> L4b
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L4b
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L4b
            int r5 = (int) r5     // Catch: java.lang.AssertionError -> L4b
            java.io.InputStream r3 = r3.A     // Catch: java.lang.AssertionError -> L4b
            byte[] r6 = r0.a     // Catch: java.lang.AssertionError -> L4b
            int r1 = r0.c     // Catch: java.lang.AssertionError -> L4b
            int r3 = r3.read(r6, r1, r5)     // Catch: java.lang.AssertionError -> L4b
            r5 = -1
            if (r3 != r5) goto L3f
            int r3 = r0.b     // Catch: java.lang.AssertionError -> L4b
            int r5 = r0.c     // Catch: java.lang.AssertionError -> L4b
            if (r3 != r5) goto L3c
            o96 r3 = r0.a()     // Catch: java.lang.AssertionError -> L4b
            r4.A = r3     // Catch: java.lang.AssertionError -> L4b
            defpackage.r96.a(r0)     // Catch: java.lang.AssertionError -> L4b
        L3c:
            r3 = -1
            return r3
        L3f:
            int r5 = r0.c     // Catch: java.lang.AssertionError -> L4b
            int r5 = r5 + r3
            r0.c = r5     // Catch: java.lang.AssertionError -> L4b
            long r5 = r4.B     // Catch: java.lang.AssertionError -> L4b
            long r0 = (long) r3     // Catch: java.lang.AssertionError -> L4b
            long r5 = r5 + r0
            r4.B = r5     // Catch: java.lang.AssertionError -> L4b
            return r0
        L4b:
            r3 = move-exception
            boolean r4 = defpackage.xy7.a(r3)
            if (r4 == 0) goto L58
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r3)
            throw r4
        L58:
            throw r3
        L59:
            java.lang.String r3 = "byteCount < 0: "
            java.lang.String r3 = defpackage.lb1.h(r5, r3)
            defpackage.i.f(r3)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            java.io.InputStream r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
