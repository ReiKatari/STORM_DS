package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd6  reason: default package */
/* loaded from: classes.dex */
public final class yd6 extends CharacterStyle implements UpdateAppearance {
    public final xd6 A;
    public final float B;
    public final vs4 L = np2.Y(new xi6(9205357640488583168L));
    public final ii1 R = np2.I(new t46(this, 9));

    public yd6(xd6 xd6Var, float f) {
        this.A = xd6Var;
        this.B = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        g04.Q(textPaint, this.B);
        textPaint.setShader((Shader) this.R.getValue());
    }
}
