package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek5  reason: default package */
/* loaded from: classes.dex */
public final class ek5 extends defpackage.a55 {
    public int g0;
    public final long h0;

    public ek5(defpackage.o45 r3, defpackage.e55 r4, long r5, defpackage.wb6 r7) {
            r2 = this;
            r7.getClass()
            r2.<init>(r3, r4, r7)
            r3 = -1
            r2.g0 = r3
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 != 0) goto L23
            q45 r3 = defpackage.q45.DEFAULT
            int r3 = r4.b(r3)
            if (r3 < 0) goto L1a
            long r3 = (long) r3
            long r5 = -r3
            goto L23
        L1a:
            java.lang.String r2 = "Expected positive length for "
            java.lang.String r4 = ", but got "
            defpackage.u34.k(r2, r7, r4, r3)
            r2 = 0
            throw r2
        L23:
            r2.h0 = r5
            return
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(defpackage.wb6 r9) {
            r8 = this;
            r9.getClass()
            r0 = 0
            long r2 = r8.h0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r0 = r8.g0
            e55 r1 = r8.R
            r4 = -1
            r5 = 1
            if (r9 <= 0) goto L3c
            if (r0 != r4) goto L16
            int r9 = r1.b
            goto L1a
        L16:
            int r9 = r1.l()
        L1a:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r2 & r6
            int r0 = (int) r2
            if (r9 != r0) goto L27
            int r9 = r8.g0
            int r9 = r9 + r5
            r8.g0 = r9
            return r9
        L27:
            r1.d = r5
            int r8 = r1.b
            int r8 = r8 << 3
            x45 r9 = r1.c
            int r9 = r9.getTypeId()
            r8 = r8 | r9
            int r9 = r1.e
            r1.n(r9)
            r1.e = r8
            return r4
        L3c:
            long r2 = -r2
            int r0 = r0 + r5
            r8.g0 = r0
            long r8 = (long) r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L54
            boolean r8 = r1.d
            if (r8 != 0) goto L53
            r90 r8 = r1.a
            int r9 = r8.A
            int r8 = r8.B
            int r9 = r9 - r8
            if (r9 != 0) goto L53
            return r4
        L53:
            return r0
        L54:
            return r4
    }

    @Override // defpackage.a55
    public final long x0(defpackage.wb6 r3, int r4) {
            r2 = this;
            r3.getClass()
            r3 = 0
            long r0 = r2.h0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lc
            return r0
        Lc:
            r2 = 19500(0x4c2c, double:9.6343E-320)
            return r2
    }
}
