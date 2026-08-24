package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc5  reason: default package */
/* loaded from: classes.dex */
public final class wc5 implements defpackage.xc5 {
    public final long a;
    public final defpackage.lc5 b;
    public final defpackage.sc5 c;

    public wc5(long r1, defpackage.lc5 r3, defpackage.sc5 r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof defpackage.wc5
            if (r0 != 0) goto L8
            goto L24
        L8:
            wc5 r5 = (defpackage.wc5) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L24
        L13:
            lc5 r0 = r4.b
            lc5 r1 = r5.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L24
        L1e:
            sc5 r4 = r4.c
            sc5 r5 = r5.c
            if (r4 == r5) goto L26
        L24:
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            lc5 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            sc5 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Syncing(requestId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", pending="
            r0.append(r1)
            lc5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            sc5 r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
