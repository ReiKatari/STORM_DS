package f1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f4613a;

    /* renamed from: b  reason: collision with root package name */
    public final i3.o f4614b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4615c;

    /* renamed from: d  reason: collision with root package name */
    public final i3.n0 f4616d;

    public m(long j2, i3.d0 d0Var, i3.n0 n0Var, int i2) {
        j2 = (i2 & 1) != 0 ? i3.s.f6687h : j2;
        d0Var = (i2 & 2) != 0 ? null : d0Var;
        this.f4613a = j2;
        this.f4614b = d0Var;
        this.f4615c = 1.0f;
        this.f4616d = n0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.o, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f4621i0 = this.f4613a;
        oVar.f4622j0 = this.f4614b;
        oVar.f4623k0 = this.f4615c;
        oVar.f4624l0 = this.f4616d;
        oVar.f4625m0 = 9205357640488583168L;
        return oVar;
    }

    public final boolean equals(Object obj) {
        m mVar;
        if (obj instanceof m) {
            mVar = (m) obj;
        } else {
            mVar = null;
        }
        if (mVar == null || !i3.s.c(this.f4613a, mVar.f4613a) || !nc.k.a(this.f4614b, mVar.f4614b) || this.f4615c != mVar.f4615c || !nc.k.a(this.f4616d, mVar.f4616d)) {
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        o oVar2 = (o) oVar;
        oVar2.f4621i0 = this.f4613a;
        oVar2.f4622j0 = this.f4614b;
        oVar2.f4623k0 = this.f4615c;
        i3.n0 n0Var = oVar2.f4624l0;
        i3.n0 n0Var2 = this.f4616d;
        if (!nc.k.a(n0Var, n0Var2)) {
            oVar2.f4624l0 = n0Var2;
            a4.l.l(oVar2);
        }
        a4.l.j(oVar2);
    }

    public final int hashCode() {
        int i2;
        int i10 = i3.s.f6688i;
        int hashCode = Long.hashCode(this.f4613a) * 31;
        i3.o oVar = this.f4614b;
        if (oVar != null) {
            i2 = oVar.hashCode();
        } else {
            i2 = 0;
        }
        return this.f4616d.hashCode() + w.d.b(this.f4615c, (hashCode + i2) * 31, 31);
    }
}
