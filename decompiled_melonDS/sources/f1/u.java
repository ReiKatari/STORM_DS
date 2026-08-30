package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f4651a;

    /* renamed from: b  reason: collision with root package name */
    public final i3.p0 f4652b;

    /* renamed from: c  reason: collision with root package name */
    public final i3.n0 f4653c;

    public u(float f8, i3.p0 p0Var, i3.n0 n0Var) {
        this.f4651a = f8;
        this.f4652b = p0Var;
        this.f4653c = n0Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new t(this.f4651a, this.f4652b, this.f4653c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (!x4.f.b(this.f4651a, uVar.f4651a) || !this.f4652b.equals(uVar.f4652b) || !nc.k.a(this.f4653c, uVar.f4653c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        t tVar = (t) oVar;
        float f8 = tVar.f4647l0;
        f3.b bVar = tVar.f4650o0;
        float f10 = this.f4651a;
        if (!x4.f.b(f8, f10)) {
            tVar.f4647l0 = f10;
            bVar.O0();
        }
        i3.p0 p0Var = tVar.f4648m0;
        i3.p0 p0Var2 = this.f4652b;
        if (!nc.k.a(p0Var, p0Var2)) {
            tVar.f4648m0 = p0Var2;
            bVar.O0();
        }
        i3.n0 n0Var = tVar.f4649n0;
        i3.n0 n0Var2 = this.f4653c;
        if (!nc.k.a(n0Var, n0Var2)) {
            tVar.f4649n0 = n0Var2;
            bVar.O0();
            a4.l.l(tVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f4652b.hashCode();
        return this.f4653c.hashCode() + ((hashCode + (Float.hashCode(this.f4651a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) x4.f.c(this.f4651a)) + ", brush=" + this.f4652b + ", shape=" + this.f4653c + ')';
    }
}
