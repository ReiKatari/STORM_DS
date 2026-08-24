package defpackage;

import java.text.BreakIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st2  reason: default package */
/* loaded from: classes.dex */
public final class st2 extends ii2 {
    public final BreakIterator R;

    public st2(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.R = characterInstance;
    }

    @Override // defpackage.ii2
    public final int H(int i) {
        return this.R.following(i);
    }

    @Override // defpackage.ii2
    public final int N(int i) {
        return this.R.preceding(i);
    }
}
