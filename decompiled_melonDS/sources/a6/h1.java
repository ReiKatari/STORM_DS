package a6;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p1 f465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i2 f466b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i2 f467c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f468d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f469e;

    public h1(p1 p1Var, i2 i2Var, i2 i2Var2, int i2, View view) {
        this.f465a = p1Var;
        this.f466b = i2Var;
        this.f467c = i2Var2;
        this.f468d = i2;
        this.f469e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        v1 q1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p1 p1Var = this.f465a;
        o1 o1Var = p1Var.f502a;
        o1Var.e(animatedFraction);
        float c4 = o1Var.c();
        PathInterpolator pathInterpolator = l1.f483e;
        int i2 = Build.VERSION.SDK_INT;
        i2 i2Var = this.f466b;
        if (i2 >= 34) {
            q1Var = new u1(i2Var);
        } else if (i2 >= 31) {
            q1Var = new t1(i2Var);
        } else if (i2 >= 30) {
            q1Var = new s1(i2Var);
        } else if (i2 >= 29) {
            q1Var = new r1(i2Var);
        } else {
            q1Var = new q1(i2Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int i11 = this.f468d & i10;
            d2 d2Var = i2Var.f479a;
            if (i11 == 0) {
                q1Var.c(i10, d2Var.f(i10));
            } else {
                q5.b f8 = d2Var.f(i10);
                q5.b f10 = this.f467c.f479a.f(i10);
                float f11 = 1.0f - c4;
                q1Var.c(i10, i2.e(f8, (int) (((f8.f12283a - f10.f12283a) * f11) + 0.5d), (int) (((f8.f12284b - f10.f12284b) * f11) + 0.5d), (int) (((f8.f12285c - f10.f12285c) * f11) + 0.5d), (int) (((f8.f12286d - f10.f12286d) * f11) + 0.5d)));
            }
        }
        l1.h(this.f469e, q1Var.b(), Collections.singletonList(p1Var));
    }
}
