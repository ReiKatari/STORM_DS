package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x20  reason: default package */
/* loaded from: classes.dex */
public final class x20 {
    public final float a;

    public /* synthetic */ x20(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.x20
            if (r0 != 0) goto L5
            goto L11
        L5:
            x20 r2 = (defpackage.x20) r2
            float r2 = r2.a
            float r1 = r1.a
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaselineShift(multiplier="
            r0.<init>(r1)
            float r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
