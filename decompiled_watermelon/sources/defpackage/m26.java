package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m26  reason: default package */
/* loaded from: classes.dex */
public final class m26 extends CharacterStyle implements UpdateAppearance {
    public final l26 A;
    public final float B;
    public final tj4 L = me2.G(new i76(9205357640488583168L));
    public final ee1 R = me2.q(new t06(2, this));

    public m26(l26 l26Var, float f) {
        this.A = l26Var;
        this.B = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        w81.D(textPaint, this.B);
        textPaint.setShader((Shader) this.R.getValue());
    }
}
