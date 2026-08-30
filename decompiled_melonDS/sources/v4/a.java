package v4;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k3.e;
import k3.g;
import k3.h;
import m9.o;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final e A;

    public a(e eVar) {
        this.A = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            g gVar = g.f7961a;
            e eVar = this.A;
            if (k.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (eVar instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                h hVar = (h) eVar;
                textPaint.setStrokeWidth(hVar.f7962a);
                textPaint.setStrokeMiter(hVar.f7963b);
                int i2 = hVar.f7965d;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else if (i2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i2 == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i10 = hVar.f7964c;
                if (i10 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i10 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i10 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            } else {
                o.o();
            }
        }
    }
}
