package h1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f6026a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f6027b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6028c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6029d;

    /* renamed from: e  reason: collision with root package name */
    public final j1.i f6030e;

    public w1(j2 j2Var, n1 n1Var, boolean z10, boolean z11, j1.i iVar) {
        this.f6026a = j2Var;
        this.f6027b = n1Var;
        this.f6028c = z10;
        this.f6029d = z11;
        this.f6030e = iVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new i2(null, null, null, this.f6027b, this.f6026a, this.f6030e, this.f6028c, this.f6029d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w1) {
                w1 w1Var = (w1) obj;
                if (!nc.k.a(this.f6026a, w1Var.f6026a) || this.f6027b != w1Var.f6027b || this.f6028c != w1Var.f6028c || this.f6029d != w1Var.f6029d || !nc.k.a(this.f6030e, w1Var.f6030e)) {
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
        ((i2) oVar).j1(null, null, null, this.f6027b, this.f6026a, this.f6030e, this.f6028c, this.f6029d);
    }

    public final int hashCode() {
        int i2;
        int e6 = w.d.e(w.d.e((this.f6027b.hashCode() + (this.f6026a.hashCode() * 31)) * 961, this.f6028c, 31), this.f6029d, 961);
        j1.i iVar = this.f6030e;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        return (e6 + i2) * 31;
    }
}
