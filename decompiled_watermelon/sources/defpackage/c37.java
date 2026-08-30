package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c37  reason: default package */
/* loaded from: classes.dex */
public final class c37 extends f37 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public c37(Method method, int i) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.f37
    public final Object a(Class cls) {
        String i = qh.i(cls);
        if (i == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i));
    }
}
