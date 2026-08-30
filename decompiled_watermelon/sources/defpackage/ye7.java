package defpackage;

import android.view.animation.Interpolator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ye7  reason: default package */
/* loaded from: classes.dex */
public abstract class ye7 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public ye7(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float f = this.b;
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    public int d() {
        return this.a;
    }

    public void e(float f) {
        this.b = f;
    }
}
