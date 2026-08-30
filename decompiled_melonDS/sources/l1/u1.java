package l1;

import android.view.View;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 extends o0 {

    /* renamed from: l0  reason: collision with root package name */
    public mc.l f8632l0;

    /* renamed from: m0  reason: collision with root package name */
    public c2 f8633m0;

    @Override // l1.l0, b3.o
    public final void G0() {
        View v10 = a4.l.v(this);
        WeakHashMap weakHashMap = c2.f8518w;
        c2 g10 = s.g(v10);
        g10.a(v10);
        b2 b2Var = (b2) this.f8632l0.k(g10);
        if (!nc.k.a(b2Var, this.f8592k0)) {
            this.f8592k0 = b2Var;
            P0();
        }
        this.f8633m0 = g10;
        super.G0();
    }

    @Override // l1.l0, b3.o
    public final void H0() {
        View v10 = a4.l.v(this);
        c2 c2Var = this.f8633m0;
        if (c2Var != null) {
            int i2 = c2Var.f8538u - 1;
            c2Var.f8538u = i2;
            if (i2 == 0) {
                WeakHashMap weakHashMap = a6.x0.f533a;
                a6.p0.k(v10, null);
                a6.x0.q(v10, null);
                v10.removeOnAttachStateChangeListener(c2Var.f8539v);
            }
        }
        super.H0();
    }
}
