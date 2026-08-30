package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lm  reason: default package */
/* loaded from: classes.dex */
public final class lm implements fa7 {
    public final ViewConfiguration a;

    public lm(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.fa7
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.fa7
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.fa7
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.fa7
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.fa7
    public final float e() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // defpackage.fa7
    public final float f() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
