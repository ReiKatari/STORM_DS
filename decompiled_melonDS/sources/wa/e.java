package wa;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements ua.v, Cloneable {
    public static final e L = new e();
    public final List A;
    public final List B;

    public e() {
        List list = Collections.EMPTY_LIST;
        this.A = list;
        this.B = list;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        Class cls = aVar.f2155a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new d(this, b11, b10, hVar, aVar);
    }

    public final boolean b(Class cls, boolean z10) {
        List list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            p7.n nVar = za.c.f15005a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.A;
        } else {
            list = this.B;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw w.d.k(it);
    }

    public final Object clone() {
        try {
            return (e) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }
}
