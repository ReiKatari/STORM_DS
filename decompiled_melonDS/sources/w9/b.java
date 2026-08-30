package w9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends p7.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14171b;

    @Override // p7.a
    public final int n(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i2;
        switch (this.f14171b) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i2;
    }

    @Override // p7.a
    public final int o() {
        switch (this.f14171b) {
            case 0:
                return 1;
            case DSiCameraSource.FrontCamera /* 1 */:
                return 2;
            default:
                return 0;
        }
    }

    @Override // p7.a
    public final ViewPropertyAnimator p(View view, int i2) {
        switch (this.f14171b) {
            case 0:
                return view.animate().translationY(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return view.animate().translationX(-i2);
            default:
                return view.animate().translationX(i2);
        }
    }
}
