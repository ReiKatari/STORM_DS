package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb5  reason: default package */
/* loaded from: classes.dex */
public final class vb5 {
    public final defpackage.yb5 a;
    public final java.lang.String b;

    public vb5(defpackage.yb5 r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.vb5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vb5 r5 = (defpackage.vb5) r5
            yb5 r1 = r4.a
            yb5 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            yb5 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RaInGameLogoutCommitFailure(stage="
            r0.<init>(r1)
            yb5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", errorType="
            r0.append(r1)
            java.lang.String r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
