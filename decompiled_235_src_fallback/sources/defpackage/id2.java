package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id2  reason: default package */
/* loaded from: classes.dex */
public final class id2 extends defpackage.kk2 {
    public final long B;
    public final boolean L;
    public long R;

    public id2(defpackage.in6 r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.B = r2
            r0.L = r4
            return
    }

    @Override // defpackage.kk2, defpackage.in6
    public final long b0(defpackage.k80 r10, long r11) {
            r9 = this;
            r10.getClass()
            long r0 = r9.R
            long r2 = r9.B
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = -1
            r7 = 0
            if (r4 <= 0) goto L11
            r11 = r7
            goto L20
        L11:
            boolean r4 = r9.L
            if (r4 == 0) goto L20
            long r0 = r2 - r0
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L1c
            return r5
        L1c:
            long r11 = java.lang.Math.min(r11, r0)
        L20:
            in6 r0 = r9.A
            long r11 = r0.b0(r10, r11)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L2f
            long r4 = r9.R
            long r4 = r4 + r11
            r9.R = r4
        L2f:
            long r4 = r9.R
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L37
            if (r0 == 0) goto L39
        L37:
            if (r1 <= 0) goto L68
        L39:
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 <= 0) goto L51
            if (r1 <= 0) goto L51
            long r11 = r10.B
            long r4 = r4 - r2
            long r11 = r11 - r4
            k80 r0 = new k80
            r0.<init>()
            r0.m0(r10)
            r10.O(r0, r11)
            r0.e()
        L51:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "expected "
            java.lang.String r12 = " bytes but got "
            java.lang.StringBuilder r11 = defpackage.xg6.s(r2, r11, r12)
            long r0 = r9.R
            r11.append(r0)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L68:
            return r11
    }
}
