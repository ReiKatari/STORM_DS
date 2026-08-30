package androidx.lifecycle;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f1448a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f1449b;

    public c(Method method, int i2) {
        this.f1448a = i2;
        this.f1449b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f1448a == cVar.f1448a && this.f1449b.getName().equals(cVar.f1449b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1449b.getName().hashCode() + (this.f1448a * 31);
    }
}
