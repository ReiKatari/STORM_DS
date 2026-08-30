package nd;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 implements ld.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10295a;

    /* renamed from: b  reason: collision with root package name */
    public final ld.e f10296b;

    /* renamed from: c  reason: collision with root package name */
    public final ld.e f10297c;

    public e0(String str, ld.e eVar, ld.e eVar2) {
        this.f10295a = str;
        this.f10296b = eVar;
        this.f10297c = eVar2;
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        Integer W = vc.o.W(str);
        if (W != null) {
            return W.intValue();
        }
        a0.j.h(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // ld.e
    public final String b() {
        return this.f10295a;
    }

    @Override // ld.e
    public final d0.d c() {
        return ld.j.f9046q;
    }

    @Override // ld.e
    public final int d() {
        return 2;
    }

    @Override // ld.e
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f10295a.equals(e0Var.f10295a) || !this.f10296b.equals(e0Var.f10296b) || !this.f10297c.equals(e0Var.f10297c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f10296b.hashCode();
        return this.f10297c.hashCode() + ((hashCode + (this.f10295a.hashCode() * 31)) * 31);
    }

    @Override // ld.e
    public final List i(int i2) {
        if (i2 >= 0) {
            return zb.q.A;
        }
        a0.j.e(w.d.s(kc.a.i("Illegal index ", i2, ", "), this.f10295a, " expects only non-negative indices"));
        return null;
    }

    @Override // ld.e
    public final ld.e j(int i2) {
        if (i2 >= 0) {
            int i10 = i2 % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f10297c;
                }
                a0.j.p("Unreached");
                return null;
            }
            return this.f10296b;
        }
        a0.j.e(w.d.s(kc.a.i("Illegal index ", i2, ", "), this.f10295a, " expects only non-negative indices"));
        return null;
    }

    @Override // ld.e
    public final boolean k(int i2) {
        if (i2 >= 0) {
            return false;
        }
        a0.j.e(w.d.s(kc.a.i("Illegal index ", i2, ", "), this.f10295a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.f10295a + '(' + this.f10296b + ", " + this.f10297c + ')';
    }
}
