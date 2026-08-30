package sj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final vj.p f13033a = new v8.e();

    /* renamed from: b  reason: collision with root package name */
    public final int f13034b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13035c;

    /* JADX WARN: Type inference failed for: r0v0, types: [vj.p, v8.e] */
    public r(int i2) {
        this.f13034b = i2;
    }

    @Override // xj.a
    public final boolean b(vj.a aVar) {
        if (this.f13035c) {
            vj.a aVar2 = (vj.a) ((v8.e) this.f13033a.f13763b);
            if (aVar2 instanceof vj.o) {
                ((vj.o) aVar2).f13860g = false;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // xj.a
    public final vj.a d() {
        return this.f13033a;
    }

    @Override // xj.a
    public final boolean e() {
        return true;
    }

    @Override // xj.a
    public final a g(g gVar) {
        boolean z10 = false;
        if (gVar.f12978h) {
            if (((v8.e) this.f13033a.f13764c) != null) {
                vj.a d4 = gVar.h().d();
                this.f13035c = ((d4 instanceof vj.r) || (d4 instanceof vj.p)) ? true : true;
                return a.a(gVar.f12975e);
            }
            return null;
        }
        int i2 = gVar.f12977g;
        int i10 = this.f13034b;
        if (i2 >= i10) {
            return new a(-1, false, gVar.f12973c + i10);
        }
        return null;
    }
}
