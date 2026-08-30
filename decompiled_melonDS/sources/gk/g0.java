package gk;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5731d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final Method f5732e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5733f;

    /* renamed from: g  reason: collision with root package name */
    public final n f5734g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f5735h;

    public g0(Method method, int i2, n nVar, String str) {
        this.f5732e = method;
        this.f5733f = i2;
        this.f5734g = nVar;
        this.f5735h = str;
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        int i2 = this.f5731d;
        n nVar = this.f5734g;
        Object obj2 = this.f5735h;
        Method method = this.f5732e;
        int i10 = this.f5733f;
        switch (i2) {
            case 0:
                if (obj != null) {
                    try {
                        o0Var.c((pi.q) obj2, (pi.b0) nVar.g(obj));
                        return;
                    } catch (IOException e6) {
                        throw y0.n(method, i10, "Unable to convert " + obj + " to RequestBody", e6);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                pi.q qVar = pi.q.B;
                                o0Var.c(p7.m.B("Content-Disposition", kc.a.g("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (pi.b0) nVar.g(value));
                            } else {
                                throw y0.n(method, i10, kc.a.g("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw y0.n(method, i10, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw y0.n(method, i10, "Part map was null.", new Object[0]);
        }
    }

    public g0(Method method, int i2, pi.q qVar, n nVar) {
        this.f5732e = method;
        this.f5733f = i2;
        this.f5735h = qVar;
        this.f5734g = nVar;
    }
}
