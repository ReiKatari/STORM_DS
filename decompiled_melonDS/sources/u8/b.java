package u8;

import cd.q;
import mh.m;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final v8.e f13504a;

    public b(v8.e eVar) {
        eVar.getClass();
        this.f13504a = eVar;
    }

    @Override // u8.d
    public final boolean a(p pVar) {
        if (c(pVar) && e(this.f13504a.d())) {
            return true;
        }
        return false;
    }

    @Override // u8.d
    public final cd.c b(p8.e eVar) {
        eVar.getClass();
        return q.h(new m(13, (cc.c) null, this));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
