package v4;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h3.e;
import i3.l0;
import kf.s0;
import n2.e0;
import n2.f1;
import n2.s;
import t4.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final l0 A;
    public final float B;
    public final f1 L = s.w(new e(9205357640488583168L));
    public final e0 R = s.q(new s0(17, this));

    public b(l0 l0Var, float f8) {
        this.A = l0Var;
        this.B = f8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.c(textPaint, this.B);
        textPaint.setShader((Shader) this.R.getValue());
    }
}
