package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo  reason: default package */
/* loaded from: classes.dex */
public final class xo extends defpackage.ap {
    public float a;
    public float b;

    public xo(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.ap
    public final float a(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            float r1 = r1.b
            return r1
        La:
            float r1 = r1.a
            return r1
    }

    @Override // defpackage.ap
    public final int b() {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // defpackage.ap
    public final defpackage.ap c() {
            r1 = this;
            xo r1 = new xo
            r0 = 0
            r1.<init>(r0, r0)
            return r1
    }

    @Override // defpackage.ap
    public final void d() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    @Override // defpackage.ap
    public final void e(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            return
        L6:
            r1.b = r3
            return
        L9:
            r1.a = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.xo
            if (r0 == 0) goto L18
            xo r3 = (defpackage.xo) r3
            float r0 = r3.a
            float r1 = r2.a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r3.b
            float r2 = r2.b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
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
            java.lang.String r1 = "AnimationVector2D: v1 = "
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
