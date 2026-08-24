package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq5  reason: default package */
/* loaded from: classes.dex */
public final class eq5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public eq5(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.eq5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eq5 r5 = (defpackage.eq5) r5
            float r1 = r5.a
            float r3 = r4.a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L2d
            float r1 = r4.b
            float r3 = r5.b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            float r1 = r4.c
            float r3 = r5.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            float r4 = r4.d
            float r5 = r5.d
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.d
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RippleAlpha(draggedAlpha="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", focusedAlpha="
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", hoveredAlpha="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", pressedAlpha="
            r0.append(r1)
            float r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
