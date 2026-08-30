package wa;

import java.lang.reflect.Method;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f14189b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14190c;

    public u(Method method, Object obj) {
        this.f14189b = method;
        this.f14190c = obj;
    }

    @Override // wa.y
    public final Object a(Class cls) {
        String t5 = a0.t(cls);
        if (t5 == null) {
            return this.f14189b.invoke(this.f14190c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t5));
    }
}
