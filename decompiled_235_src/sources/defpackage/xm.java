package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm  reason: default package */
/* loaded from: classes.dex */
public final class xm implements fo7 {
    public final ViewConfiguration a;

    public xm(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.fo7
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.fo7
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.fo7
    public final float c() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // defpackage.fo7
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.fo7
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.fo7
    public final float g() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
