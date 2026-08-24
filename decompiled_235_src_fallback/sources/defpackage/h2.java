package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h2  reason: default package */
/* loaded from: classes.dex */
public final class h2 extends defpackage.d2 {
    public static defpackage.h2 c;

    @Override // defpackage.d2
    public final int[] f(int r5) {
            r4 = this;
            java.lang.String r0 = r4.j()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L3d
        Lb:
            if (r5 < r0) goto Le
            goto L3d
        Le:
            if (r5 >= 0) goto L11
            r5 = 0
        L11:
            if (r5 >= r0) goto L3b
            java.lang.String r1 = r4.j()
            char r1 = r1.charAt(r5)
            r2 = 10
            if (r1 != r2) goto L3b
            java.lang.String r1 = r4.j()
            char r1 = r1.charAt(r5)
            if (r1 == r2) goto L38
            if (r5 == 0) goto L3b
            java.lang.String r1 = r4.j()
            int r3 = r5 + (-1)
            char r1 = r1.charAt(r3)
            if (r1 != r2) goto L38
            goto L3b
        L38:
            int r5 = r5 + 1
            goto L11
        L3b:
            if (r5 < r0) goto L3f
        L3d:
            r4 = 0
            return r4
        L3f:
            int r1 = r5 + 1
        L41:
            if (r1 >= r0) goto L4c
            boolean r2 = r4.s(r1)
            if (r2 != 0) goto L4c
            int r1 = r1 + 1
            goto L41
        L4c:
            int[] r4 = r4.i(r5, r1)
            return r4
    }

    @Override // defpackage.d2
    public final int[] q(int r5) {
            r4 = this;
            java.lang.String r0 = r4.j()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L2c
        Lb:
            if (r5 > 0) goto Le
            goto L2c
        Le:
            if (r5 <= r0) goto L11
            r5 = r0
        L11:
            r0 = 10
            if (r5 <= 0) goto L2a
            java.lang.String r1 = r4.j()
            int r2 = r5 + (-1)
            char r1 = r1.charAt(r2)
            if (r1 != r0) goto L2a
            boolean r1 = r4.s(r5)
            if (r1 != 0) goto L2a
            int r5 = r5 + (-1)
            goto L11
        L2a:
            if (r5 > 0) goto L2e
        L2c:
            r4 = 0
            return r4
        L2e:
            int r1 = r5 + (-1)
        L30:
            if (r1 <= 0) goto L4e
            java.lang.String r2 = r4.j()
            char r2 = r2.charAt(r1)
            if (r2 == r0) goto L4b
            if (r1 == 0) goto L4e
            java.lang.String r2 = r4.j()
            int r3 = r1 + (-1)
            char r2 = r2.charAt(r3)
            if (r2 != r0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + (-1)
            goto L30
        L4e:
            int[] r4 = r4.i(r1, r5)
            return r4
    }

    public final boolean s(int r3) {
            r2 = this;
            if (r3 <= 0) goto L26
            java.lang.String r0 = r2.j()
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            r1 = 10
            if (r0 == r1) goto L26
            java.lang.String r0 = r2.j()
            int r0 = r0.length()
            if (r3 == r0) goto L24
            java.lang.String r2 = r2.j()
            char r2 = r2.charAt(r3)
            if (r2 != r1) goto L26
        L24:
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }
}
