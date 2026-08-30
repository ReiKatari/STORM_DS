package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h40  reason: default package */
/* loaded from: classes.dex */
public final class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv3 gv3Var = ((BottomSheetBehavior) obj).i;
                if (gv3Var != null) {
                    ev3 ev3Var = gv3Var.B;
                    if (ev3Var.j != floatValue) {
                        ev3Var.j = floatValue;
                        gv3Var.Y = true;
                        gv3Var.Z = true;
                        gv3Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                b52 b52Var = (b52) obj;
                b52Var.c.setAlpha(floatValue2);
                b52Var.d.setAlpha(floatValue2);
                b52Var.s.invalidate();
                return;
            default:
                ((TextInputLayout) obj).r1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
