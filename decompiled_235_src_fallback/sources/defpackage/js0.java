package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js0  reason: default package */
/* loaded from: classes.dex */
public final class js0 extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ js0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r3.setTypeface(r2)
            return
        Ld:
            java.lang.String r2 = (java.lang.String) r2
            r3.setFontFeatureSettings(r2)
            return
        L13:
            f14 r2 = (defpackage.f14) r2
            r2.getClass()
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r3.setTypeface(r0)
            float r0 = r3.getTextSize()
            r1 = 1063172178(0x3f5eb852, float:0.87)
            float r0 = r0 * r1
            r3.setTextSize(r0)
            r2.getClass()
            int r2 = r3.getColor()
            r0 = 25
            int r2 = defpackage.jw2.k(r2, r0)
            r3.bgColor = r2
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r2.setTypeface(r1)
            return
        Ld:
            java.lang.String r1 = (java.lang.String) r1
            r2.setFontFeatureSettings(r1)
            return
        L13:
            f14 r1 = (defpackage.f14) r1
            r1.getClass()
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r2.setTypeface(r1)
            float r1 = r2.getTextSize()
            r0 = 1063172178(0x3f5eb852, float:0.87)
            float r1 = r1 * r0
            r2.setTextSize(r1)
            return
    }
}
