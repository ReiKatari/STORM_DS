package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b37  reason: default package */
/* loaded from: classes.dex */
public final class b37 extends f37 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public b37(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.f37
    public final Object a(Class cls) {
        String i = qh.i(cls);
        if (i == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i));
    }
}
