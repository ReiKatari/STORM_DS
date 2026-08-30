package z6;

import a1.x0;
import androidx.fragment.app.j1;
import androidx.lifecycle.y0;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b extends y0 {

    /* renamed from: c  reason: collision with root package name */
    public static final j1 f14965c = new j1(1);

    /* renamed from: b  reason: collision with root package name */
    public final x0 f14966b = new x0(0);

    @Override // androidx.lifecycle.y0
    public final void d() {
        x0 x0Var = this.f14966b;
        if (x0Var.g() <= 0) {
            int i2 = x0Var.R;
            Object[] objArr = x0Var.L;
            for (int i10 = 0; i10 < i2; i10++) {
                objArr[i10] = null;
            }
            x0Var.R = 0;
            x0Var.A = false;
            return;
        }
        x0Var.h(0).getClass();
        o.b();
    }
}
