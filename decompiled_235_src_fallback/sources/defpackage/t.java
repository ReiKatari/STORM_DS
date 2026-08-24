package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t  reason: default package */
/* loaded from: classes.dex */
public final class t implements defpackage.f61 {
    public final float a;

    public t(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.f61
    public final float a(android.graphics.RectF r1) {
            r0 = this;
            float r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t r4 = (defpackage.t) r4
            float r3 = r3.a
            float r4 = r4.a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = "px"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
