package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro6  reason: default package */
/* loaded from: classes.dex */
public final class ro6 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public ro6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
