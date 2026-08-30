package z2;

import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e  reason: collision with root package name */
    public final mc.l f14895e;

    /* renamed from: f  reason: collision with root package name */
    public final f f14896f;

    public d(long j2, j jVar, mc.l lVar, f fVar) {
        super(j2, jVar);
        this.f14895e = lVar;
        this.f14896f = fVar;
        fVar.k();
    }

    @Override // z2.f
    public final void c() {
        f fVar = this.f14896f;
        if (!this.f14912c) {
            if (this.f14911b != fVar.g()) {
                a();
            }
            fVar.l();
            this.f14912c = true;
            synchronized (l.f14919c) {
                o();
            }
        }
    }

    @Override // z2.f
    public final mc.l e() {
        return this.f14895e;
    }

    @Override // z2.f
    public final boolean f() {
        return true;
    }

    @Override // z2.f
    public final mc.l i() {
        return null;
    }

    @Override // z2.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // z2.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // z2.f
    public final void n(y yVar) {
        h1 h1Var = l.f14917a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // z2.f
    public final f u(mc.l lVar) {
        return new d(this.f14911b, this.f14910a, l.k(lVar, this.f14895e, true), this.f14896f);
    }

    @Override // z2.f
    public final void m() {
    }
}
