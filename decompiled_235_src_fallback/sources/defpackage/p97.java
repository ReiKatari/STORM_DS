package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p97  reason: default package */
/* loaded from: classes.dex */
public final class p97 {
    public final defpackage.fp a;
    public final defpackage.mk4 b;

    public p97(defpackage.fp r1, defpackage.mk4 r2) {
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
            boolean r0 = r3 instanceof defpackage.p97
            if (r0 != 0) goto L8
            goto L1f
        L8:
            p97 r3 = (defpackage.p97) r3
            fp r0 = r3.a
            fp r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            mk4 r2 = r2.b
            mk4 r3 = r3.b
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
            fp r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            mk4 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransformedText(text="
            r0.<init>(r1)
            fp r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", offsetMapping="
            r0.append(r1)
            mk4 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
