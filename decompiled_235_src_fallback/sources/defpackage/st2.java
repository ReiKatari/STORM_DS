package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st2  reason: default package */
/* loaded from: classes.dex */
public final class st2 extends defpackage.ii2 {
    public final java.text.BreakIterator R;

    public st2(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            r1.R = r0
            return
    }

    @Override // defpackage.ii2
    public final int H(int r1) {
            r0 = this;
            java.text.BreakIterator r0 = r0.R
            int r0 = r0.following(r1)
            return r0
    }

    @Override // defpackage.ii2
    public final int N(int r1) {
            r0 = this;
            java.text.BreakIterator r0 = r0.R
            int r0 = r0.preceding(r1)
            return r0
    }
}
