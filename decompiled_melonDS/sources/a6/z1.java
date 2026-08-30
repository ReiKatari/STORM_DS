package a6;

import android.graphics.Insets;
import android.view.WindowInsets;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z1 extends y1 {

    /* renamed from: o  reason: collision with root package name */
    public q5.b f542o;

    /* renamed from: p  reason: collision with root package name */
    public q5.b f543p;

    /* renamed from: q  reason: collision with root package name */
    public q5.b f544q;

    public z1(i2 i2Var, WindowInsets windowInsets) {
        super(i2Var, windowInsets);
        this.f542o = null;
        this.f543p = null;
        this.f544q = null;
    }

    @Override // a6.d2
    public q5.b h() {
        Insets mandatorySystemGestureInsets;
        if (this.f543p == null) {
            mandatorySystemGestureInsets = this.f527c.getMandatorySystemGestureInsets();
            this.f543p = q5.b.d(mandatorySystemGestureInsets);
        }
        return this.f543p;
    }

    @Override // a6.d2
    public q5.b j() {
        Insets systemGestureInsets;
        if (this.f542o == null) {
            systemGestureInsets = this.f527c.getSystemGestureInsets();
            this.f542o = q5.b.d(systemGestureInsets);
        }
        return this.f542o;
    }

    @Override // a6.d2
    public q5.b l() {
        Insets tappableElementInsets;
        if (this.f544q == null) {
            tappableElementInsets = this.f527c.getTappableElementInsets();
            this.f544q = q5.b.d(tappableElementInsets);
        }
        return this.f544q;
    }

    @Override // a6.w1, a6.d2
    public i2 m(int i2, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f527c.inset(i2, i10, i11, i12);
        return i2.g(null, inset);
    }

    @Override // a6.x1, a6.d2
    public void s(q5.b bVar) {
    }
}
