package xa;

import java.lang.reflect.Array;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ua.u {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14454c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Class f14455a;

    /* renamed from: b  reason: collision with root package name */
    public final o f14456b;

    public b(ua.h hVar, ua.u uVar, Class cls) {
        this.f14456b = new o(hVar, uVar, cls);
        this.f14455a = cls;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.F()) {
            arrayList.add(this.f14456b.f14504c.b(aVar));
        }
        aVar.v();
        int size = arrayList.size();
        Class cls = this.f14455a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(newInstance, i2, arrayList.get(i2));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        cVar.i();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f14456b.c(cVar, Array.get(obj, i2));
        }
        cVar.v();
    }
}
