package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg7  reason: default package */
/* loaded from: classes.dex */
public final class wg7 extends ah7 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public wg7(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.ah7
    public final Object a(Class cls) {
        String i = ci.i(cls);
        if (i == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i));
    }
}
