package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y28  reason: default package */
/* loaded from: classes.dex */
public final class y28 {
    public final char a;

    public y28(char r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            r0 = 6
            char[] r0 = new char[r0]
            r1 = 92
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r3 = 117(0x75, float:1.64E-43)
            r0[r1] = r3
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r2
            r1 = 4
            r0[r1] = r2
            r3 = 5
            r0[r3] = r2
            char r6 = r6.a
        L1b:
            if (r2 >= r1) goto L2d
            int r3 = 5 - r2
            r4 = r6 & 15
            java.lang.String r5 = "0123456789ABCDEF"
            char r4 = r5.charAt(r4)
            r0[r3] = r4
            int r6 = r6 >> r1
            int r2 = r2 + 1
            goto L1b
        L2d:
            java.lang.String r6 = java.lang.String.copyValueOf(r0)
            java.lang.String r0 = "CharMatcher.is('"
            java.lang.String r1 = "')"
            java.lang.String r6 = defpackage.lb1.A(r0, r6, r1)
            return r6
    }
}
