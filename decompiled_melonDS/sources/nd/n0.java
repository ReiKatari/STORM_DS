package nd;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n0 implements ld.e {

    /* renamed from: a  reason: collision with root package name */
    public final ld.e f10337a;

    public n0(ld.e eVar) {
        this.f10337a = eVar;
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        Integer W = vc.o.W(str);
        if (W != null) {
            return W.intValue();
        }
        a0.j.h(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // ld.e
    public final d0.d c() {
        return ld.j.f9045p;
    }

    @Override // ld.e
    public final int d() {
        return 1;
    }

    @Override // ld.e
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (nc.k.a(this.f10337a, n0Var.f10337a) && nc.k.a(b(), n0Var.b())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode() + (this.f10337a.hashCode() * 31);
    }

    @Override // ld.e
    public final List i(int i2) {
        if (i2 >= 0) {
            return zb.q.A;
        }
        a0.j.n(kc.a.i("Illegal index ", i2, ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // ld.e
    public final ld.e j(int i2) {
        if (i2 >= 0) {
            return this.f10337a;
        }
        a0.j.n(kc.a.i("Illegal index ", i2, ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // ld.e
    public final boolean k(int i2) {
        if (i2 >= 0) {
            return false;
        }
        a0.j.n(kc.a.i("Illegal index ", i2, ", "), b(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return b() + '(' + this.f10337a + ')';
    }
}
