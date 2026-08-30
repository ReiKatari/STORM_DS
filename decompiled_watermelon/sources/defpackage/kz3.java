package defpackage;

import android.view.animation.Interpolator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kz3  reason: default package */
/* loaded from: classes.dex */
public final class kz3 implements Interpolator {
    public final /* synthetic */ int a;
    public final /* synthetic */ an1 b;

    public /* synthetic */ kz3(an1 an1Var, int i) {
        this.a = i;
        this.b = an1Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double b;
        switch (this.a) {
            case 0:
                b = this.b.b(f);
                break;
            case 1:
                b = this.b.b(f);
                break;
            default:
                b = this.b.b(f);
                break;
        }
        return (float) b;
    }
}
