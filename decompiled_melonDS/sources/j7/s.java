package j7;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7667b;

    public /* synthetic */ s(int i2, Object obj) {
        this.f7666a = i2;
        this.f7667b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7666a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                t tVar = (t) this.f7667b;
                tVar.f7676c.setAlpha(floatValue);
                tVar.f7677d.setAlpha(floatValue);
                tVar.f7691s.invalidate();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((TextInputLayout) this.f7667b).f3135q1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                na.j jVar = ((BottomSheetBehavior) this.f7667b).f2959i;
                if (jVar != null) {
                    na.h hVar = jVar.B;
                    if (hVar.f10153j != floatValue2) {
                        hVar.f10153j = floatValue2;
                        jVar.Y = true;
                        jVar.Z = true;
                        jVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
