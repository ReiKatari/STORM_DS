package bd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e extends nc.i implements mc.q {

    /* renamed from: b0  reason: collision with root package name */
    public static final e f2164b0 = new nc.i(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.B;
        hVar.getClass();
        if (obj3 == j.f2180l) {
            obj3 = new m(hVar.r());
        }
        return new o(obj3);
    }
}
