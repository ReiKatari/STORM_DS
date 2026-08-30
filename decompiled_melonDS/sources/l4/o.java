package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public final String f8863a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f8864b;

    public o(String str, p0 p0Var) {
        this.f8863a = str;
        this.f8864b = p0Var;
    }

    @Override // l4.p
    public final p0 a() {
        return this.f8864b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (nc.k.a(this.f8863a, oVar.f8863a) && nc.k.a(this.f8864b, oVar.f8864b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f8863a.hashCode() * 31;
        p0 p0Var = this.f8864b;
        if (p0Var != null) {
            i2 = p0Var.hashCode();
        } else {
            i2 = 0;
        }
        return (hashCode + i2) * 31;
    }

    public final String toString() {
        return w.d.r(new StringBuilder("LinkAnnotation.Url(url="), this.f8863a, ')');
    }
}
