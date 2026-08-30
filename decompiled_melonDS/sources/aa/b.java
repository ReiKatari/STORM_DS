package aa;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import j7.c0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends c0 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f679q = 1;

    public /* synthetic */ b(Context context) {
        super(context);
    }

    @Override // j7.c0
    public int b(View view, int i2) {
        switch (this.f679q) {
            case 0:
                return 0;
            default:
                return super.b(view, i2);
        }
    }

    @Override // j7.c0
    public int c(View view, int i2) {
        switch (this.f679q) {
            case 0:
                return 0;
            default:
                return super.c(view, i2);
        }
    }

    @Override // j7.c0
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f679q) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // j7.c0
    public PointF f(int i2) {
        switch (this.f679q) {
            case 0:
                return null;
            default:
                return super.f(i2);
        }
    }

    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
