package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final w1 f3597a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f3598b = n2.s.w(null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q1 f3599c;

    public k1(q1 q1Var, w1 w1Var, String str) {
        this.f3599c = q1Var;
        this.f3597a = w1Var;
    }

    public final j1 a(mc.l lVar, mc.l lVar2) {
        n2.f1 f1Var = this.f3598b;
        j1 j1Var = (j1) f1Var.getValue();
        q1 q1Var = this.f3599c;
        if (j1Var == null) {
            Object k10 = lVar2.k(q1Var.f3649a.c());
            Object k11 = lVar2.k(q1Var.f3649a.c());
            w1 w1Var = this.f3597a;
            p pVar = (p) w1Var.f3690a.k(k11);
            pVar.d();
            n1 n1Var = new n1(q1Var, k10, pVar, w1Var);
            j1Var = new j1(this, n1Var, lVar, lVar2);
            f1Var.setValue(j1Var);
            q1Var.f3657i.add(n1Var);
        }
        j1Var.L = (nc.l) lVar2;
        j1Var.B = lVar;
        j1Var.a(q1Var.f());
        return j1Var;
    }
}
