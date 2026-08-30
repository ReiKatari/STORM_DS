package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8652a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f8653b;

    public y1(q0 q0Var, String str) {
        this.f8652a = str;
        this.f8653b = n2.s.w(q0Var);
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return e().f8604d;
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return e().f8603c;
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return e().f8601a;
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return e().f8602b;
    }

    public final q0 e() {
        return (q0) this.f8653b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        return nc.k.a(e(), ((y1) obj).e());
    }

    public final void f(q0 q0Var) {
        this.f8653b.setValue(q0Var);
    }

    public final int hashCode() {
        return this.f8652a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8652a);
        sb2.append("(left=");
        sb2.append(e().f8601a);
        sb2.append(", top=");
        sb2.append(e().f8602b);
        sb2.append(", right=");
        sb2.append(e().f8603c);
        sb2.append(", bottom=");
        return w.d.p(sb2, e().f8604d, ')');
    }
}
