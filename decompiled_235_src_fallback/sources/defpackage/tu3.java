package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu3  reason: default package */
/* loaded from: classes.dex */
public final class tu3 implements android.text.style.LineHeightSpan {
    public final float A;

    public tu3(float r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence r1, int r2, int r3, int r4, int r5, android.graphics.Paint.FontMetricsInt r6) {
            r0 = this;
            int r1 = r6.descent
            int r2 = r6.ascent
            int r1 = r1 - r2
            if (r1 > 0) goto L8
            return
        L8:
            float r0 = r0.A
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
            int r0 = (int) r0
            float r2 = (float) r0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r6.descent
            double r3 = (double) r1
            double r1 = (double) r2
            double r3 = r3 * r1
            double r1 = java.lang.Math.ceil(r3)
            int r1 = (int) r1
            r6.descent = r1
            int r1 = r1 - r0
            r6.ascent = r1
            return
    }
}
