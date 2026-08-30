package hd;

import ec.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mc.l;
import nc.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a0.c f6455a = new a0.c("STATE_REG", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final a0.c f6456b = new a0.c("STATE_COMPLETED", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final a0.c f6457c = new a0.c("STATE_CANCELLED", 1);

    /* renamed from: d  reason: collision with root package name */
    public static final a0.c f6458d = new a0.c("NO_RESULT", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final a0.c f6459e = new a0.c("PARAM_CLAUSE_0", 1);

    public static final void a(e eVar, long j2, l lVar) {
        b bVar = new b(j2);
        a aVar = a.f6444b0;
        w.b(3, aVar);
        c cVar = new c(eVar, bVar, aVar, f.A, f6459e, (j) lVar, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.Y;
        eVar.f(cVar, false);
    }
}
