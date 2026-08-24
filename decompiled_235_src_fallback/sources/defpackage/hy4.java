package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy4  reason: default package */
/* loaded from: classes.dex */
public final class hy4 {
    public final defpackage.cy4 a;
    public final defpackage.ux4 b;

    public hy4(defpackage.cy4 r1, defpackage.ux4 r2) {
            r0 = this;
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
            boolean r1 = r5 instanceof defpackage.hy4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hy4 r5 = (defpackage.hy4) r5
            ux4 r1 = r5.b
            ux4 r3 = r4.b
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            cy4 r4 = r4.a
            cy4 r5 = r5.a
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            cy4 r1 = r2.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            ux4 r2 = r2.b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlatformTextStyle(spanStyle="
            r0.<init>(r1)
            cy4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", paragraphSyle="
            r0.append(r1)
            ux4 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
