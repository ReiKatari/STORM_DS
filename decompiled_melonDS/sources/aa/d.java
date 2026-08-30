package aa;

import com.google.android.material.carousel.CarouselLayoutManager;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f682a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f683b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f684c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f683b = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f684c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f684c = carouselLayoutManager;
                return;
        }
    }

    public final int a() {
        switch (this.f683b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f684c;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f7720n;
                }
                return 0;
        }
    }

    public d(int i2) {
        this.f682a = i2;
    }
}
