package n4;

import java.text.BreakIterator;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: b0  reason: collision with root package name */
    public final BreakIterator f10094b0;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f10094b0 = characterInstance;
    }

    @Override // q8.r
    public final int I(int i2) {
        return this.f10094b0.following(i2);
    }

    @Override // q8.r
    public final int N(int i2) {
        return this.f10094b0.preceding(i2);
    }
}
