package g5;

import android.view.View;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f5584k;

    @Override // g5.q
    public final boolean d(float f8, long j2, View view, d5.e eVar) {
        switch (this.f5584k) {
            case 0:
                view.setAlpha(b(f8, j2, view, eVar));
                return this.f5596h;
            case DSiCameraSource.FrontCamera /* 1 */:
                view.setElevation(b(f8, j2, view, eVar));
                return this.f5596h;
            case 2:
                view.setRotation(b(f8, j2, view, eVar));
                return this.f5596h;
            case 3:
                view.setRotationX(b(f8, j2, view, eVar));
                return this.f5596h;
            case 4:
                view.setRotationY(b(f8, j2, view, eVar));
                return this.f5596h;
            case l1.c.f8511g /* 5 */:
                view.setScaleX(b(f8, j2, view, eVar));
                return this.f5596h;
            case l1.c.f8509e /* 6 */:
                view.setScaleY(b(f8, j2, view, eVar));
                return this.f5596h;
            case 7:
                view.setTranslationX(b(f8, j2, view, eVar));
                return this.f5596h;
            case 8:
                view.setTranslationY(b(f8, j2, view, eVar));
                return this.f5596h;
            default:
                view.setTranslationZ(b(f8, j2, view, eVar));
                return this.f5596h;
        }
    }
}
