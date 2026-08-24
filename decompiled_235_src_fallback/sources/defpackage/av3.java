package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av3  reason: default package */
/* loaded from: classes.dex */
public final class av3 implements defpackage.fj2 {
    public final float a;

    public av3(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.fj2
    public final float a(float r1) {
            r0 = this;
            float r0 = r0.a
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.fj2
    public final float b(float r1) {
            r0 = this;
            float r0 = r0.a
            float r1 = r1 * r0
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.av3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            av3 r4 = (defpackage.av3) r4
            float r3 = r3.a
            float r4 = r4.a
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
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
            java.lang.String r1 = "LinearFontScaleConverter(fontScale="
            r0.<init>(r1)
            float r2 = r2.a
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
