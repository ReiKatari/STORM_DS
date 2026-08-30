package defpackage;

import java.text.BreakIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn2  reason: default package */
/* loaded from: classes.dex */
public final class nn2 extends ln2 {
    public final BreakIterator L;

    public nn2(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.L = characterInstance;
    }

    @Override // defpackage.ln2
    public final int K(int i) {
        return this.L.following(i);
    }

    @Override // defpackage.ln2
    public final int O(int i) {
        return this.L.preceding(i);
    }
}
