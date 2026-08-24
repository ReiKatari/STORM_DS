package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa3  reason: default package */
/* loaded from: classes.dex */
public abstract class aa3 {
    public static final java.nio.charset.Charset a = null;
    public static final byte[] b = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            defpackage.aa3.a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r1 = new byte[r0]
            defpackage.aa3.b = r1
            java.nio.ByteBuffer.wrap(r1)
            int r1 = r0 - r0
            int r1 = r1 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 > r0) goto L1e
            return
        L1e:
            ub3 r0 = defpackage.ub3.e()     // Catch: defpackage.ub3 -> L23
            throw r0     // Catch: defpackage.ub3 -> L23
        L23:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static void a(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.x(r1)
            return
    }

    public static int b(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r2 = (int) r2
            return r2
    }

    public static defpackage.pr2 c(java.lang.Object r1, java.lang.Object r2) {
            c1 r1 = (defpackage.c1) r1
            pr2 r1 = (defpackage.pr2) r1
            r1.getClass()
            or2 r0 = defpackage.or2.NEW_BUILDER
            java.lang.Object r0 = r1.f(r0)
            mr2 r0 = (defpackage.mr2) r0
            r0.d(r1)
            c1 r2 = (defpackage.c1) r2
            pr2 r1 = r0.A
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r1.isInstance(r2)
            if (r1 == 0) goto L2a
            pr2 r2 = (defpackage.pr2) r2
            r0.d(r2)
            pr2 r1 = r0.b()
            return r1
        L2a:
            java.lang.String r1 = "mergeFrom(MessageLite) can only merge messages of the same type."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
