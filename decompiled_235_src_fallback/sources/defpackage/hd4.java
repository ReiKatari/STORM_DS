package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd4  reason: default package */
/* loaded from: classes.dex */
public final class hd4 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hd4(float r1, float r2, float r3, int r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<hd4> r2 = defpackage.hd4.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            hd4 r5 = (defpackage.hd4) r5
            float r2 = r4.c
            float r3 = r5.c
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L3b
            float r2 = r4.d
            float r3 = r5.d
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L3b
            float r2 = r4.b
            float r3 = r5.b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L3b
            int r2 = r4.a
            int r3 = r5.a
            if (r2 == r3) goto L31
            return r1
        L31:
            long r2 = r4.e
            long r4 = r5.e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L3a
            return r1
        L3a:
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.c
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r2 = r3.a
            int r0 = defpackage.lb1.a(r2, r0, r1)
            long r1 = r3.e
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavigationEvent(touchX="
            r0.<init>(r1)
            float r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", frameTimeMillis="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
