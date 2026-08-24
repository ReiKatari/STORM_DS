package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y20  reason: default package */
/* loaded from: classes.dex */
public final class y20 extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final float B;

    public /* synthetic */ y20(int r1, float r2) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.A
            float r3 = r3.B
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            float r0 = r4.getTextSkewX()
            float r0 = r0 + r3
            r4.setTextSkewX(r0)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r1 = r1 * r3
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r3 = (float) r1
            int r3 = (int) r3
            int r0 = r0 + r3
            r4.baselineShift = r0
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r4) {
            r3 = this;
            int r0 = r3.A
            float r3 = r3.B
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            float r0 = r4.getTextSkewX()
            float r0 = r0 + r3
            r4.setTextSkewX(r0)
            return
        L10:
            int r0 = r4.baselineShift
            float r1 = r4.ascent()
            float r1 = r1 * r3
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r3 = (float) r1
            int r3 = (int) r3
            int r0 = r0 + r3
            r4.baselineShift = r0
            return
    }
}
