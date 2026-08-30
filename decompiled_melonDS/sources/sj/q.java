package sj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final vj.o f13030a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13031b;

    /* renamed from: c  reason: collision with root package name */
    public int f13032c;

    public q(vj.o oVar) {
        this.f13030a = oVar;
    }

    @Override // xj.a
    public final boolean b(vj.a aVar) {
        if (!(aVar instanceof vj.p)) {
            return false;
        }
        if (this.f13031b && this.f13032c == 1) {
            this.f13030a.f13860g = false;
            this.f13031b = false;
        }
        return true;
    }

    @Override // xj.a
    public final vj.a d() {
        return this.f13030a;
    }

    @Override // xj.a
    public final boolean e() {
        return true;
    }

    @Override // xj.a
    public final a g(g gVar) {
        if (gVar.f12978h) {
            this.f13031b = true;
            this.f13032c = 0;
        } else if (this.f13031b) {
            this.f13032c++;
        }
        return a.a(gVar.f12972b);
    }
}
