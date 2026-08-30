package gk;

import j0.o1;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5728d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f5729e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5730f;

    public /* synthetic */ f0(Method method, int i2, int i10) {
        this.f5728d = i10;
        this.f5729e = method;
        this.f5730f = i2;
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        switch (this.f5728d) {
            case 0:
                pi.q qVar = (pi.q) obj;
                if (qVar != null) {
                    o1 o1Var = o0Var.f5756f;
                    o1Var.getClass();
                    int size = qVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        p7.t.e(o1Var, qVar.b(i2), qVar.d(i2));
                    }
                    return;
                }
                throw y0.n(this.f5729e, this.f5730f, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    o0Var.f5753c = obj.toString();
                    return;
                }
                throw y0.n(this.f5729e, this.f5730f, "@Url parameter is null.", new Object[0]);
        }
    }
}
