package z2;

import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: e  reason: collision with root package name */
    public final mc.l f14903e;

    /* renamed from: f  reason: collision with root package name */
    public int f14904f;

    public e(long j2, j jVar, mc.l lVar) {
        super(j2, jVar);
        this.f14903e = lVar;
        this.f14904f = 1;
    }

    @Override // z2.f
    public final void c() {
        if (!this.f14912c) {
            l();
            this.f14912c = true;
            synchronized (l.f14919c) {
                o();
            }
        }
    }

    @Override // z2.f
    public final mc.l e() {
        return this.f14903e;
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
        this.f14904f++;
    }

    @Override // z2.f
    public final void l() {
        int i2 = this.f14904f - 1;
        this.f14904f = i2;
        if (i2 == 0) {
            a();
        }
    }

    @Override // z2.f
    public final void n(y yVar) {
        h1 h1Var = l.f14917a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // z2.f
    public final f u(mc.l lVar) {
        l.c(this);
        return new d(this.f14911b, this.f14910a, l.k(lVar, this.f14903e, true), this);
    }

    @Override // z2.f
    public final void m() {
    }
}
