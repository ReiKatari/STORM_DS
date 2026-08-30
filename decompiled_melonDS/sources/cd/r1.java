package cd;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 extends dd.d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f2859a = new AtomicReference(null);

    @Override // dd.d
    public final boolean a(dd.b bVar) {
        q1 q1Var = (q1) bVar;
        AtomicReference atomicReference = this.f2859a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(q.f2856c);
        return true;
    }

    @Override // dd.d
    public final cc.c[] b(dd.b bVar) {
        q1 q1Var = (q1) bVar;
        this.f2859a.set(null);
        return dd.c.f4035a;
    }
}
