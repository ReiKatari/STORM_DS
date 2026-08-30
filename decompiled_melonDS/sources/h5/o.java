package h5;

import android.view.animation.Interpolator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d5.e f6209b;

    public /* synthetic */ o(d5.e eVar, int i2) {
        this.f6208a = i2;
        this.f6209b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        double a10;
        switch (this.f6208a) {
            case 0:
                a10 = this.f6209b.a(f8);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                a10 = this.f6209b.a(f8);
                break;
            default:
                a10 = this.f6209b.a(f8);
                break;
        }
        return (float) a10;
    }
}
