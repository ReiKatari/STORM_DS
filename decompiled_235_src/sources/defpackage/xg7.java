package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg7  reason: default package */
/* loaded from: classes.dex */
public final class xg7 extends ah7 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public xg7(Method method, int i) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.ah7
    public final Object a(Class cls) {
        String i = ci.i(cls);
        if (i == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i));
    }
}
