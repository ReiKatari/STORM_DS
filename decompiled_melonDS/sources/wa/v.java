package wa;

import java.lang.reflect.Method;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f14191b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14192c;

    public v(Method method, int i2) {
        this.f14191b = method;
        this.f14192c = i2;
    }

    @Override // wa.y
    public final Object a(Class cls) {
        String t5 = a0.t(cls);
        if (t5 == null) {
            return this.f14191b.invoke(null, cls, Integer.valueOf(this.f14192c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t5));
    }
}
