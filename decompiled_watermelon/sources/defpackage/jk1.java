package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk1  reason: default package */
/* loaded from: classes.dex */
public final class jk1 extends CharacterStyle implements UpdateAppearance {
    public final ik1 A;

    public jk1(ik1 ik1Var) {
        this.A = ik1Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            r72 r72Var = r72.a;
            ik1 ik1Var = this.A;
            if (b53.x(ik1Var, r72Var)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (ik1Var instanceof hh6) {
                textPaint.setStyle(Paint.Style.STROKE);
                hh6 hh6Var = (hh6) ik1Var;
                textPaint.setStrokeWidth(hh6Var.a);
                textPaint.setStrokeMiter(hh6Var.b);
                int i = hh6Var.d;
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
                int i2 = hh6Var.c;
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
                i.c();
            }
        }
    }
}
