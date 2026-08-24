package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eu4  reason: default package */
/* loaded from: classes.dex */
public final class eu4 extends defpackage.hu4 {
    public final float c;
    public final float d;

    public eu4(float r2, float r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.c = r2
            r1.d = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.eu4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eu4 r5 = (defpackage.eu4) r5
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r4 = r4.d
            float r5 = r5.d
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.c
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RelativeReflectiveQuadTo(dx="
            r0.<init>(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", dy="
            r0.append(r1)
            float r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
