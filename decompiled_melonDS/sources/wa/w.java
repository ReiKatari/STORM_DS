package wa;

import java.lang.reflect.Method;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f14193b;

    public w(Method method) {
        this.f14193b = method;
    }

    @Override // wa.y
    public final Object a(Class cls) {
        String t5 = a0.t(cls);
        if (t5 == null) {
            return this.f14193b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t5));
    }
}
