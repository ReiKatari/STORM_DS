package t2;

import a1.k0;
import java.util.Collection;
import java.util.Iterator;
import zb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends h implements q2.b, Collection, oc.a {
    public static final b R;
    public final Object A;
    public final Object B;
    public final s2.b L;

    static {
        u2.b bVar = u2.b.f13479a;
        R = new b(bVar, bVar, s2.b.L);
    }

    public b(Object obj, Object obj2, s2.b bVar) {
        this.A = obj;
        this.B = obj2;
        this.L = bVar;
    }

    @Override // zb.b
    public final int a() {
        return this.L.B;
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.L.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new k0(this.A, this.L);
    }
}
