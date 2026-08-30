package b4;

import android.os.Build;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 implements z2 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f1797a;

    public c1(ViewConfiguration viewConfiguration) {
        this.f1797a = viewConfiguration;
    }

    @Override // b4.z2
    public final float a() {
        return this.f1797a.getScaledMaximumFlingVelocity();
    }

    @Override // b4.z2
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // b4.z2
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // b4.z2
    public final float d() {
        return this.f1797a.getScaledTouchSlop();
    }

    @Override // b4.z2
    public final float e() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.f1797a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // b4.z2
    public final float f() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.f1797a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
