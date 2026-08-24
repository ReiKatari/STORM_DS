package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac3  reason: default package */
/* loaded from: classes.dex */
public final class ac3 {
    public final Object a;
    public final Method b;
    public final List c;

    public ac3(Object obj, Method method, ArrayList arrayList) {
        this.a = obj;
        this.b = method;
        this.c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", yr2.class.getName(), this.b.getName(), this.c);
    }
}
