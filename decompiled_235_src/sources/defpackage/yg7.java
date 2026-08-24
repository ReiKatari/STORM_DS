package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg7  reason: default package */
/* loaded from: classes.dex */
public final class yg7 extends ah7 {
    public final /* synthetic */ Method b;

    public yg7(Method method) {
        this.b = method;
    }

    @Override // defpackage.ah7
    public final Object a(Class cls) {
        String i = ci.i(cls);
        if (i == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i));
    }
}
