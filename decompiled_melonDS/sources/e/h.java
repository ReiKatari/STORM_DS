package e;

import a7.n;
import b4.v0;
import java.util.concurrent.CancellationException;
import mc.p;
import zc.l1;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends b4.b {

    /* renamed from: c  reason: collision with root package name */
    public final u f4138c;

    /* renamed from: d  reason: collision with root package name */
    public p f4139d;

    /* renamed from: e  reason: collision with root package name */
    public bd.h f4140e;

    /* renamed from: f  reason: collision with root package name */
    public l1 f4141f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4142g;

    public h(u uVar, l lVar) {
        super(lVar);
        this.f4138c = uVar;
        this.f4139d = new v0(2, 1, null);
    }

    @Override // b4.b
    public final void k() {
        bd.h hVar = this.f4140e;
        if (hVar != null) {
            hVar.h(new CancellationException("onBack cancelled"), true);
        }
        l1 l1Var = this.f4141f;
        if (l1Var != null) {
            l1Var.i(null);
        }
        this.f4140e = null;
        this.f4141f = null;
        this.f4142g = false;
    }

    @Override // b4.b
    public final void l() {
        if (this.f4140e != null && !this.f4142g) {
            k();
        }
        if (this.f4140e == null) {
            this.f4142g = false;
            this.f4140e = ij.a.s(-2, 4, bd.a.SUSPEND);
            this.f4141f = x.v(this.f4138c, null, null, new di.b(1, (cc.c) null, this), 3);
        }
        bd.h hVar = this.f4140e;
        if (hVar != null) {
            hVar.g(null);
        }
        this.f4142g = false;
    }

    @Override // b4.b
    public final void m(d.a aVar) {
        bd.h hVar = this.f4140e;
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    @Override // b4.b
    public final void n() {
        k();
        if (super.j()) {
            this.f4142g = true;
            this.f4140e = ij.a.s(-2, 4, bd.a.SUSPEND);
            this.f4141f = x.v(this.f4138c, null, null, new di.b(1, (cc.c) null, this), 3);
        }
    }

    public final void r(boolean z10) {
        l1 l1Var;
        if (!z10 && super.j() && (l1Var = this.f4141f) != null && !l1Var.d()) {
            k();
        }
        ((n) this.f1790a).f(z10);
        ((f.a) this.f1791b).f(z10);
    }
}
