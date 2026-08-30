package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2494a;

    /* renamed from: b  reason: collision with root package name */
    public final y1 f2495b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2498e;

    /* renamed from: c  reason: collision with root package name */
    public final h2 f2496c = new h2(this);

    /* renamed from: d  reason: collision with root package name */
    public final d1.c f2497d = new d1.c(new h3.b(0), d1.d.f3549o, null, 12);

    /* renamed from: f  reason: collision with root package name */
    public final o1 f2499f = new o1(this, 0);

    /* renamed from: g  reason: collision with root package name */
    public final z2.p f2500g = new z2.p();

    /* renamed from: h  reason: collision with root package name */
    public final z2.p f2501h = new z2.p();

    /* renamed from: i  reason: collision with root package name */
    public final o1 f2502i = new o1(this, 1);

    public p1(String str, y1 y1Var) {
        this.f2494a = str;
        this.f2495b = y1Var;
    }

    public final boolean a() {
        z2.p pVar = this.f2501h;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            d1.q1 q1Var = ((q1) pVar.get(i2)).d().f2438b;
            while (true) {
                d1.q1 q1Var2 = q1Var.f3650b;
                if (q1Var2 == null) {
                    break;
                }
                q1Var = q1Var2;
            }
            if (!nc.k.a(q1Var.f3649a.c(), q1Var.f3652d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f2495b.getClass();
        g gVar = new g(5, this);
        z2.p pVar = this.f2501h;
        zb.l.f0(pVar, gVar);
        z2.p pVar2 = this.f2500g;
        int size = pVar2.size();
        boolean z10 = false;
        for (int i2 = 0; i2 < size; i2++) {
            q1 q1Var = (q1) pVar2.get(i2);
            if (q1Var.h() && !pVar.contains(q1Var)) {
                pVar.add(q1Var);
            }
        }
        int i10 = r1.f2518a;
        int size2 = pVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            } else if (((q1) pVar.get(i11)).d().b()) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        h2 h2Var = this.f2496c;
        p1 p1Var = (p1) h2Var.f2431c;
        n2.c1 c1Var = (n2.c1) h2Var.f2433e;
        if (p1Var.f2501h.size() > 1 && z10) {
            h2Var.f2435g = r2.MatchFound;
            c1Var.h(h2Var.f2429a + 1);
        } else if (p1Var.f2495b.b()) {
            if (!z10) {
                h2Var.f2435g = r2.VisibleContentAbsentDuringTransition;
                c1Var.h(h2Var.f2429a + 1);
            }
        } else {
            h2Var.f2435g = r2.NoRequest;
            h2Var.f2429a = c1Var.g();
            ((n2.f1) h2Var.f2432d).setValue(i1.f2444a);
        }
        h2Var.f();
    }
}
