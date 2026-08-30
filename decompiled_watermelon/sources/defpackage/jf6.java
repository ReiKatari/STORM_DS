package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jf6  reason: default package */
/* loaded from: classes.dex */
public final class jf6 extends rz3 {
    public kf6 a;
    public tc6 b;
    public if6 c;

    @Override // defpackage.rz3
    public final float a() {
        return this.c.b();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        kf6 kf6Var = this.a;
        this.c = kf6Var;
        kf6Var.l = f;
        if (f > f2) {
            z = true;
        } else {
            z = false;
        }
        kf6Var.k = z;
        if (z) {
            kf6Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            kf6Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
