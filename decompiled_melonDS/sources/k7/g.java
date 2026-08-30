package k7;

import g2.v3;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final t f8008a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f8009b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f8010c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f8011d;

    /* renamed from: e  reason: collision with root package name */
    public final v3 f8012e;

    /* renamed from: f  reason: collision with root package name */
    public final v3 f8013f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8014g;

    public g(t tVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f8008a = tVar;
        m0 m0Var = new m0(tVar, linkedHashMap, linkedHashMap2, strArr, tVar.f8083k, new a2.g(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 7));
        this.f8009b = m0Var;
        this.f8010c = new LinkedHashMap();
        this.f8011d = new ReentrantLock();
        this.f8012e = new v3(this);
        this.f8013f = new v3(this);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.f8014g = new Object();
        m0Var.f8052k = new a2.n(27, this);
    }

    public final Object a(ec.j jVar) {
        Object f8 = this.f8009b.f(jVar);
        if (f8 == dc.a.COROUTINE_SUSPENDED) {
            return f8;
        }
        return yb.y.f14813a;
    }
}
