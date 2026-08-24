package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja5  reason: default package */
/* loaded from: classes.dex */
public final class ja5 {
    public final java.lang.String a;
    public final java.net.URL b;
    public final java.lang.String c;

    public ja5(java.lang.String r1, java.net.URL r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.ja5
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ja5 r3 = (defpackage.ja5) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.net.URL r0 = r2.b
            java.net.URL r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.c
            java.lang.String r3 = r3.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.net.URL r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.c
            if (r2 != 0) goto L17
            r2 = 0
            goto L1b
        L17:
            int r2 = r2.hashCode()
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RAGameSummary(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", icon="
            r0.append(r1)
            java.net.URL r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", richPresencePatch="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.c
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
