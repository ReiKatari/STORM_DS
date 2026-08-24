package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq0  reason: default package */
/* loaded from: classes.dex */
public final class xq0 implements defpackage.f61 {
    public final float a;

    public xq0(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.f61
    public final float a(android.graphics.RectF r3) {
            r2 = this;
            float r0 = r3.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r3 = r3.height()
            float r3 = r3 / r1
            float r3 = java.lang.Math.min(r0, r3)
            float r2 = r2.a
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto L18
            return r0
        L18:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1d
            return r3
        L1d:
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.xq0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xq0 r4 = (defpackage.xq0) r4
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
}
