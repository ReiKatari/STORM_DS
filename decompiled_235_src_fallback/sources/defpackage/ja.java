package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja  reason: default package */
/* loaded from: classes.dex */
public final class ja {
    public final java.lang.String a;
    public final java.lang.String b;

    public ja(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.ja
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ja r3 = (defpackage.ja) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r2 = r2.b
            java.lang.String r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", displayName="
            java.lang.String r1 = ")"
            java.lang.String r2 = "ImportResult(id="
            java.lang.String r3 = r4.a
            java.lang.String r4 = r4.b
            java.lang.String r4 = defpackage.lb1.n(r2, r3, r0, r4, r1)
            return r4
    }
}
