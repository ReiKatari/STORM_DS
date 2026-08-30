package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends h.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1439a;

    public y(AtomicReference atomicReference) {
        this.f1439a = atomicReference;
    }

    @Override // h.c
    public final void a(Object obj) {
        h.c cVar = (h.c) this.f1439a.get();
        if (cVar != null) {
            cVar.a(obj);
        } else {
            a0.j.p("Operation cannot be started before fragment is in created state");
        }
    }
}
