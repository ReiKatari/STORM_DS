package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i92  reason: default package */
/* loaded from: classes.dex */
public final class i92 {
    public final defpackage.rc2 a;

    public i92(defpackage.rc2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r2 instanceof defpackage.i92
            if (r0 != 0) goto L8
            goto L1c
        L8:
            i92 r2 = (defpackage.i92) r2
            r0 = 0
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L12
            goto L1c
        L12:
            rc2 r1 = r1.a
            rc2 r2 = r2.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1e
        L1c:
            r1 = 0
            return r1
        L1e:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            rc2 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fade(alpha=0.0, animationSpec="
            r0.<init>(r1)
            rc2 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
