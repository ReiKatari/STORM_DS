package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt1  reason: default package */
/* loaded from: classes.dex */
public final class qt1 extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int A;

    public /* synthetic */ qt1(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            r0 = 1
            r1.setFakeBoldText(r0)
            return
        La:
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            r1.setTextSkewX(r0)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            r0 = 1
            r1.setFakeBoldText(r0)
            return
        La:
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            r1.setTextSkewX(r0)
            return
    }
}
