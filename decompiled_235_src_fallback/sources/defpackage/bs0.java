package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs0  reason: default package */
/* loaded from: classes.dex */
public final class bs0 {
    public final float a;
    public final float b;

    public bs0(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static boolean d(java.lang.Comparable r0, java.lang.Comparable r1) {
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final java.lang.Comparable a() {
            r0 = this;
            float r0 = r0.b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public final java.lang.Comparable b() {
            r0 = this;
            float r0 = r0.a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public final boolean c() {
            r1 = this;
            float r0 = r1.a
            float r1 = r1.b
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.bs0
            if (r0 == 0) goto L27
            boolean r0 = r2.c()
            if (r0 == 0) goto L13
            r0 = r3
            bs0 r0 = (defpackage.bs0) r0
            boolean r0 = r0.c()
            if (r0 != 0) goto L25
        L13:
            bs0 r3 = (defpackage.bs0) r3
            float r0 = r3.a
            float r1 = r2.a
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            float r2 = r2.b
            float r3 = r3.b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L27
        L25:
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            float r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
