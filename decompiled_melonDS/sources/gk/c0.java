package gk;

import java.io.IOException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final Method f5717d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5718e;

    /* renamed from: f  reason: collision with root package name */
    public final n f5719f;

    public c0(Method method, int i2, n nVar) {
        this.f5717d = method;
        this.f5718e = i2;
        this.f5719f = nVar;
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        int i2 = this.f5718e;
        Method method = this.f5717d;
        if (obj != null) {
            try {
                o0Var.f5761k = (pi.b0) this.f5719f.g(obj);
                return;
            } catch (IOException e6) {
                throw y0.o(method, e6, i2, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw y0.n(method, i2, "Body parameter value must not be null.", new Object[0]);
    }
}
