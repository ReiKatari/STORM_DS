package defpackage;

import android.view.animation.Interpolator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l74  reason: default package */
/* loaded from: classes.dex */
public final class l74 implements Interpolator {
    public final /* synthetic */ int a;
    public final /* synthetic */ gr1 b;

    public /* synthetic */ l74(gr1 gr1Var, int i) {
        this.a = i;
        this.b = gr1Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double a;
        switch (this.a) {
            case 0:
                a = this.b.a(f);
                break;
            case 1:
                a = this.b.a(f);
                break;
            default:
                a = this.b.a(f);
                break;
        }
        return (float) a;
    }
}
