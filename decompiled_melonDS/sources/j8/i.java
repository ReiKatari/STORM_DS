package j8;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7776a;

    public i(List list) {
        this.f7776a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class.equals(obj.getClass())) {
            return this.f7776a.equals(((i) obj).f7776a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7776a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    public final String toString() {
        return zb.l.Y(this.f7776a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
