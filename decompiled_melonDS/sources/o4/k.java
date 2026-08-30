package o4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10846a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10847b;

    public k(boolean z10, boolean z11) {
        this.f10846a = z10;
        this.f10847b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f10846a);
        textPaint.setStrikeThruText(this.f10847b);
    }
}
