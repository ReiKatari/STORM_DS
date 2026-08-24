package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f60  reason: default package */
/* loaded from: classes.dex */
public final class f60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f60(Object obj, int i) {
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
                p24 p24Var = ((BottomSheetBehavior) obj).i;
                if (p24Var != null) {
                    n24 n24Var = p24Var.B;
                    if (n24Var.j != floatValue) {
                        n24Var.j = floatValue;
                        p24Var.Y = true;
                        p24Var.Z = true;
                        p24Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                u92 u92Var = (u92) obj;
                u92Var.c.setAlpha(floatValue2);
                u92Var.d.setAlpha(floatValue2);
                u92Var.s.invalidate();
                return;
            default:
                ((TextInputLayout) obj).s1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
