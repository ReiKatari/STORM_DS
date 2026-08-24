package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa0  reason: default package */
/* loaded from: classes.dex */
public final class qa0 implements defpackage.in6 {
    public boolean A;
    public final /* synthetic */ defpackage.z80 B;
    public final /* synthetic */ defpackage.ka0 L;
    public final /* synthetic */ defpackage.ee5 R;

    public qa0(defpackage.z80 r1, defpackage.ka0 r2, defpackage.ee5 r3) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            z80 r0 = r0.B
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r10, long r11) {
            r9 = this;
            r10.getClass()
            r1 = 1
            z80 r0 = r9.B     // Catch: java.io.IOException -> L2a
            long r6 = r0.b0(r10, r11)     // Catch: java.io.IOException -> L2a
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            ee5 r8 = r9.R
            if (r0 != 0) goto L1c
            boolean r10 = r9.A
            if (r10 != 0) goto L1b
            r9.A = r1
            r8.close()
        L1b:
            return r11
        L1c:
            k80 r3 = r8.B
            long r11 = r10.B
            long r4 = r11 - r6
            r2 = r10
            r2.n(r3, r4, r6)
            r8.e()
            return r6
        L2a:
            r0 = move-exception
            r10 = r0
            boolean r11 = r9.A
            if (r11 != 0) goto L37
            r9.A = r1
            ka0 r9 = r9.L
            r9.a()
        L37:
            throw r10
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 != 0) goto L1d
            java.util.TimeZone r0 = defpackage.az7.a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r0 = 100
            boolean r0 = defpackage.az7.g(r1, r0)     // Catch: java.io.IOException -> L12
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L1d
            r0 = 1
            r1.A = r0
            ka0 r0 = r1.L
            r0.a()
        L1d:
            z80 r1 = r1.B
            r1.close()
            return
    }
}
