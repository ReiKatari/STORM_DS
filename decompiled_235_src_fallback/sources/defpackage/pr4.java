package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr4  reason: default package */
/* loaded from: classes.dex */
public abstract class pr4 {
    public static final defpackage.or4 a = null;
    public static final defpackage.cr4 b = null;

    static {
            or4 r11 = new or4
            r0 = 0
            r11.<init>(r0)
            defpackage.pr4.a = r11
            lo4 r4 = defpackage.lo4.Horizontal
            cs1 r8 = defpackage.cs1.l0
            jp3 r9 = new jp3
            r1 = 2
            r9.<init>(r1)
            vt1 r1 = defpackage.vt1.A
            o41 r10 = defpackage.g04.i(r1)
            r1 = 15
            long r12 = defpackage.s21.b(r0, r0, r0, r0, r1)
            cr4 r0 = new cr4
            r6 = 0
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            defpackage.pr4.b = r0
            return
    }

    public static final long a(defpackage.cr4 r6, int r7) {
            int r0 = r6.c
            int r1 = r6.b
            int r1 = r1 + r0
            long r2 = (long) r7
            long r4 = (long) r1
            long r2 = r2 * r4
            int r7 = r6.f
            int r7 = -r7
            long r4 = (long) r7
            long r2 = r2 + r4
            int r7 = r6.d
            long r4 = (long) r7
            long r2 = r2 + r4
            long r0 = (long) r0
            long r2 = r2 - r0
            lo4 r7 = r6.e
            lo4 r0 = defpackage.lo4.Horizontal
            if (r7 != r0) goto L22
            long r0 = r6.e()
            r7 = 32
            long r0 = r0 >> r7
        L20:
            int r7 = (int) r0
            goto L2d
        L22:
            long r0 = r6.e()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            goto L20
        L2d:
            cs1 r6 = r6.n
            r6.getClass()
            r6 = 0
            int r6 = defpackage.gi2.q(r6, r6, r7)
            int r7 = r7 - r6
            long r6 = (long) r7
            long r2 = r2 - r6
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L41
            return r6
        L41:
            return r2
    }
}
