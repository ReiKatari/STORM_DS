package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt3  reason: default package */
/* loaded from: classes.dex */
public final class nt3 extends android.text.style.MetricAffectingSpan {
    public final float A;

    public nt3(float r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r3) {
            r2 = this;
            float r0 = r3.getTextSize()
            float r1 = r3.getTextScaleX()
            float r1 = r1 * r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return
        Lf:
            float r2 = r2.A
            float r2 = r2 / r1
            r3.setLetterSpacing(r2)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r3) {
            r2 = this;
            float r0 = r3.getTextSize()
            float r1 = r3.getTextScaleX()
            float r1 = r1 * r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return
        Lf:
            float r2 = r2.A
            float r2 = r2 / r1
            r3.setLetterSpacing(r2)
            return
    }
}
