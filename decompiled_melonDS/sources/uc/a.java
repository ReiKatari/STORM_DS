package uc;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f13541a;

    public a(f fVar) {
        this.f13541a = new AtomicReference(fVar);
    }

    @Override // uc.f
    public final Iterator iterator() {
        f fVar = (f) this.f13541a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        a0.j.p("This sequence can be consumed only once.");
        return null;
    }
}
