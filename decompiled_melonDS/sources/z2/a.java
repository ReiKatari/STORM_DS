package z2;

import ai.b1;
import n2.t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends b {
    @Override // z2.b
    public final b C(mc.l lVar, mc.l lVar2) {
        return (b) ((f) l.e(new ai.w(new b1(12, lVar, lVar2), 13)));
    }

    @Override // z2.b, z2.f
    public final void c() {
        synchronized (l.f14919c) {
            o();
        }
    }

    @Override // z2.b, z2.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // z2.b, z2.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // z2.b, z2.f
    public final void m() {
        l.a();
    }

    @Override // z2.b, z2.f
    public final f u(mc.l lVar) {
        return (e) ((f) l.e(new ai.w(new t0(lVar, 1), 13)));
    }

    @Override // z2.b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
