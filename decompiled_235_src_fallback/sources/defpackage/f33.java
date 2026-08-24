package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f33  reason: default package */
/* loaded from: classes.dex */
public final class f33 {
    public final defpackage.e33 a;
    public final int b;

    public f33(defpackage.e33 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.f33
            if (r0 != 0) goto L8
            goto L1b
        L8:
            f33 r3 = (defpackage.f33) r3
            e33 r0 = r2.a
            e33 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            int r2 = r2.b
            int r3 = r3.b
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            e33 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImageVectorEntry(imageVector="
            r0.<init>(r1)
            e33 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", configFlags="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
