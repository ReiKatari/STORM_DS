package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt3  reason: default package */
/* loaded from: classes.dex */
public final class mt3 extends android.text.style.MetricAffectingSpan {
    public final float A;

    public mt3(float r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r1) {
            r0 = this;
            float r0 = r0.A
            r1.setLetterSpacing(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r1) {
            r0 = this;
            float r0 = r0.A
            r1.setLetterSpacing(r0)
            return
    }
}
