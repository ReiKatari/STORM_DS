package g5;

import android.view.View;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5565g;

    @Override // g5.g
    public final void d(View view, float f8) {
        switch (this.f5565g) {
            case 0:
                view.setAlpha(a(f8));
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                view.setElevation(a(f8));
                return;
            case 2:
                view.setRotation(a(f8));
                return;
            case 3:
                view.setRotationX(a(f8));
                return;
            case 4:
                view.setRotationY(a(f8));
                return;
            case l1.c.f8511g /* 5 */:
                view.setScaleX(a(f8));
                return;
            case l1.c.f8509e /* 6 */:
                view.setScaleY(a(f8));
                return;
            case 7:
                view.setTranslationX(a(f8));
                return;
            case 8:
                view.setTranslationY(a(f8));
                return;
            default:
                view.setTranslationZ(a(f8));
                return;
        }
    }
}
