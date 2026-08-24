package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo  reason: default package */
/* loaded from: classes.dex */
public final class wo extends defpackage.ap {
    public float a;

    public wo(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ap
    public final float a(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            float r0 = r0.a
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // defpackage.ap
    public final int b() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.ap
    public final defpackage.ap c() {
            r1 = this;
            wo r1 = new wo
            r0 = 0
            r1.<init>(r0)
            return r1
    }

    @Override // defpackage.ap
    public final void d() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    @Override // defpackage.ap
    public final void e(int r1, float r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r0.a = r2
        L4:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.wo
            if (r0 == 0) goto L10
            wo r2 = (defpackage.wo) r2
            float r2 = r2.a
            float r1 = r1.a
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
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
            java.lang.String r1 = "AnimationVector1D: value = "
            r0.<init>(r1)
            float r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
