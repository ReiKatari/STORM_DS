package a6;

import android.view.animation.Interpolator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f498a;

    /* renamed from: b  reason: collision with root package name */
    public float f499b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f500c;

    /* renamed from: d  reason: collision with root package name */
    public final long f501d;

    public o1(int i2, Interpolator interpolator, long j2) {
        this.f498a = i2;
        this.f500c = interpolator;
        this.f501d = j2;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f501d;
    }

    public float c() {
        float f8 = this.f499b;
        Interpolator interpolator = this.f500c;
        if (interpolator != null) {
            return interpolator.getInterpolation(f8);
        }
        return f8;
    }

    public int d() {
        return this.f498a;
    }

    public void e(float f8) {
        this.f499b = f8;
    }
}
