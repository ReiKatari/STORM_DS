package defpackage;

import android.view.WindowInsetsAnimation;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe7  reason: default package */
/* loaded from: classes.dex */
public final class xe7 extends ye7 {
    public final WindowInsetsAnimation e;

    public xe7(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.ye7
    public final float a() {
        float alpha;
        alpha = this.e.getAlpha();
        return alpha;
    }

    @Override // defpackage.ye7
    public final long b() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.ye7
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.ye7
    public final int d() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.ye7
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
