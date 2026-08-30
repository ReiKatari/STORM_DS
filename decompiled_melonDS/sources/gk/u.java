package gk;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5810a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f5811b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5812c;

    public u(Object obj, Method method, ArrayList arrayList) {
        this.f5810a = obj;
        this.f5811b = method;
        this.f5812c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", ff.a.class.getName(), this.f5811b.getName(), this.f5812c);
    }
}
