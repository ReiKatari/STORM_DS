package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: se7  reason: default package */
/* loaded from: classes.dex */
public final class se7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ze7 a;
    public final /* synthetic */ vf7 b;
    public final /* synthetic */ vf7 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public se7(ze7 ze7Var, vf7 vf7Var, vf7 vf7Var2, int i, View view) {
        this.a = ze7Var;
        this.b = vf7Var;
        this.c = vf7Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if7 af7Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ze7 ze7Var = this.a;
        ye7 ye7Var = ze7Var.a;
        ye7Var.e(animatedFraction);
        float c = ye7Var.c();
        PathInterpolator pathInterpolator = ue7.e;
        int i = Build.VERSION.SDK_INT;
        vf7 vf7Var = this.b;
        if (i >= 36) {
            af7Var = new hf7(vf7Var);
        } else if (i >= 35) {
            af7Var = new gf7(vf7Var);
        } else if (i >= 34) {
            af7Var = new ff7(vf7Var);
        } else if (i >= 31) {
            af7Var = new ef7(vf7Var);
        } else if (i >= 30) {
            af7Var = new df7(vf7Var);
        } else if (i >= 29) {
            af7Var = new cf7(vf7Var);
        } else {
            af7Var = new af7(vf7Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            rf7 rf7Var = vf7Var.a;
            if (i3 == 0) {
                af7Var.d(i2, rf7Var.h(i2));
            } else {
                x13 h = rf7Var.h(i2);
                x13 h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                af7Var.d(i2, vf7.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        ue7.h(this.e, af7Var.b(), Collections.singletonList(ze7Var));
    }
}
