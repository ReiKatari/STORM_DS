package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po1  reason: default package */
/* loaded from: classes.dex */
public final class po1 extends CharacterStyle implements UpdateAppearance {
    public final oo1 A;

    public po1(oo1 oo1Var) {
        this.A = oo1Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            kc2 kc2Var = kc2.a;
            oo1 oo1Var = this.A;
            if (nb3.k(oo1Var, kc2Var)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (oo1Var instanceof ys6) {
                textPaint.setStyle(Paint.Style.STROKE);
                ys6 ys6Var = (ys6) oo1Var;
                textPaint.setStrokeWidth(ys6Var.a);
                textPaint.setStrokeMiter(ys6Var.b);
                int i = ys6Var.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = ys6Var.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            } else {
                i.d();
            }
        }
    }
}
