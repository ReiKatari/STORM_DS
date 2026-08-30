package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n53  reason: default package */
/* loaded from: classes.dex */
public final class n53 {
    public final Object a;
    public final Method b;
    public final List c;

    public n53(Object obj, Method method, ArrayList arrayList) {
        this.a = obj;
        this.b = method;
        this.c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", tl2.class.getName(), this.b.getName(), this.c);
    }
}
