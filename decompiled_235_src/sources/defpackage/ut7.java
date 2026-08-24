package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut7  reason: default package */
/* loaded from: classes.dex */
public final class ut7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ au7 a;
    public final /* synthetic */ vu7 b;
    public final /* synthetic */ vu7 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ut7(au7 au7Var, vu7 vu7Var, vu7 vu7Var2, int i, View view) {
        this.a = au7Var;
        this.b = vu7Var;
        this.c = vu7Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        iu7 bu7Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        au7 au7Var = this.a;
        zt7 zt7Var = au7Var.a;
        zt7Var.e(animatedFraction);
        float c = zt7Var.c();
        PathInterpolator pathInterpolator = wt7.e;
        int i = Build.VERSION.SDK_INT;
        vu7 vu7Var = this.b;
        if (i >= 36) {
            bu7Var = new hu7(vu7Var);
        } else if (i >= 35) {
            bu7Var = new gu7(vu7Var);
        } else if (i >= 34) {
            bu7Var = new fu7(vu7Var);
        } else if (i >= 31) {
            bu7Var = new eu7(vu7Var);
        } else if (i >= 30) {
            bu7Var = new du7(vu7Var);
        } else if (i >= 29) {
            bu7Var = new cu7(vu7Var);
        } else {
            bu7Var = new bu7(vu7Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ru7 ru7Var = vu7Var.a;
            if (i3 == 0) {
                bu7Var.d(i2, ru7Var.h(i2));
            } else {
                e83 h = ru7Var.h(i2);
                e83 h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                bu7Var.d(i2, vu7.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        wt7.h(this.e, bu7Var.b(), Collections.singletonList(au7Var));
    }
}
