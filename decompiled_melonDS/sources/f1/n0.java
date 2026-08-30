package f1;

import android.content.Context;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    public final float f4619a;

    /* renamed from: b  reason: collision with root package name */
    public float f4620b;

    public n0(Context context) {
        super(context);
        this.f4619a = p7.j.a(context).A * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i2) {
        this.f4620b = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f8, float f10) {
        this.f4620b = 0.0f;
        super.onPull(f8, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f4620b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f8) {
        this.f4620b = 0.0f;
        super.onPull(f8);
    }
}
