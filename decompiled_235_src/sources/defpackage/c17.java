package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c17  reason: default package */
/* loaded from: classes.dex */
public final class c17 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public c17(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
