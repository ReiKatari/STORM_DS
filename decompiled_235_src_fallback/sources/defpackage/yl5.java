package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl5  reason: default package */
/* loaded from: classes.dex */
public abstract class yl5 implements java.io.Closeable {
    public static final defpackage.xl5 A = null;

    static {
            da0 r0 = defpackage.da0.R
            r0.getClass()
            k80 r1 = new k80
            r1.<init>()
            r1.k0(r0)
            byte[] r0 = r0.A
            int r0 = r0.length
            long r2 = (long) r0
            xl5 r0 = new xl5
            r4 = 0
            r0.<init>(r4, r2, r1)
            defpackage.yl5.A = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            z80 r0 = r0.n()
            defpackage.yy7.b(r0)
            return
    }

    public final byte[] e() {
            r7 = this;
            long r0 = r7.h()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L5a
            z80 r7 = r7.n()
            byte[] r2 = r7.q()     // Catch: java.lang.Throwable -> L1d
            r7.close()     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r3 = move-exception
        L19:
            r6 = r3
            r3 = r2
            r2 = r6
            goto L28
        L1d:
            r2 = move-exception
            if (r7 == 0) goto L28
            r7.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r7 = move-exception
            defpackage.mb3.q(r2, r7)
        L28:
            if (r2 != 0) goto L59
            int r7 = r3.length
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            long r4 = (long) r7
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L37
            goto L58
        L37:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Content-Length ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r7)
            java.lang.String r7 = ") disagree"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7)
            throw r2
        L58:
            return r3
        L59:
            throw r2
        L5a:
            java.lang.String r7 = "Cannot buffer entire body for content length: "
            java.lang.String r7 = defpackage.lb1.h(r0, r7)
            defpackage.e41.i(r7)
            return r3
    }

    public abstract long h();

    public abstract defpackage.n34 k();

    public abstract defpackage.z80 n();

    public final java.lang.String r() {
            r3 = this;
            z80 r0 = r3.n()
            r1 = 0
            n34 r3 = r3.k()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L11
            java.nio.charset.Charset r3 = defpackage.n34.a(r3)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L13
        L11:
            java.nio.charset.Charset r3 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L24
        L13:
            java.nio.charset.Charset r3 = defpackage.az7.f(r0, r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r0.M(r3)     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r1 = move-exception
        L20:
            r2 = r1
            r1 = r3
            r3 = r2
            goto L2f
        L24:
            r3 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            defpackage.mb3.q(r3, r0)
        L2f:
            if (r3 != 0) goto L32
            return r1
        L32:
            throw r3
    }
}
