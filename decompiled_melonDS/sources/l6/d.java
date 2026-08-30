package l6;

import android.view.View;
import k7.w;
import me.magnum.melonds.common.camera.DSiCameraSource;
import na.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends w {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f8936j;

    public /* synthetic */ d(int i2) {
        this.f8936j = i2;
    }

    @Override // k7.w
    public final void G(y yVar, float f8) {
        switch (this.f8936j) {
            case 0:
                ((View) yVar).setAlpha(f8);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((View) yVar).setScaleX(f8);
                return;
            case 2:
                ((View) yVar).setScaleY(f8);
                return;
            case 3:
                ((View) yVar).setRotation(f8);
                return;
            case 4:
                ((View) yVar).setRotationX(f8);
                return;
            default:
                ((View) yVar).setRotationY(f8);
                return;
        }
    }

    @Override // k7.w
    public final float u(y yVar) {
        switch (this.f8936j) {
            case 0:
                return ((View) yVar).getAlpha();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }
}
