package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p84  reason: default package */
/* loaded from: classes.dex */
public final class p84 {
    public final defpackage.b63 a;
    public final defpackage.my4 b;
    public final float c;

    public p84(defpackage.b63 r1, defpackage.my4 r2, float r3) {
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
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.p84
            if (r0 != 0) goto L8
            goto L26
        L8:
            p84 r3 = (defpackage.p84) r3
            b63 r0 = r2.a
            b63 r1 = r3.a
            if (r0 == r1) goto L11
            goto L26
        L11:
            my4 r0 = r2.b
            my4 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            float r2 = r2.c
            float r3 = r3.c
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            b63 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            my4 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r2 = r2.c
            int r2 = java.lang.Float.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ButtonCircle(input="
            r0.<init>(r1)
            b63 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", center="
            r0.append(r1)
            my4 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", radiusSquared="
            r0.append(r1)
            float r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
