package j6;

import android.view.animation.Interpolator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7464a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        switch (this.f7464a) {
            case 0:
            default:
                float f10 = f8 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }
}
