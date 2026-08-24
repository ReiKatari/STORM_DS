package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl7  reason: default package */
/* loaded from: classes.dex */
public final class nl7 {
    public final defpackage.ap a;
    public final defpackage.hr1 b;

    public nl7(defpackage.ap r1, defpackage.hr1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.nl7
            if (r1 != 0) goto L9
            goto L20
        L9:
            nl7 r4 = (defpackage.nl7) r4
            ap r1 = r3.a
            ap r2 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L16
            goto L20
        L16:
            hr1 r3 = r3.b
            hr1 r4 = r4.b
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L22
        L20:
            r3 = 0
            return r3
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            ap r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            hr1 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VectorizedKeyframeSpecElementInfo(vectorValue="
            r0.<init>(r1)
            ap r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", easing="
            r0.append(r1)
            hr1 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ", arcMode=ArcMode(value=0))"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
