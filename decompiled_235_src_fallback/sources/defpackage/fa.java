package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa  reason: default package */
/* loaded from: classes.dex */
public final class fa implements defpackage.f61 {
    public final defpackage.f61 a;
    public final float b;

    public fa(float r2, defpackage.f61 r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof defpackage.fa
            if (r0 == 0) goto L12
            fa r3 = (defpackage.fa) r3
            f61 r3 = r3.a
            r0 = r3
            fa r0 = (defpackage.fa) r0
            float r0 = r0.b
            float r2 = r2 + r0
            goto L3
        L12:
            r1.a = r3
            r1.b = r2
            return
    }

    @Override // defpackage.f61
    public final float a(android.graphics.RectF r2) {
            r1 = this;
            f61 r0 = r1.a
            float r2 = r0.a(r2)
            float r1 = r1.b
            float r2 = r2 + r1
            r1 = 0
            float r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.fa
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fa r5 = (defpackage.fa) r5
            f61 r1 = r4.a
            f61 r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            float r4 = r4.b
            float r5 = r5.b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L1f
            return r0
        L1f:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            f61 r1 = r1.a
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            int r1 = java.util.Arrays.hashCode(r1)
            return r1
    }
}
