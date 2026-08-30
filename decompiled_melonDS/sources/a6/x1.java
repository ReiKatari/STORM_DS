package a6;

import android.view.WindowInsets;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class x1 extends w1 {

    /* renamed from: n  reason: collision with root package name */
    public q5.b f539n;

    public x1(i2 i2Var, WindowInsets windowInsets) {
        super(i2Var, windowInsets);
        this.f539n = null;
    }

    @Override // a6.d2
    public i2 b() {
        return i2.g(null, this.f527c.consumeStableInsets());
    }

    @Override // a6.d2
    public i2 c() {
        return i2.g(null, this.f527c.consumeSystemWindowInsets());
    }

    @Override // a6.d2
    public final q5.b i() {
        if (this.f539n == null) {
            WindowInsets windowInsets = this.f527c;
            this.f539n = q5.b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f539n;
    }

    @Override // a6.d2
    public boolean n() {
        return this.f527c.isConsumed();
    }

    @Override // a6.d2
    public void s(q5.b bVar) {
        this.f539n = bVar;
    }
}
