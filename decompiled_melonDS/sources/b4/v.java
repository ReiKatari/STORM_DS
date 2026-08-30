package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f1951a;

    public v(x xVar) {
        this.f1951a = xVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new m(this.f1951a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final /* bridge */ /* synthetic */ void g(b3.o oVar) {
        m mVar = (m) oVar;
    }

    public final int hashCode() {
        return this.f1951a.hashCode();
    }
}
