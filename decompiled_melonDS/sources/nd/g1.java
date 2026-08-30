package nd;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 implements ld.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10308a;

    /* renamed from: b  reason: collision with root package name */
    public final ld.d f10309b;

    public g1(String str, ld.d dVar) {
        dVar.getClass();
        this.f10308a = str;
        this.f10309b = dVar;
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        g();
        throw null;
    }

    @Override // ld.e
    public final String b() {
        return this.f10308a;
    }

    @Override // ld.e
    public final d0.d c() {
        return this.f10309b;
    }

    @Override // ld.e
    public final int d() {
        return 0;
    }

    @Override // ld.e
    public final String e(int i2) {
        g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g1) {
                g1 g1Var = (g1) obj;
                if (this.f10308a.equals(g1Var.f10308a) && nc.k.a(this.f10309b, g1Var.f10309b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void g() {
        throw new IllegalStateException(w.d.s(new StringBuilder("Primitive descriptor "), this.f10308a, " does not have elements"));
    }

    public final int hashCode() {
        return (this.f10309b.hashCode() * 31) + this.f10308a.hashCode();
    }

    @Override // ld.e
    public final List i(int i2) {
        g();
        throw null;
    }

    @Override // ld.e
    public final ld.e j(int i2) {
        g();
        throw null;
    }

    @Override // ld.e
    public final boolean k(int i2) {
        g();
        throw null;
    }

    public final String toString() {
        return w.d.r(new StringBuilder("PrimitiveDescriptor("), this.f10308a, ')');
    }
}
