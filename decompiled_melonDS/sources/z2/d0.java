package z2;

import a1.n0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends b {

    /* renamed from: o  reason: collision with root package name */
    public final b f14897o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f14898p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f14899q;

    /* renamed from: r  reason: collision with root package name */
    public mc.l f14900r;

    /* renamed from: s  reason: collision with root package name */
    public mc.l f14901s;

    /* renamed from: t  reason: collision with root package name */
    public final long f14902t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(z2.b r8, mc.l r9, mc.l r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            u1.h1 r0 = z2.l.f14917a
            if (r8 == 0) goto La
            mc.l r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            z2.a r0 = z2.l.f14926j
            mc.l r0 = r0.f14885e
        Le:
            mc.l r5 = z2.l.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            mc.l r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            z2.a r9 = z2.l.f14926j
            mc.l r9 = r9.f14886f
        L1e:
            mc.l r6 = z2.l.l(r10, r9)
            r2 = 0
            z2.j r4 = z2.j.X
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.f14897o = r8
            r1.f14898p = r11
            r1.f14899q = r12
            mc.l r8 = r1.f14885e
            r1.f14900r = r8
            mc.l r8 = r1.f14886f
            r1.f14901s = r8
            long r8 = v2.h.b()
            r1.f14902t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.d0.<init>(z2.b, mc.l, mc.l, boolean, boolean):void");
    }

    @Override // z2.b
    public final void B(n0 n0Var) {
        q.l();
        throw null;
    }

    @Override // z2.b
    public final b C(mc.l lVar, mc.l lVar2) {
        mc.l k10 = l.k(lVar, this.f14900r, true);
        mc.l l10 = l.l(lVar2, this.f14901s);
        if (!this.f14898p) {
            return new d0(D().C(null, l10), k10, l10, false, true);
        }
        return D().C(k10, l10);
    }

    public final b D() {
        b bVar = this.f14897o;
        if (bVar == null) {
            return l.f14926j;
        }
        return bVar;
    }

    @Override // z2.b, z2.f
    public final void c() {
        b bVar;
        this.f14912c = true;
        if (this.f14899q && (bVar = this.f14897o) != null) {
            bVar.c();
        }
    }

    @Override // z2.f
    public final j d() {
        return D().d();
    }

    @Override // z2.b, z2.f
    public final mc.l e() {
        return this.f14900r;
    }

    @Override // z2.b, z2.f
    public final boolean f() {
        return D().f();
    }

    @Override // z2.f
    public final long g() {
        return D().g();
    }

    @Override // z2.b, z2.f
    public final int h() {
        return D().h();
    }

    @Override // z2.b, z2.f
    public final mc.l i() {
        return this.f14901s;
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
        D().m();
    }

    @Override // z2.b, z2.f
    public final void n(y yVar) {
        D().n(yVar);
    }

    @Override // z2.f
    public final void r(j jVar) {
        q.l();
        throw null;
    }

    @Override // z2.f
    public final void s(long j2) {
        q.l();
        throw null;
    }

    @Override // z2.b, z2.f
    public final void t(int i2) {
        D().t(i2);
    }

    @Override // z2.b, z2.f
    public final f u(mc.l lVar) {
        mc.l k10 = l.k(lVar, this.f14900r, true);
        if (!this.f14898p) {
            return l.g(D().u(null), k10, true);
        }
        return D().u(k10);
    }

    @Override // z2.b
    public final q w() {
        return D().w();
    }

    @Override // z2.b
    public final n0 x() {
        return D().x();
    }

    @Override // z2.b
    public final mc.l y() {
        return this.f14900r;
    }
}
