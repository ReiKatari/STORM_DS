package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends f2 {

    /* renamed from: a  reason: collision with root package name */
    public final b9.e f2375a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f2376b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.f1 f2377c;

    public a(b9.e eVar, l1 l1Var, h3.c cVar) {
        this.f2375a = eVar;
        this.f2376b = n2.s.w(l1Var);
        this.f2377c = n2.s.w(cVar);
    }

    @Override // c1.f2
    public final f2 a(p1 p1Var, l1 l1Var, long j2, long j10, long j11) {
        n2.f1 f1Var = this.f2376b;
        e0.h(this.f2375a, j2, j10, j11, !nc.k.a((l1) f1Var.getValue(), l1Var));
        f1Var.setValue(l1Var);
        return this;
    }

    @Override // c1.f2
    public final h3.c c() {
        return (h3.c) this.f2377c.getValue();
    }

    @Override // c1.f2
    public final boolean d() {
        return true;
    }

    @Override // c1.f2
    public final b9.e e() {
        return this.f2375a;
    }

    @Override // c1.f2
    public final f2 h() {
        b9.e eVar = this.f2375a;
        pc.a.h(h3.b.e(((h3.b) ((n2.f1) eVar.X).getValue()).f6050a, ((h3.b) ((n2.f1) eVar.R).getValue()).f6050a), ((h3.e) ((n2.f1) eVar.B).getValue()).f6064a);
        q1 q1Var = ((l1) this.f2376b.getValue()).f2464k0;
        n2.f1 f1Var = q1Var.f2508c0;
        s1 s1Var = (s1) ((w1) f1Var.getValue()).f2544b.getValue();
        w1 w1Var = (w1) f1Var.getValue();
        y3.z zVar = q1Var.e().f2495b.Y;
        if (zVar != null) {
            zb.k.T(zVar.Z());
            s1Var.getClass();
            return i1.f2444a;
        }
        a0.j.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // c1.f2
    public final void i(h3.c cVar) {
        this.f2377c.setValue(cVar);
    }

    @Override // c1.f2
    public final f2 g(l1 l1Var) {
        return this;
    }
}
