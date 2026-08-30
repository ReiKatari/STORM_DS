package ob;

import java.util.HashMap;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f10874a;

    public f(String str) {
        this.f10874a = str;
    }

    public final Object a(d dVar) {
        Object obj = dVar.f10873a.get(this);
        if (obj != null) {
            return obj;
        }
        o.i(this.f10874a);
        return null;
    }

    public final void b(d dVar, Object obj) {
        HashMap hashMap = dVar.f10873a;
        if (obj == null) {
            hashMap.remove(this);
        } else {
            hashMap.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            return this.f10874a.equals(((f) obj).f10874a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10874a.hashCode();
    }

    public final String toString() {
        return w.d.s(new StringBuilder("Prop{name='"), this.f10874a, "'}");
    }
}
