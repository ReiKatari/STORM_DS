package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md5  reason: default package */
/* loaded from: classes.dex */
public abstract class md5 {
    public static final defpackage.i1 A = null;

    static {
            java.lang.Integer r0 = defpackage.hc3.a
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto Ld
            goto L13
        Ld:
            o92 r0 = new o92
            r0.<init>()
            goto L18
        L13:
            iy4 r0 = new iy4
            r0.<init>()
        L18:
            defpackage.md5.A = r0
            return
    }

    public md5() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a(int r1);

    public byte[] b(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            byte[] r1 = r1.c(r2, r0)
            return r1
    }

    public byte[] c(byte[] r8, int r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 0
            if (r0 < 0) goto L55
            if (r9 < 0) goto L55
            int r0 = r8.length
            if (r9 > r0) goto L55
            if (r9 < 0) goto L49
            int r0 = r9 / 4
            r1 = 0
            r2 = r1
            r3 = r2
        L10:
            if (r2 >= r0) goto L33
            int r4 = r7.d()
            byte r5 = (byte) r4
            r8[r3] = r5
            int r5 = r3 + 1
            int r6 = r4 >>> 8
            byte r6 = (byte) r6
            r8[r5] = r6
            int r5 = r3 + 2
            int r6 = r4 >>> 16
            byte r6 = (byte) r6
            r8[r5] = r6
            int r5 = r3 + 3
            int r4 = r4 >>> 24
            byte r4 = (byte) r4
            r8[r5] = r4
            int r3 = r3 + 4
            int r2 = r2 + 1
            goto L10
        L33:
            int r9 = r9 - r3
            int r0 = r9 * 8
            int r7 = r7.a(r0)
        L3a:
            if (r1 >= r9) goto L48
            int r0 = r3 + r1
            int r2 = r1 * 8
            int r2 = r7 >>> r2
            byte r2 = (byte) r2
            r8[r0] = r2
            int r1 = r1 + 1
            goto L3a
        L48:
            return r8
        L49:
            java.lang.String r7 = "fromIndex (0) must be not greater than toIndex ("
            java.lang.String r8 = ")."
            java.lang.String r7 = defpackage.lb1.k(r7, r9, r8)
            defpackage.i.f(r7)
            return r1
        L55:
            java.lang.String r7 = "fromIndex (0) or toIndex ("
            java.lang.String r0 = ") are out of range: 0.."
            java.lang.StringBuilder r7 = defpackage.xg6.t(r7, r9, r0)
            int r8 = r8.length
            r9 = 46
            java.lang.String r7 = defpackage.xg6.q(r7, r8, r9)
            defpackage.i.f(r7)
            return r1
    }

    public abstract int d();
}
