package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends f2 {

    /* renamed from: a  reason: collision with root package name */
    public l1 f2380a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f2381b;

    public b(l1 l1Var, h3.c cVar) {
        this.f2380a = l1Var;
        this.f2381b = n2.s.w(cVar);
    }

    @Override // c1.f2
    public final f2 a(p1 p1Var, l1 l1Var, long j2, long j10, long j11) {
        long j12;
        Object obj;
        b9.e eVar = new b9.e(j2, h3.b.d(j10, j11), j11);
        h3.c c4 = c();
        if (c4 == null) {
            l1 l1Var2 = this.f2380a;
            if (l1Var2 == null) {
                z2.p pVar = p1Var.f2500g;
                int size = pVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = pVar.get(i2);
                        if (p1Var.f2501h.contains((q1) obj)) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                q1 q1Var = (q1) obj;
                if (q1Var != null) {
                    l1Var2 = q1Var.f2511f0;
                } else {
                    l1Var2 = null;
                }
            }
            c4 = e0.g(p1Var, l1Var2);
            if (c4 == null) {
                j12 = j10;
                c4 = pc.a.h(j10, j2);
                h3.c cVar = c4;
                e0.h(eVar, j2, j12, j11, true);
                return new a(eVar, l1Var, cVar);
            }
        }
        j12 = j10;
        h3.c cVar2 = c4;
        e0.h(eVar, j2, j12, j11, true);
        return new a(eVar, l1Var, cVar2);
    }

    @Override // c1.f2
    public final boolean b() {
        return true;
    }

    @Override // c1.f2
    public final h3.c c() {
        return (h3.c) this.f2381b.getValue();
    }

    @Override // c1.f2
    public final b9.e e() {
        return null;
    }

    @Override // c1.f2
    public final h3.c f(p1 p1Var) {
        Object obj;
        h3.c c4 = c();
        if (c4 != null) {
            return c4;
        }
        if (c() == null) {
            l1 l1Var = this.f2380a;
            if (l1Var == null) {
                z2.p pVar = p1Var.f2500g;
                int size = pVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = pVar.get(i2);
                        if (p1Var.f2501h.contains((q1) obj)) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                q1 q1Var = (q1) obj;
                if (q1Var != null) {
                    l1Var = q1Var.f2511f0;
                } else {
                    l1Var = null;
                }
            }
            h3.c g10 = e0.g(p1Var, l1Var);
            if (g10 != null) {
                this.f2381b.setValue(g10);
            }
        }
        return c();
    }

    @Override // c1.f2
    public final f2 g(l1 l1Var) {
        if (this.f2380a == null) {
            this.f2380a = l1Var;
        }
        return this;
    }

    @Override // c1.f2
    public final f2 h() {
        return i1.f2444a;
    }

    @Override // c1.f2
    public final void i(h3.c cVar) {
        this.f2381b.setValue(cVar);
    }
}
