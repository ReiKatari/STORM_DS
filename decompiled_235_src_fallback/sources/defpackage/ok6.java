package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok6  reason: default package */
/* loaded from: classes.dex */
public abstract class ok6 {
    public static final int a(java.util.ArrayList r0, int r1, int r2) {
            int r0 = e(r0, r1, r2)
            if (r0 < 0) goto L7
            return r0
        L7:
            int r0 = r0 + 1
            int r0 = -r0
            return r0
    }

    public static final int b(int[] r1, int r2) {
            int r2 = r2 * 5
            int r0 = r2 + 4
            r0 = r1[r0]
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 >> 28
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 + r0
            return r1
    }

    public static final void c(int r2, int r3, int[] r4) {
            if (r3 < 0) goto L5
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
        L5:
            int r2 = r2 * 5
            int r2 = r2 + 1
            r0 = r4[r2]
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r3 = r3 | r0
            r4[r2] = r3
            return
    }

    public static final defpackage.mk6 d(defpackage.mk6 r2) {
            boolean r0 = r2 instanceof defpackage.mk6
            r1 = 0
            if (r0 == 0) goto L6
            goto L7
        L6:
            r2 = r1
        L7:
            if (r2 == 0) goto La
            return r2
        La:
            java.lang.String r2 = "Inconsistent composition"
            defpackage.tx0.b(r2)
            defpackage.e41.c()
            return r1
    }

    public static final int e(java.util.ArrayList r4, int r5, int r6) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r1 > r0) goto L27
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r4.get(r2)
            sq2 r3 = (defpackage.sq2) r3
            int r3 = r3.a
            if (r3 >= 0) goto L18
            int r3 = r3 + r6
        L18:
            int r3 = defpackage.nb3.p(r3, r5)
            if (r3 >= 0) goto L21
            int r1 = r2 + 1
            goto L7
        L21:
            if (r3 <= 0) goto L26
            int r0 = r2 + (-1)
            goto L7
        L26:
            return r2
        L27:
            int r1 = r1 + 1
            int r4 = -r1
            return r4
    }

    public static final void f() {
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }
}
