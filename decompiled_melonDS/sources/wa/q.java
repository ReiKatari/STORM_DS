package wa;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f14187b;

    public q(Method method) {
        this.f14187b = method;
    }

    @Override // wa.s
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f14187b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e6) {
            m9.o.m("Failed invoking canAccess", e6);
            return false;
        }
    }
}
