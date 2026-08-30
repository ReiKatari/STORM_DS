package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x26  reason: default package */
/* loaded from: classes.dex */
public final class x26 extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public x26(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
