package a6;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public o1 f502a;

    public p1(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f502a = new n1(c0.i(i2, interpolator, j2));
        } else {
            this.f502a = new o1(i2, interpolator, j2);
        }
    }
}
