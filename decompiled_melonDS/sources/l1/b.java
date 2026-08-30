package l1;

import a6.i2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8496a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8497b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.f1 f8498c = n2.s.w(q5.b.f12282e);

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f8499d = n2.s.w(Boolean.TRUE);

    public b(int i2, String str) {
        this.f8496a = i2;
        this.f8497b = str;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return e().f12286d;
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return e().f12285c;
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return e().f12283a;
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return e().f12284b;
    }

    public final q5.b e() {
        return (q5.b) this.f8498c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                if (this.f8496a == ((b) obj).f8496a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z10) {
        this.f8499d.setValue(Boolean.valueOf(z10));
    }

    public final void g(i2 i2Var, int i2) {
        int i10 = this.f8496a;
        if (i2 != 0 && (i2 & i10) == 0) {
            return;
        }
        this.f8498c.setValue(i2Var.f479a.f(i10));
        f(i2Var.f479a.p(i10));
    }

    public final int hashCode() {
        return this.f8496a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8497b);
        sb2.append('(');
        sb2.append(e().f12283a);
        sb2.append(", ");
        sb2.append(e().f12284b);
        sb2.append(", ");
        sb2.append(e().f12285c);
        sb2.append(", ");
        return w.d.p(sb2, e().f12286d, ')');
    }
}
